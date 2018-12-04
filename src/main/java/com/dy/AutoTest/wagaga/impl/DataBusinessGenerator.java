package com.dy.AutoTest.wagaga.impl;


import com.dy.AutoTest.wagaga.AG_Master;
import com.dy.AutoTest.wagaga.FileUtil;

public class DataBusinessGenerator extends Generator{
	
	
	public DataBusinessGenerator() {
		loadFile();
		generateContent();
		writeFile();
	}

	@Override
	public void generateContent() {
		DataBusinessTemplate dbt=new DataBusinessTemplate();
		poContent.append(dbt.generateVariableIdentifyTemplate(AG_Master.classNamePOJO)
				+dbt.generateDataBeanTemplate(AG_Master.dataName, AG_Master.classNamePOJO)
				+dbt.generateDataBeanListTemplate(AG_Master.dataName, AG_Master.classNamePOJO));
	}
	
	
	class DataBusinessTemplate {
		private String variableIdentifyTemplate="private %s %s;\r\n\r\n"
				+ "";
		private String dataBeanTemplate="case \"%s\":\r\n" + 
				"	pojo=(T)testingDao.getData(tableName,ID,%s.class);\r\n" + 
				"	return pojo;\r\n\r\n";
		private String dataBeanListTemplate="case \"%s\":\r\n" + 
				"	list=BaseUtil.toObject(testingDao.getDataListByCase(tableName,caseNO,%s.class));\r\n" + 
				"	break;\r\n\r\n";
		public String generateVariableIdentifyTemplate(String classNamePOJO) {
			return String.format(variableIdentifyTemplate, classNamePOJO, classNamePOJO);
		}
		public String generateDataBeanTemplate(String dataName,String classNamePOJO) {
			return String.format(dataBeanTemplate, dataName, classNamePOJO);
		}
		public String generateDataBeanListTemplate(String dataName,String classNamePOJO) {
			return String.format(dataBeanListTemplate, dataName, classNamePOJO);
		}
	}
	
	
	@Override
	public void loadFile() {
		FileUtil.loadFile(AG_Master.directoryDataBusiness+AG_Master.dataBusinessName);
	}


}
