package com.dy.AutoTest.wagaga;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.dy.AutoTest.wagaga.impl.POGenerator;
import com.dy.AutoTest.wagaga.impl.POJOGenerator;
import com.dy.AutoTest.wagaga.impl.PTGenerator;
import com.dy.AutoTest.wagaga.impl.SQLGenerator;
import com.dy.AutoTest.wagaga.impl.TestngXMLGenerator;

public class AG_Master {
	private static IGenerate ig;
	

	public static String caseName="SettlementManagement_PaymentWorkFlowQuery";
	public static String caseNameAlias="PaymentWorkFlowQuery";
	public static String url="pop_"+caseName;
	public static String locatorName="POP_Loc_"+caseName;
	public static String dataName="POP_Data_"+caseName;

	public static String directoryPO="src/main/java/com/dy/AutoTest/OperationPlatform/PageObject/SettlementManagement/";
	public static String packageNamePO="com.dy.AutoTest.OperationPlatform.PageObject.SettlementManagement";
	
	public static String directoryPOJO="src/main/java/com/dy/AutoTest/OperationPlatform/POJO/";
	public static String packageNamePOJO="com.dy.AutoTest.OperationPlatform.POJO";
	
	public static String directoryPT="src/main/java/com/dy/AutoTest/OperationPlatform/TestCases/SettlementManagement/";
	public static String packageNamePT="com.dy.AutoTest.OperationPlatform.TestCases.SettlementManagement";
	
	public static String directoryXML="src/main/java/com/dy/AutoTest/OperationPlatform/TestCases/SettlementManagement/";
	public static String directorySQL="C:\\Users\\寒\\Documents\\Navicat\\SQLite\\servers\\AutoTest_0.0.3\\main\\";
//	public static String directorySQL="C:\\Users\\寒\\Desktop\\temp\\";
	
	public static String classNamePT=caseNameAlias+"PageTest";
	public static String classNamePO=caseNameAlias+"Page";
	public static String classNamePOJO=caseName+"Bean";
	public static String xmlName="testng_"+caseName+".xml";
	public static String sqlName="insert "+caseName+".sql";
	
	//缩进代码用的tab符
	public static String tab(int n) {
		String tab="";
		for(int i=0;i<n;i++) {
			tab+="	";
		}
		return tab;
	}
	public static final String closeBrace="\r\n}";
	
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
}
