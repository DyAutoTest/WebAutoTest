package com.dy.AutoTest.wagaga.impl;

import com.dy.AutoTest.AG_Master;
import com.dy.AutoTest.wagaga.FileUtil;

public class TestngXMLGenerator_aop extends Generator{
	
	
	public TestngXMLGenerator_aop() {
		loadFile();
		generateContent();
		writeFile();
	}
	
	@Override
	public void generateContent() {
		TestngXMLContentTemplate xmlct=new TestngXMLContentTemplate();
		poContent.append(xmlct.generateSuit()+xmlct.generateLogin()
		+xmlct.generateTest(AG_Master.caseName,AG_Master.packageNamePT,AG_Master.classNamePT)
		+xmlct.generateQuit()+xmlct.reportTemplate);
	}
	
	class TestngXMLContentTemplate {
		private String suitTemplate="<?xml version=\"1.0\" encoding=\"UTF-8\"?>\r\n" + 
				"<!DOCTYPE suite SYSTEM \"http://testng.org/testng-1.0.dtd\">\r\n" + 
				"<suite name=\"AcquiringOperationPlatform\" >\r\n" + 
				" 	<parameter name=\"browserCategory\" value=\"chrome\"></parameter>\r\n" + 
				"	<parameter name=\"environment\" value=\"aop_uat\"></parameter>\r\n\r\n";
		private String loginTemplate="	<test thread-count=\"5\" name=\"Login\">\r\n" + 
				"		<classes>\r\n" + 
				"			<class\r\n" + 
				"				name=\"com.dy.AutoTest.web.actions.SingletonSet\"></class>\r\n" + 
				"			<class\r\n" + 
				"				name=\"com.dy.AutoTest.AcquiringOperationPlatform.PageTest.LoginPageTest\">\r\n" + 
				"				<methods>\r\n" + 
				"					<include name=\"testLogin\" />\r\n" + 
				"				</methods>\r\n" + 
				"			</class>\r\n" + 
				"		</classes>\r\n" + 
				"	</test>\r\n\r\n\r\n";
		
		private String quitTemplate="	<test thread-count=\"5\" name=\"Quit\">\r\n" + 
				"		<classes>\r\n" + 
				"			<class name=\"com.dy.AutoTest.AcquiringOperationPlatform.PageTest.LoginPageTest\"> \r\n" + 
				"				<methods>\r\n" + 
				"					<include name=\"testQuit\" />\r\n" + 
				"				</methods> \r\n" + 
				"			</class>\r\n" + 
				"		</classes>\r\n" + 
				"	</test>\r\n\r\n\r\n";
		
		private String reportTemplate="  <listeners>\r\n" + 
				"           <listener class-name=\"org.uncommons.reportng.HTMLReporter\" />\r\n" + 
				"           <listener class-name=\"org.uncommons.reportng.JUnitXMLReporter\" />\r\n" + 
				" </listeners>\r\n\r\n" + 
				"</suite> <!-- AcquiringOperationPlatform -->";
		
		private String testTemplate="	<test thread-count=\"5\" name=\"%s\">\r\n" + 
				"		<classes>\r\n" + 
				"			<class\r\n" + 
				"				name=\"%s.%s\">\r\n" + 
				"				<methods>\r\n" + 
				"					<include name=\"testQuery\" />\r\n" +
				"					<!-- <include name=\"testCheck\" /> -->\r\n" +
				"					<!-- <include name=\"testDelete\" /> -->\r\n" +
				"					<!-- <include name=\"testUpdate\" /> -->\r\n" +
				"					<!-- <include name=\"testAdd\" /> -->\r\n" +
				"				</methods>\r\n" + 
				"			</class> \r\n" + 
				"		</classes>\r\n" + 
				"	</test>\r\n\r\n\r\n";
		
		public String generateSuit() {
			return suitTemplate;
		}
		public String generateLogin() {
			return loginTemplate;
		}
		public String generateTest(String caseName,String packagePT,String classNamePT) {
			return String.format(testTemplate,caseName,packagePT,classNamePT);
		}
		public String generateQuit() {
			return quitTemplate;
		}
		public String generateReport() {
			return reportTemplate;
		}
		
	}

	@Override
	public void loadFile() {
		FileUtil.loadFile(AG_Master.directoryXML+AG_Master.xmlName);
		
	}

}
