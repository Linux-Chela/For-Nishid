package com.ltim.joritz.marketplace.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="`ATMetaDataModel`")
@IdClass(ATMetaDataModelId.class)
public class ATMetaDataModel{
	
	 
	 @Id
	 @Column(name="`artifactId`")
	 private int artifactid;

	 @Id
	 @Column(name="`atMDSchemaId`")
	 private int atMDSchemaId;
	
	
	
	@Column(name="`value`")
	private String value;
	
	
	@Column(name="`createdBy`")
	private int createdBy;
	
	
	
	
	public int getArtifactid() {
		return artifactid;
	}


	public void setArtifactid(int artifactId) {
		this.artifactid = artifactId;
	}


	public int getAtMDSchemaId() {
		return atMDSchemaId;
	}


	public void setAtMDSchemaId(int atMDSchemaId) {
		this.atMDSchemaId = atMDSchemaId;
	}


	public int getCreatedBy() {
		return createdBy;
	}


	public void setCreatedBy(int createdBy) {
		this.createdBy = createdBy;
	}

	public String getValue() {
		return value;
	}


	public void setValue(String value) {
		this.value = value;
	}


	public ATMetaDataModel(int artifactId, int atMDSchemaId, String value, int createdBy) {
		super();
		this.artifactid = artifactId;
		this.atMDSchemaId = atMDSchemaId;
		this.value = value;
		this.createdBy = createdBy;
	}


	public ATMetaDataModel() {
		super();
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return "ATMetaDataModel [artifactId=" + artifactid + ", atMDSchemaId=" + atMDSchemaId + ","
				+ ", value=" + value + ", createdBy=" + createdBy + "]";
	}


	
	
	
}


