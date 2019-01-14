package com.dy.AutoTest.OperationPlatform.PageObject.accountmanage;

import org.openqa.selenium.WebDriver;

import com.dy.AutoTest.web.api.SuperPage;
import com.dy.AutoTest.web.actions.DoPlus;

public class AccountManageAccountingEntryCheckPage extends SuperPage {
	public AccountManageAccountingEntryCheckPage(WebDriver driver) {
		super(driver);
		du.loadLocator("POP_Loc_AccountManageAccountingEntryCheck");
	}
	public void setWaitTime(long waitTime) {
		du=new DoPlus(driver);
		du.waitTime=waitTime;
		du.loadLocator("POP_Loc_AccountManageAccountingEntryCheck");
	}

/***************************Manual Coding**********************************/


/****************************Auto Generate******************************/

	//产品码
	public void selectProductCode(String value) {
		du.whatSelect("ProductCode").selectByValue(value);
	}
	//交易类型
	public void selectTradeType(String value) {
		du.whatSelect("TradeType").selectByValue(value);
	}
	//状态
	public void selectStatus(String value) {
		du.whatSelect("Status").selectByValue(value);
	}
	//业务子类型
	public void selectBusinessSubtype(String value) {
		du.whatSelect("BusinessSubtype").selectByValue(value);
	}
	//查询
	public void clickQuery() {
		du.what("Query").click();
	}
	//重置
	public void clickReset() {
		du.what("Reset").click();
	}
	//审核
	public void clickAudit() {
		du.what("Audit").click();
	}
	//查看
	public void clickCheck() {
		du.what("Check").click();
	}
	//分录列表单选框
	public void clickEntryRadio(String radio) {
		du.what("EntryRadio",radio).click();
	}
	public boolean isEntryRadioDisplayed(String radio) {
		du.waitFor(500);
		return du.what("EntryRadio",radio).isDisplayed();
	}
	//审核_审核意见
	public void setAudit_Advice(String value) {
		du.what("Audit_Advice").clear();
		du.what("Audit_Advice").sendKeys(value);
	}
	public String getAudit_Advice() {
		return du.what("Audit_Advice").getAttribute("value");
	}
	//审核_提交
	public void clickAudit_Submit() {
		du.what("Audit_Submit").click();
	}
	//审核_关闭
	public void clickAudit_Close() {
		du.what("Audit_Close").click();
	}
	//查看_关闭
	public void clickCheck_Close() {
		du.what("Check_Close").click();
	}

}