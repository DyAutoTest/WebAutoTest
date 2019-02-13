package com.dy.AutoTest.MerchantPortal.PageObject.trademanage;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.dy.AutoTest.web.api.SuperPage;
import com.dy.AutoTest.web.actions.DoPlus;

public class TMSettleAccountsQueryPage extends SuperPage {
	public TMSettleAccountsQueryPage(WebDriver driver) {
		super(driver);
		du.loadLocator("MP_Loc_TMSettleAccountsQuery");
	}
	public void setWaitTime(long waitTime) {
		du=new DoPlus(driver);
		du.waitTime=waitTime;
		du.loadLocator("MP_Loc_TMSettleAccountsQuery");
	}

/***************************Manual Coding**********************************/


/****************************Auto Generate******************************/

	//顶部_结算查询
	public void clickTop_SettleAccountQuery() {
		du.what("Top_SettleAccountQuery").click();
	}
	//起止日期起始日期
	public void setDateBegin(String value) {
		du.what("DateBegin").sendKeys(Keys.CONTROL + "a");
		du.waitFor(500);
		du.what("DateBegin").sendKeys(value);
	}
	public String getDateBegin() {
		return du.what("DateBegin").getAttribute("value");
	}
	//起止日期结束日期
	public void setDateEnd(String value) {
		du.what("DateEnd").sendKeys(Keys.CONTROL + "a");
		du.waitFor(500);
		du.what("DateEnd").sendKeys(value);
	}
	public String getDateEnd() {
		return du.what("DateEnd").getAttribute("value");
	}
	//结算类型
	public void selectSettleAccountType(String value) {
		du.what("SettleAccountType").click();
		du.whatSelect("SettleAccountType").selectByValue(value);
	}
	//结算状态
	public void selectSettleAccountStatus(String value) {
		du.whatSelect("SettleAccountStatus").selectByValue(value);
	}
	//提现金额
	public void setWithdrawDepositMoney(String value) {
		du.what("WithdrawDepositMoney").clear();
		du.what("WithdrawDepositMoney").sendKeys(value);
	}
	public String getWithdrawDepositMoney() {
		return du.what("WithdrawDepositMoney").getAttribute("value");
	}
	//今天
	public void clickToday() {
		du.what("Today").click();
	}
	//最近一周
	public void clickLastWeek() {
		du.what("LastWeek").click();
	}
	//最近一个月
	public void clickLastMonth() {
		du.what("LastMonth").click();
	}
	//最近三个月
	public void clickLastThreeMonths() {
		du.what("LastThreeMonths").click();
	}
	//查询
	public void clickQuery() {
		du.what("Query").click();
	}
	//重置
	public void clickReset() {
		du.what("Reset").click();
	}
	//下载
	public void clickDownload() {
		du.what("Download").click();
	}

}