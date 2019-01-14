package com.dy.AutoTest.OperationPlatform.PageObject.accountmanage;

import org.openqa.selenium.WebDriver;

import com.dy.AutoTest.web.actions.DoPlus;
import com.dy.AutoTest.web.api.SuperPage;

public class AccountManageItemRelationPage extends SuperPage {

	public AccountManageItemRelationPage(WebDriver driver) {
		super(driver);
		du.loadLocator("POP_Loc_AccountManageItemRelation");
	}

	@Override
	public void setWaitTime(long waitTime) {
		du = new DoPlus(driver);
		du.waitTime = waitTime;
		du.loadLocator("POP_Loc_AccountManageItemRelation");
	}

	public void setFocusOnItemNO() {
		du.what("ItemNO").click();
	}

	public void inputOnItemNO(String value) {
		du.what("ItemNO").clear();
		du.what("ItemNO").sendKeys(value);
	}

	public void setFocusOnAccountType() {
		du.what("AccountType").click();
	}

	public void inputOnAccountType(String value) {
		du.whatSelect("AccountType").selectByValue(value);
	}

	public void setFocusOnAccountAffiliationOrgnization() {
		du.what("AccountAffiliationOrgnization").click();
	}

	public void inputOnAccountAffiliationOrgnization(String value) {
		du.whatSelect("AccountAffiliationOrgnization").selectByValue(value);
	}

	public void clickQuery() {
		du.what("Query").click();
	}

	public void clickReset() {
		du.what("Reset").click();
	}

	public void clickAdd() {
		du.what("Add").click();
	}

	public void clickUpdate() {
		du.what("Update").click();
	}

	public void clickCheck() {
		du.what("Check").click();
	}

	public void clickDelete() {
		du.what("Delete").click();
	}

	public void clickItemRadio(int index) {
		du.what("ItemRadio", String.valueOf(index)).click();
	}

	public void setFocusOnAdd_AccountType() {
		du.what("Add_AccountType").click();
	}

	public void inputOnAdd_AccountType(String value) {
		du.whatSelect("Add_AccountType").selectByValue(value);
	}

	public void setFocusOnAdd_MoneyType() {
		du.what("Add_MoneyType").click();
	}

	public void inputOnAdd_MoneyType(String value) {
		du.whatSelect("Add_MoneyType").selectByValue(value);
	}

	public void setFocusOnAdd_InternalAccountSign() {
		du.what("Add_InternalAccountSign").click();
	}

	public void inputOnAdd_InternalAccountSign(String value) {
		du.whatSelect("Add_InternalAccountSign").selectByValue(value);
	}

	public void setFocusOnAdd_AccountAffiliationOrgnization() {
		du.what("Add_AccountAffiliationOrgnization").click();
	}

	public void inputOnAdd_AccountAffiliationOrgnization(String value) {
		du.whatSelect("Add_AccountAffiliationOrgnization").selectByValue(value);
	}

	public void setFocusOnAdd_InternalAccountBalanceDirect() {
		du.what("Add_InternalAccountBalanceDirect").click();
	}

	public void inputOnAdd_InternalAccountBalanceDirect(String value) {
		du.whatSelect("Add_InternalAccountBalanceDirect").selectByValue(value);
	}

	public void setFocusOnAdd_BalanceUpdateWay() {
		du.what("Add_BalanceUpdateWay").click();
	}

	public void inputOnAdd_BalanceUpdateWay(String value) {
		du.whatSelect("Add_BalanceUpdateWay").selectByValue(value);
	}

	public void setFocusOnAdd_ManualAccountingSign() {
		du.what("Add_ManualAccountingSign").click();
	}

	public void inputOnAdd_ManualAccountingSign(String value) {
		du.whatSelect("Add_ManualAccountingSign").selectByValue(value);
	}

	public void setFocusOnAdd_CancelAccountType() {
		du.what("Add_CancelAccountType").click();
	}

	public void inputOnAdd_CancelAccountType(String value) {
		du.whatSelect("Add_CancelAccountType").selectByValue(value);
	}

	public void setFocusOnAdd_ItemNum() {
		du.what("Add_ItemNum").click();
	}

	public void inputOnAdd_ItemNum(String value) {
		du.what("Add_ItemNum").clear();
		du.what("Add_ItemNum").sendKeys(value);
	}

	public void setFocusOnAdd_CancelAccountCategory() {
		du.what("Add_CancelAccountCategory").click();
	}

	public void inputOnAdd_CancelAccountCategory(String value) {
		du.whatSelect("Add_CancelAccountCategory").selectByValue(value);
	}

	public void clickAdd_Confirm() {
		du.what("Add_Confirm").click();
	}

	public void clickAdd_Close() {
		du.what("Add_Close").click();
	}

	public void setFocusOnUpdate_InternalAccountSign() {
		du.what("Update_InternalAccountSign").click();
	}

	public void inputOnUpdate_InternalAccountSign(String value) {
		du.whatSelect("Update_InternalAccountSign").selectByValue(value);
	}

	public void setFocusOnUpdate_InternalAccountBalanceDirect() {
		du.what("Update_InternalAccountBalanceDirect").click();
	}

	public void inputOnUpdate_InternalAccountBalanceDirect(String value) {
		du.whatSelect("Update_InternalAccountBalanceDirect").selectByValue(value);
	}

	public void setFocusOnUpdate_BalanceUpdateWay() {
		du.what("Update_BalanceUpdateWay").click();
	}

	public void inputOnUpdate_BalanceUpdateWay(String value) {
		du.whatSelect("Update_BalanceUpdateWay").selectByValue(value);
	}

	public void setFocusOnUpdate_ManualAccountingSign() {
		du.what("Update_ManualAccountingSign").click();
	}

	public void inputOnUpdate_ManualAccountingSign(String value) {
		du.whatSelect("Update_ManualAccountingSign").selectByValue(value);
	}

	public void setFocusOnUpdate_CancelAccountType() {
		du.what("Update_CancelAccountType").click();
	}

	public void inputOnUpdate_CancelAccountType(String value) {
		du.whatSelect("Update_CancelAccountType").selectByValue(value);
	}

	public void setFocusOnUpdate_CancelAccountCategory() {
		du.what("Update_CancelAccountCategory").click();
	}

	public void inputOnUpdate_CancelAccountCategory(String value) {
		du.whatSelect("Update_CancelAccountCategory").selectByValue(value);
	}

	public void clickUpdate_Confirm() {
		du.what("Update_Confirm").click();
	}

	public void clickUpdate_Close() {
		du.what("Update_Close").click();
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

}
