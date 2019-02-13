package com.dy.AutoTest.OperationPlatform.TestCases.accountmanage;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.dy.AutoTest.OperationPlatform.POJO.AccountManageFrozenDetailQueryBean;
import com.dy.AutoTest.OperationPlatform.PageObject.accountmanage.AccountManageFrozenDetailQueryPage;
import com.dy.AutoTest.web.api.SuperTest;
import com.dy.AutoTest.web.business.DataBusiness;

public class AccountManageFrozenDetailQueryPageTest extends SuperTest {
	
	private AccountManageFrozenDetailQueryPage accountManageFrozenDetailQueryPage;

	private String URL = "";

	@BeforeClass
	public void init() {
		accountManageFrozenDetailQueryPage = new AccountManageFrozenDetailQueryPage(driver);
		URL = host.toString() + DataBusiness.getData_URL("pop_AccountManageFrozenDetailQuery");
	}

	@DataProvider(name = "accountManageFrozenDetailQuery")
	protected static Object[][] parametersPool() {
		data.loadDataBeanList("POP_Data_AccountManageFrozenDetailQuery");
		return data.getDataBeanArray();
	}

	@Test(dataProvider = "accountManageFrozenDetailQuery", description = "运营平台-账户冻结明细查询")
	public void testAccountManageFrozenDetailQuery(
			AccountManageFrozenDetailQueryBean accountManageFrozenDetailQueryBean) {

		accountManageFrozenDetailQueryPage.navigateTo(URL);
		
		wait.waitFor(1000);
		accountManageFrozenDetailQueryPage.clickAdvance();
		wait.waitFor(1000);
		accountManageFrozenDetailQueryPage.clickReset();
		wait.waitFor(1000);
		
		accountManageFrozenDetailQueryPage.setInnerUserNO(accountManageFrozenDetailQueryBean.getInnerUserNO());
		accountManageFrozenDetailQueryPage.selectFrozenStatus(accountManageFrozenDetailQueryBean.getFrozenStatus());
		accountManageFrozenDetailQueryPage.setAccountNO(accountManageFrozenDetailQueryBean.getAccountNO());
		accountManageFrozenDetailQueryPage.selectCurrency(accountManageFrozenDetailQueryBean.getCurrency());
		accountManageFrozenDetailQueryPage.selectOwnershipOfAccounts(accountManageFrozenDetailQueryBean.getOwnershipOfAccounts());
		accountManageFrozenDetailQueryPage.selectMoneyType(accountManageFrozenDetailQueryBean.getMoneyType());
		
		wait.waitFor(1000);
		accountManageFrozenDetailQueryPage.clickQuery();
		wait.waitFor(1000);
	}

}
