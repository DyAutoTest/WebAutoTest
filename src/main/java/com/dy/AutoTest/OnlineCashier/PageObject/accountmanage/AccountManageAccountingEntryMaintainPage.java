package com.dy.AutoTest.OnlineCashier.PageObject.accountmanage;

import org.openqa.selenium.WebDriver;

import com.dy.AutoTest.web.api.SuperPage;
import com.dy.AutoTest.web.actions.DoPlus;

public class AccountManageAccountingEntryMaintainPage extends SuperPage {
	public AccountManageAccountingEntryMaintainPage(WebDriver driver) {
		super(driver);
		du.loadLocator("POP_Loc_AccountManageAccountingEntryMaintain");
	}
	public void setWaitTime(long waitTime) {
		du=new DoPlus(driver);
		du.waitTime=waitTime;
		du.loadLocator("POP_Loc_AccountManageAccountingEntryMaintain");
	}

/***************************Manual Coding**********************************/


/****************************Auto Generate******************************/

	//产品码
	public void selectProductsCode(String value) {
		du.whatSelect("ProductsCode").selectByValue(value);
	}
	//交易类型
	public void selectTradeType(String value) {
		du.whatSelect("TradeType").selectByValue(value);
	}
	//状态
	public void selectStatus(String value) {
		du.whatSelect("Status").selectByValue(value);
	}
	//查询
	public void clickQuery() {
		du.what("Query").click();
	}
	//重置
	public void clickReset() {
		du.what("Reset").click();
	}
	//增加
	public void clickAdd() {
		du.what("Add").click();
	}
	//查看
	public void clickCheck() {
		du.what("Check").click();
	}
	//分录列表的单选框
	public void clickEntryRadio(String radio) {
		du.what("EntryRadio",radio).click();
	}
	public boolean isEntryRadioDisplayed(String radio) {
		du.waitFor(500);
		return du.what("EntryRadio",radio).isDisplayed();
	}
	//增加_归属机构
	public void selectAdd_OwnershipInstitution(String value) {
		du.whatSelect("Add_OwnershipInstitution").selectByValue(value);
	}
	//增加_产品码
	public void selectAdd_ProductCode(String value) {
		du.whatSelect("Add_ProductCode").selectByValue(value);
	}
	//增加_交易类型
	public void selectAdd_TradeType(String value) {
		du.whatSelect("Add_TradeType").selectByValue(value);
	}
	//增加_业务子类型
	public void selectAdd_BusinessSubtype(String value) {
		du.whatSelect("Add_BusinessSubtype").selectByValue(value);
	}
	//增加_账户种类
	public void selectAdd_AccountType(String value) {
		du.whatSelect("Add_AccountType").selectByValue(value);
	}
	//增加_借贷标志
	public void selectAdd_BorrowingMarks(String value) {
		du.whatSelect("Add_BorrowingMarks").selectByValue(value);
	}
	//增加_特征码
	public void setAdd_FeatureCode(String value) {
		du.what("Add_FeatureCode").clear();
		du.what("Add_FeatureCode").sendKeys(value);
	}
	public String getAdd_FeatureCode() {
		return du.what("Add_FeatureCode").getAttribute("value");
	}
	//增加_展示全部
	public void clickAdd_ShowAll() {
		du.what("Add_ShowAll").click();
	}
	//增加_添加一条
	public void clickAdd_AddOne() {
		du.what("Add_AddOne").click();
	}
	//增加_删除一条
	public void clickAdd_DeleteOne() {
		du.what("Add_DeleteOne").click();
	}
	//增加_提交
	public void clickAdd_Submit() {
		du.what("Add_Submit").click();
	}
	//增加_关闭
	public void clickAdd_Close() {
		du.what("Add_Close").click();
	}
	//查看_分录列表的单选框
	public void clickCheck_EntryRadio(String radio) {
		du.what("Check_EntryRadio",radio).click();
	}
	public boolean isCheck_EntryRadioDisplayed(String radio) {
		du.waitFor(500);
		return du.what("Check_EntryRadio",radio).isDisplayed();
	}
	//查看_关闭
	public void clickCheck_Close() {
		du.what("Check_Close").click();
	}
	//增加_账户种类
	public void selectAdd_AccountType2(String value) {
		du.whatSelect("Add_AccountType2").selectByValue(value);
	}
	//增加_借贷标志
	public void selectAdd_BorrowingMarks2(String value) {
		du.whatSelect("Add_BorrowingMarks2").selectByValue(value);
	}
	//增加_特征码
	public void setAdd_FeatureCode2(String value) {
		du.what("Add_FeatureCode2").clear();
		du.what("Add_FeatureCode2").sendKeys(value);
	}
	public String getAdd_FeatureCode2() {
		return du.what("Add_FeatureCode2").getAttribute("value");
	}

}