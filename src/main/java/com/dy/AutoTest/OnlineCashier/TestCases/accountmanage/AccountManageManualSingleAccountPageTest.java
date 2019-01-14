package com.dy.AutoTest.OnlineCashier.TestCases.accountmanage;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.dy.AutoTest.OnlineCashier.POJO.AccountManageManualSingleAccountBean;
import com.dy.AutoTest.OnlineCashier.PageObject.accountmanage.AccountManageManualSingleAccountPage;
import com.dy.AutoTest.web.api.SuperTest;
import com.dy.AutoTest.web.business.DataBusiness;

public class AccountManageManualSingleAccountPageTest extends SuperTest {

	private AccountManageManualSingleAccountPage accountManageManualSingleAccountPage;

	private String URL = "";

	@BeforeClass
	public void init() {
		accountManageManualSingleAccountPage = new AccountManageManualSingleAccountPage(driver);
		URL = host.toString() + DataBusiness.getData_URL("pop_AccountManageManualSingleAccount");
	}

	@DataProvider(name = "accountManageManualSingleAccount")
	protected static Object[][] parametersPool() {
		data.loadDataBeanList("POP_Data_AccountManageManualSingleAccount");
		return data.getDataBeanArray();
	}

	@Test(dataProvider = "accountManageManualSingleAccount", description = "运营平台-手工单笔记账")
	public void testAccountManageManualSingleAccount(
			AccountManageManualSingleAccountBean accountManageManualSingleAccountBean) {

		accountManageManualSingleAccountPage.navigateTo(URL);
		wait.waitFor(1000);
		
		accountManageManualSingleAccountPage.setIN_AccountNum(accountManageManualSingleAccountBean.getIN_AccountNum());
		wait.waitFor(1000);
		accountManageManualSingleAccountPage.setEX_AccountNum(accountManageManualSingleAccountBean.getEX_AccountNum());
		wait.waitFor(1000);
		
		
		accountManageManualSingleAccountPage.clickIN_Inner();
		
		accountManageManualSingleAccountPage.setInner_InnerAccountNO(accountManageManualSingleAccountBean.getInnerAccountNO());
		wait.waitFor(1000);
		accountManageManualSingleAccountPage.setInner_AccountName(accountManageManualSingleAccountBean.getInnerAccountName());
		wait.waitFor(1000);
		accountManageManualSingleAccountPage.clickInner_Search();
		accountManageManualSingleAccountPage.clickInner_AccountRadio("0");
		accountManageManualSingleAccountPage.clickInner_Confirm();
		
		accountManageManualSingleAccountPage.selectIN_Cash(accountManageManualSingleAccountBean.getIN_Cash());
		accountManageManualSingleAccountPage.selectIN_MoneyType(accountManageManualSingleAccountBean.getIN_MoneyType());
		accountManageManualSingleAccountPage.clickIN_SearchBalance();
		
		accountManageManualSingleAccountPage.setIN_Money(accountManageManualSingleAccountBean.getIN_Money());
		accountManageManualSingleAccountPage.setIN_Tips(accountManageManualSingleAccountBean.getIN_Tips());
		accountManageManualSingleAccountPage.selectIN_BorrowOrLoan(accountManageManualSingleAccountBean.getIN_BorrowOrLoan());
		accountManageManualSingleAccountPage.setIN_TradeDate(accountManageManualSingleAccountBean.getIN_TradeDate());
		
		
		wait.waitFor(1000);
		accountManageManualSingleAccountPage.clickEX_External();
		
		accountManageManualSingleAccountPage.setExternal_NO(accountManageManualSingleAccountBean.getExternalAccountNO());
		accountManageManualSingleAccountPage.clickExternal_Search();
		accountManageManualSingleAccountPage.clickExternal_AccountRadio("0");
		accountManageManualSingleAccountPage.clickExternal_Confirm();
		
		accountManageManualSingleAccountPage.selectEX_Cash(accountManageManualSingleAccountBean.getEX_Cash());
		accountManageManualSingleAccountPage.selectEX_MoneyType(accountManageManualSingleAccountBean.getEX_MoneyType());
		accountManageManualSingleAccountPage.clickEX_SearchBalance();
		
		accountManageManualSingleAccountPage.setEX_Money(accountManageManualSingleAccountBean.getEX_Money());
		accountManageManualSingleAccountPage.setEX_Tips(accountManageManualSingleAccountBean.getEX_Tips());
		accountManageManualSingleAccountPage.selectEX_BorrowOrLoan(accountManageManualSingleAccountBean.getEX_BorrowOrLoan());
		accountManageManualSingleAccountPage.setEX_TradeDate(accountManageManualSingleAccountBean.getEX_TradeDate());
		
		wait.waitFor(1000);
		accountManageManualSingleAccountPage.clickCheckDebitCreditBalance();
		wait.waitFor(1000);
//		accountManageManualSingleAccountPage.clickConfirm();
	}

}
