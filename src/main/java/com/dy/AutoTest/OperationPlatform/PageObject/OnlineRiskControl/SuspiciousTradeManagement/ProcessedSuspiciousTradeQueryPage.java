package com.dy.AutoTest.OperationPlatform.PageObject.OnlineRiskControl.SuspiciousTradeManagement;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.dy.AutoTest.web.api.IQuery;
import com.dy.AutoTest.web.api.SuperPage;
import com.dy.AutoTest.web.actions.DoPlus;

public class ProcessedSuspiciousTradeQueryPage extends SuperPage implements IQuery{
	public ProcessedSuspiciousTradeQueryPage(WebDriver driver) {
		super(driver);
		du.loadLocator("POP_Loc_SuspiciousTradeManagement_ProcessedSuspiciousTradeQuery");
	}
	public void setWaitTime(long waitTime) {
		du=new DoPlus(driver);
		du.waitTime=waitTime;
		du.loadLocator("POP_Loc_SuspiciousTradeManagement_ProcessedSuspiciousTradeQuery");
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
	//查看
	public void clickCheck() {
		du.what("Check").click();
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
	//查看_关闭
	public void clickCheck_Close() {
		du.what("Check_Close").click();
	}

}