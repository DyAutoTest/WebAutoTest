package com.dy.AutoTest.MerchantPortal.PageObject.securitycenter;

import org.openqa.selenium.WebDriver;

import com.dy.AutoTest.web.api.SuperPage;
import com.dy.AutoTest.web.actions.DoPlus;

public class SCContactUsPage extends SuperPage {
	public SCContactUsPage(WebDriver driver) {
		super(driver);
		du.loadLocator("MP_Loc_SCContactUs");
	}
	public void setWaitTime(long waitTime) {
		du=new DoPlus(driver);
		du.waitTime=waitTime;
		du.loadLocator("MP_Loc_SCContactUs");
	}

/***************************Manual Coding**********************************/


/****************************Auto Generate******************************/

	//顶部_联系我们
	public void clickContactUs() {
		du.what("ContactUs").click();
	}

}