package com.coco.api.coco.table;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.coco.api.coco.object.CocoObject;
import com.coco.api.coco.object.CocoObjectFields;

@Component
public class TableGenerator {

	@Autowired
	public JdbcTemplate template;

	public void generate(CocoObject cocoObject) {
		StringBuilder builder = new StringBuilder();
		builder.append("CREATE TABLE " + cocoObject.getObjectName() + " (");
		int count = 0;
		for (CocoObjectFields fields : cocoObject.getFields()) {
			count = count + 1;
			builder.append(columnGen(fields));
			if (cocoObject.getFields().size() > count) {
				builder.append(",");
			}
		}
		builder.append(")");
		template.execute(builder.toString());
	}

	private String columnGen(CocoObjectFields fields) {

		StringBuilder builder = new StringBuilder();
		if (fields.getName() != null) {
			builder.append(fields.getName());
		}
		if (fields.getType() != null) {
			builder.append(" ").append(dataType(fields.getType(), fields.getLength(), fields.getDecimals()));
		}
		if (fields.isUnique()) {
			builder.append(" UNIQUE");
		}
		if (fields.isMandaotry()) {
			builder.append(" NOT NULL");
		}
		return builder.toString();
	}

	private String dataType(String type, Integer len, Integer decimal) {
		if (decimal != null && len != null) {
			return type + "(" + len + "," + decimal + ")";
		}

		if (len != null) {
			return type + "(" + len + ")";
		}
		return type;
	}
}
