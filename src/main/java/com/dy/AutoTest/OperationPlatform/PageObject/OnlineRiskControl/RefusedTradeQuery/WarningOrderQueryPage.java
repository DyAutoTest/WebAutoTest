package com.dy.AutoTest.OperationPlatform.PageObject.OnlineRiskControl.RefusedTradeQuery;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.dy.AutoTest.web.api.IQuery;
import com.dy.AutoTest.web.api.SuperPage;
import com.dy.AutoTest.web.actions.DoPlus;

public class WarningOrderQueryPage extends SuperPage implements IQuery{
	public WarningOrderQueryPage(WebDriver driver) {
		super(driver);
		du.loadLocator("POP_Loc_RefusedTradeQuery_WarningOrderQuery");
	}
	public void setWaitTime(long waitTime) {
		du=new DoPlus(driver);
		du.waitTime=waitTime;
		du.loadLocator("POP_Loc_RefusedTradeQuery_WarningOrderQuery");
	}

/***************************Manual Coding**********************************/


/****************************Auto Generate******************************/

	//text
	public void setPayerInternalNO(String value) {
		du.what("PayerInternalNO").clear();
		du.what("PayerInternalNO").sendKeys(value);
	}
	public String getPayerInternalNO() {
		return du.what("PayerInternalNO").getAttribute("value");
	}
	//text
	public void setPayeeInternalNO(String value) {
		du.what("PayeeInternalNO").clear();
		du.what("PayeeInternalNO").sendKeys(value);
	}
	public String getPayeeInternalNO() {
		return du.what("PayeeInternalNO").getAttribute("value");
	}
	//select
	public void selectBusinessType(String value) {
		du.whatSelect("BusinessType").selectByValue(value);
	}
	//select
	public void selectTradeType(String value) {
		du.whatSelect("TradeType").selectByValue(value);
	}
	//text
	public void setTradeOrderNO(String value) {
		du.what("TradeOrderNO").clear();
		du.what("TradeOrderNO").sendKeys(value);
	}
	public String getTradeOrderNO() {
		return du.what("TradeOrderNO").getAttribute("value");
	}
	//text
	public void setDateBegin(String value) {
		du.what("DateBegin").sendKeys(Keys.CONTROL + "a");
		du.waitFor(500);
		du.what("DateBegin").sendKeys(value);
	}
	public String getDateBegin() {
		return du.what("DateBegin").getAttribute("value");
	}
	//text
	public void setDateEnd(String value) {
		du.what("DateEnd").sendKeys(Keys.CONTROL + "a");
		du.waitFor(500);
		du.what("DateEnd").sendKeys(value);
	}
	public String getDateEnd() {
		return du.what("DateEnd").getAttribute("value");
	}
	//button
	public void clickQuery() {
		du.what("Query").click();
	}
	//button
	public void clickReset() {
		du.what("Reset").click();
	}

}