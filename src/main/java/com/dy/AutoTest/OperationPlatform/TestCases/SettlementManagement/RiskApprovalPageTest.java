package com.dy.AutoTest.OperationPlatform.TestCases.SettlementManagement;

import java.lang.reflect.Method;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.dy.AutoTest.web.api.SuperTest;
import com.dy.AutoTest.OperationPlatform.PageObject.SettlementManagement.RiskApprovalPage;
import com.dy.AutoTest.OperationPlatform.POJO.SettlementManagement_RiskApprovalBean;
import com.dy.AutoTest.web.business.DataBusiness;

public class RiskApprovalPageTest extends SuperTest{
	RiskApprovalPage RiskApprovalPage;
	String URL;

	@BeforeClass
	public void init() {
		/******** instant objectPage *********/
		RiskApprovalPage=new RiskApprovalPage(driver);
		//RiskApprovalPage.setWaitTime(800);

		/******** set URL *********/
		URL=host.toString()+DataBusiness.getData_URL("pop_SettlementManagement_RiskApproval");

		/******** instant Interface *********/
//		iQuery=RiskApprovalPage;
//		iClickButton=RiskApprovalPage;
//		iClickRadio=RiskApprovalPage;
//		iSearchMerchantByNOorName=RiskApprovalPage;
	}

	@DataProvider(name="SettlementManagement_RiskApproval")
	protected static Object[][] parametersPool(){
		data.loadDataBeanList("POP_Data_SettlementManagement_RiskApproval");
		return data.getDataBeanArray();
	}

	@DataProvider(name="SettlementManagement_RiskApprovalByCaseNO")
	protected static Object[][] parametersPool(Method method){
		data.loadDataBeanList("POP_Data_SettlementManagement_RiskApproval",method.getName());
		return data.getDataBeanArray();
	}

	@Test(dataProvider="SettlementManagement_RiskApprovalByCaseNO")
	public void testQuery(SettlementManagement_RiskApprovalBean SettlementManagement_RiskApprovalBean) {
		RiskApprovalPage.navigateTo(URL);
		wait.waitFor(500);

	}
}