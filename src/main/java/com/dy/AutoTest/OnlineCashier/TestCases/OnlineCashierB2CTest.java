package com.dy.AutoTest.OnlineCashier.TestCases;


import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.dy.AutoTest.OnlineCashier.POJO.OnlineCashierB2CBean;
import com.dy.AutoTest.OnlineCashier.PageObject.OnlineCashierB2CPage;
import com.dy.AutoTest.OperationPlatform.TestCases.SuperTest;
import com.dy.AutoTest.web.business.DataBusiness;

public class OnlineCashierB2CTest extends SuperTest{
	OnlineCashierB2CPage OnlineCashierB2CPage;
    String URL;
    
    @BeforeClass
	public void init() {
    	OnlineCashierB2CPage=new OnlineCashierB2CPage(driver);
		URL=host.toString();
	}
	
	@DataProvider(name="B2C")
	protected static Object[][] parametersPool(){
		data.loadDataBeanList("Online_Data_Cashier_B2C");
		return data.getDataBeanArray();
	}
	
	@Test(dataProvider="B2C")
	public void testOnlineCashierB2C(OnlineCashierB2CBean OnlineCashierB2CBean) {
		OnlineCashierB2CPage.navigateTo(URL);
		
		OnlineCashierB2CPage.setMerchantNO(OnlineCashierB2CBean.getMerchantNO());
		OnlineCashierB2CPage.setCertificatePassword(OnlineCashierB2CBean.getCertificatePassword());
		OnlineCashierB2CPage.resetMerchantResource();
		OnlineCashierB2CPage.GoToB2C();
		
		OnlineCashierB2CPage.setAmount(OnlineCashierB2CBean.getAmount());
		OnlineCashierB2CPage.setMobileNO(OnlineCashierB2CBean.getMobileNO());
		OnlineCashierB2CPage.doSubmit();
		
		OnlineCashierB2CPage.setPaymentPassword(OnlineCashierB2CBean.getPaymentPassword());
		OnlineCashierB2CPage.doNext();
		
		if(OnlineCashierB2CPage.isAntiPhishing()) {
			OnlineCashierB2CPage.doAntiPhishing();
		}
		
		if(OnlineCashierB2CBean.getPaymentChannel().equals(""))
			OnlineCashierB2CBean.setPaymentChannel("0");
		OnlineCashierB2CPage.switchPayment(OnlineCashierB2CBean.getPaymentChannel());
		
		OnlineCashierB2CPage.doPayment();
		
		
		if(OnlineCashierB2CPage.isPaySuccess()) {
			System.out.println("[info]支付成功！用户 "+OnlineCashierB2CBean.getMobileNO()
			+" 在 "+OnlineCashierB2CBean.getMerchantNO()+" 下，消费 "+Integer.parseInt(OnlineCashierB2CBean.getAmount())*0.01+" 元");
			
			Reporter.log("[info]支付成功！用户 "+OnlineCashierB2CBean.getMobileNO()
			+" 在 "+OnlineCashierB2CBean.getMerchantNO()+" 下，消费 "+Integer.parseInt(OnlineCashierB2CBean.getAmount())*0.01+" 元");
		}else {
			System.out.println("支付失败");
			Reporter.log("支付失败");
		}
		
		
	}
}
