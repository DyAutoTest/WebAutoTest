package com.dy.AutoTest.OperationPlatform.TestCases.SettlementManagement.Clearing;

import java.lang.reflect.Method;

import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.dy.AutoTest.web.api.SuperTest;
import com.dy.AutoTest.OperationPlatform.PageObject.SettlementManagement.Clearing.TradeClearingManagementOrderQueryPage;
import com.dy.AutoTest.OperationPlatform.POJO.SettlementManagement_TradeClearingManagementOrderQueryBean;
import com.dy.AutoTest.web.business.DataBusiness;

public class TradeClearingManagementOrderQueryPageTest extends SuperTest{
	TradeClearingManagementOrderQueryPage TradeClearingManagementOrderQueryPage;
	String URL;

	@BeforeClass
	public void init() {
		/******** instant objectPage *********/
		TradeClearingManagementOrderQueryPage=new TradeClearingManagementOrderQueryPage(driver);
		//TradeClearingManagementOrderQueryPage.setWaitTime(800);

		/******** set URL *********/
		URL=host.toString()+DataBusiness.getData_URL("pop_SettlementManagement_TradeClearingManagementOrderQuery");

		/******** instant Interface *********/
		iQuery=TradeClearingManagementOrderQueryPage;
		iClickButton=TradeClearingManagementOrderQueryPage;
		iClickRadio=TradeClearingManagementOrderQueryPage;
		iSearchMerchantByNOorName=TradeClearingManagementOrderQueryPage;
	}

	@DataProvider(name="SettlementManagement_TradeClearingManagementOrderQuery")
	protected static Object[][] parametersPool(){
		data.loadDataBeanList("POP_Data_SettlementManagement_TradeClearingManagementOrderQuery");
		return data.getDataBeanArray();
	}

	@DataProvider(name="SettlementManagement_TradeClearingManagementOrderQueryByCaseNO")
	protected static Object[][] parametersPool(Method method){
		data.loadDataBeanList("POP_Data_SettlementManagement_TradeClearingManagementOrderQuery",method.getName());
		return data.getDataBeanArray();
	}

	@Test(dataProvider="SettlementManagement_TradeClearingManagementOrderQueryByCaseNO")
	public void testQuery(SettlementManagement_TradeClearingManagementOrderQueryBean stcmoqBean) {
		TradeClearingManagementOrderQueryPage.navigateTo(URL);
		wait.waitFor(500);
		
		if(!stcmoqBean.getMerchantNO().equals("")||!stcmoqBean.getMerchantName().equals("")) {
			doSearchMerchantByNOorName(stcmoqBean.getMerchantNO(), stcmoqBean.getMerchantName(), stcmoqBean.getRadio());
			doQuery();
		}
		if(!stcmoqBean.getAccountingDateBegin().equals("")&&!stcmoqBean.getAccountingDateEnd().equals("")) {
			TradeClearingManagementOrderQueryPage.setAccountingDateBegin(stcmoqBean.getAccountingDateBegin());
			TradeClearingManagementOrderQueryPage.setAccountingDateEnd(stcmoqBean.getAccountingDateEnd());
			doQuery();
		}
		if(!stcmoqBean.getOrderDateBegin().equals("")&&!stcmoqBean.getOrderDateEnd().equals("")) {
			TradeClearingManagementOrderQueryPage.setOrderDateBegin(stcmoqBean.getOrderDateBegin());
			TradeClearingManagementOrderQueryPage.setOrderDateEnd(stcmoqBean.getOrderDateEnd());
			TradeClearingManagementOrderQueryPage.doLoseFocus("OrderDateEnd", 120, 0);
			doQuery();
		}
		if(!stcmoqBean.getOrderNO().equals("")) {
			TradeClearingManagementOrderQueryPage.setOrderNO(stcmoqBean.getOrderNO());
			doQuery();
		}
		if(!stcmoqBean.getOrderStatus().equals("")) {
			TradeClearingManagementOrderQueryPage.selectOrderStatus(stcmoqBean.getOrderStatus());
			doQuery();
		}
		if(!stcmoqBean.getBusinessChannel().equals("")) {
			TradeClearingManagementOrderQueryPage.selectBusinessChannel(stcmoqBean.getBusinessChannel());
			doQuery();
		}
		if(!stcmoqBean.getTradeType().equals("")) {
			TradeClearingManagementOrderQueryPage.selectTradeType(stcmoqBean.getTradeType());
			doQuery();
		}
	}
	
