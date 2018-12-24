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
    	iQuery=OnlinePurchaseOrderQueryPage;
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
		wait.waitFor(1000);
		
		if(!OnlinePurchaseOrderQueryBean.getMerchantOrderNO().equals("")) {
			OnlinePurchaseOrderQueryPage.clickAdvance();
			OnlinePurchaseOrderQueryPage.setMerchantOrderNO(OnlinePurchaseOrderQueryBean.getMerchantOrderNO());
			clickAdvanceBeforeDoQuery();
		}
		if(!OnlinePurchaseOrderQueryBean.getMerchantNO().equals("")) {
			OnlinePurchaseOrderQueryPage.clickAdvance();
			OnlinePurchaseOrderQueryPage.setMerchantNO(OnlinePurchaseOrderQueryBean.getMerchantNO());
			clickAdvanceBeforeDoQuery();
		}
		if(!OnlinePurchaseOrderQueryBean.getAccountingDateBegin().equals("") && !OnlinePurchaseOrderQueryBean.getAccountingDateEnd().equals("")) {
			OnlinePurchaseOrderQueryPage.clickAdvance();
			OnlinePurchaseOrderQueryPage.setAccountingDateBegin(OnlinePurchaseOrderQueryBean.getAccountingDateBegin());
			OnlinePurchaseOrderQueryPage.setAccountingDateEnd(OnlinePurchaseOrderQueryBean.getAccountingDateEnd());
			clickAdvanceBeforeDoQuery();
		}
		if(!OnlinePurchaseOrderQueryBean.getOrderDateBegin().equals("") && !OnlinePurchaseOrderQueryBean.getOrderDateEnd().equals("")) {
			OnlinePurchaseOrderQueryPage.clickAdvance();
			OnlinePurchaseOrderQueryPage.setOrderDateBegin(OnlinePurchaseOrderQueryBean.getOrderDateBegin());
			OnlinePurchaseOrderQueryPage.setOrderDateEnd(OnlinePurchaseOrderQueryBean.getOrderDateEnd());
			clickAdvanceBeforeDoQuery();
		}
		if(!OnlinePurchaseOrderQueryBean.getBusinessChannel().equals("")) {
			OnlinePurchaseOrderQueryPage.clickAdvance();
			OnlinePurchaseOrderQueryPage.selectBusinessChannel(OnlinePurchaseOrderQueryBean.getBusinessChannel());
			clickAdvanceBeforeDoQuery();
		}
		if(!OnlinePurchaseOrderQueryBean.getPaymentMode().equals("")) {
			OnlinePurchaseOrderQueryPage.clickAdvance();
			OnlinePurchaseOrderQueryPage.selectPaymentMode(OnlinePurchaseOrderQueryBean.getPaymentMode());
			clickAdvanceBeforeDoQuery();
		}
		if(!OnlinePurchaseOrderQueryBean.getUserPhoneNO().equals("")) {
			OnlinePurchaseOrderQueryPage.clickAdvance();
			OnlinePurchaseOrderQueryPage.setUserPhoneNO(OnlinePurchaseOrderQueryBean.getUserPhoneNO());
			clickAdvanceBeforeDoQuery();
		}
		if(!OnlinePurchaseOrderQueryBean.getInnerOrderNO().equals("")) {
			OnlinePurchaseOrderQueryPage.clickAdvance();
			OnlinePurchaseOrderQueryPage.setInnerOrderNO(OnlinePurchaseOrderQueryBean.getInnerOrderNO());
			clickAdvanceBeforeDoQuery();
		}
		if(!OnlinePurchaseOrderQueryBean.getOrderStatus().equals("")) {
			OnlinePurchaseOrderQueryPage.clickAdvance();
			OnlinePurchaseOrderQueryPage.selectOrderStatus(OnlinePurchaseOrderQueryBean.getOrderStatus());
			clickAdvanceBeforeDoQuery();
		}
		if(!OnlinePurchaseOrderQueryBean.getKeepDomain().equals("")) {
			OnlinePurchaseOrderQueryPage.clickAdvance();
			OnlinePurchaseOrderQueryPage.setKeepDomain(OnlinePurchaseOrderQueryBean.getKeepDomain());
			clickAdvanceBeforeDoQuery();
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
		
		OnlinePurchaseOrderQueryPage.clickAdvance();
		wait.waitFor(1000);
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
