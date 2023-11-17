package com.ltim.joritz.marketplace.service;

import java.util.ArrayList;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ltim.joritz.marketplace.model.ATMetaDataSchemaModel;
import com.ltim.joritz.marketplace.model.ArtifactTypeModel;
import com.ltim.joritz.marketplace.repository.ATMetaDataSchemaRepository;
import com.ltim.joritz.marketplace.repository.ArtifactTypeRepository;

@Service
public class ATMetaDataSchemaServiceImplementation implements ATMetaDataSchemaService {
	
	@Autowired
	ATMetaDataSchemaRepository atMetaDataSchemaRepository;
	
	@Autowired
	ArtifactTypeRepository artifactTypeRepository;

	@Override
	public List<Integer> getCol(int artifacttypeId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ATMetaDataSchemaModel> getATMetaData(String str) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	

}
