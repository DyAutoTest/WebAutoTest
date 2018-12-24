package com.dy.AutoTest.OperationPlatform.TestCases.OnlineRiskControl.ComplianceMaintain;

import java.lang.reflect.Method;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.dy.AutoTest.web.api.SuperTest;
import com.dy.AutoTest.OperationPlatform.PageObject.OnlineRiskControl.ComplianceMaintain.ComplianceLimitMaintainPage;
import com.dy.AutoTest.OperationPlatform.POJO.ComplianceMaintain_ComplianceLimitMaintainBean;
import com.dy.AutoTest.web.business.DataBusiness;

public class ComplianceLimitMaintainPageTest extends SuperTest{
	ComplianceLimitMaintainPage ComplianceLimitMaintainPage;
	String URL;

	@BeforeClass
	public void init() {
		/******** instant objectPage *********/
		ComplianceLimitMaintainPage=new ComplianceLimitMaintainPage(driver);
		//ComplianceLimitMaintainPage.setWaitTime(800);

		/******** set URL *********/
		URL=host.toString()+DataBusiness.getData_URL("pop_ComplianceMaintain_ComplianceLimitMaintain");

		/******** instant Interface *********/
		iQuery=ComplianceLimitMaintainPage;
//	iClickButton=ComplianceLimitMaintainPage;
//	iClickRadio=ComplianceLimitMaintainPage;
//	iSearchMerchantByNOorName=ComplianceLimitMaintainPage;
	}

	@DataProvider(name="ComplianceMaintain_ComplianceLimitMaintain")
	protected static Object[][] parametersPool(){
		data.loadDataBeanList("POP_Data_ComplianceMaintain_ComplianceLimitMaintain");
		return data.getDataBeanArray();
	}

	@DataProvider(name="ComplianceMaintain_ComplianceLimitMaintainByCaseNO")
	protected static Object[][] parametersPool(Method method){
		data.loadDataBeanList("POP_Data_ComplianceMaintain_ComplianceLimitMaintain",method.getName());
		return data.getDataBeanArray();
	}

	@Test(dataProvider="ComplianceMaintain_ComplianceLimitMaintainByCaseNO")
	public void testQuery(ComplianceMaintain_ComplianceLimitMaintainBean ComplianceMaintain_ComplianceLimitMaintainBean) {
		ComplianceLimitMaintainPage.navigateTo(URL);
		wait.waitFor(500);

	}
}