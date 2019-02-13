package com.dy.AutoTest.OperationPlatform.PageObject.accountmanage;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.dy.AutoTest.web.api.SuperPage;
import com.dy.AutoTest.web.actions.DoPlus;

public class AccountManageOnlineInternalAccountPaymentQueryPage extends SuperPage {
	public AccountManageOnlineInternalAccountPaymentQueryPage(WebDriver driver) {
		super(driver);
		du.loadLocator("POP_Loc_AccountManageOnlineInternalAccountPaymentQuery");
	}
	public void setWaitTime(long waitTime) {
		du=new DoPlus(driver);
		du.waitTime=waitTime;
		du.loadLocator("POP_Loc_AccountManageOnlineInternalAccountPaymentQuery");
	}

/***************************Manual Coding**********************************/


/****************************Auto Generate******************************/

	//内部账户账号
	public void setInnerAccountNO(String value) {
		du.what("InnerAccountNO").clear();
		du.what("InnerAccountNO").sendKeys(value);
	}
	public String getInnerAccountNO() {
		return du.what("InnerAccountNO").getAttribute("value");
	}
	//账户种类
	public void selectAccountType(String value) {
		du.whatSelect("AccountType").selectByValue(value);
	}
	//资金状态
	public void selectMoneyStatus(String value) {
		du.whatSelect("MoneyStatus").selectByValue(value);
	}
	//起始日期
	public void setDateBegin(String value) {
		du.what("DateBegin").sendKeys(Keys.CONTROL + "a");
		du.waitFor(500);
		du.what("DateBegin").sendKeys(value);
	}
	public String getDateBegin() {
		return du.what("DateBegin").getAttribute("value");
	}
	//结束日期
	public void setDateEnd(String value) {
		du.what("DateEnd").sendKeys(Keys.CONTROL + "a");
		du.waitFor(500);
		du.what("DateEnd").sendKeys(value);
	}
	public String getDateEnd() {
		return du.what("DateEnd").getAttribute("value");
	}
	//查询
	public void clickQuery() {
		du.what("Query").click();
	}
	//重置
	public void clickReset() {
		du.what("Reset").click();
	}
	//查看详情
	public void clickCheck() {
		du.what("Check").click();
	}
	//查看详情_关闭
	public void clickCheck_Close() {
		du.what("Check_Close").click();
	}
	//单选选项
	public void clickSelectionButton(String radio) {
		du.what("SelectionButton",radio).click();
	}
	public boolean isSelectionButtonDisplayed(String radio) {
		du.waitFor(500);
		return du.what("SelectionButton",radio).isDisplayed();
	}
	
	public void setFocusOnInnerAccountNO() {
		du.what("InnerAccountNO").click();
	}

}