	@Test(dataProvider="SettlementManagement_TradeClearingManagementOrderQueryByCaseNO")
	public void testCheck(SettlementManagement_TradeClearingManagementOrderQueryBean stcmoqBean) {
		TradeClearingManagementOrderQueryPage.navigateTo(URL);
		wait.waitFor(500);
		
		if(!stcmoqBean.getMerchantNO().equals("")||!stcmoqBean.getMerchantName().equals("")) {
			doSearchMerchantByNOorName(stcmoqBean.getMerchantNO(), stcmoqBean.getMerchantName(), stcmoqBean.getRadio());
		}
		if(!stcmoqBean.getAccountingDateBegin().equals("")&&!stcmoqBean.getAccountingDateEnd().equals("")) {
			TradeClearingManagementOrderQueryPage.setAccountingDateBegin(stcmoqBean.getAccountingDateBegin());
			TradeClearingManagementOrderQueryPage.setAccountingDateEnd(stcmoqBean.getAccountingDateEnd());
		}
		if(!stcmoqBean.getOrderDateBegin().equals("")&&!stcmoqBean.getOrderDateEnd().equals("")) {
			TradeClearingManagementOrderQueryPage.setOrderDateBegin(stcmoqBean.getOrderDateBegin());
			TradeClearingManagementOrderQueryPage.setOrderDateEnd(stcmoqBean.getOrderDateEnd());
			TradeClearingManagementOrderQueryPage.doLoseFocus("OrderDateEnd", 120, 0);
		}
		if(!stcmoqBean.getOrderNO().equals("")) {
			TradeClearingManagementOrderQueryPage.setOrderNO(stcmoqBean.getOrderNO());
		}
		if(!stcmoqBean.getOrderStatus().equals("")) {
			TradeClearingManagementOrderQueryPage.selectOrderStatus(stcmoqBean.getOrderStatus());
		}
		if(!stcmoqBean.getBusinessChannel().equals("")) {
			TradeClearingManagementOrderQueryPage.selectBusinessChannel(stcmoqBean.getBusinessChannel());
		}
		if(!stcmoqBean.getTradeType().equals("")) {
			TradeClearingManagementOrderQueryPage.selectTradeType(stcmoqBean.getTradeType());
		}
		
		TradeClearingManagementOrderQueryPage.clickQuery();
		wait.waitFor(500);
		
		TradeClearingManagementOrderQueryPage.doPageDown();
		wait.waitFor(500);
		
		TradeClearingManagementOrderQueryPage.clickRadio(stcmoqBean.getRadio());
		wait.waitFor(500);
		
		TradeClearingManagementOrderQueryPage.clickCheck();
		wait.waitFor(2000);
		
		TradeClearingManagementOrderQueryPage.clickCheck_Close();
	}
	
	@Test(dataProvider="SettlementManagement_TradeClearingManagementOrderQueryByCaseNO")
	public void testResend(SettlementManagement_TradeClearingManagementOrderQueryBean stcmoqBean) {
		TradeClearingManagementOrderQueryPage.navigateTo(URL);
		wait.waitFor(500);
		
		if(!stcmoqBean.getMerchantNO().equals("")||!stcmoqBean.getMerchantName().equals("")) {
			doSearchMerchantByNOorName(stcmoqBean.getMerchantNO(), stcmoqBean.getMerchantName(), stcmoqBean.getRadio());
		}
		if(!stcmoqBean.getAccountingDateBegin().equals("")&&!stcmoqBean.getAccountingDateEnd().equals("")) {
			TradeClearingManagementOrderQueryPage.setAccountingDateBegin(stcmoqBean.getAccountingDateBegin());
			TradeClearingManagementOrderQueryPage.setAccountingDateEnd(stcmoqBean.getAccountingDateEnd());
		}
		if(!stcmoqBean.getOrderDateBegin().equals("")&&!stcmoqBean.getOrderDateEnd().equals("")) {
			TradeClearingManagementOrderQueryPage.setOrderDateBegin(stcmoqBean.getOrderDateBegin());
			TradeClearingManagementOrderQueryPage.setOrderDateEnd(stcmoqBean.getOrderDateEnd());
			TradeClearingManagementOrderQueryPage.doLoseFocus("OrderDateEnd", 120, 0);
		}
		if(!stcmoqBean.getOrderNO().equals("")) {
			TradeClearingManagementOrderQueryPage.setOrderNO(stcmoqBean.getOrderNO());
		}
		if(!stcmoqBean.getOrderStatus().equals("")) {
			TradeClearingManagementOrderQueryPage.selectOrderStatus(stcmoqBean.getOrderStatus());
		}
		if(!stcmoqBean.getBusinessChannel().equals("")) {
			TradeClearingManagementOrderQueryPage.selectBusinessChannel(stcmoqBean.getBusinessChannel());
		}
		if(!stcmoqBean.getTradeType().equals("")) {
			TradeClearingManagementOrderQueryPage.selectTradeType(stcmoqBean.getTradeType());
		}
		

		TradeClearingManagementOrderQueryPage.clickQuery();
		wait.waitFor(500);
		
		TradeClearingManagementOrderQueryPage.doPageDown();
		wait.waitFor(500);
		
		TradeClearingManagementOrderQueryPage.clickRadio(stcmoqBean.getRadio());
		wait.waitFor(500);
		TradeClearingManagementOrderQueryPage.doLoseFocus("Radio",stcmoqBean.getRadio(), 120, 0);
		
		TradeClearingManagementOrderQueryPage.doPageUp();
		wait.waitFor(500);
		
		TradeClearingManagementOrderQueryPage.clickResend();
		wait.waitFor(2000);
		
		TradeClearingManagementOrderQueryPage.clickResend_Resend();
		System.out.println(TradeClearingManagementOrderQueryPage.getNotice());
		Reporter.log(TradeClearingManagementOrderQueryPage.getNotice());
		
		
		
	}
	
}