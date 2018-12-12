package com.dy.AutoTest.OperationPlatform.TestCases.OnlineRiskControl.RiskControlParamManagement;

import java.lang.reflect.Method;

import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.dy.AutoTest.web.api.SuperTest;
import com.dy.AutoTest.OperationPlatform.PageObject.OnlineRiskControl.RiskControlParamManagement.AccountApproveParamMaintainPage;
import com.dy.AutoTest.OperationPlatform.POJO.RiskControlParamManagement_AccountApproveParamMaintainBean;
import com.dy.AutoTest.web.business.DataBusiness;

public class AccountApproveParamMaintainPageTest extends SuperTest{
	AccountApproveParamMaintainPage AccountApproveParamMaintainPage;
	String URL;

	@BeforeClass
	public void init() {
		/******** instant objectPage *********/
		AccountApproveParamMaintainPage=new AccountApproveParamMaintainPage(driver);
		//AccountApproveParamMaintainPage.setWaitTime(800);

		/******** set URL *********/
		URL=host.toString()+DataBusiness.getData_URL("pop_RiskControlParamManagement_AccountApproveParamMaintain");

		/******** instant Interface *********/
		iQuery=AccountApproveParamMaintainPage;
//		iClickButton=AccountApproveParamMaintainPage;
//		iClickRadio=AccountApproveParamMaintainPage;
//		iSearchMerchantByNOorName=AccountApproveParamMaintainPage;
	}

	@DataProvider(name="RiskControlParamManagement_AccountApproveParamMaintain")
	protected static Object[][] parametersPool(){
		data.loadDataBeanList("POP_Data_RiskControlParamManagement_AccountApproveParamMaintain");
		return data.getDataBeanArray();
	}

	@DataProvider(name="RiskControlParamManagement_AccountApproveParamMaintainByCaseNO")
	protected static Object[][] parametersPool(Method method){
		data.loadDataBeanList("POP_Data_RiskControlParamManagement_AccountApproveParamMaintain",method.getName());
		return data.getDataBeanArray();
	}

