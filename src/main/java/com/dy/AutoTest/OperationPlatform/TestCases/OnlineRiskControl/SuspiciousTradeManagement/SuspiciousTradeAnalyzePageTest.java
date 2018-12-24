package com.dy.AutoTest.OperationPlatform.TestCases.OnlineRiskControl.SuspiciousTradeManagement;

import java.lang.reflect.Method;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.dy.AutoTest.web.api.SuperTest;
import com.dy.AutoTest.OperationPlatform.PageObject.OnlineRiskControl.SuspiciousTradeManagement.SuspiciousTradeAnalyzePage;
import com.dy.AutoTest.OperationPlatform.POJO.SuspiciousTradeManagement_SuspiciousTradeAnalyzeBean;
import com.dy.AutoTest.web.business.DataBusiness;

public class SuspiciousTradeAnalyzePageTest extends SuperTest{
	SuspiciousTradeAnalyzePage SuspiciousTradeAnalyzePage;
	String URL;

	@BeforeClass
	public void init() {
		/******** instant objectPage *********/
		SuspiciousTradeAnalyzePage=new SuspiciousTradeAnalyzePage(driver);
		//SuspiciousTradeAnalyzePage.setWaitTime(800);

		/******** set URL *********/
		URL=host.toString()+DataBusiness.getData_URL("pop_SuspiciousTradeManagement_SuspiciousTradeAnalyze");

		/******** instant Interface *********/
		iQuery=SuspiciousTradeAnalyzePage;
//	iClickButton=SuspiciousTradeAnalyzePage;
//	iClickRadio=SuspiciousTradeAnalyzePage;
//	iSearchMerchantByNOorName=SuspiciousTradeAnalyzePage;
	}

	@DataProvider(name="SuspiciousTradeManagement_SuspiciousTradeAnalyze")
	protected static Object[][] parametersPool(){
		data.loadDataBeanList("POP_Data_SuspiciousTradeManagement_SuspiciousTradeAnalyze");
		return data.getDataBeanArray();
	}

	@DataProvider(name="SuspiciousTradeManagement_SuspiciousTradeAnalyzeByCaseNO")
	protected static Object[][] parametersPool(Method method){
		data.loadDataBeanList("POP_Data_SuspiciousTradeManagement_SuspiciousTradeAnalyze",method.getName());
		return data.getDataBeanArray();
	}

	@Test(dataProvider="SuspiciousTradeManagement_SuspiciousTradeAnalyzeByCaseNO")
	public void testQuery(SuspiciousTradeManagement_SuspiciousTradeAnalyzeBean SuspiciousTradeManagement_SuspiciousTradeAnalyzeBean) {
		SuspiciousTradeAnalyzePage.navigateTo(URL);
		wait.waitFor(500);

	}
}