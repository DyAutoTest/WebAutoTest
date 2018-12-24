package com.dy.AutoTest.OperationPlatform.TestCases.OnlineRiskControl.SuspiciousTradeManagement;

import java.lang.reflect.Method;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.dy.AutoTest.web.api.SuperTest;
import com.dy.AutoTest.OperationPlatform.PageObject.OnlineRiskControl.SuspiciousTradeManagement.BeingProcessedSuspiciousTradeMaintainPage;
import com.dy.AutoTest.OperationPlatform.POJO.SuspiciousTradeManagement_BeingProcessedSuspiciousTradeMaintainBean;
import com.dy.AutoTest.web.business.DataBusiness;

public class BeingProcessedSuspiciousTradeMaintainPageTest extends SuperTest{
	BeingProcessedSuspiciousTradeMaintainPage BeingProcessedSuspiciousTradeMaintainPage;
	String URL;

	@BeforeClass
	public void init() {
		/******** instant objectPage *********/
		BeingProcessedSuspiciousTradeMaintainPage=new BeingProcessedSuspiciousTradeMaintainPage(driver);
		//BeingProcessedSuspiciousTradeMaintainPage.setWaitTime(800);

		/******** set URL *********/
		URL=host.toString()+DataBusiness.getData_URL("pop_SuspiciousTradeManagement_BeingProcessedSuspiciousTradeMaintain");

		/******** instant Interface *********/
		iQuery=BeingProcessedSuspiciousTradeMaintainPage;
//	iClickButton=BeingProcessedSuspiciousTradeMaintainPage;
//	iClickRadio=BeingProcessedSuspiciousTradeMaintainPage;
//	iSearchMerchantByNOorName=BeingProcessedSuspiciousTradeMaintainPage;
	}

	@DataProvider(name="SuspiciousTradeManagement_BeingProcessedSuspiciousTradeMaintain")
	protected static Object[][] parametersPool(){
		data.loadDataBeanList("POP_Data_SuspiciousTradeManagement_BeingProcessedSuspiciousTradeMaintain");
		return data.getDataBeanArray();
	}

	@DataProvider(name="SuspiciousTradeManagement_BeingProcessedSuspiciousTradeMaintainByCaseNO")
	protected static Object[][] parametersPool(Method method){
		data.loadDataBeanList("POP_Data_SuspiciousTradeManagement_BeingProcessedSuspiciousTradeMaintain",method.getName());
		return data.getDataBeanArray();
	}

	@Test(dataProvider="SuspiciousTradeManagement_BeingProcessedSuspiciousTradeMaintainByCaseNO")
	public void testQuery(SuspiciousTradeManagement_BeingProcessedSuspiciousTradeMaintainBean SuspiciousTradeManagement_BeingProcessedSuspiciousTradeMaintainBean) {
		BeingProcessedSuspiciousTradeMaintainPage.navigateTo(URL);
		wait.waitFor(500);

	}
}