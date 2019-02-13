package com.dy.AutoTest.MerchantPortal.PageObject.securitycenter;

import org.openqa.selenium.WebDriver;

import com.dy.AutoTest.web.api.SuperPage;
import com.dy.AutoTest.web.actions.DoPlus;

public class SCDCManagementPage extends SuperPage {
	public SCDCManagementPage(WebDriver driver) {
		super(driver);
		du.loadLocator("MP_Loc_SCDCManagement");
	}
	public void setWaitTime(long waitTime) {
		du=new DoPlus(driver);
		du.waitTime=waitTime;
		du.loadLocator("MP_Loc_SCDCManagement");
	}

/***************************Manual Coding**********************************/


/****************************Auto Generate******************************/

	//顶部_数字证书管理
	public void clickTop_DCManagement() {
		du.what("Top_DCManagement").click();
	}
	//开通数字证书服务
	public void clickOpenDCService() {
		du.what("OpenDCService").click();
	}
	//开通数字证书服务_证书类型
	public void selectOpenDCService_CertificateType(String value) {
		du.whatSelect("OpenDCService_CertificateType").selectByValue(value);
	}
	//开通数字证书服务_证书私钥保护密码
	public void setOpenDCService_CertificatePrivateProtectPassword(String value) {
		du.what("OpenDCService_CertificatePrivateProtectPassword").clear();
		du.what("OpenDCService_CertificatePrivateProtectPassword").sendKeys(value);
	}
	public String getOpenDCService_CertificatePrivateProtectPassword() {
		return du.what("OpenDCService_CertificatePrivateProtectPassword").getAttribute("value");
	}
	//开通数字证书服务_提交
	public void clickOpenDCService_Submit() {
		du.what("OpenDCService_Submit").click();
	}
	//开通数字证书服务_关闭
	public void clickOpenDCService_Close() {
		du.what("OpenDCService_Close").click();
	}

}