package com.dy.AutoTest.OperationPlatform.TestCases.accountmanage;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.dy.AutoTest.OperationPlatform.POJO.AccountManageOfflineFreezeManageBean;
import com.dy.AutoTest.OperationPlatform.PageObject.accountmanage.AccountManageOfflineFreezeManagePage;
import com.dy.AutoTest.web.api.SuperTest;
import com.dy.AutoTest.web.business.DataBusiness;

public class AccountManageOfflineFreezeManagePageTest extends SuperTest {
	
	private AccountManageOfflineFreezeManagePage accountManageOfflineFreezeManagePage;

	private String URL = "";

	@BeforeClass
	public void init() {
		accountManageOfflineFreezeManagePage = new AccountManageOfflineFreezeManagePage(driver);
		URL = host.toString() + DataBusiness.getData_URL("pop_AccountManageOfflineFreezeManage");
	}

	@DataProvider(name = "accountManageOfflineFreezeManage")
	protected static Object[][] parametersPool() {
		data.loadDataBeanList("POP_Data_AccountManageOfflineFreezeManage");
		return data.getDataBeanArray();
	}

	@Test(dataProvider = "accountManageOfflineFreezeManage", description = "运营平台-金额订单冻结管理")
	public void testAccountManageOfflineFreezeManage(
			AccountManageOfflineFreezeManageBean accountManageOfflineFreezeManageBean) {

		accountManageOfflineFreezeManagePage.navigateTo(URL);
		wait.waitFor(1000);
		
		accountManageOfflineFreezeManagePage.clickSearchMer();
		accountManageOfflineFreezeManagePage.setSearchMer_MerchantNO(accountManageOfflineFreezeManageBean.getSearchMer_MerchantNO());
		accountManageOfflineFreezeManagePage.setSearchMer_MerchantName(accountManageOfflineFreezeManageBean.getSearchMer_MerchantName());
		accountManageOfflineFreezeManagePage.clickSearchMer_Confirm();
		wait.waitFor(1000);
		accountManageOfflineFreezeManagePage.clickSearchMer_MerchantRadio("0");
		accountManageOfflineFreezeManagePage.clickSearchMer_Submit();
		
		accountManageOfflineFreezeManagePage.selectFrozenType(accountManageOfflineFreezeManageBean.getFrozenType());
		accountManageOfflineFreezeManagePage.setFrozenMoney(accountManageOfflineFreezeManageBean.getFrozenMoney());
		accountManageOfflineFreezeManagePage.setTips(accountManageOfflineFreezeManageBean.getTips());
		
		accountManageOfflineFreezeManagePage.clickConfirm();

	}

}
