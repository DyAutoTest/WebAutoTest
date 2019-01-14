package com.dy.AutoTest.OperationPlatform.PageObject.financechannel;

import org.openqa.selenium.WebDriver;

import com.dy.AutoTest.web.api.SuperPage;
import com.dy.AutoTest.web.actions.DoPlus;

public class FinanceChannelManageRateCodePage extends SuperPage {

	public FinanceChannelManageRateCodePage(WebDriver driver) {
		super(driver);
		du.loadLocator("POP_Loc_FinanceChannelManageRateCode");
	}

	@Override
	public void setWaitTime(long waitTime) {
		du = new DoPlus(driver);
		du.waitTime = waitTime;
		du.loadLocator("POP_Loc_FinanceChannelManageRateCode");
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

	public void clickDelete() {
		du.what("Delete").click();
	}

	public void clickSelectionButton(int index) {
		du.what("SelectionButton", String.valueOf(index)).click();
	}

	public void setFocusOnAdd_CodeNum() {
		du.what("Add_CodeNum").click();
	}

	public void inputOnAdd_CodeNum(String value) {
		du.what("Add_CodeNum").clear();
		du.what("Add_CodeNum").sendKeys(value);
	}

	public void setFocusOnAdd_CodeName() {
		du.what("Add_CodeName").click();
	}

	public void inputOnAdd_CodeName(String value) {
		du.what("Add_CodeName").clear();
		du.what("Add_CodeName").sendKeys(value);
	}

	public void setFocusOnAdd_ChargeType() {
		du.what("Add_ChargeType").click();
	}

	public void inputOnAdd_ChargeType(String value) {
		du.whatSelect("Add_ChargeType").selectByValue(value);
	}

	public void clickAdd_Confirm() {
		du.what("Add_Confirm").click();
	}

	public void clickAdd_Close() {
		du.what("Add_Close").click();
	}

	public void setFocusOnChange_CodeName() {
		du.what("Change_CodeName").click();
	}

	public void inputOnChange_CodeName(String value) {
		du.what("Change_CodeName").clear();
		du.what("Change_CodeName").sendKeys(value);
	}

	public void setFocusOnChange_ChargeType() {
		du.what("Change_ChargeType").click();
	}

	public void inputOnChange_ChargeType(String value) {
		du.whatSelect("Change_ChargeType").selectByValue(value);
	}

	public void setFocusOnChange_FeeCalculationBasis() {
		du.what("Change_FeeCalculationBasis").click();
	}

	public void inputOnChange_FeeCalculationBasis(String value) {
		du.whatSelect("Change_FeeCalculationBasis").selectByValue(value);
	}

	public void setFocusOnChange_SettledMoney() {
		du.what("Change_SettledMoney").click();
	}

	public void inputOnChange_SettledMoney(String value) {
		du.what("Change_SettledMoney").clear();
		du.what("Change_SettledMoney").sendKeys(value);
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

	public void clickDelete_Confirm() {
		du.what("Delete_Confirm").click();
	}

	public void clickDelete_Close() {
		du.what("Delete_Close").click();
	}

	public void setFocusOnSearch() {
		du.what("Search").click();
	}
	
	public void inputOnSearch(String value) {
		du.what("Search").clear();
		du.what("Search").sendKeys(value);
	}
	
	public void setFocusOnAdd_BeginAmount() {
		du.what("Add_BeginAmount").click();
	}
	
	public void inputOnAdd_BeginAmount(String value) {
		du.what("Add_BeginAmount").clear();
		du.what("Add_BeginAmount").sendKeys(value);
	}

	public void setFocusOnAdd_MinFeeAmount() {
		du.what("Add_MinFeeAmount").click();
	}
	
	public void inputOnAdd_MinFeeAmount(String value) {
		du.what("Add_MinFeeAmount").clear();
		du.what("Add_MinFeeAmount").sendKeys(value);
	}

	public void setFocusOnAdd_FlatRate() {
		du.what("Add_FlatRate").click();
	}
	
	public void inputOnAdd_FlatRate(String value) {
		du.what("Add_FlatRate").clear();
		du.what("Add_FlatRate").sendKeys(value);
	}

	public void setFocusOnAdd_MaxFeeAmount() {
		du.what("Add_MaxFeeAmount").click();
	}
	
	public void inputOnAdd_MaxFeeAmount(String value) {
		du.what("Add_MaxFeeAmount").clear();
		du.what("Add_MaxFeeAmount").sendKeys(value);
	}

	public void setFocusOnAdd_FeeCalculationBasis() {
		du.what("Add_FeeCalculationBasis").click();
	}
	
	public void inputOnAdd_FeeCalculationBasis(String value) {
		du.whatSelect("Add_FeeCalculationBasis").selectByValue(value);
	}
}
