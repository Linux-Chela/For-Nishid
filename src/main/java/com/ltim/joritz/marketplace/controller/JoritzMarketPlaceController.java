package com.ltim.joritz.marketplace.controller;


import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ltim.joritz.marketplace.model.ArtifactModel;
import com.ltim.joritz.marketplace.service.ATMetaDataSchemaService;
import com.ltim.joritz.marketplace.service.ATMetaDataService;
import com.ltim.joritz.marketplace.service.ArtifactService;
import com.ltim.joritz.marketplace.service.ArtifactTypeService;



@RestController
@RequestMapping("/marketplace")
@CrossOrigin(origins = "http://localhost:8081")
public class JoritzMarketPlaceController {
		
		@Autowired
		ArtifactService artifactService;
		
		@Autowired
		ArtifactTypeService artifactTypeService;
		
		@Autowired
		ATMetaDataSchemaService atMetaDataSchemaService;
		
		@Autowired
		ATMetaDataService atMetaDataService;
		
		
		
		
		@PostMapping("artifact/create")
		public ArtifactModel createArtifact(@RequestBody ArtifactModel nishid) {
	        try {
	            ArtifactModel obj = artifactService.createArtifact(nishid);
	            HashMap <String, String>meta= nishid.getMetaData();
	            System.out.println(meta);
	            int id = artifactService.createArtifact(obj).getArtifactid();
	            System.out.println(id);
	            
	            List<Integer> col_id = atMetaDataSchemaService.getCol(nishid.getArtifactType().getArtifactTypeId());
	            System.out.println("-------");
	            System.out.println(col_id);
//	            for (int i = 0; i < col_id.size(); i++) {
//	                try {
//	                    ATMetaDataModel values = new ATMetaDataModel(id, col_id.get(i), meta.get(Integer.toString(col_id.get(i))), 1);
//	                    atMetaDataService.createAtMetaDataModel(values);
//	                    System.out.println(values);
//	                } catch (Exception e) {
//	                    
//	                    System.err.println("Error creating ATMetaDataModel: " + e.getMessage());
//	                    
//	                }
//	            }
	            return nishid;
	        } catch (Exception e) {
	       
	            System.err.println("Error creating artifact: " + e.getMessage());
	            return nishid; 
	        }
	        }
	        
		}

		
	        
		
	        
