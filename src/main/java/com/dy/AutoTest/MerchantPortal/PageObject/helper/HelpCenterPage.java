package com.dy.AutoTest.MerchantPortal.PageObject.helper;

import org.openqa.selenium.WebDriver;

import com.dy.AutoTest.web.api.SuperPage;
import com.dy.AutoTest.web.actions.DoPlus;

public class HelpCenterPage extends SuperPage {
	public HelpCenterPage(WebDriver driver) {
		super(driver);
		du.loadLocator("MP_Loc_HelpCenter");
	}
	public void setWaitTime(long waitTime) {
		du=new DoPlus(driver);
		du.waitTime=waitTime;
		du.loadLocator("MP_Loc_HelpCenter");
	}

/***************************Manual Coding**********************************/


/****************************Auto Generate******************************/

	//帮助中心
	public void clickHelpCenter() {
		du.what("HelpCenter").click();
	}
	//商户合作
	public void clickMerchantCooperation() {
		du.what("MerchantCooperation").click();
	}
	//商户管理
	public void clickMerchantManagement() {
		du.what("MerchantManagement").click();
	}
	//商户资料变更
	public void clickMerchantDataUpdate() {
		du.what("MerchantDataUpdate").click();
	}
	//付款遇到问题
	public void clickPaymentProblem() {
		du.what("PaymentProblem").click();
	}
	//商户资料变更申请表1
	public void clickMerchantDataUpdate_Application1() {
		du.what("MerchantDataUpdate_Application1").click();
	}
	//帮助
	public void clickHelp() {
		du.what("Help").click();
	}

}