package com.dy.AutoTest.OperationPlatform.TestCases.OnlineRiskControl.RiskControlRuleManagement;

import java.lang.reflect.Method;

import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.dy.AutoTest.web.api.SuperTest;
import com.dy.AutoTest.OperationPlatform.PageObject.OnlineRiskControl.RiskControlRuleManagement.RiskControlTypeCorrespondingRulesManagementPage;
import com.dy.AutoTest.OperationPlatform.POJO.RiskControlRuleManagement_RiskControlTypeCorrespondingRulesManagementBean;
import com.dy.AutoTest.web.business.DataBusiness;

public class RiskControlTypeCorrespondingRulesManagementPageTest extends SuperTest{
	RiskControlTypeCorrespondingRulesManagementPage RiskControlTypeCorrespondingRulesManagementPage;
	String URL;

	@BeforeClass
	public void init() {
		/******** instant objectPage *********/
		RiskControlTypeCorrespondingRulesManagementPage=new RiskControlTypeCorrespondingRulesManagementPage(driver);
		//RiskControlTypeCorrespondingRulesManagementPage.setWaitTime(800);

		/******** set URL *********/
		URL=host.toString()+DataBusiness.getData_URL("pop_RiskControlRuleManagement_RiskControlTypeCorrespondingRulesManagement");

		/******** instant Interface *********/
		iQuery=RiskControlTypeCorrespondingRulesManagementPage;
//		iClickButton=RiskControlTypeCorrespondingRulesManagementPage;
//		iClickRadio=RiskControlTypeCorrespondingRulesManagementPage;
//		iSearchMerchant=RiskControlTypeCorrespondingRulesManagementPage;
	}

	@DataProvider(name="RiskControlRuleManagement_RiskControlTypeCorrespondingRulesManagement")
	protected static Object[][] parametersPool(){
		data.loadDataBeanList("POP_Data_RiskControlRuleManagement_RiskControlTypeCorrespondingRulesManagement");
		return data.getDataBeanArray();
	}

	@DataProvider(name="RiskControlRuleManagement_RiskControlTypeCorrespondingRulesManagementByCaseNO")
	protected static Object[][] parametersPool(Method method){
		data.loadDataBeanList("POP_Data_RiskControlRuleManagement_RiskControlTypeCorrespondingRulesManagement",method.getName());
		return data.getDataBeanArray();
	}

	@Test(dataProvider="RiskControlRuleManagement_RiskControlTypeCorrespondingRulesManagementByCaseNO",description="运营平台-线上实时风控-风控类型对应风险规则维护-查询")
	public void testQuery(RiskControlRuleManagement_RiskControlTypeCorrespondingRulesManagementBean rctcrmBean) {
		RiskControlTypeCorrespondingRulesManagementPage.navigateTo(URL);
		wait.waitFor(500);
		
		if(!rctcrmBean.getRiskControlType().equals("")) {
			RiskControlTypeCorrespondingRulesManagementPage.selectRiskControlType(rctcrmBean.getRiskControlType());
			doQuery();
		}
		if(!rctcrmBean.getModuleName().equals("")) {
			RiskControlTypeCorrespondingRulesManagementPage.selectModuleName(rctcrmBean.getModuleName());
			doQuery();
		}
	}
	
	@Test(dataProvider="RiskControlRuleManagement_RiskControlTypeCorrespondingRulesManagementByCaseNO",description="运营平台-线上实时风控-风控类型对应风险规则维护-查看详情")
	public void testCheck(RiskControlRuleManagement_RiskControlTypeCorrespondingRulesManagementBean rctcrmBean) {
		RiskControlTypeCorrespondingRulesManagementPage.navigateTo(URL);
		wait.waitFor(500);
		
		doQueryForClickButton(rctcrmBean);
		
		RiskControlTypeCorrespondingRulesManagementPage.clickCheck();
		wait.waitFor(2000);
		RiskControlTypeCorrespondingRulesManagementPage.clickCheck_Close();
		
	}
	
