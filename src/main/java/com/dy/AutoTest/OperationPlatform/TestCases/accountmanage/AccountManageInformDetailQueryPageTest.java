package com.dy.AutoTest.OperationPlatform.TestCases.accountmanage;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.dy.AutoTest.OperationPlatform.POJO.AccountManageInformDetailQueryBean;
import com.dy.AutoTest.OperationPlatform.PageObject.accountmanage.AccountManageInformDetailQueryPage;
import com.dy.AutoTest.web.api.SuperTest;
import com.dy.AutoTest.web.business.DataBusiness;

public class AccountManageInformDetailQueryPageTest extends SuperTest {
	
	private AccountManageInformDetailQueryPage accountManageInformDetailQueryPage;

	private String URL = "";

	@BeforeClass
	public void init() {
		accountManageInformDetailQueryPage = new AccountManageInformDetailQueryPage(driver);
		URL = host.toString() + DataBusiness.getData_URL("pop_AccountManageInformDetailQuery");
	}

	@DataProvider(name = "accountManageInformDetailQuery")
	protected static Object[][] parametersPool() {
		data.loadDataBeanList("POP_Data_AccountManageInformDetailQuery");
		return data.getDataBeanArray();
	}

	@Test(dataProvider = "accountManageInformDetailQuery", description = "运营平台-账户信息查询")
	public void testAccountManageInformDetailQuery(
			AccountManageInformDetailQueryBean accountManageInformDetailQueryBean) {

		accountManageInformDetailQueryPage.navigateTo(URL);
		
		accountManageInformDetailQueryPage.clickReset();
		wait.waitFor(1000);
		
		accountManageInformDetailQueryPage.setInnerUserNO(accountManageInformDetailQueryBean.getInnerUserNO());
		accountManageInformDetailQueryPage.selectAccountType(accountManageInformDetailQueryBean.getAccountType());
		accountManageInformDetailQueryPage.setAccountNO(accountManageInformDetailQueryBean.getAccountNO());
		wait.waitFor(1000);
		
		accountManageInformDetailQueryPage.clickQuery();
		wait.waitFor(1000);
		
		accountManageInformDetailQueryPage.clickAccountRadio("0");
		
		String caseNo = accountManageInformDetailQueryBean.getCaseNo();

		switch (caseNo) {
		case "1":
			displayAccountCase(accountManageInformDetailQueryBean);
			break;
		case "2":
			frozenAccountCashCase(accountManageInformDetailQueryBean);
			break;
		case "3":
			unFrozenAccountCashCase(accountManageInformDetailQueryBean);
			break;
		case "4":
			frozenAccountCase(accountManageInformDetailQueryBean);
			break;
		case "5":
			unFrozenAccountCase(accountManageInformDetailQueryBean);
			break;
		default:
			break;
		}
		
	}

	private void displayAccountCase(AccountManageInformDetailQueryBean accountManageInformDetailQueryBean) {
		accountManageInformDetailQueryPage.clickCheck();
		wait.waitFor(1000);
		accountManageInformDetailQueryPage.clickCheck_Close();
	}

	private void frozenAccountCashCase(AccountManageInformDetailQueryBean accountManageInformDetailQueryBean) {
		accountManageInformDetailQueryPage.clickAccountFrozen();
		wait.waitFor(1000);
		accountManageInformDetailQueryPage.selectAccountFrozen_FrozenType(accountManageInformDetailQueryBean.getAccountFrozen_FrozenType());
		accountManageInformDetailQueryPage.setAccountFrozen_FrozenMoney(accountManageInformDetailQueryBean.getAccountFrozen_FrozenMoney());
		accountManageInformDetailQueryPage.setAccountFrozen_Tips(accountManageInformDetailQueryBean.getAccountFrozen_Tips());
		wait.waitFor(1000);
		accountManageInformDetailQueryPage.clickAccountFrozen_Confirm();
	}

	private void unFrozenAccountCashCase(AccountManageInformDetailQueryBean accountManageInformDetailQueryBean) {
		accountManageInformDetailQueryPage.clickAccountUnfrozen();
		wait.waitFor(1000);
		accountManageInformDetailQueryPage.clickAccountUnfrozen_AccountRadio("0");
		wait.waitFor(1000);
		accountManageInformDetailQueryPage.clickAccountUnfrozen_Unfrozen();
		wait.waitFor(1000);
		accountManageInformDetailQueryPage.clickAccountUnfrozen_Unfrozen_Confirm();
		wait.waitFor(1000);
		accountManageInformDetailQueryPage.clickAccountUnfrozen_Close();
	}

	private void frozenAccountCase(AccountManageInformDetailQueryBean accountManageInformDetailQueryBean) {
		accountManageInformDetailQueryPage.clickAccountFrozen();
		wait.waitFor(1000);
		accountManageInformDetailQueryPage.selectAccountFrozen_FrozenType(accountManageInformDetailQueryBean.getAccountFrozen_FrozenType());
		accountManageInformDetailQueryPage.setAccountFrozen_Tips(accountManageInformDetailQueryBean.getAccountFrozen_Tips());
		wait.waitFor(1000);
		accountManageInformDetailQueryPage.clickAccountFrozen_Confirm();
	}

	private void unFrozenAccountCase(AccountManageInformDetailQueryBean accountManageInformDetailQueryBean) {
		accountManageInformDetailQueryPage.clickAccountUnfrozen();
		wait.waitFor(1000);
		accountManageInformDetailQueryPage.clickAccountUnfrozen_AccountRadio("0");
		wait.waitFor(1000);
		accountManageInformDetailQueryPage.clickAccountUnfrozen_Unfrozen();
		wait.waitFor(1000);
		accountManageInformDetailQueryPage.clickAccountUnfrozen_Unfrozen_Confirm();
		wait.waitFor(1000);
		accountManageInformDetailQueryPage.clickAccountUnfrozen_Close();
	}

}
