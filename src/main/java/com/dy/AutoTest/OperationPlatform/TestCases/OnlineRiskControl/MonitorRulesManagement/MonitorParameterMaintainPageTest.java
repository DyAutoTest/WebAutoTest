package com.dy.AutoTest.OperationPlatform.TestCases.OnlineRiskControl.MonitorRulesManagement;

import java.lang.reflect.Method;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.dy.AutoTest.web.api.SuperTest;
import com.dy.AutoTest.OperationPlatform.PageObject.OnlineRiskControl.MonitorRulesManagement.MonitorParameterMaintainPage;
import com.dy.AutoTest.OperationPlatform.POJO.MonitorRulesManagement_MonitorParameterMaintainBean;
import com.dy.AutoTest.web.business.DataBusiness;

public class MonitorParameterMaintainPageTest extends SuperTest{
	MonitorParameterMaintainPage MonitorParameterMaintainPage;
	String URL;

	@BeforeClass
	public void init() {
		/******** instant objectPage *********/
		MonitorParameterMaintainPage=new MonitorParameterMaintainPage(driver);
		//MonitorParameterMaintainPage.setWaitTime(800);

		/******** set URL *********/
		URL=host.toString()+DataBusiness.getData_URL("pop_MonitorRulesManagement_MonitorParameterMaintain");

		/******** instant Interface *********/
		iQuery=MonitorParameterMaintainPage;
//	iClickButton=MonitorParameterMaintainPage;
//	iClickRadio=MonitorParameterMaintainPage;
//	iSearchMerchantByNOorName=MonitorParameterMaintainPage;
	}

	@DataProvider(name="MonitorRulesManagement_MonitorParameterMaintain")
	protected static Object[][] parametersPool(){
		data.loadDataBeanList("POP_Data_MonitorRulesManagement_MonitorParameterMaintain");
		return data.getDataBeanArray();
	}

	@DataProvider(name="MonitorRulesManagement_MonitorParameterMaintainByCaseNO")
	protected static Object[][] parametersPool(Method method){
		data.loadDataBeanList("POP_Data_MonitorRulesManagement_MonitorParameterMaintain",method.getName());
		return data.getDataBeanArray();
	}

	@Test(dataProvider="MonitorRulesManagement_MonitorParameterMaintainByCaseNO")
	public void testQuery(MonitorRulesManagement_MonitorParameterMaintainBean MonitorRulesManagement_MonitorParameterMaintainBean) {
		MonitorParameterMaintainPage.navigateTo(URL);
		wait.waitFor(500);

	}
}