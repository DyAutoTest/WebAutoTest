package com.dy.AutoTest.OperationPlatform.TestCases.SettlementManagement;

import java.lang.reflect.Method;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.dy.AutoTest.web.api.SuperTest;
import com.dy.AutoTest.OperationPlatform.PageObject.SettlementManagement.PaymentApprovalStatusQueryPage;
import com.dy.AutoTest.OperationPlatform.POJO.SettlementManagement_PaymentApprovalStatusQueryBean;
import com.dy.AutoTest.web.business.DataBusiness;

public class PaymentApprovalStatusQueryPageTest extends SuperTest{
	PaymentApprovalStatusQueryPage PaymentApprovalStatusQueryPage;
	String URL;

	@BeforeClass
	public void init() {
		/******** instant objectPage *********/
		PaymentApprovalStatusQueryPage=new PaymentApprovalStatusQueryPage(driver);
		//PaymentApprovalStatusQueryPage.setWaitTime(800);

		/******** set URL *********/
		URL=host.toString()+DataBusiness.getData_URL("pop_SettlementManagement_PaymentApprovalStatusQuery");

		/******** instant Interface *********/
//		iQuery=PaymentApprovalStatusQueryPage;
//		iClickButton=PaymentApprovalStatusQueryPage;
//		iClickRadio=PaymentApprovalStatusQueryPage;
//		iSearchMerchantByNOorName=PaymentApprovalStatusQueryPage;
	}

	@DataProvider(name="SettlementManagement_PaymentApprovalStatusQuery")
	protected static Object[][] parametersPool(){
		data.loadDataBeanList("POP_Data_SettlementManagement_PaymentApprovalStatusQuery");
		return data.getDataBeanArray();
	}

	@DataProvider(name="SettlementManagement_PaymentApprovalStatusQueryByCaseNO")
	protected static Object[][] parametersPool(Method method){
		data.loadDataBeanList("POP_Data_SettlementManagement_PaymentApprovalStatusQuery",method.getName());
		return data.getDataBeanArray();
	}

	@Test(dataProvider="SettlementManagement_PaymentApprovalStatusQueryByCaseNO")
	public void testQuery(SettlementManagement_PaymentApprovalStatusQueryBean SettlementManagement_PaymentApprovalStatusQueryBean) {
		PaymentApprovalStatusQueryPage.navigateTo(URL);
		wait.waitFor(500);

	}
}