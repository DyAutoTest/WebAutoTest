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

	/**
	 * @param ccplBean
	 */
	@Test(dataProvider="ComplianceMaintain_CustomerPaymentLimitByCaseNO")
	public void testQuery(ComplianceMaintain_CustomerPaymentLimitBean ccplBean) {
		CustomerPaymentLimitPage.navigateTo(URL);
		wait.waitFor(500);
		if(!ccplBean.getCustomerNO().equals("")) {
			CustomerPaymentLimitPage.setCustomerNO(ccplBean.getCustomerNO());
			doQuery();
		}
		if(!ccplBean.getUserNO().equals("")) {
			CustomerPaymentLimitPage.setUserNO(ccplBean.getUserNO());
			doQuery();
		}

	}
	@Test(dataProvider="ComplianceMaintain_CustomerPaymentLimitByCaseNO")
	public void testCheck(ComplianceMaintain_CustomerPaymentLimitBean ccplBean) {
		CustomerPaymentLimitPage.navigateTo(URL);
		wait.waitFor(500);
		doQueryForClickButton(ccplBean);
		CustomerPaymentLimitPage.clickCheck();
		wait.waitFor(2000);
		CustomerPaymentLimitPage.clickCheck_Close();
	}
	@Test(dataProvider="ComplianceMaintain_CustomerPaymentLimitByCaseNO")
	public void testUpdate(ComplianceMaintain_CustomerPaymentLimitBean ccplBean) {
		CustomerPaymentLimitPage.navigateTo(URL);
		wait.waitFor(500);
		doQueryForClickButton(ccplBean);
		CustomerPaymentLimitPage.clickUpdate();
		if(!ccplBean.getUserNO().equals("")) {
			CustomerPaymentLimitPage.setUpdate_UserNO(ccplBean.getUserNO());
		}
		if(!ccplBean.getUpdate_UserLv().equals("")) {
			CustomerPaymentLimitPage.selectUpdate_UserLv(ccplBean.getUpdate_UserLv());
		}
		if(!ccplBean.getUpdate_DayPaymentLimit().equals("")) {
			CustomerPaymentLimitPage.setUpdate_DayPaymentLimit(ccplBean.getUpdate_DayPaymentLimit());
		}
		if(!ccplBean.getUpdate_PaymentSystemRiskLimitMax().equals("")) {
			CustomerPaymentLimitPage.setUpdate_PaymentSystemRiskLimitMax(ccplBean.getUpdate_PaymentSystemRiskLimitMax());
		}
		if(!ccplBean.getUpdate_PaymentSystemRiskDailyLimit().equals("")) {
			CustomerPaymentLimitPage.setUpdate_PaymentSystemRiskDailyLimit(ccplBean.getUpdate_PaymentSystemRiskDailyLimit());
		}
		if(!ccplBean.getUpdate_MoneyType().equals("")) {
			CustomerPaymentLimitPage.selectUpdate_MoneyType(ccplBean.getUpdate_MoneyType());
		}
		if(!ccplBean.getUpdate_PayeeOrPaymentSign().equals("")) {
			CustomerPaymentLimitPage.selectUpdate_PayeeOrPaymentSign(ccplBean.getUpdate_PayeeOrPaymentSign());
		}
		wait.waitFor(1000);
//		CustomerPaymentLimitPage.clickUpdate_Submit();
//		System.out.println(CustomerPaymentLimitPage.getNotice());
//		Reporter.log(CustomerPaymentLimitPage.getNotice());
		CustomerPaymentLimitPage.clickUpdate_Close();
	}
	
	
	
	public void doQueryForClickButton(ComplianceMaintain_CustomerPaymentLimitBean ccplBean) {
		if(!ccplBean.getCustomerNO().equals("")) {
			CustomerPaymentLimitPage.setCustomerNO(ccplBean.getCustomerNO());
		}
		if(!ccplBean.getUserNO().equals("")) {
			CustomerPaymentLimitPage.setUserNO(ccplBean.getUserNO());
		}
		CustomerPaymentLimitPage.clickQuery();
		wait.waitFor(500);
		CustomerPaymentLimitPage.clickRadio(ccplBean.getRadio());
		wait.waitFor(500);
		
	}
	
}