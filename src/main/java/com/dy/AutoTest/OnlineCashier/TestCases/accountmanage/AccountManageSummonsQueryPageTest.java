package com.dy.AutoTest.OnlineCashier.TestCases.accountmanage;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.dy.AutoTest.OnlineCashier.POJO.AccountManageSummonsQueryBean;
import com.dy.AutoTest.OnlineCashier.PageObject.accountmanage.AccountManageSummonsQueryPage;
import com.dy.AutoTest.web.api.SuperTest;
import com.dy.AutoTest.web.business.DataBusiness;

public class AccountManageSummonsQueryPageTest extends SuperTest {
	
	private AccountManageSummonsQueryPage accountManageSummonsQueryPage;

	private String URL = "";

	@BeforeClass
	public void init() {
		accountManageSummonsQueryPage = new AccountManageSummonsQueryPage(driver);
		URL = host.toString() + DataBusiness.getData_URL("pop_AccountManageSummonsQuery");
	}

	@DataProvider(name = "accountManageSummonsQuery")
	protected static Object[][] parametersPool() {
		data.loadDataBeanList("POP_Data_AccountManageSummonsQuery");
		return data.getDataBeanArray();
	}

	@Test(dataProvider = "accountManageSummonsQuery", description = "运营平台-会计传票查询")
	public void testAccountManageSummonsQuery(
			AccountManageSummonsQueryBean accountManageSummonsQueryBean) {

		accountManageSummonsQueryPage.navigateTo(URL);
		
		accountManageSummonsQueryPage.clickReset();
		wait.waitFor(1000);
		accountManageSummonsQueryPage.clickAdvance();
		wait.waitFor(1000);
		
		accountManageSummonsQueryPage.setSummonsNum(accountManageSummonsQueryBean.getSummonsNum());
		accountManageSummonsQueryPage.setAccountSerialNum(accountManageSummonsQueryBean.getAccountSerialNum());
		accountManageSummonsQueryPage.selectAccountType(accountManageSummonsQueryBean.getAccountType());
		accountManageSummonsQueryPage.setDateBegin(accountManageSummonsQueryBean.getDateBegin());
		accountManageSummonsQueryPage.setDateEnd(accountManageSummonsQueryBean.getDateEnd());
		accountManageSummonsQueryPage.setAccountNo(accountManageSummonsQueryBean.getAccountNo());
		accountManageSummonsQueryPage.setAccountAffiliationOrgnization(accountManageSummonsQueryBean.getAccountAffiliationOrgnization());
		accountManageSummonsQueryPage.selectManualSummonsFlag(accountManageSummonsQueryBean.getManualSummonsFlag());
		
		wait.waitFor(1000);
		accountManageSummonsQueryPage.clickQuery();
		wait.waitFor(1000);
		accountManageSummonsQueryPage.clickSelectionButton("0");
		wait.waitFor(1000);
		accountManageSummonsQueryPage.clickCheck();
		wait.waitFor(1000);
		accountManageSummonsQueryPage.clickCheck_Close();
	}

}
