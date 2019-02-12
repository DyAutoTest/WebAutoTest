package com.dy.AutoTest.OperationPlatform.TestCases.OnlineRiskControl.MonitorRulesManagement;

import static org.testng.Assert.assertTrue;

import java.lang.reflect.Method;

import org.testng.Reporter;
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
//		iClickButton=MonitorParameterMaintainPage;
//		iClickRadio=MonitorParameterMaintainPage;
//		iSearchMerchant=MonitorParameterMaintainPage;
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
	public void testQuery(MonitorRulesManagement_MonitorParameterMaintainBean bean) {
		MonitorParameterMaintainPage.navigateTo(URL);
		wait.waitFor(500);
		if(!bean.getMonitorRule().equals("")) {
			MonitorParameterMaintainPage.selectMonitorRule(bean.getMonitorRule());
			doQuery();
		}

	}
	@Test(dataProvider="MonitorRulesManagement_MonitorParameterMaintainByCaseNO")
	public void testCheck(MonitorRulesManagement_MonitorParameterMaintainBean bean) {
		MonitorParameterMaintainPage.navigateTo(URL);
		wait.waitFor(500);
		doQueryForClickButton(bean);
		MonitorParameterMaintainPage.clickCheck();
		wait.waitFor(2000);
		MonitorParameterMaintainPage.clickCheck_Close();
	}
	@Test(dataProvider="MonitorRulesManagement_MonitorParameterMaintainByCaseNO")
	public void testDelete(MonitorRulesManagement_MonitorParameterMaintainBean bean) {
		MonitorParameterMaintainPage.navigateTo(URL);
		wait.waitFor(500);
		doQueryForClickButton(bean);
		MonitorParameterMaintainPage.clickDelete();
		wait.waitFor(1000);
//		MonitorParameterMaintainPage.clickDelete_Confirm();
//		System.out.println(MonitorParameterMaintainPage.getNotice());
//		Reporter.log(MonitorParameterMaintainPage.getNotice());
		MonitorParameterMaintainPage.clickDelete_Close();
	}
	@Test(dataProvider="MonitorRulesManagement_MonitorParameterMaintainByCaseNO")
	public void testUpdate(MonitorRulesManagement_MonitorParameterMaintainBean bean) {
		MonitorParameterMaintainPage.navigateTo(URL);
		wait.waitFor(500);
		doQueryForClickButton(bean);
		MonitorParameterMaintainPage.clickUpdate();
		wait.waitFor(1000);
//		判断update字段是否为空
		if(!bean.getUpdate_MonitorParameterName().equals("")) {
			MonitorParameterMaintainPage.setUpdate_MonitorParameterName(bean.getUpdate_MonitorParameterName());
		}
		if(!bean.getUpdate_MonitorParameterValue().equals("")) {
			MonitorParameterMaintainPage.setUpdate_MonitorParameterValue(bean.getUpdate_MonitorParameterValue());
		}
		if(!bean.getUpdate_PersonalMonitorParameterValue().equals("")) {
			MonitorParameterMaintainPage.setUpdate_PersonalMonitorParameterValue(bean.getUpdate_PersonalMonitorParameterValue());
		}
		if(!bean.getUpdate_MerchantMonitorParameterValue().equals("")) {
			MonitorParameterMaintainPage.setUpdate_MerchantMonitorParameterValue(bean.getUpdate_MerchantMonitorParameterValue());
		}
		wait.waitFor(1000);
//		MonitorParameterMaintainPage.clickUpdate_Submit();
//		System.out.println(MonitorParameterMaintainPage.getNotice());
//		Reporter.log(MonitorParameterMaintainPage.getNotice());
		MonitorParameterMaintainPage.clickUpdate_Close();
	}
	@Test(dataProvider="MonitorRulesManagement_MonitorParameterMaintainByCaseNO")
	public void testAdd(MonitorRulesManagement_MonitorParameterMaintainBean bean) {
		MonitorParameterMaintainPage.navigateTo(URL);
		wait.waitFor(500);
//		add需要先判断必输项的测试数据是否为空
		if(bean.getMonitorRule().equals("")) {
			System.out.println("监控规则字段为必输项，不能为空");
			Reporter.log("监控规则字段为必输项，不能为空");
			assertTrue(false);
		}
		if(bean.getMonitorParameterMaintain().equals("")) {
			System.out.println("监控参数名称字段为必输项，不能为空");
			Reporter.log("监控参数名称字段为必输项，不能为空");
			assertTrue(false);
		}

		MonitorParameterMaintainPage.clickAdd();
		MonitorParameterMaintainPage.selectAdd_MonitorRule(bean.getMonitorRule());
		MonitorParameterMaintainPage.setAdd_MonitorParameterMaintain(bean.getMonitorParameterMaintain());
		if(!bean.getMonitorParameterValue().equals("")) {
			MonitorParameterMaintainPage.setAdd_MonitorParameterValue(bean.getMonitorParameterValue());
		}
		if(!bean.getPersonalMonitorParameterValue().equals("")) {
			MonitorParameterMaintainPage.setAdd_PersonalMonitorParameterValue(bean.getPersonalMonitorParameterValue());
		}
		if(!bean.getMerchantMonitorParameterValue().equals("")) {
			MonitorParameterMaintainPage.setAdd_MerchantMonitorParameterValue(bean.getMerchantMonitorParameterValue());
		}
		wait.waitFor(1000);
//		MonitorParameterMaintainPage.clickAdd_Submit();
//		System.out.println(MonitorParameterMaintainPage.getNotice());
//		Reporter.log(MonitorParameterMaintainPage.getNotice());
		MonitorParameterMaintainPage.clickAdd_Close();
	}


	public void doQueryForClickButton(MonitorRulesManagement_MonitorParameterMaintainBean bean) {
		if(!bean.getMonitorRule().equals("")) {
			MonitorParameterMaintainPage.selectMonitorRule(bean.getMonitorRule());
		}
		MonitorParameterMaintainPage.clickQuery();
		wait.waitFor(500);
		MonitorParameterMaintainPage.clickRadio(bean.getRadio());
		wait.waitFor(500);
	}
}