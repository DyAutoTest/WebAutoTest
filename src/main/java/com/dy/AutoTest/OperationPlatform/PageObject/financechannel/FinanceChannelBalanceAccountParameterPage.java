package com.dy.AutoTest.OperationPlatform.PageObject.financechannel;

import org.openqa.selenium.WebDriver;

import com.dy.AutoTest.web.api.SuperPage;
import com.dy.AutoTest.web.actions.DoPlus;

public class FinanceChannelBalanceAccountParameterPage extends SuperPage {

	public FinanceChannelBalanceAccountParameterPage(WebDriver driver) {
		super(driver);
		du.loadLocator("POP_Loc_FinanceChannelBalanceAccountParameter");
	}

	@Override
	public void setWaitTime(long waitTime) {
		du = new DoPlus(driver);
		du.waitTime = waitTime;
		du.loadLocator("POP_Loc_FinanceChannelBalanceAccountParameter");
	}

	public void setFocusOnChannelName() {
		du.what("ChannelName").click();
	}

	public void inputOnChannelName(String value) {
		du.whatSelect("ChannelName").selectByValue(value);
	}

	public void setFocusOnAccountCheckType() {
		du.what("AccountCheckType").click();
	}

	public void inputOnAccountCheckType(String value) {
		du.whatSelect("AccountCheckType").selectByValue(value);
	}

	public void setFocusOnChannelPlateformNum() {
		du.what("ChannelPlateformNum").click();
	}

	public void inputOnChannelPlateformNum(String value) {
		du.what("ChannelPlateformNum").clear();
		du.what("ChannelPlateformNum").sendKeys(value);
	}

	public void setFocusOnBatchAccountCheckSign() {
		du.what("BatchAccountCheckSign").click();
	}

