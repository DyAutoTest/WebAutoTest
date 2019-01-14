package com.dy.AutoTest.OperationPlatform.PageObject.financechannel;

import org.openqa.selenium.WebDriver;

import com.dy.AutoTest.web.api.SuperPage;
import com.dy.AutoTest.web.actions.DoPlus;

public class FinanceChannelBalanceAccountErrorManagePage extends SuperPage {

	public FinanceChannelBalanceAccountErrorManagePage(WebDriver driver) {
		super(driver);
		du.loadLocator("POP_Loc_FinanceChannelBalanceAccountErrorManage");
	}

	@Override
	public void setWaitTime(long waitTime) {
		du = new DoPlus(driver);
		du.waitTime = waitTime;
		du.loadLocator("POP_Loc_FinanceChannelBalanceAccountErrorManage");
	}

	public void setFocusOnErrorKeys() {
		du.what("ErrorKeys").click();
	}

	public void inputOnErrorKeys(String value) {
		du.what("ErrorKeys").clear();
		du.what("ErrorKeys").sendKeys(value);
	}

	public void setFocusOnErrorBatchNum() {
		du.what("ErrorBatchNum").click();
	}

	public void inputOnErrorBatchNum(String value) {
		du.what("ErrorBatchNum").clear();
		du.what("ErrorBatchNum").sendKeys(value);
	}

	public void setFocusOnChannel() {
		du.what("Channel").click();
	}

	public void inputOnChannel(String value) {
		du.whatSelect("Channel").selectByValue(value);
	}

	public void setFocusOnAccountCheckType() {
		du.what("AccountCheckType").click();
	}

	public void inputOnAccountCheckType(String value) {
		du.whatSelect("AccountCheckType").selectByValue(value);
	}

	public void setFocusOnErrorStatus() {
		du.what("ErrorStatus").click();
	}

	public void inputOnErrorStatus(String value) {
		du.whatSelect("ErrorStatus").selectByValue(value);
	}

	public void setFocusOnErrorBuildDateBegin() {
		du.what("ErrorBuildDateBegin").click();
	}

	public void inputOnErrorBuildDateBegin(String value) {
		du.what("ErrorBuildDateBegin").clear();
		du.what("ErrorBuildDateBegin").sendKeys(value);
	}

	public void setFocusOnErrorBuildDateEnd() {
		du.what("ErrorBuildDateEnd").click();
	}

	public void inputOnErrorBuildDateEnd(String value) {
		du.what("ErrorBuildDateEnd").clear();
		du.what("ErrorBuildDateEnd").sendKeys(value);
	}

	public void clickInquire() {
		du.what("Inquire").click();
	}

	public void clickReset() {
		du.what("Reset").click();
	}

	public void clickErrorCheck() {
		du.what("ErrorCheck").click();
	}

	public void clickReplacementOrder() {
		du.what("ReplacementOrder").click();
	}

	public void clickCancelOrder() {
		du.what("CancelOrder").click();
	}

	public void clickErrorCancel() {
		du.what("ErrorCancel").click();
	}

	public void clickRefundOperation() {
		du.what("RefundOperation").click();
	}

	public void clickRefundCheck() {
		du.what("RefundCheck").click();
	}

	public void clickSelectionButton(int index) {
		du.what("SelectionButton", String.valueOf(index)).click();
	}

	public void clickCheck_Close() {
		du.what("Check_Close").click();
	}

	public void clickCancelOrder_Confirm() {
		du.what("CancelOrder_Confirm").click();
	}

	public void clickCancelOder_Close() {
		du.what("CancelOder_Close").click();
	}

	public void clickErrorCancel_Confirm() {
		du.what("ErrorCancel_Confirm").click();
	}

	public void clickErrorCancel_Close() {
		du.what("ErrorCancel_Close").click();
	}

	public void clickRefundOperation_Confirm() {
		du.what("RefundOperation_Confirm").click();
	}

	public void clickRefundOperation_Close() {
		du.what("RefundOperation_Close").click();
	}

	public void clickRefundCheck_Confirm() {
		du.what("RefundCheck_Confirm").click();
	}

	public void clickRefundCheck_Close() {
		du.what("RefundCheck_Close").click();
	}

}
