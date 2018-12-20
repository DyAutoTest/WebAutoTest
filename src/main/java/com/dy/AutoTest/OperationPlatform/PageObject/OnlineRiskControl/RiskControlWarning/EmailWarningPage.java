package com.dy.AutoTest.OperationPlatform.PageObject.OnlineRiskControl.RiskControlWarning;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.dy.AutoTest.web.api.SuperPage;
import com.dy.AutoTest.web.actions.DoPlus;

public class EmailWarningPage extends SuperPage{
	public EmailWarningPage(WebDriver driver) {
		super(driver);
		du.loadLocator("POP_Loc_RiskControlWarning_EmailWarning");
	}
	public void setWaitTime(long waitTime) {
		du=new DoPlus(driver);
		du.waitTime=waitTime;
		du.loadLocator("POP_Loc_RiskControlWarning_EmailWarning");
	}

/***************************Manual Coding**********************************/


/****************************Auto Generate******************************/

	//预警人姓名
	public void setWarningName(String value) {
		du.what("WarningName").clear();
		du.what("WarningName").sendKeys(value);
	}
	public String getWarningName() {
		return du.what("WarningName").getAttribute("value");
	}
	//邮箱地址
	public void setEmailAddress(String value) {
		du.what("EmailAddress").clear();
		du.what("EmailAddress").sendKeys(value);
	}
	public String getEmailAddress() {
		return du.what("EmailAddress").getAttribute("value");
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
	//启用
	public void clickEnable() {
		du.what("Enable").click();
	}
	//解除
	public void clickRemove() {
		du.what("Remove").click();
	}
	//预警列表单选按钮
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
	//添加_预警人姓名
	public void setAdd_WarningName(String value) {
		du.what("Add_WarningName").clear();
		du.what("Add_WarningName").sendKeys(value);
	}
	public String getAdd_WarningName() {
		return du.what("Add_WarningName").getAttribute("value");
	}
	//添加_邮箱地址
	public void setAdd_EmailAddress(String value) {
		du.what("Add_EmailAddress").clear();
		du.what("Add_EmailAddress").sendKeys(value);
	}
	public String getAdd_EmailAddress() {
		return du.what("Add_EmailAddress").getAttribute("value");
	}
	//添加_提交
	public void clickAdd_Submit() {
		du.what("Add_Submit").click();
	}
	//添加_关闭
	public void clickAdd_Close() {
		du.what("Add_Close").click();
	}
	//修改_预警人姓名
	public void setUpdate_WarningName(String value) {
		du.what("Update_WarningName").clear();
		du.what("Update_WarningName").sendKeys(value);
	}
	public String getUpdate_WarningName() {
		return du.what("Update_WarningName").getAttribute("value");
	}
	//修改_邮箱地址
	public void setUpdate_EmailAddress(String value) {
		du.what("Update_EmailAddress").clear();
		du.what("Update_EmailAddress").sendKeys(value);
	}
	public String getUpdate_EmailAddress() {
		return du.what("Update_EmailAddress").getAttribute("value");
	}
	//修改_提交
	public void clickUpdate_Submit() {
		du.what("Update_Submit").click();
	}
	//修改_关闭
	public void clickUpdate_Close() {
		du.what("Update_Close").click();
	}
	//启用_确认
	public void clickEnable_Confirm() {
		du.what("Enable_Confirm").click();
	}
	//启用_关闭
	public void clickEnable_Close() {
		du.what("Enable_Close").click();
	}
	//解除_确认
	public void clickRemove_Confirm() {
		du.what("Remove_Confirm").click();
	}
	//解除_关闭
	public void clickRemove_Close() {
		du.what("Remove_Close").click();
	}

}