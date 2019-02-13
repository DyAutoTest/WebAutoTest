package com.dy.AutoTest.OperationPlatform.PageObject.financechannel;

import org.openqa.selenium.WebDriver;

import com.dy.AutoTest.web.api.SuperPage;
import com.dy.AutoTest.web.actions.DoPlus;

public class FinanceChannelManageFlowQueryPage extends SuperPage {

	public FinanceChannelManageFlowQueryPage(WebDriver driver) {
		super(driver);
		du.loadLocator("POP_Loc_FinanceChannelManageFlowQuery");
	}

	@Override
	public void setWaitTime(long waitTime) {
		du = new DoPlus(driver);
		du.waitTime = waitTime;
		du.loadLocator("POP_Loc_FinanceChannelManageFlowQuery");
	}
	
	public void clickAdvanceButton() {
		du.what("AdvanceButton").click();
		du.waitFor(500);
	}

	public void setFocusOnRequestSerialNumber() {
		du.what("RequestSerialNumber").click();
	}
	
	public void inputOnRequestSerialNumber(String value) {
		du.what("RequestSerialNumber").clear();
		du.what("RequestSerialNumber").sendKeys(value);
	}

	public void setFocusOnTradeStatus() {
		du.what("TradeStatus").click();
	}
	
	public void inputOnTradeStatus(String value) {
		du.whatSelect("TradeStatus").selectByValue(value);
	}

	public void setFocusOnAccountDateBegin() {
		du.what("AccountDateBegin").click();
	}
	
	public void inputOnAccountDateBegin(String value) {
//		du.what("AccountDateBegin").clear();
		du.what("AccountDateBegin").sendKeys(value);
	}

	public void setFocusOnAccountDateEnd() {
		du.what("AccountDateEnd").click();
	}
	
	public void inputOnAccountDateEnd(String value) {
//		du.what("AccountDateEnd").clear();
		du.what("AccountDateEnd").sendKeys(value);
	}

	public void setFocusOnRequestDateBegin() {
		du.what("RequestDateBegin").click();
	}
	
	public void inputOnRequestDateBegin(String value) {
//		du.what("RequestDateBegin").clear();
		du.what("RequestDateBegin").sendKeys(value);
	}

	public void setFocusOnRequestDateEnd() {
		du.what("RequestDateEnd").click();
	}
	
	public void inputOnRequestDateEnd(String value) {
//		du.what("RequestDateEnd").clear();
		du.what("RequestDateEnd").sendKeys(value);
	}

	public void setFocusOnInterfaceType() {
		du.what("InterfaceType").click();
	}
	
	public void inputOnInterfaceType(String value) {
		du.whatSelect("InterfaceType").selectByValue(value);
	}

	public void setFocusOnAccountCheckBatchNum() {
		du.what("AccountCheckBatchNum").click();
	}
	
	public void inputOnAccountCheckBatchNum(String value) {
		du.what("AccountCheckBatchNum").clear();
		du.what("AccountCheckBatchNum").sendKeys(value);
	}

	public void setFocusOnInternalOrderNum() {
		du.what("InternalOrderNum").click();
	}
	
	public void inputOnInternalOrderNum(String value) {
		du.what("InternalOrderNum").clear();
		du.what("InternalOrderNum").sendKeys(value);
	}

	public void setFocusOnMerchantNum() {
		du.what("MerchantNum").click();
	}
	
	public void inputOnMerchantNum(String value) {
		du.what("MerchantNum").clear();
		du.what("MerchantNum").sendKeys(value);
	}

	public void clickSearchMerchant() {
		du.what("SearchMerchant").click();
	}

	public void setFocusOnChannel() {
		du.what("Channel").click();
	}
	
	public void inputOnChannel(String value) {
		du.whatSelect("Channel").selectByValue(value);
	}

	public void setFocusOnAccountCheckStatus() {
		du.what("AccountCheckStatus").click();
	}
	
	public void inputOnAccountCheckStatus(String value) {
		du.whatSelect("AccountCheckStatus").selectByValue(value);
	}

	public void setFocusOnChannelOrderNum() {
		du.what("ChannelOrderNum").click();
	}
	
	public void inputOnChannelOrderNum(String value) {
		du.what("ChannelOrderNum").clear();
		du.what("ChannelOrderNum").sendKeys(value);
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

	public void clickExcel() {
		du.what("Excel").click();
	}

	public void clickSelectionButton(int index) {
		du.what("SelectionButton",String.valueOf(index)).click();
	}

	public void setFocusOnSearchMerchant_MerNum() {
		du.what("SearchMerchant_MerNum").click();
	}
	
	public void inputOnSearchMerchant_MerNum(String value) {
		du.what("SearchMerchant_MerNum").clear();
		du.what("SearchMerchant_MerNum").sendKeys(value);
	}

	public void setFocusOnSearchMerchant_MerName() {
		du.what("SearchMerchant_MerName").click();
	}
	
	public void inputOnSearchMerchant_MerName(String value) {
		du.what("SearchMerchant_MerName").clear();
		du.what("SearchMerchant_MerName").sendKeys(value);
	}

	public void clickSearchMerchant_Search() {
		du.what("SearchMerchant_Search").click();
	}

	public void clickSearchMerchant_SelectButton(int index) {
		du.what("SearchMerchant_SelectButton",String.valueOf(index)).click();
	}
	public void clickCheck_RequestInform() {
		du.what("Check_RequestInform").click();
	}

	public void clickCheck_BusinessInform() {
		du.what("Check_BusinessInform").click();
	}

	public void clickCheck_ChannelInform() {
		du.what("Check_ChannelInform").click();
	}

	public void clickCheck_AccountCheckInform() {
		du.what("Check_AccountCheckInform").click();
	}

	public void clickCheck_OtherInform() {
		du.what("Check_OtherInform").click();
	}

	public void clickCheck_Close() {
		du.what("Check_Close").click();
	}

	public void clickExcel_Confirm() {
		du.what("Excel_Confirm").click();
	}

	public void clickExcel_Close() {
		du.what("Excel_Close").click();
	}
	
}
