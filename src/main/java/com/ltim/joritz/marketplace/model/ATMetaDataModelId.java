package com.ltim.joritz.marketplace.model;

public class ATMetaDataModelId {
	private int artifactid;
    private int atMDSchemaId;

    // Constructors
    public ATMetaDataModelId() {
    }

    public ATMetaDataModelId(int artifactId, int colId) {
        this.artifactid = artifactId;
        this.atMDSchemaId = colId;
    }
    
    // Getters and setters
    public int getArtifactid() {
        return artifactid;
    }

    public void setArtifactid(int artifactId) {
        this.artifactid = artifactId;
    }

    public int getColId() {
        return atMDSchemaId;
    }

    public void setColId(int colId) {
        this.atMDSchemaId = colId;
    }
}
