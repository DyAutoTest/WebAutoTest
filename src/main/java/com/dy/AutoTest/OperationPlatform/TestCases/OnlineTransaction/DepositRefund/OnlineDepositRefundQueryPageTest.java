package com.dy.AutoTest.OperationPlatform.TestCases.OnlineTransaction.DepositRefund;


import java.lang.reflect.Method;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.dy.AutoTest.OperationPlatform.POJO.OnlineDepositRefundQueryBean;
import com.dy.AutoTest.OperationPlatform.PageObject.OnlineTransaction.DepositRefund.OnlineDepositRefundQueryPage;
import com.dy.AutoTest.web.api.SuperTest;
import com.dy.AutoTest.web.business.DataBusiness;

public class OnlineDepositRefundQueryPageTest extends SuperTest{
	OnlineDepositRefundQueryPage OnlineDepositRefundQueryPage ;
    String URL;
    
    @BeforeClass
	public void init() {
    	/******** instant objectPage *********/
    	OnlineDepositRefundQueryPage=new OnlineDepositRefundQueryPage(driver);
    	OnlineDepositRefundQueryPage.setWaitTime(500);
    	
    	/******** set URL *********/
		URL=host.toString()+DataBusiness.getData_URL("pop_OnlineDepositRefundQuery");
		
		/******** instant Interface *********/
		iQuery=OnlineDepositRefundQueryPage;
		iClickButton=OnlineDepositRefundQueryPage;
		iClickRadio=OnlineDepositRefundQueryPage;
	}
	
	@DataProvider(name="OnlineDepositRefundQuery")
	protected static Object[][] parametersPool(){
		data.loadDataBeanList("POP_Data_OnlineDepositRefundQuery");
		return data.getDataBeanArray();
	}
	
	@DataProvider(name="OnlineDepositRefundQueryByCaseNO")
	protected static Object[][] parametersPool(Method method){
		data.loadDataBeanList("POP_Data_OnlineDepositRefundQuery",method.getName());
		return data.getDataBeanArray();
	}
	
	@Test(dataProvider="OnlineDepositRefundQueryByCaseNO")       
	public void testQuery(OnlineDepositRefundQueryBean OnlineDepositRefundQueryBean) {    
		OnlineDepositRefundQueryPage.navigateTo(URL);
		wait.waitFor(500);
		OnlineDepositRefundQueryPage.clickAdvance();
		wait.waitFor(1000);
		
		
		if(!OnlineDepositRefundQueryBean.getInnerOrderNO().equals("")) {
			OnlineDepositRefundQueryPage.setInnerOrderNO(OnlineDepositRefundQueryBean.getInnerOrderNO());
			doQuery();
		}
		
		if(!OnlineDepositRefundQueryBean.getSerialNO().equals("")) {
			OnlineDepositRefundQueryPage.setSerialNO(OnlineDepositRefundQueryBean.getSerialNO());
			doQuery();
		}
		
		if(!OnlineDepositRefundQueryBean.getAccountDateBegin().equals("") && !OnlineDepositRefundQueryBean.getAccountDateEnd().equals("")) {
			OnlineDepositRefundQueryPage.setAccountDateBegin(OnlineDepositRefundQueryBean.getAccountDateBegin());
			OnlineDepositRefundQueryPage.setAccountDateEnd(OnlineDepositRefundQueryBean.getAccountDateEnd());
			doQuery();
		}
		
		if(!OnlineDepositRefundQueryBean.getRefundApplicationDateBegin().equals("") && !OnlineDepositRefundQueryBean.getRefundApplicationDateEnd().equals("")) {
			OnlineDepositRefundQueryPage.setRefundApplicationDateBegin(OnlineDepositRefundQueryBean.getRefundApplicationDateBegin());
			OnlineDepositRefundQueryPage.setRefundApplicationDateEnd(OnlineDepositRefundQueryBean.getRefundApplicationDateEnd());
			OnlineDepositRefundQueryPage.doLoseFocus("RefundApplicationDateEnd",120,0);
			doQuery();
		}
		
		if(!OnlineDepositRefundQueryBean.getRefundStatus().equals("")) {
			OnlineDepositRefundQueryPage.selectRefundStatus(OnlineDepositRefundQueryBean.getRefundStatus());
			doQuery();
		}
		

		if(!OnlineDepositRefundQueryBean.getPhoneNO().equals("")) {
			OnlineDepositRefundQueryPage.setPhoneNO(OnlineDepositRefundQueryBean.getPhoneNO());
			doQuery();
		}
	}
	
	@Test(dataProvider="OnlineDepositRefundQueryByCaseNO")       
	public void testCheck(OnlineDepositRefundQueryBean OnlineDepositRefundQueryBean) {    
		OnlineDepositRefundQueryPage.navigateTo(URL);
		wait.waitFor(500);
		OnlineDepositRefundQueryPage.clickAdvance();
		wait.waitFor(1000);
		

		if(!OnlineDepositRefundQueryBean.getInnerOrderNO().equals("")) {
			OnlineDepositRefundQueryPage.setInnerOrderNO(OnlineDepositRefundQueryBean.getInnerOrderNO());

		}
		
		if(!OnlineDepositRefundQueryBean.getSerialNO().equals("")) {
			OnlineDepositRefundQueryPage.setSerialNO(OnlineDepositRefundQueryBean.getSerialNO());

		}
		
		if(!OnlineDepositRefundQueryBean.getAccountDateBegin().equals("") && !OnlineDepositRefundQueryBean.getAccountDateEnd().equals("")) {
			OnlineDepositRefundQueryPage.setAccountDateBegin(OnlineDepositRefundQueryBean.getAccountDateBegin());
			OnlineDepositRefundQueryPage.setAccountDateEnd(OnlineDepositRefundQueryBean.getAccountDateEnd());

		}
		
		if(!OnlineDepositRefundQueryBean.getRefundApplicationDateBegin().equals("") && !OnlineDepositRefundQueryBean.getRefundApplicationDateEnd().equals("")) {
			OnlineDepositRefundQueryPage.setRefundApplicationDateBegin(OnlineDepositRefundQueryBean.getRefundApplicationDateBegin());
			OnlineDepositRefundQueryPage.setRefundApplicationDateEnd(OnlineDepositRefundQueryBean.getRefundApplicationDateEnd());
			OnlineDepositRefundQueryPage.doLoseFocus("RefundApplicationDateEnd",120,0);

		}
		
		if(!OnlineDepositRefundQueryBean.getRefundStatus().equals("")) {
			OnlineDepositRefundQueryPage.selectRefundStatus(OnlineDepositRefundQueryBean.getRefundStatus());

		}
		

		if(!OnlineDepositRefundQueryBean.getPhoneNO().equals("")) {
			OnlineDepositRefundQueryPage.setPhoneNO(OnlineDepositRefundQueryBean.getPhoneNO());

		}
		
		clickRadio(OnlineDepositRefundQueryBean.getRadio());
		
		
		clickButton("Check");
		
		
		OnlineDepositRefundQueryPage.clickCheck_Close();
		wait.waitFor(1000);
		while(!OnlineDepositRefundQueryPage.isPOPTopDisplayed()) {
			OnlineDepositRefundQueryPage.doPageUp();
			wait.waitFor(300);
		}
	}
}
