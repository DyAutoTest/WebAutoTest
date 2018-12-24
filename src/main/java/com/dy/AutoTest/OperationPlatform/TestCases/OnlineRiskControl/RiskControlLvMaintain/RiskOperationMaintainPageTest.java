package com.dy.AutoTest.OperationPlatform.TestCases.OnlineRiskControl.RiskControlLvMaintain;

import java.lang.reflect.Method;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.dy.AutoTest.web.api.SuperTest;
import com.dy.AutoTest.OperationPlatform.PageObject.OnlineRiskControl.RiskControlLvMaintain.RiskOperationMaintainPage;
import com.dy.AutoTest.OperationPlatform.POJO.RiskControlLvMaintain_RiskOperationMaintainBean;
import com.dy.AutoTest.web.business.DataBusiness;

public class RiskOperationMaintainPageTest extends SuperTest{
	RiskOperationMaintainPage RiskOperationMaintainPage;
	String URL;

	@BeforeClass
	public void init() {
		/******** instant objectPage *********/
		RiskOperationMaintainPage=new RiskOperationMaintainPage(driver);
		//RiskOperationMaintainPage.setWaitTime(800);

		/******** set URL *********/
		URL=host.toString()+DataBusiness.getData_URL("pop_RiskControlLvMaintain_RiskOperationMaintain");

		/******** instant Interface *********/
		iQuery=RiskOperationMaintainPage;
//	iClickButton=RiskOperationMaintainPage;
//	iClickRadio=RiskOperationMaintainPage;
//	iSearchMerchantByNOorName=RiskOperationMaintainPage;
	}

	@DataProvider(name="RiskControlLvMaintain_RiskOperationMaintain")
	protected static Object[][] parametersPool(){
		data.loadDataBeanList("POP_Data_RiskControlLvMaintain_RiskOperationMaintain");
		return data.getDataBeanArray();
	}

	@DataProvider(name="RiskControlLvMaintain_RiskOperationMaintainByCaseNO")
	protected static Object[][] parametersPool(Method method){
		data.loadDataBeanList("POP_Data_RiskControlLvMaintain_RiskOperationMaintain",method.getName());
		return data.getDataBeanArray();
	}

	@Test(dataProvider="RiskControlLvMaintain_RiskOperationMaintainByCaseNO")
	public void testQuery(RiskControlLvMaintain_RiskOperationMaintainBean RiskControlLvMaintain_RiskOperationMaintainBean) {
		RiskOperationMaintainPage.navigateTo(URL);
		wait.waitFor(500);

	}
}