package com.dy.AutoTest.OnlineCashier.TestCases.accountmanage;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.dy.AutoTest.OnlineCashier.POJO.AccountManageAccountOrgnizationManageBean;
import com.dy.AutoTest.OnlineCashier.PageObject.accountmanage.AccountManageAccountOrgnizationManagePage;
import com.dy.AutoTest.web.api.SuperTest;
import com.dy.AutoTest.web.business.DataBusiness;

public class AccountManageAccountOrgnizationManagePageTest extends SuperTest {

	private AccountManageAccountOrgnizationManagePage accountManageAccountOrgnizationManagePage;

	private String URL = "";

	@BeforeClass
	public void init() {
		accountManageAccountOrgnizationManagePage = new AccountManageAccountOrgnizationManagePage(driver);
		URL = host.toString() + DataBusiness.getData_URL("pop_AccountManageAccountOrgnizationManage");
	}

	@DataProvider(name = "accountManageAccountOrgnizationManage")
	protected static Object[][] parametersPool() {
		data.loadDataBeanList("POP_Data_AccountManageAccountOrgnizationManage");
		return data.getDataBeanArray();
	}

	@Test(dataProvider = "accountManageAccountOrgnizationManage", description = "运营平台-会计机构管理")
	public void testAccountManageAccountOrgnizationManage(
			AccountManageAccountOrgnizationManageBean accountManageAccountOrgnizationManageBean) {
		
		accountManageAccountOrgnizationManagePage.navigateTo(URL);
		wait.waitFor(1000);
		
		accountManageAccountOrgnizationManagePage.clickOrgnizationRadio("0");
		wait.waitFor(1000);
		
		accountManageAccountOrgnizationManagePage.clickCheck();
		wait.waitFor(1000);
		
		accountManageAccountOrgnizationManagePage.clickCheck_Close();
	}

}
