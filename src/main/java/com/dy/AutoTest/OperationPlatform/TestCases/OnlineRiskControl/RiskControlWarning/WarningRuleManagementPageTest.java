package com.dy.AutoTest.OperationPlatform.TestCases.OnlineRiskControl.RiskControlWarning;

import java.lang.reflect.Method;

import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.dy.AutoTest.web.api.SuperTest;
import com.dy.AutoTest.OperationPlatform.PageObject.OnlineRiskControl.RiskControlWarning.WarningRuleManagementPage;
import com.dy.AutoTest.OperationPlatform.POJO.RiskControlWarning_WarningRuleManagementBean;
import com.dy.AutoTest.web.business.DataBusiness;

public class WarningRuleManagementPageTest extends SuperTest{
	WarningRuleManagementPage WarningRuleManagementPage;
	String URL;

	@BeforeClass
	public void init() {
		/******** instant objectPage *********/
		WarningRuleManagementPage=new WarningRuleManagementPage(driver);
		//WarningRuleManagementPage.setWaitTime(800);

		/******** set URL *********/
		URL=host.toString()+DataBusiness.getData_URL("pop_RiskControlWarning_WarningRuleManagement");

		/******** instant Interface *********/
		iQuery=WarningRuleManagementPage;
//		iClickButton=WarningRuleManagementPage;
//		iClickRadio=WarningRuleManagementPage;
//		iSearchMerchant=WarningRuleManagementPage;
	}

	@DataProvider(name="RiskControlWarning_WarningRuleManagement")
	protected static Object[][] parametersPool(){
		data.loadDataBeanList("POP_Data_RiskControlWarning_WarningRuleManagement");
		return data.getDataBeanArray();
	}

	@DataProvider(name="RiskControlWarning_WarningRuleManagementByCaseNO")
	protected static Object[][] parametersPool(Method method){
		data.loadDataBeanList("POP_Data_RiskControlWarning_WarningRuleManagement",method.getName());
		return data.getDataBeanArray();
	}

	@Test(dataProvider="RiskControlWarning_WarningRuleManagementByCaseNO")
	public void testQuery(RiskControlWarning_WarningRuleManagementBean rwrmBean) {
		WarningRuleManagementPage.navigateTo(URL);
		wait.waitFor(500);
		
		if(!rwrmBean.getModule().equals("")) {
			WarningRuleManagementPage.selectModule(rwrmBean.getModule());
			doQuery();
		}
	}
	
	@Test(dataProvider="RiskControlWarning_WarningRuleManagementByCaseNO")
	public void testUpdate(RiskControlWarning_WarningRuleManagementBean rwrmBean) {
		WarningRuleManagementPage.navigateTo(URL);
		wait.waitFor(500);
		
		if(!rwrmBean.getModule().equals("")) {
			WarningRuleManagementPage.selectModule(rwrmBean.getModule());
		}
		WarningRuleManagementPage.clickQuery();
		wait.waitFor(500);
		WarningRuleManagementPage.clickRadio(rwrmBean.getRadio());
		wait.waitFor(500);
		WarningRuleManagementPage.clickUpdate();
		
		if(!rwrmBean.getUpdate_RuleType().equals("")) {
			WarningRuleManagementPage.selectUpdate_RuleType(rwrmBean.getUpdate_RuleType());
		}
		if(!rwrmBean.getUpdate_Module().equals("")) {
			WarningRuleManagementPage.selectUpdate_Module(rwrmBean.getUpdate_Module());
		}
		if(!rwrmBean.getUpdate_RiskControlParam().equals("")) {
			WarningRuleManagementPage.setUpdate_RiskControlParam(rwrmBean.getUpdate_RiskControlParam());
		}
		if(!rwrmBean.getUpdate_RuleDescribe().equals("")) {
			WarningRuleManagementPage.setUpdate_RuleDescribe(rwrmBean.getUpdate_RuleDescribe());
		}
		if(!rwrmBean.getUpdate_Comment().equals("")) {
			WarningRuleManagementPage.setUpdate_Comment(rwrmBean.getUpdate_Comment());
		}
		
		wait.waitFor(2000);
//		WarningRuleManagementPage.clickUpdate_Confirm();
//		System.out.println(WarningRuleManagementPage.getNotice());
//		Reporter.log(WarningRuleManagementPage.getNotice());
		WarningRuleManagementPage.clickUpdate_Close();
	}
	
	
}