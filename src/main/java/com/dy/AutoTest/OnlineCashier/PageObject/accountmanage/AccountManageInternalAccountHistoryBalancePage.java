package com.dy.AutoTest.OnlineCashier.PageObject.accountmanage;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.dy.AutoTest.web.api.SuperPage;
import com.dy.AutoTest.web.actions.DoPlus;

public class AccountManageInternalAccountHistoryBalancePage extends SuperPage {
	
	public AccountManageInternalAccountHistoryBalancePage(WebDriver driver) {
		super(driver);
		du.loadLocator("POP_Loc_AccountManageInternalAccountHistoryBalance");
	}

	public void setWaitTime(long waitTime) {
		du = new DoPlus(driver);
		du.waitTime = waitTime;
		du.loadLocator("POP_Loc_AccountManageInternalAccountHistoryBalance");
	}

	/*************************** Manual Coding **********************************/

	/**************************** Auto Generate ******************************/

	// 高级
	public void clickAdvance() {
		du.what("Advance").click();
	}

	// 内部账户号
	public void setInnerlAccountNO(String value) {
		du.what("InnerlAccountNO").clear();
		du.what("InnerlAccountNO").sendKeys(value);
	}

	public String getInnerlAccountNO() {
		return du.what("InnerlAccountNO").getAttribute("value");
	}

	// 账户归属机构
	public void setAccountAffiliationOrgnization(String value) {
		du.what("AccountAffiliationOrgnization").clear();
		du.what("AccountAffiliationOrgnization").sendKeys(value);
	}

	public String getAccountAffiliationOrgnization() {
		return du.what("AccountAffiliationOrgnization").getAttribute("value");
	}

	// 账户种类
	public void selectAccountType(String value) {
		du.whatSelect("AccountType").selectByValue(value);
	}

	// 会计日期开始
	public void setAccountDateBegin(String value) {
		du.what("AccountDateBegin").sendKeys(Keys.CONTROL + "a");
		du.waitFor(500);
		du.what("AccountDateBegin").sendKeys(value);
	}

	public String getAccountDateBegin() {
		return du.what("AccountDateBegin").getAttribute("value");
	}

	// 会计日期结束
	public void setAccountDateEnd(String value) {
		du.what("AccountDateEnd").sendKeys(Keys.CONTROL + "a");
		du.waitFor(500);
		du.what("AccountDateEnd").sendKeys(value);
	}

	public String getAccountDateEnd() {
		return du.what("AccountDateEnd").getAttribute("value");
	}

	// 科目名称
	public void setItemName(String value) {
		du.what("ItemName").clear();
		du.what("ItemName").sendKeys(value);
	}

	public String getItemName() {
		return du.what("ItemName").getAttribute("value");
	}

	// 特征码
	public void setFeatureCode(String value) {
		du.what("FeatureCode").clear();
		du.what("FeatureCode").sendKeys(value);
	}

	public String getFeatureCode() {
		return du.what("FeatureCode").getAttribute("value");
	}

	// 币种
	public void selectCurrency(String value) {
		du.whatSelect("Currency").selectByValue(value);
	}

	// 查询
	public void clickQuery() {
		du.what("Query").click();
	}

	// 重置
	public void clickReset() {
		du.what("Reset").click();
	}

}