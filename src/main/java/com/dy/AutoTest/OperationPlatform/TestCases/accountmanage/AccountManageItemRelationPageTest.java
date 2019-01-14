package com.dy.AutoTest.OperationPlatform.TestCases.accountmanage;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.dy.AutoTest.OperationPlatform.POJO.AccountManageItemRelationBean;
import com.dy.AutoTest.OperationPlatform.PageObject.accountmanage.AccountManageItemRelationPage;
import com.dy.AutoTest.web.api.SuperTest;
import com.dy.AutoTest.web.business.DataBusiness;

public class AccountManageItemRelationPageTest extends SuperTest {
	
	private AccountManageItemRelationPage accountManageItemRelationPage;

	private String URL = "";

	@BeforeClass
	public void init() {
		accountManageItemRelationPage = new AccountManageItemRelationPage(driver);
		URL = host.toString() + DataBusiness.getData_URL("pop_AccountManageItemRelation");
	}

	@DataProvider(name = "accountManageItemRelation")
	protected static Object[][] parametersPool() {
		data.loadDataBeanList("POP_Data_AccountManageItemRelation");
		return data.getDataBeanArray();
	}

	@Test(dataProvider = "accountManageItemRelation", description = "运营平台-科目对照关系管理")
	public void testAccountManageItemRelation(AccountManageItemRelationBean accountManageItemRelationBean) {

		accountManageItemRelationPage.navigateTo(URL);
		
		accountManageItemRelationPage.inputOnItemNO(accountManageItemRelationBean.getItemNO());
		accountManageItemRelationPage.inputOnAccountType(accountManageItemRelationBean.getAccountType());
		accountManageItemRelationPage.inputOnAccountAffiliationOrgnization(accountManageItemRelationBean.getAccountAffiliationOrgnization());
		
		accountManageItemRelationPage.clickQuery();
		
		wait.waitFor(1000);
		
		accountManageItemRelationPage.clickItemRadio(0);
		
		String caseNo = accountManageItemRelationBean.getCaseNo();

		switch (caseNo) {
		case "1":
			addCase(accountManageItemRelationBean);
			break;
		case "2":
			updateCase(accountManageItemRelationBean);
			break;
		case "3":
			displayCase(accountManageItemRelationBean);
			break;
		case "4":
			deleteCase(accountManageItemRelationBean);
			break;
		default:
			break;
		}
	}

	private void addCase(AccountManageItemRelationBean accountManageItemRelationBean) {
		accountManageItemRelationPage.clickAdd();
		
		accountManageItemRelationPage.setFocusOnAdd_AccountType();
		accountManageItemRelationPage.inputOnAdd_AccountType(accountManageItemRelationBean.getAccountType());
		
		accountManageItemRelationPage.setFocusOnAdd_MoneyType();
		accountManageItemRelationPage.inputOnAdd_MoneyType(accountManageItemRelationBean.getMoneyType());
		
		accountManageItemRelationPage.setFocusOnAdd_InternalAccountSign();
		accountManageItemRelationPage.inputOnAdd_InternalAccountSign(accountManageItemRelationBean.getInternalAccountSign());
		
		accountManageItemRelationPage.setFocusOnAdd_AccountAffiliationOrgnization();
		accountManageItemRelationPage.inputOnAdd_AccountAffiliationOrgnization(accountManageItemRelationBean.getAccountAffiliationOrgnization());
		
		accountManageItemRelationPage.setFocusOnAdd_InternalAccountBalanceDirect();
		accountManageItemRelationPage.inputOnAdd_InternalAccountBalanceDirect(accountManageItemRelationBean.getInternalAccountBalanceDirect());
		
		accountManageItemRelationPage.setFocusOnAdd_BalanceUpdateWay();
		accountManageItemRelationPage.inputOnAdd_BalanceUpdateWay(accountManageItemRelationBean.getBalanceUpdateWay());
		
		accountManageItemRelationPage.setFocusOnAdd_ManualAccountingSign();
		accountManageItemRelationPage.inputOnAdd_ManualAccountingSign(accountManageItemRelationBean.getManualAccountingSign());
		
		accountManageItemRelationPage.setFocusOnAdd_CancelAccountCategory();
		accountManageItemRelationPage.inputOnAdd_CancelAccountCategory(accountManageItemRelationBean.getCancelAccountCategory());
		
		accountManageItemRelationPage.setFocusOnAdd_ItemNum();
		accountManageItemRelationPage.inputOnAdd_ItemNum(accountManageItemRelationBean.getItemNO());
		
		accountManageItemRelationPage.setFocusOnAdd_CancelAccountType();
		accountManageItemRelationPage.inputOnAdd_CancelAccountType(accountManageItemRelationBean.getCancelAccountType());
		
		wait.waitFor(1000);
		accountManageItemRelationPage.clickAdd_Close();
	}

	private void updateCase(AccountManageItemRelationBean accountManageItemRelationBean) {
		accountManageItemRelationPage.clickUpdate();
		
		accountManageItemRelationPage.setFocusOnUpdate_InternalAccountSign();
		accountManageItemRelationPage.inputOnUpdate_InternalAccountSign(accountManageItemRelationBean.getInternalAccountSign());
		
		accountManageItemRelationPage.setFocusOnUpdate_InternalAccountBalanceDirect();
		accountManageItemRelationPage.inputOnUpdate_InternalAccountBalanceDirect(accountManageItemRelationBean.getInternalAccountBalanceDirect());
		
		accountManageItemRelationPage.setFocusOnUpdate_BalanceUpdateWay();
		accountManageItemRelationPage.inputOnUpdate_BalanceUpdateWay(accountManageItemRelationBean.getBalanceUpdateWay());
		
		accountManageItemRelationPage.setFocusOnUpdate_ManualAccountingSign();
		accountManageItemRelationPage.inputOnUpdate_ManualAccountingSign(accountManageItemRelationBean.getManualAccountingSign());
		
		accountManageItemRelationPage.setFocusOnUpdate_CancelAccountCategory();
		accountManageItemRelationPage.inputOnUpdate_CancelAccountCategory(accountManageItemRelationBean.getCancelAccountCategory());
		
		accountManageItemRelationPage.setFocusOnUpdate_CancelAccountType();
		accountManageItemRelationPage.inputOnUpdate_CancelAccountType(accountManageItemRelationBean.getCancelAccountType());
		
		wait.waitFor(1000);
		accountManageItemRelationPage.clickUpdate_Close();
	}

	private void displayCase(AccountManageItemRelationBean accountManageItemRelationBean) {
		accountManageItemRelationPage.clickCheck();
		wait.waitFor(1000);
		accountManageItemRelationPage.clickCheck_Close();
	}

	private void deleteCase(AccountManageItemRelationBean accountManageItemRelationBean) {
		accountManageItemRelationPage.clickDelete();
		wait.waitFor(1000);
		accountManageItemRelationPage.clickDelete_Close();
	}
	
}
