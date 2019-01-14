package com.dy.AutoTest.OnlineCashier.TestCases.accountmanage;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.dy.AutoTest.OnlineCashier.POJO.AccountManageExternalBalanceDetailQueryBean;
import com.dy.AutoTest.OnlineCashier.PageObject.accountmanage.AccountManageExternalBalanceDetailQueryPage;
import com.dy.AutoTest.web.api.SuperTest;
import com.dy.AutoTest.web.business.DataBusiness;

public class AccountManageExternalBalanceDetailQueryPageTest extends SuperTest {
	
	private AccountManageExternalBalanceDetailQueryPage accountManageExternalBalanceDetailQueryPage;

	private String URL = "";

	@BeforeClass
	public void init() {
		accountManageExternalBalanceDetailQueryPage = new AccountManageExternalBalanceDetailQueryPage(driver);
		URL = host.toString() + DataBusiness.getData_URL("pop_AccountManageExternalBalanceDetailQuery");
	}

	@DataProvider(name = "accountManageExternalBalanceDetailQuery")
	protected static Object[][] parametersPool() {
		data.loadDataBeanList("POP_Data_AccountManageExternalBalanceDetailQuery");
		return data.getDataBeanArray();
	}

	@Test(dataProvider = "accountManageExternalBalanceDetailQuery", description = "运营平台-外部账户收支明细查询")
	public void testAccountManageExternalBalanceDetailQuery(
			AccountManageExternalBalanceDetailQueryBean accountManageExternalBalanceDetailQueryBean) {

		accountManageExternalBalanceDetailQueryPage.navigateTo(URL);
		
		wait.waitFor(1000);
		accountManageExternalBalanceDetailQueryPage.clickAdvance();
		wait.waitFor(1000);
		accountManageExternalBalanceDetailQueryPage.clickReset();
		wait.waitFor(1000);
		
		accountManageExternalBalanceDetailQueryPage.setAccountNO(accountManageExternalBalanceDetailQueryBean.getAccountNO());
		accountManageExternalBalanceDetailQueryPage.selectAccountType(accountManageExternalBalanceDetailQueryBean.getAccountType());
		accountManageExternalBalanceDetailQueryPage.setInnerUserName(accountManageExternalBalanceDetailQueryBean.getInnerUserName());
		accountManageExternalBalanceDetailQueryPage.setAccountingDateBegin(accountManageExternalBalanceDetailQueryBean.getAccountingDateBegin());
		accountManageExternalBalanceDetailQueryPage.setAccountingDateEnd(accountManageExternalBalanceDetailQueryBean.getAccountingDateEnd());
		accountManageExternalBalanceDetailQueryPage.setAccountingSerialNO(accountManageExternalBalanceDetailQueryBean.getAccountingSerialNO());
		accountManageExternalBalanceDetailQueryPage.setInnerOrderNO(accountManageExternalBalanceDetailQueryBean.getInnerOrderNO());
		accountManageExternalBalanceDetailQueryPage.selectStatus(accountManageExternalBalanceDetailQueryBean.getStatus());
		
		wait.waitFor(1000);
		accountManageExternalBalanceDetailQueryPage.clickQuery();
		wait.waitFor(1000);
		
		accountManageExternalBalanceDetailQueryPage.clickAccountRadio("0");
		wait.waitFor(1000);
		
		accountManageExternalBalanceDetailQueryPage.clickCheck();
		wait.waitFor(1000);
		accountManageExternalBalanceDetailQueryPage.clickCheck_Close();
	}

}
