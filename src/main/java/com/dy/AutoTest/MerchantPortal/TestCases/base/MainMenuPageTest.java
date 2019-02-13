package com.dy.AutoTest.MerchantPortal.TestCases.base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.dy.AutoTest.MerchantPortal.PageObject.base.MainMenuPage;
import com.dy.AutoTest.web.actions.SingletonSet;
import com.dy.AutoTest.web.actions.Wait;
import com.dy.AutoTest.web.business.DataBusiness;

public class MainMenuPageTest {
	private WebDriver driver;
	private Wait wait;
	private MainMenuPage mainMenuPage;

	private StringBuffer host=SingletonSet.URL;
	@SuppressWarnings("unused")
	private String URL="";
	
	@BeforeClass
	public void init() {
		driver=SingletonSet.driver;
		wait=SingletonSet.wait;
		mainMenuPage=new MainMenuPage(driver); 
		
		URL=host.toString()+DataBusiness.getData_URL("pweb_index");
	}
	
	@AfterClass
	public void releaseBrowser() {
		wait.waitFor(1000);
	}
	
	@Test
	public void testLink() {
		mainMenuPage.gotoTradeQuery();
		mainMenuPage.gotoMainPage();
		mainMenuPage.gotoIncomeExpensesDetail();
		mainMenuPage.gotoMainPage();
		mainMenuPage.gotoRecharge();
		mainMenuPage.gotoMainPage();
		mainMenuPage.gotoWithdrawDeposit();
		mainMenuPage.gotoMainPage();
		mainMenuPage.gotoTradeDetail();
		mainMenuPage.gotoMainPage();
		
		mainMenuPage.doQuit();
	}
	@Test
	public void testQuit() {
		mainMenuPage.doQuit();
	}
	
}
