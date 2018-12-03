package com.dy.AutoTest.OperationPlatform.TestCases.OnlineTransaction.Withdraw;


import java.lang.reflect.Method;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.dy.AutoTest.OperationPlatform.POJO.OnlineWithdrawOrderQueryBean;
import com.dy.AutoTest.OperationPlatform.PageObject.OnlineTransaction.Withdraw.OnlineWithdrawOrderQueryPage;
import com.dy.AutoTest.web.api.SuperTest;
import com.dy.AutoTest.web.business.DataBusiness;

public class OnlineWithdrawOrderQueryPageTest extends SuperTest{
	OnlineWithdrawOrderQueryPage OnlineWithdrawOrderQueryPage;
    String URL;
    
    @BeforeClass
	public void init() {
    	/******** instant objectPage *********/
    	OnlineWithdrawOrderQueryPage=new OnlineWithdrawOrderQueryPage(driver);
    	OnlineWithdrawOrderQueryPage.setWaitTime(500);
    	
    	/******** set URL *********/
		URL=host.toString()+DataBusiness.getData_URL("pop_OnlineWithdrawOrderQuery");
		
		/******** instant Interface *********/
		iQuery=OnlineWithdrawOrderQueryPage;
		iClickButton=OnlineWithdrawOrderQueryPage;
		iClickRadio=OnlineWithdrawOrderQueryPage;
	}
	
	@DataProvider(name="OnlineWithdrawOrderQuery")
	protected static Object[][] parametersPool(){
		data.loadDataBeanList("POP_Data_OnlineWithdrawOrderQuery");
		return data.getDataBeanArray();
	}
	
	@DataProvider(name="OnlineWithdrawOrderQueryByCaseNO")
	protected static Object[][] parametersPool(Method method){
		data.loadDataBeanList("POP_Data_OnlineWithdrawOrderQuery",method.getName());
		return data.getDataBeanArray();
	}
	
	@Test(dataProvider="OnlineWithdrawOrderQueryByCaseNO")       
	public void testQuery(OnlineWithdrawOrderQueryBean OnlineWithdrawOrderQueryBean) {    
		OnlineWithdrawOrderQueryPage.navigateTo(URL);
		wait.waitFor(500);
		OnlineWithdrawOrderQueryPage.clickAdvance();
		wait.waitFor(1000);
		
		
		if(!OnlineWithdrawOrderQueryBean.getTransferOutBank().equals("")) {
			OnlineWithdrawOrderQueryPage.selectTransferOutBank(OnlineWithdrawOrderQueryBean.getTransferOutBank());
			doQuery();
		}
		
		if(!OnlineWithdrawOrderQueryBean.getTransferInBank().equals("")) {
			OnlineWithdrawOrderQueryPage.selectTransferInBank(OnlineWithdrawOrderQueryBean.getTransferInBank());
			doQuery();
		}
		
		if(!OnlineWithdrawOrderQueryBean.getAccountDateBegin().equals("") && !OnlineWithdrawOrderQueryBean.getAccountDateEnd().equals("")) {
			OnlineWithdrawOrderQueryPage.setAccountDateBegin(OnlineWithdrawOrderQueryBean.getAccountDateBegin());
			OnlineWithdrawOrderQueryPage.setAccountDateEnd(OnlineWithdrawOrderQueryBean.getAccountDateEnd());
			doQuery();
		}
		
		if(!OnlineWithdrawOrderQueryBean.getOrderDateBegin().equals("") && !OnlineWithdrawOrderQueryBean.getOrderDateEnd().equals("")) {
			OnlineWithdrawOrderQueryPage.setOrderDateBegin(OnlineWithdrawOrderQueryBean.getOrderDateBegin());
			OnlineWithdrawOrderQueryPage.setOrderDateEnd(OnlineWithdrawOrderQueryBean.getOrderDateEnd());
			OnlineWithdrawOrderQueryPage.doLoseFocus("OrderDateEnd",120,0);
			doQuery();
		}
		
		if(!OnlineWithdrawOrderQueryBean.getWithdrawalOrderNO().equals("")) {
			OnlineWithdrawOrderQueryPage.setWithdrawalOrderNO(OnlineWithdrawOrderQueryBean.getWithdrawalOrderNO());
			doQuery();
		}
		
		if(!OnlineWithdrawOrderQueryBean.getUserPhoneOrMerchantNO().equals("")) {
			OnlineWithdrawOrderQueryPage.setUserPhoneOrMerchantNO(OnlineWithdrawOrderQueryBean.getUserPhoneOrMerchantNO());
			doQuery();
		}
		
		if(!OnlineWithdrawOrderQueryBean.getWithdrawalType().equals("")) {
			OnlineWithdrawOrderQueryPage.selectWithdrawalType(OnlineWithdrawOrderQueryBean.getWithdrawalType());
			doQuery();
		}
		
		if(!OnlineWithdrawOrderQueryBean.getOrderStatus().equals("")) {
			OnlineWithdrawOrderQueryPage.selectOrderStatus(OnlineWithdrawOrderQueryBean.getOrderStatus());
			doQuery();
		}
		
		if(!OnlineWithdrawOrderQueryBean.getInnerUserNO().equals("")) {
			OnlineWithdrawOrderQueryPage.setInnerUserNO(OnlineWithdrawOrderQueryBean.getInnerUserNO());
			doQuery();
		}
	}
	