	@Test(dataProvider="RiskControlParamManagement_AccountApproveParamMaintainByCaseNO")
	public void testQuery(RiskControlParamManagement_AccountApproveParamMaintainBean raapmBean) {
		AccountApproveParamMaintainPage.navigateTo(URL);
		wait.waitFor(500);
		AccountApproveParamMaintainPage.clickAdvance();
		wait.waitFor(500);
		
		if(!raapmBean.getAccountType().equals("")) {
			AccountApproveParamMaintainPage.selectAccountType(raapmBean.getAccountType());
			doQuery();
		}
		if(!raapmBean.getMoneyType().equals("")) {
			AccountApproveParamMaintainPage.selectMoneyType(raapmBean.getMoneyType());
			doQuery();
		}
		if(!raapmBean.getBusinessType().equals("")) {
			AccountApproveParamMaintainPage.selectBusinessType(raapmBean.getBusinessType());
			doQuery();
		}
		if(!raapmBean.getTradeType().equals("")) {
			AccountApproveParamMaintainPage.selectTradeType(raapmBean.getTradeType());
			doQuery();
		}
		if(!raapmBean.getLevelLimit().equals("")) {
			AccountApproveParamMaintainPage.selectLevelLimit(raapmBean.getLevelLimit());
			doQuery();
		}
	}
	
	
	@Test(dataProvider="RiskControlParamManagement_AccountApproveParamMaintainByCaseNO")
	public void testCheck(RiskControlParamManagement_AccountApproveParamMaintainBean raapmBean) {
		AccountApproveParamMaintainPage.navigateTo(URL);
		wait.waitFor(500);
		AccountApproveParamMaintainPage.clickAdvance();
		wait.waitFor(500);
		
		doQueryForClickButton(raapmBean);
		
		AccountApproveParamMaintainPage.clickAdvance();
		wait.waitFor(500);
		AccountApproveParamMaintainPage.clickCheck();
		wait.waitFor(2000);
		AccountApproveParamMaintainPage.clickCheck_Close();
	}
	
	
	@Test(dataProvider="RiskControlParamManagement_AccountApproveParamMaintainByCaseNO")
	public void testDelete(RiskControlParamManagement_AccountApproveParamMaintainBean raapmBean) {
		AccountApproveParamMaintainPage.navigateTo(URL);
		wait.waitFor(500);
		AccountApproveParamMaintainPage.clickAdvance();
		wait.waitFor(500);
		
		doQueryForClickButton(raapmBean);
		
		AccountApproveParamMaintainPage.clickAdvance();
		wait.waitFor(500);
		AccountApproveParamMaintainPage.clickDelete();
		wait.waitFor(1000);
//		AccountApproveParamMaintainPage.clickDelete_Confirm();
//		System.out.println(AccountApproveParamMaintainPage.getNotice());
//		Reporter.log(AccountApproveParamMaintainPage.getNotice());
		AccountApproveParamMaintainPage.clickDelete_Close();
		testCheck(raapmBean);
	}
	
	
	@Test(dataProvider="RiskControlParamManagement_AccountApproveParamMaintainByCaseNO")
	public void testUpdate(RiskControlParamManagement_AccountApproveParamMaintainBean raapmBean) {
		AccountApproveParamMaintainPage.navigateTo(URL);
		wait.waitFor(500);
		AccountApproveParamMaintainPage.clickAdvance();
		wait.waitFor(500);
		
		doQueryForClickButton(raapmBean);
		
		AccountApproveParamMaintainPage.clickAdvance();
		wait.waitFor(500);
		AccountApproveParamMaintainPage.clickUpdate();
		wait.waitFor(1000);
		AccountApproveParamMaintainPage.setUpdate_SingleApproveLimit(raapmBean.getSingleApproveLimit());
		AccountApproveParamMaintainPage.setUpdate_DayApproveLimit(raapmBean.getDayApproveLimit());
		AccountApproveParamMaintainPage.setUpdate_DayApproveTimes(raapmBean.getDayApproveTimes());
		AccountApproveParamMaintainPage.setUpdate_MonthApproveLimit(raapmBean.getMonthApproveLimit());
		AccountApproveParamMaintainPage.setUpdate_MonthApproveTimes(raapmBean.getMonthApproveTimes());
		wait.waitFor(2000);
//		AccountApproveParamMaintainPage.clickUpdate_Submit();
//		System.out.println(AccountApproveParamMaintainPage.getNotice());
//		Reporter.log(AccountApproveParamMaintainPage.getNotice());
		AccountApproveParamMaintainPage.clickUpdate_Close();
		testCheck(raapmBean);
	}
	
	
	@Test(dataProvider="RiskControlParamManagement_AccountApproveParamMaintainByCaseNO")
	public void testAdd(RiskControlParamManagement_AccountApproveParamMaintainBean raapmBean) {
		AccountApproveParamMaintainPage.navigateTo(URL);
		wait.waitFor(500);
		
		AccountApproveParamMaintainPage.clickAdd();
		wait.waitFor(1000);
		AccountApproveParamMaintainPage.selectAdd_AccountType(raapmBean.getAccountType());
		AccountApproveParamMaintainPage.selectAdd_MoneyType(raapmBean.getMoneyType());
		AccountApproveParamMaintainPage.selectAdd_TradeType(raapmBean.getTradeType());
		AccountApproveParamMaintainPage.selectAdd_BusinessType(raapmBean.getBusinessType());
		AccountApproveParamMaintainPage.selectAdd_LimitLevel(raapmBean.getLevelLimit());
		
		AccountApproveParamMaintainPage.setAdd_SingleApproveLimit(raapmBean.getSingleApproveLimit());
		AccountApproveParamMaintainPage.setAdd_DayApproveLimit(raapmBean.getDayApproveLimit());
		AccountApproveParamMaintainPage.setAdd_DayApproveTimes(raapmBean.getDayApproveTimes());
		AccountApproveParamMaintainPage.setAdd_MonthApproveLimit(raapmBean.getMonthApproveLimit());
		AccountApproveParamMaintainPage.setAdd_MonthApproveTimes(raapmBean.getMonthApproveTimes());
		wait.waitFor(2000);
//		AccountApproveParamMaintainPage.clickAdd_Submit();
//		System.out.println(AccountApproveParamMaintainPage.getNotice());
//		Reporter.log(AccountApproveParamMaintainPage.getNotice());
		AccountApproveParamMaintainPage.clickAdd_Close();
		testCheck(raapmBean);
	}
	
	
	public void doQueryForClickButton(RiskControlParamManagement_AccountApproveParamMaintainBean raapmBean) {
		if(!raapmBean.getAccountType().equals("")) {
			AccountApproveParamMaintainPage.selectAccountType(raapmBean.getAccountType());
		}
		if(!raapmBean.getMoneyType().equals("")) {
			AccountApproveParamMaintainPage.selectMoneyType(raapmBean.getMoneyType());
		}
		if(!raapmBean.getBusinessType().equals("")) {
			AccountApproveParamMaintainPage.selectBusinessType(raapmBean.getBusinessType());
		}
		if(!raapmBean.getTradeType().equals("")) {
			AccountApproveParamMaintainPage.selectTradeType(raapmBean.getTradeType());
		}
		if(!raapmBean.getLevelLimit().equals("")) {
			AccountApproveParamMaintainPage.selectLevelLimit(raapmBean.getLevelLimit());
		}
		AccountApproveParamMaintainPage.clickQuery();
		wait.waitFor(500);
		AccountApproveParamMaintainPage.clickRadio(raapmBean.getRadio());
		wait.waitFor(500);
	}
	
}