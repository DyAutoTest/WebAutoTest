package com.dy.AutoTest.MerchantPortal.PageObject.trademanage;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.dy.AutoTest.web.api.SuperPage;
import com.dy.AutoTest.web.actions.DoPlus;

public class TMServiceChargeQueryPage extends SuperPage {
	public TMServiceChargeQueryPage(WebDriver driver) {
		super(driver);
		du.loadLocator("MP_Loc_TMServiceChargeQuery");
	}
	public void setWaitTime(long waitTime) {
		du=new DoPlus(driver);
		du.waitTime=waitTime;
		du.loadLocator("MP_Loc_TMServiceChargeQuery");
	}

/***************************Manual Coding**********************************/


/****************************Auto Generate******************************/

	//顶部
	public void clickTop_ServiceChargeQuery() {
		du.what("Top_ServiceChargeQuery").click();
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
	//商户订单号
	public void setMerchantOrderNO(String value) {
		du.what("MerchantOrderNO").clear();
		du.what("MerchantOrderNO").sendKeys(value);
	}
	public String getMerchantOrderNO() {
		return du.what("MerchantOrderNO").getAttribute("value");
	}
	//交易金额
	public void setTradeMoney(String value) {
		du.what("TradeMoney").clear();
		du.what("TradeMoney").sendKeys(value);
	}
	public String getTradeMoney() {
		return du.what("TradeMoney").getAttribute("value");
	}
	//支付渠道
	public void selectPaymentChannel(String value) {
		du.whatSelect("PaymentChannel").selectByValue(value);
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
	//多选按钮
	public void clickCheckbox() {
		du.what("Checkbox").click();
	}
	//全选按钮
	public void clickCheckboxAll() {
		du.what("CheckboxAll").click();
	}

}