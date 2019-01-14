package com.dy.AutoTest.MerchantPortal.PageObject.trademanage;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.dy.AutoTest.web.api.SuperPage;
import com.dy.AutoTest.web.actions.DoPlus;

public class TMB2BTradeSummaryQueryPage extends SuperPage {
	public TMB2BTradeSummaryQueryPage(WebDriver driver) {
		super(driver);
		du.loadLocator("MP_Loc_TMB2BTradeSummaryQuery");
	}
	public void setWaitTime(long waitTime) {
		du=new DoPlus(driver);
		du.waitTime=waitTime;
		du.loadLocator("MP_Loc_TMB2BTradeSummaryQuery");
	}

/***************************Manual Coding**********************************/


/****************************Auto Generate******************************/

	//顶部_B2B交易汇总查询
	public void clickTop_B2BTradeSummaryQuery() {
		du.what("Top_B2BTradeSummaryQuery").click();
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
	//商户订单号
	public void setMerchantOrderNO(String value) {
		du.what("MerchantOrderNO").click();
		du.what("MerchantOrderNO").clear();
		du.what("MerchantOrderNO").sendKeys(value);
	}
	public String getMerchantOrderNO() {
		return du.what("MerchantOrderNO").getAttribute("value");
	}
	//支付方式
	public void selectPaymentWay(String value) {
		du.whatSelect("PaymentWay").selectByValue(value);
	}
	//支付渠道
	public void selectPaymentChannel(String value) {
		du.whatSelect("PaymentChannel").selectByValue(value);
	}
	//订单状态
	public void selectOrderStatus(String value) {
		du.whatSelect("OrderStatus").selectByValue(value);
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
	//退款
	public void clickRefund() {
		du.what("Refund").click();
	}
	//详情
	public void clickDetail() {
		du.what("Detail").click();
	}
	//退款_退款金额
	public void setRefund_RefundMoney(String value) {
		du.what("Refund_RefundMoney").clear();
		du.what("Refund_RefundMoney").sendKeys(value);
	}
	public String getRefund_RefundMoney() {
		return du.what("Refund_RefundMoney").getAttribute("value");
	}
	//退款_支付密码
	public void setRefund_PaymentPassword(String value) {
		du.what("Refund_PaymentPassword").clear();
		du.what("Refund_PaymentPassword").sendKeys(value);
	}
	public String getRefund_PaymentPassword() {
		return du.what("Refund_PaymentPassword").getAttribute("value");
	}
	//退款_退款
	public void clickRefund_Refund() {
		du.what("Refund_Refund").click();
	}
	//退款_关闭
	public void clickRefund_Close() {
		du.what("Refund_Close").click();
	}
	//详情_关闭
	public void clickDetail_Close() {
		du.what("Detail_Close").click();
	}

}