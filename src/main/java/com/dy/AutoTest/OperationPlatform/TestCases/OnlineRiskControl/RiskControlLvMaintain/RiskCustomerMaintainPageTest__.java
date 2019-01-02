package com.dy.AutoTest.OperationPlatform.TestCases.OnlineRiskControl.RiskControlLvMaintain;

import java.lang.reflect.Method;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.dy.AutoTest.web.api.SuperTest;
import com.dy.AutoTest.OperationPlatform.PageObject.OnlineRiskControl.RiskControlLvMaintain.RiskCustomerMaintainPage;
import com.dy.AutoTest.OperationPlatform.POJO.RiskControlLvMaintain_RiskCustomerMaintainBean;
import com.dy.AutoTest.web.business.DataBusiness;

public class RiskCustomerMaintainPageTest__ extends SuperTest{
	RiskCustomerMaintainPage RiskCustomerMaintainPage;
	String URL;

	@BeforeClass
	public void init() {
		/******** instant objectPage *********/
		RiskCustomerMaintainPage=new RiskCustomerMaintainPage(driver);
		//RiskCustomerMaintainPage.setWaitTime(800);

		/******** set URL *********/
		URL=host.toString()+DataBusiness.getData_URL("pop_RiskControlLvMaintain_RiskCustomerMaintain");

		/******** instant Interface *********/
		iQuery=RiskCustomerMaintainPage;
//	iClickButton=RiskCustomerMaintainPage;
//	iClickRadio=RiskCustomerMaintainPage;
//	iSearchMerchantByNOorName=RiskCustomerMaintainPage;
	}

	@DataProvider(name="RiskControlLvMaintain_RiskCustomerMaintain")
	protected static Object[][] parametersPool(){
		data.loadDataBeanList("POP_Data_RiskControlLvMaintain_RiskCustomerMaintain");
		return data.getDataBeanArray();
	}

	@DataProvider(name="RiskControlLvMaintain_RiskCustomerMaintainByCaseNO")
	protected static Object[][] parametersPool(Method method){
		data.loadDataBeanList("POP_Data_RiskControlLvMaintain_RiskCustomerMaintain",method.getName());
		return data.getDataBeanArray();
	}

	@Test(dataProvider="RiskControlLvMaintain_RiskCustomerMaintainByCaseNO")
	public void testQuery(RiskControlLvMaintain_RiskCustomerMaintainBean bean) {
		RiskCustomerMaintainPage.navigateTo(URL);
		wait.waitFor(500);

	}
	@Test(dataProvider="RiskControlLvMaintain_RiskCustomerMaintainByCaseNO")
	public void testCheck(RiskControlLvMaintain_RiskCustomerMaintainBean bean) {
		RiskCustomerMaintainPage.navigateTo(URL);
		wait.waitFor(500);
		doQueryForClickButton(bean);
		RiskCustomerMaintainPage.clickCheck();
		wait.waitFor(2000);
//		RiskCustomerMaintainPage.clickCheck_Close();
	}
	@Test(dataProvider="RiskControlLvMaintain_RiskCustomerMaintainByCaseNO")
	public void testDelete(RiskControlLvMaintain_RiskCustomerMaintainBean bean) {
		RiskCustomerMaintainPage.navigateTo(URL);
		wait.waitFor(500);
		doQueryForClickButton(bean);
		RiskCustomerMaintainPage.clickDelete();
		wait.waitFor(1000);
//		RiskCustomerMaintainPage.clickDelete_Confirm();
//		System.out.println(RiskCustomerMaintainPage.getNotice());
//		Reporter.log(RiskCustomerMaintainPage.getNotice());
//		RiskCustomerMaintainPage.clickDelete_Close();
	}


	public void doQueryForClickButton(RiskControlLvMaintain_RiskCustomerMaintainBean bean) {

		RiskCustomerMaintainPage.clickQuery();
		wait.waitFor(500);
//		RiskCustomerMaintainPage.clickRadio(bean.getRadio());
		wait.waitFor(500);
	}
}