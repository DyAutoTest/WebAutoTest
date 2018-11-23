package com.dy.AutoTest.OnlineCashier.PageObject.authentication;

import org.openqa.selenium.WebDriver;

import com.dy.AutoTest.web.api.SuperPage;
import com.dy.AutoTest.web.actions.DoPlus;

public class IdentityAuthenticationQueryPage extends SuperPage {

	public IdentityAuthenticationQueryPage(WebDriver driver) {
		super(driver);
		du.loadLocator("POP_Loc_IdentityAuthenticationQuery");
	}

	@Override
	public void setWaitTime(long waitTime) {
		du=new DoPlus(driver);
		du.waitTime=waitTime;
		du.loadLocator("POP_Loc_IdentityAuthenticationQuery");
	}
	
	public void setFocusOnInnerUserId() {
		du.what("InnerUserId").click();
	}
	
	public void queryOnInnerUserId(String value) {
		du.what("InnerUserId").sendKeys(value);
	}
	
	public void setFocusOnCertificateStatus() {
		du.what("CertificateStatus").click();
	}
	
	public void queryOnCertificateStatus(String value) {
		du.whatSelect("CertificateStatus").selectByValue(value);
	}
	
	public void setFocusOnValidDateFrom() {
		du.what("ValidDateFrom").click();
	}
	
	public void queryOnValidDateFrom(String value) {
		du.what("ValidDateFrom").sendKeys(value);
	}
	
	public void setFocusOnValidDateTo() {
		du.what("ValidDateTo").click();
	}
	
	public void queryOnValidDateTo(String value) {
		du.what("ValidDateTo").sendKeys(value);
	}
	
	public void clickQuery() {
		du.what("QueryButton").click();
	}
	
	public void selectFirstRecord() {
		du.what("FirstOrderSelect").click();
	}
	
	public void clickSwitchButton() {
		du.what("SwitchButton").click();
	}
	
}