	@Test(dataProvider="RiskControlRuleManagement_RiskControlTypeCorrespondingRulesManagementByCaseNO",description="运营平台-线上实时风控-风控类型对应风险规则维护-删除")
	public void testDelete(RiskControlRuleManagement_RiskControlTypeCorrespondingRulesManagementBean rctcrmBean) {
		RiskControlTypeCorrespondingRulesManagementPage.navigateTo(URL);
		wait.waitFor(500);
		
		doQueryForClickButton(rctcrmBean);
		
		RiskControlTypeCorrespondingRulesManagementPage.clickDelete();
		wait.waitFor(2000);
//		RiskControlTypeCorrespondingRulesManagementPage.clickDelete_Confirm();
//		System.out.println(RiskControlTypeCorrespondingRulesManagementPage.getNotice());
//		Reporter.log(RiskControlTypeCorrespondingRulesManagementPage.getNotice());
		RiskControlTypeCorrespondingRulesManagementPage.clickDelete_Close();
	}
	
	@Test(dataProvider="RiskControlRuleManagement_RiskControlTypeCorrespondingRulesManagementByCaseNO",description="运营平台-线上实时风控-风控类型对应风险规则维护-添加")
	public void testAdd(RiskControlRuleManagement_RiskControlTypeCorrespondingRulesManagementBean rctcrmBean) {
		RiskControlTypeCorrespondingRulesManagementPage.navigateTo(URL);
		wait.waitFor(500);
		
		RiskControlTypeCorrespondingRulesManagementPage.clickAdd();
		wait.waitFor(1000);
		RiskControlTypeCorrespondingRulesManagementPage.selectAdd_RiskControlType(rctcrmBean.getRiskControlType());
		RiskControlTypeCorrespondingRulesManagementPage.selectAdd_Module(rctcrmBean.getModuleName());
		RiskControlTypeCorrespondingRulesManagementPage.clickAdd_RuleCheckbox(rctcrmBean.getRuleCheckbox());
		RiskControlTypeCorrespondingRulesManagementPage.selectAdd_OperationSelection(rctcrmBean.getRuleCheckbox(),rctcrmBean.getOperationSelection());
		wait.waitFor(1000);
//		RiskControlTypeCorrespondingRulesManagementPage.clickAdd_Submit();
//		System.out.println(RiskControlTypeCorrespondingRulesManagementPage.getNotice());
//		Reporter.log(RiskControlTypeCorrespondingRulesManagementPage.getNotice());
		
		RiskControlTypeCorrespondingRulesManagementPage.clickAdd_Close();
	}
	
	@Test(dataProvider="RiskControlRuleManagement_RiskControlTypeCorrespondingRulesManagementByCaseNO",description="运营平台-线上实时风控-风控类型对应风险规则维护-修改")
	public void testUpdate(RiskControlRuleManagement_RiskControlTypeCorrespondingRulesManagementBean rctcrmBean) {
		RiskControlTypeCorrespondingRulesManagementPage.navigateTo(URL);
		wait.waitFor(500);
		
		doQueryForClickButton(rctcrmBean);
		
		RiskControlTypeCorrespondingRulesManagementPage.clickUpdate();
		wait.waitFor(1000);
//		RiskControlTypeCorrespondingRulesManagementPage.clickUpdate_RuleCheckbox(rctcrmBean.getRuleCheckbox());
		RiskControlTypeCorrespondingRulesManagementPage.selectUpdate_OperationSelect(rctcrmBean.getRuleCheckbox(),rctcrmBean.getOperationSelection());
		wait.waitFor(1000);
//		RiskControlTypeCorrespondingRulesManagementPage.clickUpdate_Submit();
//		System.out.println(RiskControlTypeCorrespondingRulesManagementPage.getNotice());
//		Reporter.log(RiskControlTypeCorrespondingRulesManagementPage.getNotice());
		RiskControlTypeCorrespondingRulesManagementPage.clickUpdate_Close();
	}
	
	public void doQueryForClickButton(RiskControlRuleManagement_RiskControlTypeCorrespondingRulesManagementBean rctcrmBean) {
		if(!rctcrmBean.getRiskControlType().equals("")) {
			RiskControlTypeCorrespondingRulesManagementPage.selectRiskControlType(rctcrmBean.getRiskControlType());
		}
		if(!rctcrmBean.getModuleName().equals("")) {
			RiskControlTypeCorrespondingRulesManagementPage.selectModuleName(rctcrmBean.getModuleName());
		}
		RiskControlTypeCorrespondingRulesManagementPage.clickQuery();
		wait.waitFor(500);
		RiskControlTypeCorrespondingRulesManagementPage.clickRadio(rctcrmBean.getRadio());
		wait.waitFor(500);
	}
	
}