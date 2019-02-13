package com.dy.AutoTest.AcquiringOperationPlatform.PageObject.TerminalRightManagement;

import org.openqa.selenium.WebDriver;

import com.dy.AutoTest.web.api.IQuery;
import com.dy.AutoTest.web.api.SuperPage;
import com.dy.AutoTest.web.actions.DoPlus;

public class TerminalRightManagementPage extends SuperPage implements IQuery{
	public TerminalRightManagementPage(WebDriver driver) {
		super(driver);
		du.loadLocator("AOP_Loc_TerminalRightManagement_TerminalRightManagement");
	}
	public void setWaitTime(long waitTime) {
		du=new DoPlus(driver);
		du.waitTime=waitTime;
		du.loadLocator("AOP_Loc_TerminalRightManagement_TerminalRightManagement");
	}

/***************************Manual Coding**********************************/


/****************************Auto Generate******************************/

	//商户号
	public void setMerchantNO(String value) {
		du.what("MerchantNO").clear();
		du.what("MerchantNO").sendKeys(value);
	}
	public String getMerchantNO() {
		return du.what("MerchantNO").getAttribute("value");
	}
	//搜商户
	public void clickSearchMerchant() {
		du.what("SearchMerchant").click();
	}
	//终端号
	public void setTerminalNO(String value) {
		du.what("TerminalNO").clear();
		du.what("TerminalNO").sendKeys(value);
	}
	public String getTerminalNO() {
		return du.what("TerminalNO").getAttribute("value");
	}
	//查询
	public void clickQuery() {
		du.what("Query").click();
	}
	//重置
	public void clickReset() {
		du.what("Reset").click();
	}
	//修改
	public void clickUpdate() {
		du.what("Update").click();
	}
	//添加
	public void clickAdd() {
		du.what("Add").click();
	}
	//删除
	public void clickDelete() {
		du.what("Delete").click();
	}
	//查看权限
	public void clickCheckRight() {
		du.what("CheckRight").click();
	}
	//终端列表单选按钮
	public void clickTerminalRadio(String radio) {
		du.what("TerminalRadio",radio).click();
	}
	public boolean isTerminalRadioExist(String radio) {
		du.waitFor(500);
		return du.isElementExist("TerminalRadio",radio);
	}
	public boolean isTerminalRadioDisplayed(String radio) {
		du.waitFor(500);
		return du.what("TerminalRadio",radio).isDisplayed();
	}
	//搜商户_商户编号
	public void setSearchMerchant_MerchantNO(String value) {
		du.what("SearchMerchant_MerchantNO").clear();
		du.what("SearchMerchant_MerchantNO").sendKeys(value);
	}
	public String getSearchMerchant_MerchantNO() {
		return du.what("SearchMerchant_MerchantNO").getAttribute("value");
	}
	//搜商户_商户名称
	public void setSearchMerchant_MerchantName(String value) {
		du.what("SearchMerchant_MerchantName").clear();
		du.what("SearchMerchant_MerchantName").sendKeys(value);
	}
	public String getSearchMerchant_MerchantName() {
		return du.what("SearchMerchant_MerchantName").getAttribute("value");
	}
	//搜商户_确认
	public void clickSearchMerchant_Confirm() {
		du.what("SearchMerchant_Confirm").click();
	}
	//搜商户_商户列表单选按钮
	public void clickSearchMerchant_MerchantRadio(String radio) {
		du.what("SearchMerchant_MerchantRadio",radio).click();
	}
	public boolean isSearchMerchant_MerchantRadioExist(String radio) {
		du.waitFor(500);
		return du.isElementExist("SearchMerchant_MerchantRadio",radio);
	}
	public boolean isSearchMerchant_MerchantRadioDisplayed(String radio) {
		du.waitFor(500);
		return du.what("SearchMerchant_MerchantRadio",radio).isDisplayed();
	}
	//搜商户_提交
	public void clickSearchMerchant_Submit() {
		du.what("SearchMerchant_Submit").click();
	}
	//搜商户_关闭
	public void clickSearchMerchant_Close() {
		du.what("SearchMerchant_Close").click();
	}
	//修改_角色列表单选按钮
	public void clickUpdate_CharacterRadio(String radio) {
		du.what("Update_CharacterRadio",radio).click();
	}
	public boolean isUpdate_CharacterRadioExist(String radio) {
		du.waitFor(500);
		return du.isElementExist("Update_CharacterRadio",radio);
	}
	public boolean isUpdate_CharacterRadioDisplayed(String radio) {
		du.waitFor(500);
		return du.what("Update_CharacterRadio",radio).isDisplayed();
	}
	//修改_保存
	public void clickUpdate_Save() {
		du.what("Update_Save").click();
	}
	//修改_关闭
	public void clickUpdate_Close() {
		du.what("Update_Close").click();
	}
	//添加_终端号
	public void setAdd_TerminalNO(String value) {
		du.what("Add_TerminalNO").clear();
		du.what("Add_TerminalNO").sendKeys(value);
	}
	public String getAdd_TerminalNO() {
		return du.what("Add_TerminalNO").getAttribute("value");
	}
	//添加_角色ID
	public void setAdd_CharacterID(String value) {
		du.what("Add_CharacterID").clear();
		du.what("Add_CharacterID").sendKeys(value);
	}
	public String getAdd_CharacterID() {
		return du.what("Add_CharacterID").getAttribute("value");
	}
	//添加_角色列表单选按钮
	public void clickAdd_CharacterRadio(String radio) {
		du.what("Add_CharacterRadio",radio).click();
	}
	public boolean isAdd_CharacterRadioExist(String radio) {
		du.waitFor(500);
		return du.isElementExist("Add_CharacterRadio",radio);
	}
	public boolean isAdd_CharacterRadioDisplayed(String radio) {
		du.waitFor(500);
		return du.what("Add_CharacterRadio",radio).isDisplayed();
	}
	//添加_保存
	public void clickAdd_Save() {
		du.what("Add_Save").click();
	}
	//添加_关闭
	public void clickAdd_Close() {
		du.what("Add_Close").click();
	}
	//删除_确定
	public void clickDelete_Confirm() {
		du.what("Delete_Confirm").click();
	}
	//删除_关闭
	public void clickDelete_Close() {
		du.what("Delete_Close").click();
	}
	//查看权限_关闭
	public void clickCheckRight_Close() {
		du.what("CheckRight_Close").click();
	}

}