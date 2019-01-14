package com.dy.AutoTest.OperationPlatform.PageObject.idverification;

import org.openqa.selenium.WebDriver;

import com.dy.AutoTest.web.api.SuperPage;
import com.dy.AutoTest.web.actions.DoPlus;

public class IdCardValidDateVerificationPage extends SuperPage {

	public IdCardValidDateVerificationPage(WebDriver driver) {
		super(driver);
		du.loadLocator("POP_Loc_IdCardValidDateVerification");
	}

	@Override
	public void setWaitTime(long waitTime) {
		du = new DoPlus(driver);
		du.waitTime = waitTime;
		du.loadLocator("POP_Loc_IdCardValidDateVerification");
	}
	
	public void setFocusOnUserMobile() {
		du.what("UserMobile").click();
	}

	public void queryOnUserMobile(String value) {
		du.what("UserMobile").sendKeys(value);
	}
	
	public void setFocusOnVerifyComment() {
		du.what("VerifyComment").click();
	}
	
	public void inputVerifyComment(String value) {
		du.what("VerifyComment").sendKeys(value);
	}

	public void clickReset() {
		du.what("ResetButton").click();
	}

	public void clickQuery() {
		du.what("QueryButton").click();
	}

	public void selectFirstRecord() {
		du.what("FirstOrderSelect").click();
	}

	public void clickVerifyButton() {
		du.what("VerifyButton").click();
	}

	public void clickCloseButton() {
		du.what("CloseButton").click();
	}
	
}
