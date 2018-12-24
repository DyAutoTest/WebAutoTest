package com.dy.AutoTest.OperationPlatform.TestCases.OnlineRiskControl.ComplianceMaintain;

import java.lang.reflect.Method;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.dy.AutoTest.web.api.SuperTest;
import com.dy.AutoTest.OperationPlatform.PageObject.OnlineRiskControl.ComplianceMaintain.TradeVerificationWaySetPage;
import com.dy.AutoTest.OperationPlatform.POJO.ComplianceMaintain_TradeVerificationWaySetBean;
import com.dy.AutoTest.web.business.DataBusiness;

public class TradeVerificationWaySetPageTest extends SuperTest{
	TradeVerificationWaySetPage TradeVerificationWaySetPage;
	String URL;

	@BeforeClass
	public void init() {
		/******** instant objectPage *********/
		TradeVerificationWaySetPage=new TradeVerificationWaySetPage(driver);
		//TradeVerificationWaySetPage.setWaitTime(800);

		/******** set URL *********/
		URL=host.toString()+DataBusiness.getData_URL("pop_ComplianceMaintain_TradeVerificationWaySet");

		/******** instant Interface *********/
		iQuery=TradeVerificationWaySetPage;
//	iClickButton=TradeVerificationWaySetPage;
//	iClickRadio=TradeVerificationWaySetPage;
//	iSearchMerchantByNOorName=TradeVerificationWaySetPage;
	}

	@DataProvider(name="ComplianceMaintain_TradeVerificationWaySet")
	protected static Object[][] parametersPool(){
		data.loadDataBeanList("POP_Data_ComplianceMaintain_TradeVerificationWaySet");
		return data.getDataBeanArray();
	}

	@DataProvider(name="ComplianceMaintain_TradeVerificationWaySetByCaseNO")
	protected static Object[][] parametersPool(Method method){
		data.loadDataBeanList("POP_Data_ComplianceMaintain_TradeVerificationWaySet",method.getName());
		return data.getDataBeanArray();
	}

	@Test(dataProvider="ComplianceMaintain_TradeVerificationWaySetByCaseNO")
	public void testQuery(ComplianceMaintain_TradeVerificationWaySetBean ComplianceMaintain_TradeVerificationWaySetBean) {
		TradeVerificationWaySetPage.navigateTo(URL);
		wait.waitFor(500);

	}
}