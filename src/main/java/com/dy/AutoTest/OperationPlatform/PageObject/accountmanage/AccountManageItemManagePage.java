package com.dy.AutoTest.OperationPlatform.PageObject.accountmanage;

import org.openqa.selenium.WebDriver;

import com.dy.AutoTest.web.actions.DoPlus;
import com.dy.AutoTest.web.api.SuperPage;

public class AccountManageItemManagePage extends SuperPage {

	public AccountManageItemManagePage(WebDriver driver) {
		super(driver);
		du.loadLocator("POP_Loc_AccountManageItemManage");
	}

	@Override
	public void setWaitTime(long waitTime) {
		du=new DoPlus(driver);
		du.waitTime=waitTime;
		du.loadLocator("POP_Loc_AccountManageItemManage");
	}
	
	public void setFocusOnItemNO() {
		du.what("ItemNO").click();
	}
	
	public void inputOnItemNO(String value) {
		du.what("ItemNO").clear();
		du.what("ItemNO").sendKeys(value);
	}

	public void setFocusOnItemLv() {
		du.what("ItemLv").click();
	}
	
	public void inputOnItemLv(String value) {
		du.whatSelect("ItemLv").selectByValue(value);
	}

	public void setFocusOnStatus() {
		du.what("Status").click();
	}
	
