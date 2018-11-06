package com.dy.AutoTest.OnlineCashier.PageObject;

import org.openqa.selenium.WebDriver;

import com.dy.AutoTest.OperationPlatform.PageObject.SuperPage;
import com.dy.AutoTest.web.actions.DoPlus;

public class OnlineCashierB2BPage extends SuperPage{
	
	public OnlineCashierB2BPage(WebDriver driver) {
		super(driver);
		du.loadLocator("Online_Loc_Cashier_B2B");
	}
	public void setWaitTime(long waitTime) {
		du=new DoPlus(driver);
		du.waitTime=waitTime;
		du.loadLocator("Online_Loc_Cashier_B2B");
	}
	
	public void setMerchantNO(String MerchantNO) {
		du.what("MerchantNO").clear();
		du.what("MerchantNO").sendKeys(MerchantNO);
	}
	
	public void setCertificatePassword(String CertificatePassword) {
		du.what("CertificatePassword").clear();
		du.what("CertificatePassword").sendKeys(CertificatePassword);
	}
	
	public void resetMerchantResource() {
		du.what("Button_Reset").click();
	}
	
	public void GoToB2B(){
		du.what("B2B").click();
	}

	public void setMerchantRequestNO(String MerchantRequestNO) {
		du.what("MerchantRequestNO").clear();
		du.what("MerchantRequestNO").sendKeys(MerchantRequestNO);
	}
	
	public String getMerchantRequestNO() {
		return du.what("MerchantRequestNO").getAttribute("value");
	}
	
	public void setOrderNO(String OrderNO) {
		du.what("OrderNO").clear();
		du.what("OrderNO").sendKeys(OrderNO);
	}
	
	public void setReceiptMerchantNO(String ReceiptMerchantNO) {
		du.what("ReceiptMerchantNO").clear();
		du.what("ReceiptMerchantNO").sendKeys(ReceiptMerchantNO);
	}
	
	public void setOrderAmount(String OrderAmount) {
		du.what("OrderAmount").clear();
		du.what("OrderAmount").sendKeys(OrderAmount);
	}
	
	public void setPaymentAmout(String PaymentAmout) {
		du.what("PaymentAmout").clear();
		du.what("PaymentAmout").sendKeys(PaymentAmout);
	}
	
	public void doSubOrderAdd() {
		du.what("SubOrderAdd").click();
		du.waitFor(1000);
	}
	
	public void setReceiptMerchantType(String ReceiptMerchantType) {
		du.whatSelect("ReceiptMerchantType").selectByValue(ReceiptMerchantType);
	}
	
	public void setSubOrderNO(String SubOrderNO,int index) {
		du.what("SubOrderNO", String.valueOf(index+2)).clear();
		du.what("SubOrderNO", String.valueOf(index+2)).sendKeys(SubOrderNO);
	}
	
	public void setSubOrderAmount(String SubOrderAmount,int index) {
		du.what("SubOrderAmount", String.valueOf(index+2)).clear();
		du.what("SubOrderAmount", String.valueOf(index+2)).sendKeys(SubOrderAmount);
	}
	
	public void setSubPaymentAmount(String SubPaymentAmount,int index) {
		du.what("SubPaymentAmount", String.valueOf(index+2)).clear();
		du.what("SubPaymentAmount", String.valueOf(index+2)).sendKeys(SubPaymentAmount);
	}
	
	public void setSubReceiptMerchantNO(String SubReceiptMerchantNO,int index) {
		du.what("SubReceiptMerchantNO", String.valueOf(index+2)).clear();
		du.what("SubReceiptMerchantNO", String.valueOf(index+2)).sendKeys(SubReceiptMerchantNO);
	}
	
		
	public void doSubmit() {
		du.what("Button_Submit").click();
	}
	public void doSubmit2() {
		du.what("Button_Submit2").click();
	}
	
	
	/**
	 * @return
	 * 
	 * 订单错误页面
	 */
	public boolean isOrderError() {
		return du.isDisplayed("OrderError");
	}
	
	public String getOrderErrorDetail() {
		return du.what("OrderErrorDetail").getText();
	}
	
	public void waitForOnlineCashier() {
		du.waitForElementPresent("EnterpriseEBank");
	}
	
	/**
	 * @param PaymentType
	 * 
	 * E : 企业网银
	 * P : 个人网银
	 */
	public void doEnterpriseEBank() {
		du.what("EnterpriseEBank").click();
	}
	
			public void doChooseEnterpriseEBank() {
				du.what("EnterpriseEBank_ChoosBank").click();
			}
			
	public void doPersonalEBank() {
		du.what("PersonalEBank").click();
	}
	
			public void doChoosePersonalEBank() {
				du.what("PersonalEBank_ChoosBank").click();
			}
			
			public void setEBank_CardNO(String EBank_CardNO) {
				du.waitForElementPresent("PersonalEBank__UnionpayCard");
				du.what("PersonalEBank__UnionpayCard").clear(); 
				du.what("PersonalEBank__UnionpayCard").sendKeys(EBank_CardNO);
			}
			
			public void doEBank_UnionpayNext() {
				du.what("PersonalEBank_UnionpayNext").click();
			}
			
			public void doEBank_GetUnionpaySMS() {
				du.waitForElementPresent("PersonalEBank_GetUnionpaySMS");
				du.what("PersonalEBank_GetUnionpaySMS").click();
			}
			
			public void setEBank_UnionpaySMS(String EBank_UnionpaySMS) {
				du.what("PersonalEBank_UnionpaySMS").sendKeys(EBank_UnionpaySMS);
			}
			
			public void doEBank_UnionpayPay() {
				du.what("PersonalEBank_UnionpayPay").click();
			}
			
			public boolean isEBank_UnionpaySuccess() {
				return du.what("PersonalEBank_UnionpaySuccess").isDisplayed();
			}
			
			public void doEBank_UnionpayBack() {
				du.what("PersonalEBank_UnionpayBack").click();
			}
			
			public String getEBank_UnionpayMainWord() {
				return du.what("PersonalEBank_UnionpayMainWord").getText();
			}
	
	public void doPayment() {
		du.what("Payment").click();
	}
	
	
	public boolean isPaymentError() {
		return du.what("Payment_Error").isDisplayed();
	}
	
	public String getPaymentError() {
		return du.what("Payment_Error").getText();
	}
	
	
	public boolean isPaySuccess() {
		du.waitForElementPresent("Message_PaySuccess");
		
		return du.isDisplayed("Message_PaySuccess");
	}
	
	
}
