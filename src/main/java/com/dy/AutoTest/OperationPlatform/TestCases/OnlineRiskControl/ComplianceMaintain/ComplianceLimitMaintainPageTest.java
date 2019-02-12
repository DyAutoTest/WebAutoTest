package com.dy.AutoTest.OperationPlatform.TestCases.OnlineRiskControl.ComplianceMaintain;

import java.lang.reflect.Method;

import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.dy.AutoTest.web.api.SuperTest;
import com.dy.AutoTest.OperationPlatform.PageObject.OnlineRiskControl.ComplianceMaintain.ComplianceLimitMaintainPage;
import com.dy.AutoTest.OperationPlatform.POJO.ComplianceMaintain_ComplianceLimitMaintainBean;
import com.dy.AutoTest.web.business.DataBusiness;

public class ComplianceLimitMaintainPageTest extends SuperTest{
	ComplianceLimitMaintainPage ComplianceLimitMaintainPage;
	String URL;

	@BeforeClass
	public void init() {
		/******** instant objectPage *********/
		ComplianceLimitMaintainPage=new ComplianceLimitMaintainPage(driver);
		//ComplianceLimitMaintainPage.setWaitTime(800);

		/******** set URL *********/
		URL=host.toString()+DataBusiness.getData_URL("pop_ComplianceMaintain_ComplianceLimitMaintain");

		/******** instant Interface *********/
		iQuery=ComplianceLimitMaintainPage;
//	iClickButton=ComplianceLimitMaintainPage;
//	iClickRadio=ComplianceLimitMaintainPage;
//	iSearchMerchant=ComplianceLimitMaintainPage;
	}

	@DataProvider(name="ComplianceMaintain_ComplianceLimitMaintain")
	protected static Object[][] parametersPool(){
		data.loadDataBeanList("POP_Data_ComplianceMaintain_ComplianceLimitMaintain");
		return data.getDataBeanArray();
	}

	@DataProvider(name="ComplianceMaintain_ComplianceLimitMaintainByCaseNO")
	protected static Object[][] parametersPool(Method method){
		data.loadDataBeanList("POP_Data_ComplianceMaintain_ComplianceLimitMaintain",method.getName());
		return data.getDataBeanArray();
	}

	@Test(dataProvider="ComplianceMaintain_ComplianceLimitMaintainByCaseNO")
	public void testQuery(ComplianceMaintain_ComplianceLimitMaintainBean cclmBean) {
		ComplianceLimitMaintainPage.navigateTo(URL);
		wait.waitFor(500);
//		if(!cclmBean.getUserLv().equals("")) {
//			ComplianceLimitMaintainPage.selectUserLv(cclmBean.getUserLv());
			doQuery();
//		}
	}
	
	@Test(dataProvider="ComplianceMaintain_ComplianceLimitMaintainByCaseNO")
	public void testCheck(ComplianceMaintain_ComplianceLimitMaintainBean cclmBean) {
		ComplianceLimitMaintainPage.navigateTo(URL);
		wait.waitFor(500);
		doQueryForClickButton(cclmBean);
		ComplianceLimitMaintainPage.clickCheck();
		wait.waitFor(2000);
		ComplianceLimitMaintainPage.clickCheck_Close();
	}
	
	@Test(dataProvider="ComplianceMaintain_ComplianceLimitMaintainByCaseNO")
	public void testDelete(ComplianceMaintain_ComplianceLimitMaintainBean cclmBean) {
		ComplianceLimitMaintainPage.navigateTo(URL);
		wait.waitFor(500);
		doQueryForClickButton(cclmBean);
		ComplianceLimitMaintainPage.clickDelete();
		wait.waitFor(2000);
//		ComplianceLimitMaintainPage.clickDelete_Confirm();
//		System.out.println(ComplianceLimitMaintainPage.getNotice());
//		Reporter.log(ComplianceLimitMaintainPage.getNotice());
		ComplianceLimitMaintainPage.clickDelete_Close();
	}
	
