package com.dy.AutoTest.OnlineCashier.PageObject.accountmanage;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.dy.AutoTest.web.api.SuperPage;
import com.dy.AutoTest.web.actions.DoPlus;

public class AccountManageSceneComprehensivePage extends SuperPage {
	public AccountManageSceneComprehensivePage(WebDriver driver) {
		super(driver);
		du.loadLocator("POP_Loc_AccountManageSceneComprehensive");
	}
	public void setWaitTime(long waitTime) {
		du=new DoPlus(driver);
		du.waitTime=waitTime;
		du.loadLocator("POP_Loc_AccountManageSceneComprehensive");
	}

/***************************Manual Coding**********************************/


/****************************Auto Generate******************************/

	//归属机构
	public void selectAffiliationOrgnization(String value) {
		du.whatSelect("AffiliationOrgnization").selectByValue(value);
	}
	//备付金行
	public void selectExcessReserveBank(String value) {
		du.whatSelect("ExcessReserveBank").selectByValue(value);
	}
	//场景类型
	public void selectSceneType(String value) {
		du.whatSelect("SceneType").selectByValue(value);
	}
	//交易日期
	public void setTradeDate(String value) {
		du.what("TradeDate").sendKeys(Keys.CONTROL + "a");
		du.waitFor(500);
		du.what("TradeDate").sendKeys(value);
	}
	public String getTradeDate() {
		return du.what("TradeDate").getAttribute("value");
	}
	//借贷方向
	public void selectIN_BorrowingDirection(String value) {
		du.whatSelect("IN_BorrowingDirection").selectByValue(value);
	}
	//金额
	public void setIN_Money(String value) {
		du.what("IN_Money").clear();
		du.what("IN_Money").sendKeys(value);
	}
	public String getIN_Money() {
		return du.what("IN_Money").getAttribute("value");
	}
	//备注
	public void setIN_Tips(String value) {
		du.what("IN_Tips").clear();
		du.what("IN_Tips").sendKeys(value);
	}
	public String getIN_Tips() {
		return du.what("IN_Tips").getAttribute("value");
	}
	//查账号
	public void clickIN_InquireAccountNum() {
		du.what("IN_InquireAccountNum").click();
	}
	//借贷方向
	public void selectEX_BorrowingDirection(String value) {
		du.whatSelect("EX_BorrowingDirection").selectByValue(value);
	}
	//金额
	public void setEX_Money(String value) {
		du.what("EX_Money").clear();
		du.what("EX_Money").sendKeys(value);
	}
	public String getEX_Money() {
		return du.what("EX_Money").getAttribute("value");
	}
	//备注
	public void setEX_Tips(String value) {
		du.what("EX_Tips").clear();
		du.what("EX_Tips").sendKeys(value);
	}
	public String getEX_Tips() {
		return du.what("EX_Tips").getAttribute("value");
	}
	//查账号
	public void clickEX_InquireAccountNum() {
		du.what("EX_InquireAccountNum").click();
	}
	//检查借贷平衡
	public void clickCheckDebitCreditBalance() {
		du.what("CheckDebitCreditBalance").click();
	}
	//确定
	public void clickConfirm() {
		du.what("Confirm").click();
	}
	//重置
	public void clickReset() {
		du.what("Reset").click();
	}
	//查账号单选
	public void clickIN_AccountSelectionButton(String radio) {
		du.what("IN_AccountSelectionButton",radio).click();
	}
	public boolean isIN_AccountSelectionButtonDisplayed(String radio) {
		du.waitFor(500);
		return du.what("IN_AccountSelectionButton",radio).isDisplayed();
	}
	//查账号提交
	public void clickIN_AccountConfirm() {
		du.what("IN_AccountConfirm").click();
	}
	//查账号关闭
	public void clickIN_AccountClose() {
		du.what("IN_AccountClose").click();
	}
	//查账号单选
	public void clickEX_AccountSelectionButton(String radio) {
		du.what("EX_AccountSelectionButton",radio).click();
	}
	public boolean isEX_AccountSelectionButtonDisplayed(String radio) {
		du.waitFor(500);
		return du.what("EX_AccountSelectionButton",radio).isDisplayed();
	}
	//查账号提交
	public void clickEX_AccountConfirm() {
		du.what("EX_AccountConfirm").click();
	}
	//查账号关闭
	public void clickEX_AccountClose() {
		du.what("EX_AccountClose").click();
	}

}