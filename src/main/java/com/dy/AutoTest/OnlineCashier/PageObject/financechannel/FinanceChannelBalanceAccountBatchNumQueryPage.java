package com.dy.AutoTest.OnlineCashier.PageObject.financechannel;

import org.openqa.selenium.WebDriver;

import com.dy.AutoTest.web.api.SuperPage;
import com.dy.AutoTest.web.actions.DoPlus;

public class FinanceChannelBalanceAccountBatchNumQueryPage extends SuperPage {

	public FinanceChannelBalanceAccountBatchNumQueryPage(WebDriver driver) {
		super(driver);
		du.loadLocator("POP_Loc_FinanceChannelBalanceAccountBatchNumQuery");
	}

	@Override
	public void setWaitTime(long waitTime) {
		du = new DoPlus(driver);
		du.waitTime = waitTime;
		du.loadLocator("POP_Loc_FinanceChannelBalanceAccountBatchNumQuery");
	}

	public void clickAdvance() {
		du.what("Advance").click();
	}

	public void setFocusOnChannel() {
		du.what("Channel").click();
	}
	
	public void inputOnChannel(String value) {
		du.whatSelect("Channel").selectByValue(value);
	}

	public void setFocusOnAccountCheckBatchNum() {
		du.what("AccountCheckBatchNum").click();
	}
	
	public void inputOnAccountCheckBatchNum(String value) {
		du.what("AccountCheckBatchNum").clear();
		du.what("AccountCheckBatchNum").sendKeys(value);
	}

	public void setFocusOnAccountCheckType() {
		du.what("AccountCheckType").click();
	}
	
	public void inputOnAccountCheckType(String value) {
		du.whatSelect("AccountCheckType").selectByValue(value);
	}

	public void setFocusOnAccountCheckFileDate() {
		du.what("AccountCheckFileDate").click();
	}
	
	public void inputOnAccountCheckFileDate(String value) {
		du.what("AccountCheckFileDate").clear();
		du.what("AccountCheckFileDate").sendKeys(value);
	}

	public void setFocusOnChannelPlateform() {
		du.what("ChannelPlateform").click();
	}
	
	public void inputOnChannelPlateform(String value) {
		du.what("ChannelPlateform").clear();
		du.what("ChannelPlateform").sendKeys(value);
	}

	public void setFocusOnBatchAccountSign() {
		du.what("BatchAccountSign").click();
	}
	
	public void inputOnBatchAccountSign(String value) {
		du.whatSelect("BatchAccountSign").selectByValue(value);
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

	public void clickCheck_Close() {
		du.what("Check_Close").click();
	}

	public void clickSelectionButton(int index) {
		du.what("SelectionButton",String.valueOf(index)).click();
	}
	
	public void clickBalanceAccount() {
		du.what("BalanceAccountButton").click();
	}
}
