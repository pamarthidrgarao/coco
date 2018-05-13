package com.coco.api.coco.object;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "COCO_OBJECTS")
public class CocoObject implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id;

	@Column(name = "description", nullable = true)
	private String description;

	@Column(name = "isstandard", nullable = false)
	private boolean isStandard;

	@Column(name = "objectcode", nullable = false)
	private String objectCode;

	@Column(name = "objectname", nullable = false)
	private String objectName;

	@Column(name = "sequence", nullable = false)
	private int sequence;

	@OneToMany(mappedBy = "object", fetch = FetchType.EAGER, orphanRemoval = true)
	@JsonManagedReference
	private List<CocoObjectFields> fields;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isStandard() {
		return isStandard;
	}

	public void setStandard(boolean isStandard) {
		this.isStandard = isStandard;
	}

	public String getObjectCode() {
		return objectCode;
	}

	public void setObjectCode(String objectCode) {
		this.objectCode = objectCode;
	}

	public String getObjectName() {
		return objectName;
	}

	public void setObjectName(String objectName) {
		this.objectName = objectName;
	}

	public int getSequence() {
		return sequence;
	}

	public void setSequence(int sequence) {
		this.sequence = sequence;
	}

	public List<CocoObjectFields> getFields() {
		return fields;
	}

	public void setFields(List<CocoObjectFields> fields) {
		this.fields = fields;
	}

}
