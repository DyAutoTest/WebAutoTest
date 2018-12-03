package com.dy.AutoTest.OperationPlatform.TestCases.SettlementManagement;

import java.lang.reflect.Method;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.dy.AutoTest.web.api.SuperTest;
import com.dy.AutoTest.OperationPlatform.PageObject.SettlementManagement.PaymentOperationPage;
import com.dy.AutoTest.OperationPlatform.POJO.SettlementManagement_PaymentOperationBean;
import com.dy.AutoTest.web.business.DataBusiness;

public class PaymentOperationPageTest extends SuperTest{
	PaymentOperationPage PaymentOperationPage;
	String URL;

	@BeforeClass
	public void init() {
		/******** instant objectPage *********/
		PaymentOperationPage=new PaymentOperationPage(driver);
		//PaymentOperationPage.setWaitTime(800);

		/******** set URL *********/
		URL=host.toString()+DataBusiness.getData_URL("pop_SettlementManagement_PaymentOperation");

		/******** instant Interface *********/
//		iQuery=PaymentOperationPage;
//		iClickButton=PaymentOperationPage;
//		iClickRadio=PaymentOperationPage;
//		iSearchMerchantByNOorName=PaymentOperationPage;
	}

	@DataProvider(name="SettlementManagement_PaymentOperation")
	protected static Object[][] parametersPool(){
		data.loadDataBeanList("POP_Data_SettlementManagement_PaymentOperation");
		return data.getDataBeanArray();
	}

	@DataProvider(name="SettlementManagement_PaymentOperationByCaseNO")
	protected static Object[][] parametersPool(Method method){
		data.loadDataBeanList("POP_Data_SettlementManagement_PaymentOperation",method.getName());
		return data.getDataBeanArray();
	}

	@Test(dataProvider="SettlementManagement_PaymentOperationByCaseNO")
	public void testQuery(SettlementManagement_PaymentOperationBean SettlementManagement_PaymentOperationBean) {
		PaymentOperationPage.navigateTo(URL);
		wait.waitFor(500);

	}
}