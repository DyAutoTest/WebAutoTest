package com.dy.AutoTest.OperationPlatform.TestCases.accountmanage;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.dy.AutoTest.OperationPlatform.POJO.AccountManageInternalAccountHistoryBalanceBean;
import com.dy.AutoTest.OperationPlatform.PageObject.accountmanage.AccountManageInternalAccountHistoryBalancePage;
import com.dy.AutoTest.web.api.SuperTest;
import com.dy.AutoTest.web.business.DataBusiness;

public class AccountManageInternalAccountHistoryBalancePageTest extends SuperTest {

	private AccountManageInternalAccountHistoryBalancePage accountManageInternalAccountHistoryBalancePage;

	private String URL = "";

	@BeforeClass
	public void init() {
		accountManageInternalAccountHistoryBalancePage = new AccountManageInternalAccountHistoryBalancePage(driver);
		URL = host.toString() + DataBusiness.getData_URL("pop_AccountManageInternalAccountHistoryBalance");
	}

	@DataProvider(name = "accountManageInternalAccountHistoryBalance")
	protected static Object[][] parametersPool() {
		data.loadDataBeanList("POP_Data_AccountManageInternalAccountHistoryBalance");
		return data.getDataBeanArray();
	}

	@Test(dataProvider = "accountManageInternalAccountHistoryBalance", description = "运营平台-内部账户余额历史查询")
	public void testAccountManageInternalAccountHistoryBalance(
			AccountManageInternalAccountHistoryBalanceBean accountManageInternalAccountHistoryBalanceBean) {

		accountManageInternalAccountHistoryBalancePage.navigateTo(URL);
		
		accountManageInternalAccountHistoryBalancePage.clickAdvance();
		accountManageInternalAccountHistoryBalancePage.setInnerlAccountNO(accountManageInternalAccountHistoryBalanceBean.getInnerlAccountNO());
		accountManageInternalAccountHistoryBalancePage.setAccountAffiliationOrgnization(accountManageInternalAccountHistoryBalanceBean.getAccountAffiliationOrgnization());
		accountManageInternalAccountHistoryBalancePage.selectAccountType(accountManageInternalAccountHistoryBalanceBean.getAccountType());
		accountManageInternalAccountHistoryBalancePage.setAccountDateBegin(accountManageInternalAccountHistoryBalanceBean.getAccountDateBegin());
		accountManageInternalAccountHistoryBalancePage.setAccountDateEnd(accountManageInternalAccountHistoryBalanceBean.getAccountDateEnd());
		accountManageInternalAccountHistoryBalancePage.setItemName(accountManageInternalAccountHistoryBalanceBean.getItemName());
		accountManageInternalAccountHistoryBalancePage.setFeatureCode(accountManageInternalAccountHistoryBalanceBean.getFeatureCode());
		accountManageInternalAccountHistoryBalancePage.selectCurrency(accountManageInternalAccountHistoryBalanceBean.getCurrency());
		
		accountManageInternalAccountHistoryBalancePage.clickQuery();
		wait.waitFor(1000);
	}

}
