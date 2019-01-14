package com.dy.AutoTest.MerchantPortal.PageObject.myinfo;

import org.openqa.selenium.WebDriver;

import com.dy.AutoTest.web.actions.DoPlus;
import com.dy.AutoTest.web.api.SuperPage;

public class MerchantInfoPage extends SuperPage {

	public MerchantInfoPage(WebDriver driver) {
		super(driver);
		du.loadLocator("MP_Loc_MainMenuPage");
	}

	public void setWaitTime(long waitTime) {
		du = new DoPlus(driver);
		du.waitTime = waitTime;
		du.loadLocator("MP_Loc_MainMenuPage");
	}

}
