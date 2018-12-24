package com.dy.AutoTest.OperationPlatform.PageObject.OnlineRiskControl.MonitorRulesManagement;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.dy.AutoTest.web.api.IQuery;
import com.dy.AutoTest.web.api.SuperPage;
import com.dy.AutoTest.web.actions.DoPlus;

public class MonitorRulesMaintainPage extends SuperPage implements IQuery{
	public MonitorRulesMaintainPage(WebDriver driver) {
		super(driver);
		du.loadLocator("POP_Loc_MonitorRulesManagement_MonitorRulesMaintain");
	}
	public void setWaitTime(long waitTime) {
		du=new DoPlus(driver);
		du.waitTime=waitTime;
		du.loadLocator("POP_Loc_MonitorRulesManagement_MonitorRulesMaintain");
	}

/***************************Manual Coding**********************************/


/****************************Auto Generate******************************/

	//规则编号
	public void setRuleNO(String value) {
		du.what("RuleNO").clear();
		du.what("RuleNO").sendKeys(value);
	}
	public String getRuleNO() {
		return du.what("RuleNO").getAttribute("value");
	}
	//日终检查
	public void selectDailyCheck(String value) {
		du.whatSelect("DailyCheck").selectByValue(value);
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
	//规则列表单选按钮
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