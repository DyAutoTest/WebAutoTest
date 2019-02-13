package com.dy.AutoTest.OperationPlatform.PageObject.authentication;

import org.openqa.selenium.WebDriver;

import com.dy.AutoTest.web.actions.DoPlus;
import com.dy.AutoTest.web.api.SuperPage;

public class IdentityAuthenticationDetailsPage extends SuperPage {

	public IdentityAuthenticationDetailsPage(WebDriver driver) {
		super(driver);
		du.loadLocator("POP_Loc_IdentityAuthenticationDetails");
	}

	@Override
	public void setWaitTime(long waitTime) {
		du=new DoPlus(driver);
		du.waitTime=waitTime;
		du.loadLocator("POP_Loc_IdentityAuthenticationDetails");
	}

	public void setFocusOnInnerUserid() {
		du.what("InnerUserId").click();
	}
	
	public void queryOnInnerUserId(String value) {
		du.what("InnerUserId").sendKeys(value);
	}
	
	public void setFocusOnUserName() {
		du.what("UserName").click();
	}
	
	public void queryOnUserName(String value) {
		du.what("UserName").sendKeys(value);
	}
	
	public void setFocusOnCertificateStatus() {
		du.what("CertificateStatus").click();
	}
	
	public void queryOnCertificateStatus(String value) {
		du.whatSelect("CertificateStatus").selectByValue(value);
	}
	
	public void setFocusOnCertificateNumberl() {
		du.what("CertificateNumber").click();
	}
	
	public void queryOnCertificateNumber(String value) {
		du.what("CertificateNumber").sendKeys(value);
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
