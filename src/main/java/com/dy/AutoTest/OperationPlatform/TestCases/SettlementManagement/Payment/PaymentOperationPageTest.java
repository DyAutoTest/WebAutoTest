package com.dy.AutoTest.OperationPlatform.TestCases.SettlementManagement.Payment;

import static org.testng.Assert.assertTrue;

import java.lang.reflect.Method;

import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.dy.AutoTest.web.api.SuperTest;
import com.dy.AutoTest.OperationPlatform.POJO.SettlementManagement_PaymentOperationBean;
import com.dy.AutoTest.OperationPlatform.PageObject.SettlementManagement.Payment.PaymentOperationPage;
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
		iQuery=PaymentOperationPage;
		iClickButton=PaymentOperationPage;
//		iClickRadio=PaymentOperationPage;
		iSearchMerchantByNOorName=PaymentOperationPage;
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
	public void testQuery(SettlementManagement_PaymentOperationBean spoBean) {
		PaymentOperationPage.navigateTo(URL);
		wait.waitFor(500);
		if(spoBean.getOrderDateBegin().equals("")||spoBean.getOrderDateEnd().equals("")) {
			System.out.println("The field (DateBegin or DateEnd) is null. Please check TestData!");
			Reporter.log("付款/订单日期为空，请检查测试数据");
			assertTrue(false);
		}
		PaymentOperationPage.clickAdvance();
		wait.waitFor(500);
		
		if(!spoBean.getPaymentBank().equals("")) {
			PaymentOperationPage.selectPaymentBank(spoBean.getPaymentBank());
			PaymentOperationPage.setOrderDateBegin(spoBean.getOrderDateBegin());
			PaymentOperationPage.setOrderDateEnd(spoBean.getOrderDateEnd());
			PaymentOperationPage.doLoseFocus("OrderDateEnd", 120, 0);
			doQuery();
		}
		if(!spoBean.getCollectionBank().equals("")) {
			PaymentOperationPage.selectCollectionBank(spoBean.getCollectionBank());
			PaymentOperationPage.setOrderDateBegin(spoBean.getOrderDateBegin());
			PaymentOperationPage.setOrderDateEnd(spoBean.getOrderDateEnd());
			PaymentOperationPage.doLoseFocus("OrderDateEnd", 120, 0);
			doQuery();
		}
		if(!spoBean.getDateType().equals("")) {
			PaymentOperationPage.selectDateType(spoBean.getDateType());
			PaymentOperationPage.setOrderDateBegin(spoBean.getOrderDateBegin());
			PaymentOperationPage.setOrderDateEnd(spoBean.getOrderDateEnd());
			PaymentOperationPage.doLoseFocus("OrderDateEnd", 120, 0);
			doQuery();
		}

		if(!spoBean.getPaymentType().equals("")) {
			PaymentOperationPage.selectPaymentType(spoBean.getPaymentType());
			PaymentOperationPage.setOrderDateBegin(spoBean.getOrderDateBegin());
			PaymentOperationPage.setOrderDateEnd(spoBean.getOrderDateEnd());
			PaymentOperationPage.doLoseFocus("OrderDateEnd", 120, 0);
			doQuery();
		}
		
		if(!spoBean.getInnerUserNO().equals("")) {
			PaymentOperationPage.setInnerUserNO(spoBean.getInnerUserNO());
			PaymentOperationPage.setOrderDateBegin(spoBean.getOrderDateBegin());
			PaymentOperationPage.setOrderDateEnd(spoBean.getOrderDateEnd());
			PaymentOperationPage.doLoseFocus("OrderDateEnd", 120, 0);
			doQuery();
		}
		
		if(!spoBean.getPaymentStatus().equals("")) {
			PaymentOperationPage.selectPaymentStatus(spoBean.getPaymentStatus());
			PaymentOperationPage.setOrderDateBegin(spoBean.getOrderDateBegin());
			PaymentOperationPage.setOrderDateEnd(spoBean.getOrderDateEnd());
			PaymentOperationPage.doLoseFocus("OrderDateEnd", 120, 0);
			doQuery();
		}
		
		if(!spoBean.getMerchantNO().equals("")||!spoBean.getMerchantName().equals("")) {
			PaymentOperationPage.setOrderDateBegin(spoBean.getOrderDateBegin());
			PaymentOperationPage.setOrderDateEnd(spoBean.getOrderDateEnd());
			PaymentOperationPage.doLoseFocus("OrderDateEnd", 120, 0);
			doSearchMerchantByNOorName(spoBean.getMerchantNO(), spoBean.getMerchantName(), spoBean.getSearchMer_Radio());
			doQuery();
		}
		
	}
}