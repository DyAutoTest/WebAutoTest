package com.dy.AutoTest.OperationPlatform.PageObject.financechannel;

import org.openqa.selenium.WebDriver;

import com.dy.AutoTest.web.api.SuperPage;
import com.dy.AutoTest.web.actions.DoPlus;

public class FinanceChannelManageRateMaintainPage extends SuperPage {

	public FinanceChannelManageRateMaintainPage(WebDriver driver) {
		super(driver);
		du.loadLocator("POP_Loc_FinanceChannelManageRateMaintain");
	}

	@Override
	public void setWaitTime(long waitTime) {
		du = new DoPlus(driver);
		du.waitTime = waitTime;
		du.loadLocator("POP_Loc_FinanceChannelManageRateMaintain");
	}

	public void setFocusOnChannelCode() {
		du.what("ChannelCode").click();
	}

	public void inputOnChannelCode(String value) {
		du.whatSelect("ChannelCode").selectByValue(value);
	}

	public void setFocusOnProductType() {
		du.what("ProductType").click();
	}

	public void inputOnProductType(String value) {
		du.whatSelect("ProductType").selectByValue(value);
	}

	public void setFocusOnEffectiveSign() {
		du.what("EffectiveSign").click();
	}

	public void inputOnEffectiveSign(String value) {
		du.whatSelect("EffectiveSign").selectByValue(value);
	}

	public void clickInquire() {
		du.what("Inquire").click();
	}

	public void clickReset() {
		du.what("Reset").click();
	}

	public void clickChannelRateTypeIn() {
		du.what("ChannelRateTypeIn").click();
	}

	public void clickChange() {
		du.what("Change").click();
	}

	public void clickCheck() {
		du.what("Check").click();
	}

	public void clickSelectionButton(int index) {
		du.what("SelectionButton", String.valueOf(index)).click();
	}

	public void setFocusOnTypeIn_ChannelCode() {
		du.what("TypeIn_ChannelCode").click();
	}

	public void inputOnTypeIn_ChannelCode(String value) {
		du.whatSelect("TypeIn_ChannelCode").selectByValue(value);
	}

	public void setFocusOnTypeIn_ProductType() {
		du.what("TypeIn_ProductType").click();
	}

	public void inputOnTypeIn_ProductType(String value) {
		du.whatSelect("TypeIn_ProductType").selectByValue(value);
	}

	public void setFocusOnTypeIn_RateType() {
		du.what("TypeIn_RateType").click();
	}

	public void inputOnTypeIn_RateType(String value) {
		du.whatSelect("TypeIn_RateType").selectByValue(value);
	}

	public void clickTypeIn_RateCodeSearch() {
		du.what("TypeIn_RateCodeSearch").click();
	}

	public void setFocusOnTypeIn_RateCodeSearch_Input() {
		du.what("TypeIn_RateCodeSearch_Input").click();
	}

	public void inputOnTypeIn_RateCodeSearch_Input(String value) {
		du.what("TypeIn_RateCodeSearch_Input").clear();
		du.what("TypeIn_RateCodeSearch_Input").sendKeys(value);
	}

	public void clickTypeIn_RateCodeSearch_Search() {
		du.what("TypeIn_RateCodeSearch_Search").click();
	}

	public void clickTypeIn_RateCodeSearch_SelectButton(int index) {
		du.what("TypeIn_RateCodeSearch_SelectButton", String.valueOf(index)).click();
	}

	public void clickTypeIn_Confirm() {
		du.what("TypeIn_Confirm").click();
	}

	public void clickTypeIn_Close() {
		du.what("TypeIn_Close").click();
	}

	public void clickChange_Search() {
		du.what("Change_Search").click();
	}

	public void setFocusOnChange_Search_Input() {
		du.what("Change_Search_Input").click();
	}

	public void inputOnChange_Search_Input(String value) {
		du.what("Change_Search_Input").clear();
		du.what("Change_Search_Input").sendKeys(value);
	}

	public void clickChange_Search_Search() {
		du.what("Change_Search_Search").click();
	}

	public void clickChange_Search_SelectButton(int index) {
		du.what("Change_Search_SelectButton", String.valueOf(index)).click();
	}

	public void clickChange_Search_Submit() {
		du.what("Change_Search_Submit").click();
	}

	public void clickChange_Search_Close() {
		du.what("Change_Search_Close").click();
	}

	public void clickChange_Confirm() {
		du.what("Change_Confirm").click();
	}

	public void clickChange_Close() {
		du.what("Change_Close").click();
	}

	public void clickCheck_Close() {
		du.what("Check_Close").click();
	}

	public void clickRateCodeSearch_Confirm() {
		du.what("RateCodeSearch_Confirm").click();
	}

	public void clickRateCodeSearch_Close() {
		du.what("RateCodeSearch_Close").click();
	}
	
}
