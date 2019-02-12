package com.dy.AutoTest.OperationPlatform.TestCases.OnlineRiskControl.SuspiciousTradeManagement;

import static org.testng.Assert.assertTrue;

import java.lang.reflect.Method;

import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.dy.AutoTest.web.api.SuperTest;
import com.dy.AutoTest.OperationPlatform.PageObject.OnlineRiskControl.SuspiciousTradeManagement.SuspiciousTradeAnalyzePage;
import com.dy.AutoTest.OperationPlatform.POJO.SuspiciousTradeManagement_SuspiciousTradeAnalyzeBean;
import com.dy.AutoTest.web.business.DataBusiness;

public class SuspiciousTradeAnalyzePageTest extends SuperTest{
	SuspiciousTradeAnalyzePage SuspiciousTradeAnalyzePage;
	String URL;

	@BeforeClass
	public void init() {
		/******** instant objectPage *********/
		SuspiciousTradeAnalyzePage=new SuspiciousTradeAnalyzePage(driver);
		//SuspiciousTradeAnalyzePage.setWaitTime(800);

		/******** set URL *********/
		URL=host.toString()+DataBusiness.getData_URL("pop_SuspiciousTradeManagement_SuspiciousTradeAnalyze");

		/******** instant Interface *********/
		iQuery=SuspiciousTradeAnalyzePage;
//		iClickButton=SuspiciousTradeAnalyzePage;
//		iClickRadio=SuspiciousTradeAnalyzePage;
//		iSearchMerchant=SuspiciousTradeAnalyzePage;
	}

	@DataProvider(name="SuspiciousTradeManagement_SuspiciousTradeAnalyze")
	protected static Object[][] parametersPool(){
		data.loadDataBeanList("POP_Data_SuspiciousTradeManagement_SuspiciousTradeAnalyze");
		return data.getDataBeanArray();
	}

	@DataProvider(name="SuspiciousTradeManagement_SuspiciousTradeAnalyzeByCaseNO")
	protected static Object[][] parametersPool(Method method){
		data.loadDataBeanList("POP_Data_SuspiciousTradeManagement_SuspiciousTradeAnalyze",method.getName());
		return data.getDataBeanArray();
	}

