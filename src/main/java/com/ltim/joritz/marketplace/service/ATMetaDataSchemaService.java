package com.ltim.joritz.marketplace.service;

import java.util.List;


import com.ltim.joritz.marketplace.model.ATMetaDataSchemaModel;


public interface ATMetaDataSchemaService {

//List<ATMetaDataSchemaModel> getATMetaData(String str);

List<Integer> getCol(int artifacttypeId);

//List<ATMetaDataSchemaModel> getATMetaData(int str);
//List<ATMetaDataSchemaModel> getATMetaData(int str);

List<ATMetaDataSchemaModel> getATMetaData(String str);

  
}
