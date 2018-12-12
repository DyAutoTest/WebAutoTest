package com.dy.AutoTest.wagaga.impl;


import org.apache.commons.lang.StringUtils;

import com.dy.AutoTest.AG_Master;
import com.dy.AutoTest.wagaga.FileUtil;
import com.dy.AutoTest.web.dao.TestingDao;
import com.dy.AutoTest.web.dao.impl.TestingDaoImpl;

public class SQLGenerator extends Generator{
	
	protected TestingDao testingDao=new TestingDaoImpl();
	private String [][] tableStruct=testingDao.getTableStruct(AG_Master.dataName);
	
	
	public SQLGenerator() {
		loadFile();
		generateContent();
		writeFile();
	}

	@Override
	public void generateContent() {
		SQLTemplate xmlct=new SQLTemplate();
		poContent.append(xmlct.generateDeleteTemplate(AG_Master.dataName)
				+xmlct.generateInsertTemplate(AG_Master.dataName)
		+xmlct.generateInsertValue(tableStruct));
	}
	
	class SQLTemplate {
		private String deleteTemplate="delete from %s;\r\n\r\n";
		private String insertTemplate="insert into %s\r\n";
		
		public String generateDeleteTemplate(String dataName) {
			return String.format(deleteTemplate, dataName);
		}
		public String generateInsertTemplate(String dataName) {
			return String.format(insertTemplate, dataName);
		}
		
		public String generateInsertValue(String [][] tableStruct){
//			String insertValue = "(\r\n";
//			for(Entry<String, String> entry: tableStruct.entrySet()) {
//				if(entry.getKey().equals("ID")) continue;
//				insertValue+=entry.getKey()+",";
//				
//			}
//			insertValue=StringUtils.substringBeforeLast(insertValue,",");
//			insertValue+="\r\n)\r\nvalues (\r\n";
//			for(Entry<String, String> entry: tableStruct.entrySet()) {
//				if(entry.getKey().equals("ID")) continue;
//				insertValue+="\'"+entry.getKey()+"\',";
//			}
//			insertValue=StringUtils.substringBeforeLast(insertValue,",");
//			insertValue+="\r\n);\r\n";
//			return insertValue;
			String insertValue = "(\r\n";
			for(int i=0;i<tableStruct.length;i++) {
				if(tableStruct [i][0].equals("ID")) continue;
				insertValue+=tableStruct[i][0]+",";
				
			}
			insertValue=StringUtils.substringBeforeLast(insertValue,",");
			insertValue+="\r\n)\r\nvalues (\r\n";
			for(int i=0;i<tableStruct.length;i++) {
				if(tableStruct [i][0].equals("ID")) continue;
				insertValue+="\'"+tableStruct[i][0]+"\',";
			}
			insertValue=StringUtils.substringBeforeLast(insertValue,",");
			insertValue+="\r\n);\r\n";
			return insertValue;
		}
	}
	
	
	@Override
	public void loadFile() {
		FileUtil.loadFile(AG_Master.directorySQL+AG_Master.sqlName);
		
	}


}
