package com.dy.AutoTest.OperationPlatform.TestCases.accountmanage;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.dy.AutoTest.OperationPlatform.POJO.AccountManageOfflineInternalAccountPaymentQueryBean;
import com.dy.AutoTest.OperationPlatform.PageObject.accountmanage.AccountManageOfflineInternalAccountPaymentQueryPage;
import com.dy.AutoTest.web.api.SuperTest;
import com.dy.AutoTest.web.business.DataBusiness;

public class AccountManageOfflineInternalAccountPaymentQueryPageTest extends SuperTest {

	private AccountManageOfflineInternalAccountPaymentQueryPage accountManageOfflineInternalAccountPaymentQueryPage;

	private String URL = "";

	@BeforeClass
	public void init() {
		accountManageOfflineInternalAccountPaymentQueryPage = new AccountManageOfflineInternalAccountPaymentQueryPage(driver);
		URL = host.toString() + DataBusiness.getData_URL("pop_AccountManageOfflineInternalAccountPaymentQuery");
	}

	@DataProvider(name = "accountManageOfflineInternalAccountPaymentQuery")
	protected static Object[][] parametersPool() {
		data.loadDataBeanList("POP_Data_AccountManageOfflineInternalAccountPaymentQuery");
		return data.getDataBeanArray();
	}

	@Test(dataProvider = "accountManageOfflineInternalAccountPaymentQuery", description = "运营平台-线下内部账户收支明细查询")
	public void testAccountManageOfflineInternalAccountPaymentQuery(
			AccountManageOfflineInternalAccountPaymentQueryBean accountManageOfflineInternalAccountPaymentQueryBean) {

		accountManageOfflineInternalAccountPaymentQueryPage.navigateTo(URL);
		
		accountManageOfflineInternalAccountPaymentQueryPage.clickReset();
		wait.waitFor(1000);
		
		accountManageOfflineInternalAccountPaymentQueryPage.setInnerAccountNO(accountManageOfflineInternalAccountPaymentQueryBean.getInnerAccountNO());
		accountManageOfflineInternalAccountPaymentQueryPage.setDateBegin(accountManageOfflineInternalAccountPaymentQueryBean.getDateBegin());
		accountManageOfflineInternalAccountPaymentQueryPage.setDateEnd(accountManageOfflineInternalAccountPaymentQueryBean.getDateEnd());
		accountManageOfflineInternalAccountPaymentQueryPage.setFocusOnInnerAccountNO();
		
		accountManageOfflineInternalAccountPaymentQueryPage.clickQuery();
		wait.waitFor(1000);
		accountManageOfflineInternalAccountPaymentQueryPage.clickAccountRadio("0");
		accountManageOfflineInternalAccountPaymentQueryPage.clickCheck();
		wait.waitFor(1000);
		accountManageOfflineInternalAccountPaymentQueryPage.clickCheck_Close();
	}

}
