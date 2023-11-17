package com.ltim.joritz.marketplace.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ltim.joritz.marketplace.model.ArtifactTypeModel;
import com.ltim.joritz.marketplace.repository.ArtifactTypeRepository;

@Service
public class ArtifactTypeServiceImplementation implements ArtifactTypeService{
	
	@Autowired
	private ArtifactTypeRepository artifactTypeRepository;

	public String createArtifactType(ArtifactTypeModel artifactType) {
		artifactTypeRepository.save(artifactType);
		return "ArtifactType Created!";
	}
}
