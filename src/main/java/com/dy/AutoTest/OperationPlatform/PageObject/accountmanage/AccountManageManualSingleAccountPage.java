package com.dy.AutoTest.OperationPlatform.PageObject.accountmanage;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.dy.AutoTest.web.api.SuperPage;
import com.dy.AutoTest.web.actions.DoPlus;

public class AccountManageManualSingleAccountPage extends SuperPage {
	public AccountManageManualSingleAccountPage(WebDriver driver) {
		super(driver);
		du.loadLocator("POP_Loc_AccountManageManualSingleAccount");
	}

	public void setWaitTime(long waitTime) {
		du = new DoPlus(driver);
		du.waitTime = waitTime;
		du.loadLocator("POP_Loc_AccountManageManualSingleAccount");
	}

	/*************************** Manual Coding **********************************/

	/**************************** Auto Generate ******************************/

	// 1_套号
	public void setIN_AccountNum(String value) {
		du.what("IN_AccountNum").clear();
		du.what("IN_AccountNum").sendKeys(value);
	}

	public String getIN_AccountNum() {
		return du.what("IN_AccountNum").getAttribute("value");
	}

	// 1_内部
	public void clickIN_Inner() {
		du.what("IN_Inner").click();
	}

	// 1_外部
	public void clickIN_External() {
		du.what("IN_External").click();
	}

	// 1_币种
	public void selectIN_MoneyType(String value) {
		du.whatSelect("IN_MoneyType").selectByValue(value);
	}

	// 1_查余额
	public void clickIN_SearchBalance() {
		du.what("IN_SearchBalance").click();
	}

	// 1_金额
	public void setIN_Money(String value) {
		du.what("IN_Money").clear();
		du.what("IN_Money").sendKeys(value);
	}

	public String getIN_Money() {
		return du.what("IN_Money").getAttribute("value");
	}

	// 1_备注
	public void setIN_Tips(String value) {
		du.what("IN_Tips").clear();
		du.what("IN_Tips").sendKeys(value);
	}

	public String getIN_Tips() {
		return du.what("IN_Tips").getAttribute("value");
	}

	// 1_借或贷
	public void selectIN_BorrowOrLoan(String value) {
		du.whatSelect("IN_BorrowOrLoan").selectByValue(value);
	}

	// 1_交易日期
	public void setIN_TradeDate(String value) {
		du.what("IN_TradeDate").sendKeys(Keys.CONTROL + "a");
		du.waitFor(500);
		du.what("IN_TradeDate").sendKeys(value);
	}

	public String getIN_TradeDate() {
		return du.what("IN_TradeDate").getAttribute("value");
	}

	// 2_套号
	public void setEX_AccountNum(String value) {
		du.what("EX_AccountNum").clear();
		du.what("EX_AccountNum").sendKeys(value);
	}

	public String getEX_AccountNum() {
		return du.what("EX_AccountNum").getAttribute("value");
	}

	// 2_内部
	public void clickEX_Internal() {
		du.what("EX_Internal").click();
	}

	// 2_外部
	public void clickEX_External() {
		du.what("EX_External").click();
	}

	// 2_币种
	public void selectEX_MoneyType(String value) {
		du.whatSelect("EX_MoneyType").selectByValue(value);
	}

	// 2_查余额
	public void clickEX_SearchBalance() {
		du.what("EX_SearchBalance").click();
	}

	// 2_金额
	public void setEX_Money(String value) {
		du.what("EX_Money").clear();
		du.what("EX_Money").sendKeys(value);
	}

	public String getEX_Money() {
		return du.what("EX_Money").getAttribute("value");
	}

	// 2_备注
	public void setEX_Tips(String value) {
		du.what("EX_Tips").clear();
		du.what("EX_Tips").sendKeys(value);
	}

	public String getEX_Tips() {
		return du.what("EX_Tips").getAttribute("value");
	}

	// 2_借或贷
	public void selectEX_BorrowOrLoan(String value) {
		du.whatSelect("EX_BorrowOrLoan").selectByValue(value);
	}

	// 2_交易日期
	public void setEX_TradeDate(String value) {
		du.what("EX_TradeDate").sendKeys(Keys.CONTROL + "a");
		du.waitFor(500);
		du.what("EX_TradeDate").sendKeys(value);
	}

	public String getEX_TradeDate() {
		return du.what("EX_TradeDate").getAttribute("value");
	}

	// 检查借贷平衡
	public void clickCheckDebitCreditBalance() {
		du.what("CheckDebitCreditBalance").click();
	}

	// 加一项
	public void clickAdd() {
		du.what("Add").click();
	}

	// 减一项
	public void clickMinus() {
		du.what("Minus").click();
	}

	// 确定
	public void clickConfirm() {
		du.what("Confirm").click();
	}

	// 内部_内部账户号
	public void setInner_InnerAccountNO(String value) {
		du.what("Inner_InnerAccountNO").clear();
		du.what("Inner_InnerAccountNO").sendKeys(value);
	}

	public String getInner_InnerAccountNO() {
		return du.what("Inner_InnerAccountNO").getAttribute("value");
	}

	// 内部_账户名称
	public void setInner_AccountName(String value) {
		du.what("Inner_AccountName").clear();
		du.what("Inner_AccountName").sendKeys(value);
	}

	public String getInner_AccountName() {
		return du.what("Inner_AccountName").getAttribute("value");
	}

	// 内部_搜索
	public void clickInner_Search() {
		du.what("Inner_Search").click();
	}

	// 内部_账户列表单选框
	public void clickInner_AccountRadio(String radio) {
		du.what("Inner_AccountRadio", radio).click();
	}

	public boolean isInner_AccountRadioDisplayed(String radio) {
		du.waitFor(500);
		return du.what("Inner_AccountRadio", radio).isDisplayed();
	}

	// 内部_确定
	public void clickInner_Confirm() {
		du.what("Inner_Confirm").click();
	}

	// 内部_关闭
	public void clickInner_Close() {
		du.what("Inner_Close").click();
	}

	// 外部_外部用户号或内部用户号或商户编号
	public void setExternal_NO(String value) {
		du.what("External_NO").clear();
		du.what("External_NO").sendKeys(value);
	}

	public String getExternal_NO() {
		return du.what("External_NO").getAttribute("value");
	}

	// 外部_搜索
	public void clickExternal_Search() {
		du.what("External_Search").click();
	}

	// 外部_账户列表单选框
	public void clickExternal_AccountRadio(String radio) {
		du.what("External_AccountRadio", radio).click();
	}

	public boolean isExternal_AccountRadioDisplayed(String radio) {
		du.waitFor(500);
		return du.what("External_AccountRadio", radio).isDisplayed();
	}

	// 外部_确定
	public void clickExternal_Confirm() {
		du.what("External_Confirm").click();
	}

	// 外部_关闭
	public void clickExternal_Close() {
		du.what("External_Close").click();
	}

	// 1_资金种类
	public void selectIN_Cash(String value) {
		du.whatSelect("IN_Cash").selectByValue(value);
	}

	// 2_资金种类
	public void selectEX_Cash(String value) {
		du.whatSelect("EX_Cash").selectByValue(value);
	}

}