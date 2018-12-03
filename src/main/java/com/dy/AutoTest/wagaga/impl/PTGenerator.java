package com.dy.AutoTest.wagaga.impl;

import com.dy.AutoTest.wagaga.AG_Master;
import com.dy.AutoTest.wagaga.FileUtil;


public class PTGenerator extends Generator{
	
	public PTGenerator() {
		loadFile();
		generateContent();
		writeFile();
	}

	@Override
	public void generateContent() {
		PTContentTemplate ptct=new PTContentTemplate();
		poContent.append(ptct.generatePackgaeMethod(AG_Master.packageNamePT)
				+ptct.generateImportMethod(AG_Master.packageNamePO,AG_Master.classNamePO,AG_Master.packageNamePOJO,AG_Master.classNamePOJO)
				+ptct.generateClassIdentify(AG_Master.classNamePT,AG_Master.classNamePO)
				+ptct.generateBeforeClassTemplate(AG_Master.classNamePO, AG_Master.classNamePOJO, AG_Master.url)
				+ptct.generateDataProviderTemplate(AG_Master.caseName, AG_Master.dataName)
				+ptct.generateTestQueryTemplate(AG_Master.caseName, AG_Master.classNamePOJO, AG_Master.classNamePO)
				);
		poContent.append(AG_Master.closeBrace);
	}
	
	class PTContentTemplate {
		private String packageTemplate="package %s;\r\n\r\n";
		private String importClassTemplate="import java.lang.reflect.Method;\r\n\r\n"
				+ "import org.testng.annotations.BeforeClass;\r\n"
				+ "import org.testng.annotations.DataProvider;\r\n"
				+ "import org.testng.annotations.Test;\r\n\r\n"
				+ "import com.dy.AutoTest.web.api.SuperTest;\r\n"
				+ "import %s.%s;\r\n"
				+ "import %s.%s;\r\n"
				+ "import com.dy.AutoTest.web.business.DataBusiness;\r\n\r\n";
		private String classIdentify="public class %s extends SuperTest{\r\n"
				+ "	%s %s;\r\n"
				+ "	String URL;\r\n\r\n";
				
		private String beforeClassTemplate="	@BeforeClass\r\n"
				+ "	public void init() {\r\n"
				+ "		/******** instant objectPage *********/\r\n"
				+ "		%s=new %s(driver);\r\n"
				+ "		//%s.setWaitTime(800);\r\n\r\n"
				+ "		/******** set URL *********/\r\n"
				+ "		URL=host.toString()+DataBusiness.getData_URL(\"%s\");\r\n\r\n"
				+ "		/******** instant Interface *********/\r\n"
				+ "//		iQuery=%s;\r\n"
				+ "//		iClickButton=%s;\r\n"
				+ "//		iClickRadio=%s;\r\n"
				+ "	}\r\n\r\n";
		private String dataProviderTemplate="	@DataProvider(name=\"%s\")\r\n"
				+ "	protected static Object[][] parametersPool(){\r\n"
				+ "		data.loadDataBeanList(\"%s\");\r\n"
				+ "		return data.getDataBeanArray();\r\n"
				+ "	}\r\n\r\n"
				+ "	@DataProvider(name=\"%sByCaseNO\")\r\n"
				+ "	protected static Object[][] parametersPool(Method method){\r\n"
				+ "		data.loadDataBeanList(\"%s\",method.getName());\r\n"
				+ "		return data.getDataBeanArray();\r\n"
				+ "	}\r\n\r\n";
		private String testQueryTemplate="	@Test(dataProvider=\"%sByCaseNO\")\r\n"
				+ "	public void testQuery(%s %s) {\r\n"
				+ "		%s.navigateTo(URL);\r\n"
				+ "		wait.waitFor(500);\r\n\r\n"
				+ "	}";

/****************************** init pojo class top *********************************/
		
		public String generatePackgaeMethod(String packageNamePT) {
			return String.format(packageTemplate, packageNamePT);
		}
		public String generateImportMethod(String packageNamePO,String classNamePO,String packageNamePOJO,String classNamePOJO) {
			return String.format(importClassTemplate, packageNamePO,classNamePO,packageNamePOJO,classNamePOJO);
		}
		public String generateClassIdentify(String classNamePT,String classNamePO) {
			return String.format(classIdentify,classNamePT,classNamePO,classNamePO);
		}
		
/***************************** generate pojo class body *****************************/
		
		public String generateBeforeClassTemplate(String classNamePO,String classNamePOJO,String url) {
			return String.format(beforeClassTemplate,classNamePO,classNamePO,classNamePO,url,classNamePO,classNamePO,classNamePO);
		}
		public String generateDataProviderTemplate(String caseName,String dataNamePO) {
			return String.format(dataProviderTemplate,caseName,dataNamePO,caseName,dataNamePO);
		}
		public String generateTestQueryTemplate(String caseName,String classNamePOJO,String classNamePO) {
			return String.format(testQueryTemplate,caseName,classNamePOJO,classNamePOJO,classNamePO);
		}
	}
	
	@Override
	public void loadFile() {
		FileUtil.loadFile(AG_Master.directoryPT+AG_Master.classNamePT+".java");
		
	}



	
	
}
