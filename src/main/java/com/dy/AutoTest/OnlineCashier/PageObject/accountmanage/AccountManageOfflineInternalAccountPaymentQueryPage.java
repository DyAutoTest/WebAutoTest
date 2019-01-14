package com.dy.AutoTest.OnlineCashier.PageObject.accountmanage;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.dy.AutoTest.web.api.SuperPage;
import com.dy.AutoTest.web.actions.DoPlus;

public class AccountManageOfflineInternalAccountPaymentQueryPage extends SuperPage {
	public AccountManageOfflineInternalAccountPaymentQueryPage(WebDriver driver) {
		super(driver);
		du.loadLocator("POP_Loc_AccountManageOfflineInternalAccountPaymentQuery");
	}
	public void setWaitTime(long waitTime) {
		du=new DoPlus(driver);
		du.waitTime=waitTime;
		du.loadLocator("POP_Loc_AccountManageOfflineInternalAccountPaymentQuery");
	}

/***************************Manual Coding**********************************/


/****************************Auto Generate******************************/

	//内部账户帐号
	public void setInnerAccountNO(String value) {
		du.what("InnerAccountNO").clear();
		du.what("InnerAccountNO").sendKeys(value);
	}
	public String getInnerAccountNO() {
		return du.what("InnerAccountNO").getAttribute("value");
	}
	//起始日期
	public void setDateBegin(String value) {
		du.what("DateBegin").sendKeys(Keys.CONTROL + "a");
		du.waitFor(500);
		du.what("DateBegin").sendKeys(value);
	}
	public String getDateBegin() {
		return du.what("DateBegin").getAttribute("value");
	}
	//结束日期
	public void setDateEnd(String value) {
		du.what("DateEnd").sendKeys(Keys.CONTROL + "a");
		du.waitFor(500);
		du.what("DateEnd").sendKeys(value);
	}
	public String getDateEnd() {
		return du.what("DateEnd").getAttribute("value");
	}
	//查询
	public void clickQuery() {
		du.what("Query").click();
	}
	//重置
	public void clickReset() {
		du.what("Reset").click();
	}
	//查看详情
	public void clickCheck() {
		du.what("Check").click();
	}
	//账户列表单选按钮
	public void clickAccountRadio(String radio) {
		du.what("AccountRadio",radio).click();
	}
	public boolean isAccountRadioDisplayed(String radio) {
		du.waitFor(500);
		return du.what("AccountRadio",radio).isDisplayed();
	}
	//查看详情_关闭
	public void clickCheck_Close() {
		du.what("Check_Close").click();
	}

	public void setFocusOnInnerAccountNO() {
		du.what("InnerAccountNO").click();
	}
}