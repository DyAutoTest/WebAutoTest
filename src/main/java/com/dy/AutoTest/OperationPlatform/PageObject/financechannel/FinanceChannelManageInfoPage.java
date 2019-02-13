package com.dy.AutoTest.OperationPlatform.PageObject.financechannel;

import org.openqa.selenium.WebDriver;

import com.dy.AutoTest.web.api.SuperPage;
import com.dy.AutoTest.web.actions.DoPlus;

public class FinanceChannelManageInfoPage extends SuperPage {

	public FinanceChannelManageInfoPage(WebDriver driver) {
		super(driver);
		du.loadLocator("POP_Loc_FinanceChannelManageInfo");
	}

	@Override
	public void setWaitTime(long waitTime) {
		du = new DoPlus(driver);
		du.waitTime = waitTime;
		du.loadLocator("POP_Loc_FinanceChannelManageInfo");
	}

	public void setFocusOnChannelCode() {
		du.what("ChannelCode").click();
	}
	
	public void queryOnChannelCode(String value) {
		du.whatSelect("ChannelCode").selectByValue(value);
	}
	
	public void setFocusOnInterfaceType() {
		du.what("InterfaceType").click();
	}
	
	public void queryOnInterfaceType(String value) {
		du.whatSelect("InterfaceType").selectByValue(value);
	}
	
	public void setFocusOnRequestType() {
		du.what("RequestType").click();
	}
	
	public void queryOnRequestType(String value) {
		du.whatSelect("RequestType").selectByValue(value);
	}
	
	public void setFocusOnEnableSelect() {
		du.what("EnableSelect").click();
	}
	
	public void queryOnEnableSelect(String value) {
		du.whatSelect("EnableSelect").selectByValue(value);
	}
	
	public void clickInquire() {
		du.what("Inquire").click();
	}
	
	public void clickSelectionButton(int index) {
		du.what("SelectionButton",String.valueOf(index)).click();
	}
	
	public void clickAdd() {
		du.what("Add").click();
	}
	
	public void clickChange() {
		du.what("Change").click();
	}
	
	public void clickCheck() {
		du.what("Check").click();
	}
	
	public void clickEnable() {
		du.what("Enable").click();
	}
	
	public void clickUnable() {
		du.what("Unable").click();
	}
	
	public void setFocusOnChange_EnableSelect() {
		du.what("Change_EnableSelect").click();
	}
	
	public void queryOnChange_EnableSelect(String value) {
		du.whatSelect("Change_EnableSelect").selectByValue(value);
	}
	
	public void setFocusOnChange_ChannelType() {
		du.what("Change_ChannelType").click();
	}
	
	public void queryOnChange_ChannelType(String value) {
		du.what("Change_ChannelType").clear();
		du.what("Change_ChannelType").sendKeys(value);
	}
	
	public void setFocusOnChange_AccountCheckType() {
		du.what("Change_AccountCheckType").click();
	}
	
	public void queryOnChange_AccountCheckType(String value) {
		du.whatSelect("Change_AccountCheckType").selectByValue(value);
	}
	
//	Change_CallServeName
	public void setFocusOnChange_CallServeName() {
		du.what("Change_CallServeName").click();
	}
	
	public void inputChange_CallServeName(String contactName) {
		du.what("Change_CallServeName").clear();
		du.what("Change_CallServeName").sendKeys(contactName);
	}
	
//	Change_CallTradeCode
	public void setFocusOnChange_CallTradeCode() {
		du.what("Change_CallTradeCode").click();
	}
	
	public void inputChange_CallTradeCode(String contactName) {
		du.what("Change_CallTradeCode").clear();
		du.what("Change_CallTradeCode").sendKeys(contactName);
	}
	
//	Change_ExtensionStatus
	public void setFocusOnChange_ExtensionStatus() {
		du.what("Change_ExtensionStatus").click();
	}
	
	public void queryOnChange_ExtensionStatus(String value) {
		du.what("Change_ExtensionStatus").clear();
		du.what("Change_ExtensionStatus").sendKeys(value);
	}

//	Change_ChannelPlateformNum
	public void setFocusOnChange_ChannelPlateformNum() {
		du.what("Change_ChannelPlateformNum").click();
	}
	
	public void queryOnChange_ChannelPlateformNum(String contactName) {
		du.what("Change_ChannelPlateformNum").clear();
		du.what("Change_ChannelPlateformNum").sendKeys(contactName);
	}
	
//	Change_ChannelMerchantNum
	public void setFocusOnChange_ChannelMerchantNum() {
		du.what("Change_ChannelMerchantNum").click();
	}
	
