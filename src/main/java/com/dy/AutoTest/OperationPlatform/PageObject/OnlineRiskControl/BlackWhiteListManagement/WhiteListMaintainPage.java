package com.dy.AutoTest.OperationPlatform.PageObject.OnlineRiskControl.BlackWhiteListManagement;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.dy.AutoTest.web.api.IQuery;
import com.dy.AutoTest.web.api.SuperPage;
import com.dy.AutoTest.web.actions.DoPlus;

public class WhiteListMaintainPage extends SuperPage implements IQuery{
	public WhiteListMaintainPage(WebDriver driver) {
		super(driver);
		du.loadLocator("POP_Loc_BlackWhiteListManagement_WhiteListMaintain");
	}
	public void setWaitTime(long waitTime) {
		du=new DoPlus(driver);
		du.waitTime=waitTime;
		du.loadLocator("POP_Loc_BlackWhiteListManagement_WhiteListMaintain");
	}

/***************************Manual Coding**********************************/


/****************************Auto Generate******************************/

	//手机号/商户编号
	public void setPhoneOrMerchantNO(String value) {
		du.what("PhoneOrMerchantNO").clear();
		du.what("PhoneOrMerchantNO").sendKeys(value);
	}
	public String getPhoneOrMerchantNO() {
		return du.what("PhoneOrMerchantNO").getAttribute("value");
	}
	//交易类型
	public void selectTradeType(String value) {
		du.whatSelect("TradeType").selectByValue(value);
	}
	//有效日期起始日期
	public void setDateBegin(String value) {
		du.what("DateBegin").sendKeys(Keys.CONTROL + "a");
		du.waitFor(500);
		du.what("DateBegin").sendKeys(value);
	}
	public String getDateBegin() {
		return du.what("DateBegin").getAttribute("value");
	}
	//有效日期结束日期
	public void setDateEnd(String value) {
		du.what("DateEnd").sendKeys(Keys.CONTROL + "a");
		du.waitFor(500);
		du.what("DateEnd").sendKeys(value);
	}
	public String getDateEnd() {
		return du.what("DateEnd").getAttribute("value");
	}
	//解除标志
	public void selectReleaseStatus(String value) {
		du.whatSelect("ReleaseStatus").selectByValue(value);
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
	//解除
	public void clickRelease() {
		du.what("Release").click();
	}
	//名单列表单选按钮
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
	//添加_个企标志
	public void selectAdd_PersonalEnterpraiseStatus(String value) {
		du.whatSelect("Add_PersonalEnterpraiseStatus").selectByValue(value);
	}
	//添加_手机号/商户号
	public void setAdd_PhoneOrMerchantNO(String value) {
		du.what("Add_PhoneOrMerchantNO").clear();
		du.what("Add_PhoneOrMerchantNO").sendKeys(value);
	}
	public String getAdd_PhoneOrMerchantNO() {
		return du.what("Add_PhoneOrMerchantNO").getAttribute("value");
	}
	//添加_交易类型
	public void selectAdd_TradeType(String value) {
		du.whatSelect("Add_TradeType").selectByValue(value);
	}
	//添加_加入原因
	public void setAdd_AddReason(String value) {
		du.what("Add_AddReason").clear();
		du.what("Add_AddReason").sendKeys(value);
	}
	public String getAdd_AddReason() {
		return du.what("Add_AddReason").getAttribute("value");
	}
	//添加_有效日期起始日期
	public void setAdd_DateBegin(String value) {
		du.what("Add_DateBegin").sendKeys(Keys.CONTROL + "a");
		du.waitFor(500);
		du.what("Add_DateBegin").sendKeys(value);
	}
	public String getAdd_DateBegin() {
		return du.what("Add_DateBegin").getAttribute("value");
	}
	//添加_有效日期结束日期
	public void setAdd_DateEnd(String value) {
		du.what("Add_DateEnd").sendKeys(Keys.CONTROL + "a");
		du.waitFor(500);
		du.what("Add_DateEnd").sendKeys(value);
	}
	public String getAdd_DateEnd() {
		return du.what("Add_DateEnd").getAttribute("value");
	}
	//添加_提交
	public void clickAdd_Submit() {
		du.what("Add_Submit").click();
	}
	//添加_关闭
	public void clickAdd_Close() {
		du.what("Add_Close").click();
	}
	//解除_确认
	public void clickRelease_Confirm() {
		du.what("Release_Confirm").click();
	}
	//解除_关闭
	public void clickRelease_Close() {
		du.what("Release_Close").click();
	}

}