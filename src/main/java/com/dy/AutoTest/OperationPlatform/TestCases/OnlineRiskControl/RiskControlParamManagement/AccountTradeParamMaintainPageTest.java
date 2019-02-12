package com.dy.AutoTest.OperationPlatform.TestCases.OnlineRiskControl.RiskControlParamManagement;

import java.lang.reflect.Method;

import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.dy.AutoTest.web.api.SuperTest;
import com.dy.AutoTest.OperationPlatform.PageObject.OnlineRiskControl.RiskControlParamManagement.AccountTradeParamMaintainPage;
import com.dy.AutoTest.OperationPlatform.POJO.RiskControlParamManagement_AccountTradeParamMaintainBean;
import com.dy.AutoTest.web.business.DataBusiness;

public class AccountTradeParamMaintainPageTest extends SuperTest{
	AccountTradeParamMaintainPage AccountTradeParamMaintainPage;
	String URL;

	@BeforeClass
	public void init() {
		/******** instant objectPage *********/
		AccountTradeParamMaintainPage=new AccountTradeParamMaintainPage(driver);
		//AccountTradeParamMaintainPage.setWaitTime(800);

		/******** set URL *********/
		URL=host.toString()+DataBusiness.getData_URL("pop_RiskControlParamManagement_AccountTradeParamMaintain");

		/******** instant Interface *********/
		iQuery=AccountTradeParamMaintainPage;
//		iClickButton=AccountTradeParamMaintainPage;
//		iClickRadio=AccountTradeParamMaintainPage;
//		iSearchMerchant=AccountTradeParamMaintainPage;
	}

	@DataProvider(name="RiskControlParamManagement_AccountTradeParamMaintain")
	protected static Object[][] parametersPool(){
		data.loadDataBeanList("POP_Data_RiskControlParamManagement_AccountTradeParamMaintain");
		return data.getDataBeanArray();
	}

	@DataProvider(name="RiskControlParamManagement_AccountTradeParamMaintainByCaseNO")
	protected static Object[][] parametersPool(Method method){
		data.loadDataBeanList("POP_Data_RiskControlParamManagement_AccountTradeParamMaintain",method.getName());
		return data.getDataBeanArray();
	}

	@Test(dataProvider="RiskControlParamManagement_AccountTradeParamMaintainByCaseNO")
	public void testQuery(RiskControlParamManagement_AccountTradeParamMaintainBean ratpmBean) {
		AccountTradeParamMaintainPage.navigateTo(URL);
		wait.waitFor(500);
		
		if(!ratpmBean.getAccountType().equals("")) {
			AccountTradeParamMaintainPage.selectAccountType(ratpmBean.getAccountType());
			doQuery();
		}
		if(!ratpmBean.getMoneyType().equals("")) {
			AccountTradeParamMaintainPage.selectMoneyType(ratpmBean.getMoneyType());
			doQuery();
		}
		if(!ratpmBean.getBusinessType().equals("")) {
			AccountTradeParamMaintainPage.selectBusinessType(ratpmBean.getBusinessType());
			doQuery();
		}
		if(!ratpmBean.getTradeType().equals("")) {
			AccountTradeParamMaintainPage.selectTradeType(ratpmBean.getTradeType());
			doQuery();
		}
	}
	
	
	@Test(dataProvider="RiskControlParamManagement_AccountTradeParamMaintainByCaseNO")
	public void testCheck(RiskControlParamManagement_AccountTradeParamMaintainBean ratpmBean) {
		AccountTradeParamMaintainPage.navigateTo(URL);
		wait.waitFor(500);
		
		doQueryForClickButton(ratpmBean);
		
		AccountTradeParamMaintainPage.clickCheck();
		wait.waitFor(2000);
		AccountTradeParamMaintainPage.clickCheck_Close();
	}
	
	
	@Test(dataProvider="RiskControlParamManagement_AccountTradeParamMaintainByCaseNO")
	public void testDelete(RiskControlParamManagement_AccountTradeParamMaintainBean ratpmBean) {
		AccountTradeParamMaintainPage.navigateTo(URL);
		wait.waitFor(500);
		
		doQueryForClickButton(ratpmBean);
		
		AccountTradeParamMaintainPage.clickDelete();
		wait.waitFor(1000);
//		AccountTradeParamMaintainPage.clickDelete_Confirm();
//		System.out.println(AccountTradeParamMaintainPage.getNotice());
//		Reporter.log(AccountTradeParamMaintainPage.getNotice());
		AccountTradeParamMaintainPage.clickDelete_Close();
	}
	
	
	@Test(dataProvider="RiskControlParamManagement_AccountTradeParamMaintainByCaseNO")
	public void testUpdate(RiskControlParamManagement_AccountTradeParamMaintainBean ratpmBean) {
		AccountTradeParamMaintainPage.navigateTo(URL);
		wait.waitFor(500);
		
		doQueryForClickButton(ratpmBean);
		
		AccountTradeParamMaintainPage.clickUpdate();
		wait.waitFor(1000);
		AccountTradeParamMaintainPage.setUpdate_SingleMaxMoney(ratpmBean.getSingleMaxMoney());
		AccountTradeParamMaintainPage.setUpdate_SingleMinMoney(ratpmBean.getSingleMinMoney());
		AccountTradeParamMaintainPage.setUpdate_DayLimitMoney(ratpmBean.getDayLimitMoney());
		AccountTradeParamMaintainPage.setUpdate_DayPaymentTimes(ratpmBean.getDayPaymentTimes());
		AccountTradeParamMaintainPage.setUpdate_MonthLimitMoney(ratpmBean.getMonthLimitMoney());
		AccountTradeParamMaintainPage.setUpdate_MonthPaymentTimes(ratpmBean.getMonthPaymentTimes());
//		AccountTradeParamMaintainPage.clickUpdate_Submit();
//		System.out.println(AccountTradeParamMaintainPage.getNotice());
//		Reporter.log(AccountTradeParamMaintainPage.getNotice());
		AccountTradeParamMaintainPage.clickUpdate_Close();
	}
	
