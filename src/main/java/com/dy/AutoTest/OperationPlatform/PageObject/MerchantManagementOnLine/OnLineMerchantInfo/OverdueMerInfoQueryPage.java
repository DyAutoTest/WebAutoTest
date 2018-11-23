package com.dy.AutoTest.OperationPlatform.PageObject.MerchantManagementOnLine.OnLineMerchantInfo;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.dy.AutoTest.web.api.SuperPage;
import com.dy.AutoTest.web.actions.DoPlus;

public class OverdueMerInfoQueryPage extends SuperPage{
	public OverdueMerInfoQueryPage(WebDriver driver) {
		super(driver);
		du.loadLocator("POP_Loc_OverdueMerInfoQuery");
	}
	public void setWaitTime(long waitTime) {
		du=new DoPlus(driver);
		du.waitTime=waitTime;
		du.loadLocator("POP_Loc_OverdueMerInfoQuery");
	}

/***************************Manual Coding**********************************/


/****************************Auto Generate******************************/

	//提醒开始时间
	public void setRemindDateBegin(String value) {
		du.what("RemindDateBegin").sendKeys(Keys.CONTROL + "a");
		du.waitFor(500);
		du.what("RemindDateBegin").sendKeys(value);
	}
	public String getRemindDateBegin() {
		return du.what("RemindDateBegin").getAttribute("value");
	}
	//提醒结束时间
	public void setRemindDateEnd(String value) {
		du.what("RemindDateEnd").sendKeys(Keys.CONTROL + "a");
		du.waitFor(500);
		du.what("RemindDateEnd").sendKeys(value);
	}
	public String getRemindDateEnd() {
		return du.what("RemindDateEnd").getAttribute("value");
	}
	//按钮_查询
	public void clickQuery() {
		du.what("Query").click();
	}
	//按钮_重置
	public void clickReset() {
		du.what("Reset").click();
	}

}