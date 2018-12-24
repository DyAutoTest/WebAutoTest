package com.dy.AutoTest.OperationPlatform.PageObject.OnlineRiskControl.SuspiciousTradeManagement;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.dy.AutoTest.web.api.IQuery;
import com.dy.AutoTest.web.api.SuperPage;
import com.dy.AutoTest.web.actions.DoPlus;

public class BeingProcessedSuspiciousTradeMaintainPage extends SuperPage implements IQuery{
	public BeingProcessedSuspiciousTradeMaintainPage(WebDriver driver) {
		super(driver);
		du.loadLocator("POP_Loc_SuspiciousTradeManagement_BeingProcessedSuspiciousTradeMaintain");
	}
	public void setWaitTime(long waitTime) {
		du=new DoPlus(driver);
		du.waitTime=waitTime;
		du.loadLocator("POP_Loc_SuspiciousTradeManagement_BeingProcessedSuspiciousTradeMaintain");
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
	//填写处理结果
	public void clickWriteProcessResult() {
		du.what("WriteProcessResult").click();
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
	//填写处理结果_处理意见
	public void selectWriteProcessResult_HandleSuggestion(String value) {
		du.whatSelect("WriteProcessResult_HandleSuggestion").selectByValue(value);
	}
	//填写处理结果_处理备注
	public void setWriteProcessResult_HandleTips(String value) {
		du.what("WriteProcessResult_HandleTips").clear();
		du.what("WriteProcessResult_HandleTips").sendKeys(value);
	}
	public String getWriteProcessResult_HandleTips() {
		return du.what("WriteProcessResult_HandleTips").getAttribute("value");
	}
	//填写处理结果_提交
	public void clickWriteProcessResult_Submit() {
		du.what("WriteProcessResult_Submit").click();
	}
	//填写处理结果_关闭
	public void clickWriteProcessResult_Close() {
		du.what("WriteProcessResult_Close").click();
	}

}