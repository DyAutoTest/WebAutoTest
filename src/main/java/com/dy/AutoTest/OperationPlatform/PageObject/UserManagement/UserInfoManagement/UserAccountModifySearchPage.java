package com.dy.AutoTest.OperationPlatform.PageObject.UserManagement.UserInfoManagement;

import org.openqa.selenium.WebDriver;

import com.dy.AutoTest.web.actions.DoPlus;
import com.dy.AutoTest.web.api.SuperPage;

public class UserAccountModifySearchPage extends SuperPage {

	public UserAccountModifySearchPage(WebDriver driver) {
		super(driver);
		du.loadLocator("POP_Loc_UserAccountModifySearch");
		
	}

	@Override
	public void setWaitTime(long waitTime) {
		du=new DoPlus(driver);
		du.waitTime=waitTime;
		du.loadLocator("POP_Loc_UserAccountModifySearch");
	
	}
	
	public void setMobileNO(String MobileNO) {
		du.what("MobileNO").sendKeys(MobileNO);
	}
	
	public void doQuery() {
		du.what("Button_Query").click();
	}
	
	public void doReset() {
		du.what("Button_Reset").click();
	}

}
