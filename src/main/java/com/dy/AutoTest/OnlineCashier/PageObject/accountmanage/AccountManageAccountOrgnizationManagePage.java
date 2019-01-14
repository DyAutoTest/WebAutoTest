package com.dy.AutoTest.OnlineCashier.PageObject.accountmanage;

import org.openqa.selenium.WebDriver;

import com.dy.AutoTest.web.api.SuperPage;
import com.dy.AutoTest.web.actions.DoPlus;

public class AccountManageAccountOrgnizationManagePage extends SuperPage {
	public AccountManageAccountOrgnizationManagePage(WebDriver driver) {
		super(driver);
		du.loadLocator("POP_Loc_AccountManageAccountOrgnizationManage");
	}
	public void setWaitTime(long waitTime) {
		du=new DoPlus(driver);
		du.waitTime=waitTime;
		du.loadLocator("POP_Loc_AccountManageAccountOrgnizationManage");
	}

/***************************Manual Coding**********************************/


/****************************Auto Generate******************************/

	//查看
	public void clickCheck() {
		du.what("Check").click();
	}
	//机构列表单选框
	public void clickOrgnizationRadio(String radio) {
		du.what("OrgnizationRadio",radio).click();
	}
	public boolean isOrgnizationRadioDisplayed(String radio) {
		du.waitFor(500);
		return du.what("OrgnizationRadio",radio).isDisplayed();
	}
	//查看_关闭
	public void clickCheck_Close() {
		du.what("Check_Close").click();
	}

}