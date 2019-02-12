package com.dy.AutoTest.AcquiringOperationPlatform.PageObject.MerchantInfoManagement;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.dy.AutoTest.web.api.IQuery;
import com.dy.AutoTest.web.api.ISearchMerchant;
import com.dy.AutoTest.web.api.ISearchMerchant_Add;
import com.dy.AutoTest.web.api.SuperPage;
import com.dy.AutoTest.web.actions.DoPlus;

public class MerchantStoreManagementPage extends SuperPage implements IQuery,ISearchMerchant,ISearchMerchant_Add{
	public MerchantStoreManagementPage(WebDriver driver) {
		super(driver);
		du.loadLocator("AOP_Loc_MerchantInfoManagement_MerchantStoreManagement");
	}
	public void setWaitTime(long waitTime) {
		du=new DoPlus(driver);
		du.waitTime=waitTime;
		du.loadLocator("AOP_Loc_MerchantInfoManagement_MerchantStoreManagement");
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
	public void clickSearchMer() {
		du.what("SearchMer").click();
	}
	//门店名称
	public void setStoreName(String value) {
		du.what("StoreName").clear();
		du.what("StoreName").sendKeys(value);
	}
	public String getStoreName() {
		return du.what("StoreName").getAttribute("value");
	}
	//查询
	public void clickQuery() {
		du.what("Query").click();
	}
	//重置
	public void clickReset() {
		du.what("Reset").click();
	}
	//添加
	public void clickAdd() {
		du.what("Add").click();
	}
	//修改
	public void clickUpdate() {
		du.what("Update").click();
	}
	//删除
	public void clickDelete() {
		du.what("Delete").click();
	}
	//商户列表单选按钮
	public void clickRadio(String radio) {
		du.what("Radio",radio).click();
	}
	public boolean isRadioExist(String radio) {
		du.waitFor(500);
		return du.isElementExist("Radio",radio);
	}
	public boolean isRadioDisplayed(String radio) {
		du.waitFor(500);
		return du.what("Radio",radio).isDisplayed();
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
	public void setSearchMer_MerName(String value) {
		du.what("SearchMer_MerName").clear();
		du.what("SearchMer_MerName").sendKeys(value);
	}
	public String getSearchMer_MerName() {
		return du.what("SearchMer_MerName").getAttribute("value");
	}
	//搜商户_确认
	public void clickSearchMer_Search() {
		du.what("SearchMer_Search").click();
	}
	//搜商户_商户列表单选按钮
	public void clickSearchMer_Radio(String radio) {
		du.what("SearchMer_Radio",radio).click();
	}
	public boolean isSearchMer_RadioExist(String radio) {
		du.waitFor(500);
		return du.isElementExist("SearchMer_Radio",radio);
	}
	public boolean isSearchMer_RadioDisplayed(String radio) {
		du.waitFor(500);
		return du.what("SearchMer_Radio",radio).isDisplayed();
	}
	//搜商户_提交
	public void clickSearchMer_Submit() {
		du.what("SearchMer_Submit").click();
	}
	//搜商户_关闭
	public void clickSearchMer_Close() {
		du.what("SearchMer_Close").click();
	}
	//添加_搜商户
	public void clickAdd_SearchMer() {
		du.what("Add_SearchMer").click();
	}
	//添加_搜商户_商户编号
	public void setAdd_SearchMer_MerNO(String value) {
		du.what("Add_SearchMer_MerNO").clear();
		du.what("Add_SearchMer_MerNO").sendKeys(value);
	}
	public String getAdd_SearchMer_MerNO() {
		return du.what("Add_SearchMer_MerNO").getAttribute("value");
	}
	//添加_搜商户_商户名称
	public void setAdd_SearchMer_MerName(String value) {
		du.what("Add_SearchMer_MerName").clear();
		du.what("Add_SearchMer_MerName").sendKeys(value);
	}
	public String getAdd_SearchMer_MerName() {
		return du.what("Add_SearchMer_MerName").getAttribute("value");
	}
	//添加_搜商户_确认
	public void clickAdd_SearchMer_Search() {
		du.what("Add_SearchMer_Search").click();
	}
	//添加_搜商户_商户列表单选按钮
	public void clickAdd_SearchMer_Radio(String radio) {
		du.what("Add_SearchMer_Radio",radio).click();
	}
	public boolean isAdd_SearchMer_RadioExist(String radio) {
		du.waitFor(500);
		return du.isElementExist("Add_SearchMer_Radio",radio);
	}
	public boolean isAdd_SearchMer_RadioDisplayed(String radio) {
		du.waitFor(500);
		return du.what("Add_SearchMer_Radio",radio).isDisplayed();
	}
	//添加_搜商户_提交
	public void clickAdd_SearchMer_Submit() {
		du.what("Add_SearchMer_Submit").click();
	}
	//添加_搜商户_关闭
	public void clickAdd_SearchMer_Close() {
		du.what("Add_SearchMer_Close").click();
	}
	//添加_门店名称
	public void setAdd_StoreName(String value) {
		du.what("Add_StoreName").clear();
		du.what("Add_StoreName").sendKeys(value);
	}
	public String getAdd_StoreName() {
		return du.what("Add_StoreName").getAttribute("value");
	}
	//添加_门店地址
	public void setAdd_StoreAddress(String value) {
		du.what("Add_StoreAddress").clear();
		du.what("Add_StoreAddress").sendKeys(value);
	}
	public String getAdd_StoreAddress() {
		return du.what("Add_StoreAddress").getAttribute("value");
	}
	//添加_提交
	public void clickAdd_Submit() {
		du.what("Add_Submit").click();
	}
	//添加_关闭
	public void clickAdd_Close() {
		du.what("Add_Close").click();
	}
	//修改_门店名称
	public void setUpdate_StoreName(String value) {
		du.what("Update_StoreName").clear();
		du.what("Update_StoreName").sendKeys(value);
	}
	public String getUpdate_StoreName() {
		return du.what("Update_StoreName").getAttribute("value");
	}
	//修改_门店地址
	public void setUpdate_StoreAddress(String value) {
		du.what("Update_StoreAddress").clear();
		du.what("Update_StoreAddress").sendKeys(value);
	}
	public String getUpdate_StoreAddress() {
		return du.what("Update_StoreAddress").getAttribute("value");
	}
	//修改_提交
	public void clickUpdate_Submit() {
		du.what("Update_Submit").click();
	}
	//修改_关闭
	public void clickUpdate_Close() {
		du.what("Update_Close").click();
	}
	//删除_确认
	public void clickDelete_Confirm() {
		du.what("Delete_Confirm").click();
	}
	//删除_关闭
	public void clickDelete_Close() {
		du.what("Delete_Close").click();
	}

}