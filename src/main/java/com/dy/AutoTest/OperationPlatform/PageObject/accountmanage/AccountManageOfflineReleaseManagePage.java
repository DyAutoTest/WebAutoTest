package com.dy.AutoTest.OperationPlatform.PageObject.accountmanage;

import org.openqa.selenium.WebDriver;

import com.dy.AutoTest.web.api.SuperPage;
import com.dy.AutoTest.web.actions.DoPlus;

public class AccountManageOfflineReleaseManagePage extends SuperPage {
	public AccountManageOfflineReleaseManagePage(WebDriver driver) {
		super(driver);
		du.loadLocator("POP_Loc_AccountManageOfflineReleaseManage");
	}
	public void setWaitTime(long waitTime) {
		du=new DoPlus(driver);
		du.waitTime=waitTime;
		du.loadLocator("POP_Loc_AccountManageOfflineReleaseManage");
	}

/***************************Manual Coding**********************************/


/****************************Auto Generate******************************/

	//商户编号
	public void setMerchantNO(String value) {
		du.what("MerchantNO").clear();
		du.what("MerchantNO").sendKeys(value);
	}
	public String getMerchantNO() {
		return du.what("MerchantNO").getAttribute("value");
	}
	//搜商户
	public void clickSearchMer() {
		du.what("SearchMer").click();
	}
	//解冻类型
	public void selectUnfrozenType(String value) {
		du.whatSelect("UnfrozenType").selectByValue(value);
	}
	//备注
	public void setTips(String value) {
		du.what("Tips").clear();
		du.what("Tips").sendKeys(value);
	}
	public String getTips() {
		return du.what("Tips").getAttribute("value");
	}
	//解冻金额
	public void setUnfrozenMoney(String value) {
		du.what("UnfrozenMoney").clear();
		du.what("UnfrozenMoney").sendKeys(value);
	}
	public String getUnfrozenMoney() {
		return du.what("UnfrozenMoney").getAttribute("value");
	}
	//确认
	public void clickConfirm() {
		du.what("Confirm").click();
	}
	//搜商户_商户编号
	public void setSearchMer_MerchantNO(String value) {
		du.what("SearchMer_MerchantNO").clear();
		du.what("SearchMer_MerchantNO").sendKeys(value);
	}
	public String getSearchMer_MerchantNO() {
		return du.what("SearchMer_MerchantNO").getAttribute("value");
	}
	//搜商户_商户名称
	public void setSearchMer_MerchantName(String value) {
		du.what("SearchMer_MerchantName").clear();
		du.what("SearchMer_MerchantName").sendKeys(value);
	}
	public String getSearchMer_MerchantName() {
		return du.what("SearchMer_MerchantName").getAttribute("value");
	}
	//搜商户_确认
	public void clickSearchMer_Confirm() {
		du.what("SearchMer_Confirm").click();
	}
	//搜商户_商户列表单选按钮
	public void clickSearchMer_MerchantRadio(String radio) {
		du.what("SearchMer_MerchantRadio",radio).click();
	}
	public boolean isSearchMer_MerchantRadioDisplayed(String radio) {
		du.waitFor(500);
		return du.what("SearchMer_MerchantRadio",radio).isDisplayed();
	}
	//搜商户_提交
	public void clickSearchMer_Submit() {
		du.what("SearchMer_Submit").click();
	}
	//搜商户_关闭
	public void clickSearchMer_Close() {
		du.what("SearchMer_Close").click();
	}

}