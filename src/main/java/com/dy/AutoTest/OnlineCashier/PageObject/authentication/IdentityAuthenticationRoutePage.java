package com.dy.AutoTest.OnlineCashier.PageObject.authentication;

import org.openqa.selenium.WebDriver;

import com.dy.AutoTest.web.api.SuperPage;
import com.dy.AutoTest.web.actions.DoPlus;

public class IdentityAuthenticationRoutePage extends SuperPage {

	public IdentityAuthenticationRoutePage(WebDriver driver) {
		super(driver);
		du.loadLocator("POP_Loc_IdentityAuthenticationRoute");
	}

	@Override
	public void setWaitTime(long waitTime) {
		du=new DoPlus(driver);
		du.waitTime=waitTime;
		du.loadLocator("POP_Loc_IdentityAuthenticationRoute");
	}

	public void setFocusOnCertificateType() {
		du.what("CertificateType").click();
	}
	
	public void queryOnCertificateType(String value) {
		du.whatSelect("CertificateType").selectByValue(value);
	}
	
	public void setFocusOnServiceType() {
		du.what("ServiceType").click();
	}
	
	public void queryOnServiceType(String value) {
		du.whatSelect("ServiceType").selectByValue(value);
	}
	
	public void setFocusOnRouteChannelCode() {
		du.what("RouteChannelCode").click();
	}
	
	public void queryOnRouteChannelCode(String value) {
		du.whatSelect("RouteChannelCode").selectByValue(value);
	}
	
	public void clickQuery() {
		du.what("QueryButton").click();
	}
	
	public void selectFirstRecord() {
		du.what("FirstOrderSelect").click();
	}
	
	public void clickModifyButton() {
		du.what("ModifyAgent").click();
	}
	
	public void submitModify() {
		du.what("ModifySubmit").click();
	}
	
}
