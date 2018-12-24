package com.dy.AutoTest.OperationPlatform.TestCases.OnlineRiskControl.ComplianceMaintain;

import java.lang.reflect.Method;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.dy.AutoTest.web.api.SuperTest;
import com.dy.AutoTest.OperationPlatform.PageObject.OnlineRiskControl.ComplianceMaintain.CustomerPaymentLimitPage;
import com.dy.AutoTest.OperationPlatform.POJO.ComplianceMaintain_CustomerPaymentLimitBean;
import com.dy.AutoTest.web.business.DataBusiness;

public class CustomerPaymentLimitPageTest extends SuperTest{
	CustomerPaymentLimitPage CustomerPaymentLimitPage;
	String URL;

	@BeforeClass
	public void init() {
		/******** instant objectPage *********/
		CustomerPaymentLimitPage=new CustomerPaymentLimitPage(driver);
		//CustomerPaymentLimitPage.setWaitTime(800);

		/******** set URL *********/
		URL=host.toString()+DataBusiness.getData_URL("pop_ComplianceMaintain_CustomerPaymentLimit");

		/******** instant Interface *********/
		iQuery=CustomerPaymentLimitPage;
//	iClickButton=CustomerPaymentLimitPage;
//	iClickRadio=CustomerPaymentLimitPage;
//	iSearchMerchantByNOorName=CustomerPaymentLimitPage;
	}

	@DataProvider(name="ComplianceMaintain_CustomerPaymentLimit")
	protected static Object[][] parametersPool(){
		data.loadDataBeanList("POP_Data_ComplianceMaintain_CustomerPaymentLimit");
		return data.getDataBeanArray();
	}

	@DataProvider(name="ComplianceMaintain_CustomerPaymentLimitByCaseNO")
	protected static Object[][] parametersPool(Method method){
		data.loadDataBeanList("POP_Data_ComplianceMaintain_CustomerPaymentLimit",method.getName());
		return data.getDataBeanArray();
	}

	@Test(dataProvider="ComplianceMaintain_CustomerPaymentLimitByCaseNO")
	public void testQuery(ComplianceMaintain_CustomerPaymentLimitBean ComplianceMaintain_CustomerPaymentLimitBean) {
		CustomerPaymentLimitPage.navigateTo(URL);
		wait.waitFor(500);

	}
}