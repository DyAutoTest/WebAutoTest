package com.dy.AutoTest.MerchantPortal.PageObject.securitycenter;

import org.openqa.selenium.WebDriver;

import com.dy.AutoTest.web.api.SuperPage;

import safeInput.KeyBoardSimulator;

import com.dy.AutoTest.web.actions.DoPlus;

public class SCUpdatePaymentPasswordPage extends SuperPage {
	public SCUpdatePaymentPasswordPage(WebDriver driver) {
		super(driver);
		du.loadLocator("MP_Loc_SCUpdatePaymentPassword");
	}
	public void setWaitTime(long waitTime) {
		du=new DoPlus(driver);
		du.waitTime=waitTime;
		du.loadLocator("MP_Loc_SCUpdatePaymentPassword");
	}

/***************************Manual Coding**********************************/


/****************************Auto Generate******************************/

	//顶部_修改支付密码
	public void clickTop_UpdatePaymentPassword() {
		du.what("Top_UpdatePaymentPassword").click();
	}
	//原始支付密码
	public void setOriginPaymentPassword(String value) {
//		du.what("OriginPaymentPassword").clear();
//		du.what("OriginPaymentPassword").sendKeys(value);
		try {
			du.what("OriginPaymentPassword").click();
			du.waitFor(500);
			KeyBoardSimulator.inputMockKeyBoard(value);
		} catch (Exception e) {
			e.printStackTrace();
			du.waitFor(10000);
		}
	}
	public String getOriginPaymentPassword() {
		return du.what("OriginPaymentPassword").getAttribute("value");
	}
	//新支付密码
	public void setNewPaymentPassword(String value) {
//		du.what("NewPaymentPassword").clear();
//		du.what("NewPaymentPassword").sendKeys(value);
		try {
			du.what("NewPaymentPassword").click();
			du.waitFor(500);
			KeyBoardSimulator.inputMockKeyBoard(value);
		} catch (Exception e) {
			e.printStackTrace();
			du.waitFor(10000);
		}
	}
	public String getNewPaymentPassword() {
		return du.what("NewPaymentPassword").getAttribute("value");
	}
	//确认新支付密码
	public void setConfirmNewPaymentPassword(String value) {
//		du.what("ConfirmNewPaymentPassword").clear();
//		du.what("ConfirmNewPaymentPassword").sendKeys(value);
		try {
			du.what("ConfirmNewPaymentPassword").click();
			du.waitFor(500);
			KeyBoardSimulator.inputMockKeyBoard(value);
		} catch (Exception e) {
			e.printStackTrace();
			du.waitFor(10000);
		}
	}
	public String getConfirmNewPaymentPassword() {
		return du.what("ConfirmNewPaymentPassword").getAttribute("value");
	}
	//确认保存
	public void clickSave() {
		du.what("Save").click();
	}
	//返回
	public void clickReturn() {
		du.what("Return").click();
	}
	//结算密码验证错误_确定
	public void clickFail() {
		du.what("Fail").click();
	}
	//交易成功_确定
	public void clickSuccess() {
		du.what("Success").click();
	}

}