package com.dy.AutoTest.OperationPlatform.TestCases.SettlementManagement.Payment;

import static org.testng.Assert.assertTrue;

import java.lang.reflect.Method;

import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.dy.AutoTest.web.api.SuperTest;
import com.dy.AutoTest.OperationPlatform.POJO.SettlementManagement_PaymentWorkFlowQueryBean;
import com.dy.AutoTest.OperationPlatform.PageObject.SettlementManagement.Payment.PaymentWorkFlowQueryPage;
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
		iQuery=PaymentWorkFlowQueryPage;
//		iClickButton=PaymentWorkFlowQueryPage;
//		iClickRadio=PaymentWorkFlowQueryPage;
//		iSearchMerchant=PaymentWorkFlowQueryPage;
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
	public void testQuery(SettlementManagement_PaymentWorkFlowQueryBean spwfqBean) {
		PaymentWorkFlowQueryPage.navigateTo(URL);
		wait.waitFor(500);
		if(spwfqBean.getPaymentApplicationDateBegin().equals("")||spwfqBean.getPaymentApplicationDateEnd().equals("")) {
			System.out.println("The field (DateBegin or DateEnd) is null. Please check TestData!");
			Reporter.log("付款/订单日期为空，请检查测试数据");
			assertTrue(false);
		}
		
		if(!spwfqBean.getPaymentBank().equals("")) {
			PaymentWorkFlowQueryPage.selectPaymentBank(spwfqBean.getPaymentBank());
			PaymentWorkFlowQueryPage.setPaymentApplicationDateBegin(spwfqBean.getPaymentApplicationDateBegin());
			PaymentWorkFlowQueryPage.setPaymentApplicationDateEnd(spwfqBean.getPaymentApplicationDateEnd());
			PaymentWorkFlowQueryPage.doLoseFocus("PaymentApplicationDateEnd", 120, 0);
			doQuery();
		}
		if(!spwfqBean.getPayType().equals("")) {
			PaymentWorkFlowQueryPage.selectPayType(spwfqBean.getPayType());
			PaymentWorkFlowQueryPage.setPaymentApplicationDateBegin(spwfqBean.getPaymentApplicationDateBegin());
			PaymentWorkFlowQueryPage.setPaymentApplicationDateEnd(spwfqBean.getPaymentApplicationDateEnd());
			PaymentWorkFlowQueryPage.doLoseFocus("PaymentApplicationDateEnd", 120, 0);
			doQuery();
		}
		if(!spwfqBean.getApprovalWorkFlow().equals("")) {
			PaymentWorkFlowQueryPage.selectApprovalWorkFlow(spwfqBean.getApprovalWorkFlow());
			PaymentWorkFlowQueryPage.setPaymentApplicationDateBegin(spwfqBean.getPaymentApplicationDateBegin());
			PaymentWorkFlowQueryPage.setPaymentApplicationDateEnd(spwfqBean.getPaymentApplicationDateEnd());
			PaymentWorkFlowQueryPage.doLoseFocus("PaymentApplicationDateEnd", 120, 0);
			doQuery();
		}
		if(!spwfqBean.getInnerUserNO().equals("")) {
			PaymentWorkFlowQueryPage.setInnerUserNO(spwfqBean.getInnerUserNO());
			PaymentWorkFlowQueryPage.setPaymentApplicationDateBegin(spwfqBean.getPaymentApplicationDateBegin());
			PaymentWorkFlowQueryPage.setPaymentApplicationDateEnd(spwfqBean.getPaymentApplicationDateEnd());
			PaymentWorkFlowQueryPage.doLoseFocus("PaymentApplicationDateEnd", 120, 0);
			doQuery();
		}
		if(!spwfqBean.getOrderStatus().equals("")) {
			PaymentWorkFlowQueryPage.selectOrderStatus(spwfqBean.getOrderStatus());
			PaymentWorkFlowQueryPage.setPaymentApplicationDateBegin(spwfqBean.getPaymentApplicationDateBegin());
			PaymentWorkFlowQueryPage.setPaymentApplicationDateEnd(spwfqBean.getPaymentApplicationDateEnd());
			PaymentWorkFlowQueryPage.doLoseFocus("PaymentApplicationDateEnd", 120, 0);
			doQuery();
		}
		
		
		
		
	}
}