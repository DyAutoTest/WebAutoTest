package com.dy.AutoTest.OperationPlatform.TestCases.SettlementManagement.Payment;

import static org.testng.Assert.assertTrue;

import java.lang.reflect.Method;

import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.dy.AutoTest.web.api.SuperTest;
import com.dy.AutoTest.OperationPlatform.POJO.SettlementManagement_RiskApprovalBean;
import com.dy.AutoTest.OperationPlatform.PageObject.SettlementManagement.Payment.RiskApprovalPage;
import com.dy.AutoTest.web.business.DataBusiness;

public class RiskApprovalPageTest extends SuperTest  {
	RiskApprovalPage RiskApprovalPage;
	String URL;

	@BeforeClass
	public void init() {
		/******** instant objectPage *********/
		RiskApprovalPage=new RiskApprovalPage(driver);
		//RiskApprovalPage.setWaitTime(800);

		/******** set URL *********/
		URL=host.toString()+DataBusiness.getData_URL("pop_SettlementManagement_RiskApproval");

		/******** instant Interface *********/
		iQuery=RiskApprovalPage;
		iClickButton=RiskApprovalPage;
//		iClickRadio=RiskApprovalPage;
//		iSearchMerchantByNOorName=RiskApprovalPage;
	}

	@DataProvider(name="SettlementManagement_RiskApproval")
	protected static Object[][] parametersPool(){
		data.loadDataBeanList("POP_Data_SettlementManagement_RiskApproval");
		return data.getDataBeanArray();
	}

	@DataProvider(name="SettlementManagement_RiskApprovalByCaseNO")
	protected static Object[][] parametersPool(Method method){
		data.loadDataBeanList("POP_Data_SettlementManagement_RiskApproval",method.getName());
		return data.getDataBeanArray();
	}

	@Test(dataProvider="SettlementManagement_RiskApprovalByCaseNO")
	public void testQuery(SettlementManagement_RiskApprovalBean sraBean) {
		RiskApprovalPage.navigateTo(URL);
		wait.waitFor(500);
		if(sraBean.getDateBegin().equals("")||sraBean.getDateEnd().equals("")) {
			System.out.println("The field (DateBegin or DateEnd) is null. Please check TestData!");
			Reporter.log("付款/订单日期为空，请检查测试数据");
			assertTrue(false);
		}
		RiskApprovalPage.clickAdvance();
		wait.waitFor(500);
		
		if(!sraBean.getPaymentBank().equals("")) {
			RiskApprovalPage.selectPaymentBank(sraBean.getPaymentBank());
			RiskApprovalPage.setDateBegin(sraBean.getDateBegin());
			RiskApprovalPage.setDateEnd(sraBean.getDateEnd());
			RiskApprovalPage.doLoseFocus("DateEnd", 120, 0);
			doQuery();
		}
		if(!sraBean.getCollectionBank().equals("")) {
			RiskApprovalPage.selectCollectionBank(sraBean.getCollectionBank());
			RiskApprovalPage.setDateBegin(sraBean.getDateBegin());
			RiskApprovalPage.setDateEnd(sraBean.getDateEnd());
			RiskApprovalPage.doLoseFocus("DateEnd", 120, 0);
			doQuery();
		}
		if(!sraBean.getDateType().equals("")) {
			RiskApprovalPage.selectDateType(sraBean.getDateType());
			RiskApprovalPage.setDateBegin(sraBean.getDateBegin());
			RiskApprovalPage.setDateEnd(sraBean.getDateEnd());
			RiskApprovalPage.doLoseFocus("DateEnd", 120, 0);
			doQuery();
		}

		if(!sraBean.getPaymentType().equals("")) {
			RiskApprovalPage.selectPaymentType(sraBean.getPaymentType());
			RiskApprovalPage.setDateBegin(sraBean.getDateBegin());
			RiskApprovalPage.setDateEnd(sraBean.getDateEnd());
			RiskApprovalPage.doLoseFocus("DateEnd", 120, 0);
			doQuery();
		}
		
	}
}