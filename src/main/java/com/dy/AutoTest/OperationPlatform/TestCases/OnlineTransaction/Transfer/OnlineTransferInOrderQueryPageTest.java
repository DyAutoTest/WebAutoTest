package com.dy.AutoTest.OperationPlatform.TestCases.OnlineTransaction.Transfer;


import java.lang.reflect.Method;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.dy.AutoTest.OperationPlatform.POJO.OnlineTransferInOrderQueryBean;
import com.dy.AutoTest.OperationPlatform.PageObject.OnlineTransaction.Transfer.OnlineTransferInOrderQueryPage;
import com.dy.AutoTest.web.api.SuperTest;
import com.dy.AutoTest.web.business.DataBusiness;

public class OnlineTransferInOrderQueryPageTest extends SuperTest{
	OnlineTransferInOrderQueryPage OnlineTransferInOrderQueryPage;
    String URL;
    
    @BeforeClass
	public void init() {
    	/******** instant objectPage *********/
    	OnlineTransferInOrderQueryPage=new OnlineTransferInOrderQueryPage(driver);
    	OnlineTransferInOrderQueryPage.setWaitTime(500);
    	
    	/******** set URL *********/
		URL=host.toString()+DataBusiness.getData_URL("pop_OnlineTransferInOrderQuery");
		
		/******** instant Interface *********/
		iQuery=OnlineTransferInOrderQueryPage;
		iClickButton=OnlineTransferInOrderQueryPage;
		iClickRadio=OnlineTransferInOrderQueryPage;
	}
	
	@DataProvider(name="OnlineTransferInOrderQuery")
	protected static Object[][] parametersPool(){
		data.loadDataBeanList("POP_Data_OnlineTransferInOrderQuery");
		return data.getDataBeanArray();
	}
	
	@DataProvider(name="OnlineTransferInOrderQueryByCaseNO")
	protected static Object[][] parametersPool(Method method){
		data.loadDataBeanList("POP_Data_OnlineTransferInOrderQuery",method.getName());
		return data.getDataBeanArray();
	}
	
	@Test(dataProvider="OnlineTransferInOrderQueryByCaseNO")       
	public void testQuery(OnlineTransferInOrderQueryBean OnlineTransferInOrderQueryBean) {    
		OnlineTransferInOrderQueryPage.navigateTo(URL);
		wait.waitFor(500);
		OnlineTransferInOrderQueryPage.clickAdvance();
		wait.waitFor(1000);
		
		
		if(!OnlineTransferInOrderQueryBean.getPayeePhoneNO().equals("")) {
			OnlineTransferInOrderQueryPage.setPayeePhoneNO(OnlineTransferInOrderQueryBean.getPayeePhoneNO());
			doQuery();
		}
		
		if(!OnlineTransferInOrderQueryBean.getOrderStatus().equals("")) {
			OnlineTransferInOrderQueryPage.selectOrderStatus(OnlineTransferInOrderQueryBean.getOrderStatus());
			doQuery();
		}
		
		if(!OnlineTransferInOrderQueryBean.getAccountDateBegin().equals("") && !OnlineTransferInOrderQueryBean.getAccountDateEnd().equals("")) {
			OnlineTransferInOrderQueryPage.selectAll("AccountDateBegin");
			OnlineTransferInOrderQueryPage.setAccountDateBegin(OnlineTransferInOrderQueryBean.getAccountDateBegin());
			OnlineTransferInOrderQueryPage.selectAll("AccountDateEnd");
			OnlineTransferInOrderQueryPage.setAccountDateEnd(OnlineTransferInOrderQueryBean.getAccountDateEnd());
			doQuery();
		}
		
		if(!OnlineTransferInOrderQueryBean.getOrderDateBegin().equals("") && !OnlineTransferInOrderQueryBean.getOrderDateEnd().equals("")) {
			OnlineTransferInOrderQueryPage.setOrderDateBegin(OnlineTransferInOrderQueryBean.getOrderDateBegin());
			OnlineTransferInOrderQueryPage.setOrderDateEnd(OnlineTransferInOrderQueryBean.getOrderDateEnd());
			OnlineTransferInOrderQueryPage.doLoseFocus("OrderDateEnd",120,0);
			doQuery();
		}
		
		if(!OnlineTransferInOrderQueryBean.getOrderNO().equals("")) {
			OnlineTransferInOrderQueryPage.setOrderNO(OnlineTransferInOrderQueryBean.getOrderNO());
			doQuery();
		}
		
	}
	
	@Test(dataProvider="OnlineTransferInOrderQueryByCaseNO")       
	public void testCheck(OnlineTransferInOrderQueryBean OnlineTransferInOrderQueryBean) {    
		OnlineTransferInOrderQueryPage.navigateTo(URL);
		wait.waitFor(500);
		OnlineTransferInOrderQueryPage.clickAdvance();
		wait.waitFor(1000);
		

		if(!OnlineTransferInOrderQueryBean.getPayeePhoneNO().equals("")) {
			OnlineTransferInOrderQueryPage.setPayeePhoneNO(OnlineTransferInOrderQueryBean.getPayeePhoneNO());

		}
		
		if(!OnlineTransferInOrderQueryBean.getOrderStatus().equals("")) {
			OnlineTransferInOrderQueryPage.selectOrderStatus(OnlineTransferInOrderQueryBean.getOrderStatus());

		}
		
		if(!OnlineTransferInOrderQueryBean.getAccountDateBegin().equals("") && !OnlineTransferInOrderQueryBean.getAccountDateEnd().equals("")) {
			OnlineTransferInOrderQueryPage.setAccountDateBegin(OnlineTransferInOrderQueryBean.getAccountDateBegin());
			OnlineTransferInOrderQueryPage.setAccountDateEnd(OnlineTransferInOrderQueryBean.getAccountDateEnd());

		}
		
		if(!OnlineTransferInOrderQueryBean.getOrderDateBegin().equals("") && !OnlineTransferInOrderQueryBean.getOrderDateEnd().equals("")) {
			OnlineTransferInOrderQueryPage.setOrderDateBegin(OnlineTransferInOrderQueryBean.getOrderDateBegin());
			OnlineTransferInOrderQueryPage.setOrderDateEnd(OnlineTransferInOrderQueryBean.getOrderDateEnd());
			OnlineTransferInOrderQueryPage.doLoseFocus("OrderDateEnd",120,0);

		}
		
		if(!OnlineTransferInOrderQueryBean.getOrderNO().equals("")) {
			OnlineTransferInOrderQueryPage.setOrderNO(OnlineTransferInOrderQueryBean.getOrderNO());

		}

		
		clickRadio(OnlineTransferInOrderQueryBean.getRadio());
		
		
		clickButton("Check");
		
		
		OnlineTransferInOrderQueryPage.clickCheck_Close();
		wait.waitFor(1000);
		while(!OnlineTransferInOrderQueryPage.isPOPTopDisplayed()) {
			OnlineTransferInOrderQueryPage.doPageUp();
			wait.waitFor(300);
		}
	}
}
