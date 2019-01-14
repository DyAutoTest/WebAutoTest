package com.dy.AutoTest.OnlineCashier.PageObject.accountmanage;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.dy.AutoTest.web.api.SuperPage;
import com.dy.AutoTest.web.actions.DoPlus;

public class AccountManageManualAccountCheckPage extends SuperPage {
	public AccountManageManualAccountCheckPage(WebDriver driver) {
		super(driver);
		du.loadLocator("POP_Loc_AccountManageManualAccountCheck");
	}
	public void setWaitTime(long waitTime) {
		du=new DoPlus(driver);
		du.waitTime=waitTime;
		du.loadLocator("POP_Loc_AccountManageManualAccountCheck");
	}

/***************************Manual Coding**********************************/


/****************************Auto Generate******************************/

	//流水号
	public void setSerialNum(String value) {
		du.what("SerialNum").clear();
		du.what("SerialNum").sendKeys(value);
	}
	public String getSerialNum() {
		return du.what("SerialNum").getAttribute("value");
	}
	//状态
	public void selectStatus(String value) {
		du.whatSelect("Status").selectByValue(value);
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
	//审核备注
	public void setCheck_CheckingTip(String value) {
		du.what("Check_CheckingTip").clear();
		du.what("Check_CheckingTip").sendKeys(value);
	}
	public String getCheck_CheckingTip() {
		return du.what("Check_CheckingTip").getAttribute("value");
	}
	//审核
	public void clickCheck_Check() {
		du.what("Check_Check").click();
	}
	//撤销
	public void clickCheck_Cancel() {
		du.what("Check_Cancel").click();
	}
	//关闭
	public void clickCheck_Close() {
		du.what("Check_Close").click();
	}

}