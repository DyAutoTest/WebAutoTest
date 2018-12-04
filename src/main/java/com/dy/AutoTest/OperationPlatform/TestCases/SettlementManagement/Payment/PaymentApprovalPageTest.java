package com.dy.AutoTest.OperationPlatform.TestCases.SettlementManagement.Payment;

import static org.testng.Assert.assertTrue;

import java.lang.reflect.Method;

import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.dy.AutoTest.web.api.SuperTest;
import com.dy.AutoTest.OperationPlatform.POJO.SettlementManagement_PaymentApprovalBean;
import com.dy.AutoTest.OperationPlatform.PageObject.SettlementManagement.Payment.PaymentApprovalPage;
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
		iQuery=PaymentApprovalPage;
		iClickButton=PaymentApprovalPage;
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
	public void testQuery(SettlementManagement_PaymentApprovalBean spaBean) {
		PaymentApprovalPage.navigateTo(URL);
		wait.waitFor(500);
		if(spaBean.getDateBegin().equals("")||spaBean.getDateEnd().equals("")) {
			System.out.println("The field (DateBegin or DateEnd) is null. Please check TestData!");
			Reporter.log("付款/订单日期为空，请检查测试数据");
			assertTrue(false);
		}
		PaymentApprovalPage.clickAdvance();
		wait.waitFor(500);
		
		if(!spaBean.getPaymentType().equals("")) {
			PaymentApprovalPage.selectPaymentType(spaBean.getPaymentType());
			PaymentApprovalPage.setDateBegin(spaBean.getDateBegin());
			PaymentApprovalPage.setDateEnd(spaBean.getDateEnd());
			PaymentApprovalPage.doLoseFocus("DateEnd", 120, 0);
			doQuery();
		}
		
		if(!spaBean.getRecheckOperationStatus().equals("")) {
			PaymentApprovalPage.selectRecheckOperationStatus(spaBean.getRecheckOperationStatus());
			PaymentApprovalPage.setDateBegin(spaBean.getDateBegin());
			PaymentApprovalPage.setDateEnd(spaBean.getDateEnd());
			PaymentApprovalPage.doLoseFocus("DateEnd", 120, 0);
			doQuery();
		}
		
		if(!spaBean.getDateType().equals("")) {
			PaymentApprovalPage.selectDateType(spaBean.getDateType());
			PaymentApprovalPage.setDateBegin(spaBean.getDateBegin());
			PaymentApprovalPage.setDateEnd(spaBean.getDateEnd());
			PaymentApprovalPage.doLoseFocus("DateEnd", 120, 0);
			doQuery();
		}
		
		if(!spaBean.getPaymentBank().equals("")) {
			PaymentApprovalPage.setDateBegin(spaBean.getDateBegin());
			PaymentApprovalPage.setDateEnd(spaBean.getDateEnd());
			PaymentApprovalPage.doLoseFocus("DateEnd", 120, 0);
			PaymentApprovalPage.selectPaymentBank(spaBean.getPaymentBank());
			doQuery();
		}
		
		if(!spaBean.getCollectionBank().equals("")) {
			PaymentApprovalPage.setDateBegin(spaBean.getDateBegin());
			PaymentApprovalPage.setDateEnd(spaBean.getDateEnd());
			PaymentApprovalPage.doLoseFocus("DateEnd", 120, 0);
			PaymentApprovalPage.selectCollectionBank(spaBean.getCollectionBank());
			doQuery();
		}

		if(!spaBean.getInnerUserNO().equals("")) {
			PaymentApprovalPage.setDateBegin(spaBean.getDateBegin());
			PaymentApprovalPage.setDateEnd(spaBean.getDateEnd());
			PaymentApprovalPage.doLoseFocus("DateEnd", 120, 0);
			PaymentApprovalPage.setInnerUserNO(spaBean.getInnerUserNO());
			doQuery();
		}
		
	}
}