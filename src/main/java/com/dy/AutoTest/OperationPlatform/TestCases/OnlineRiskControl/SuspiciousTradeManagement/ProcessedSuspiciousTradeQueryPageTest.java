package com.dy.AutoTest.OperationPlatform.TestCases.OnlineRiskControl.SuspiciousTradeManagement;

import java.lang.reflect.Method;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.dy.AutoTest.web.api.SuperTest;
import com.dy.AutoTest.OperationPlatform.PageObject.OnlineRiskControl.SuspiciousTradeManagement.ProcessedSuspiciousTradeQueryPage;
import com.dy.AutoTest.OperationPlatform.POJO.SuspiciousTradeManagement_ProcessedSuspiciousTradeQueryBean;
import com.dy.AutoTest.web.business.DataBusiness;

public class ProcessedSuspiciousTradeQueryPageTest extends SuperTest{
	ProcessedSuspiciousTradeQueryPage ProcessedSuspiciousTradeQueryPage;
	String URL;

	@BeforeClass
	public void init() {
		/******** instant objectPage *********/
		ProcessedSuspiciousTradeQueryPage=new ProcessedSuspiciousTradeQueryPage(driver);
		//ProcessedSuspiciousTradeQueryPage.setWaitTime(800);

		/******** set URL *********/
		URL=host.toString()+DataBusiness.getData_URL("pop_SuspiciousTradeManagement_ProcessedSuspiciousTradeQuery");

		/******** instant Interface *********/
		iQuery=ProcessedSuspiciousTradeQueryPage;
//	iClickButton=ProcessedSuspiciousTradeQueryPage;
//	iClickRadio=ProcessedSuspiciousTradeQueryPage;
//	iSearchMerchantByNOorName=ProcessedSuspiciousTradeQueryPage;
	}

	@DataProvider(name="SuspiciousTradeManagement_ProcessedSuspiciousTradeQuery")
	protected static Object[][] parametersPool(){
		data.loadDataBeanList("POP_Data_SuspiciousTradeManagement_ProcessedSuspiciousTradeQuery");
		return data.getDataBeanArray();
	}

	@DataProvider(name="SuspiciousTradeManagement_ProcessedSuspiciousTradeQueryByCaseNO")
	protected static Object[][] parametersPool(Method method){
		data.loadDataBeanList("POP_Data_SuspiciousTradeManagement_ProcessedSuspiciousTradeQuery",method.getName());
		return data.getDataBeanArray();
	}

	@Test(dataProvider="SuspiciousTradeManagement_ProcessedSuspiciousTradeQueryByCaseNO")
	public void testQuery(SuspiciousTradeManagement_ProcessedSuspiciousTradeQueryBean SuspiciousTradeManagement_ProcessedSuspiciousTradeQueryBean) {
		ProcessedSuspiciousTradeQueryPage.navigateTo(URL);
		wait.waitFor(500);

	}
}