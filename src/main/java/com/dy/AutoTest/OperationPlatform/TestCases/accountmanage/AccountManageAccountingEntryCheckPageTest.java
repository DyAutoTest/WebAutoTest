package com.dy.AutoTest.OperationPlatform.TestCases.accountmanage;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.dy.AutoTest.OperationPlatform.POJO.AccountManageAccountingEntryCheckBean;
import com.dy.AutoTest.OperationPlatform.PageObject.accountmanage.AccountManageAccountingEntryCheckPage;
import com.dy.AutoTest.web.api.SuperTest;
import com.dy.AutoTest.web.business.DataBusiness;

public class AccountManageAccountingEntryCheckPageTest extends SuperTest {
	
	private AccountManageAccountingEntryCheckPage accountManageAccountingEntryCheckPage;

	private String URL = "";

	@BeforeClass
	public void init() {
		accountManageAccountingEntryCheckPage = new AccountManageAccountingEntryCheckPage(driver);
		URL = host.toString() + DataBusiness.getData_URL("pop_AccountManageAccountingEntryCheck");
	}

	@DataProvider(name = "accountManageAccountingEntryCheck")
	protected static Object[][] parametersPool() {
		data.loadDataBeanList("POP_Data_AccountManageAccountingEntryCheck");
		return data.getDataBeanArray();
	}

	@Test(dataProvider = "accountManageAccountingEntryCheck", description = "运营平台-会计分录新增复核")
	public void testAccountManageAccountingEntryCheck(
			AccountManageAccountingEntryCheckBean accountManageAccountingEntryCheckBean) {

		accountManageAccountingEntryCheckPage.navigateTo(URL);
		
		wait.waitFor(1000);
		accountManageAccountingEntryCheckPage.clickReset();
		wait.waitFor(1000);
		
		accountManageAccountingEntryCheckPage.selectProductCode(accountManageAccountingEntryCheckBean.getProductsCode());
		accountManageAccountingEntryCheckPage.selectTradeType(accountManageAccountingEntryCheckBean.getTradeType());
		accountManageAccountingEntryCheckPage.selectStatus(accountManageAccountingEntryCheckBean.getStatus());
		accountManageAccountingEntryCheckPage.selectBusinessSubtype(accountManageAccountingEntryCheckBean.getBusinessSubtype());
		
		wait.waitFor(1000);
		accountManageAccountingEntryCheckPage.clickQuery();
		wait.waitFor(1000);
		accountManageAccountingEntryCheckPage.clickEntryRadio("0");
		
		String caseNo = accountManageAccountingEntryCheckBean.getCaseNo();

		switch (caseNo) {
		case "1":
			verifyAccountCase(accountManageAccountingEntryCheckBean);
			break;
		case "2":
			checkAccountCase(accountManageAccountingEntryCheckBean);
			break;
		default:
			break;
		}
	}

	private void verifyAccountCase(AccountManageAccountingEntryCheckBean accountManageAccountingEntryCheckBean) {
		wait.waitFor(1000);
		accountManageAccountingEntryCheckPage.clickAudit();
		wait.waitFor(1000);
		accountManageAccountingEntryCheckPage.setAudit_Advice(accountManageAccountingEntryCheckBean.getAudit_Advice());
		wait.waitFor(1000);
		accountManageAccountingEntryCheckPage.clickAudit_Close();
	}

	private void checkAccountCase(AccountManageAccountingEntryCheckBean accountManageAccountingEntryCheckBean) {
		wait.waitFor(1000);
		accountManageAccountingEntryCheckPage.clickCheck();
		wait.waitFor(1000);
		accountManageAccountingEntryCheckPage.clickCheck_Close();
	}

}
