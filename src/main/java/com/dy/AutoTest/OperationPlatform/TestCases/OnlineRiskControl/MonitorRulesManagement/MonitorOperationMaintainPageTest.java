package com.dy.AutoTest.OperationPlatform.TestCases.OnlineRiskControl.MonitorRulesManagement;

import java.lang.reflect.Method;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.dy.AutoTest.web.api.SuperTest;
import com.dy.AutoTest.OperationPlatform.PageObject.OnlineRiskControl.MonitorRulesManagement.MonitorOperationMaintainPage;
import com.dy.AutoTest.OperationPlatform.POJO.MonitorRulesManagement_MonitorOperationMaintainBean;
import com.dy.AutoTest.web.business.DataBusiness;

public class MonitorOperationMaintainPageTest extends SuperTest{
	MonitorOperationMaintainPage MonitorOperationMaintainPage;
	String URL;

	@BeforeClass
	public void init() {
		/******** instant objectPage *********/
		MonitorOperationMaintainPage=new MonitorOperationMaintainPage(driver);
		//MonitorOperationMaintainPage.setWaitTime(800);

		/******** set URL *********/
		URL=host.toString()+DataBusiness.getData_URL("pop_MonitorRulesManagement_MonitorOperationMaintain");

		/******** instant Interface *********/
		iQuery=MonitorOperationMaintainPage;
//	iClickButton=MonitorOperationMaintainPage;
//	iClickRadio=MonitorOperationMaintainPage;
//	iSearchMerchantByNOorName=MonitorOperationMaintainPage;
	}

	@DataProvider(name="MonitorRulesManagement_MonitorOperationMaintain")
	protected static Object[][] parametersPool(){
		data.loadDataBeanList("POP_Data_MonitorRulesManagement_MonitorOperationMaintain");
		return data.getDataBeanArray();
	}

	@DataProvider(name="MonitorRulesManagement_MonitorOperationMaintainByCaseNO")
	protected static Object[][] parametersPool(Method method){
		data.loadDataBeanList("POP_Data_MonitorRulesManagement_MonitorOperationMaintain",method.getName());
		return data.getDataBeanArray();
	}

	@Test(dataProvider="MonitorRulesManagement_MonitorOperationMaintainByCaseNO")
	public void testQuery(MonitorRulesManagement_MonitorOperationMaintainBean MonitorRulesManagement_MonitorOperationMaintainBean) {
		MonitorOperationMaintainPage.navigateTo(URL);
		wait.waitFor(500);

	}
}