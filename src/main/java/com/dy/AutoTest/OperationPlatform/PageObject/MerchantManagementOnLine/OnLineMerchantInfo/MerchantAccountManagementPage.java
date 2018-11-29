package com.dy.AutoTest.OperationPlatform.PageObject.MerchantManagementOnLine.OnLineMerchantInfo;

import com.dy.AutoTest.web.api.ISearchMerchantByNOorName;

import org.openqa.selenium.WebDriver;

import com.dy.AutoTest.web.api.SuperPage;
import com.dy.AutoTest.web.actions.DoPlus;

public class MerchantAccountManagementPage extends SuperPage implements ISearchMerchantByNOorName{
	public MerchantAccountManagementPage(WebDriver driver) {
		super(driver);
		du.loadLocator("POP_Loc_MerchantAccountManagement");
	}
	public void setWaitTime(long waitTime) {
		du=new DoPlus(driver);
		du.waitTime=waitTime;
		du.loadLocator("POP_Loc_MerchantAccountManagement");
	}

/***************************Manual Coding**********************************/


/****************************Auto Generate******************************/

	//高级
	public void clickAdvance() {
		du.what("Advance").click();
	}
	//商户编号
	public void setMerchantNO(String value) {
		du.what("MerchantNO").clear();
		du.what("MerchantNO").sendKeys(value);
	}
	public String getMerchantNO() {
		return du.what("MerchantNO").getAttribute("value");
	}
	//按钮_搜商户
	public void clickSearchMer() {
		du.what("SearchMer").click();
	}
	//账户编号
	public void setAccountNO(String value) {
		du.what("AccountNO").clear();
		du.what("AccountNO").sendKeys(value);
	}
	public String getAccountNO() {
		return du.what("AccountNO").getAttribute("value");
	}
	//商户类型
	public void selectMerType(String value) {
		du.whatSelect("MerType").selectByValue(value);
	}
	//账户类型
	public void selectAccountType(String value) {
		du.whatSelect("AccountType").selectByValue(value);
	}
	//商户状态
	public void selectMerStatus(String value) {
		du.whatSelect("MerStatus").selectByValue(value);
	}
	//账户状态
	public void selectAccountStatus(String value) {
		du.whatSelect("AccountStatus").selectByValue(value);
	}
	//查询
	public void clickQurey() {
		du.what("Qurey").click();
	}
	//重置
	public void clickReset() {
		du.what("Reset").click();
	}
	//冻结
	public void clickFrozen() {
		du.what("Frozen").click();
	}
	//解冻
	public void clickUnfrozen() {
		du.what("Unfrozen").click();
	}
	//单选框
	public void clickRadio(String index) {
		du.what("Radio",index).click();
	}
	public boolean isRadioDisplayed(String index) {
		du.waitFor(500);
		return du.what("Radio",index).isDisplayed();
	}
	//搜商户_商户号
	public void setSearchMer_MerNum(String value) {
		du.what("SearchMer_MerNum").clear();
		du.what("SearchMer_MerNum").sendKeys(value);
	}
	public String getSearchMer_MerNum() {
		return du.what("SearchMer_MerNum").getAttribute("value");
	}
	//搜商户_商户名
	public void setSearchMer_MerName(String value) {
		du.what("SearchMer_MerName").clear();
		du.what("SearchMer_MerName").sendKeys(value);
	}
	public String getSearchMer_MerName() {
		return du.what("SearchMer_MerName").getAttribute("value");
	}
	//搜商户_搜索
	public void clickSearchMer_Search() {
		du.what("SearchMer_Search").click();
	}
	//搜商户_单选框
	public void clickSearchMer_Radio(String index) {
		du.what("SearchMer_Radio",index).click();
	}
	public boolean isSearchMer_RadioDisplayed(String index) {
		du.waitFor(500);
		return du.what("SearchMer_Radio",index).isDisplayed();
	}
	//搜商户_提交
	public void clickSearchMer_Submit() {
		du.what("SearchMer_Submit").click();
	}
	//搜商户_关闭
	public void clickSearchMer_Close() {
		du.what("SearchMer_Close").click();
	}
	//冻结_确认
	public void clickFrozen_Confirm() {
		du.what("Frozen_Confirm").click();
	}
	//冻结_关闭
	public void clickFrozen_Close() {
		du.what("Frozen_Close").click();
	}
	//解冻_确认
	public void clickUnfrozen_Confirm() {
		du.what("Unfrozen_Confirm").click();
	}
	//解冻_关闭
	public void clickUnfrozen_Close() {
		du.what("Unfrozen_Close").click();
	}

}