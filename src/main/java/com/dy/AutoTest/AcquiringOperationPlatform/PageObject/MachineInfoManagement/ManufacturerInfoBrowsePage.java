package com.dy.AutoTest.AcquiringOperationPlatform.PageObject.MachineInfoManagement;

import org.openqa.selenium.WebDriver;

import com.dy.AutoTest.web.api.IQuery;
import com.dy.AutoTest.web.api.SuperPage;
import com.dy.AutoTest.web.actions.DoPlus;

public class ManufacturerInfoBrowsePage extends SuperPage implements IQuery{
	public ManufacturerInfoBrowsePage(WebDriver driver) {
		super(driver);
		du.loadLocator("AOP_Loc_MachineInfoManagement_ManufacturerInfoBrowse");
	}
	public void setWaitTime(long waitTime) {
		du=new DoPlus(driver);
		du.waitTime=waitTime;
		du.loadLocator("AOP_Loc_MachineInfoManagement_ManufacturerInfoBrowse");
	}

/***************************Manual Coding**********************************/


/****************************Auto Generate******************************/

	//厂商编号
	public void setManufacturerNO(String value) {
		du.what("ManufacturerNO").clear();
		du.what("ManufacturerNO").sendKeys(value);
	}
	public String getManufacturerNO() {
		return du.what("ManufacturerNO").getAttribute("value");
	}
	//厂商名称
	public void setManufacturerName(String value) {
		du.what("ManufacturerName").clear();
		du.what("ManufacturerName").sendKeys(value);
	}
	public String getManufacturerName() {
		return du.what("ManufacturerName").getAttribute("value");
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
	//查看
	public void clickCheck() {
		du.what("Check").click();
	}
	//删除
	public void clickDelete() {
		du.what("Delete").click();
	}
	//厂商列表单选按钮
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
	//添加_厂商编号
	public void setAdd_ManufacturerNO(String value) {
		du.what("Add_ManufacturerNO").clear();
		du.what("Add_ManufacturerNO").sendKeys(value);
	}
	public String getAdd_ManufacturerNO() {
		return du.what("Add_ManufacturerNO").getAttribute("value");
	}
	//添加_厂商名称
	public void setAdd_ManufacturerName(String value) {
		du.what("Add_ManufacturerName").clear();
		du.what("Add_ManufacturerName").sendKeys(value);
	}
	public String getAdd_ManufacturerName() {
		return du.what("Add_ManufacturerName").getAttribute("value");
	}
	//添加_厂商地址
	public void setAdd_ManufacturerAddress(String value) {
		du.what("Add_ManufacturerAddress").clear();
		du.what("Add_ManufacturerAddress").sendKeys(value);
	}
	public String getAdd_ManufacturerAddress() {
		return du.what("Add_ManufacturerAddress").getAttribute("value");
	}
	//添加_邮政编码
	public void setAdd_PostalCode(String value) {
		du.what("Add_PostalCode").clear();
		du.what("Add_PostalCode").sendKeys(value);
	}
	public String getAdd_PostalCode() {
		return du.what("Add_PostalCode").getAttribute("value");
	}
	//添加_联系人
	public void setAdd_ContactPerson(String value) {
		du.what("Add_ContactPerson").clear();
		du.what("Add_ContactPerson").sendKeys(value);
	}
	public String getAdd_ContactPerson() {
		return du.what("Add_ContactPerson").getAttribute("value");
	}
	//添加_联系电话
	public void setAdd_ContactNumber(String value) {
		du.what("Add_ContactNumber").clear();
		du.what("Add_ContactNumber").sendKeys(value);
	}
	public String getAdd_ContactNumber() {
		return du.what("Add_ContactNumber").getAttribute("value");
	}
	//添加_售后电话
	public void setAdd_SaleServiceHotline(String value) {
		du.what("Add_SaleServiceHotline").clear();
		du.what("Add_SaleServiceHotline").sendKeys(value);
	}
	public String getAdd_SaleServiceHotline() {
		return du.what("Add_SaleServiceHotline").getAttribute("value");
	}
	//添加_公司性质
	public void selectAdd_CompanyNature(String value) {
		du.whatSelect("Add_CompanyNature").selectByValue(value);
	}
	//添加_公司规模
	public void selectAdd_CompanyScale(String value) {
		du.whatSelect("Add_CompanyScale").selectByValue(value);
	}
	//添加_公司网址
	public void setAdd_CompanyURL(String value) {
		du.what("Add_CompanyURL").clear();
		du.what("Add_CompanyURL").sendKeys(value);
	}
	public String getAdd_CompanyURL() {
		return du.what("Add_CompanyURL").getAttribute("value");
	}
	//添加_公司邮件
	public void setAdd_CompanyMail(String value) {
		du.what("Add_CompanyMail").clear();
		du.what("Add_CompanyMail").sendKeys(value);
	}
	public String getAdd_CompanyMail() {
		return du.what("Add_CompanyMail").getAttribute("value");
	}
	//添加_注释信息
	public void setAdd_TipsInfo(String value) {
		du.what("Add_TipsInfo").clear();
		du.what("Add_TipsInfo").sendKeys(value);
	}
	public String getAdd_TipsInfo() {
		return du.what("Add_TipsInfo").getAttribute("value");
	}
	//添加_提交
	public void clickAdd_Submit() {
		du.what("Add_Submit").click();
	}
	//添加_关闭
	public void clickAdd_Close() {
		du.what("Add_Close").click();
	}
	//修改_厂商地址
	public void setUpdate_ManufacturerAddress(String value) {
		du.what("Update_ManufacturerAddress").clear();
		du.what("Update_ManufacturerAddress").sendKeys(value);
	}
	public String getUpdate_ManufacturerAddress() {
		return du.what("Update_ManufacturerAddress").getAttribute("value");
	}
	//修改_邮政编码
	public void setUpdate_PostalCode(String value) {
		du.what("Update_PostalCode").clear();
		du.what("Update_PostalCode").sendKeys(value);
	}
	public String getUpdate_PostalCode() {
		return du.what("Update_PostalCode").getAttribute("value");
	}
	//修改_联系人
	public void setUpdate_ContactPerson(String value) {
		du.what("Update_ContactPerson").clear();
		du.what("Update_ContactPerson").sendKeys(value);
	}
	public String getUpdate_ContactPerson() {
		return du.what("Update_ContactPerson").getAttribute("value");
	}
	//修改_联系电话
	public void setUpdate_ContactNumber(String value) {
		du.what("Update_ContactNumber").clear();
		du.what("Update_ContactNumber").sendKeys(value);
	}
	public String getUpdate_ContactNumber() {
		return du.what("Update_ContactNumber").getAttribute("value");
	}
	//修改_售后电话
	public void setUpdate_SaleServiceHotline(String value) {
		du.what("Update_SaleServiceHotline").clear();
		du.what("Update_SaleServiceHotline").sendKeys(value);
	}
	public String getUpdate_SaleServiceHotline() {
		return du.what("Update_SaleServiceHotline").getAttribute("value");
	}
	//修改_公司性质
	public void selectUpdate_CompanyNature(String value) {
		du.whatSelect("Update_CompanyNature").selectByValue(value);
	}
	//修改_公司规模
	public void selectUpdate_CompanyScale(String value) {
		du.whatSelect("Update_CompanyScale").selectByValue(value);
	}
	//修改_公司网址
	public void setUpdate_CompanyURL(String value) {
		du.what("Update_CompanyURL").clear();
		du.what("Update_CompanyURL").sendKeys(value);
	}
	public String getUpdate_CompanyURL() {
		return du.what("Update_CompanyURL").getAttribute("value");
	}
	//修改_公司邮件
	public void setUpdate_CompanyMail(String value) {
		du.what("Update_CompanyMail").clear();
		du.what("Update_CompanyMail").sendKeys(value);
	}
	public String getUpdate_CompanyMail() {
		return du.what("Update_CompanyMail").getAttribute("value");
	}
	//修改_注释信息
	public void setUpdate_TipsInfo(String value) {
		du.what("Update_TipsInfo").clear();
		du.what("Update_TipsInfo").sendKeys(value);
	}
	public String getUpdate_TipsInfo() {
		return du.what("Update_TipsInfo").getAttribute("value");
	}
	//修改_提交
	public void clickUpdate_Submit() {
		du.what("Update_Submit").click();
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
	//删除_关闭
	public void clickDelete_Close() {
		du.what("Delete_Close").click();
	}

}