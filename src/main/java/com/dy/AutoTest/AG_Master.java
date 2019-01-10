package com.dy.AutoTest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.dy.AutoTest.wagaga.IGenerate;
import com.dy.AutoTest.wagaga.impl.DataBusinessGenerator;
import com.dy.AutoTest.wagaga.impl.POGenerator;
import com.dy.AutoTest.wagaga.impl.POJOGenerator;
import com.dy.AutoTest.wagaga.impl.PTGenerator;
import com.dy.AutoTest.wagaga.impl.SQLGenerator;
import com.dy.AutoTest.wagaga.impl.TestngXMLGenerator;

public class AG_Master {
	private static IGenerate ig;
	/**
	 * 当中使用率testingDAO的类，如果想独立，得单独写个jdbc方法
	 */
	@Test
	public void generateAll() {
		ig=new POGenerator();
		ig=new POJOGenerator();
		ig=new PTGenerator();
		ig=new TestngXMLGenerator();
		ig=new SQLGenerator();
	}

	public static final String caseName="MerchantInfoManagement_MerchantInfoAdd";
	public static final String caseNameAlias="MerchantInfoAdd";
	public static final String url="aop_"+caseName;
	public static final String locatorName="AOP_Loc_"+caseName;
	public static final String dataName="AOP_Data_"+caseName;

	public static final String directoryPO="src/main/java/com/dy/AutoTest/AcquiringOperationPlatform/PageObject/MerchantInfoManagement/";
	public static final String packageNamePO="com.dy.AutoTest.AcquiringOperationPlatform.PageObject.MerchantInfoManagement";
	
	public static final String directoryPOJO="src/main/java/com/dy/AutoTest/AcquiringOperationPlatform/POJO/";
	public static final String packageNamePOJO="com.dy.AutoTest.AcquiringOperationPlatform.POJO";
	
	public static final String directoryPT="src/main/java/com/dy/AutoTest/AcquiringOperationPlatform/PageTest/MerchantInfoManagement/";
	public static final String packageNamePT="com.dy.AutoTest.AcquiringOperationPlatform.PageTest.MerchantInfoManagement";
	
	public static final String directoryXML="src/main/java/com/dy/AutoTest/AcquiringOperationPlatform/PageTest/MerchantInfoManagement/";
	public static final String directoryDataBusiness="src/main/java/com/dy/AutoTest/";
	public static final String directorySQL="C:\\Users\\寒\\Documents\\Navicat\\SQLite\\servers\\AutoTest_0.0.3\\main\\";
	
	public static final String classNamePT=caseNameAlias+"PageTest";
	public static final String classNamePO=caseNameAlias+"Page";
	public static final String classNamePOJO=caseName+"Bean";
	public static final String xmlName="testng_"+caseName+".xml";
	public static final String sqlName="insert AOP_"+caseName+".sql";
	public static final String dataBusinessName="temp-dataBusiness";
	
	//缩进代码用的tab符
	public static String tab(int n) {
		String tab="";
		for(int i=0;i<n;i++) {
			tab+="	";
		}
		return tab;
	}
	public static final String closeBrace="\r\n}";
	
	
	@AfterMethod
	public void release() {
		ig.release();
	}
	@Test
	public void generatePageObject(){
		ig=new POGenerator();
	}
	@Test
	public void generatePOJO(){
		ig=new POJOGenerator();
	}
	@Test
	public void generatePageTest(){
		ig=new PTGenerator();
	}
	@Test
	public void generateTestngXML(){
		ig=new TestngXMLGenerator();
	}
	@Test
	public void generateSQL(){
		ig=new SQLGenerator();
	}
	@Test
	public void generateDataBusiness(){
		ig=new DataBusinessGenerator();
	}
}
