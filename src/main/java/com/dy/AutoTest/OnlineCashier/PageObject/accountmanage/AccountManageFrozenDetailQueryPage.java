package com.dy.AutoTest.OnlineCashier.PageObject.accountmanage;

import org.openqa.selenium.WebDriver;

import com.dy.AutoTest.web.api.SuperPage;
import com.dy.AutoTest.web.actions.DoPlus;

public class AccountManageFrozenDetailQueryPage extends SuperPage {
	public AccountManageFrozenDetailQueryPage(WebDriver driver) {
		super(driver);
		du.loadLocator("POP_Loc_AccountManageFrozenDetailQuery");
	}
	public void setWaitTime(long waitTime) {
		du=new DoPlus(driver);
		du.waitTime=waitTime;
		du.loadLocator("POP_Loc_AccountManageFrozenDetailQuery");
	}

/***************************Manual Coding**********************************/


/****************************Auto Generate******************************/

	//高级
	public void clickAdvance() {
		du.what("Advance").click();
	}
	//内部用户号
	public void setInnerUserNO(String value) {
		du.what("InnerUserNO").clear();
		du.what("InnerUserNO").sendKeys(value);
	}
	public String getInnerUserNO() {
		return du.what("InnerUserNO").getAttribute("value");
	}
	//冻结状态
	public void selectFrozenStatus(String value) {
		du.whatSelect("FrozenStatus").selectByValue(value);
	}
	//账号
	public void setAccountNO(String value) {
		du.what("AccountNO").clear();
		du.what("AccountNO").sendKeys(value);
	}
	public String getAccountNO() {
		return du.what("AccountNO").getAttribute("value");
	}
	//币种
	public void selectCurrency(String value) {
		du.whatSelect("Currency").selectByValue(value);
	}
	//账务归属机构
	public void selectOwnershipOfAccounts(String value) {
		du.whatSelect("OwnershipOfAccounts").selectByValue(value);
	}
	//资金种类
	public void selectMoneyType(String value) {
		du.whatSelect("MoneyType").selectByValue(value);
	}
	//查询
	public void clickQuery() {
		du.what("Query").click();
	}
	//重置
	public void clickReset() {
		du.what("Reset").click();
	}
	//账户列表的单选框
	public void clickAccountRadio(String radio) {
		du.what("AccountRadio",radio).click();
	}
	public boolean isAccountRadioDisplayed(String radio) {
		du.waitFor(500);
		return du.what("AccountRadio",radio).isDisplayed();
	}

}