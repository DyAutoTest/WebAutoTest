package com.dy.AutoTest.OperationPlatform.TestCases.OnlineRiskControl.MonitorRulesManagement;

import static org.testng.Assert.assertTrue;

import java.lang.reflect.Method;

import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.dy.AutoTest.web.api.SuperTest;
import com.dy.AutoTest.OperationPlatform.PageObject.OnlineRiskControl.MonitorRulesManagement.MonitorOperationMaintainPage;
import com.dy.AutoTest.OperationPlatform.POJO.MonitorRulesManagement_MonitorOperationMaintainBean;
import com.dy.AutoTest.web.business.DataBusiness;

public class MonitorOperationMaintainPageTest extends SuperTest{
	MonitorOperationMaintainPage MonitorOperationMaintainPage;
	String URL;

	@BeforeClass
	public void init() {
		/******** instant objectPage *********/
		MonitorOperationMaintainPage=new MonitorOperationMaintainPage(driver);
		//MonitorOperationMaintainPage.setWaitTime(800);

		/******** set URL *********/
		URL=host.toString()+DataBusiness.getData_URL("pop_MonitorRulesManagement_MonitorOperationMaintain");

		/******** instant Interface *********/
		iQuery=MonitorOperationMaintainPage;
//		iClickButton=MonitorOperationMaintainPage;
//		iClickRadio=MonitorOperationMaintainPage;
//		iSearchMerchant=MonitorOperationMaintainPage;
	}

	@DataProvider(name="MonitorRulesManagement_MonitorOperationMaintain")
	protected static Object[][] parametersPool(){
		data.loadDataBeanList("POP_Data_MonitorRulesManagement_MonitorOperationMaintain");
		return data.getDataBeanArray();
	}

	@DataProvider(name="MonitorRulesManagement_MonitorOperationMaintainByCaseNO")
	protected static Object[][] parametersPool(Method method){
		data.loadDataBeanList("POP_Data_MonitorRulesManagement_MonitorOperationMaintain",method.getName());
		return data.getDataBeanArray();
	}

	@Test(dataProvider="MonitorRulesManagement_MonitorOperationMaintainByCaseNO")
	public void testQuery(MonitorRulesManagement_MonitorOperationMaintainBean bean) {
		MonitorOperationMaintainPage.navigateTo(URL);
		wait.waitFor(500);
		if(!bean.getMonitorRule().equals("")) {
			MonitorOperationMaintainPage.selectMonitorRule(bean.getMonitorRule());
			doQuery();
		}
	}
	@Test(dataProvider="MonitorRulesManagement_MonitorOperationMaintainByCaseNO")
	public void testCheck(MonitorRulesManagement_MonitorOperationMaintainBean bean) {
		MonitorOperationMaintainPage.navigateTo(URL);
		wait.waitFor(500);
		doQueryForClickButton(bean);
		MonitorOperationMaintainPage.clickCheck();
		wait.waitFor(2000);
		MonitorOperationMaintainPage.clickCheck_Close();
	}
	@Test(dataProvider="MonitorRulesManagement_MonitorOperationMaintainByCaseNO")
	public void testDelete(MonitorRulesManagement_MonitorOperationMaintainBean bean) {
		MonitorOperationMaintainPage.navigateTo(URL);
		wait.waitFor(500);
		doQueryForClickButton(bean);
		MonitorOperationMaintainPage.clickDelete();
		wait.waitFor(1000);
//		MonitorOperationMaintainPage.clickDelete_Confirm();
//		System.out.println(MonitorOperationMaintainPage.getNotice());
//		Reporter.log(MonitorOperationMaintainPage.getNotice());
		MonitorOperationMaintainPage.clickDelete_Close();
	}
	@Test(dataProvider="MonitorRulesManagement_MonitorOperationMaintainByCaseNO")
	public void testUpdate(MonitorRulesManagement_MonitorOperationMaintainBean bean) {
		MonitorOperationMaintainPage.navigateTo(URL);
		wait.waitFor(500);
		doQueryForClickButton(bean);
		MonitorOperationMaintainPage.clickUpdate();
		wait.waitFor(1000);
//		判断update字段是否为空
		if(!bean.getUpdate_MonitorOperation().equals("")) {
			MonitorOperationMaintainPage.selectUpdate_MonitorOperation(bean.getUpdate_MonitorOperation());
		}
		wait.waitFor(1000);
//		MonitorOperationMaintainPage.clickUpdate_Submit();
//		System.out.println(MonitorOperationMaintainPage.getNotice());
//		Reporter.log(MonitorOperationMaintainPage.getNotice());
		MonitorOperationMaintainPage.clickUpdate_Close();
	}
	@Test(dataProvider="MonitorRulesManagement_MonitorOperationMaintainByCaseNO")
	public void testAdd(MonitorRulesManagement_MonitorOperationMaintainBean bean) {
		MonitorOperationMaintainPage.navigateTo(URL);
		wait.waitFor(500);
//		add需要先判断必输项的测试数据是否为空
		if(bean.getMonitorRule().equals("")) {
			System.out.println("监控规则字段为必输项，不能为空");
			Reporter.log("监控规则字段为必输项，不能为空");
			assertTrue(false);
		}
		if(bean.getMonitorOperation().equals("")) {
			System.out.println("监控操作字段为必输项，不能为空");
			Reporter.log("监控操作字段为必输项，不能为空");
			assertTrue(false);
		}
		MonitorOperationMaintainPage.clickAdd();
		wait.waitFor(1000);
		MonitorOperationMaintainPage.selectAdd_MonitorRule(bean.getMonitorRule());
		MonitorOperationMaintainPage.selectAdd_MonitorOperation(bean.getMonitorOperation());
		wait.waitFor(1000);

//		MonitorOperationMaintainPage.clickAdd_Submit();
//		System.out.println(MonitorOperationMaintainPage.getNotice());
//		Reporter.log(MonitorOperationMaintainPage.getNotice());
		MonitorOperationMaintainPage.clickAdd_Close();
	}


	public void doQueryForClickButton(MonitorRulesManagement_MonitorOperationMaintainBean bean) {
		if(!bean.getMonitorRule().equals("")) {
			MonitorOperationMaintainPage.selectMonitorRule(bean.getMonitorRule());
		}
		MonitorOperationMaintainPage.clickQuery();
		wait.waitFor(500);
		MonitorOperationMaintainPage.clickRadio(bean.getRadio());
		wait.waitFor(500);
	}
}