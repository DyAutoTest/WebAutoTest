package com.dy.AutoTest.MerchantPortal.PageObject.merchantmanage;

import org.openqa.selenium.WebDriver;

import com.dy.AutoTest.web.api.SuperPage;

import safeInput.KeyBoardSimulator;

import com.dy.AutoTest.web.actions.DoPlus;

public class MMAddOperPage extends SuperPage {
	public MMAddOperPage(WebDriver driver) {
		super(driver);
		du.loadLocator("MP_Loc_MMAddOper");
	}
	public void setWaitTime(long waitTime) {
		du=new DoPlus(driver);
		du.waitTime=waitTime;
		du.loadLocator("MP_Loc_MMAddOper");
	}

/***************************Manual Coding**********************************/


/****************************Auto Generate******************************/

	//顶部_添加操作员
	public void clickTop_AddOper() {
		du.what("Top_AddOper").click();
	}
	//操作员姓名
	public void setOperName(String value) {
		du.what("OperName").clear();
		du.what("OperName").sendKeys(value);
	}
	public String getOperName() {
		return du.what("OperName").getAttribute("value");
	}
	//手机号码
	public void setPhoneNO(String value) {
		du.what("PhoneNO").clear();
		du.what("PhoneNO").sendKeys(value);
	}
	public String getPhoneNO() {
		return du.what("PhoneNO").getAttribute("value");
	}
	//登录密码
	public void setPassword(String value) {
		try {
			du.what("Password").click();
			du.waitFor(500);
			KeyBoardSimulator.inputMockKeyBoard(value);
		} catch (Exception e) {
			e.printStackTrace();
			du.waitFor(10000);
		}
	}
	public String getPassword() {
		return du.what("Password").getAttribute("value");
	}
	//确认登录密码
	public void setConfirmPassword(String value) {
		try {
			du.what("ConfirmPassword").click();
			du.waitFor(500);
			KeyBoardSimulator.inputMockKeyBoard(value);
		} catch (Exception e) {
			e.printStackTrace();
			du.waitFor(10000);
		}
	}
	public String getConfirmPassword() {
		return du.what("ConfirmPassword").getAttribute("value");
	}
	//操作员权限
	public void clickOperAuthority() {
		du.what("OperAuthority").click();
	}
	//安全中心展开按钮
	public void clickSafetyCenterExpand() {
		du.what("SafetyCenterExpand").click();
	}
	//安全中心全选按钮
	public void clickSafetyCenterCheckboxAll() {
		du.what("SafetyCenterCheckboxAll").click();
	}
	//安全中心多选按钮(1,2,3,4,5,6)
	public void clickSafetyCenterCheckbox() {
		du.what("SafetyCenterCheckbox").click();
	}
	//帮助中心展开按钮
	public void clickHelpCenterExpand() {
		du.what("HelpCenterExpand").click();
	}
	//帮助中心全选按钮
	public void clickHelpCenterCheckboxAll() {
		du.what("HelpCenterCheckboxAll").click();
	}
	//帮助中心多选按钮
	public void clickHelpCenterCheckbox() {
		du.what("HelpCenterCheckbox").click();
	}
	//我的电银信息展开按钮
	public void clickMyDYInfoExpand() {
		du.what("MyDYInfoExpand").click();
	}
	//我的电银信息全选按钮
	public void clickMyDYInfoCheckboxAll() {
		du.what("MyDYInfoCheckboxAll").click();
	}
	//我的电银信息多选按钮(1,2,3,4)
	public void clickMyDYInfoCheckbox() {
		du.what("MyDYInfoCheckbox").click();
	}
	//商户管理展开按钮
	public void clickMerchantManagementExpand() {
		du.what("MerchantManagementExpand").click();
	}
	//商户管理全选按钮
	public void clickMerchantManagementCheckboxAll() {
		du.what("MerchantManagementCheckboxAll").click();
	}
	//商户管理多选按钮(2,3,4,5)
	public void clickMerchantManagementCheckbox() {
		du.what("MerchantManagementCheckbox").click();
	}
	//交易管理展开按钮
	public void clickTradeManagementExpand() {
		du.what("TradeManagementExpand").click();
	}
	//交易管理全选按钮
	public void clickTradeManagementCheckboxAll() {
		du.what("TradeManagementCheckboxAll").click();
	}
	//交易管理多选按钮(1,11,2,3,4,7)
	public void clickTradeManagementCheckbox() {
		du.what("TradeManagementCheckbox").click();
	}
	//添加
	public void clickAdd() {
		du.what("Add").click();
	}

}