package com.dy.AutoTest.OperationPlatform.PageObject.OnlineRiskControl.SuspiciousTradeManagement;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.dy.AutoTest.web.api.IQuery;
import com.dy.AutoTest.web.api.SuperPage;
import com.dy.AutoTest.web.actions.DoPlus;

public class SuspiciousTradeAnalyzePage extends SuperPage implements IQuery{
	public SuspiciousTradeAnalyzePage(WebDriver driver) {
		super(driver);
		du.loadLocator("POP_Loc_SuspiciousTradeManagement_SuspiciousTradeAnalyze");
	}
	public void setWaitTime(long waitTime) {
		du=new DoPlus(driver);
		du.waitTime=waitTime;
		du.loadLocator("POP_Loc_SuspiciousTradeManagement_SuspiciousTradeAnalyze");
	}

/***************************Manual Coding**********************************/


/****************************Auto Generate******************************/

	//监控规则
	public void selectMonitorRule(String value) {
		du.whatSelect("MonitorRule").selectByValue(value);
	}
	//商户编号/手机号
	public void setMerchantNOPhoneNO(String value) {
		du.what("MerchantNOPhoneNO").clear();
		du.what("MerchantNOPhoneNO").sendKeys(value);
	}
	public String getMerchantNOPhoneNO() {
		return du.what("MerchantNOPhoneNO").getAttribute("value");
	}
	//查询
	public void clickQuery() {
		du.what("Query").click();
	}
	//重置
	public void clickReset() {
		du.what("Reset").click();
	}
	//添加
	public void clickAdd() {
		du.what("Add").click();
	}
	//可疑交易分析
	public void clickSuspiciousTradeAnalyze() {
		du.what("SuspiciousTradeAnalyze").click();
	}
	//监控列表单选按钮
	public void clickRadio(String radio) {
		du.what("Radio",radio).click();
	}
	public boolean isRadioExist(String radio) {
		du.waitFor(500);
		return du.isElementExist("Radio",radio);
	}
	public boolean isRadioDisplayed(String radio) {
		du.waitFor(500);
		return du.what("Radio",radio).isDisplayed();
	}
	//添加_商户号/手机号
	public void setAdd_MerchantNOPhoneNO(String value) {
		du.what("Add_MerchantNOPhoneNO").clear();
		du.what("Add_MerchantNOPhoneNO").sendKeys(value);
	}
	public String getAdd_MerchantNOPhoneNO() {
		return du.what("Add_MerchantNOPhoneNO").getAttribute("value");
	}
	//添加_内部订单号
	public void setAdd_InnerOrderNO(String value) {
		du.what("Add_InnerOrderNO").clear();
		du.what("Add_InnerOrderNO").sendKeys(value);
	}
	public String getAdd_InnerOrderNO() {
		return du.what("Add_InnerOrderNO").getAttribute("value");
	}
	//添加_监控规则
	public void selectAdd_MonitorRules(String value) {
		du.whatSelect("Add_MonitorRules").selectByValue(value);
	}
	//添加_监控来源
	public void selectAdd_MonitorSource(String value) {
		du.whatSelect("Add_MonitorSource").selectByValue(value);
	}
	//添加_监控操作结果
	public void selectAdd_MonitorOperationResult(String value) {
		du.whatSelect("Add_MonitorOperationResult").selectByValue(value);
	}
	//添加_提交
	public void clickAdd_Submit() {
		du.what("Add_Submit").click();
	}
	//添加_关闭
	public void clickAdd_Close() {
		du.what("Add_Close").click();
	}
	//可疑交易分析_排查分析
	public void selectSuspiciousTradeAnalyze_CheckAnalyze(String value) {
		du.whatSelect("SuspiciousTradeAnalyze_CheckAnalyze").selectByValue(value);
	}
	//可疑交易分析_备注
	public void setSuspiciousTradeAnalyze_Tips(String value) {
		du.what("SuspiciousTradeAnalyze_Tips").clear();
		du.what("SuspiciousTradeAnalyze_Tips").sendKeys(value);
	}
	public String getSuspiciousTradeAnalyze_Tips() {
		return du.what("SuspiciousTradeAnalyze_Tips").getAttribute("value");
	}
	//可疑交易分析_提交
	public void clickSuspiciousTradeAnalyze_Submit() {
		du.what("SuspiciousTradeAnalyze_Submit").click();
	}
	//可疑交易分析_关闭
	public void clickSuspiciousTradeAnalyze_Close() {
		du.what("SuspiciousTradeAnalyze_Close").click();
	}

}