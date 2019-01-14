package com.dy.AutoTest.MerchantPortal.PageObject.securitycenter;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.dy.AutoTest.web.api.SuperPage;
import com.dy.AutoTest.web.actions.DoPlus;

public class SCLogManagementPage extends SuperPage {
	public SCLogManagementPage(WebDriver driver) {
		super(driver);
		du.loadLocator("MP_Loc_SCLogManagement");
	}
	public void setWaitTime(long waitTime) {
		du=new DoPlus(driver);
		du.waitTime=waitTime;
		du.loadLocator("MP_Loc_SCLogManagement");
	}

/***************************Manual Coding**********************************/


/****************************Auto Generate******************************/

	//顶部_日志管理
	public void clickTop_LogManagement() {
		du.what("Top_LogManagement").click();
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
		doLoseFocus("DateEnd", -20, 0);
	}
	public String getDateEnd() {
		return du.what("DateEnd").getAttribute("value");
	}
	//查询
	public void clickQuery() {
		du.what("Query").click();
	}

}