package com.dy.AutoTest.OperationPlatform.TestCases.OnlineRiskControl.MonitorRulesManagement;

import java.lang.reflect.Method;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.dy.AutoTest.web.api.SuperTest;
import com.dy.AutoTest.OperationPlatform.PageObject.OnlineRiskControl.MonitorRulesManagement.MonitorRulesMaintainPage;
import com.dy.AutoTest.OperationPlatform.POJO.MonitorRulesManagement_MonitorRulesMaintainBean;
import com.dy.AutoTest.web.business.DataBusiness;

public class MonitorRulesMaintainPageTest extends SuperTest{
	MonitorRulesMaintainPage MonitorRulesMaintainPage;
	String URL;

	@BeforeClass
	public void init() {
		/******** instant objectPage *********/
		MonitorRulesMaintainPage=new MonitorRulesMaintainPage(driver);
		//MonitorRulesMaintainPage.setWaitTime(800);

		/******** set URL *********/
		URL=host.toString()+DataBusiness.getData_URL("pop_MonitorRulesManagement_MonitorRulesMaintain");

		/******** instant Interface *********/
		iQuery=MonitorRulesMaintainPage;
//	iClickButton=MonitorRulesMaintainPage;
//	iClickRadio=MonitorRulesMaintainPage;
//	iSearchMerchantByNOorName=MonitorRulesMaintainPage;
	}

	@DataProvider(name="MonitorRulesManagement_MonitorRulesMaintain")
	protected static Object[][] parametersPool(){
		data.loadDataBeanList("POP_Data_MonitorRulesManagement_MonitorRulesMaintain");
		return data.getDataBeanArray();
	}

	@DataProvider(name="MonitorRulesManagement_MonitorRulesMaintainByCaseNO")
	protected static Object[][] parametersPool(Method method){
		data.loadDataBeanList("POP_Data_MonitorRulesManagement_MonitorRulesMaintain",method.getName());
		return data.getDataBeanArray();
	}

	@Test(dataProvider="MonitorRulesManagement_MonitorRulesMaintainByCaseNO")
	public void testQuery(MonitorRulesManagement_MonitorRulesMaintainBean MonitorRulesManagement_MonitorRulesMaintainBean) {
		MonitorRulesMaintainPage.navigateTo(URL);
		wait.waitFor(500);

	}
}