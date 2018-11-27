package com.dy.AutoTest;

import org.openqa.selenium.WebDriver;

import com.dy.AutoTest.web.actions.DoPlus;
import com.dy.AutoTest.web.api.IQuery;
import com.dy.AutoTest.web.api.SuperPage;

public class DemoPage extends SuperPage implements IQuery{
	public DemoPage(WebDriver driver) {
		super(driver);
		du.loadLocator("POP_Loc_XXXX");
	}
	public void setWaitTime(long waitTime) {
		du=new DoPlus(driver);
		du.waitTime=waitTime;
		du.loadLocator("POP_Loc_XXXX");   
	}
	@Override
	public void clickQuery() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void clickReset() {
		// TODO Auto-generated method stub
		
	}
}
