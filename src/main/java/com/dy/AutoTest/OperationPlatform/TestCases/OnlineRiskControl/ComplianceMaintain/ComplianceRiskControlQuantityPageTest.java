package com.dy.AutoTest.OperationPlatform.TestCases.OnlineRiskControl.ComplianceMaintain;

import java.lang.reflect.Method;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.dy.AutoTest.web.api.SuperTest;
import com.dy.AutoTest.OperationPlatform.PageObject.OnlineRiskControl.ComplianceMaintain.ComplianceRiskControlQuantityPage;
import com.dy.AutoTest.OperationPlatform.POJO.ComplianceMaintain_ComplianceRiskControlQuantityBean;
import com.dy.AutoTest.web.business.DataBusiness;

public class ComplianceRiskControlQuantityPageTest extends SuperTest{
	ComplianceRiskControlQuantityPage ComplianceRiskControlQuantityPage;
	String URL;

	@BeforeClass
	public void init() {
		/******** instant objectPage *********/
		ComplianceRiskControlQuantityPage=new ComplianceRiskControlQuantityPage(driver);
		//ComplianceRiskControlQuantityPage.setWaitTime(800);

		/******** set URL *********/
		URL=host.toString()+DataBusiness.getData_URL("pop_ComplianceMaintain_ComplianceRiskControlQuantity");

		/******** instant Interface *********/
		iQuery=ComplianceRiskControlQuantityPage;
//	iClickButton=ComplianceRiskControlQuantityPage;
//	iClickRadio=ComplianceRiskControlQuantityPage;
//	iSearchMerchant=ComplianceRiskControlQuantityPage;
	}

	@DataProvider(name="ComplianceMaintain_ComplianceRiskControlQuantity")
	protected static Object[][] parametersPool(){
		data.loadDataBeanList("POP_Data_ComplianceMaintain_ComplianceRiskControlQuantity");
		return data.getDataBeanArray();
	}

	@DataProvider(name="ComplianceMaintain_ComplianceRiskControlQuantityByCaseNO")
	protected static Object[][] parametersPool(Method method){
		data.loadDataBeanList("POP_Data_ComplianceMaintain_ComplianceRiskControlQuantity",method.getName());
		return data.getDataBeanArray();
	}

	@Test(dataProvider="ComplianceMaintain_ComplianceRiskControlQuantityByCaseNO")
	public void testQuery(ComplianceMaintain_ComplianceRiskControlQuantityBean ccrcqBean) {
		ComplianceRiskControlQuantityPage.navigateTo(URL);
		wait.waitFor(500);
		if(!ccrcqBean.getUserName().equals("")) {
			ComplianceRiskControlQuantityPage.setUserName(ccrcqBean.getUserName());
			doQuery();
		}
		if(!ccrcqBean.getCollectionOrPaymentSign().equals("")) {
			ComplianceRiskControlQuantityPage.selectCollectionOrPaymentSign(ccrcqBean.getCollectionOrPaymentSign());
			doQuery();
		}
		if(!ccrcqBean.getQuantityWay().equals("")) {
			ComplianceRiskControlQuantityPage.selectQuantityWay(ccrcqBean.getQuantityWay());
			doQuery();
		}
		if(!ccrcqBean.getQueryDate().equals("")) {
			ComplianceRiskControlQuantityPage.setQueryDate(ccrcqBean.getQueryDate());
			doQuery();
		}
		
	}
}