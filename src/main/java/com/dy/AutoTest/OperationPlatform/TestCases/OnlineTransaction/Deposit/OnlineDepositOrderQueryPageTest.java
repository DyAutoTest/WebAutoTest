package com.dy.AutoTest.OperationPlatform.TestCases.OnlineTransaction.Deposit;


import java.lang.reflect.Method;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.dy.AutoTest.OperationPlatform.POJO.OnlineDepositOrderQueryBean;
import com.dy.AutoTest.OperationPlatform.PageObject.OnlineTransaction.Deposit.OnlineDepositOrderQueryPage;
import com.dy.AutoTest.web.api.SuperTest;
import com.dy.AutoTest.web.business.DataBusiness;

public class OnlineDepositOrderQueryPageTest extends SuperTest{
	OnlineDepositOrderQueryPage OnlineDepositOrderQueryPage;
    String URL;
    
    @BeforeClass
	public void init() {
    	/******** instant objectPage *********/
    	OnlineDepositOrderQueryPage=new OnlineDepositOrderQueryPage(driver);
    	OnlineDepositOrderQueryPage.setWaitTime(500);
    	
    	/******** set URL *********/
		URL=host.toString()+DataBusiness.getData_URL("pop_OnlineDepositOrderQuery");
		
		/******** instant Interface *********/
		iQuery=OnlineDepositOrderQueryPage;
		iClickButton=OnlineDepositOrderQueryPage;
		iClickRadio=OnlineDepositOrderQueryPage;
	}
	
	@DataProvider(name="OnlineDepositOrderQuery")
	protected static Object[][] parametersPool(){
		data.loadDataBeanList("POP_Data_OnlineDepositOrderQuery");
		return data.getDataBeanArray();
	}
	
	@DataProvider(name="OnlineDepositOrderQueryByCaseNO")
	protected static Object[][] parametersPool(Method method){
		data.loadDataBeanList("POP_Data_OnlineDepositOrderQuery",method.getName());
		return data.getDataBeanArray();
	}
	
	@Test(dataProvider="OnlineDepositOrderQueryByCaseNO")       
	public void testQuery(OnlineDepositOrderQueryBean OnlineDepositOrderQueryBean) {    
		OnlineDepositOrderQueryPage.navigateTo(URL);
		wait.waitFor(500);
		OnlineDepositOrderQueryPage.clickAdvance();
		wait.waitFor(1000);
		
		
		if(!OnlineDepositOrderQueryBean.getMerchantNO().equals("")) {
			OnlineDepositOrderQueryPage.setMerchantNO(OnlineDepositOrderQueryBean.getMerchantNO());
			doQuery();
		}
		
		if(!OnlineDepositOrderQueryBean.getInnerUserNO().equals("")) {
			OnlineDepositOrderQueryPage.setInnerUserNO(OnlineDepositOrderQueryBean.getInnerUserNO());
			doQuery();
		}
		
		if(!OnlineDepositOrderQueryBean.getAccountDateBegin().equals("") && !OnlineDepositOrderQueryBean.getAccountDateEnd().equals("")) {
			OnlineDepositOrderQueryPage.setAccountDateBegin(OnlineDepositOrderQueryBean.getAccountDateBegin());
			OnlineDepositOrderQueryPage.setAccountDateEnd(OnlineDepositOrderQueryBean.getAccountDateEnd());
			doQuery();
		}
		
		if(!OnlineDepositOrderQueryBean.getOrderDateBegin().equals("") && !OnlineDepositOrderQueryBean.getOrderDateEnd().equals("")) {
			OnlineDepositOrderQueryPage.setOrderDateBegin(OnlineDepositOrderQueryBean.getOrderDateBegin());
			OnlineDepositOrderQueryPage.setOrderDateEnd(OnlineDepositOrderQueryBean.getOrderDateEnd());
			OnlineDepositOrderQueryPage.doLoseFocus("OrderDateEnd",120,0);
			doQuery();
		}
		
		if(!OnlineDepositOrderQueryBean.getCooperation().equals("")) {
			OnlineDepositOrderQueryPage.selectCooperation(OnlineDepositOrderQueryBean.getCooperation());
			doQuery();
		}
		
		if(!OnlineDepositOrderQueryBean.getDepositType().equals("")) {
			OnlineDepositOrderQueryPage.selectDepositType(OnlineDepositOrderQueryBean.getDepositType());
			doQuery();
		}
		
		if(!OnlineDepositOrderQueryBean.getInnerOrderNO().equals("")) {
			OnlineDepositOrderQueryPage.setInnerOrderNO(OnlineDepositOrderQueryBean.getInnerOrderNO());
			doQuery();
		}
		
		if(!OnlineDepositOrderQueryBean.getDepositOrderNO().equals("")) {
			OnlineDepositOrderQueryPage.setDepositOrderNO(OnlineDepositOrderQueryBean.getDepositOrderNO());
			doQuery();
		}
		
		if(!OnlineDepositOrderQueryBean.getOrderStatus().equals("")) {
			OnlineDepositOrderQueryPage.selectOrderStatus(OnlineDepositOrderQueryBean.getOrderStatus());
			doQuery();
		}
		
	}

