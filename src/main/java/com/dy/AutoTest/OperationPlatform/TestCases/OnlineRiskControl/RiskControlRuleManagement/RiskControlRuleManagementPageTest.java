package com.dy.AutoTest.OperationPlatform.TestCases.OnlineRiskControl.RiskControlRuleManagement;

import java.lang.reflect.Method;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.dy.AutoTest.web.api.SuperTest;
import com.dy.AutoTest.OperationPlatform.PageObject.OnlineRiskControl.RiskControlRuleManagement.RiskControlRuleManagementPage;
import com.dy.AutoTest.OperationPlatform.POJO.RiskControlRuleManagement_RiskControlRuleManagementBean;
import com.dy.AutoTest.web.business.DataBusiness;

public class RiskControlRuleManagementPageTest extends SuperTest{
	RiskControlRuleManagementPage RiskControlRuleManagementPage;
	String URL;

	@BeforeClass
	public void init() {
		/******** instant objectPage *********/
		RiskControlRuleManagementPage=new RiskControlRuleManagementPage(driver);
		//RiskControlRuleManagementPage.setWaitTime(800);

		/******** set URL *********/
		URL=host.toString()+DataBusiness.getData_URL("pop_RiskControlRuleManagement_RiskControlRuleManagement");

		/******** instant Interface *********/
		iQuery=RiskControlRuleManagementPage;
//		iClickButton=RiskControlRuleManagementPage;
//		iClickRadio=RiskControlRuleManagementPage;
//		iSearchMerchantByNOorName=RiskControlRuleManagementPage;
	}

	@DataProvider(name="RiskControlRuleManagement_RiskControlRuleManagement")
	protected static Object[][] parametersPool(){
		data.loadDataBeanList("POP_Data_RiskControlRuleManagement_RiskControlRuleManagement");
		return data.getDataBeanArray();
	}

	@DataProvider(name="RiskControlRuleManagement_RiskControlRuleManagementByCaseNO")
	protected static Object[][] parametersPool(Method method){
		data.loadDataBeanList("POP_Data_RiskControlRuleManagement_RiskControlRuleManagement",method.getName());
		return data.getDataBeanArray();
	}

	@Test(dataProvider="RiskControlRuleManagement_RiskControlRuleManagementByCaseNO",description="运营平台-线上实时风控-风控规则维护-查询")
	public void testQuery(RiskControlRuleManagement_RiskControlRuleManagementBean rcrmBean) {
		RiskControlRuleManagementPage.navigateTo(URL);
		wait.waitFor(500);
		
		if(!rcrmBean.getRuleID().equals("")) {
			RiskControlRuleManagementPage.setRuleID(rcrmBean.getRuleID());
			doQuery();
		}
		if(!rcrmBean.getRuleType().equals("")) {
			RiskControlRuleManagementPage.selectRuleType(rcrmBean.getRuleType());
			doQuery();
		}
		if(!rcrmBean.getPaymentCollectionSign().equals("")) {
			RiskControlRuleManagementPage.selectPaymentCollectionSign(rcrmBean.getPaymentCollectionSign());
			doQuery();
		}
	}
	
	@Test(dataProvider="RiskControlRuleManagement_RiskControlRuleManagementByCaseNO",description="运营平台-线上实时风控-风控规则维护-查看详情")
	public void testCheck(RiskControlRuleManagement_RiskControlRuleManagementBean rcrmBean) {
		RiskControlRuleManagementPage.navigateTo(URL);
		wait.waitFor(500);
		
		doQueryForClickButton(rcrmBean);
		
		RiskControlRuleManagementPage.clickCheck();
		wait.waitFor(2000);
		RiskControlRuleManagementPage.clickCheck_Close();
	}
	
	@Test(dataProvider="RiskControlRuleManagement_RiskControlRuleManagementByCaseNO",description="运营平台-线上实时风控-风控规则维护-添加")
	public void testAdd(RiskControlRuleManagement_RiskControlRuleManagementBean rcrmBean) {
		RiskControlRuleManagementPage.navigateTo(URL);
		wait.waitFor(500);
		
		RiskControlRuleManagementPage.clickAdd();
		wait.waitFor(500);
		RiskControlRuleManagementPage.setAdd_RuleID(rcrmBean.getRuleID());
		RiskControlRuleManagementPage.selectAdd_RuleType(rcrmBean.getRuleType());
		RiskControlRuleManagementPage.selectAdd_PaymentCollectionSign(rcrmBean.getPaymentCollectionSign());
		RiskControlRuleManagementPage.setAdd_RuleDiscribe(rcrmBean.getRuleDiscribe());
		RiskControlRuleManagementPage.setAdd_ComponentName(rcrmBean.getComponentName());
//		RiskControlRuleManagementPage.clickAdd_Submit();
//		System.out.println(RiskControlTypeManagementPage.getNotice());
//		Reporter.log(RiskControlTypeManagementPage.getNotice());
		RiskControlRuleManagementPage.clickAdd_Close();
		testCheck(rcrmBean);
	}
	
	
	@Test(dataProvider="RiskControlRuleManagement_RiskControlRuleManagementByCaseNO",description="运营平台-线上实时风控-风控规则维护-修改")
	public void testUpdate(RiskControlRuleManagement_RiskControlRuleManagementBean rcrmBean) {
		RiskControlRuleManagementPage.navigateTo(URL);
		wait.waitFor(500);
		
		doQueryForClickButton(rcrmBean);
		
		RiskControlRuleManagementPage.clickUpdate();
		wait.waitFor(500);
		RiskControlRuleManagementPage.selectUpdate_RuleType(rcrmBean.getUpdate_RuleType());
		RiskControlRuleManagementPage.selectUpdate_PaymentCollectionSign(rcrmBean.getUpdate_PaymentCollectionSign());
		RiskControlRuleManagementPage.setUpdate_RuleDiscribe(rcrmBean.getUpdate_RuleDiscribe());
		RiskControlRuleManagementPage.setUpdate_ComponentName(rcrmBean.getComponentName());
//		RiskControlRuleManagementPage.clickUpdate_Confirm();
//		System.out.println(RiskControlTypeManagementPage.getNotice());
//		Reporter.log(RiskControlTypeManagementPage.getNotice());
		RiskControlRuleManagementPage.clickUpdate_Close();
		testCheck(rcrmBean);
	}
	
	public void doQueryForClickButton(RiskControlRuleManagement_RiskControlRuleManagementBean rcrmBean) {
		if(!rcrmBean.getRuleID().equals("")) {
			RiskControlRuleManagementPage.setRuleID(rcrmBean.getRuleID());
		}
		if(!rcrmBean.getRuleType().equals("")) {
			RiskControlRuleManagementPage.selectRuleType(rcrmBean.getRuleType());
		}
		if(!rcrmBean.getPaymentCollectionSign().equals("")) {
			RiskControlRuleManagementPage.selectPaymentCollectionSign(rcrmBean.getPaymentCollectionSign());
		}
		RiskControlRuleManagementPage.clickQuery();
		wait.waitFor(500);
		RiskControlRuleManagementPage.clickRadio(rcrmBean.getRadio());
		wait.waitFor(500);
	}
}