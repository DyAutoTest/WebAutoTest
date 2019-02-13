package com.dy.AutoTest.OperationPlatform.PageObject.cooperatingagent.routeinfo;

import org.openqa.selenium.WebDriver;

import com.dy.AutoTest.web.api.SuperPage;
import com.dy.AutoTest.web.actions.DoPlus;

public class CooperatingRouteInfoPage extends SuperPage {

	public CooperatingRouteInfoPage(WebDriver driver) {
		super(driver);
		du.loadLocator("POP_Loc_CooperatingRouteInfo");
	}

	@Override
	public void setWaitTime(long waitTime) {
		du=new DoPlus(driver);
		du.waitTime=waitTime;
		du.loadLocator("POP_Loc_CooperatingRouteInfo");
	}

	public void setFocusOnSearch() {
		du.what("AgentSearch").click();
	}
	
	public void queryOnSearch(String searchValue) {
		du.what("AgentSearch").sendKeys(searchValue);
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
	
	public void clickDetailsButton() {
		du.what("DetailsButton").click();
	}
	
	public void clickAddCloseButton() {
		du.what("AddCloseButton").click();
	}
}
