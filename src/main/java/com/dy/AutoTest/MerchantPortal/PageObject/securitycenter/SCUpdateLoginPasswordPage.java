package com.dy.AutoTest.MerchantPortal.PageObject.securitycenter;

import org.openqa.selenium.WebDriver;

import com.dy.AutoTest.web.api.SuperPage;

import safeInput.KeyBoardSimulator;

import com.dy.AutoTest.web.actions.DoPlus;

public class SCUpdateLoginPasswordPage extends SuperPage {
	public SCUpdateLoginPasswordPage(WebDriver driver) {
		super(driver);
		du.loadLocator("MP_Loc_SCUpdateLoginPassword");
	}
	public void setWaitTime(long waitTime) {
		du=new DoPlus(driver);
		du.waitTime=waitTime;
		du.loadLocator("MP_Loc_SCUpdateLoginPassword");
	}

/***************************Manual Coding**********************************/


/****************************Auto Generate******************************/

	//修改登录密码
	public void clickTop_UpdateLoginPassword() {
		du.what("Top_UpdateLoginPassword").click();
	}
	//原始登录密码
	public void setOriginLoginPassword(String value) {
//		du.what("OriginLoginPassword").clear();
//		du.what("OriginLoginPassword").sendKeys(value);
		try {
			du.what("OriginLoginPassword").click();
			du.waitFor(500);
			KeyBoardSimulator.inputMockKeyBoard(value);
		} catch (Exception e) {
			e.printStackTrace();
			du.waitFor(10000);
		}
	}
	public String getOriginLoginPassword() {
		return du.what("OriginLoginPassword").getAttribute("value");
	}
	//新登录密码
	public void setNewLoginPassword(String value) {
//		du.what("NewLoginPassword").clear();
//		du.what("NewLoginPassword").sendKeys(value);
		try {
			du.what("NewLoginPassword").click();
			du.waitFor(500);
			KeyBoardSimulator.inputMockKeyBoard(value);
		} catch (Exception e) {
			e.printStackTrace();
			du.waitFor(10000);
		}
	}
	public String getNewLoginPassword() {
		return du.what("NewLoginPassword").getAttribute("value");
	}
	//确认新登录密码
	public void setConfirmNewLoginPassword(String value) {
//		du.what("ConfirmNewLoginPassword").clear();
//		du.what("ConfirmNewLoginPassword").sendKeys(value);
		try {
			du.what("ConfirmNewLoginPassword").click();
			du.waitFor(500);
			KeyBoardSimulator.inputMockKeyBoard(value);
		} catch (Exception e) {
			e.printStackTrace();
			du.waitFor(10000);
		}
	}
	public String getConfirmNewLoginPassword() {
		return du.what("ConfirmNewLoginPassword").getAttribute("value");
	}
	//确认保存
	public void clickSave() {
		du.what("Save").click();
	}
	//返回
	public void clickReturn() {
		du.what("Return").click();
	}
	//交易成功_确定
	public void clickConfirm() {
		du.what("Confirm").click();
	}

}