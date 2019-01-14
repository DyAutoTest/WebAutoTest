package com.dy.AutoTest.OnlineCashier.TestCases.accountmanage;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.dy.AutoTest.OnlineCashier.POJO.AccountManageYesterdayWholeQueryBean;
import com.dy.AutoTest.OnlineCashier.PageObject.accountmanage.AccountManageYesterdayWholeQueryPage;
import com.dy.AutoTest.web.api.SuperTest;
import com.dy.AutoTest.web.business.DataBusiness;

public class AccountManageYesterdayWholeQueryPageTest extends SuperTest {

	private AccountManageYesterdayWholeQueryPage accountManageYesterdayWholeQueryPage;

	private String URL = "";

	@BeforeClass
	public void init() {
		accountManageYesterdayWholeQueryPage = new AccountManageYesterdayWholeQueryPage(driver);
		URL = host.toString() + DataBusiness.getData_URL("pop_AccountManageYesterdayWholeQuery");
	}

	@DataProvider(name = "accountManageYesterdayWholeQuery")
	protected static Object[][] parametersPool() {
		data.loadDataBeanList("POP_Data_AccountManageYesterdayWholeQuery");
		return data.getDataBeanArray();
	}

	@Test(dataProvider = "accountManageYesterdayWholeQuery", description = "运营平台-上日总账查询")
	public void testAccountManageYesterdayWholeQuery(
			AccountManageYesterdayWholeQueryBean accountManageYesterdayWholeQueryBean) {

		accountManageYesterdayWholeQueryPage.navigateTo(URL);
		wait.waitFor(1000);
		
		accountManageYesterdayWholeQueryPage.doPageDown();
		wait.waitFor(1000);
		accountManageYesterdayWholeQueryPage.doPageDown();
		wait.waitFor(1000);
		accountManageYesterdayWholeQueryPage.doPageDown();
		wait.waitFor(1000);
		
//		accountManageYesterdayWholeQueryPage.clickPrint();
		
	}

}
