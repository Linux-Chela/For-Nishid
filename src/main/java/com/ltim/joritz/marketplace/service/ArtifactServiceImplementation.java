package com.ltim.joritz.marketplace.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ltim.joritz.marketplace.model.ArtifactModel;
import com.ltim.joritz.marketplace.repository.ArtifactRepository;

@Service
public class ArtifactServiceImplementation implements ArtifactService {
	@Autowired
	private ArtifactRepository artifactRepository;

	@Override
	public ArtifactModel createArtifact(ArtifactModel artifact) {
		// TODO Auto-generated method stub
		
		return artifactRepository.save(artifact);
	}

	
}
