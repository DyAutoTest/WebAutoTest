package com.dy.AutoTest.OperationPlatform.TestCases.accountmanage;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.dy.AutoTest.OperationPlatform.POJO.AccountManageInternalAccountManageBean;
import com.dy.AutoTest.OperationPlatform.PageObject.accountmanage.AccountManageInternalAccountManagePage;
import com.dy.AutoTest.web.api.SuperTest;
import com.dy.AutoTest.web.business.DataBusiness;

public class AccountManageInternalAccountManagePageTest extends SuperTest {
	
	private AccountManageInternalAccountManagePage accountManageInternalAccountManagePage;

	private String URL = "";

	@BeforeClass
	public void init() {
		accountManageInternalAccountManagePage = new AccountManageInternalAccountManagePage(driver);
		URL = host.toString() + DataBusiness.getData_URL("pop_AccountManageInternalAccountManage");
	}

	@DataProvider(name = "accountManageInternalAccountManage")
	protected static Object[][] parametersPool() {
		data.loadDataBeanList("POP_Data_AccountManageInternalAccountManage");
		return data.getDataBeanArray();
	}

	@Test(dataProvider = "accountManageInternalAccountManage", description = "运营平台-内部账户管理")
	public void testAccountManageInternalAccountManage(AccountManageInternalAccountManageBean accountManageInternalAccountManageBean) {

		accountManageInternalAccountManagePage.navigateTo(URL);
		
		accountManageInternalAccountManagePage.inputOnInternalAccountType(accountManageInternalAccountManageBean.getInternalAccountType());
		accountManageInternalAccountManagePage.inputOnInternalAccountNO(accountManageInternalAccountManageBean.getInternalAccountNO());
		accountManageInternalAccountManagePage.inputOnStatus(accountManageInternalAccountManageBean.getStatus());
		
		accountManageInternalAccountManagePage.clickQuery();
		
		wait.waitFor(1000);
		
		accountManageInternalAccountManagePage.clickAccountRadio(0);
		
		String caseNo = accountManageInternalAccountManageBean.getCaseNo();

		switch (caseNo) {
		case "1":
			openAccountCase(accountManageInternalAccountManageBean);
			break;
		case "2":
			cancelAccountCase(accountManageInternalAccountManageBean);
			break;
		case "3":
			displayAccountCase(accountManageInternalAccountManageBean);
			break;
		default:
			break;
		}
	}

	private void openAccountCase(AccountManageInternalAccountManageBean accountManageInternalAccountManageBean) {
		accountManageInternalAccountManagePage.clickOpenAccount();
		
		accountManageInternalAccountManagePage.setFocusOnOpenAccount_InternalAccountType();
		accountManageInternalAccountManagePage.inputOnOpenAccount_InternalAccountType(accountManageInternalAccountManageBean.getInternalAccountType());
		
		accountManageInternalAccountManagePage.setFocusOnOpenAccount_InternalAccountName();
		accountManageInternalAccountManagePage.inputOnOpenAccount_InternalAccountName(accountManageInternalAccountManageBean.getInternalAccountName());
		
		accountManageInternalAccountManagePage.setFocusOnOpenAccount_ConditionCode();
		accountManageInternalAccountManagePage.inputOnOpenAccount_ConditionCode(accountManageInternalAccountManageBean.getConditionCode());
		
		accountManageInternalAccountManagePage.setFocusOnOpenAccount_AccountsBelongingOrgnization();
		accountManageInternalAccountManagePage.inputOnOpenAccount_AccountsBelongingOrgnization(accountManageInternalAccountManageBean.getAccountsBelongingOrgnization());
		
		wait.waitFor(1000);
		accountManageInternalAccountManagePage.clickOpenAccount_Close();
	}

	private void cancelAccountCase(AccountManageInternalAccountManageBean accountManageInternalAccountManageBean) {
		accountManageInternalAccountManagePage.clickCloseAccount();
		wait.waitFor(1000);
		accountManageInternalAccountManagePage.clickCloseAccount_Close();
	}

	private void displayAccountCase(AccountManageInternalAccountManageBean accountManageInternalAccountManageBean) {
		accountManageInternalAccountManagePage.clickCheck();
		wait.waitFor(1000);
		accountManageInternalAccountManagePage.clickCheck_Close();
	}
	
}
