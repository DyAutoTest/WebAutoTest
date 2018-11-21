package com.dy.AutoTest.web.util;

import org.openqa.selenium.WebDriver;

import com.dy.AutoTest.web.actions.DoPlus;
import com.dy.AutoTest.web.api.SuperPage;

public class DemoPage extends SuperPage{
	public DemoPage(WebDriver driver) {
		super(driver);
		du.loadLocator("POP_Loc_XXXX");
	}
	public void setWaitTime(long waitTime) {
		du=new DoPlus(driver);
		du.waitTime=waitTime;
		du.loadLocator("POP_Loc_XXXX");
	}
}
