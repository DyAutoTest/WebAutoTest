package com.dy.AutoTest.OperationPlatform.TestCases.OnlineRiskControl.RiskControlRuleManagement;

import java.lang.reflect.Method;

import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.dy.AutoTest.web.api.SuperTest;
import com.dy.AutoTest.OperationPlatform.PageObject.OnlineRiskControl.RiskControlRuleManagement.RiskTypeAndTradeCodeManagementPage;
import com.dy.AutoTest.OperationPlatform.POJO.RiskControlRuleManagement_RiskTypeAndTradeCodeManagementBean;
import com.dy.AutoTest.web.business.DataBusiness;

public class RiskTypeAndTradeCodeManagementPageTest extends SuperTest{
	RiskTypeAndTradeCodeManagementPage RiskTypeAndTradeCodeManagementPage;
	String URL;

	@BeforeClass
	public void init() {
		/******** instant objectPage *********/
		RiskTypeAndTradeCodeManagementPage=new RiskTypeAndTradeCodeManagementPage(driver);
		//RiskTypeAndTradeCodeManagementPage.setWaitTime(800);

		/******** set URL *********/
		URL=host.toString()+DataBusiness.getData_URL("pop_RiskControlRuleManagement_RiskTypeAndTradeCodeManagement");

		/******** instant Interface *********/
		iQuery=RiskTypeAndTradeCodeManagementPage;
//		iClickButton=RiskTypeAndTradeCodeManagementPage;
//		iClickRadio=RiskTypeAndTradeCodeManagementPage;
//		iSearchMerchantByNOorName=RiskTypeAndTradeCodeManagementPage;
	}

	@DataProvider(name="RiskControlRuleManagement_RiskTypeAndTradeCodeManagement")
	protected static Object[][] parametersPool(){
		data.loadDataBeanList("POP_Data_RiskControlRuleManagement_RiskTypeAndTradeCodeManagement");
		return data.getDataBeanArray();
	}

	@DataProvider(name="RiskControlRuleManagement_RiskTypeAndTradeCodeManagementByCaseNO")
	protected static Object[][] parametersPool(Method method){
		data.loadDataBeanList("POP_Data_RiskControlRuleManagement_RiskTypeAndTradeCodeManagement",method.getName());
		return data.getDataBeanArray();
	}

	@Test(dataProvider="RiskControlRuleManagement_RiskTypeAndTradeCodeManagementByCaseNO",description="运营平台-线上实时风控-风控类型与交易码维护-查询")
	public void testQuery(RiskControlRuleManagement_RiskTypeAndTradeCodeManagementBean rtatcmBean) {
		RiskTypeAndTradeCodeManagementPage.navigateTo(URL);
		wait.waitFor(500);

		if(!rtatcmBean.getTradeCode().equals("")) {
			RiskTypeAndTradeCodeManagementPage.setTradeCode(rtatcmBean.getTradeCode());
			doQuery();
		}
		if(!rtatcmBean.getRiskControlType().equals("")) {
			RiskTypeAndTradeCodeManagementPage.selectRiskControlType(rtatcmBean.getRiskControlType());
			doQuery();
		}
		if(!rtatcmBean.getModuleName().equals("")) {
			RiskTypeAndTradeCodeManagementPage.selectModuleName(rtatcmBean.getModuleName());
			doQuery();
		}
	}
	
	@Test(dataProvider="RiskControlRuleManagement_RiskTypeAndTradeCodeManagementByCaseNO",description="运营平台-线上实时风控-风控类型与交易码维护-查看详情")
	public void testCheck(RiskControlRuleManagement_RiskTypeAndTradeCodeManagementBean rtatcmBean) {
		RiskTypeAndTradeCodeManagementPage.navigateTo(URL);
		wait.waitFor(500);

		doQueryForClickButton(rtatcmBean);
		
		RiskTypeAndTradeCodeManagementPage.clickCheck();
		wait.waitFor(2000);
		RiskTypeAndTradeCodeManagementPage.clickCheck_Close();
	}
	
