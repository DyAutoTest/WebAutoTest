package com.dy.AutoTest.OnlineCashier.TestCases.accountmanage;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.dy.AutoTest.OnlineCashier.POJO.AccountManageSceneComprehensiveBean;
import com.dy.AutoTest.OnlineCashier.PageObject.accountmanage.AccountManageSceneComprehensivePage;
import com.dy.AutoTest.web.api.SuperTest;
import com.dy.AutoTest.web.business.DataBusiness;

public class AccountManageSceneComprehensivePageTest extends SuperTest {

	private AccountManageSceneComprehensivePage accountManageSceneComprehensivePage;

	private String URL = "";

	@BeforeClass
	public void init() {
		accountManageSceneComprehensivePage = new AccountManageSceneComprehensivePage(driver);
		URL = host.toString() + DataBusiness.getData_URL("pop_AccountManageSceneComprehensive");
	}

	@DataProvider(name = "accountManageSceneComprehensive")
	protected static Object[][] parametersPool() {
		data.loadDataBeanList("POP_Data_AccountManageSceneComprehensive");
		return data.getDataBeanArray();
	}

	@Test(dataProvider = "accountManageSceneComprehensive", description = "运营平台-场景综合记账")
	public void testAccountManageSceneComprehensive(
			AccountManageSceneComprehensiveBean accountManageSceneComprehensiveBean) {

		accountManageSceneComprehensivePage.navigateTo(URL);
		wait.waitFor(1000);
		
		accountManageSceneComprehensivePage.selectAffiliationOrgnization(accountManageSceneComprehensiveBean.getAffiliationOrgnization());
		accountManageSceneComprehensivePage.selectExcessReserveBank(accountManageSceneComprehensiveBean.getExcessReserveBank());
		accountManageSceneComprehensivePage.selectSceneType(accountManageSceneComprehensiveBean.getSceneType());
		accountManageSceneComprehensivePage.setTradeDate(accountManageSceneComprehensiveBean.getTradeDate());
		
		accountManageSceneComprehensivePage.setIN_Money(accountManageSceneComprehensiveBean.getIN_Money());
		accountManageSceneComprehensivePage.setIN_Tips(accountManageSceneComprehensiveBean.getIN_Tips());
		
		accountManageSceneComprehensivePage.clickIN_InquireAccountNum();
		wait.waitFor(1000);
		accountManageSceneComprehensivePage.clickIN_AccountSelectionButton(accountManageSceneComprehensiveBean.getIN_InquireAccountNum());
		accountManageSceneComprehensivePage.clickIN_AccountConfirm();
		
		accountManageSceneComprehensivePage.setEX_Money(accountManageSceneComprehensiveBean.getEX_Money());
		accountManageSceneComprehensivePage.setEX_Tips(accountManageSceneComprehensiveBean.getEX_Tips());
		
		accountManageSceneComprehensivePage.clickEX_InquireAccountNum();
		wait.waitFor(1000);
		accountManageSceneComprehensivePage.clickEX_AccountSelectionButton(accountManageSceneComprehensiveBean.getEX_InquireAccountNum());
		accountManageSceneComprehensivePage.clickEX_AccountConfirm();
		
		wait.waitFor(1000);
		accountManageSceneComprehensivePage.clickCheckDebitCreditBalance();
		wait.waitFor(1000);
//		accountManageManualSingleAccountPage.clickConfirm();
	}

}