	@Test(dataProvider="RiskControlParamManagement_AccountTradeParamMaintainByCaseNO")
	public void testAdd(RiskControlParamManagement_AccountTradeParamMaintainBean ratpmBean) {
		AccountTradeParamMaintainPage.navigateTo(URL);
		wait.waitFor(500);
		
		
		AccountTradeParamMaintainPage.clickAdd();
		wait.waitFor(1000);
		AccountTradeParamMaintainPage.selectAdd_AccountType(ratpmBean.getAccountType());
		AccountTradeParamMaintainPage.selectAdd_MoneyType(ratpmBean.getMoneyType());
		AccountTradeParamMaintainPage.selectAdd_TradeType(ratpmBean.getTradeType());
		AccountTradeParamMaintainPage.selectAdd_BusinessType(ratpmBean.getBusinessType());
		AccountTradeParamMaintainPage.selectAdd_RealNameSign(ratpmBean.getRealNameSign());
		AccountTradeParamMaintainPage.selectAdd_PaymentCollectionSign(ratpmBean.getPaymentCollectionSign());
		AccountTradeParamMaintainPage.selectAdd_LimitLevel(ratpmBean.getLimitLevel());
		AccountTradeParamMaintainPage.selectAdd_BusinessAcceptChannel(ratpmBean.getBusinessAcceptChannel());
		
		AccountTradeParamMaintainPage.setAdd_SingleMaxMoney(ratpmBean.getSingleMaxMoney());
		AccountTradeParamMaintainPage.setAdd_SingleMinMoney(ratpmBean.getSingleMinMoney());
		AccountTradeParamMaintainPage.setAdd_DayLimitMoney(ratpmBean.getDayLimitMoney());
		AccountTradeParamMaintainPage.setAdd_DayPaymentTimes(ratpmBean.getDayPaymentTimes());
		AccountTradeParamMaintainPage.setAdd_MonthLimitMoney(ratpmBean.getMonthLimitMoney());
		AccountTradeParamMaintainPage.setAdd_MonthPaymentTimes(ratpmBean.getMonthPaymentTimes());
//		AccountTradeParamMaintainPage.clickAdd_Submit();
//		System.out.println(AccountTradeParamMaintainPage.getNotice());
//		Reporter.log(AccountTradeParamMaintainPage.getNotice());
		AccountTradeParamMaintainPage.clickAdd_Close();
	}
	
	
	public void doQueryForClickButton(RiskControlParamManagement_AccountTradeParamMaintainBean ratpmBean) {
		if(!ratpmBean.getAccountType().equals("")) {
			AccountTradeParamMaintainPage.selectAccountType(ratpmBean.getAccountType());
		}
		if(!ratpmBean.getMoneyType().equals("")) {
			AccountTradeParamMaintainPage.selectMoneyType(ratpmBean.getMoneyType());
		}
		if(!ratpmBean.getBusinessType().equals("")) {
			AccountTradeParamMaintainPage.selectBusinessType(ratpmBean.getBusinessType());
		}
		if(!ratpmBean.getTradeType().equals("")) {
			AccountTradeParamMaintainPage.selectTradeType(ratpmBean.getTradeType());
		}
		AccountTradeParamMaintainPage.clickQuery();
		wait.waitFor(500);
		AccountTradeParamMaintainPage.clickRadio(ratpmBean.getRadio());
		wait.waitFor(500);
	}
}