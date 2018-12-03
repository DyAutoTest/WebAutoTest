package com.dy.AutoTest.OperationPlatform.TestCases.OnlineTransaction.RefundOrder;


import java.lang.reflect.Method;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.dy.AutoTest.OperationPlatform.POJO.OnlineRefundOrderQueryBean;
import com.dy.AutoTest.OperationPlatform.PageObject.OnlineTransaction.RefundOrder.OnlineRefundOrderQueryPage;
import com.dy.AutoTest.web.api.SuperTest;
import com.dy.AutoTest.web.business.DataBusiness;

public class OnlineRefundOrderQueryPageTest extends SuperTest{
	OnlineRefundOrderQueryPage OnlineRefundOrderQueryPage;
    String URL;
    
    @BeforeClass
	public void init() {
    	/******** instant objectPage *********/
    	OnlineRefundOrderQueryPage=new OnlineRefundOrderQueryPage(driver);
    	OnlineRefundOrderQueryPage.setWaitTime(500);
    	
    	/******** set URL *********/
		URL=host.toString()+DataBusiness.getData_URL("pop_OnlineRefundOrderQuery");
		
		/******** instant Interface *********/
		iQuery=OnlineRefundOrderQueryPage;
		iClickButton=OnlineRefundOrderQueryPage;
		iClickRadio=OnlineRefundOrderQueryPage;
	}
	
	@DataProvider(name="OnlineRefundOrderQuery")
	protected static Object[][] parametersPool(){
		data.loadDataBeanList("POP_Data_OnlineRefundOrderQuery");
		return data.getDataBeanArray();
	}
	
	@DataProvider(name="OnlineRefundOrderQueryByCaseNO")
	protected static Object[][] parametersPool(Method method){
		data.loadDataBeanList("POP_Data_OnlineRefundOrderQuery",method.getName());
		return data.getDataBeanArray();
	}
	
	@Test(dataProvider="OnlineRefundOrderQueryByCaseNO")       
	public void testQuery(OnlineRefundOrderQueryBean OnlineRefundOrderQueryBean) {    
		OnlineRefundOrderQueryPage.navigateTo(URL);
		wait.waitFor(500);
		OnlineRefundOrderQueryPage.clickAdvance();
		wait.waitFor(1000);
		
		
		if(!OnlineRefundOrderQueryBean.getMerchantNO().equals("")) {
			OnlineRefundOrderQueryPage.setMerchantNO(OnlineRefundOrderQueryBean.getMerchantNO());
			doQuery();
		}
		
		if(!OnlineRefundOrderQueryBean.getMerchantOrderNO().equals("")) {
			OnlineRefundOrderQueryPage.setMerchantOrderNO(OnlineRefundOrderQueryBean.getMerchantOrderNO());
			doQuery();
		}
		
		if(!OnlineRefundOrderQueryBean.getAccountingDateBegin().equals("") && !OnlineRefundOrderQueryBean.getAccountingDateEnd().equals("")) {
			OnlineRefundOrderQueryPage.setAccountingDateBegin(OnlineRefundOrderQueryBean.getAccountingDateBegin());
			OnlineRefundOrderQueryPage.setAccountingDateEnd(OnlineRefundOrderQueryBean.getAccountingDateEnd());
			doQuery();
		}
		
		if(!OnlineRefundOrderQueryBean.getOrderDateBegin().equals("") && !OnlineRefundOrderQueryBean.getOrderDateEnd().equals("")) {
			OnlineRefundOrderQueryPage.setOrderDateBegin(OnlineRefundOrderQueryBean.getOrderDateBegin());
			OnlineRefundOrderQueryPage.setOrderDateEnd(OnlineRefundOrderQueryBean.getOrderDateEnd());
			OnlineRefundOrderQueryPage.doLoseFocus("OrderDateEnd",120,0);
			doQuery();
		}
		
		if(!OnlineRefundOrderQueryBean.getRefundStatus().equals("")) {
			OnlineRefundOrderQueryPage.selectRefundStatus(OnlineRefundOrderQueryBean.getRefundStatus());
			doQuery();
		}

		if(!OnlineRefundOrderQueryBean.getUserPhoneNO().equals("")) {
			OnlineRefundOrderQueryPage.setUserPhoneNO(OnlineRefundOrderQueryBean.getUserPhoneNO());
			doQuery();
		}
		
		if(!OnlineRefundOrderQueryBean.getInnerOrderNO().equals("")) {
			OnlineRefundOrderQueryPage.setInnerOrderNO(OnlineRefundOrderQueryBean.getInnerOrderNO());
			doQuery();
		}
		
	}
	
	@Test(dataProvider="OnlineRefundOrderQueryByCaseNO")       
	public void testCheck(OnlineRefundOrderQueryBean OnlineRefundOrderQueryBean) {    
		OnlineRefundOrderQueryPage.navigateTo(URL);
		wait.waitFor(500);
		OnlineRefundOrderQueryPage.clickAdvance();
		wait.waitFor(1000);
		

		if(!OnlineRefundOrderQueryBean.getMerchantNO().equals("")) {
			OnlineRefundOrderQueryPage.setMerchantNO(OnlineRefundOrderQueryBean.getMerchantNO());

		}
		
		if(!OnlineRefundOrderQueryBean.getMerchantOrderNO().equals("")) {
			OnlineRefundOrderQueryPage.setMerchantOrderNO(OnlineRefundOrderQueryBean.getMerchantOrderNO());

		}
		
		if(!OnlineRefundOrderQueryBean.getAccountingDateBegin().equals("") && !OnlineRefundOrderQueryBean.getAccountingDateEnd().equals("")) {
			OnlineRefundOrderQueryPage.setAccountingDateBegin(OnlineRefundOrderQueryBean.getAccountingDateBegin());
			OnlineRefundOrderQueryPage.setAccountingDateEnd(OnlineRefundOrderQueryBean.getAccountingDateEnd());

		}
		
		if(!OnlineRefundOrderQueryBean.getOrderDateBegin().equals("") && !OnlineRefundOrderQueryBean.getOrderDateEnd().equals("")) {
			OnlineRefundOrderQueryPage.setOrderDateBegin(OnlineRefundOrderQueryBean.getOrderDateBegin());
			OnlineRefundOrderQueryPage.setOrderDateEnd(OnlineRefundOrderQueryBean.getOrderDateEnd());
			OnlineRefundOrderQueryPage.doLoseFocus("OrderDateEnd",120,0);

		}
		
		if(!OnlineRefundOrderQueryBean.getRefundStatus().equals("")) {
			OnlineRefundOrderQueryPage.selectRefundStatus(OnlineRefundOrderQueryBean.getRefundStatus());

		}

		if(!OnlineRefundOrderQueryBean.getUserPhoneNO().equals("")) {
			OnlineRefundOrderQueryPage.setUserPhoneNO(OnlineRefundOrderQueryBean.getUserPhoneNO());

		}
		
		if(!OnlineRefundOrderQueryBean.getInnerOrderNO().equals("")) {
			OnlineRefundOrderQueryPage.setInnerOrderNO(OnlineRefundOrderQueryBean.getInnerOrderNO());

		}
		OnlineRefundOrderQueryPage.clickAdvance();
		
		clickRadio(OnlineRefundOrderQueryBean.getRadio());
		
		
		clickButton("Check");
		
		
		OnlineRefundOrderQueryPage.clickCheck_Close();
		wait.waitFor(1000);
		while(!OnlineRefundOrderQueryPage.isPOPTopDisplayed()) {
			OnlineRefundOrderQueryPage.doPageUp();
			wait.waitFor(300);
		}
	}
}
