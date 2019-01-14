package com.dy.AutoTest.OnlineCashier.PageObject.accountmanage;

import org.openqa.selenium.WebDriver;

import com.dy.AutoTest.web.api.SuperPage;
import com.dy.AutoTest.web.actions.DoPlus;

public class AccountManageInformDetailQueryPage extends SuperPage {
	public AccountManageInformDetailQueryPage(WebDriver driver) {
		super(driver);
		du.loadLocator("POP_Loc_AccountManageInformDetailQuery");
	}
	public void setWaitTime(long waitTime) {
		du=new DoPlus(driver);
		du.waitTime=waitTime;
		du.loadLocator("POP_Loc_AccountManageInformDetailQuery");
	}

/***************************Manual Coding**********************************/


/****************************Auto Generate******************************/

	//内部用户号
	public void setInnerUserNO(String value) {
		du.what("InnerUserNO").clear();
		du.what("InnerUserNO").sendKeys(value);
	}
	public String getInnerUserNO() {
		return du.what("InnerUserNO").getAttribute("value");
	}
	//账户种类
	public void selectAccountType(String value) {
		du.whatSelect("AccountType").selectByValue(value);
	}
	//账户号
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
	//查看
	public void clickCheck() {
		du.what("Check").click();
	}
	//账户冻结
	public void clickAccountFrozen() {
		du.what("AccountFrozen").click();
	}
	//账户解冻
	public void clickAccountUnfrozen() {
		du.what("AccountUnfrozen").click();
	}
    //账户列表的单选框
	public void clickAccountRadio(String radio) {
		du.what("AccountRadio",radio).click();
	}
	public boolean isAccountRadioDisplayed(String radio) {
		du.waitFor(500);
		return du.what("AccountRadio",radio).isDisplayed();
	}
	//查看_关闭
	public void clickCheck_Close() {
		du.what("Check_Close").click();
	}
	//账户冻结_冻结类型
	public void selectAccountFrozen_FrozenType(String value) {
		du.whatSelect("AccountFrozen_FrozenType").selectByValue(value);
	}
	//账户冻结_冻结金额
	public void setAccountFrozen_FrozenMoney(String value) {
		du.what("AccountFrozen_FrozenMoney").clear();
		du.what("AccountFrozen_FrozenMoney").sendKeys(value);
	}
	public String getAccountFrozen_FrozenMoney() {
		return du.what("AccountFrozen_FrozenMoney").getAttribute("value");
	}
	//账户冻结_备注
	public void setAccountFrozen_Tips(String value) {
		du.what("AccountFrozen_Tips").clear();
		du.what("AccountFrozen_Tips").sendKeys(value);
	}
	public String getAccountFrozen_Tips() {
		return du.what("AccountFrozen_Tips").getAttribute("value");
	}
	//账户冻结_确认
	public void clickAccountFrozen_Confirm() {
		du.what("AccountFrozen_Confirm").click();
	}
	//账户冻结_关闭
	public void clickAccountFrozen_Close() {
		du.what("AccountFrozen_Close").click();
	}
	//账户解冻_解冻
	public void clickAccountUnfrozen_Unfrozen() {
		du.what("AccountUnfrozen_Unfrozen").click();
	}
	//账户解冻_账户列表单选框
	public void clickAccountUnfrozen_AccountRadio(String radio) {
		du.what("AccountUnfrozen_AccountRadio",radio).click();
	}
	public boolean isAccountUnfrozen_AccountRadioDisplayed(String radio) {
		du.waitFor(500);
		return du.what("AccountUnfrozen_AccountRadio",radio).isDisplayed();
	}
	//账户解冻_关闭
	public void clickAccountUnfrozen_Close() {
		du.what("AccountUnfrozen_Close").click();
	}
	//账户解冻_解冻_确认
	public void clickAccountUnfrozen_Unfrozen_Confirm() {
		du.what("AccountUnfrozen_Unfrozen_Confirm").click();
	}
	//账户解冻_解冻_关闭
	public void clickAccountUnfrozen_Unfrozen_Close() {
		du.what("AccountUnfrozen_Unfrozen_Close").click();
	}

}