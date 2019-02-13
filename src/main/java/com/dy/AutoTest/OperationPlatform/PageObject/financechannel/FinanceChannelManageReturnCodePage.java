package com.dy.AutoTest.OperationPlatform.PageObject.financechannel;

import org.openqa.selenium.WebDriver;

import com.dy.AutoTest.web.api.SuperPage;
import com.dy.AutoTest.web.actions.DoPlus;

public class FinanceChannelManageReturnCodePage extends SuperPage {

	public FinanceChannelManageReturnCodePage(WebDriver driver) {
		super(driver);
		du.loadLocator("POP_Loc_FinanceChannelManageReturnCode");
	}

	@Override
	public void setWaitTime(long waitTime) {
		du = new DoPlus(driver);
		du.waitTime = waitTime;
		du.loadLocator("POP_Loc_FinanceChannelManageReturnCode");
	}

	public void setFocusOnChannelCode() {
		du.what("ChannelCode").click();
	}

	public void inputOnChannelCode(String value) {
		du.whatSelect("ChannelCode").selectByValue(value);
	}

	public void setFocusOnChannelReturnCode() {
		du.what("ChannelReturnCode").click();
	}

	public void inputOnChannelReturnCode(String value) {
		du.what("ChannelReturnCode").clear();
		du.what("ChannelReturnCode").sendKeys(value);
	}

	public void setFocusOnEnableSelect() {
		du.what("EnableSelect").click();
	}

	public void inputOnEnableSelect(String value) {
		du.whatSelect("EnableSelect").selectByValue(value);
	}

	public void setFocusOnPlateformInformCode() {
		du.what("PlateformInformCode").click();
	}

	public void inputOnPlateformInformCode(String value) {
		du.what("PlateformInformCode").clear();
		du.what("PlateformInformCode").sendKeys(value);
	}

	public void clickInquire() {
		du.what("Inquire").click();
	}

	public void clickReset() {
		du.what("Reset").click();
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

	public void clickDisable() {
		du.what("Disable").click();
	}

	public void clickSelectionButton(int index) {
		du.what("SelectionButton", String.valueOf(index)).click();
	}

	public void setFocusOnAdd_ChannelCode() {
		du.what("Add_ChannelCode").click();
	}

	public void inputOnAdd_ChannelCode(String value) {
		du.whatSelect("Add_ChannelCode").selectByValue(value);
	}

	public void setFocusOnAdd_ChannelReturnCode() {
		du.what("Add_ChannelReturnCode").click();
	}

	public void inputOnAdd_ChannelReturnCode(String value) {
		du.what("Add_ChannelReturnCode").clear();
		du.what("Add_ChannelReturnCode").sendKeys(value);
	}

	public void setFocusOnAdd_ChannelReturnCodeDescribe() {
		du.what("Add_ChannelReturnCodeDescribe").click();
	}

	public void inputOnAdd_ChannelReturnCodeDescribe(String value) {
		du.what("Add_ChannelReturnCodeDescribe").clear();
		du.what("Add_ChannelReturnCodeDescribe").sendKeys(value);
	}

	public void setFocusOnAdd_PlateformInformCode() {
		du.what("Add_PlateformInformCode").click();
	}

	public void inputOnAdd_PlateformInformCode(String value) {
		du.what("Add_PlateformInformCode").clear();
		du.what("Add_PlateformInformCode").sendKeys(value);
	}

	public void setFocusOnAdd_PlateformInformCodeDescribe() {
		du.what("Add_PlateformInformCodeDescribe").click();
	}

	public void inputOnAdd_PlateformInformCodeDescribe(String value) {
		du.what("Add_PlateformInformCodeDescribe").clear();
		du.what("Add_PlateformInformCodeDescribe").sendKeys(value);
	}

	public void setFocusOnAdd_EnableSelect() {
		du.what("Add_EnableSelect").click();
	}

	public void inputOnAdd_EnableSelect(String value) {
		du.whatSelect("Add_EnableSelect").selectByValue(value);
	}

	public void setFocusOnAdd_ChannelType() {
		du.what("Add_ChannelType").click();
	}

	public void inputOnAdd_ChannelType(String value) {
		du.what("Add_ChannelType").clear();
		du.what("Add_ChannelType").sendKeys(value);
	}

	public void clickAdd_Add() {
		du.what("Add_Add").click();
	}

	public void clickAdd_Close() {
		du.what("Add_Close").click();
	}

	public void setFocusOnChange_PlateformInformCode() {
		du.what("Change_PlateformInformCode").click();
	}

	public void inputOnChange_PlateformInformCode(String value) {
		du.what("Change_PlateformInformCode").clear();
		du.what("Change_PlateformInformCode").sendKeys(value);
	}

	public void setFocusOnChange_PlateformInformCodeDescribe() {
		du.what("Change_PlateformInformCodeDescribe").click();
	}

	public void inputOnChange_PlateformInformCodeDescribe(String value) {
		du.what("Change_PlateformInformCodeDescribe").clear();
		du.what("Change_PlateformInformCodeDescribe").sendKeys(value);
	}

	public void setFocusOnChange_EnableSelect() {
		du.what("Change_EnableSelect").click();
	}

	public void inputOnChange_EnableSelect(String value) {
		du.whatSelect("Change_EnableSelect").selectByValue(value);
	}

	public void clickChange_Change() {
		du.what("Change_Change").click();
	}

	public void clickChange_Close() {
		du.what("Change_Close").click();
	}

	public void clickCheck_Close() {
		du.what("Check_Close").click();
	}

	public void clickEnable_Enable() {
		du.what("Enable_Enable").click();
	}

	public void clickEnable_Close() {
		du.what("Enable_Close").click();
	}

	public void clickDisable_Disable() {
		du.what("Disable_Disable").click();
	}

	public void clickDisable_Close() {
		du.what("Disable_Close").click();
	}

}
