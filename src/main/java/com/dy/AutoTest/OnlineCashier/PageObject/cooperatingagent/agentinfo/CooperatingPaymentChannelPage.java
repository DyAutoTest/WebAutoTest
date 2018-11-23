package com.dy.AutoTest.OnlineCashier.PageObject.cooperatingagent.agentinfo;

import org.openqa.selenium.WebDriver;

import com.dy.AutoTest.web.api.SuperPage;
import com.dy.AutoTest.web.actions.DoPlus;

public class CooperatingPaymentChannelPage extends SuperPage {

	public CooperatingPaymentChannelPage(WebDriver driver) {
		super(driver);
		du.loadLocator("POP_Loc_CooperatingPaymentChannel");
	}

	@Override
	public void setWaitTime(long waitTime) {
		du=new DoPlus(driver);
		du.waitTime=waitTime;
		du.loadLocator("POP_Loc_CooperatingPaymentChannel");
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
	
	public void clickAddButton() {
		du.what("AddButton").click();
	}
	
	public void clickAddCloseButton() {
		du.what("AddCloseButton").click();
	}
	
	public void clickDetailsButton() {
		du.what("DetailsButton").click();
	}
	
	public void clickDisableButton() {
		du.what("DisableButton").click();
	}
	
	public void clickEnableButton() {
		du.what("EnableButton").click();
	}
	
	public void setFocusOnBankCode() {
		du.what("UnionBankCode").click();
	}
	
	public void inputBankCode(String value) {
		du.what("UnionBankCode").clear();
		du.what("UnionBankCode").sendKeys(value);
	}
	
	public void setFocusOnCashAccount() {
		du.what("CashAccount").click();
	}
	
	public void inputCashAccount(String value) {
		du.what("CashAccount").clear();
		du.what("CashAccount").sendKeys(value);
	}
	
	public void setFocusOnSettleAccountDirect() {
		du.what("SettleAccountDirect").click();
	}
	
	public void inputSettleAccountDirect(String value) {
		du.whatSelect("SettleAccountDirect").selectByValue(value);
	}
	
	public void setFocusOnSettleBankCode() {
		du.what("SettleBankCode").click();
	}
	
	public void inputSettleBankCode(String value) {
		du.what("SettleBankCode").clear();
		du.what("SettleBankCode").sendKeys(value);
	}
	
	public void setFocusOnSettleAccountBankName() {
		du.what("SettleAccountBankName").click();
	}
	
	public void inputSettleAccountBankName(String value) {
		du.what("SettleAccountBankName").clear();
		du.what("SettleAccountBankName").sendKeys(value);
	}
	
	public void setFocusOnSettleAccountName() {
		du.what("SettleAccountName").click();
	}
	
	public void inputSettleAccountName(String value) {
		du.what("SettleAccountName").clear();
		du.what("SettleAccountName").sendKeys(value);
	}
	
	public void setFocusOnSettleAccount() {
		du.what("SettleAccount").click();
	}
	
	public void inputSettleAccount(String value) {
		du.what("SettleAccount").clear();
		du.what("SettleAccount").sendKeys(value);
	}
	
	public void setFocusOnMerchantNumber() {
		du.what("MerchantNumber").click();
	}
	
	public void inputMerchantNumber(String value) {
		du.what("MerchantNumber").clear();
		du.what("MerchantNumber").sendKeys(value);
	}
	
	public void setFocusOnContactName() {
		du.what("ContactName").click();
	}
	
	public void inputContactName(String contactName) {
		du.what("ContactName").clear();
		du.what("ContactName").sendKeys(contactName);
	}
	
	public void setFocusOnCustomerManager() {
		du.what("CustomerManager").click();
	}
	
	public void inputCustomerManager(String customerManager) {
		du.what("CustomerManager").clear();
		du.what("CustomerManager").sendKeys(customerManager);
	}
	
	public void submitModify() {
		du.what("ModifySubmit").click();
	}
	
	public void EnableConfirm() {
		du.what("EnableConfirm").click();
	}
	
	public void DisableConfirm() {
		du.what("DisableConfirm").click();
	}
	
}
