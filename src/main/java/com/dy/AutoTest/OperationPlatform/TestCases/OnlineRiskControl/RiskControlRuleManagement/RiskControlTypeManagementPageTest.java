package com.dy.AutoTest.OperationPlatform.TestCases.OnlineRiskControl.RiskControlRuleManagement;

import java.lang.reflect.Method;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.dy.AutoTest.web.api.SuperTest;
import com.dy.AutoTest.OperationPlatform.PageObject.OnlineRiskControl.RiskControlRuleManagement.RiskControlTypeManagementPage;
import com.dy.AutoTest.OperationPlatform.POJO.RiskControlRuleManagement_RiskControlTypeManagementBean;
import com.dy.AutoTest.web.business.DataBusiness;

public class RiskControlTypeManagementPageTest extends SuperTest{
	RiskControlTypeManagementPage RiskControlTypeManagementPage;
	String URL;

	@BeforeClass
	public void init() {
		/******** instant objectPage *********/
		RiskControlTypeManagementPage=new RiskControlTypeManagementPage(driver);
		//RiskControlTypeManagementPage.setWaitTime(800);

		/******** set URL *********/
		URL=host.toString()+DataBusiness.getData_URL("pop_RiskControlRuleManagement_RiskControlTypeManagement");

		/******** instant Interface *********/
		iQuery=RiskControlTypeManagementPage;
//		iClickButton=RiskControlTypeManagementPage;
//		iClickRadio=RiskControlTypeManagementPage;
//		iSearchMerchantByNOorName=RiskControlTypeManagementPage;
	}

	@DataProvider(name="RiskControlRuleManagement_RiskControlTypeManagement")
	protected static Object[][] parametersPool(){
		data.loadDataBeanList("POP_Data_RiskControlRuleManagement_RiskControlTypeManagement");
		return data.getDataBeanArray();
	}

	@DataProvider(name="RiskControlRuleManagement_RiskControlTypeManagementByCaseNO")
	protected static Object[][] parametersPool(Method method){
		data.loadDataBeanList("POP_Data_RiskControlRuleManagement_RiskControlTypeManagement",method.getName());
		return data.getDataBeanArray();
	}

	@Test(dataProvider="RiskControlRuleManagement_RiskControlTypeManagementByCaseNO",description="运营平台-线上实时风控-风控类型维护-查询")
	public void testQuery(RiskControlRuleManagement_RiskControlTypeManagementBean rctmBean) {
		RiskControlTypeManagementPage.navigateTo(URL);
		wait.waitFor(500);

		if(!rctmBean.getRiskType().equals("")) {
			RiskControlTypeManagementPage.selectRiskType(rctmBean.getRiskType());
			doQuery();
		}
		if(!rctmBean.getModuleName().equals("")) {
			RiskControlTypeManagementPage.selectModuleName(rctmBean.getModuleName());
			doQuery();
		}
	}
	
	@Test(dataProvider="RiskControlRuleManagement_RiskControlTypeManagementByCaseNO",description="运营平台-线上实时风控-风控类型维护-修改")
	public void testUpdate(RiskControlRuleManagement_RiskControlTypeManagementBean rctmBean) {
		RiskControlTypeManagementPage.navigateTo(URL);
		wait.waitFor(500);

		doQueryForClickButton(rctmBean);
		
		RiskControlTypeManagementPage.clickUpdate();
		wait.waitFor(500);
		RiskControlTypeManagementPage.selectUpdate_Module(rctmBean.getUpdate_ModuleName());
		RiskControlTypeManagementPage.setUpdate_RiskControlTypeDescribe(rctmBean.getUpdate_RiskControlTypeDescribe());
		wait.waitFor(2000);
//		RiskControlTypeManagementPage.clickUpdate_Submit();
//		System.out.println(RiskControlTypeManagementPage.getNotice());
//		Reporter.log(RiskControlTypeManagementPage.getNotice());
		RiskControlTypeManagementPage.clickUpdate_Close();
	}
	
	@Test(dataProvider="RiskControlRuleManagement_RiskControlTypeManagementByCaseNO",description="运营平台-线上实时风控-风控类型维护-删除")
	public void testDelete(RiskControlRuleManagement_RiskControlTypeManagementBean rctmBean) {
		RiskControlTypeManagementPage.navigateTo(URL);
		wait.waitFor(500);

		doQueryForClickButton(rctmBean);
		
		RiskControlTypeManagementPage.clickDelete();
		wait.waitFor(1000);
//		RiskControlTypeManagementPage.clickDelete_Submit();
//		System.out.println(RiskControlTypeManagementPage.getNotice());
//		Reporter.log(RiskControlTypeManagementPage.getNotice());
		RiskControlTypeManagementPage.clickDelete_Close();
	}
	
	
	@Test(dataProvider="RiskControlRuleManagement_RiskControlTypeManagementByCaseNO",description="运营平台-线上实时风控-风控类型维护-添加")
	public void testAdd(RiskControlRuleManagement_RiskControlTypeManagementBean rctmBean) {
		RiskControlTypeManagementPage.navigateTo(URL);
		wait.waitFor(500);
		
		RiskControlTypeManagementPage.clickAdd();
		wait.waitFor(500);
		RiskControlTypeManagementPage.setAdd_RiskType(rctmBean.getRiskType());
		RiskControlTypeManagementPage.selectAdd_Module(rctmBean.getModuleName());
		RiskControlTypeManagementPage.setAdd_RiskControlTypeDescribe(rctmBean.getRiskControlTypeDescribe());
		wait.waitFor(2000);
//		RiskControlTypeManagementPage.clickAdd_Submit();
//		System.out.println(RiskControlTypeManagementPage.getNotice());
//		Reporter.log(RiskControlTypeManagementPage.getNotice());
		RiskControlTypeManagementPage.clickAdd_Close();
	}
	
	
	
	public void doQueryForClickButton(RiskControlRuleManagement_RiskControlTypeManagementBean rctmBean) {
		if(!rctmBean.getRiskType().equals("")) {
			RiskControlTypeManagementPage.selectRiskType(rctmBean.getRiskType());
		}
		if(!rctmBean.getModuleName().equals("")) {
			RiskControlTypeManagementPage.selectModuleName(rctmBean.getModuleName());
		}
		RiskControlTypeManagementPage.clickQuery();
		wait.waitFor(500);
		RiskControlTypeManagementPage.clickRadio(rctmBean.getRadio());
		wait.waitFor(500);
	}
	
	
	
}