package com.dy.AutoTest.OperationPlatform.PageObject.OnlineRiskControl.RefusedTradeQuery;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.dy.AutoTest.web.api.IQuery;
import com.dy.AutoTest.web.api.SuperPage;
import com.dy.AutoTest.web.actions.DoPlus;

public class BeforehandBlackListRefusedQueryPage extends SuperPage implements IQuery{
	public BeforehandBlackListRefusedQueryPage(WebDriver driver) {
		super(driver);
		du.loadLocator("POP_Loc_RefusedTradeQuery_BeforehandBlackListRefusedQuery");
	}
	public void setWaitTime(long waitTime) {
		du=new DoPlus(driver);
		du.waitTime=waitTime;
		du.loadLocator("POP_Loc_RefusedTradeQuery_BeforehandBlackListRefusedQuery");
	}

/***************************Manual Coding**********************************/


/****************************Auto Generate******************************/

	//查询日期开始
	public void setQueryDateBegin(String value) {
		du.what("QueryDateBegin").sendKeys(Keys.CONTROL + "a");
		du.waitFor(500);
		du.what("QueryDateBegin").sendKeys(value);
	}
	public String getQueryDateBegin() {
		return du.what("QueryDateBegin").getAttribute("value");
	}
	//查询日期结束
	public void setQueryDateEnd(String value) {
		du.what("QueryDateEnd").sendKeys(Keys.CONTROL + "a");
		du.waitFor(500);
		du.what("QueryDateEnd").sendKeys(value);
	}
	public String getQueryDateEnd() {
		return du.what("QueryDateEnd").getAttribute("value");
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