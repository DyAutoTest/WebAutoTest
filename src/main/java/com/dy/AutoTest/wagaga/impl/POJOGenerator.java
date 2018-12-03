package com.dy.AutoTest.wagaga.impl;

import java.util.Map;
import java.util.Map.Entry;

import com.dy.AutoTest.wagaga.AG_Master;
import com.dy.AutoTest.wagaga.FileUtil;
import com.dy.AutoTest.web.dao.TestingDao;
import com.dy.AutoTest.web.dao.impl.TestingDaoImpl;

public class POJOGenerator extends Generator{
	
	protected TestingDao testingDao=new TestingDaoImpl();
	private Map<String, String> tableStruct=testingDao.getTableStruct(AG_Master.dataName);
	
	public POJOGenerator() {
		loadFile();
		generateContent();
		writeFile();
	}
	
	@Override
	public void generateContent() {
		POJOContentTemplate pojoct=new POJOContentTemplate();
		poContent.append(pojoct.generatePackgaeMethod(AG_Master.packageNamePOJO)
				+pojoct.generateImportMethod()
				+pojoct.generateClassIdentify(AG_Master.classNamePOJO));
		
		poContent.append(pojoct.generateMethod(tableStruct));
		
		poContent.append(AG_Master.closeBrace);
	}
	
	class POJOContentTemplate {
		private String packageTemplate="package %s;\r\n\r\n";
		private String importClass="import java.io.Serializable;\r\n\r\n";
		private String classIdentify="public class %s implements Serializable{\r\n"
				+ "	private static final long serialVersionUID = 1L;\r\n\r\n";
		
/****************************** init pojo class top *********************************/
		
		public String generatePackgaeMethod(String packageNamePT) {
			return String.format(packageTemplate, packageNamePT);
		}
		public String generateImportMethod() {
			return importClass;
		}
		public String generateClassIdentify(String className) {
			return String.format(classIdentify,className);
		}
		
/***************************** generate pojo class body *****************************/
		
		
		private String variableIdentifyTemplate="	private %s %s;\r\n";
		private String getMethodTemplate="	public %s get%s() {\r\n"
				+ "		return %s;\r\n"
				+ "	}\r\n";
		private String setMethodTemplate="	public void set%s(%s %s) {\r\n"
				+ "		this.%s = %s;\r\n"
				+ "	}\r\n";

		
		public String generateVariableIdentify(String fieldName,String fieldType) {
			return String.format(variableIdentifyTemplate, fieldType, fieldName);
		}
		
		public String generateGetMethod(String fieldName,String fieldType) {
			return String.format(getMethodTemplate, fieldType, fieldName, fieldName);
		}
		
		public String generateSetMethod(String fieldName,String fieldType) {
			return String.format(setMethodTemplate, fieldName, fieldType, fieldName, fieldName, fieldName);
		}
		
		public String generateMethod(Map<String, String> tableStruct){
			String methodStr = "";
			for(Entry<String, String> entry: tableStruct.entrySet()) {
				methodStr+=generateVariableIdentify(entry.getKey(), entry.getValue());
			}
			for (Entry<String, String> entry: tableStruct.entrySet()) { 
				methodStr+=generateGetMethod(entry.getKey(),entry.getValue());
				methodStr+=generateSetMethod(entry.getKey(),entry.getValue());
			}
			return methodStr;
		}
	}
	
	
	@Override
	public void loadFile() {
		FileUtil.loadFile(AG_Master.directoryPOJO+AG_Master.classNamePOJO+".java");
	}

}
