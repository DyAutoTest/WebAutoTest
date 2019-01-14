package com.dy.AutoTest.MerchantPortal.PageObject.merchantmanage;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.dy.AutoTest.web.api.SuperPage;
import com.dy.AutoTest.web.actions.DoPlus;

public class MMOperManagementPage extends SuperPage {
	public MMOperManagementPage(WebDriver driver) {
		super(driver);
		du.loadLocator("MP_Loc_MMOperManagement");
	}
	public void setWaitTime(long waitTime) {
		du=new DoPlus(driver);
		du.waitTime=waitTime;
		du.loadLocator("MP_Loc_MMOperManagement");
	}

/***************************Manual Coding**********************************/


/****************************Auto Generate******************************/

	//顶部_操作员管理
	public void clickTop_OperManagement() {
		du.what("Top_OperManagement").click();
	}
	//操作员管理
	public void clickOperManagement() {
		du.what("OperManagement").click();
	}
	//操作员日志
	public void clickOperLog() {
		du.what("OperLog").click();
	}
	//操作员管理_登录名
	public void setOperManagement_LoginName(String value) {
		du.what("OperManagement_LoginName").clear();
		du.what("OperManagement_LoginName").sendKeys(value);
	}
	public String getOperManagement_LoginName() {
		return du.what("OperManagement_LoginName").getAttribute("value");
	}
	//操作员管理_操作员姓名
	public void setOperManagement_OperName(String value) {
		du.what("OperManagement_OperName").clear();
		du.what("OperManagement_OperName").sendKeys(value);
	}
	public String getOperManagement_OperName() {
		return du.what("OperManagement_OperName").getAttribute("value");
	}
	//操作员管理_手机号码
	public void setOperManagement_PhoneNO(String value) {
		du.what("OperManagement_PhoneNO").clear();
		du.what("OperManagement_PhoneNO").sendKeys(value);
	}
	public String getOperManagement_PhoneNO() {
		return du.what("OperManagement_PhoneNO").getAttribute("value");
	}
	//操作员管理_操作员类型
	public void selectOperManagement_OperType(String value) {
		du.whatSelect("OperManagement_OperType").selectByValue(value);
	}
	//操作员管理_状态
	public void selectOperManagement_Status(String value) {
		du.whatSelect("OperManagement_Status").selectByValue(value);
	}
	//操作员管理_查询
	public void clickOperManagement_Query() {
		du.what("OperManagement_Query").click();
	}
	//操作员管理_重置
	public void clickOperManagement_Reset() {
		du.what("OperManagement_Reset").click();
	}
	//操作员管理_管理员信息修改
	public void clickOperManagement_AdminInfoUpdate() {
		du.what("OperManagement_AdminInfoUpdate").click();
	}
	//操作员管理_管理员信息修改_姓名
	public void setOperManagement_AdminInfoUpdate_Name(String value) {
		du.what("OperManagement_AdminInfoUpdate_Name").sendKeys(Keys.CONTROL + "a");
		du.waitFor(500);
		du.what("OperManagement_AdminInfoUpdate_Name").sendKeys(value);
	}
	public String getOperManagement_AdminInfoUpdate_Name() {
		return du.what("OperManagement_AdminInfoUpdate_Name").getAttribute("value");
	}
	//操作员管理_管理员信息修改_手机号
	public void setOperManagement_AdminInfoUpdate_PhoneNO(String value) {
		du.what("OperManagement_AdminInfoUpdate_PhoneNO").sendKeys(Keys.CONTROL + "a");
		du.waitFor(500);
		du.what("OperManagement_AdminInfoUpdate_PhoneNO").sendKeys(value);
	}
	public String getOperManagement_AdminInfoUpdate_PhoneNO() {
		return du.what("OperManagement_AdminInfoUpdate_PhoneNO").getAttribute("value");
	}
	//操作员管理_管理员信息修改_确认
	public void clickOperManagement_AdminInfoUpdate_Confirm() {
		du.what("OperManagement_AdminInfoUpdate_Confirm").click();
	}
	//操作员管理_管理员信息修改_取消
	public void clickOperManagement_AdminInfoUpdate_Cancel() {
		du.what("OperManagement_AdminInfoUpdate_Cancel").click();
	}
	//操作员日志_起始日期
	public void setOperLog_BeginDate(String value) {
		du.what("OperLog_BeginDate").sendKeys(Keys.CONTROL + "a");
		du.waitFor(500);
		du.what("OperLog_BeginDate").sendKeys(value);
	}
	public String getOperLog_BeginDate() {
		return du.what("OperLog_BeginDate").getAttribute("value");
	}
	//操作员日志_结束日期
	public void setOperLog_EndDate(String value) {
		du.what("OperLog_EndDate").sendKeys(Keys.CONTROL + "a");
		du.waitFor(500);
		du.what("OperLog_EndDate").sendKeys(value);
	}
	public String getOperLog_EndDate() {
		return du.what("OperLog_EndDate").getAttribute("value");
	}
	//操作员日志_操作员
	public void setOperLog_Oper(String value) {
		du.what("OperLog_Oper").clear();
		du.what("OperLog_Oper").sendKeys(value);
	}
	public String getOperLog_Oper() {
		return du.what("OperLog_Oper").getAttribute("value");
	}
	//操作员日志_查询
	public void clickOperLog_Query() {
		du.what("OperLog_Query").click();
	}
	//操作员日志_重置
	public void clickOperLog_Reset() {
		du.what("OperLog_Reset").click();
	}
	//操作员管理_修改
	public void clickOperManagement_Modify() {
		du.what("OperManagement_Modify").click();
	}
	//操作员管理_删除
	public void clickOperManagement_Delete() {
		du.what("OperManagement_Delete").click();
	}
	//操作员管理_修改递交
	public void clickOperManagement_ModifyConfirm() {
		du.what("OperManagement_ModifyConfirm").click();
	}
	//操作员管理_修改取消
	public void clickOperManagement_ModifyCancel() {
		du.what("OperManagement_ModifyCancel").click();
	}
}