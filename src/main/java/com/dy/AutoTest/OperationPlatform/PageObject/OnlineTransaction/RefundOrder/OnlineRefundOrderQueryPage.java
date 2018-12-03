package com.dy.AutoTest.OperationPlatform.PageObject.OnlineTransaction.RefundOrder;

import com.dy.AutoTest.web.api.IClickButton;
import com.dy.AutoTest.web.api.IClickRadio;
import com.dy.AutoTest.web.api.IQuery;


import org.openqa.selenium.Keys;

import org.openqa.selenium.WebDriver;

import com.dy.AutoTest.web.api.SuperPage;
import com.dy.AutoTest.web.actions.DoPlus;

public class OnlineRefundOrderQueryPage extends SuperPage 
			implements IClickButton,IClickRadio,IQuery{
	public OnlineRefundOrderQueryPage(WebDriver driver) {
		super(driver);
		du.loadLocator("POP_Loc_OnlineRefundOrderQuery");
	}
	public void setWaitTime(long waitTime) {
		du=new DoPlus(driver);
		du.waitTime=waitTime;
		du.loadLocator("POP_Loc_OnlineRefundOrderQuery");
	}

/***************************Manual Coding**********************************/


/****************************Auto Generate******************************/

	//高级
	public void clickAdvance() {
		du.what("Advance").click();
	}
	//商户号
	public void setMerchantNO(String value) {
		du.what("MerchantNO").clear();
		du.what("MerchantNO").sendKeys(value);
	}
	public String getMerchantNO() {
		return du.what("MerchantNO").getAttribute("value");
	}
	//商户订单编号
	public void setMerchantOrderNO (String value) {
		du.what("MerchantOrderNO").clear();
		du.what("MerchantOrderNO").sendKeys(value);
	}
	public String getMerchantOrderNO () {
		return du.what("MerchantOrderNO ").getAttribute("value");
	}
	//会计日期（起始日期）
	public void setAccountingDateBegin(String value) {
		du.what("AccountingDateBegin").sendKeys(Keys.CONTROL + "a");
		du.waitFor(500);
		du.what("AccountingDateBegin").sendKeys(value);
	}
	public String getAccountingDateBegin() {
		return du.what("AccountingDateBegin").getAttribute("value");
	}
	//会计日期（结束日期）
	public void setAccountingDateEnd(String value) {
		du.what("AccountingDateEnd").sendKeys(Keys.CONTROL + "a");
		du.waitFor(500);
		du.what("AccountingDateEnd").sendKeys(value);
	}
	public String getAccountingDateEnd() {
		return du.what("AccountingDateEnd").getAttribute("value");
	}
	//订单日期（起始日期）
	public void setOrderDateBegin(String value) {
		du.what("OrderDateBegin").sendKeys(Keys.CONTROL + "a");
		du.waitFor(500);
		du.what("OrderDateBegin").sendKeys(value);
	}
	public String getOrderDateBegin() {
		return du.what("OrderDateBegin").getAttribute("value");
	}
	//订单日期（结束日期）
	public void setOrderDateEnd(String value) {
		du.what("OrderDateEnd").sendKeys(Keys.CONTROL + "a");
		du.waitFor(500);
		du.what("OrderDateEnd").sendKeys(value);
	}
	public String getOrderDateEnd() {
		return du.what("OrderDateEnd").getAttribute("value");
	}
	//退款状态
	public void selectRefundStatus(String value) {
		du.whatSelect("RefundStatus").selectByValue(value);
	}
	//用户手机号
	public void setUserPhoneNO(String value) {
		du.what("UserPhoneNO").clear();
		du.what("UserPhoneNO").sendKeys(value);
	}
	public String getUserPhoneNO() {
		return du.what("UserPhoneNO").getAttribute("value");
	}
	//内部订单号
	public void setInnerOrderNO(String value) {
		du.what("InnerOrderNO").clear();
		du.what("InnerOrderNO").sendKeys(value);
	}
	public String getInnerOrderNO() {
		return du.what("InnerOrderNO").getAttribute("value");
	}
	//查询
	public void clickQuery() {
		du.what("Query").click();
	}
	//重置
	public void clickReset() {
		du.what("Reset").click();
	}
	//查看
	public void clickCheck() {
		du.what("Check").click();
	}
	//订单列表单选按钮
	public void clickRadio(String radio) {
		du.what("Radio",radio).click();
	}
	public boolean isRadioExist(String radio) {
		du.waitFor(500);
		return du.isElementExist("Radio",radio);
	}
	//查看_关闭
	public void clickCheck_Close() {
		du.what("Check_Close").click();
	}

}