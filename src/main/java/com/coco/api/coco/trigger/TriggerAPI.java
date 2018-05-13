package com.coco.api.coco.trigger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class TriggerAPI {

	@Autowired
	public JdbcTemplate template;

	public void create(TriggerModel trigger) {
		template.execute(trigger.getStatement());
	}

	public void update(TriggerModel trigger) {
		delete(trigger);
		create(trigger);

	}

	public void delete(TriggerModel trigger) {
		String statement = "drop trigger " + trigger.getName();
		template.execute(statement);
	}

}