	@Test(dataProvider="OnlineWithdrawOrderQueryByCaseNO")       
	public void testCheck(OnlineWithdrawOrderQueryBean OnlineWithdrawOrderQueryBean) {    
		OnlineWithdrawOrderQueryPage.navigateTo(URL);
		wait.waitFor(500);
		OnlineWithdrawOrderQueryPage.clickAdvance();
		wait.waitFor(1000);
		
		
		if(!OnlineWithdrawOrderQueryBean.getTransferOutBank().equals("")) {
			OnlineWithdrawOrderQueryPage.selectTransferOutBank(OnlineWithdrawOrderQueryBean.getTransferOutBank());

		}
		
		if(!OnlineWithdrawOrderQueryBean.getTransferInBank().equals("")) {
			OnlineWithdrawOrderQueryPage.selectTransferInBank(OnlineWithdrawOrderQueryBean.getTransferInBank());

		}
		
		if(!OnlineWithdrawOrderQueryBean.getAccountDateBegin().equals("") && !OnlineWithdrawOrderQueryBean.getAccountDateEnd().equals("")) {
			OnlineWithdrawOrderQueryPage.setAccountDateBegin(OnlineWithdrawOrderQueryBean.getAccountDateBegin());
			OnlineWithdrawOrderQueryPage.setAccountDateEnd(OnlineWithdrawOrderQueryBean.getAccountDateEnd());

		}
		
		if(!OnlineWithdrawOrderQueryBean.getOrderDateBegin().equals("") && !OnlineWithdrawOrderQueryBean.getOrderDateEnd().equals("")) {
			OnlineWithdrawOrderQueryPage.setOrderDateBegin(OnlineWithdrawOrderQueryBean.getOrderDateBegin());
			OnlineWithdrawOrderQueryPage.setOrderDateEnd(OnlineWithdrawOrderQueryBean.getOrderDateEnd());
			OnlineWithdrawOrderQueryPage.doLoseFocus("OrderDateEnd",120,0);

		}
		
		if(!OnlineWithdrawOrderQueryBean.getWithdrawalOrderNO().equals("")) {
			OnlineWithdrawOrderQueryPage.setWithdrawalOrderNO(OnlineWithdrawOrderQueryBean.getWithdrawalOrderNO());

		}
		
		if(!OnlineWithdrawOrderQueryBean.getUserPhoneOrMerchantNO().equals("")) {
			OnlineWithdrawOrderQueryPage.setUserPhoneOrMerchantNO(OnlineWithdrawOrderQueryBean.getUserPhoneOrMerchantNO());

		}
		
		if(!OnlineWithdrawOrderQueryBean.getWithdrawalType().equals("")) {
			OnlineWithdrawOrderQueryPage.selectWithdrawalType(OnlineWithdrawOrderQueryBean.getWithdrawalType());

		}
		
		if(!OnlineWithdrawOrderQueryBean.getOrderStatus().equals("")) {
			OnlineWithdrawOrderQueryPage.selectOrderStatus(OnlineWithdrawOrderQueryBean.getOrderStatus());

		}
		
		if(!OnlineWithdrawOrderQueryBean.getInnerUserNO().equals("")) {
			OnlineWithdrawOrderQueryPage.setInnerUserNO(OnlineWithdrawOrderQueryBean.getInnerUserNO());

		}
		OnlineWithdrawOrderQueryPage.clickAdvance();
		
		clickRadio(OnlineWithdrawOrderQueryBean.getRadio());
		
		
		clickButton("Check");
		
		
		OnlineWithdrawOrderQueryPage.clickCheck_Close();
		wait.waitFor(1000);
		while(!OnlineWithdrawOrderQueryPage.isPOPTopDisplayed()) {
			OnlineWithdrawOrderQueryPage.doPageUp();
			wait.waitFor(300);
		}
	}
}
