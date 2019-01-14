package com.dy.AutoTest.OnlineCashier.TestCases.accountmanage;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.dy.AutoTest.OnlineCashier.POJO.AccountManageAccountingEntryMaintainBean;
import com.dy.AutoTest.OnlineCashier.PageObject.accountmanage.AccountManageAccountingEntryMaintainPage;
import com.dy.AutoTest.web.api.SuperTest;
import com.dy.AutoTest.web.business.DataBusiness;

public class AccountManageAccountingEntryMaintainPageTest extends SuperTest {

	private AccountManageAccountingEntryMaintainPage accountManageAccountingEntryMaintainPage;

	private String URL = "";

	@BeforeClass
	public void init() {
		accountManageAccountingEntryMaintainPage = new AccountManageAccountingEntryMaintainPage(driver);
		URL = host.toString() + DataBusiness.getData_URL("pop_AccountManageAccountingEntryMaintain");
	}

	@DataProvider(name = "accountManageAccountingEntryMaintain")
	protected static Object[][] parametersPool() {
		data.loadDataBeanList("POP_Data_AccountManageAccountingEntryMaintain");
		return data.getDataBeanArray();
	}

	@Test(dataProvider = "accountManageAccountingEntryMaintain", description = "运营平台-会计分录维护")
	public void testAccountManageAccountingEntryMaintain(
			AccountManageAccountingEntryMaintainBean accountManageAccountingEntryMaintainBean) {

		accountManageAccountingEntryMaintainPage.navigateTo(URL);
		
		wait.waitFor(1000);
		accountManageAccountingEntryMaintainPage.clickReset();
		wait.waitFor(1000);
		
		accountManageAccountingEntryMaintainPage.selectProductsCode(accountManageAccountingEntryMaintainBean.getProductsCode());
		accountManageAccountingEntryMaintainPage.selectTradeType(accountManageAccountingEntryMaintainBean.getTradeType());
		accountManageAccountingEntryMaintainPage.selectStatus(accountManageAccountingEntryMaintainBean.getStatus());
		
		wait.waitFor(1000);
		accountManageAccountingEntryMaintainPage.clickQuery();
		wait.waitFor(1000);
		accountManageAccountingEntryMaintainPage.clickEntryRadio("0");
		
		String caseNo = accountManageAccountingEntryMaintainBean.getCaseNo();

		switch (caseNo) {
		case "1":
			addAccountCase(accountManageAccountingEntryMaintainBean);
			break;
		case "2":
			checkAccountCase(accountManageAccountingEntryMaintainBean);
			break;
		default:
			break;
		}
	}

	private void addAccountCase(AccountManageAccountingEntryMaintainBean accountManageAccountingEntryMaintainBean) {
		wait.waitFor(1000);
		accountManageAccountingEntryMaintainPage.clickAdd();
		wait.waitFor(1000);
		accountManageAccountingEntryMaintainPage.selectAdd_OwnershipInstitution(accountManageAccountingEntryMaintainBean.getAdd_OwnershipInstitution());
		accountManageAccountingEntryMaintainPage.selectAdd_ProductCode(accountManageAccountingEntryMaintainBean.getAdd_ProductCode());
		accountManageAccountingEntryMaintainPage.selectAdd_TradeType(accountManageAccountingEntryMaintainBean.getAdd_TradeType());
		accountManageAccountingEntryMaintainPage.selectAdd_BusinessSubtype(accountManageAccountingEntryMaintainBean.getAdd_BusinessSubtype());
		
		accountManageAccountingEntryMaintainPage.selectAdd_AccountType(accountManageAccountingEntryMaintainBean.getAdd_AccountType());
		accountManageAccountingEntryMaintainPage.selectAdd_BorrowingMarks(accountManageAccountingEntryMaintainBean.getAdd_BorrowingMarks());
		accountManageAccountingEntryMaintainPage.setAdd_FeatureCode(accountManageAccountingEntryMaintainBean.getAdd_FeatureCode());
		
		accountManageAccountingEntryMaintainPage.selectAdd_AccountType2(accountManageAccountingEntryMaintainBean.getAdd_AccountType2());
		accountManageAccountingEntryMaintainPage.selectAdd_BorrowingMarks2(accountManageAccountingEntryMaintainBean.getAdd_BorrowingMarks2());
		accountManageAccountingEntryMaintainPage.setAdd_FeatureCode2(accountManageAccountingEntryMaintainBean.getAdd_FeatureCode2());
		
		wait.waitFor(1000);
		accountManageAccountingEntryMaintainPage.clickAdd_Submit();
	}

	private void checkAccountCase(AccountManageAccountingEntryMaintainBean accountManageAccountingEntryMaintainBean) {
		wait.waitFor(1000);
		accountManageAccountingEntryMaintainPage.clickCheck();
		wait.waitFor(1000);
		accountManageAccountingEntryMaintainPage.clickCheck_Close();
	}

}
