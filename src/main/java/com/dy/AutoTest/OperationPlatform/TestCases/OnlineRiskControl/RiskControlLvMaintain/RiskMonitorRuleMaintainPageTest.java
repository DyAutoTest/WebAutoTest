package com.dy.AutoTest.OperationPlatform.TestCases.OnlineRiskControl.RiskControlLvMaintain;

import java.lang.reflect.Method;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.dy.AutoTest.web.api.SuperTest;
import com.dy.AutoTest.OperationPlatform.PageObject.OnlineRiskControl.RiskControlLvMaintain.RiskMonitorRuleMaintainPage;
import com.dy.AutoTest.OperationPlatform.POJO.RiskControlLvMaintain_RiskMonitorRuleMaintainBean;
import com.dy.AutoTest.web.business.DataBusiness;

public class RiskMonitorRuleMaintainPageTest extends SuperTest{
	RiskMonitorRuleMaintainPage RiskMonitorRuleMaintainPage;
	String URL;

	@BeforeClass
	public void init() {
		/******** instant objectPage *********/
		RiskMonitorRuleMaintainPage=new RiskMonitorRuleMaintainPage(driver);
		//RiskMonitorRuleMaintainPage.setWaitTime(800);

		/******** set URL *********/
		URL=host.toString()+DataBusiness.getData_URL("pop_RiskControlLvMaintain_RiskMonitorRuleMaintain");

		/******** instant Interface *********/
		iQuery=RiskMonitorRuleMaintainPage;
//	iClickButton=RiskMonitorRuleMaintainPage;
//	iClickRadio=RiskMonitorRuleMaintainPage;
//	iSearchMerchantByNOorName=RiskMonitorRuleMaintainPage;
	}

	@DataProvider(name="RiskControlLvMaintain_RiskMonitorRuleMaintain")
	protected static Object[][] parametersPool(){
		data.loadDataBeanList("POP_Data_RiskControlLvMaintain_RiskMonitorRuleMaintain");
		return data.getDataBeanArray();
	}

	@DataProvider(name="RiskControlLvMaintain_RiskMonitorRuleMaintainByCaseNO")
	protected static Object[][] parametersPool(Method method){
		data.loadDataBeanList("POP_Data_RiskControlLvMaintain_RiskMonitorRuleMaintain",method.getName());
		return data.getDataBeanArray();
	}

	@Test(dataProvider="RiskControlLvMaintain_RiskMonitorRuleMaintainByCaseNO")
	public void testQuery(RiskControlLvMaintain_RiskMonitorRuleMaintainBean RiskControlLvMaintain_RiskMonitorRuleMaintainBean) {
		RiskMonitorRuleMaintainPage.navigateTo(URL);
		wait.waitFor(500);

	}
}