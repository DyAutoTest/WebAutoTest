package com.dy.AutoTest.OperationPlatform.TestCases.OnlineTransaction.Transfer;


import java.lang.reflect.Method;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.dy.AutoTest.OperationPlatform.POJO.OnlineTransferOutOrderQueryBean;
import com.dy.AutoTest.OperationPlatform.PageObject.OnlineTransaction.Transfer.OnlineTransferOutOrderQueryPage;
import com.dy.AutoTest.web.api.SuperTest;
import com.dy.AutoTest.web.business.DataBusiness;

public class OnlineTransferOutOrderQueryPageTest extends SuperTest{
	OnlineTransferOutOrderQueryPage OnlineTransferOutOrderQueryPage;
    String URL;
    
    @BeforeClass
	public void init() {
    	/******** instant objectPage *********/
    	OnlineTransferOutOrderQueryPage=new OnlineTransferOutOrderQueryPage(driver);
    	OnlineTransferOutOrderQueryPage.setWaitTime(500);
    	
    	/******** set URL *********/
		URL=host.toString()+DataBusiness.getData_URL("pop_OnlineTransferOutOrderQuery");
		
		/******** instant Interface *********/
		iQuery=OnlineTransferOutOrderQueryPage;
		iClickButton=OnlineTransferOutOrderQueryPage;
		iClickRadio=OnlineTransferOutOrderQueryPage;
	}
	
	@DataProvider(name="OnlineTransferOutOrderQuery")
	protected static Object[][] parametersPool(){
		data.loadDataBeanList("POP_Data_OnlineTransferOutOrderQuery");
		return data.getDataBeanArray();
	}
	
	@DataProvider(name="OnlineTransferOutOrderQueryByCaseNO")
	protected static Object[][] parametersPool(Method method){
		data.loadDataBeanList("POP_Data_OnlineTransferOutOrderQuery",method.getName());
		return data.getDataBeanArray();
	}
	
	@Test(dataProvider="OnlineTransferOutOrderQueryByCaseNO")       
	public void testQuery(OnlineTransferOutOrderQueryBean OnlineTransferOutOrderQueryBean) {    
		OnlineTransferOutOrderQueryPage.navigateTo(URL);
		wait.waitFor(500);
		OnlineTransferOutOrderQueryPage.clickAdvance();
		wait.waitFor(1000);
		
		
		if(!OnlineTransferOutOrderQueryBean.getPayerPhoneNO().equals("")) {
			OnlineTransferOutOrderQueryPage.setPayerPhoneNO(OnlineTransferOutOrderQueryBean.getPayerPhoneNO());
			doQuery();
		}
		
		if(!OnlineTransferOutOrderQueryBean.getOrderStatus().equals("")) {
			OnlineTransferOutOrderQueryPage.selectOrderStatus(OnlineTransferOutOrderQueryBean.getOrderStatus());
			doQuery();
		}
		
		if(!OnlineTransferOutOrderQueryBean.getAccountDateBegin().equals("") && !OnlineTransferOutOrderQueryBean.getAccountDateEnd().equals("")) {
			OnlineTransferOutOrderQueryPage.setAccountDateBegin(OnlineTransferOutOrderQueryBean.getAccountDateBegin());
			OnlineTransferOutOrderQueryPage.setAccountDateEnd(OnlineTransferOutOrderQueryBean.getAccountDateEnd());
			doQuery();
		}
		
		if(!OnlineTransferOutOrderQueryBean.getOrderDateBegin().equals("") && !OnlineTransferOutOrderQueryBean.getOrderDateEnd().equals("")) {
			OnlineTransferOutOrderQueryPage.setOrderDateBegin(OnlineTransferOutOrderQueryBean.getOrderDateBegin());
			OnlineTransferOutOrderQueryPage.setOrderDateEnd(OnlineTransferOutOrderQueryBean.getOrderDateEnd());
			OnlineTransferOutOrderQueryPage.doLoseFocus("OrderDateEnd",120,0);
			doQuery();
		}
		
		if(!OnlineTransferOutOrderQueryBean.getOrderNO().equals("")) {
			OnlineTransferOutOrderQueryPage.setOrderNO(OnlineTransferOutOrderQueryBean.getOrderNO());
			doQuery();
		}
	}
	
	@Test(dataProvider="OnlineTransferOutOrderQueryByCaseNO")       
	public void testCheck(OnlineTransferOutOrderQueryBean OnlineTransferOutOrderQueryBean) {    
		OnlineTransferOutOrderQueryPage.navigateTo(URL);
		wait.waitFor(500);
		OnlineTransferOutOrderQueryPage.clickAdvance();
		wait.waitFor(1000);
		

		if(!OnlineTransferOutOrderQueryBean.getPayerPhoneNO().equals("")) {
			OnlineTransferOutOrderQueryPage.setPayerPhoneNO(OnlineTransferOutOrderQueryBean.getPayerPhoneNO());

		}
		
		if(!OnlineTransferOutOrderQueryBean.getOrderStatus().equals("")) {
			OnlineTransferOutOrderQueryPage.selectOrderStatus(OnlineTransferOutOrderQueryBean.getOrderStatus());

		}
		
		if(!OnlineTransferOutOrderQueryBean.getAccountDateBegin().equals("") && !OnlineTransferOutOrderQueryBean.getAccountDateEnd().equals("")) {
			OnlineTransferOutOrderQueryPage.setAccountDateBegin(OnlineTransferOutOrderQueryBean.getAccountDateBegin());
			OnlineTransferOutOrderQueryPage.setAccountDateEnd(OnlineTransferOutOrderQueryBean.getAccountDateEnd());

		}
		
		if(!OnlineTransferOutOrderQueryBean.getOrderDateBegin().equals("") && !OnlineTransferOutOrderQueryBean.getOrderDateEnd().equals("")) {
			OnlineTransferOutOrderQueryPage.setOrderDateBegin(OnlineTransferOutOrderQueryBean.getOrderDateBegin());
			OnlineTransferOutOrderQueryPage.setOrderDateEnd(OnlineTransferOutOrderQueryBean.getOrderDateEnd());
			OnlineTransferOutOrderQueryPage.doLoseFocus("OrderDateEnd",120,0);

		}
		
		if(!OnlineTransferOutOrderQueryBean.getOrderNO().equals("")) {
			OnlineTransferOutOrderQueryPage.setOrderNO(OnlineTransferOutOrderQueryBean.getOrderNO());

		}

		
		clickRadio(OnlineTransferOutOrderQueryBean.getRadio());
		
		
		clickButton("Check");
		
		
		OnlineTransferOutOrderQueryPage.clickCheck_Close();
		wait.waitFor(1000);
		while(!OnlineTransferOutOrderQueryPage.isPOPTopDisplayed()) {
			OnlineTransferOutOrderQueryPage.doPageUp();
			wait.waitFor(300);
		}
	}
}
