package com.dy.AutoTest.MerchantPortal.PageObject.base;

import org.openqa.selenium.WebDriver;

import com.dy.AutoTest.web.actions.DoPlus;
import com.dy.AutoTest.web.actions.SingletonSet;

public class MainMenuPage {
	
	private WebDriver driver=null;
	private DoPlus du=null;
	
	public MainMenuPage(WebDriver driver) {
		this.driver=driver;
		du=SingletonSet.du;
		du.loadLocator("MP_Loc_MainMenuPage");
	}

	
	/**
	 * 进入商户门户首页
	 * @param url
	 */
	public void navigateTo(String url) {
		driver.get(url);
	}
	
	/**
	 * 交易查询链接跳转
	 */
	public void gotoTradeQuery() {
		du.waitFor(1000);
		du.waitForElementPresent("TradeQuery");
		du.what("TradeQuery").click();
		du.waitFor(1000);
	}
	
	/**
	 * 收支明细链接跳转
	 */
	public void gotoIncomeExpensesDetail() {
		du.waitFor(1000);
		du.waitForElementPresent("IncomeExpensesDetail");
		du.what("IncomeExpensesDetail").click();
		du.waitFor(1000);
	}
	
	/**
	 * 我的二维码链接跳转
	 */
	public void gotoQCode() {
		du.waitFor(1000);
		du.waitForElementPresent("QCode");
		du.what("QCode").click();
		du.waitFor(1000);
	}
	
	/**
	 * 充值链接跳转
	 */
	public void gotoRecharge() {
		du.waitFor(1000);
		du.waitForElementPresent("Recharge");
		du.what("Recharge").click();
		du.waitFor(1000);
	}
	
	/**
	 * 提现链接跳转
	 */
	public void gotoWithdrawDeposit() {
		du.waitFor(1000);
		du.waitForElementPresent("WithdrawDeposit");
		du.what("WithdrawDeposit").click();
		du.waitFor(1000);
	}
	
	/**
	 * 交易详情链接跳转
	 */
	public void gotoTradeDetail() {
		du.waitFor(1000);
		du.waitForElementPresent("TradeDetail");
		du.what("TradeDetail").click();
		du.waitFor(1000);
	}
	
	/**
	 * 首页链接跳转
	 */
	public void gotoMainPage() {
		du.waitFor(1000);
		du.waitForElementPresent("MainPage");
		du.what("MainPage").click();
		du.waitFor(1000);
	}
	
	/**
	 * 退出登录
	 */
	public void doQuit() {
		du.waitFor(2000);
		du.what("Exit").click();
	}
	
	/**
	 * 修改密码（未完）
	 */
	public void doPasswordChange() {
		du.waitFor(3000);
		du.what("Personal").click();
		du.waitFor(500);
		du.what("ChangePassword").click();
	}
	
}
