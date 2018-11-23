package com.dy.AutoTest.OperationPlatform.PageObject.MerchantManagementOnLine.OnLineMerchantInfo;


import org.openqa.selenium.WebDriver;

import com.dy.AutoTest.web.api.SuperPage;
import com.dy.AutoTest.web.actions.DoPlus;

public class MainChildMerRelationshipPage extends SuperPage{
	public MainChildMerRelationshipPage(WebDriver driver) {
		super(driver);
		du.loadLocator("POP_Loc_MainChildMerRelationship");
	}
	public void setWaitTime(long waitTime) {
		du=new DoPlus(driver);
		du.waitTime=waitTime;
		du.loadLocator("POP_Loc_MainChildMerRelationship");
	}

/***************************Manual Coding**********************************/


/****************************Auto Generate******************************/

	//主商户号
	public void setMainMerNum(String value) {
		du.what("MainMerNum").clear();
		du.what("MainMerNum").sendKeys(value);
	}
	public String getMainMerNum() {
		return du.what("MainMerNum").getAttribute("value");
	}
	//搜主商户号
	public void clickSearchMainMer() {
		du.what("SearchMainMer").click();
	}
	//子商户号
	public void setChildMerNum(String value) {
		du.what("ChildMerNum").clear();
		du.what("ChildMerNum").sendKeys(value);
	}
	public String getChildMerNum() {
		return du.what("ChildMerNum").getAttribute("value");
	}
	//搜子商户号
	public void clickSearchChildMer() {
		du.what("SearchChildMer").click();
	}
	//查询
	public void clickQuery() {
		du.what("Query").click();
	}
	//重置
	public void clickReset() {
		du.what("Reset").click();
	}
	//主子商户录入
	public void clickMainChildMerAdd() {
		du.what("MainChildMerAdd").click();
	}
	//修改
	public void clickUpdate() {
		du.what("Update").click();
	}
	//查看
	public void clickCheck() {
		du.what("Check").click();
	}
	//删除
	public void clickDelete() {
		du.what("Delete").click();
	}
	//单选框
	public void clickRadio(String radio) {
		du.what("Radio",radio).click();
	}
	public boolean isRadioDisplayed(String radio) {
		du.waitFor(500);
		return du.what("Radio",radio).isDisplayed();
	}
	//搜主商户_商户号
	public void setSearchMainMer_MerNum(String value) {
		du.what("SearchMainMer_MerNum").clear();
		du.what("SearchMainMer_MerNum").sendKeys(value);
	}
	public String getSearchMainMer_MerNum() {
		return du.what("SearchMainMer_MerNum").getAttribute("value");
	}
	//搜主商户_商户名
	public void setSearchMainMer_MerName(String value) {
		du.what("SearchMainMer_MerName").clear();
		du.what("SearchMainMer_MerName").sendKeys(value);
	}
	public String getSearchMainMer_MerName() {
		return du.what("SearchMainMer_MerName").getAttribute("value");
	}
	//搜主商户_搜索
	public void clickSearchMainMer_Search() {
		du.what("SearchMainMer_Search").click();
	}
	//搜主商户_单选框
	public void clickSearchMainMer_Radio(String radio) {
		du.what("SearchMainMer_Radio",radio).click();
	}
	public boolean isSearchMainMer_RadioDisplayed(String radio) {
		du.waitFor(500);
		return du.what("SearchMainMer_Radio",radio).isDisplayed();
	}
	//搜主商户_提交
	public void clickSearchMainMer_Submit() {
		du.what("SearchMainMer_Submit").click();
	}
	//搜主商户_关闭
	public void clickSearchMainMer_Close() {
		du.what("SearchMainMer_Close").click();
	}
	//搜子商户_商户号
	public void setSearchChildMer_MerNum(String value) {
		du.what("SearchChildMer_MerNum").clear();
		du.what("SearchChildMer_MerNum").sendKeys(value);
	}
	public String getSearchChildMer_MerNum() {
		return du.what("SearchChildMer_MerNum").getAttribute("value");
	}
	//搜子商户_商户名
	public void setSearchChildMer_MerName(String value) {
		du.what("SearchChildMer_MerName").clear();
		du.what("SearchChildMer_MerName").sendKeys(value);
	}
	public String getSearchChildMer_MerName() {
		return du.what("SearchChildMer_MerName").getAttribute("value");
	}
	//搜子商户_搜索
	public void clickSearchChildMer_Search() {
		du.what("SearchChildMer_Search").click();
	}
	//搜子商户_单选框
	public void clickSearchChildMer_Radio(String radio) {
		du.what("SearchChildMer_Radio",radio).click();
	}
	public boolean isSearchChildMer_RadioDisplayed(String radio) {
		du.waitFor(500);
		return du.what("SearchChildMer_Radio",radio).isDisplayed();
	}
	//搜子商户_提交
	public void clickSearchChildMer_Submit() {
		du.what("SearchChildMer_Submit").click();
	}
	//搜子商户_关闭
	public void clickSearchChildMer_Close() {
		du.what("SearchChildMer_Close").click();
	}
	//主子商户录入_搜主商户
	public void clickMainChildMerAdd_SearchMainMer() {
		du.what("MainChildMerAdd_SearchMainMer").click();
	}
	//主子商户录入_搜子商户
	public void clickMainChildMerAdd_SearchChildMer() {
		du.what("MainChildMerAdd_SearchChildMer").click();
	}
	//主子商户录入_生效标识
	/**
	 * @param value
	 * 
	 * 	value="C" : 生效
		value="D" : 未生效
	 */
	public void selectMainChildMerAdd_Status(String value) {
		du.whatSelect("MainChildMerAdd_Status").selectByValue(value);
	}
	//主子商户录入_确认
	public void clickMainChildMerAdd_Confirm() {
		du.what("MainChildMerAdd_Confirm").click();
	}
	//主子商户录入_关闭
	public void clickMainChildMerAdd_Close() {
		du.what("MainChildMerAdd_Close").click();
	}
	//修改_生效标识
	/**
	 * @param value
	 * 
	 * 	value="C" : 生效
		value="D" : 未生效
	 */
	public void selectUpdate_Status(String value) {
		du.whatSelect("Update_Status").selectByValue(value);
	}
	//修改_确认
	public void clickUpdate_Confirm() {
		du.what("Update_Confirm").click();
	}
	//修改_关闭
	public void clickUpdate_Close() {
		du.what("Update_Close").click();
	}
	//查看_关闭
	public void clickCheck_Close() {
		du.what("Check_Close").click();
	}
	//删除_确认
	public void clickDelete_Confirm() {
		du.what("Delete_Confirm").click();
	}
	//删除_取消
	public void clickDelete_Cancel() {
		du.what("Delete_Cancel").click();
	}
	//主子商户录入_主商户号
	public void setAdd_MainMerNum(String value) {
		du.what("Add_MainMerNum").clear();
		du.what("Add_MainMerNum").sendKeys(value);
	}
	public String getAdd_MainMerNum() {
		return du.what("Add_MainMerNum").getAttribute("value");
	}
	//主子商户录入_子商户号
	public void setAdd_ChildMerNum(String value) {
		du.what("Add_ChildMerNum").clear();
		du.what("Add_ChildMerNum").sendKeys(value);
	}
	public String getAdd_ChildMerNum() {
		return du.what("Add_ChildMerNum").getAttribute("value");
	}

}