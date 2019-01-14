package com.dy.AutoTest.OnlineCashier.TestCases.accountmanage;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.dy.AutoTest.OnlineCashier.POJO.AccountManageOfflineReleaseManageBean;
import com.dy.AutoTest.OnlineCashier.PageObject.accountmanage.AccountManageOfflineReleaseManagePage;
import com.dy.AutoTest.web.api.SuperTest;
import com.dy.AutoTest.web.business.DataBusiness;

public class AccountManageOfflineReleaseManagePageTest extends SuperTest {
	
	private AccountManageOfflineReleaseManagePage accountManageOfflineReleaseManagePage;

	private String URL = "";

	@BeforeClass
	public void init() {
		accountManageOfflineReleaseManagePage = new AccountManageOfflineReleaseManagePage(driver);
		URL = host.toString() + DataBusiness.getData_URL("pop_AccountManageOfflineReleaseManage");
	}

	@DataProvider(name = "accountManageOfflineReleaseManage")
	protected static Object[][] parametersPool() {
		data.loadDataBeanList("POP_Data_AccountManageOfflineReleaseManage");
		return data.getDataBeanArray();
	}

	@Test(dataProvider = "accountManageOfflineReleaseManage", description = "运营平台-金额订单解冻管理")
	public void testAccountManageOfflineReleaseManage(
			AccountManageOfflineReleaseManageBean accountManageOfflineReleaseManageBean) {

		accountManageOfflineReleaseManagePage.navigateTo(URL);
		wait.waitFor(1000);
		
		accountManageOfflineReleaseManagePage.clickSearchMer();
		accountManageOfflineReleaseManagePage.setSearchMer_MerchantNO(accountManageOfflineReleaseManageBean.getSearchMer_MerchantNO());
		accountManageOfflineReleaseManagePage.setSearchMer_MerchantName(accountManageOfflineReleaseManageBean.getSearchMer_MerchantName());
		accountManageOfflineReleaseManagePage.clickSearchMer_Confirm();
		wait.waitFor(1000);
		accountManageOfflineReleaseManagePage.clickSearchMer_MerchantRadio("0");
		accountManageOfflineReleaseManagePage.clickSearchMer_Submit();
		
		accountManageOfflineReleaseManagePage.selectUnfrozenType(accountManageOfflineReleaseManageBean.getUnfrozenType());
		accountManageOfflineReleaseManagePage.setUnfrozenMoney(accountManageOfflineReleaseManageBean.getUnfrozenMoney());
		accountManageOfflineReleaseManagePage.setTips(accountManageOfflineReleaseManageBean.getTips());
		
		accountManageOfflineReleaseManagePage.clickConfirm();

	}

}
