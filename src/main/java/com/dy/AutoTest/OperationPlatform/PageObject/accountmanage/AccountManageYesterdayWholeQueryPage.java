package com.dy.AutoTest.OperationPlatform.PageObject.accountmanage;

import org.openqa.selenium.WebDriver;

import com.dy.AutoTest.web.api.SuperPage;
import com.dy.AutoTest.web.actions.DoPlus;

public class AccountManageYesterdayWholeQueryPage extends SuperPage {
	public AccountManageYesterdayWholeQueryPage(WebDriver driver) {
		super(driver);
		du.loadLocator("POP_Loc_AccountManageYesterdayWholeQuery");
	}
	public void setWaitTime(long waitTime) {
		du=new DoPlus(driver);
		du.waitTime=waitTime;
		du.loadLocator("POP_Loc_AccountManageYesterdayWholeQuery");
	}

/***************************Manual Coding**********************************/


/****************************Auto Generate******************************/

	//打印
	public void clickPrint() {
		du.what("Print").click();
	}

}