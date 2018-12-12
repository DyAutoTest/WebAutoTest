package com.dy.AutoTest.wagaga.impl;


import java.util.List;

import com.dy.AutoTest.AG_Master;
import com.dy.AutoTest.wagaga.FileUtil;
import com.dy.AutoTest.web.beans.LocatorBean;
import com.dy.AutoTest.web.dao.TestingDao;
import com.dy.AutoTest.web.dao.impl.TestingDaoImpl;
import com.dy.AutoTest.wagaga.WebElementType;


public class POGenerator extends Generator{
	
	protected TestingDao testingDao=new TestingDaoImpl();
	private List<LocatorBean> list=testingDao.getDataList(AG_Master.locatorName,LocatorBean.class);
	
	
	public POGenerator() {
		loadFile();
		generateContent();
		writeFile();
	}
	@Override
	public void generateContent() {
		POContentTemplate poct=new POContentTemplate();
		poContent.append(poct.generatePackgaeMethod(AG_Master.packageNamePO)
				+poct.generateImportMethod()
				+poct.generateClassIdentify(AG_Master.classNamePO,AG_Master.locatorName));
		
		for(LocatorBean locatorBean:list) {
			poContent.append(poct.generateComment(locatorBean.getComment()));
			poContent.append(poct.generateMethod(locatorBean));
		}
		poContent.append(AG_Master.closeBrace);
	}
	
	
	class POContentTemplate {
		private String packageTemplate="package %s;\r\n\r\n";
		private String importClass="import org.openqa.selenium.Keys;\r\n"
				+ "import org.openqa.selenium.WebDriver;\r\n\r\n"
				+ "import com.dy.AutoTest.web.api.SuperPage;\r\n"
				+ "import com.dy.AutoTest.web.actions.DoPlus;\r\n\r\n";
		private String classIdentify="public class %s extends SuperPage{\r\n"
				+ "	public %s(WebDriver driver) {\r\n"
				+ "		super(driver);\r\n"
				+ "		du.loadLocator(\"%s\");\r\n"
				+ "	}\r\n"
				+ "	public void setWaitTime(long waitTime) {\r\n"
				+ "		du=new DoPlus(driver);\r\n"
				+ "		du.waitTime=waitTime;\r\n"
				+ "		du.loadLocator(\"%s\");\r\n"
				+ "	}\r\n\r\n"
				+ "/***************************Manual Coding**********************************/\r\n\r\n\r\n"
				+ "/****************************Auto Generate******************************/\r\n\r\n";
		
		
/****************************** init po class top *********************************/
		
		public String generatePackgaeMethod(String packageName) {
			return String.format(packageTemplate, packageName);
		}
		public String generateImportMethod() {
			return importClass;
		}
		public String generateClassIdentify(String className,String locatorName) {
			return String.format(classIdentify,className,className,locatorName,locatorName);
		}
		
		
		
/*************************** generate po class body *************************/
		
		private String buttonTemplate ="	public void click%s() {\r\n" + 
				"		du.what(\"%s\").click();\r\n" + 
				"	}\r\n";
		
		private String inputTemplate ="	public void set%s(String value) {\r\n" + 
				"		du.what(\"%s\").clear();\r\n" + 
				"		du.what(\"%s\").sendKeys(value);\r\n" + 
				"	}\r\n"+ 
				"	public String get%s() {\r\n" + 
				"		return du.what(\"%s\").getAttribute(\"value\");\r\n" + 
				"	}\r\n";
		
		private String inputTemplateForDate ="	public void set%s(String value) {\r\n"+
				"		du.what(\"%s\").sendKeys(Keys.CONTROL + \"a\");\r\n" + 
				"		du.waitFor(500);\r\n" + 
				"		du.what(\"%s\").sendKeys(value);\r\n" + 
				"	}\r\n"+ 
				"	public String get%s() {\r\n" + 
				"		return du.what(\"%s\").getAttribute(\"value\");\r\n" + 
				"	}\r\n";
		
		private String selectTemplate ="	public void select%s(String value) {\r\n" + 
				"		du.whatSelect(\"%s\").selectByValue(value);\r\n" + 
				"	}\r\n";
		//修改过，原index为int型，使用中做了String.valueof()转型，我直接改为String 
		private String radioTemplate = "	public void click%s(String radio) {\r\n" + 
				"		du.what(\"%s\",radio).click();\r\n" + 
				"	}\r\n"+ 
				"	public boolean is%sExist(String radio) {\r\n"+
				"		du.waitFor(500);\r\n"+ 
				"		return du.isElementExist(\"%s\",radio);\r\n"+ 
				"	}\r\n"
				+ "	public boolean is%sDisplayed(String radio) {\r\n"
				+ "		du.waitFor(500);\r\n"
				+ "		return du.what(\"%s\",radio).isDisplayed();\r\n"
				+ "	}\r\n";
		//新增类型label
		private String labelTemplate = "	public String get%s() {\r\n" + 
				"		return du.what(\"%s\").getText();\r\n" + 
				"	}\r\n";
		
		
		//用于button、checkbox和a标签
		public String generateButtonMethod(String name) {
			return String.format(buttonTemplate, name, name);
		}
		//用于text和textarea标签
		public  String generateInputMethod(String name) {
			if(name.contains("Date")) {
				return String.format(inputTemplateForDate, name, name, name, name, name, name, name);
			}
			return String.format(inputTemplate, name, name, name, name, name, name);
		}
		//用于select标签
		public  String generateSelectMethod(String name) {
			return String.format(selectTemplate, name, name);
		}
		//用于radio标签
		public String generateRadioMethod(String name) {
			return String.format(radioTemplate, name, name,name, name,name, name);
		}
		//用于label标签
		public String generateLabelMethod(String name) {
			return String.format(labelTemplate, name, name);
		}
		
		//用户注释
		public String generateComment(String Comment) {
			return "	//"+Comment+"\r\n";
		}
		
		public String generateMethod(LocatorBean locatorBean){
			String methodStr = null;
			
			switch(WebElementType.valueOf(locatorBean.getType())) {
				case button:
					methodStr = generateButtonMethod(locatorBean.getElementName());
					break;
				case checkbox:
					methodStr = generateButtonMethod(locatorBean.getElementName());
					break;
				case a:
					methodStr = generateButtonMethod(locatorBean.getElementName());
					break;
				case text:
					methodStr = generateInputMethod(locatorBean.getElementName());
					break;
				case textarea:
					methodStr = generateInputMethod(locatorBean.getElementName());
					break;
				case select:
					methodStr = generateSelectMethod(locatorBean.getElementName());
					break;
				case radio:
					methodStr = generateRadioMethod(locatorBean.getElementName());
					break;
				case label:
					methodStr = generateLabelMethod(locatorBean.getElementName());
					break;
				default:
					System.out.println("ID为"+locatorBean.getID()+"的Type不合法，请检查："+locatorBean.getType());
					break;
			}
				
			return methodStr;
		}
	}
	
	@Override
	public void loadFile() {
		FileUtil.loadFile(AG_Master.directoryPO+AG_Master.classNamePO+".java");
	}
	
	
}


