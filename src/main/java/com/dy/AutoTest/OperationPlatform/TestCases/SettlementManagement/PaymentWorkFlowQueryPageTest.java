package com.dy.AutoTest.OperationPlatform.TestCases.SettlementManagement;

import java.lang.reflect.Method;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.dy.AutoTest.web.api.SuperTest;
import com.dy.AutoTest.OperationPlatform.PageObject.SettlementManagement.PaymentWorkFlowQueryPage;
import com.dy.AutoTest.OperationPlatform.POJO.SettlementManagement_PaymentWorkFlowQueryBean;
import com.dy.AutoTest.web.business.DataBusiness;

public class PaymentWorkFlowQueryPageTest extends SuperTest{
	PaymentWorkFlowQueryPage PaymentWorkFlowQueryPage;
	String URL;

	@BeforeClass
	public void init() {
		/******** instant objectPage *********/
		PaymentWorkFlowQueryPage=new PaymentWorkFlowQueryPage(driver);
		//PaymentWorkFlowQueryPage.setWaitTime(800);

		/******** set URL *********/
		URL=host.toString()+DataBusiness.getData_URL("pop_SettlementManagement_PaymentWorkFlowQuery");

		/******** instant Interface *********/
//		iQuery=PaymentWorkFlowQueryPage;
//		iClickButton=PaymentWorkFlowQueryPage;
//		iClickRadio=PaymentWorkFlowQueryPage;
//		iSearchMerchantByNOorName=PaymentWorkFlowQueryPage;
	}

	@DataProvider(name="SettlementManagement_PaymentWorkFlowQuery")
	protected static Object[][] parametersPool(){
		data.loadDataBeanList("POP_Data_SettlementManagement_PaymentWorkFlowQuery");
		return data.getDataBeanArray();
	}

	@DataProvider(name="SettlementManagement_PaymentWorkFlowQueryByCaseNO")
	protected static Object[][] parametersPool(Method method){
		data.loadDataBeanList("POP_Data_SettlementManagement_PaymentWorkFlowQuery",method.getName());
		return data.getDataBeanArray();
	}

	@Test(dataProvider="SettlementManagement_PaymentWorkFlowQueryByCaseNO")
	public void testQuery(SettlementManagement_PaymentWorkFlowQueryBean SettlementManagement_PaymentWorkFlowQueryBean) {
		PaymentWorkFlowQueryPage.navigateTo(URL);
		wait.waitFor(500);

	}
}