	public void queryOnChange_ChannelMerchantNum(String contactName) {
		du.what("Change_ChannelMerchantNum").clear();
		du.what("Change_ChannelMerchantNum").sendKeys(contactName);
	}
	
//	Change_ChannelObjectNum
	public void setFocusOnChange_ChannelObjectNum() {
		du.what("Change_ChannelObjectNum").click();
	}
	
	public void queryOnChange_ChannelObjectNum(String contactName) {
		du.what("Change_ChannelObjectNum").clear();
		du.what("Change_ChannelObjectNum").sendKeys(contactName);
	}
	
//	Change_InquireRequestType
	public void setFocusOnChange_InquireRequestType() {
		du.what("Change_InquireRequestType").click();
	}
	
	public void queryOnChange_InquireRequestType(String value) {
		du.what("Change_InquireRequestType").clear();
		du.what("Change_InquireRequestType").sendKeys(value);
	}
	
//	Change_RefundRequestType
	public void setFocusOnChange_RefundRequestType() {
		du.what("Change_RefundRequestType").click();
	}
	
	public void queryOnChange_RefundRequestType(String value) {
		du.what("Change_RefundRequestType").clear();
		du.what("Change_RefundRequestType").sendKeys(value);
	}
	
//	Change_RevocationRequestType
	public void setFocusOnChange_RevocationRequestType() {
		du.what("Change_RevocationRequestType").click();
	}
	
	public void queryOnChange_RevocationRequestType(String value) {
		du.what("Change_RevocationRequestType").clear();
		du.what("Change_RevocationRequestType").sendKeys(value);
	}
	
//	Change_Change
	public void clickChange_Change() {
		du.what("Change_Change").click();
	}
	
//	Change_Close
	public void clickChange_Close() {
		du.what("Change_Close").click();
	}
	
//	Add_Add
	public void clickAdd_Add() {
		du.what("Add_Add").click();
	}
	
//	Add_Close
	public void clickAdd_Close() {
		du.what("Add_Close").click();
	}
	
//	Check_Close
	public void clickCheck_Close() {
		du.what("Check_Close").click();
	}
	
//	Enable_Enable
	public void clickEnable_Enable() {
		du.what("Enable_Enable").click();
	}
	
//	Enable_Close
	public void clickEnable_Close() {
		du.what("Enable_Close").click();
	}
	
//	Disable_Disable
	public void clickDisable_Disable() {
		du.what("Disable_Disable").click();
	}
	
//	Disable_Close
	public void clickDisable_Close() {
		du.what("Disable_Close").click();
	}
	
//	Delete_Delete
	public void clickDelete_Delete() {
		du.what("Delete_Delete").click();
	}
	
//	Delete_Close
	public void clickDelete_Close() {
		du.what("Delete_Close").click();
	}
	
//	Add_ChannelCode
	public void setFocusOnAdd_ChannelCode() {
		du.what("Add_ChannelCode").click();
	}
	
	public void queryOnAdd_ChannelCode(String value) {
		du.whatSelect("Add_ChannelCode").selectByValue(value);
	}
	
//	Add_RequestType
	public void setFocusOnAdd_RequestType() {
		du.what("Add_RequestType").click();
	}
	
	public void queryOnAdd_RequestType(String value) {
		du.whatSelect("Add_RequestType").selectByValue(value);
	}
	
//	Add_InterfaceType
	public void setFocusOnAdd_InterfaceType() {
		du.what("Add_InterfaceType").click();
	}
	
	public void queryOnAdd_InterfaceType(String value) {
		du.whatSelect("Add_InterfaceType").selectByValue(value);
	}
	
//	Add_CallBackSelect
	public void setFocusOnAdd_CallBackSelect() {
		du.what("Add_CallBackSelect").click();
	}
	
	public void queryOnAdd_CallBackSelect(String value) {
		du.whatSelect("Add_CallBackSelect").selectByValue(value);
	}
	
//	Add_SerialNumberRule
	public void setFocusOnAdd_SerialNumberRule() {
		du.what("Add_SerialNumberRule").click();
	}
	
	public void queryOnAdd_SerialNumberRule(String value) {
		du.whatSelect("Add_SerialNumberRule").selectByValue(value);
	}
	
//	Add_AccountCheckType
	public void setFocusOnAdd_AccountCheckType() {
		du.what("Add_AccountCheckType").click();
	}
	
	public void queryOnAdd_AccountCheckType(String value) {
		du.whatSelect("Add_AccountCheckType").selectByValue(value);
	}
	
}