	@Test(dataProvider="SuspiciousTradeManagement_SuspiciousTradeAnalyzeByCaseNO")
	public void testQuery(SuspiciousTradeManagement_SuspiciousTradeAnalyzeBean bean) {
		SuspiciousTradeAnalyzePage.navigateTo(URL);
		wait.waitFor(500);
		if(!bean.getMonitorRule().equals("")) {
			SuspiciousTradeAnalyzePage.selectMonitorRule(bean.getMonitorRule());
			doQuery();
		}
		if(!bean.getMerchantNOPhoneNO().equals("")) {
			SuspiciousTradeAnalyzePage.setMerchantNOPhoneNO(bean.getMerchantNOPhoneNO());
			doQuery();
		}
	}
	@Test(dataProvider="SuspiciousTradeManagement_SuspiciousTradeAnalyzeByCaseNO")
	public void testAnalyze(SuspiciousTradeManagement_SuspiciousTradeAnalyzeBean bean) {
		SuspiciousTradeAnalyzePage.navigateTo(URL);
		wait.waitFor(500);
		doQueryForClickButton(bean);
//		判断update字段是否为空
		if(bean.getSuspiciousTradeAnalyze_CheckAnalyze().equals("")) {
			System.out.println("排查分析字段为必输项，不能为空");
			Reporter.log("排查分析字段为必输项，不能为空");
			assertTrue(false);
		}
		if(bean.getSuspiciousTradeAnalyze_Tips().equals("")) {
			System.out.println("备注字段为必输项，不能为空");
			Reporter.log("备注方式字段为必输项，不能为空");
			assertTrue(false);
		}
		SuspiciousTradeAnalyzePage.clickSuspiciousTradeAnalyze();
		wait.waitFor(1000);
		SuspiciousTradeAnalyzePage.selectSuspiciousTradeAnalyze_CheckAnalyze(bean.getSuspiciousTradeAnalyze_CheckAnalyze());
		SuspiciousTradeAnalyzePage.setSuspiciousTradeAnalyze_Tips(bean.getSuspiciousTradeAnalyze_Tips());
		wait.waitFor(1000);
//		SuspiciousTradeAnalyzePage.clickSuspiciousTradeAnalyze_Submit();
//		System.out.println(SuspiciousTradeAnalyzePage.getNotice());
//		Reporter.log(SuspiciousTradeAnalyzePage.getNotice());
		SuspiciousTradeAnalyzePage.clickSuspiciousTradeAnalyze_Close();
	}
	@Test(dataProvider="SuspiciousTradeManagement_SuspiciousTradeAnalyzeByCaseNO")
	public void testAdd(SuspiciousTradeManagement_SuspiciousTradeAnalyzeBean bean) {
		SuspiciousTradeAnalyzePage.navigateTo(URL);
		wait.waitFor(500);
//		add需要先判断必输项的测试数据是否为空
		if(bean.getMerchantNOPhoneNO().equals("")) {
			System.out.println("商户编号/手机号字段为必输项，不能为空");
			Reporter.log("商户编号/手机号字段为必输项，不能为空");
			assertTrue(false);
		}
		if(bean.getMonitorRule().equals("")) {
			System.out.println("商户编号/手机号字段为必输项，不能为空");
			Reporter.log("商户编号/手机号字段为必输项，不能为空");
			assertTrue(false);
		}
		if(bean.getMonitorSource().equals("")) {
			System.out.println("监控来源字段为必输项，不能为空");
			Reporter.log("监控来源字段为必输项，不能为空");
			assertTrue(false);
		}
		if(bean.getMonitorOperationResult().equals("")) {
			System.out.println("监控操作结果字段为必输项，不能为空");
			Reporter.log("监控操作结果字段为必输项，不能为空");
			assertTrue(false);
		}
		SuspiciousTradeAnalyzePage.clickAdd();
		wait.waitFor(1000);
		SuspiciousTradeAnalyzePage.setAdd_MerchantNOPhoneNO(bean.getMerchantNOPhoneNO());
		if(!bean.getInnerOrderNO().equals("")) {
			SuspiciousTradeAnalyzePage.setAdd_InnerOrderNO(bean.getInnerOrderNO());
		}
		SuspiciousTradeAnalyzePage.selectAdd_MonitorRules(bean.getMonitorRule());
		SuspiciousTradeAnalyzePage.selectAdd_MonitorSource(bean.getMonitorSource());
		SuspiciousTradeAnalyzePage.selectAdd_MonitorOperationResult(bean.getMonitorOperationResult());
		wait.waitFor(1000);
//		SuspiciousTradeAnalyzePage.clickAdd_Submit();
//		System.out.println(SuspiciousTradeAnalyzePage.getNotice());
//		Reporter.log(SuspiciousTradeAnalyzePage.getNotice());
		SuspiciousTradeAnalyzePage.clickAdd_Close();
	}


	public void doQueryForClickButton(SuspiciousTradeManagement_SuspiciousTradeAnalyzeBean bean) {
		if(!bean.getMonitorRule().equals("")) {
			SuspiciousTradeAnalyzePage.selectMonitorRule(bean.getMonitorRule());
		}
		if(!bean.getMerchantNOPhoneNO().equals("")) {
			SuspiciousTradeAnalyzePage.setMerchantNOPhoneNO(bean.getMerchantNOPhoneNO());
		}
		SuspiciousTradeAnalyzePage.clickQuery();
		wait.waitFor(500);
		SuspiciousTradeAnalyzePage.clickRadio(bean.getRadio());
		wait.waitFor(500);
	}
}