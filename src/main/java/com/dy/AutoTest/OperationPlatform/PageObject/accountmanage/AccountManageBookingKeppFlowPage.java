package com.dy.AutoTest.OperationPlatform.PageObject.accountmanage;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.dy.AutoTest.web.api.SuperPage;
import com.dy.AutoTest.web.actions.DoPlus;

public class AccountManageBookingKeppFlowPage extends SuperPage {
	public AccountManageBookingKeppFlowPage(WebDriver driver) {
		super(driver);
		du.loadLocator("POP_Loc_AccountManageBookingKeppFlow");
	}
	public void setWaitTime(long waitTime) {
		du=new DoPlus(driver);
		du.waitTime=waitTime;
		du.loadLocator("POP_Loc_AccountManageBookingKeppFlow");
	}

/***************************Manual Coding**********************************/


/****************************Auto Generate******************************/

	//高级
	public void clickAdvance() {
		du.what("Advance").click();
	}
	//业务流水号/订单号
	public void setBusinessSerialNO(String value) {
		du.what("BusinessSerialNO").clear();
		du.what("BusinessSerialNO").sendKeys(value);
	}
	public String getBusinessSerialNO() {
		return du.what("BusinessSerialNO").getAttribute("value");
	}
	//记账流水号
	public void setJournalAccountNO(String value) {
		du.what("JournalAccountNO").clear();
		du.what("JournalAccountNO").sendKeys(value);
	}
	public String getJournalAccountNO() {
		return du.what("JournalAccountNO").getAttribute("value");
	}
	//记账状态
	public void selectStatusOfKeepingAccount(String value) {
		du.whatSelect("StatusOfKeepingAccount").selectByValue(value);
	}
	//交易类型
	public void selectTradeType(String value) {
		du.whatSelect("TradeType").selectByValue(value);
	}
	//业务类型
	public void selectBusinessType(String value) {
		du.whatSelect("BusinessType").selectByValue(value);
	}
	//账户种类
	public void selectAccountType(String value) {
		du.whatSelect("AccountType").selectByValue(value);
	}
	//交易日期起始
	public void setTradeDateBegin(String value) {
		du.what("TradeDateBegin").sendKeys(Keys.CONTROL + "a");
		du.waitFor(500);
		du.what("TradeDateBegin").sendKeys(value);
	}
	public String getTradeDateBegin() {
		return du.what("TradeDateBegin").getAttribute("value");
	}
	//交易日期结束
	public void setTradeDateEnd(String value) {
		du.what("TradeDateEnd").sendKeys(Keys.CONTROL + "a");
		du.waitFor(500);
		du.what("TradeDateEnd").sendKeys(value);
	}
	public String getTradeDateEnd() {
		return du.what("TradeDateEnd").getAttribute("value");
	}
	//查询
	public void clickQuery() {
		du.what("Query").click();
	}
	//重置
	public void clickReset() {
		du.what("Reset").click();
	}
	//记账列表单选按钮
	public void clickAccountRadio(String radio) {
		du.what("AccountRadio",radio).click();
	}
	public boolean isAccountRadioDisplayed(String radio) {
		du.waitFor(500);
		return du.what("AccountRadio",radio).isDisplayed();
	}

}