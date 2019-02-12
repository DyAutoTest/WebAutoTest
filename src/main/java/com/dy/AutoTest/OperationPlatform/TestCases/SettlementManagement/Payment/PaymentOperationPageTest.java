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
		iSearchMerchant=PaymentOperationPage;
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
			doSearchMerchant(spoBean.getMerchantNO(), spoBean.getMerchantName(), spoBean.getSearchMer_Radio());
			doQuery();
		}
		
	}
	
	
	@Test(dataProvider="SettlementManagement_PaymentOperationByCaseNO")
	public void testCheck_Pass(SettlementManagement_PaymentOperationBean spoBean) {
		PaymentOperationPage.navigateTo(URL);
		wait.waitFor(500);
		if(spoBean.getOrderDateBegin().equals("")||spoBean.getOrderDateEnd().equals("")) {
			System.out.println("The field (DateBegin or DateEnd) is null. Please check TestData!");
			Reporter.log("付款/订单日期为空，请检查测试数据");
			assertTrue(false);
		}
		PaymentOperationPage.clickAdvance();
		wait.waitFor(500);
		
		doQueryForClickButton(spoBean);
		
		PaymentOperationPage.clickAdvance();
		PaymentOperationPage.clickQuery();
		wait.waitFor(500);
		PaymentOperationPage.clickCheckBoxSingle(spoBean.getCheckBox());
		wait.waitFor(500);
		PaymentOperationPage.clickCheck();
		wait.waitFor(500);
		PaymentOperationPage.clickCheck_Checkbox(spoBean.getCheck_CheckBox());
		wait.waitFor(500);
		PaymentOperationPage.clickCheck_Pass();
		wait.waitFor(500);
		PaymentOperationPage.setCheck_Pass_Text(spoBean.getCheck_Pass_Text());
//		PaymentOperationPage.clickCheck_Pass_Confirm();
//		System.out.println(PaymentOperationPage.getNotice());
//		Reporter.log(PaymentOperationPage.getNotice());
		PaymentOperationPage.clickCheck_Pass_Close();
		wait.waitFor(500);
		PaymentOperationPage.clickCheck_Close();
	}
	
	
	@Test(dataProvider="SettlementManagement_PaymentOperationByCaseNO")
	public void testCheck_Cancel(SettlementManagement_PaymentOperationBean spoBean) {
		PaymentOperationPage.navigateTo(URL);
		wait.waitFor(500);
		if(spoBean.getOrderDateBegin().equals("")||spoBean.getOrderDateEnd().equals("")) {
			System.out.println("The field (DateBegin or DateEnd) is null. Please check TestData!");
			Reporter.log("付款/订单日期为空，请检查测试数据");
			assertTrue(false);
		}
		PaymentOperationPage.clickAdvance();
		wait.waitFor(500);
		
		doQueryForClickButton(spoBean);
		
		PaymentOperationPage.clickAdvance();
		PaymentOperationPage.clickQuery();
		wait.waitFor(500);
		PaymentOperationPage.clickCheckBoxSingle(spoBean.getCheckBox());
		wait.waitFor(500);
		PaymentOperationPage.clickCheck();
		wait.waitFor(500);
		PaymentOperationPage.clickCheck_Checkbox(spoBean.getCheck_CheckBox());
		wait.waitFor(500);
		PaymentOperationPage.clickCheck_Cancel();
		wait.waitFor(500);
		PaymentOperationPage.setCheck_Cancel_Text(spoBean.getCheck_Cancel_Text());
//		PaymentOperationPage.clickCheck_Cancel_Confirm();
//		System.out.println(PaymentOperationPage.getNotice());
//		Reporter.log(PaymentOperationPage.getNotice());
		PaymentOperationPage.clickCheck_Cancel_Close();
		wait.waitFor(500);
		PaymentOperationPage.clickCheck_Close();
	}
	
	
	@Test(dataProvider="SettlementManagement_PaymentOperationByCaseNO")
	public void testCheck_TurnEBank(SettlementManagement_PaymentOperationBean spoBean) {
		PaymentOperationPage.navigateTo(URL);
		wait.waitFor(500);
		if(spoBean.getOrderDateBegin().equals("")||spoBean.getOrderDateEnd().equals("")) {
			System.out.println("The field (DateBegin or DateEnd) is null. Please check TestData!");
			Reporter.log("付款/订单日期为空，请检查测试数据");
			assertTrue(false);
		}
		PaymentOperationPage.clickAdvance();
		wait.waitFor(500);
		
		doQueryForClickButton(spoBean);
		
		PaymentOperationPage.clickAdvance();
		PaymentOperationPage.clickQuery();
		wait.waitFor(500);
		PaymentOperationPage.clickCheckBoxSingle(spoBean.getCheckBox());
		wait.waitFor(500);
		PaymentOperationPage.clickCheck();
		wait.waitFor(500);
		PaymentOperationPage.clickCheck_Checkbox(spoBean.getCheck_CheckBox());
		wait.waitFor(500);
		PaymentOperationPage.clickCheck_TurnEbank();
		wait.waitFor(500);
//		PaymentOperationPage.clickCheck_TurnEBank_Confirm();
//		System.out.println(PaymentOperationPage.getNotice());
//		Reporter.log(PaymentOperationPage.getNotice());
		PaymentOperationPage.clickCheck_TurnEBank_Close();
		wait.waitFor(500);
		PaymentOperationPage.clickCheck_Close();
	}
	
	@Test(dataProvider="SettlementManagement_PaymentOperationByCaseNO")
	public void testBatchConfirm(SettlementManagement_PaymentOperationBean spoBean) {
		PaymentOperationPage.navigateTo(URL);
		wait.waitFor(500);
		if(spoBean.getOrderDateBegin().equals("")||spoBean.getOrderDateEnd().equals("")) {
			System.out.println("The field (DateBegin or DateEnd) is null. Please check TestData!");
			Reporter.log("付款/订单日期为空，请检查测试数据");
			assertTrue(false);
		}
		PaymentOperationPage.clickAdvance();
		wait.waitFor(500);
		
		doQueryForClickButton(spoBean);
		
		PaymentOperationPage.clickAdvance();
		PaymentOperationPage.clickQuery();
		wait.waitFor(500);
		PaymentOperationPage.clickCheckBoxSingle(spoBean.getCheckBox());
		wait.waitFor(500);
		PaymentOperationPage.clickBatchConfirm();
		wait.waitFor(500);
//		PaymentOperationPage.clickBatchPass_Confirm();
//		System.out.println(PaymentOperationPage.getNotice());
//		Reporter.log(PaymentOperationPage.getNotice());
		PaymentOperationPage.clickBatchPass_Close();
		wait.waitFor(500);
	}
	
	@Test(dataProvider="SettlementManagement_PaymentOperationByCaseNO")
	public void testBatchCancel(SettlementManagement_PaymentOperationBean spoBean) {
		PaymentOperationPage.navigateTo(URL);
		wait.waitFor(500);
		if(spoBean.getOrderDateBegin().equals("")||spoBean.getOrderDateEnd().equals("")) {
			System.out.println("The field (DateBegin or DateEnd) is null. Please check TestData!");
			Reporter.log("付款/订单日期为空，请检查测试数据");
			assertTrue(false);
		}
		PaymentOperationPage.clickAdvance();
		wait.waitFor(500);
		
		doQueryForClickButton(spoBean);
		
		PaymentOperationPage.clickAdvance();
		PaymentOperationPage.clickQuery();
		wait.waitFor(500);
		PaymentOperationPage.clickCheckBoxSingle(spoBean.getCheckBox());
		wait.waitFor(500);
		PaymentOperationPage.clickBatchCancel();
		wait.waitFor(500);
		PaymentOperationPage.setBatchCancel_Text(spoBean.getBatchCancel_Text());
//		PaymentOperationPage.clickBatchPass_Confirm();
//		System.out.println(PaymentOperationPage.getNotice());
//		Reporter.log(PaymentOperationPage.getNotice());
		PaymentOperationPage.clickBatchCancel_Close();
		wait.waitFor(500);
	}
	
	@Test(dataProvider="SettlementManagement_PaymentOperationByCaseNO")
	public void testBatchTurnEBank(SettlementManagement_PaymentOperationBean spoBean) {
		PaymentOperationPage.navigateTo(URL);
		wait.waitFor(500);
		if(spoBean.getOrderDateBegin().equals("")||spoBean.getOrderDateEnd().equals("")) {
			System.out.println("The field (DateBegin or DateEnd) is null. Please check TestData!");
			Reporter.log("付款/订单日期为空，请检查测试数据");
			assertTrue(false);
		}
		PaymentOperationPage.clickAdvance();
		wait.waitFor(500);
		
		doQueryForClickButton(spoBean);
		
		PaymentOperationPage.clickAdvance();
		PaymentOperationPage.clickQuery();
		wait.waitFor(500);
		PaymentOperationPage.clickCheckBoxSingle(spoBean.getCheckBox());
		wait.waitFor(500);
		PaymentOperationPage.clickBatchTurnEbank();
		wait.waitFor(500);
		PaymentOperationPage.selectBatchTurnEBank_PaymentBank(spoBean.getBatchTurnEBank_PaymentBank());
//		PaymentOperationPage.clickBatchTurnEBank_Confirm();
//		System.out.println(PaymentOperationPage.getNotice());
//		Reporter.log(PaymentOperationPage.getNotice());
		PaymentOperationPage.clickBatchTurnEBank_Close();
		wait.waitFor(500);
	}
	
	public void doQueryForClickButton(SettlementManagement_PaymentOperationBean spoBean) {
		if(!spoBean.getPaymentBank().equals("")) {
			PaymentOperationPage.selectPaymentBank(spoBean.getPaymentBank());
		}
		if(!spoBean.getCollectionBank().equals("")) {
			PaymentOperationPage.selectCollectionBank(spoBean.getCollectionBank());
		}
		if(!spoBean.getDateType().equals("")) {
			PaymentOperationPage.selectDateType(spoBean.getDateType());
		}
		PaymentOperationPage.setOrderDateBegin(spoBean.getOrderDateBegin());
		PaymentOperationPage.setOrderDateEnd(spoBean.getOrderDateEnd());
		PaymentOperationPage.doLoseFocus("OrderDateEnd", 120, 0);
		if(!spoBean.getPaymentType().equals("")) {
			PaymentOperationPage.selectPaymentType(spoBean.getPaymentType());
		}
		if(!spoBean.getInnerUserNO().equals("")) {
			PaymentOperationPage.setInnerUserNO(spoBean.getInnerUserNO());
		}
		if(!spoBean.getMerchantNO().equals("")||!spoBean.getMerchantName().equals("")) {
			doSearchMerchant(spoBean.getMerchantNO(), spoBean.getMerchantName(), spoBean.getSearchMer_Radio());
		}
		if(!spoBean.getPaymentStatus().equals("")) {
			PaymentOperationPage.selectPaymentStatus(spoBean.getPaymentStatus());
		}
	}
}