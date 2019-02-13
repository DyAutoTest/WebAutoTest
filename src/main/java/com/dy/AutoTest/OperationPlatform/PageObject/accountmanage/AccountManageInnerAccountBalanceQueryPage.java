package com.dy.AutoTest.OperationPlatform.PageObject.accountmanage;

import org.openqa.selenium.WebDriver;

import com.dy.AutoTest.web.api.SuperPage;
import com.dy.AutoTest.web.actions.DoPlus;

public class AccountManageInnerAccountBalanceQueryPage extends SuperPage {
	public AccountManageInnerAccountBalanceQueryPage(WebDriver driver) {
		super(driver);
		du.loadLocator("POP_Loc_AccountManageInnerAccountBalanceQuery");
	}
	public void setWaitTime(long waitTime) {
		du=new DoPlus(driver);
		du.waitTime=waitTime;
		du.loadLocator("POP_Loc_AccountManageInnerAccountBalanceQuery");
	}

/***************************Manual Coding**********************************/


/****************************Auto Generate******************************/

	//账户种类
	public void selectAccountType(String value) {
		du.whatSelect("AccountType").selectByValue(value);
	}
	//账户
	public void setAccountNO(String value) {
		du.what("AccountNO").clear();
		du.what("AccountNO").sendKeys(value);
	}
	public String getAccountNO() {
		return du.what("AccountNO").getAttribute("value");
	}
	//查询
	public void clickQuery() {
		du.what("Query").click();
	}
	//重置
	public void clickReset() {
		du.what("Reset").click();
	}
	//切换
	public void clickSwitch() {
		du.what("Switch").click();
	}

}