package com.dy.AutoTest.OperationPlatform.PageObject.UserManagement.UserInfoManagement;

import org.openqa.selenium.WebDriver;

import com.dy.AutoTest.OperationPlatform.PageObject.SuperPage;
import com.dy.AutoTest.web.actions.DoPlus;

public class UserIncomeExpenditureDetailPage extends SuperPage{
	
	public UserIncomeExpenditureDetailPage(WebDriver driver) {
		super(driver);
		du.loadLocator("POP_Loc_UserIncomeExpenditureDetail");
	}
	public void setWaitTime(long waitTime) {
		du=new DoPlus(driver);
		du.waitTime=waitTime;
		du.loadLocator("POP_Loc_UserIncomeExpenditureDetail");
	}
	
	public void setMobileNO(String MobileNO) {
		du.what("MobileNO").sendKeys(MobileNO);
	}
	
	public void setInnerUserNO(String InnerUserNO) {
		du.what("InnerUserNO").sendKeys(InnerUserNO);
	}
	
	public void setStartDate(String StartDate) {
		System.out.println(StartDate);
		du.what("StartDate").sendKeys(StartDate);
	}
	
	public void setEndDate(String EndDate) {
		du.what("EndDate").sendKeys(EndDate);
	}
	
	/*
	 * 01 : 充值
	 * 02 : 消费
	*/
	public void setTransactionType(String TransactionType) {
		du.whatSelect("TransactionType").selectByValue(TransactionType);
	}
	
	public void doQuery() {
		du.what("Button_Query").click();
	}
	
	public void doReset() {
		du.what("Button_Reset").click();
	}
	
	public void selectRadio() {
		du.what("Radio_Index").click();
	}
	
	public void doDetail() {
		du.what("Button_Detail").click();
	}
	
	public void doClose() {
		du.what("Button_Close").click();
	}
	
}
