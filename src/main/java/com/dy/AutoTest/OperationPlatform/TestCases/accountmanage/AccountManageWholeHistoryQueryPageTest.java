package com.dy.AutoTest.OperationPlatform.TestCases.accountmanage;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.dy.AutoTest.OperationPlatform.POJO.AccountManageWholeHistoryQueryBean;
import com.dy.AutoTest.OperationPlatform.PageObject.accountmanage.AccountManageWholeHistoryQueryPage;
import com.dy.AutoTest.web.api.SuperTest;
import com.dy.AutoTest.web.business.DataBusiness;

public class AccountManageWholeHistoryQueryPageTest extends SuperTest {

	private AccountManageWholeHistoryQueryPage accountManageWholeHistoryQueryPage;

	private String URL = "";

	@BeforeClass
	public void init() {
		accountManageWholeHistoryQueryPage = new AccountManageWholeHistoryQueryPage(driver);
		URL = host.toString() + DataBusiness.getData_URL("pop_AccountManageWholeHistoryQuery");
	}

	@DataProvider(name = "accountManageWholeHistoryQuery")
	protected static Object[][] parametersPool() {
		data.loadDataBeanList("POP_Data_AccountManageWholeHistoryQuery");
		return data.getDataBeanArray();
	}

	@Test(dataProvider = "accountManageWholeHistoryQuery", description = "运营平台-总账历史查询")
	public void testAccountManageWholeHistoryQuery(
			AccountManageWholeHistoryQueryBean accountManageWholeHistoryQueryBean) {
		
		accountManageWholeHistoryQueryPage.navigateTo(URL);
		wait.waitFor(1000);
		accountManageWholeHistoryQueryPage.clickReset();
		
		accountManageWholeHistoryQueryPage.setItemNO(accountManageWholeHistoryQueryBean.getItemNO());
		accountManageWholeHistoryQueryPage.setItemName(accountManageWholeHistoryQueryBean.getItemName());
		accountManageWholeHistoryQueryPage.selectItemLv(accountManageWholeHistoryQueryBean.getItemLv());
		accountManageWholeHistoryQueryPage.setDateBegin(accountManageWholeHistoryQueryBean.getDateBegin());
		accountManageWholeHistoryQueryPage.setDateEnd(accountManageWholeHistoryQueryBean.getDateEnd());
		
		accountManageWholeHistoryQueryPage.setFocusOnItemNO();
		
		wait.waitFor(1000);
		accountManageWholeHistoryQueryPage.clickQuery();
		
		wait.waitFor(1000);
		accountManageWholeHistoryQueryPage.clickRadio("0");
		accountManageWholeHistoryQueryPage.clickSwitch();
		wait.waitFor(1000);
		accountManageWholeHistoryQueryPage.clickSwitch();
	}

}
