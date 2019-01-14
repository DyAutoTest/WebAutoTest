package com.dy.AutoTest.OnlineCashier.TestCases.accountmanage;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.dy.AutoTest.OnlineCashier.POJO.AccountManageOnlineInternalAccountPaymentQueryBean;
import com.dy.AutoTest.OnlineCashier.PageObject.accountmanage.AccountManageOnlineInternalAccountPaymentQueryPage;
import com.dy.AutoTest.web.api.SuperTest;
import com.dy.AutoTest.web.business.DataBusiness;

public class AccountManageOnlineInternalAccountPaymentQueryPageTest extends SuperTest {
	
	private AccountManageOnlineInternalAccountPaymentQueryPage accountManageOnlineInternalAccountPaymentQueryPage;

	private String URL = "";

	@BeforeClass
	public void init() {
		accountManageOnlineInternalAccountPaymentQueryPage = new AccountManageOnlineInternalAccountPaymentQueryPage(driver);
		URL = host.toString() + DataBusiness.getData_URL("pop_AccountManageOnlineInternalAccountPaymentQuery");
	}

	@DataProvider(name = "accountManageOnlineInternalAccountPaymentQuery")
	protected static Object[][] parametersPool() {
		data.loadDataBeanList("POP_Data_AccountManageOnlineInternalAccountPaymentQuery");
		return data.getDataBeanArray();
	}

	@Test(dataProvider = "accountManageOnlineInternalAccountPaymentQuery", description = "运营平台-线上内部账户收支明细查询")
	public void testAccountManageOnlineInternalAccountPaymentQuery(
			AccountManageOnlineInternalAccountPaymentQueryBean accountManageOnlineInternalAccountPaymentQueryBean) {

		accountManageOnlineInternalAccountPaymentQueryPage.navigateTo(URL);
		
		accountManageOnlineInternalAccountPaymentQueryPage.clickReset();
		wait.waitFor(1000);
		accountManageOnlineInternalAccountPaymentQueryPage.setInnerAccountNO(accountManageOnlineInternalAccountPaymentQueryBean.getInnerAccountNO());
		accountManageOnlineInternalAccountPaymentQueryPage.selectAccountType(accountManageOnlineInternalAccountPaymentQueryBean.getAccountType());
		accountManageOnlineInternalAccountPaymentQueryPage.selectMoneyStatus(accountManageOnlineInternalAccountPaymentQueryBean.getMoneyStatus());
		wait.waitFor(1000);
		accountManageOnlineInternalAccountPaymentQueryPage.setDateBegin(accountManageOnlineInternalAccountPaymentQueryBean.getDateBegin());
		wait.waitFor(1000);
		accountManageOnlineInternalAccountPaymentQueryPage.setDateEnd(accountManageOnlineInternalAccountPaymentQueryBean.getDateEnd());
		
		accountManageOnlineInternalAccountPaymentQueryPage.setFocusOnInnerAccountNO();
		
		accountManageOnlineInternalAccountPaymentQueryPage.clickQuery();
		wait.waitFor(1000);
		
		accountManageOnlineInternalAccountPaymentQueryPage.clickSelectionButton("0");
		accountManageOnlineInternalAccountPaymentQueryPage.clickCheck();
		wait.waitFor(1000);
		accountManageOnlineInternalAccountPaymentQueryPage.clickCheck_Close();
		
	}

}
