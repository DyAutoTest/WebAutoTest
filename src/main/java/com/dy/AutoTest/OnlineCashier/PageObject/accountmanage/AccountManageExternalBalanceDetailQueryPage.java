package com.dy.AutoTest.OnlineCashier.PageObject.accountmanage;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.dy.AutoTest.web.api.SuperPage;
import com.dy.AutoTest.web.actions.DoPlus;

public class AccountManageExternalBalanceDetailQueryPage extends SuperPage {
	public AccountManageExternalBalanceDetailQueryPage(WebDriver driver) {
		super(driver);
		du.loadLocator("POP_Loc_AccountManageExternalBalanceDetailQuery");
	}
	public void setWaitTime(long waitTime) {
		du=new DoPlus(driver);
		du.waitTime=waitTime;
		du.loadLocator("POP_Loc_AccountManageExternalBalanceDetailQuery");
	}

/***************************Manual Coding**********************************/


/****************************Auto Generate******************************/

	//高级
	public void clickAdvance() {
		du.what("Advance").click();
	}
	//账户账号
	public void setAccountNO(String value) {
		du.what("AccountNO").clear();
		du.what("AccountNO").sendKeys(value);
	}
	public String getAccountNO() {
		return du.what("AccountNO").getAttribute("value");
	}
	//账户种类
	public void selectAccountType(String value) {
		du.whatSelect("AccountType").selectByValue(value);
	}
	//内部用户号
	public void setInnerUserName(String value) {
		du.what("InnerUserName").clear();
		du.what("InnerUserName").sendKeys(value);
	}
	public String getInnerUserName() {
		return du.what("InnerUserName").getAttribute("value");
	}
	//记账起始日期
	public void setAccountingDateBegin(String value) {
		du.what("AccountingDateBegin").sendKeys(Keys.CONTROL + "a");
		du.waitFor(500);
		du.what("AccountingDateBegin").sendKeys(value);
	}
	public String getAccountingDateBegin() {
		return du.what("AccountingDateBegin").getAttribute("value");
	}
	//记账结束日期
	public void setAccountingDateEnd(String value) {
		du.what("AccountingDateEnd").sendKeys(Keys.CONTROL + "a");
		du.waitFor(500);
		du.what("AccountingDateEnd").sendKeys(value);
	}
	public String getAccountingDateEnd() {
		return du.what("AccountingDateEnd").getAttribute("value");
	}
	//记账流水号
	public void setAccountingSerialNO(String value) {
		du.what("AccountingSerialNO").clear();
		du.what("AccountingSerialNO").sendKeys(value);
	}
	public String getAccountingSerialNO() {
		return du.what("AccountingSerialNO").getAttribute("value");
	}
	//内部订单号
	public void setInnerOrderNO(String value) {
		du.what("InnerOrderNO").clear();
		du.what("InnerOrderNO").sendKeys(value);
	}
	public String getInnerOrderNO() {
		return du.what("InnerOrderNO").getAttribute("value");
	}
	//状态
	public void selectStatus(String value) {
		du.whatSelect("Status").selectByValue(value);
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
	//账户列表的单选框
	public void clickAccountRadio(String radio) {
		du.what("AccountRadio",radio).click();
	}
	public boolean isAccountRadioDisplayed(String radio) {
		du.waitFor(500);
		return du.what("AccountRadio",radio).isDisplayed();
	}
	//查看详情_关闭
	public void clickCheck_Close() {
		du.what("Check_Close").click();
	}

}