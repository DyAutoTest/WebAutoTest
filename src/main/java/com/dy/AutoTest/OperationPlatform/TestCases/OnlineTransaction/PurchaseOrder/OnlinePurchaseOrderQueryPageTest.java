package com.dy.AutoTest.OperationPlatform.TestCases.OnlineTransaction.PurchaseOrder;



import java.lang.reflect.Method;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.dy.AutoTest.OperationPlatform.POJO.OnlinePurchaseOrderQueryBean;
import com.dy.AutoTest.OperationPlatform.PageObject.OnlineTransaction.PurchaseOrder.OnlinePurchaseOrderQueryPage;
import com.dy.AutoTest.web.api.SuperTest;
import com.dy.AutoTest.web.business.DataBusiness;

public class OnlinePurchaseOrderQueryPageTest extends SuperTest{
	OnlinePurchaseOrderQueryPage OnlinePurchaseOrderQueryPage;
    String URL;
    
    @BeforeClass
	public void init() {
    	OnlinePurchaseOrderQueryPage=new OnlinePurchaseOrderQueryPage(driver);
    	OnlinePurchaseOrderQueryPage.setWaitTime(500);
    	iClickRadio=OnlinePurchaseOrderQueryPage;
    	iClickButton=OnlinePurchaseOrderQueryPage;
		URL=host.toString()+DataBusiness.getData_URL("pop_OnlinePurchaseOrderQuery");
	}
	
	@DataProvider(name="OnlinePurchaseOrderQuery")
	protected static Object[][] parametersPool(){
		data.loadDataBeanList("POP_Data_OnlinePurchaseOrderQuery");
		return data.getDataBeanArray();
	}
	
	@DataProvider(name="OnlinePurchaseOrderQueryByCaseNO")
	protected static Object[][] parametersPool(Method method){
		data.loadDataBeanList("POP_Data_OnlinePurchaseOrderQuery",method.getName());
		return data.getDataBeanArray();
	}
	
	@Test(dataProvider="OnlinePurchaseOrderQueryByCaseNO",description="运营平台-线上交易查询")       
	public void testQuery(OnlinePurchaseOrderQueryBean OnlinePurchaseOrderQueryBean) {    
		OnlinePurchaseOrderQueryPage.navigateTo(URL);
		OnlinePurchaseOrderQueryPage.clickAdvance();
		wait.waitFor(1000);
		
		if(!OnlinePurchaseOrderQueryBean.getMerchantOrderNO().equals("")) {
			OnlinePurchaseOrderQueryPage.setMerchantOrderNO(OnlinePurchaseOrderQueryBean.getMerchantOrderNO());
			doQuery();
		}
		if(!OnlinePurchaseOrderQueryBean.getMerchantNO().equals("")) {
			OnlinePurchaseOrderQueryPage.setMerchantNO(OnlinePurchaseOrderQueryBean.getMerchantNO());
			doQuery();
		}
		if(!OnlinePurchaseOrderQueryBean.getAccountingDateBegin().equals("") && !OnlinePurchaseOrderQueryBean.getAccountingDateEnd().equals("")) {
			OnlinePurchaseOrderQueryPage.setAccountingDateBegin(OnlinePurchaseOrderQueryBean.getAccountingDateBegin());
			OnlinePurchaseOrderQueryPage.setAccountingDateEnd(OnlinePurchaseOrderQueryBean.getAccountingDateEnd());
			doQuery();
		}
		if(!OnlinePurchaseOrderQueryBean.getOrderDateBegin().equals("") && !OnlinePurchaseOrderQueryBean.getOrderDateEnd().equals("")) {
			OnlinePurchaseOrderQueryPage.setOrderDateBegin(OnlinePurchaseOrderQueryBean.getOrderDateBegin());
			OnlinePurchaseOrderQueryPage.setOrderDateEnd(OnlinePurchaseOrderQueryBean.getOrderDateEnd());
			doQuery();
		}
		if(!OnlinePurchaseOrderQueryBean.getBusinessChannel().equals("")) {
			OnlinePurchaseOrderQueryPage.selectBusinessChannel(OnlinePurchaseOrderQueryBean.getBusinessChannel());
			doQuery();
		}
		if(!OnlinePurchaseOrderQueryBean.getPaymentMode().equals("")) {
			OnlinePurchaseOrderQueryPage.selectPaymentMode(OnlinePurchaseOrderQueryBean.getPaymentMode());
			doQuery();
		}
		if(!OnlinePurchaseOrderQueryBean.getUserPhoneNO().equals("")) {
			OnlinePurchaseOrderQueryPage.setUserPhoneNO(OnlinePurchaseOrderQueryBean.getUserPhoneNO());
			doQuery();
		}
		if(!OnlinePurchaseOrderQueryBean.getInnerOrderNO().equals("")) {
			OnlinePurchaseOrderQueryPage.setInnerOrderNO(OnlinePurchaseOrderQueryBean.getInnerOrderNO());
			doQuery();
		}
		if(!OnlinePurchaseOrderQueryBean.getOrderStatus().equals("")) {
			OnlinePurchaseOrderQueryPage.selectOrderStatus(OnlinePurchaseOrderQueryBean.getOrderStatus());
			doQuery();
		}
		if(!OnlinePurchaseOrderQueryBean.getKeepDomain().equals("")) {
			OnlinePurchaseOrderQueryPage.setKeepDomain(OnlinePurchaseOrderQueryBean.getKeepDomain());
			doQuery();
		}
		
	}
	