	public void inputOnStatus(String value) {
		du.whatSelect("Status").selectByValue(value);
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

	public void clickItemRadio(int index) {
		du.what("ItemRadio",String.valueOf(index)).click();
	}

	public void setFocusOnAdd_ItemNum() {
		du.what("Add_ItemNum").click();
	}
	
	public void inputOnAdd_ItemNum(String value) {
		du.what("Add_ItemNum").clear();
		du.what("Add_ItemNum").sendKeys(value);
	}

	public void setFocusOnAdd_ItemCnName() {
		du.what("Add_ItemCnName").click();
	}
	
	public void inputOnAdd_ItemCnName(String value) {
		du.what("Add_ItemCnName").clear();
		du.what("Add_ItemCnName").sendKeys(value);
	}

	public void setFocusOnAdd_ItemEnName() {
		du.what("Add_ItemEnName").click();
	}
	
	public void inputOnAdd_ItemEnName(String value) {
		du.what("Add_ItemEnName").clear();
		du.what("Add_ItemEnName").sendKeys(value);
	}

	public void setFocusOnAdd_ItemLv() {
		du.what("Add_ItemLv").click();
	}
	
	public void inputOnAdd_ItemLv(String value) {
		du.whatSelect("Add_ItemLv").selectByValue(value);
	}

	public void setFocusOnAdd_HigherItemNum() {
		du.what("Add_HigherItemNum").click();
	}
	
	public void inputOnAdd_HigherItemNum(String value) {
		du.what("Add_HigherItemNum").clear();
		du.what("Add_HigherItemNum").sendKeys(value);
	}

	public void setFocusOnAdd_LowestItemSign() {
		du.what("Add_LowestItemSign").click();
	}
	
	public void inputOnAdd_LowestItemSign(String value) {
		du.whatSelect("Add_LowestItemSign").selectByValue(value);
	}

	public void setFocusOnAdd_ItemType() {
		du.what("Add_ItemType").click();
	}
	
	public void inputOnAdd_ItemType(String value) {
		du.whatSelect("Add_ItemType").selectByValue(value);
	}

	public void setFocusOnAdd_ItemClassify() {
		du.what("Add_ItemClassify").click();
	}
	
	public void inputOnAdd_ItemClassify(String value) {
		du.whatSelect("Add_ItemClassify").selectByValue(value);
	}

	public void setFocusOnAdd_LossGainBroughtForwardSign() {
		du.what("Add_LossGainBroughtForwardSign").click();
	}
	
	public void inputOnAdd_LossGainBroughtForwardSign(String value) {
		du.whatSelect("Add_LossGainBroughtForwardSign").selectByValue(value);
	}

	public void setFocusOnAdd_BalanceDirection() {
		du.what("Add_BalanceDirection").click();
	}
	
	public void inputOnAdd_BalanceDirection(String value) {
		du.whatSelect("Add_BalanceDirection").selectByValue(value);
	}

	public void setFocusOnAdd_BalanceOverdraftSign() {
		du.what("Add_BalanceOverdraftSign").click();
	}
	
	public void inputOnAdd_BalanceOverdraftSign(String value) {
		du.whatSelect("Add_BalanceOverdraftSign").selectByValue(value);
	}

	public void setFocusOnAdd_Status() {
		du.what("Add_Status").click();
	}
	
	public void inputOnAdd_Status(String value) {
		du.whatSelect("Add_Status").selectByValue(value);
	}

	public void setFocusOnAdd_ItemBalanceZeroSign() {
		du.what("Add_ItemBalanceZeroSign").click();
	}
	
	public void inputOnAdd_ItemBalanceZeroSign(String value) {
		du.whatSelect("Add_ItemBalanceZeroSign").selectByValue(value);
	}

	public void setFocusOnAdd_DateBegin() {
		du.what("Add_DateBegin").click();
	}
	
	public void inputOnAdd_DateBegin(String value) {
		du.what("Add_DateBegin").clear();
		du.what("Add_DateBegin").sendKeys(value);
	}

	public void setFocusOnAdd_DateEnd() {
		du.what("Add_DateEnd").click();
	}
	
	public void inputOnAdd_DateEnd(String value) {
		du.what("Add_DateEnd").clear();
		du.what("Add_DateEnd").sendKeys(value);
	}

	public void clickAdd_Confirm() {
		du.what("Add_Confirm").click();
	}

	public void clickAdd_Close() {
		du.what("Add_Close").click();
	}

	public void setFocusOnUpdate_ItemCnName() {
		du.what("Update_ItemCnName").click();
	}
	
	public void inputOnUpdate_ItemCnName(String value) {
		du.what("Update_ItemCnName").clear();
		du.what("Update_ItemCnName").sendKeys(value);
	}

	public void setFocusOnUpdate_ItemEnName() {
		du.what("Update_ItemEnName").click();
	}
	
	public void inputOnUpdate_ItemEnName(String value) {
		du.what("Update_ItemEnName").clear();
		du.what("Update_ItemEnName").sendKeys(value);
	}

	public void setFocusOnUpdate_ItemLv() {
		du.what("Update_ItemLv").click();
	}
	
	public void inputOnUpdate_ItemLv(String value) {
		du.whatSelect("Update_ItemLv").selectByValue(value);
	}

	public void setFocusOnUpdate_HigherItemNum() {
		du.what("Update_HigherItemNum").click();
	}
	
	public void inputOnUpdate_HigherItemNum(String value) {
		du.what("Update_HigherItemNum").clear();
		du.what("Update_HigherItemNum").sendKeys(value);
	}

	public void setFocusOnUpdate_LowestItemSign() {
		du.what("Update_LowestItemSign").click();
	}
	
	public void inputOnUpdate_LowestItemSign(String value) {
		du.whatSelect("Update_LowestItemSign").selectByValue(value);
	}

	public void setFocusOnUpdate_ItemType() {
		du.what("Update_ItemType").click();
	}
	
	public void inputOnUpdate_ItemType(String value) {
		du.whatSelect("Update_ItemType").selectByValue(value);
	}

	public void setFocusOnUpdate_ItemClassify() {
		du.what("Update_ItemClassify").click();
	}
	
	public void inputOnUpdate_ItemClassify(String value) {
		du.whatSelect("Update_ItemClassify").selectByValue(value);
	}

	public void setFocusOnUpdate_LossGainBroughtForwardSign() {
		du.what("Update_LossGainBroughtForwardSign").click();
	}
	
	public void inputOnUpdate_LossGainBroughtForwardSign(String value) {
		du.whatSelect("Update_LossGainBroughtForwardSign").selectByValue(value);
	}

	public void setFocusOnUpdate_BalanceDirection() {
		du.what("Update_BalanceDirection").click();
	}
	
	public void inputOnUpdate_BalanceDirection(String value) {
		du.whatSelect("Update_BalanceDirection").selectByValue(value);
	}

	public void setFocusOnUpdate_BalanceOverdraftSign() {
		du.what("Update_BalanceOverdraftSign").click();
	}
	
	public void inputOnUpdate_BalanceOverdraftSign(String value) {
		du.whatSelect("Update_BalanceOverdraftSign").selectByValue(value);
	}

	public void setFocusOnUpdate_Status() {
		du.what("Update_Status").click();
	}
	
	public void inputOnUpdate_Status(String value) {
		du.whatSelect("Update_Status").selectByValue(value);
	}

	public void setFocusOnUpdate_ItemBalanceZeroSign() {
		du.what("Update_ItemBalanceZeroSign").click();
	}
	
	public void inputOnUpdate_ItemBalanceZeroSign(String value) {
		du.whatSelect("Update_ItemBalanceZeroSign").selectByValue(value);
	}

	public void setFocusOnUpdate_DateBegin() {
		du.what("Update_DateBegin").click();
	}
	
	public void inputOnUpdate_DateBegin(String value) {
		du.what("Update_DateBegin").clear();
		du.what("Update_DateBegin").sendKeys(value);
	}

	public void setFocusOnUpdate_DateEnd() {
		du.what("Update_DateEnd").click();
	}
	
	public void inputOnUpdate_DateEnd(String value) {
		du.what("Update_DateEnd").clear();
		du.what("Update_DateEnd").sendKeys(value);
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
	
}
