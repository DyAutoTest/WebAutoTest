package com.dy.AutoTest.OperationPlatform.TestCases.OnlineRiskControl.RiskControlParamManagement;

import java.lang.reflect.Method;

import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.dy.AutoTest.web.api.SuperTest;
import com.dy.AutoTest.OperationPlatform.PageObject.OnlineRiskControl.RiskControlParamManagement.AccountBalanceParamMaintainPage;
import com.dy.AutoTest.OperationPlatform.POJO.RiskControlParamManagement_AccountBalanceParamMaintainBean;
import com.dy.AutoTest.web.business.DataBusiness;

public class AccountBalanceParamMaintainPageTest extends SuperTest{
	AccountBalanceParamMaintainPage AccountBalanceParamMaintainPage;
	String URL;

	@BeforeClass
	public void init() {
		/******** instant objectPage *********/
		AccountBalanceParamMaintainPage=new AccountBalanceParamMaintainPage(driver);
		//AccountBalanceParamMaintainPage.setWaitTime(800);

		/******** set URL *********/
		URL=host.toString()+DataBusiness.getData_URL("pop_RiskControlParamManagement_AccountBalanceParamMaintain");

		/******** instant Interface *********/
		iQuery=AccountBalanceParamMaintainPage;
//		iClickButton=AccountBalanceParamMaintainPage;
//		iClickRadio=AccountBalanceParamMaintainPage;
//		iSearchMerchant=AccountBalanceParamMaintainPage;
	}

	@DataProvider(name="RiskControlParamManagement_AccountBalanceParamMaintain")
	protected static Object[][] parametersPool(){
		data.loadDataBeanList("POP_Data_RiskControlParamManagement_AccountBalanceParamMaintain");
		return data.getDataBeanArray();
	}

	@DataProvider(name="RiskControlParamManagement_AccountBalanceParamMaintainByCaseNO")
	protected static Object[][] parametersPool(Method method){
		data.loadDataBeanList("POP_Data_RiskControlParamManagement_AccountBalanceParamMaintain",method.getName());
		return data.getDataBeanArray();
	}

