package com.dy.AutoTest.OnlineCashier.PageObject.accountmanage;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.dy.AutoTest.web.api.SuperPage;
import com.dy.AutoTest.web.actions.DoPlus;

public class AccountManageSummonsQueryPage extends SuperPage {
	public AccountManageSummonsQueryPage(WebDriver driver) {
		super(driver);
		du.loadLocator("POP_Loc_AccountManageSummonsQuery");
	}
	public void setWaitTime(long waitTime) {
		du=new DoPlus(driver);
		du.waitTime=waitTime;
		du.loadLocator("POP_Loc_AccountManageSummonsQuery");
	}

/***************************Manual Coding**********************************/


/****************************Auto Generate******************************/

	//传票号
	public void setSummonsNum(String value) {
		du.what("SummonsNum").clear();
		du.what("SummonsNum").sendKeys(value);
	}
	public String getSummonsNum() {
		return du.what("SummonsNum").getAttribute("value");
	}
	//账务流水号
	public void setAccountSerialNum(String value) {
		du.what("AccountSerialNum").clear();
		du.what("AccountSerialNum").sendKeys(value);
	}
	public String getAccountSerialNum() {
		return du.what("AccountSerialNum").getAttribute("value");
	}
	//账户种类
	public void selectAccountType(String value) {
		du.whatSelect("AccountType").selectByValue(value);
	}
	//有效起始日期
	public void setDateBegin(String value) {
		du.what("DateBegin").sendKeys(Keys.CONTROL + "a");
		du.waitFor(500);
		du.what("DateBegin").sendKeys(value);
	}
	public String getDateBegin() {
		return du.what("DateBegin").getAttribute("value");
	}
	//有效结束日期
	public void setDateEnd(String value) {
		du.what("DateEnd").sendKeys(Keys.CONTROL + "a");
		du.waitFor(500);
		du.what("DateEnd").sendKeys(value);
	}
	public String getDateEnd() {
		return du.what("DateEnd").getAttribute("value");
	}
	//重置
	public void clickReset() {
		du.what("Reset").click();
	}
	//查看
	public void clickCheck() {
		du.what("Check").click();
	}
	//单选按钮
	public void clickSelectionButton(String radio) {
		du.what("SelectionButton",radio).click();
	}
	public boolean isSelectionButtonDisplayed(String radio) {
		du.waitFor(500);
		return du.what("SelectionButton",radio).isDisplayed();
	}
	//查看_关闭
	public void clickCheck_Close() {
		du.what("Check_Close").click();
	}
	//高级
	public void clickAdvance() {
		du.what("Advance").click();
	}
	//账号
	public void setAccountNo(String value) {
		du.what("AccountNo").clear();
		du.what("AccountNo").sendKeys(value);
	}
	public String getAccountNo() {
		return du.what("AccountNo").getAttribute("value");
	}
	//帐务归属机构
	public void setAccountAffiliationOrgnization(String value) {
		du.what("AccountAffiliationOrgnization").clear();
		du.what("AccountAffiliationOrgnization").sendKeys(value);
	}
	public String getAccountAffiliationOrgnization() {
		return du.what("AccountAffiliationOrgnization").getAttribute("value");
	}
	//手工传票标志
	public void selectManualSummonsFlag(String value) {
		du.whatSelect("ManualSummonsFlag").selectByValue(value);
	}
	//查询
	public void clickQuery() {
		du.what("Query").click();
	}

}