	@Test(dataProvider="ComplianceMaintain_ComplianceLimitMaintainByCaseNO")
	public void testUpdate(ComplianceMaintain_ComplianceLimitMaintainBean cclmBean) {
		ComplianceLimitMaintainPage.navigateTo(URL);
		wait.waitFor(500);
		doQueryForClickButton(cclmBean);
		ComplianceLimitMaintainPage.clickUpdate();
		wait.waitFor(2000);
		if(!cclmBean.getUpdate_YearLimitMoney().equals("")) {
			ComplianceLimitMaintainPage.setUpdate_YearLimitMoney(cclmBean.getUpdate_YearLimitMoney());
		}
		wait.waitFor(500);
		if(!cclmBean.getUpdate_PayeeOrPayerSign().equals("")) {
			ComplianceLimitMaintainPage.selectUpdate_PayeeOrPayerSign(cclmBean.getUpdate_PayeeOrPayerSign());
		}
		wait.waitFor(500);
		if(!cclmBean.getUpdate_AccountType().equals("")) {
			ComplianceLimitMaintainPage.selectUpdate_AccountType(cclmBean.getUpdate_AccountType());
		}
//		ComplianceLimitMaintainPage.clickUpdate_Submit();
//		System.out.println(ComplianceLimitMaintainPage.getNotice());
//		Reporter.log(ComplianceLimitMaintainPage.getNotice());
		ComplianceLimitMaintainPage.clickUpdate_Close();
	}
	
	@Test(dataProvider="ComplianceMaintain_ComplianceLimitMaintainByCaseNO")
	public void testAdd(ComplianceMaintain_ComplianceLimitMaintainBean cclmBean) {
		ComplianceLimitMaintainPage.navigateTo(URL);
		wait.waitFor(500);
		ComplianceLimitMaintainPage.clickAdd();
		wait.waitFor(2000);
		if(!cclmBean.getOrgnizationCode().equals("")) 
			ComplianceLimitMaintainPage.setAdd_OrgnizationCode(cclmBean.getOrgnizationCode());
		wait.waitFor(500);
		if(!cclmBean.getUserLv().equals("")) 
			ComplianceLimitMaintainPage.selectAdd_UserLv(cclmBean.getUserLv());
		wait.waitFor(500);
		if(!cclmBean.getYearLimitMoney().equals("")) 
			ComplianceLimitMaintainPage.setAdd_YearLimitMoney(cclmBean.getYearLimitMoney());
		wait.waitFor(500);
		if(!cclmBean.getPaymentOrgnizationLv().equals("")) 
			ComplianceLimitMaintainPage.selectAdd_PaymentOrgnizationLv(cclmBean.getPaymentOrgnizationLv());
		wait.waitFor(500);
		if(!cclmBean.getPayeeOrPaymentSign().equals("")) 
			ComplianceLimitMaintainPage.selectAdd_PayeeOrPaymentSign(cclmBean.getPayeeOrPaymentSign());
		wait.waitFor(500);
		if(!cclmBean.getAccountType().equals("")) 
			ComplianceLimitMaintainPage.selectAdd_AccountType(cclmBean.getAccountType());
//		ComplianceLimitMaintainPage.clickAdd_Submit();
//		System.out.println(ComplianceLimitMaintainPage.getNotice());
//		Reporter.log(ComplianceLimitMaintainPage.getNotice());
		ComplianceLimitMaintainPage.clickAdd_Close();
	}
	
	
	
	
	public void doQueryForClickButton(ComplianceMaintain_ComplianceLimitMaintainBean cclmBean) {
		cclmBean.getPaymentOrgnizationLv();
		
		if(!cclmBean.getUserLv().equals("")) {
			ComplianceLimitMaintainPage.selectUserLv(cclmBean.getUserLv());
		}
		ComplianceLimitMaintainPage.clickQuery();
		wait.waitFor(500);
		ComplianceLimitMaintainPage.clickRadio(cclmBean.getRadio());
		wait.waitFor(500);
	}
	
	
}