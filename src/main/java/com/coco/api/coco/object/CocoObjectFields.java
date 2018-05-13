package com.coco.api.coco.object;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "COCO_OBJECT_FIELDS")
public class CocoObjectFields implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "objectid", nullable = false)
	@JsonBackReference
	private CocoObject object;

	@Column(name = "name", nullable = false)
	private String name;

	@Column(name = "ismandatory", nullable = false)
	private boolean isMandaotry;

	@Column(name = "isunique", nullable = true)
	private boolean isUnique;

	@Column(name = "defaultvalue", nullable = true)
	private String defaultValue;

	@Column(name = "iscustom", nullable = true)
	private boolean isCustom;

	@Column(name = "jsonname", nullable = true)
	private String jsonName;

	@Column(name = "type", nullable = true)
	private String type;

	@Column(name = "length", nullable = true)
	private Integer length;

	@Column(name = "decimals", nullable = true)
	private Integer decimals;

	@Column(name = "isautogen", nullable = true)
	private boolean isAutoGen;

	@Column(name = "sequencename", nullable = true)
	private String sequenceName;

	@Column(name = "format", nullable = true)
	private String format;

	@Column(name = "lov", nullable = true)
	private String lov;

	@Column(name = "formula", nullable = true)
	private String formula;

	@Column(name = "isbasicsearch", nullable = true)
	private boolean isBasicSearch;

	@Column(name = "isadvancedsearch", nullable = true)
	private boolean isAdvancedsearch;

	@Column(name = "searchtype", nullable = true)
	private String searchType;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public CocoObject getObject() {
		return object;
	}

	public void setObject(CocoObject object) {
		this.object = object;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isMandaotry() {
		return isMandaotry;
	}

	public void setMandaotry(boolean isMandaotry) {
		this.isMandaotry = isMandaotry;
	}

	public boolean isUnique() {
		return isUnique;
	}

	public void setUnique(boolean isUnique) {
		this.isUnique = isUnique;
	}

	public String getDefaultValue() {
		return defaultValue;
	}

	public void setDefaultValue(String defaultValue) {
		this.defaultValue = defaultValue;
	}

	public boolean isCustom() {
		return isCustom;
	}

	public void setCustom(boolean isCustom) {
		this.isCustom = isCustom;
	}

	public String getJsonName() {
		return jsonName;
	}

	public void setJsonName(String jsonName) {
		this.jsonName = jsonName;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Integer getLength() {
		return length;
	}

	public void setLength(Integer length) {
		this.length = length;
	}

	public Integer getDecimals() {
		return decimals;
	}

	public void setDecimals(Integer decimals) {
		this.decimals = decimals;
	}

	public boolean isAutoGen() {
		return isAutoGen;
	}

	public void setAutoGen(boolean isAutoGen) {
		this.isAutoGen = isAutoGen;
	}

	public String getSequenceName() {
		return sequenceName;
	}

	public void setSequenceName(String sequenceName) {
		this.sequenceName = sequenceName;
	}

	public String getFormat() {
		return format;
	}

	public void setFormat(String format) {
		this.format = format;
	}

	public String getLov() {
		return lov;
	}

	public void setLov(String lov) {
		this.lov = lov;
	}

	public String getFormula() {
		return formula;
	}

	public void setFormula(String formula) {
		this.formula = formula;
	}

	public boolean isBasicSearch() {
		return isBasicSearch;
	}

	public void setBasicSearch(boolean isBasicSearch) {
		this.isBasicSearch = isBasicSearch;
	}

	public boolean isAdvancedsearch() {
		return isAdvancedsearch;
	}

	public void setAdvancedsearch(boolean isAdvancedsearch) {
		this.isAdvancedsearch = isAdvancedsearch;
	}

	public String getSearchType() {
		return searchType;
	}

	public void setSearchType(String searchType) {
		this.searchType = searchType;
	}

}