	@Test(dataProvider="OnlineDepositOrderQueryByCaseNO")       
	public void testCheck(OnlineDepositOrderQueryBean OnlineDepositOrderQueryBean) {    
		OnlineDepositOrderQueryPage.navigateTo(URL);
		wait.waitFor(500);
		OnlineDepositOrderQueryPage.clickAdvance();
		wait.waitFor(1000);
		
		
		if(!OnlineDepositOrderQueryBean.getMerchantNO().equals("")) {
			OnlineDepositOrderQueryPage.setMerchantNO(OnlineDepositOrderQueryBean.getMerchantNO());
		}
		
		if(!OnlineDepositOrderQueryBean.getInnerUserNO().equals("")) {
			OnlineDepositOrderQueryPage.setInnerUserNO(OnlineDepositOrderQueryBean.getInnerUserNO());
		}
		
		if(!OnlineDepositOrderQueryBean.getAccountDateBegin().equals("") && !OnlineDepositOrderQueryBean.getAccountDateEnd().equals("")) {
			OnlineDepositOrderQueryPage.setAccountDateBegin(OnlineDepositOrderQueryBean.getAccountDateBegin());
			OnlineDepositOrderQueryPage.setAccountDateEnd(OnlineDepositOrderQueryBean.getAccountDateEnd());
		}
		
		if(!OnlineDepositOrderQueryBean.getOrderDateBegin().equals("") && !OnlineDepositOrderQueryBean.getOrderDateEnd().equals("")) {
			OnlineDepositOrderQueryPage.setOrderDateBegin(OnlineDepositOrderQueryBean.getOrderDateBegin());
			OnlineDepositOrderQueryPage.setOrderDateEnd(OnlineDepositOrderQueryBean.getOrderDateEnd());
			OnlineDepositOrderQueryPage.doLoseFocus("OrderDateEnd",120,0);
		}
		
		if(!OnlineDepositOrderQueryBean.getCooperation().equals("")) {
			OnlineDepositOrderQueryPage.selectCooperation(OnlineDepositOrderQueryBean.getCooperation());
		}
		
		if(!OnlineDepositOrderQueryBean.getDepositType().equals("")) {
			OnlineDepositOrderQueryPage.selectDepositType(OnlineDepositOrderQueryBean.getDepositType());
		}
		
		if(!OnlineDepositOrderQueryBean.getInnerOrderNO().equals("")) {
			OnlineDepositOrderQueryPage.setInnerOrderNO(OnlineDepositOrderQueryBean.getInnerOrderNO());
		}
		
		if(!OnlineDepositOrderQueryBean.getDepositOrderNO().equals("")) {
			OnlineDepositOrderQueryPage.setDepositOrderNO(OnlineDepositOrderQueryBean.getDepositOrderNO());
		}
		
		if(!OnlineDepositOrderQueryBean.getOrderStatus().equals("")) {
			OnlineDepositOrderQueryPage.selectOrderStatus(OnlineDepositOrderQueryBean.getOrderStatus());
		}
		
		OnlineDepositOrderQueryPage.clickAdvance();
		clickRadio(OnlineDepositOrderQueryBean.getRadio());
		
		
		clickButton("Check");
		
		
		OnlineDepositOrderQueryPage.clickCheck_Close();
		wait.waitFor(1000);
		while(!OnlineDepositOrderQueryPage.isPOPTopDisplayed()) {
			OnlineDepositOrderQueryPage.doPageUp();
			wait.waitFor(300);
		}
	}
}
