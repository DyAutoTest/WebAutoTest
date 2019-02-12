package com.dy.AutoTest.OperationPlatform.TestCases.OnlineRiskControl.RiskControlLvMaintain;

import static org.testng.Assert.assertTrue;

import java.lang.reflect.Method;

import org.testng.Reporter;
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
//	iSearchMerchant=RiskMonitorRuleMaintainPage;
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
	public void testQuery(RiskControlLvMaintain_RiskMonitorRuleMaintainBean bean) {
		RiskMonitorRuleMaintainPage.navigateTo(URL);
		wait.waitFor(500);
		if(!bean.getRiskMonitorRuleID().equals("")) {
			RiskMonitorRuleMaintainPage.setRiskMonitorRuleID(bean.getRiskMonitorRuleID());
			doQuery();
		}
	}
	@Test(dataProvider="RiskControlLvMaintain_RiskMonitorRuleMaintainByCaseNO")
	public void testCheck(RiskControlLvMaintain_RiskMonitorRuleMaintainBean bean) {
		RiskMonitorRuleMaintainPage.navigateTo(URL);
		wait.waitFor(500);
		doQueryForClickButton(bean);
		RiskMonitorRuleMaintainPage.clickCheck();
		wait.waitFor(2000);
		RiskMonitorRuleMaintainPage.clickCheck_Close();
	}
	@Test(dataProvider="RiskControlLvMaintain_RiskMonitorRuleMaintainByCaseNO")
	public void testDelete(RiskControlLvMaintain_RiskMonitorRuleMaintainBean bean) {
		RiskMonitorRuleMaintainPage.navigateTo(URL);
		wait.waitFor(500);
		doQueryForClickButton(bean);
		RiskMonitorRuleMaintainPage.clickDelete();
		wait.waitFor(1000);
//		RiskMonitorRuleMaintainPage.clickDelete_Confirm();
//		System.out.println(RiskMonitorRuleMaintainPage.getNotice());
//		Reporter.log(RiskMonitorRuleMaintainPage.getNotice());
		RiskMonitorRuleMaintainPage.clickDelete_Close();
	}
	@Test(dataProvider="RiskControlLvMaintain_RiskMonitorRuleMaintainByCaseNO")
	public void testUpdate(RiskControlLvMaintain_RiskMonitorRuleMaintainBean bean) {
		RiskMonitorRuleMaintainPage.navigateTo(URL);
		wait.waitFor(500);
		doQueryForClickButton(bean);
		RiskMonitorRuleMaintainPage.clickUpdate();
		wait.waitFor(1000);
//		判断update字段是否为空
		if(!bean.getUpdate_MonitorWay().equals("")) {
			RiskMonitorRuleMaintainPage.setUpdate_MonitorWay(bean.getUpdate_MonitorWay());
		}
		if(!bean.getUpdate_InformEmail().equals("")) {
			RiskMonitorRuleMaintainPage.setUpdate_InformEmail(bean.getUpdate_InformEmail());
		}
		if(!bean.getUpdate_InformPhone().equals("")) {
			RiskMonitorRuleMaintainPage.setUpdate_InformPhone(bean.getUpdate_InformPhone());
		}
//		RiskMonitorRuleMaintainPage.clickUpdate_Submit();
//		System.out.println(RiskMonitorRuleMaintainPage.getNotice());
//		Reporter.log(RiskMonitorRuleMaintainPage.getNotice());
		RiskMonitorRuleMaintainPage.clickUpdate_Close();
	}
	@Test(dataProvider="RiskControlLvMaintain_RiskMonitorRuleMaintainByCaseNO")
	public void testAdd(RiskControlLvMaintain_RiskMonitorRuleMaintainBean bean) {
		RiskMonitorRuleMaintainPage.navigateTo(URL);
		wait.waitFor(500);
//		add需要先判断必输项的测试数据是否为空
		if(bean.getRiskLv().equals("")) {
			System.out.println("风险级别字段为必输项，不能为空");
			Reporter.log("风险级别字段为必输项，不能为空");
			assertTrue(false);
		}
		if(bean.getRiskMonitorRuleID().equals("")) {
			System.out.println("风险监控规则ID字段为必输项，不能为空");
			Reporter.log("风险监控规则ID字段为必输项，不能为空");
			assertTrue(false);
		}
		if(bean.getMonitorWay().equals("")) {
			System.out.println("监控方式字段为必输项，不能为空");
			Reporter.log("监控方式字段为必输项，不能为空");
			assertTrue(false);
		}
		if(bean.getInformEmail().equals("")) {
			System.out.println("通知邮箱字段为必输项，不能为空");
			Reporter.log("通知邮箱字段为必输项，不能为空");
			assertTrue(false);
		}
		if(bean.getInformPhone().equals("")) {
			System.out.println("通知手机号字段为必输项，不能为空");
			Reporter.log("通知手机号字段为必输项，不能为空");
			assertTrue(false);
		}
		RiskMonitorRuleMaintainPage.clickAdd();
		wait.waitFor(1000);
		RiskMonitorRuleMaintainPage.setAdd_RiskLv(bean.getRiskLv());
		RiskMonitorRuleMaintainPage.setAdd_RiskMonitorRuleID(bean.getRiskMonitorRuleID());
		RiskMonitorRuleMaintainPage.setAdd_MonitorWay(bean.getMonitorWay());
		RiskMonitorRuleMaintainPage.setAdd_InformEmail(bean.getInformEmail());
		RiskMonitorRuleMaintainPage.setAdd_InformPhone(bean.getInformPhone());
		wait.waitFor(1000);
//		RiskMonitorRuleMaintainPage.clickAdd_Submit();
//		System.out.println(RiskMonitorRuleMaintainPage.getNotice());
//		Reporter.log(RiskMonitorRuleMaintainPage.getNotice());
		RiskMonitorRuleMaintainPage.clickAdd_Close();
	}


	public void doQueryForClickButton(RiskControlLvMaintain_RiskMonitorRuleMaintainBean bean) {
		if(!bean.getRiskMonitorRuleID().equals("")) {
			RiskMonitorRuleMaintainPage.setRiskMonitorRuleID(bean.getRiskMonitorRuleID());
		}
		RiskMonitorRuleMaintainPage.clickQuery();
		wait.waitFor(500);
		RiskMonitorRuleMaintainPage.clickRadio(bean.getRadio());
		wait.waitFor(500);
	}
}