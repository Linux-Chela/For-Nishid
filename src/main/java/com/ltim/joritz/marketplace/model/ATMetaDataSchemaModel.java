package com.ltim.joritz.marketplace.model;

import java.sql.Time;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="`ATMetaDataSchemaModel`")
public class ATMetaDataSchemaModel {
	
	@Id
	@Column(name="`atMDSchemaId`")
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int atMDSchemaId;
	
	@Column(name="`metaDataName`")
	private String metaDataName;
	
	@Column(name="`dataType`")
	private String dataType;
	
	@Column(name="`isMandatory`")
	private boolean isMandatory;
	
	@Column(name="`createdBy`")
	private int createdBy;
	
	@Column(name="`createdOn`")
	@CreationTimestamp
	private Time createdOn;
	
	@Column(name="`modifiedBy`")
	private int modifiedBy;
	
	@Column(name="`modifiedOn`")
	@CreationTimestamp
	private Time modifiedOn;
	
	@Column(name="`status`")
	private boolean status;
	
	
	@Column(name="`artifactTypeId`")
	private int artifactTypeId;
	
	

	

	public int getArtifactTypeId() {
		return artifactTypeId;
	}

	public void setArtifactTypeId(int artifactTypeId) {
		this.artifactTypeId = artifactTypeId;
	}

	public int getAtMDSchemaId() {
		return atMDSchemaId;
	}

	public ATMetaDataSchemaModel(String metaDataName, String dataType, boolean isMandatory, int createdBy,
			int modifiedBy, boolean status,int artifactTypeId) {
		super();
		this.metaDataName = metaDataName;
		this.dataType = dataType;
		this.isMandatory = isMandatory;
		this.createdBy = createdBy;
		this.modifiedBy = modifiedBy;
		this.status = status;
		this.artifactTypeId=artifactTypeId;
	}

	public String getMetaDataName() {
		return metaDataName;
	}

	public void setMetaDataName(String metaDataName) {
		this.metaDataName = metaDataName;
	}

	public String getDataType() {
		return dataType;
	}

	public void setDataType(String dataType) {
		this.dataType = dataType;
	}

	public boolean isMandatory() {
		return isMandatory;
	}

	public void setMandatory(boolean isMandatory) {
		this.isMandatory = isMandatory;
	}

	public int getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(int createdBy) {
		this.createdBy = createdBy;
	}

	public Time getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Time createdOn) {
		this.createdOn = createdOn;
	}

	public int getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(int modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public Time getModifiedOn() {
		return modifiedOn;
	}

	public void setModifiedOn(Time modifiedOn) {
		this.modifiedOn = modifiedOn;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public void setAtMDSchemaId(int atMDSchemaId) {
		this.atMDSchemaId = atMDSchemaId;
	}

	public ATMetaDataSchemaModel() {
		super();
		// TODO Auto-generated constructor stub
	}

}
