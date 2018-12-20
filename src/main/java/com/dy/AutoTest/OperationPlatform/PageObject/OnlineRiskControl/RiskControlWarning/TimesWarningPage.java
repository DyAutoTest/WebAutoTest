package com.dy.AutoTest.OperationPlatform.PageObject.OnlineRiskControl.RiskControlWarning;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.dy.AutoTest.web.api.IQuery;
import com.dy.AutoTest.web.api.SuperPage;
import com.dy.AutoTest.web.actions.DoPlus;

public class TimesWarningPage extends SuperPage implements IQuery{
	public TimesWarningPage(WebDriver driver) {
		super(driver);
		du.loadLocator("POP_Loc_RiskControlWarning_TimesWarning");
	}
	public void setWaitTime(long waitTime) {
		du=new DoPlus(driver);
		du.waitTime=waitTime;
		du.loadLocator("POP_Loc_RiskControlWarning_TimesWarning");
	}

/***************************Manual Coding**********************************/


/****************************Auto Generate******************************/

	//查询日期
	public void setQueryDate(String value) {
		du.what("QueryDate").sendKeys(Keys.CONTROL + "a");
		du.waitFor(500);
		du.what("QueryDate").sendKeys(value);
	}
	public String getQueryDate() {
		return du.what("QueryDate").getAttribute("value");
	}
	//所属模块
	/**
	 * @param value
	 * 
	 * 	value="WDC" : 提现交易
		value="PWM" : 充值交易
		value="RPM" : 远程消费
	 * 
	 */
	public void selectModule(String value) {
		du.whatSelect("Module").selectByValue(value);
	}
	//查询
	public void clickQuery() {
		du.what("Query").click();
	}
	//重置
	public void clickReset() {
		du.what("Reset").click();
	}

}