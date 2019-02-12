package com.dy.AutoTest.OperationPlatform.TestCases.SettlementManagement.Clearing;

import java.lang.reflect.Method;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.dy.AutoTest.web.api.SuperTest;
import com.dy.AutoTest.OperationPlatform.PageObject.SettlementManagement.Clearing.TradeClearingManagementQueryPage;
import com.dy.AutoTest.OperationPlatform.POJO.SettlementManagement_TradeClearingManagementQueryBean;
import com.dy.AutoTest.web.business.DataBusiness;

public class TradeClearingManagementQueryPageTest extends SuperTest{
	TradeClearingManagementQueryPage TradeClearingManagementQueryPage;
	String URL;

	@BeforeClass
	public void init() {
		/******** instant objectPage *********/
		TradeClearingManagementQueryPage=new TradeClearingManagementQueryPage(driver);
		//TradeClearingManagementQueryPage.setWaitTime(800);

		/******** set URL *********/
		URL=host.toString()+DataBusiness.getData_URL("pop_SettlementManagement_TradeClearingManagementQuery");

		/******** instant Interface *********/
		iQuery=TradeClearingManagementQueryPage;
//		iClickButton=TradeClearingManagementQueryPage;
//		iClickRadio=TradeClearingManagementQueryPage;
//		iSearchMerchant=TradeClearingManagementQueryPage;
	}

	@DataProvider(name="SettlementManagement_TradeClearingManagementQuery")
	protected static Object[][] parametersPool(){
		data.loadDataBeanList("POP_Data_SettlementManagement_TradeClearingManagementQuery");
		return data.getDataBeanArray();
	}

	@DataProvider(name="SettlementManagement_TradeClearingManagementQueryByCaseNO")
	protected static Object[][] parametersPool(Method method){
		data.loadDataBeanList("POP_Data_SettlementManagement_TradeClearingManagementQuery",method.getName());
		return data.getDataBeanArray();
	}

	@Test(dataProvider="SettlementManagement_TradeClearingManagementQueryByCaseNO")
	public void testQuery(SettlementManagement_TradeClearingManagementQueryBean stcmqBean) {
		TradeClearingManagementQueryPage.navigateTo(URL);
		wait.waitFor(500);

		if(!stcmqBean.getMerchantNO().equals("")) {
			TradeClearingManagementQueryPage.setMerchantNO(stcmqBean.getMerchantNO());
			doQuery();
		}
		if(!stcmqBean.getMerchantOrderNO().equals("")) {
			TradeClearingManagementQueryPage.setMerchantOrderNO(stcmqBean.getMerchantOrderNO());
			doQuery();
		}
		if(!stcmqBean.getAccountingDateBegin().equals("")&&!stcmqBean.getAccountingDateEnd().equals("")) {
			TradeClearingManagementQueryPage.setAccountingDateBegin(stcmqBean.getAccountingDateBegin());
			TradeClearingManagementQueryPage.setAccountingDateEnd(stcmqBean.getAccountingDateEnd());
			doQuery();
		}
		if(!stcmqBean.getOrderDateBegin().equals("")&&!stcmqBean.getOrderDateEnd().equals("")) {
			TradeClearingManagementQueryPage.setOrderDateBegin(stcmqBean.getOrderDateBegin());
			TradeClearingManagementQueryPage.setOrderDateEnd(stcmqBean.getOrderDateEnd());
			TradeClearingManagementQueryPage.doLoseFocus("OrderDateEnd", 120, 0);
			doQuery();
		}
	}
	
	@Test(dataProvider="SettlementManagement_TradeClearingManagementQueryByCaseNO")
	public void testCheck(SettlementManagement_TradeClearingManagementQueryBean stcmqBean) {
		TradeClearingManagementQueryPage.navigateTo(URL);
		wait.waitFor(500);

		if(!stcmqBean.getMerchantNO().equals("")) {
			TradeClearingManagementQueryPage.setMerchantNO(stcmqBean.getMerchantNO());
		}
		if(!stcmqBean.getMerchantOrderNO().equals("")) {
			TradeClearingManagementQueryPage.setMerchantOrderNO(stcmqBean.getMerchantOrderNO());
		}
		if(!stcmqBean.getAccountingDateBegin().equals("")&&!stcmqBean.getAccountingDateEnd().equals("")) {
			TradeClearingManagementQueryPage.setAccountingDateBegin(stcmqBean.getAccountingDateBegin());
			TradeClearingManagementQueryPage.setAccountingDateEnd(stcmqBean.getAccountingDateEnd());
		}
		if(!stcmqBean.getOrderDateBegin().equals("")&&!stcmqBean.getOrderDateEnd().equals("")) {
			TradeClearingManagementQueryPage.setOrderDateBegin(stcmqBean.getOrderDateBegin());
			TradeClearingManagementQueryPage.setOrderDateEnd(stcmqBean.getOrderDateEnd());
			TradeClearingManagementQueryPage.doLoseFocus("OrderDateEnd", 120, 0);
		}
		
		TradeClearingManagementQueryPage.clickQuery();
		wait.waitFor(500);
		
		TradeClearingManagementQueryPage.clickRadio(stcmqBean.getRadio());
		wait.waitFor(500);
		
		TradeClearingManagementQueryPage.clickCheck();
		wait.waitFor(2000);
		
		TradeClearingManagementQueryPage.clickCheck_Close();
		wait.waitFor(1000);
		
		TradeClearingManagementQueryPage.doPageUp();
	}
}