package com.dy.AutoTest.OnlineCashier.TestCases.accountmanage;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.dy.AutoTest.OnlineCashier.POJO.AccountManageManualAccountCheckBean;
import com.dy.AutoTest.OnlineCashier.PageObject.accountmanage.AccountManageManualAccountCheckPage;
import com.dy.AutoTest.web.api.SuperTest;
import com.dy.AutoTest.web.business.DataBusiness;

public class AccountManageManualAccountCheckPageTest extends SuperTest {
	private AccountManageManualAccountCheckPage accountManageManualAccountCheckPage;

	private String URL = "";

	@BeforeClass
	public void init() {
		accountManageManualAccountCheckPage = new AccountManageManualAccountCheckPage(driver);
		URL = host.toString() + DataBusiness.getData_URL("pop_AccountManageManualAccountCheck");
	}

	@DataProvider(name = "accountManageManualAccountCheck")
	protected static Object[][] parametersPool() {
		data.loadDataBeanList("POP_Data_AccountManageManualAccountCheck");
		return data.getDataBeanArray();
	}

	@Test(dataProvider = "accountManageManualAccountCheck", description = "运营平台-手工记账审核")
	public void testAccountManageManualAccountCheck(
			AccountManageManualAccountCheckBean accountManageManualAccountCheckBean) {

		accountManageManualAccountCheckPage.navigateTo(URL);
		wait.waitFor(1000);
		
		accountManageManualAccountCheckPage.clickReset();
		
		accountManageManualAccountCheckPage.setSerialNum(accountManageManualAccountCheckBean.getSerialNum());
		accountManageManualAccountCheckPage.selectStatus(accountManageManualAccountCheckBean.getStatus());
		accountManageManualAccountCheckPage.setDateBegin(accountManageManualAccountCheckBean.getDateBegin());
		accountManageManualAccountCheckPage.setDateEnd(accountManageManualAccountCheckBean.getDateEnd());
		
		accountManageManualAccountCheckPage.clickQuery();
		
		accountManageManualAccountCheckPage.clickSelectionButton("0");
		
		accountManageManualAccountCheckPage.clickCheck();
		wait.waitFor(1000);
		accountManageManualAccountCheckPage.setCheck_CheckingTip(accountManageManualAccountCheckBean.getComment());
		wait.waitFor(1000);
		accountManageManualAccountCheckPage.clickCheck_Close();
	}

}
