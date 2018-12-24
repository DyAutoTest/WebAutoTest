package com.dy.AutoTest.OperationPlatform.TestCases.OnlineRiskControl.ComplianceMaintain;

import java.lang.reflect.Method;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.dy.AutoTest.web.api.SuperTest;
import com.dy.AutoTest.OperationPlatform.PageObject.OnlineRiskControl.ComplianceMaintain.WeightMaintainPage;
import com.dy.AutoTest.OperationPlatform.POJO.ComplianceMaintain_WeightMaintainBean;
import com.dy.AutoTest.web.business.DataBusiness;

public class WeightMaintainPageTest extends SuperTest{
	WeightMaintainPage WeightMaintainPage;
	String URL;

	@BeforeClass
	public void init() {
		/******** instant objectPage *********/
		WeightMaintainPage=new WeightMaintainPage(driver);
		//WeightMaintainPage.setWaitTime(800);

		/******** set URL *********/
		URL=host.toString()+DataBusiness.getData_URL("pop_ComplianceMaintain_WeightMaintain");

		/******** instant Interface *********/
		iQuery=WeightMaintainPage;
//	iClickButton=WeightMaintainPage;
//	iClickRadio=WeightMaintainPage;
//	iSearchMerchantByNOorName=WeightMaintainPage;
	}

	@DataProvider(name="ComplianceMaintain_WeightMaintain")
	protected static Object[][] parametersPool(){
		data.loadDataBeanList("POP_Data_ComplianceMaintain_WeightMaintain");
		return data.getDataBeanArray();
	}

	@DataProvider(name="ComplianceMaintain_WeightMaintainByCaseNO")
	protected static Object[][] parametersPool(Method method){
		data.loadDataBeanList("POP_Data_ComplianceMaintain_WeightMaintain",method.getName());
		return data.getDataBeanArray();
	}

	@Test(dataProvider="ComplianceMaintain_WeightMaintainByCaseNO")
	public void testQuery(ComplianceMaintain_WeightMaintainBean ComplianceMaintain_WeightMaintainBean) {
		WeightMaintainPage.navigateTo(URL);
		wait.waitFor(500);

	}
}