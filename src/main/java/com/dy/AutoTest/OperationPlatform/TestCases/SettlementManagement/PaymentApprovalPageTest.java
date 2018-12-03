package com.dy.AutoTest.OperationPlatform.TestCases.SettlementManagement;

import java.lang.reflect.Method;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.dy.AutoTest.web.api.SuperTest;
import com.dy.AutoTest.OperationPlatform.PageObject.SettlementManagement.PaymentApprovalPage;
import com.dy.AutoTest.OperationPlatform.POJO.SettlementManagement_PaymentApprovalBean;
import com.dy.AutoTest.web.business.DataBusiness;

public class PaymentApprovalPageTest extends SuperTest{
	PaymentApprovalPage PaymentApprovalPage;
	String URL;

	@BeforeClass
	public void init() {
		/******** instant objectPage *********/
		PaymentApprovalPage=new PaymentApprovalPage(driver);
		//PaymentApprovalPage.setWaitTime(800);

		/******** set URL *********/
		URL=host.toString()+DataBusiness.getData_URL("pop_SettlementManagement_PaymentApproval");

		/******** instant Interface *********/
//		iQuery=PaymentApprovalPage;
//		iClickButton=PaymentApprovalPage;
//		iClickRadio=PaymentApprovalPage;
//		iSearchMerchantByNOorName=PaymentApprovalPage;
	}

	@DataProvider(name="SettlementManagement_PaymentApproval")
	protected static Object[][] parametersPool(){
		data.loadDataBeanList("POP_Data_SettlementManagement_PaymentApproval");
		return data.getDataBeanArray();
	}

	@DataProvider(name="SettlementManagement_PaymentApprovalByCaseNO")
	protected static Object[][] parametersPool(Method method){
		data.loadDataBeanList("POP_Data_SettlementManagement_PaymentApproval",method.getName());
		return data.getDataBeanArray();
	}

	@Test(dataProvider="SettlementManagement_PaymentApprovalByCaseNO")
	public void testQuery(SettlementManagement_PaymentApprovalBean SettlementManagement_PaymentApprovalBean) {
		PaymentApprovalPage.navigateTo(URL);
		wait.waitFor(500);

	}
}