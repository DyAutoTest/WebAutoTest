package com.dy.AutoTest.OnlineCashier.PageObject;

import org.openqa.selenium.WebDriver;

import com.dy.AutoTest.OperationPlatform.PageObject.SuperPage;
import com.dy.AutoTest.web.actions.DoPlus;

public class OnlineCashierB2CPage extends SuperPage{
	
	public OnlineCashierB2CPage(WebDriver driver) {
		super(driver);
		du.loadLocator("Online_Loc_Cashier_B2C");
	}
	public void setWaitTime(long waitTime) {
		du=new DoPlus(driver);
		du.waitTime=waitTime;
		du.loadLocator("Online_Loc_Cashier_B2C");
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
	
	public void GoToB2C(){
		du.what("B2C").click();
	}

	public void setOrderDate(String OrderDate) {
		du.what("OrderDate").clear();
		du.what("OrderDate").sendKeys(OrderDate);
	}
	
	/**
	 * @param CardType
	 * 1: 借记卡
	 * 2: 贷记卡
	 * 3: 支付账户
	 */
	public void setCardType(String CardType) {
		du.whatSelect("CardType").selectByValue(CardType);
	}
	
	public void setMerchantOrderNO(String MerchantOrderNO) {
		du.what("MerchantOrderNO").clear();
		du.what("MerchantOrderNO").sendKeys(MerchantOrderNO);
	}
	
	public void setAmount(String Amount) {
		du.what("Amount").clear();
		du.what("Amount").sendKeys(Amount);
	}
	
	public void setCallbackURL(String CallbackURL) {
		du.what("CallbackURL").clear();
		du.what("CallbackURL").sendKeys(CallbackURL);
	}
	
	public void setMobileNO(String MobileNO) {
		du.what("MobileNO").clear();
		du.what("MobileNO").sendKeys(MobileNO);
	}
	
	public void setProductName(String ProductName) {
		du.what("ProductName").clear();
		du.what("ProductName").sendKeys(ProductName);
	}
	
	public void setProductNO(String ProductNO) {
		du.what("ProductNO").clear();
		du.what("ProductNO").sendKeys(ProductNO);
	}
	
	public void setProductDescription(String ProductDescription) {
		du.what("ProductDescription").clear();
		du.what("ProductDescription").sendKeys(ProductDescription);
	}
	
	public void setBackParam(String BackParam) {
		du.what("BackParam").clear();
		du.what("BackParam").sendKeys(BackParam);
	}
	
	public void setValidity(String Validity) {
		du.what("Validity").clear();
		du.what("Validity").sendKeys(Validity);
	}
	
	/**
	 * @param ValidityUnit
	 * 00 : 分
	 * 01 : 小时
	 * 02 : 日
	 * 03 : 月
	 */
	public void setValidityUnit(String ValidityUnit) {
		du.whatSelect("ValidityUnit").selectByValue(ValidityUnit);
	}
	
	public void setUserBindFlag(String UserBindFlag) {
		du.whatSelect("UserBindFlag").selectByValue(UserBindFlag);
	}
	
	public void doSubmit() {
		du.what("Button_Submit").click();
	}
	
	/**
	 * @param PaymentPassword
	 * 等待实现
	 * 
	 */
	public void setPaymentPassword(String PaymentPassword) {
		du.waitFor(6000);
		
	}
	
	public void doNext() {
		du.what("Button_Next").click();
	}
	
	public boolean isAntiPhishing() {
		du.waitFor(1000);
		return du.isDisplayed("Div_AntiPhishing");
	}
	
	public void doAntiPhishing() {
		du.what("Button_AntiPhishing").click();
	}
	
	public void doBlance() {
		if(!du.what("Checkbox_Blance").isSelected())
			du.what("Checkbox_Blance").click();
	}
	
	public void doQuick() {
		if(!du.what("Checkbox_Quick").isSelected())
			du.what("Checkbox_Quick").click();
	}
	
	public void doEbank() {
		if(!du.what("Checkbox_Ebank").isSelected())
			du.what("Checkbox_Ebank").click();
	}
	
	public void doScanPay() {
		if(!du.what("Checkbox_ScanPay").isSelected())
			du.what("Checkbox_ScanPay").click();
	}
	
	public void switchPayment(String PaymentChannel) {
		switch(PaymentChannel) {
		case "0":
			doBlance();
			break;
		case "1":
			doQuick();
			break;
		case "2":
			doEbank();
			break;
		case "3":
			doScanPay();
			break;
		default:
			System.out.println("No such payment channel");
			break;
		
		}
	}
	
	public void doPayment() {
		du.what("Payment").click();
	}
	
	public boolean isPaySuccess() {
		du.waitFor(1000);
		return du.isDisplayed("Message_PaySuccess");
	}
	
	
}
