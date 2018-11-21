package com.dy.AutoTest.web.util;

import com.dy.AutoTest.web.beans.LocatorBean;
import com.dy.AutoTest.web.beans.WebElementType;

public class GenerateStringUtil {
	private static String packageTemplate="package %s;\r\n\r\n";
	private static String importClass="import org.openqa.selenium.WebDriver;\r\n\r\n"
			+ "import com.dy.AutoTest.OperationPlatform.PageObject.SuperPage;\r\n"
			+ "import com.dy.AutoTest.web.actions.DoPlus;\r\n\r\n";
	private static String classIdentify="public class %s extends SuperPage{\r\n"
			+ "	public %s(WebDriver driver) {\r\n"
			+ "		super(driver);\r\n"
			+ "		du.loadLocator(\"%s\");\r\n"
			+ "	}\r\n"
			+ "	public void setWaitTime(long waitTime) {\r\n"
			+ "		du=new DoPlus(driver);\r\n"
			+ "		du.waitTime=waitTime;\r\n"
			+ "		du.loadLocator(\"%s\");\r\n"
			+ "	}\r\n\r\n"
			+ "/****************************Auto Generate******************************/\r\n\r\n";
	public static String classIdentifyEnd="\r\n}";
	public static String generatePackgaeMethod(String packageName) {
		return String.format(packageTemplate, packageName);
	}
	public static String generateImportMethod() {
		return importClass;
	}
	public static String generateClassIdentify(String className,String locatorName) {
		return String.format(classIdentify,className,className,locatorName,locatorName);
	}
	
	
	
	
	
	private static String buttonTemplate ="	public void click%s() {\r\n" + 
			"		du.what(\"%s\").click();\r\n" + 
			"	}\r\n";
	
	private static String inputTemplate ="	public void set%s(String value) {\r\n" + 
			"		du.what(\"%s\").clear();\r\n" + 
			"		du.what(\"%s\").sendKeys(value);\r\n" + 
			"	}\r\n"+ 
			"	public String get%s() {\r\n" + 
			"		return du.what(\"%s\").getAttribute(\"value\");\r\n" + 
			"	}\r\n";
	
	private static String selectTemplate ="	public void select%s(String value) {\r\n" + 
			"		du.whatSelect(\"%s\").selectByValue(value);\r\n" + 
			"	}\r\n";
	//修改过，原index为int型，使用中做了String.valueof()转型，我直接改为String 
	private static String radioTemplate = "	public void click%s(String index) {\r\n" + 
			"		du.what(\"%s\",index).click();\r\n" + 
			"	}\r\n";
	//新增类型label
	private static String labelTemplate = "	public String get%s() {\r\n" + 
			"		return du.what(\"%s\").getText();\r\n" + 
			"	}\r\n";
	
	
	//用于button、checkbox和a标签
	public static String generateButtonMethod(String name) {
		return String.format(buttonTemplate, name, name);
	}
	//用于text和textarea标签
	public static String generateInputMethod(String name) {
		return String.format(inputTemplate, name, name, name, name, name, name);
	}
	//用于select标签
	public static String generateSelectMethod(String name) {
		return String.format(selectTemplate, name, name);
	}
	//用于radio标签
	public static String generateRadioMethod(String name) {
		return String.format(radioTemplate, name, name);
	}
	//用于label标签
	public static String generateLabelMethod(String name) {
		return String.format(labelTemplate, name, name);
	}
	
	//用户注释
	public static String generateComment(String Comment) {
		return "	//"+Comment+"\r\n";
	}
	
	public static String generator(LocatorBean locatorBean){
		String methodStr = "";
		
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
