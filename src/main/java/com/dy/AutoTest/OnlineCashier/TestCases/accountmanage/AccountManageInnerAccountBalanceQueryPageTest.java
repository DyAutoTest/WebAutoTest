package com.dy.AutoTest.OnlineCashier.TestCases.accountmanage;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.dy.AutoTest.OnlineCashier.POJO.AccountManageInnerAccountBalanceQueryBean;
import com.dy.AutoTest.OnlineCashier.PageObject.accountmanage.AccountManageInnerAccountBalanceQueryPage;
import com.dy.AutoTest.web.api.SuperTest;
import com.dy.AutoTest.web.business.DataBusiness;

public class AccountManageInnerAccountBalanceQueryPageTest extends SuperTest {
	
	private AccountManageInnerAccountBalanceQueryPage accountManageInnerAccountBalanceQueryPage;

	private String URL = "";

	@BeforeClass
	public void init() {
		accountManageInnerAccountBalanceQueryPage = new AccountManageInnerAccountBalanceQueryPage(driver);
		URL = host.toString() + DataBusiness.getData_URL("pop_AccountManageInnerAccountBalanceQuery");
	}

	@DataProvider(name = "accountManageInnerAccountBalanceQuery")
	protected static Object[][] parametersPool() {
		data.loadDataBeanList("POP_Data_AccountManageInnerAccountBalanceQuery");
		return data.getDataBeanArray();
	}

	@Test(dataProvider = "accountManageInnerAccountBalanceQuery", description = "运营平台-内部账户余额查询")
	public void testAccountManageInnerAccountBalanceQuery(
			AccountManageInnerAccountBalanceQueryBean accountManageInnerAccountBalanceQueryBean) {

		accountManageInnerAccountBalanceQueryPage.navigateTo(URL);
		
		accountManageInnerAccountBalanceQueryPage.clickReset();
		wait.waitFor(1000);
		
		accountManageInnerAccountBalanceQueryPage.selectAccountType(accountManageInnerAccountBalanceQueryBean.getAccountType());
		accountManageInnerAccountBalanceQueryPage.setAccountNO(accountManageInnerAccountBalanceQueryBean.getAccountNO());
		wait.waitFor(1000);
		
		accountManageInnerAccountBalanceQueryPage.clickQuery();
		wait.waitFor(1000);
		accountManageInnerAccountBalanceQueryPage.clickSwitch();
		wait.waitFor(1000);
		accountManageInnerAccountBalanceQueryPage.clickSwitch();
	}

}