	@Test(dataProvider="OnlinePurchaseOrderQueryByCaseNO",description="运营平台-线上交易-查看详情")       
	public void testCheck(OnlinePurchaseOrderQueryBean OnlinePurchaseOrderQueryBean) {    
		OnlinePurchaseOrderQueryPage.navigateTo(URL);
		OnlinePurchaseOrderQueryPage.clickAdvance();
		wait.waitFor(1000);
		

		if(!OnlinePurchaseOrderQueryBean.getMerchantOrderNO().equals("")) {
			OnlinePurchaseOrderQueryPage.setMerchantOrderNO(OnlinePurchaseOrderQueryBean.getMerchantOrderNO());
		}
		if(!OnlinePurchaseOrderQueryBean.getMerchantNO().equals("")) {
			OnlinePurchaseOrderQueryPage.setMerchantNO(OnlinePurchaseOrderQueryBean.getMerchantNO());
			OnlinePurchaseOrderQueryPage.clickQuery();
		}
		if(!OnlinePurchaseOrderQueryBean.getAccountingDateBegin().equals("") && !OnlinePurchaseOrderQueryBean.getAccountingDateEnd().equals("")) {
			OnlinePurchaseOrderQueryPage.setAccountingDateBegin(OnlinePurchaseOrderQueryBean.getAccountingDateBegin());
			OnlinePurchaseOrderQueryPage.setAccountingDateEnd(OnlinePurchaseOrderQueryBean.getAccountingDateEnd());
		}
		if(!OnlinePurchaseOrderQueryBean.getOrderDateBegin().equals("") && !OnlinePurchaseOrderQueryBean.getOrderDateEnd().equals("")) {
			OnlinePurchaseOrderQueryPage.setOrderDateBegin(OnlinePurchaseOrderQueryBean.getOrderDateBegin());
			OnlinePurchaseOrderQueryPage.setOrderDateEnd(OnlinePurchaseOrderQueryBean.getOrderDateEnd());
		}
		if(!OnlinePurchaseOrderQueryBean.getBusinessChannel().equals("")) {
			OnlinePurchaseOrderQueryPage.selectBusinessChannel(OnlinePurchaseOrderQueryBean.getBusinessChannel());
		}
		if(!OnlinePurchaseOrderQueryBean.getPaymentMode().equals("")) {
			OnlinePurchaseOrderQueryPage.selectPaymentMode(OnlinePurchaseOrderQueryBean.getPaymentMode());
		}
		if(!OnlinePurchaseOrderQueryBean.getUserPhoneNO().equals("")) {
			OnlinePurchaseOrderQueryPage.setUserPhoneNO(OnlinePurchaseOrderQueryBean.getUserPhoneNO());
		}
		if(!OnlinePurchaseOrderQueryBean.getInnerOrderNO().equals("")) {
			OnlinePurchaseOrderQueryPage.setInnerOrderNO(OnlinePurchaseOrderQueryBean.getInnerOrderNO());
		}
		if(!OnlinePurchaseOrderQueryBean.getOrderStatus().equals("")) {
			OnlinePurchaseOrderQueryPage.selectOrderStatus(OnlinePurchaseOrderQueryBean.getOrderStatus());
		}
		if(!OnlinePurchaseOrderQueryBean.getKeepDomain().equals("")) {
			OnlinePurchaseOrderQueryPage.setKeepDomain(OnlinePurchaseOrderQueryBean.getKeepDomain());
		}
		
		
		clickRadio(OnlinePurchaseOrderQueryBean.getRadio());
		
		
		clickButton("Check");
		
		
		OnlinePurchaseOrderQueryPage.clickCheck_Close();
		wait.waitFor(1000);
		while(!OnlinePurchaseOrderQueryPage.isPOPTopDisplayed()) {
			OnlinePurchaseOrderQueryPage.doPageUp();
			wait.waitFor(300);
		}
		//详情中的tab页暂时不做轮巡点击
	}
	
	/**
	 * @param OnlinePurchaseOrderQueryBean
	 * 暂时不做
	 */
	@Test(dataProvider="OnlinePurchaseOrderQueryByCaseNO",description="运营平台-线上交易-Excel导出")       
	public void testExcel(OnlinePurchaseOrderQueryBean OnlinePurchaseOrderQueryBean) {    
		OnlinePurchaseOrderQueryPage.navigateTo(URL);
	}
}