	public void inputOnBatchAccountCheckSign(String value) {
		du.whatSelect("BatchAccountCheckSign").selectByValue(value);
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

	public void clickAdd() {
		du.what("Add").click();
	}

	public void clickChange() {
		du.what("Change").click();
	}

	public void clickEnable() {
		du.what("Enable").click();
	}

	public void clickDisable() {
		du.what("Disable").click();
	}

	public void clickDelete() {
		du.what("Delete").click();
	}

	public void clickSelectionButton(int index) {
		du.what("SelectionButton", String.valueOf(index)).click();
	}

	public void clickCheck_Close() {
		du.what("Check_Close").click();
	}

	public void setFocusOnAdd_ChannelName() {
		du.what("Add_ChannelName").click();
	}

	public void inputOnAdd_ChannelName(String value) {
		du.whatSelect("Add_ChannelName").selectByValue(value);
	}

	public void setFocusOnAdd_AccountCheckType() {
		du.what("Add_AccountCheckType").click();
	}

	public void inputOnAdd_AccountCheckType(String value) {
		du.whatSelect("Add_AccountCheckType").selectByValue(value);
	}

	public void setFocusOnAdd_EnableFlag() {
		du.what("Add_EnableFlag").click();
	}

	public void inputOnAdd_EnableFlag(String value) {
		du.whatSelect("Add_EnableFlag").selectByValue(value);
	}

	public void setFocusOnAdd_AccoutCheckFlag() {
		du.what("Add_AccoutCheckFlag").click();
	}

	public void inputOnAdd_AccoutCheckFlag(String value) {
		du.whatSelect("Add_AccoutCheckFlag").selectByValue(value);
	}

	public void setFocusOnAdd_BatchAccountCheckSign() {
		du.what("Add_BatchAccountCheckSign").click();
	}

	public void inputOnAdd_BatchAccountCheckSign(String value) {
		du.whatSelect("Add_BatchAccountCheckSign").selectByValue(value);
	}

	public void setFocusOnAdd_ChannelPlateformNum() {
		du.what("Add_ChannelPlateformNum").click();
	}

	public void inputOnAdd_ChannelPlateformNum(String value) {
		du.what("Add_ChannelPlateformNum").clear();
		du.what("Add_ChannelPlateformNum").sendKeys(value);
	}

	public void setFocusOnAdd_StorageEnteringService() {
		du.what("Add_StorageEnteringService").click();
	}

	public void inputOnAdd_StorageEnteringService(String value) {
		du.what("Add_StorageEnteringService").clear();
		du.what("Add_StorageEnteringService").sendKeys(value);
	}

	public void setFocusOnAdd_StorageEnteringTrade() {
		du.what("Add_StorageEnteringTrade").click();
	}

	public void inputOnAdd_StorageEnteringTrade(String value) {
		du.what("Add_StorageEnteringTrade").clear();
		du.what("Add_StorageEnteringTrade").sendKeys(value);
	}

	public void setFocusOnAdd_AccountCheckService() {
		du.what("Add_AccountCheckService").click();
	}

	public void inputOnAdd_AccountCheckService(String value) {
		du.what("Add_AccountCheckService").clear();
		du.what("Add_AccountCheckService").sendKeys(value);
	}

	public void setFocusOnAdd_AccountCheckTrade() {
		du.what("Add_AccountCheckTrade").click();
	}

	public void inputOnAdd_AccountCheckTrade(String value) {
		du.what("Add_AccountCheckTrade").clear();
		du.what("Add_AccountCheckTrade").sendKeys(value);
	}

	public void setFocusOnAdd_TurnErrorDays() {
		du.what("Add_TurnErrorDays").click();
	}

	public void inputOnAdd_TurnErrorDays(String value) {
		du.what("Add_TurnErrorDays").clear();
		du.what("Add_TurnErrorDays").sendKeys(value);
	}

	public void setFocusOnAdd_AccountCheckBeginTime() {
		du.what("Add_AccountCheckBeginTime").click();
	}

	public void inputOnAdd_AccountCheckBeginTime(String value) {
		du.what("Add_AccountCheckBeginTime").clear();
		du.what("Add_AccountCheckBeginTime").sendKeys(value);
	}

	public void setFocusOnAdd_AccountCheckEndTime() {
		du.what("Add_AccountCheckEndTime").click();
	}

	public void inputOnAdd_AccountCheckEndTime(String value) {
		du.what("Add_AccountCheckEndTime").clear();
		du.what("Add_AccountCheckEndTime").sendKeys(value);
	}

	public void clickAdd_Submit() {
		du.what("Add_Submit").click();
	}

	public void clickAdd_Close() {
		du.what("Add_Close").click();
	}

	public void setFocusOnChange_EnableFlag() {
		du.what("Change_EnableFlag").click();
	}

	public void inputOnChange_EnableFlag(String value) {
		du.whatSelect("Change_EnableFlag").selectByValue(value);
	}

	public void setFocusOnChange_AccountCheckFlag() {
		du.what("Change_AccountCheckFlag").click();
	}

	public void inputOnChange_AccountCheckFlag(String value) {
		du.whatSelect("Change_AccountCheckFlag").selectByValue(value);
	}

	public void setFocusOnChange_BatchAccountCheckSign() {
		du.what("Change_BatchAccountCheckSign").click();
	}

	public void inputOnChange_BatchAccountCheckSign(String value) {
		du.whatSelect("Change_BatchAccountCheckSign").selectByValue(value);
	}

	public void setFocusOnChange_ChannelPlateformNum() {
		du.what("Change_ChannelPlateformNum").click();
	}

	public void inputOnChange_ChannelPlateformNum(String value) {
		du.what("Change_ChannelPlateformNum").clear();
		du.what("Change_ChannelPlateformNum").sendKeys(value);
	}

	public void setFocusOnChange_StorageEnteringService() {
		du.what("Change_StorageEnteringService").click();
	}

	public void inputOnChange_StorageEnteringService(String value) {
		du.what("Change_StorageEnteringService").clear();
		du.what("Change_StorageEnteringService").sendKeys(value);
	}

	public void setFocusOnChange_StorageEnteringTrade() {
		du.what("Change_StorageEnteringTrade").click();
	}

	public void inputOnChange_StorageEnteringTrade(String value) {
		du.what("Change_StorageEnteringTrade").clear();
		du.what("Change_StorageEnteringTrade").sendKeys(value);
	}

	public void setFocusOnChange_AccountCheckService() {
		du.what("Change_AccountCheckService").click();
	}

	public void inputOnChange_AccountCheckService(String value) {
		du.what("Change_AccountCheckService").clear();
		du.what("Change_AccountCheckService").sendKeys(value);
	}

	public void setFocusOnChange_AccountCheckTrade() {
		du.what("Change_AccountCheckTrade").click();
	}

	public void inputOnChange_AccountCheckTrade(String value) {
		du.what("Change_AccountCheckTrade").clear();
		du.what("Change_AccountCheckTrade").sendKeys(value);
	}

	public void setFocusOnChange_TurnErrorDays() {
		du.what("Change_TurnErrorDays").click();
	}

	public void inputOnChange_TurnErrorDays(String value) {
		du.what("Change_TurnErrorDays").clear();
		du.what("Change_TurnErrorDays").sendKeys(value);
	}

	public void setFocusOnChange_AccountCheckBeginTime() {
		du.what("Change_AccountCheckBeginTime").click();
	}

	public void inputOnChange_AccountCheckBeginTime(String value) {
		du.what("Change_AccountCheckBeginTime").clear();
		du.what("Change_AccountCheckBeginTime").sendKeys(value);
	}

	public void setFocusOnChange_AccountCheckEndTime() {
		du.what("Change_AccountCheckEndTime").click();
	}

	public void inputOnChange_AccountCheckEndTime(String value) {
		du.what("Change_AccountCheckEndTime").clear();
		du.what("Change_AccountCheckEndTime").sendKeys(value);
	}

	public void clickChange_Submit() {
		du.what("Change_Submit").click();
	}

	public void clickChange_Close() {
		du.what("Change_Close").click();
	}

	public void clickEnable_Confirm() {
		du.what("Enable_Confirm").click();
	}

	public void clickEnable_Close() {
		du.what("Enable_Close").click();
	}

	public void clickDisable_Confirm() {
		du.what("Disable_Confirm").click();
	}

	public void clickDisable_Close() {
		du.what("Disable_Close").click();
	}

	public void clickDelete_Confirm() {
		du.what("Delete_Confirm").click();
	}

	public void clickDelete_Close() {
		du.what("Delete_Close").click();
	}

	public void setFocusOnAdd_AccountCheckFlag() {
		du.what("Add_AccountCheckFlag").click();
	}
	
	public void inputOnAdd_AccountCheckFlag(String value) {
		du.whatSelect("Add_AccountCheckFlag").selectByValue(value);
	}
	
}
