package com.dy.AutoTest.OnlineCashier.PageObject.accountmanage;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.dy.AutoTest.web.api.SuperPage;
import com.dy.AutoTest.web.actions.DoPlus;

public class AccountManageWholeHistoryQueryPage extends SuperPage {
	public AccountManageWholeHistoryQueryPage(WebDriver driver) {
		super(driver);
		du.loadLocator("POP_Loc_AccountManageWholeHistoryQuery");
	}
	public void setWaitTime(long waitTime) {
		du=new DoPlus(driver);
		du.waitTime=waitTime;
		du.loadLocator("POP_Loc_AccountManageWholeHistoryQuery");
	}

/***************************Manual Coding**********************************/


/****************************Auto Generate******************************/

	//科目号
	public void setFocusOnItemNO() {
		du.what("ItemNO").click();
	}
	
	public void setItemNO(String value) {
		du.what("ItemNO").clear();
		du.what("ItemNO").sendKeys(value);
	}
	public String getItemNO() {
		return du.what("ItemNO").getAttribute("value");
	}
	//科目名称
	public void setItemName(String value) {
		du.what("ItemName").clear();
		du.what("ItemName").sendKeys(value);
	}
	public String getItemName() {
		return du.what("ItemName").getAttribute("value");
	}
	//科目级别
	public void selectItemLv(String value) {
		du.whatSelect("ItemLv").selectByValue(value);
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
	//查询
	public void clickQuery() {
		du.what("Query").click();
	}
	//重置
	public void clickReset() {
		du.what("Reset").click();
	}
	//单选按钮
	public void clickRadio(String radio) {
		du.what("Radio",radio).click();
	}
	public boolean isRadioDisplayed(String radio) {
		du.waitFor(500);
		return du.what("Radio",radio).isDisplayed();
	}
	//切换按钮
	public void clickSwitch() {
		du.what("Switch").click();
	}

}