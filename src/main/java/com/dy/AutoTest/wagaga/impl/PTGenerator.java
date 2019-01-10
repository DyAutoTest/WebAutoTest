package com.dy.AutoTest.wagaga.impl;



import com.dy.AutoTest.AG_Master;
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
				+ptct.generateDataProviderTemplate(AG_Master.caseName, AG_Master.dataName,AG_Master.classNamePOJO)
				+ptct.generateTestQueryTemplate(AG_Master.caseName, AG_Master.classNamePOJO, AG_Master.classNamePO)
				+ptct.generateTestCheckTemplate(AG_Master.caseName, AG_Master.classNamePOJO, AG_Master.classNamePO)
				+ptct.generateTestDeleteTemplate(AG_Master.caseName, AG_Master.classNamePOJO, AG_Master.classNamePO)
				+ptct.generateTestUpdateTemplate(AG_Master.caseName, AG_Master.classNamePOJO, AG_Master.classNamePO)
				+ptct.generateTestAddTemplate(AG_Master.caseName, AG_Master.classNamePOJO, AG_Master.classNamePO)
				+ptct.generateDoQueryForClickButtonTemplate(AG_Master.classNamePOJO, AG_Master.classNamePO)
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
				+ "		iQuery=%s;\r\n"
				+ "//		iClickButton=%s;\r\n"
				+ "//		iClickRadio=%s;\r\n"
				+ "//		iSearchMerchantByNOorName=%s;\r\n"
				+ "	}\r\n\r\n";
		private String dataProviderTemplate="	@DataProvider(name=\"%s\")\r\n"
				+ "	protected static Object[][] parametersPool(){\r\n"
				+ "		data.loadDataBeanList(\"%s\",%s.class);\r\n"
				+ "		return data.getDataBeanArray();\r\n"
				+ "	}\r\n\r\n"
				+ "	@DataProvider(name=\"%sByCaseNO\")\r\n"
				+ "	protected static Object[][] parametersPool(Method method){\r\n"
				+ "		data.loadDataBeanList(\"%s\",method.getName(),%s.class);\r\n"
				+ "		return data.getDataBeanArray();\r\n"
				+ "	}\r\n\r\n";
		private String testQueryTemplate="	@Test(dataProvider=\"%sByCaseNO\")\r\n"
				+ "	public void testQuery(%s bean) {\r\n"
				+ "		%s.navigateTo(URL);\r\n"
				+ "		wait.waitFor(500);\r\n\r\n"
				+ "	}\r\n";
		private String testCheckTemplate="	@Test(dataProvider=\"%sByCaseNO\")\r\n"
				+ "	public void testCheck(%s bean) {\r\n"
				+ "		%s.navigateTo(URL);\r\n"
				+ "		wait.waitFor(500);\r\n"
				+ "		doQueryForClickButton(bean);\r\n"
				+ "		%s.clickCheck();\r\n"
				+ "		wait.waitFor(2000);\r\n" 
				+"		%s.clickCheck_Close();\r\n"
				+ "	}\r\n";
		private String testDeleteTemplate="	@Test(dataProvider=\"%sByCaseNO\")\r\n"
				+ "	public void testDelete(%s bean) {\r\n"
				+ "		%s.navigateTo(URL);\r\n"
				+ "		wait.waitFor(500);\r\n"
				+ "		doQueryForClickButton(bean);\r\n"
				+ "		%s.clickDelete();\r\n"
				+ "		wait.waitFor(1000);\r\n" 
				+ "//		%s.clickDelete_Confirm();\r\n"
				+ "//		System.out.println(%s.getNotice());\r\n" 
				+ "//		Reporter.log(%s.getNotice());\r\n" 
				+ "		%s.clickDelete_Close();\r\n" 
				+ "	}\r\n";
		private String testUpdateTemplate="	@Test(dataProvider=\"%sByCaseNO\")\r\n"
				+ "	public void testUpdate(%s bean) {\r\n"
				+ "		%s.navigateTo(URL);\r\n"
				+ "		wait.waitFor(500);\r\n"
				+ "		doQueryForClickButton(bean);\r\n"
				+ "		%s.clickUpdate();\r\n"
				+ "		wait.waitFor(1000);\r\n" 
				+ "//		判断update字段是否为空\r\n\r\n"
				+ "		wait.waitFor(1000);\r\n"
				+ "//		%s.clickUpdate_Submit();\r\n"
				+ "//		System.out.println(%s.getNotice());\r\n" 
				+ "//		Reporter.log(%s.getNotice());\r\n" 
				+ "		%s.clickUpdate_Close();\r\n" 
				+ "	}\r\n";
		private String testAddTemplate="	@Test(dataProvider=\"%sByCaseNO\")\r\n"
				+ "	public void testAdd(%s bean) {\r\n"
				+ "		%s.navigateTo(URL);\r\n"
				+ "		wait.waitFor(500);\r\n"
				+ "//		add需要先判断必输项的测试数据是否为空\r\n\r\n"
				+ "//			System.out.println(\"验证方式字段为必输项，不能为空\");\r\n" 
				+ "//			Reporter.log(\"验证方式字段为必输项，不能为空\");\r\n" 
				+ "//			assertTrue(false);\r\n\r\n"
				+ "		%s.clickAdd();\r\n"
				+ "		wait.waitFor(1000);\r\n\r\n" 
				+ "//		%s.clickAdd_Submit();\r\n"
				+ "//		System.out.println(%s.getNotice());\r\n" 
				+ "//		Reporter.log(%s.getNotice());\r\n" 
				+ "		%s.clickAdd_Close();\r\n" 
				+ "	}\r\n\r\n\r\n";
		private String doQueryForClickButtonTemplate="	public void doQueryForClickButton(%s bean) {\r\n\r\n" + 
				"		%s.clickQuery();\r\n" + 
				"		wait.waitFor(500);\r\n" + 
				"		%s.clickRadio(bean.getRadio());\r\n" + 
				"		wait.waitFor(500);\r\n" + 
				"	}";

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
			return String.format(beforeClassTemplate,classNamePO,classNamePO,classNamePO,url,classNamePO,classNamePO,classNamePO,classNamePO);
		}
		public String generateDataProviderTemplate(String caseName,String dataNamePO,String classNamePOJO) {
			return String.format(dataProviderTemplate,caseName,dataNamePO,classNamePOJO,caseName,dataNamePO,classNamePOJO);
		}
		public String generateTestQueryTemplate(String caseName,String classNamePOJO,String classNamePO) {
			return String.format(testQueryTemplate,caseName,classNamePOJO,classNamePO);
		}
		public String generateTestCheckTemplate(String caseName,String classNamePOJO,String classNamePO) {
			return String.format(testCheckTemplate,caseName,classNamePOJO,classNamePO,classNamePO,classNamePO);
		}
		public String generateTestDeleteTemplate(String caseName,String classNamePOJO,String classNamePO) {
			return String.format(testDeleteTemplate,caseName,classNamePOJO,classNamePO,classNamePO,classNamePO,classNamePO,classNamePO,classNamePO);
		}
		public String generateTestUpdateTemplate(String caseName,String classNamePOJO,String classNamePO) {
			return String.format(testUpdateTemplate,caseName,classNamePOJO,classNamePO,classNamePO,classNamePO,classNamePO,classNamePO,classNamePO);
		}
		public String generateTestAddTemplate(String caseName,String classNamePOJO,String classNamePO) {
			return String.format(testAddTemplate,caseName,classNamePOJO,classNamePO,classNamePO,classNamePO,classNamePO,classNamePO,classNamePO);
		}
		public String generateDoQueryForClickButtonTemplate(String classNamePOJO,String classNamePO) {
			return String.format(doQueryForClickButtonTemplate,classNamePOJO,classNamePO,classNamePO);
		}
	}
	
	@Override
	public void loadFile() {
		FileUtil.loadFile(AG_Master.directoryPT+AG_Master.classNamePT+".java");
		
	}



	
	
}
