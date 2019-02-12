package com.dy.AutoTest.OperationPlatform.TestCases.OnlineRiskControl.SuspiciousTradeManagement;

import static org.testng.Assert.assertTrue;

import java.lang.reflect.Method;

import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.dy.AutoTest.web.api.SuperTest;
import com.dy.AutoTest.OperationPlatform.PageObject.OnlineRiskControl.SuspiciousTradeManagement.BeingProcessedSuspiciousTradeMaintainPage;
import com.dy.AutoTest.OperationPlatform.POJO.SuspiciousTradeManagement_BeingProcessedSuspiciousTradeMaintainBean;
import com.dy.AutoTest.web.business.DataBusiness;

public class BeingProcessedSuspiciousTradeMaintainPageTest extends SuperTest{
	BeingProcessedSuspiciousTradeMaintainPage BeingProcessedSuspiciousTradeMaintainPage;
	String URL;

	@BeforeClass
	public void init() {
		/******** instant objectPage *********/
		BeingProcessedSuspiciousTradeMaintainPage=new BeingProcessedSuspiciousTradeMaintainPage(driver);
		//BeingProcessedSuspiciousTradeMaintainPage.setWaitTime(800);

		/******** set URL *********/
		URL=host.toString()+DataBusiness.getData_URL("pop_SuspiciousTradeManagement_BeingProcessedSuspiciousTradeMaintain");

		/******** instant Interface *********/
		iQuery=BeingProcessedSuspiciousTradeMaintainPage;
//		iClickButton=BeingProcessedSuspiciousTradeMaintainPage;
//		iClickRadio=BeingProcessedSuspiciousTradeMaintainPage;
//		iSearchMerchant=BeingProcessedSuspiciousTradeMaintainPage;
	}

	@DataProvider(name="SuspiciousTradeManagement_BeingProcessedSuspiciousTradeMaintain")
	protected static Object[][] parametersPool(){
		data.loadDataBeanList("POP_Data_SuspiciousTradeManagement_BeingProcessedSuspiciousTradeMaintain");
		return data.getDataBeanArray();
	}

	@DataProvider(name="SuspiciousTradeManagement_BeingProcessedSuspiciousTradeMaintainByCaseNO")
	protected static Object[][] parametersPool(Method method){
		data.loadDataBeanList("POP_Data_SuspiciousTradeManagement_BeingProcessedSuspiciousTradeMaintain",method.getName());
		return data.getDataBeanArray();
	}

	@Test(dataProvider="SuspiciousTradeManagement_BeingProcessedSuspiciousTradeMaintainByCaseNO")
	public void testQuery(SuspiciousTradeManagement_BeingProcessedSuspiciousTradeMaintainBean bean) {
		BeingProcessedSuspiciousTradeMaintainPage.navigateTo(URL);
		wait.waitFor(500);
		if(!bean.getMonitorRule().equals("")) {
			BeingProcessedSuspiciousTradeMaintainPage.selectMonitorRule(bean.getMonitorRule());
			doQuery();
		}
		if(!bean.getMerchantNOPhoneNO().equals("")) {
			BeingProcessedSuspiciousTradeMaintainPage.setMerchantNOPhoneNO(bean.getMerchantNOPhoneNO());
			doQuery();
		}
	}
	@Test(dataProvider="SuspiciousTradeManagement_BeingProcessedSuspiciousTradeMaintainByCaseNO")
	public void testSetResult(SuspiciousTradeManagement_BeingProcessedSuspiciousTradeMaintainBean bean) {
		BeingProcessedSuspiciousTradeMaintainPage.navigateTo(URL);
		wait.waitFor(500);
		doQueryForClickButton(bean);
		BeingProcessedSuspiciousTradeMaintainPage.clickWriteProcessResult();
		wait.waitFor(1000);
//		判断update字段是否为空
		if(bean.getWriteProcessResult_HandleSuggestion().equals("")) {
			System.out.println("处理意见字段为必输项，不能为空");
			Reporter.log("处理意见字段为必输项，不能为空");
			assertTrue(false);
		}
		if(bean.getWriteProcessResult_HandleTips().equals("")) {
			System.out.println("处理备注字段为必输项，不能为空");
			Reporter.log("处理备注方式字段为必输项，不能为空");
			assertTrue(false);
		}
		BeingProcessedSuspiciousTradeMaintainPage.selectWriteProcessResult_HandleSuggestion(bean.getWriteProcessResult_HandleSuggestion());
		BeingProcessedSuspiciousTradeMaintainPage.setWriteProcessResult_HandleTips(bean.getWriteProcessResult_HandleTips());
		wait.waitFor(1000);
//		BeingProcessedSuspiciousTradeMaintainPage.clickWriteProcessResult_Submit();
//		System.out.println(BeingProcessedSuspiciousTradeMaintainPage.getNotice());
//		Reporter.log(BeingProcessedSuspiciousTradeMaintainPage.getNotice());
		BeingProcessedSuspiciousTradeMaintainPage.clickWriteProcessResult_Close();
	}



	public void doQueryForClickButton(SuspiciousTradeManagement_BeingProcessedSuspiciousTradeMaintainBean bean) {
		if(!bean.getMonitorRule().equals("")) {
			BeingProcessedSuspiciousTradeMaintainPage.selectMonitorRule(bean.getMonitorRule());
		}
		if(!bean.getMerchantNOPhoneNO().equals("")) {
			BeingProcessedSuspiciousTradeMaintainPage.setMerchantNOPhoneNO(bean.getMerchantNOPhoneNO());
		}
		BeingProcessedSuspiciousTradeMaintainPage.clickQuery();
		wait.waitFor(500);
		BeingProcessedSuspiciousTradeMaintainPage.clickRadio(bean.getRadio());
		wait.waitFor(500);
	}
}