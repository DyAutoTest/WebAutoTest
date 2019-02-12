package com.dy.AutoTest.OperationPlatform.TestCases.OnlineRiskControl.ComplianceMaintain;

import static org.testng.Assert.assertTrue;

import java.lang.reflect.Method;

import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.dy.AutoTest.web.api.SuperTest;
import com.dy.AutoTest.OperationPlatform.PageObject.OnlineRiskControl.ComplianceMaintain.TradeVerificationWaySetPage;
import com.dy.AutoTest.OperationPlatform.POJO.ComplianceMaintain_TradeVerificationWaySetBean;
import com.dy.AutoTest.web.business.DataBusiness;

public class TradeVerificationWaySetPageTest extends SuperTest{
	TradeVerificationWaySetPage TradeVerificationWaySetPage;
	String URL;

	@BeforeClass
	public void init() {
		/******** instant objectPage *********/
		TradeVerificationWaySetPage=new TradeVerificationWaySetPage(driver);
		//TradeVerificationWaySetPage.setWaitTime(800);

		/******** set URL *********/
		URL=host.toString()+DataBusiness.getData_URL("pop_ComplianceMaintain_TradeVerificationWaySet");

		/******** instant Interface *********/
		iQuery=TradeVerificationWaySetPage;
//	iClickButton=TradeVerificationWaySetPage;
//	iClickRadio=TradeVerificationWaySetPage;
//	iSearchMerchant=TradeVerificationWaySetPage;
	}

	@DataProvider(name="ComplianceMaintain_TradeVerificationWaySet")
	protected static Object[][] parametersPool(){
		data.loadDataBeanList("POP_Data_ComplianceMaintain_TradeVerificationWaySet");
		return data.getDataBeanArray();
	}

	@DataProvider(name="ComplianceMaintain_TradeVerificationWaySetByCaseNO")
	protected static Object[][] parametersPool(Method method){
		data.loadDataBeanList("POP_Data_ComplianceMaintain_TradeVerificationWaySet",method.getName());
		return data.getDataBeanArray();
	}

	@Test(dataProvider="ComplianceMaintain_TradeVerificationWaySetByCaseNO")
	public void testQuery(ComplianceMaintain_TradeVerificationWaySetBean ctvwsBean) {
		TradeVerificationWaySetPage.navigateTo(URL);
		wait.waitFor(500);
		if(!ctvwsBean.getModeID().equals("")) {
			TradeVerificationWaySetPage.setModeID(ctvwsBean.getModeID());
			doQuery();
		}
	}
	
	@Test(dataProvider="ComplianceMaintain_TradeVerificationWaySetByCaseNO")
	public void testCheck(ComplianceMaintain_TradeVerificationWaySetBean ctvwsBean) {
		TradeVerificationWaySetPage.navigateTo(URL);
		wait.waitFor(500);
		doQueryForClickButton(ctvwsBean);
		TradeVerificationWaySetPage.clickCheck();
		wait.waitFor(2000);
		TradeVerificationWaySetPage.clickCheck_Close();
	}
	@Test(dataProvider="ComplianceMaintain_TradeVerificationWaySetByCaseNO")
	public void testDelete(ComplianceMaintain_TradeVerificationWaySetBean ctvwsBean) {
		TradeVerificationWaySetPage.navigateTo(URL);
		wait.waitFor(500);
		doQueryForClickButton(ctvwsBean);
		TradeVerificationWaySetPage.clickDelete();
		wait.waitFor(1000);
//		TradeVerificationWaySetPage.clickDelete_Confirm();
//		System.out.println(TradeVerificationWaySetPage.getNotice());
//		Reporter.log(TradeVerificationWaySetPage.getNotice());
		TradeVerificationWaySetPage.clickDelete_Close();
	}
	@Test(dataProvider="ComplianceMaintain_TradeVerificationWaySetByCaseNO")
	public void testUpdate(ComplianceMaintain_TradeVerificationWaySetBean ctvwsBean) {
		TradeVerificationWaySetPage.navigateTo(URL);
		wait.waitFor(500);
		doQueryForClickButton(ctvwsBean);
		TradeVerificationWaySetPage.clickUpdate();
		wait.waitFor(1000);
		if(!ctvwsBean.getUpdate_DailyLimit().equals("")) {
			TradeVerificationWaySetPage.setUpdate_DailyLimit(ctvwsBean.getUpdate_DailyLimit());
		}
		if(!ctvwsBean.getUpdate_VerificationWay().equals("")) {
			TradeVerificationWaySetPage.selectUpdate_VerificationWay(ctvwsBean.getUpdate_VerificationWay());
		}
		if(!ctvwsBean.getUpdate_VerificationQuantity().equals("")) {
			TradeVerificationWaySetPage.setUpdate_VerificationQuantity(ctvwsBean.getUpdate_VerificationQuantity());
		}
		wait.waitFor(1000);
//		TradeVerificationWaySetPage.clickUpdate_Submit();
//		System.out.println(TradeVerificationWaySetPage.getNotice());
//		Reporter.log(TradeVerificationWaySetPage.getNotice());
		TradeVerificationWaySetPage.clickUpdate_Close();
	}
	@Test(dataProvider="ComplianceMaintain_TradeVerificationWaySetByCaseNO")
	public void testAdd(ComplianceMaintain_TradeVerificationWaySetBean ctvwsBean) {
		TradeVerificationWaySetPage.navigateTo(URL);
		wait.waitFor(500);
		if(ctvwsBean.getModeID().equals("")) {
			System.out.println("ID字段为必输项，不能为空");
			Reporter.log("ID字段为必输项，不能为空");
			assertTrue(false);
		}
		if(ctvwsBean.getDailyLimit().equals("")) {
			System.out.println("日限额字段为必输项，不能为空");
			Reporter.log("日限额字段为必输项，不能为空");
			assertTrue(false);
		}
		if(ctvwsBean.getVerificationWay().equals("")) {
			System.out.println("验证方式字段为必输项，不能为空");
			Reporter.log("验证方式字段为必输项，不能为空");
			assertTrue(false);
		}
		if(ctvwsBean.getVerificationQuantity().equals("")) {
			System.out.println("验证数量字段为必输项，不能为空");
			Reporter.log("验证数量字段为必输项，不能为空");
			assertTrue(false);
		}
		TradeVerificationWaySetPage.clickAdd();
		wait.waitFor(1000);
		TradeVerificationWaySetPage.setAdd_ID(ctvwsBean.getModeID());
		TradeVerificationWaySetPage.setAdd_DailyLimit(ctvwsBean.getDailyLimit());
		TradeVerificationWaySetPage.selectAdd_VerificationWay(ctvwsBean.getVerificationWay());
		TradeVerificationWaySetPage.setAdd_VerificationQuantity(ctvwsBean.getVerificationQuantity());
		wait.waitFor(1000);
//		TradeVerificationWaySetPage.clickAdd_Submit();
//		System.out.println(TradeVerificationWaySetPage.getNotice());
//		Reporter.log(TradeVerificationWaySetPage.getNotice());
		TradeVerificationWaySetPage.clickAdd_Close();
	}
	
	public void doQueryForClickButton(ComplianceMaintain_TradeVerificationWaySetBean ctvwsBean) {
		//主要功能是if的填值，query点击，radio选择
		if(!ctvwsBean.getModeID().equals("")) {
			TradeVerificationWaySetPage.setModeID(ctvwsBean.getModeID());
		}
		TradeVerificationWaySetPage.clickQuery();
		wait.waitFor(500);
		TradeVerificationWaySetPage.clickRadio(ctvwsBean.getRadio());
		wait.waitFor(500);
		
	}
	
}