	@Test(dataProvider="RiskControlRuleManagement_RiskTypeAndTradeCodeManagementByCaseNO",description="运营平台-线上实时风控-风控类型与交易码维护-删除")
	public void testDelete(RiskControlRuleManagement_RiskTypeAndTradeCodeManagementBean rtatcmBean) {
		RiskTypeAndTradeCodeManagementPage.navigateTo(URL);
		wait.waitFor(500);

		doQueryForClickButton(rtatcmBean);
		
		RiskTypeAndTradeCodeManagementPage.clickDelete();
		wait.waitFor(1000);
//		RiskTypeAndTradeCodeManagementPage.clickDelete_Confirm();
//		System.out.println(RiskTypeAndTradeCodeManagementPage.getNotice());
//		Reporter.log(RiskTypeAndTradeCodeManagementPage.getNotice());
		RiskTypeAndTradeCodeManagementPage.clickDelete_Close();
	}
	
	@Test(dataProvider="RiskControlRuleManagement_RiskTypeAndTradeCodeManagementByCaseNO",description="运营平台-线上实时风控-风控类型与交易码维护-添加")
	public void testAdd(RiskControlRuleManagement_RiskTypeAndTradeCodeManagementBean rtatcmBean) {
		RiskTypeAndTradeCodeManagementPage.navigateTo(URL);
		wait.waitFor(500);

		RiskTypeAndTradeCodeManagementPage.clickAdd();
		wait.waitFor(500);
		RiskTypeAndTradeCodeManagementPage.setAdd_TradeCode(rtatcmBean.getTradeCode());
		RiskTypeAndTradeCodeManagementPage.setAdd_TradeName(rtatcmBean.getTradeName());
		RiskTypeAndTradeCodeManagementPage.setAdd_RiskControlTradeSubcode(rtatcmBean.getRiskControlTradeSubcode());
//		RiskTypeAndTradeCodeManagementPage.selectAdd_RiskControlType(rtatcmBean.getRiskControlType());
		wait.waitFor(2000);
//		RiskTypeAndTradeCodeManagementPage.clickAdd_Submit();
//		System.out.println(RiskTypeAndTradeCodeManagementPage.getNotice());
//		Reporter.log(RiskTypeAndTradeCodeManagementPage.getNotice());
		RiskTypeAndTradeCodeManagementPage.clickAdd_Close();
		testCheck(rtatcmBean);
	}
	
	@Test(dataProvider="RiskControlRuleManagement_RiskTypeAndTradeCodeManagementByCaseNO",description="运营平台-线上实时风控-风控类型与交易码维护-修改")
	public void testUpdate(RiskControlRuleManagement_RiskTypeAndTradeCodeManagementBean rtatcmBean) {
		RiskTypeAndTradeCodeManagementPage.navigateTo(URL);
		wait.waitFor(500);

		doQueryForClickButton(rtatcmBean);
		
		RiskTypeAndTradeCodeManagementPage.clickUpdate();
		wait.waitFor(500);
		RiskTypeAndTradeCodeManagementPage.setUpdate_TradeName(rtatcmBean.getUpdate_TradeName());
		wait.waitFor(2000);
//		RiskTypeAndTradeCodeManagementPage.clickUpdate_Submit();
//		System.out.println(RiskTypeAndTradeCodeManagementPage.getNotice());
//		Reporter.log(RiskTypeAndTradeCodeManagementPage.getNotice());
		RiskTypeAndTradeCodeManagementPage.clickUpdate_Close();
		testCheck(rtatcmBean);
	}
	
	public void doQueryForClickButton(RiskControlRuleManagement_RiskTypeAndTradeCodeManagementBean rtatcmBean) {
		if(!rtatcmBean.getTradeCode().equals("")) {
			RiskTypeAndTradeCodeManagementPage.setTradeCode(rtatcmBean.getTradeCode());
		}
		if(!rtatcmBean.getRiskControlType().equals("")) {
			RiskTypeAndTradeCodeManagementPage.selectRiskControlType(rtatcmBean.getRiskControlType());
		}
		if(!rtatcmBean.getModuleName().equals("")) {
			RiskTypeAndTradeCodeManagementPage.selectModuleName(rtatcmBean.getModuleName());
		}
		RiskTypeAndTradeCodeManagementPage.clickQuery();
		wait.waitFor(500);
		RiskTypeAndTradeCodeManagementPage.clickRadio(rtatcmBean.getRadio());
		wait.waitFor(500);
	}
}