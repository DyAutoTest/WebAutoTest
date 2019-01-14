package com.dy.AutoTest.OperationPlatform.PageObject.accountmanage;

import org.openqa.selenium.WebDriver;

import com.dy.AutoTest.web.actions.DoPlus;
import com.dy.AutoTest.web.api.SuperPage;

public class AccountManageInternalAccountManagePage extends SuperPage {

	public AccountManageInternalAccountManagePage(WebDriver driver) {
		super(driver);
		du.loadLocator("POP_Loc_AccountManageInternalAccountManage");
	}

	@Override
	public void setWaitTime(long waitTime) {
		du = new DoPlus(driver);
		du.waitTime = waitTime;
		du.loadLocator("POP_Loc_AccountManageInternalAccountManage");
	}

	public void setFocusOnInternalAccountType() {
		du.what("InternalAccountType").click();
	}

	public void inputOnInternalAccountType(String value) {
		du.whatSelect("InternalAccountType").selectByValue(value);
	}

	public void setFocusOnInternalAccountNO() {
		du.what("InternalAccountNO").click();
	}

	public void inputOnInternalAccountNO(String value) {
		du.what("InternalAccountNO").clear();
		du.what("InternalAccountNO").sendKeys(value);
	}

	public void setFocusOnStatus() {
		du.what("Status").click();
	}

	public void inputOnStatus(String value) {
		du.whatSelect("Status").selectByValue(value);
	}

	public void clickQuery() {
		du.what("Query").click();
	}

	public void clickReset() {
		du.what("Reset").click();
	}

	public void clickOpenAccount() {
		du.what("OpenAccount").click();
	}

	public void clickCloseAccount() {
		du.what("CloseAccount").click();
	}

	public void clickCheck() {
		du.what("Check").click();
	}

	public void clickAccountRadio(int index) {
		du.what("AccountRadio", String.valueOf(index)).click();
	}

	public void setFocusOnOpenAccount_InternalAccountType() {
		du.what("OpenAccount_InternalAccountType").click();
	}

	public void inputOnOpenAccount_InternalAccountType(String value) {
		du.whatSelect("OpenAccount_InternalAccountType").selectByValue(value);
	}

	public void setFocusOnOpenAccount_InternalAccountName() {
		du.what("OpenAccount_InternalAccountName").click();
	}

	public void inputOnOpenAccount_InternalAccountName(String value) {
		du.what("OpenAccount_InternalAccountName").clear();
		du.what("OpenAccount_InternalAccountName").sendKeys(value);
	}

	public void setFocusOnOpenAccount_ConditionCode() {
		du.what("OpenAccount_ConditionCode").click();
	}

	public void inputOnOpenAccount_ConditionCode(String value) {
		du.what("OpenAccount_ConditionCode").clear();
		du.what("OpenAccount_ConditionCode").sendKeys(value);
	}

	public void setFocusOnOpenAccount_AccountsBelongingOrgnization() {
		du.what("OpenAccount_AccountsBelongingOrgnization").click();
	}

	public void inputOnOpenAccount_AccountsBelongingOrgnization(String value) {
		du.whatSelect("OpenAccount_AccountsBelongingOrgnization").selectByValue(value);
	}

	public void clickOpenAccount_Confirm() {
		du.what("OpenAccount_Confirm").click();
	}

	public void clickOpenAccount_Close() {
		du.what("OpenAccount_Close").click();
	}

	public void clickCloseAccount_Confirm() {
		du.what("CloseAccount_Confirm").click();
	}

	public void clickCloseAccount_Close() {
		du.what("CloseAccount_Close").click();
	}

	public void clickCheck_Close() {
		du.what("Check_Close").click();
	}

}
