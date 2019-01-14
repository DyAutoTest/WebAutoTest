package com.dy.AutoTest.OperationPlatform.PageObject.financechannel;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.dy.AutoTest.web.api.SuperPage;
import com.dy.AutoTest.web.actions.DoPlus;

public class FinanceChannelManageSignManagePage extends SuperPage {

	public FinanceChannelManageSignManagePage(WebDriver driver) {
		super(driver);
		du.loadLocator("POP_Loc_FinanceChannelManageSignManage");
	}

	@Override
	public void setWaitTime(long waitTime) {
		du = new DoPlus(driver);
		du.waitTime = waitTime;
		du.loadLocator("POP_Loc_FinanceChannelManageSignManage");
	}

	public void setFocusOnName() {
		du.what("Name").click();
	}

	public void inputOnName(String value) {
		du.what("Name").clear();
		du.what("Name").sendKeys(value);
	}

	public void setFocusOnIDNum() {
		du.what("IDNum").click();
	}

	public void inputOnIDNum(String value) {
		du.what("IDNum").clear();
		du.what("IDNum").sendKeys(value);
	}

	public void setFocusOnBankCardID() {
		du.what("BankCardID").click();
	}

	public void inputOnBankCardID(String value) {
		du.what("BankCardID").clear();
		du.what("BankCardID").sendKeys(value);
	}

	public void setFocusOnSigningDateBegin() {
		du.what("SigningDateBegin").click();
	}
	
	public void selectAllSigningDateBegin() {
		du.what("SigningDateBegin").sendKeys(Keys.CONTROL + "a");
	}
	
	public void inputOnSigningDateBegin(String value) {
		du.what("SigningDateBegin").sendKeys(value);
	}

	public void setFocusOnSigningDateEnd() {
		du.what("SigningDateEnd").click();
	}
	
	public void selectAllSigningDateEnd() {
		du.what("SigningDateEnd").sendKeys(Keys.CONTROL + "a");
	}

	public void inputOnSigningDateEnd(String value) {
		du.what("SigningDateEnd").sendKeys(value);
	}

	public void setFocusOnChannel() {
		du.what("Channel").click();
	}

	public void inputOnChannel(String value) {
		du.whatSelect("Channel").selectByValue(value);
	}

	public void setFocusOnSendingCardBank() {
		du.what("SendingCardBank").click();
	}

	public void inputOnSendingCardBank(String value) {
		du.whatSelect("SendingCardBank").selectByValue(value);
	}

	public void setFocusOnSigningStatus() {
		du.what("SigningStatus").click();
	}

	public void inputOnSigningStatus(String value) {
		du.whatSelect("SigningStatus").selectByValue(value);
	}

	public void setFocusOnPhoneNum() {
		du.what("PhoneNum").click();
	}

	public void inputOnPhoneNum(String value) {
		du.what("PhoneNum").clear();
		du.what("PhoneNum").sendKeys(value);
	}

	public void setFocusOnPlatformExpressProtocol() {
		du.what("PlatformExpressProtocol").click();
	}

	public void inputOnPlatformExpressProtocol(String value) {
		du.what("PlatformExpressProtocol").clear();
		du.what("PlatformExpressProtocol").sendKeys(value);
	}

	public void setFocusOnChannelReturnProtocolCode() {
		du.what("ChannelReturnProtocolCode").click();
	}

	public void inputOnChannelReturnProtocolCode(String value) {
		du.what("ChannelReturnProtocolCode").clear();
		du.what("ChannelReturnProtocolCode").sendKeys(value);
	}

	public void clickInquire() {
		du.what("Inquire").click();
	}

	public void clickReset() {
		du.what("Reset").click();
	}

	public void clickCheck() {
		du.what("Check").click();
	}

	public void clickSelectionButton(int index) {
		du.what("SelectionButton", String.valueOf(index)).click();
	}

	public void clickCheck_Close() {
		du.what("Check_Close").click();
	}
	
	public void clickAdvanceButton() {
		du.what("AdvanceButton").click();
	}

}