	@Test(dataProvider="RiskControlParamManagement_AccountBalanceParamMaintainByCaseNO")
	public void testQuery(RiskControlParamManagement_AccountBalanceParamMaintainBean rabpmBean) {
		AccountBalanceParamMaintainPage.navigateTo(URL);
		wait.waitFor(500);

		if(!rabpmBean.getAccountType().equals("")) {
			AccountBalanceParamMaintainPage.selectAccountType(rabpmBean.getAccountType());
			doQuery();
		}
		if(!rabpmBean.getMoneyType().equals("")) {
			AccountBalanceParamMaintainPage.selectMoneyType(rabpmBean.getMoneyType());
			doQuery();
		}
		if(!rabpmBean.getRealNameSign().equals("")) {
			AccountBalanceParamMaintainPage.selectRealNameSign(rabpmBean.getRealNameSign());
			doQuery();
		}
	}
	
	
	@Test(dataProvider="RiskControlParamManagement_AccountBalanceParamMaintainByCaseNO")
	public void testCheck(RiskControlParamManagement_AccountBalanceParamMaintainBean rabpmBean) {
		AccountBalanceParamMaintainPage.navigateTo(URL);
		wait.waitFor(500);
		
		doQueryForClickButton(rabpmBean);
		
		AccountBalanceParamMaintainPage.clickCheck();
		wait.waitFor(2000);
		AccountBalanceParamMaintainPage.clickCheck_Close();
	}
	
	
	@Test(dataProvider="RiskControlParamManagement_AccountBalanceParamMaintainByCaseNO")
	public void testDelete(RiskControlParamManagement_AccountBalanceParamMaintainBean rabpmBean) {
		AccountBalanceParamMaintainPage.navigateTo(URL);
		wait.waitFor(500);
		
		doQueryForClickButton(rabpmBean);
		
		AccountBalanceParamMaintainPage.clickDelete();
		wait.waitFor(1000);
//		AccountBalanceParamMaintainPage.clickDelete_Confirm();
//		System.out.println(AccountBalanceParamMaintainPage.getNotice());
//		Reporter.log(AccountBalanceParamMaintainPage.getNotice());
		AccountBalanceParamMaintainPage.clickDelete_Close();
	}
	
	
	@Test(dataProvider="RiskControlParamManagement_AccountBalanceParamMaintainByCaseNO")
	public void testUpdate(RiskControlParamManagement_AccountBalanceParamMaintainBean rabpmBean) {
		AccountBalanceParamMaintainPage.navigateTo(URL);
		wait.waitFor(500);
		
		doQueryForClickButton(rabpmBean);
		
		AccountBalanceParamMaintainPage.clickUpdate();
		wait.waitFor(1000);
		AccountBalanceParamMaintainPage.selectUpdate_AccountType(rabpmBean.getUpdate_AccountType());
		AccountBalanceParamMaintainPage.selectUpdate_MoneyType(rabpmBean.getUpdate_MoneyType());
		AccountBalanceParamMaintainPage.selectUpdate_RealNameSign(rabpmBean.getUpdate_RealNameSign());
		AccountBalanceParamMaintainPage.setUpdate_MaxBalanceLimit(rabpmBean.getUpdate_MaxBalanceLimit());
		wait.waitFor(2000);
//		AccountBalanceParamMaintainPage.clickUpdate_Submit();
//		System.out.println(AccountBalanceParamMaintainPage.getNotice());
//		Reporter.log(AccountBalanceParamMaintainPage.getNotice());
		AccountBalanceParamMaintainPage.clickUpdate_Close();
	}
	
	@Test(dataProvider="RiskControlParamManagement_AccountBalanceParamMaintainByCaseNO")
	public void testAdd(RiskControlParamManagement_AccountBalanceParamMaintainBean rabpmBean) {
		AccountBalanceParamMaintainPage.navigateTo(URL);
		wait.waitFor(500);
		
		AccountBalanceParamMaintainPage.clickAdd();
		wait.waitFor(1000);
		AccountBalanceParamMaintainPage.selectAdd_AccountType(rabpmBean.getAccountType());
		AccountBalanceParamMaintainPage.selectAdd_MoneyType(rabpmBean.getMoneyType());
		AccountBalanceParamMaintainPage.selectAdd_RealNameSign(rabpmBean.getRealNameSign());
		AccountBalanceParamMaintainPage.setAdd_MaxBalanceLimit(rabpmBean.getMaxBalanceLimit());
		wait.waitFor(2000);
//		AccountBalanceParamMaintainPage.clickAdd_Submit();
//		System.out.println(AccountBalanceParamMaintainPage.getNotice());
//		Reporter.log(AccountBalanceParamMaintainPage.getNotice());
		AccountBalanceParamMaintainPage.clickAdd_Close();
	}
	
	
	public void doQueryForClickButton(RiskControlParamManagement_AccountBalanceParamMaintainBean rabpmBean) {
		if(!rabpmBean.getAccountType().equals("")) {
			AccountBalanceParamMaintainPage.selectAccountType(rabpmBean.getAccountType());
		}
		if(!rabpmBean.getMoneyType().equals("")) {
			AccountBalanceParamMaintainPage.selectMoneyType(rabpmBean.getMoneyType());
		}
		if(!rabpmBean.getRealNameSign().equals("")) {
			AccountBalanceParamMaintainPage.selectRealNameSign(rabpmBean.getRealNameSign());
		}
		AccountBalanceParamMaintainPage.clickQuery();
		wait.waitFor(500);
		AccountBalanceParamMaintainPage.clickRadio(rabpmBean.getRadio());
		wait.waitFor(500);
	}
	
}