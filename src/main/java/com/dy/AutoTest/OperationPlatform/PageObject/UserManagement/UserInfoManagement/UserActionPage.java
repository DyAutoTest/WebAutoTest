package com.dy.AutoTest.OperationPlatform.PageObject.UserManagement.UserInfoManagement;

import org.openqa.selenium.WebDriver;

import com.dy.AutoTest.web.actions.DoPlus;
import com.dy.AutoTest.web.api.SuperPage;


public class UserActionPage extends SuperPage{
	public UserActionPage(WebDriver driver) {
		super(driver);
		du.loadLocator("POP_Loc_UserAction");
	}
	public void setWaitTime(long waitTime) {
		du=new DoPlus(driver);
		du.waitTime=waitTime;
		du.loadLocator("POP_Loc_UserAction");
	}
	
	public void setMobileNO(String MobileNO) {
		du.what("MobileNO").sendKeys(MobileNO);
	}
	
	public void setStartDate(String StartDate) {
		du.what("StartDate").clear();
		du.what("StartDate").sendKeys(StartDate);
	}
	
	public void setEndDate(String EndDate) {
		du.what("EndDate").clear();
		du.what("EndDate").sendKeys(EndDate);
	}
	
	public void doQuery() {
		du.what("Button_Query").click();
	}
	
	public void doReset() {
		du.what("Button_Reset").click();
	}
	
}
