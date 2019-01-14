package com.dy.AutoTest.MerchantPortal.TestCases.myinfo;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.dy.AutoTest.MerchantPortal.POJO.AccountInfoBean;
import com.dy.AutoTest.MerchantPortal.PageObject.myinfo.AccountInfoPage;
import com.dy.AutoTest.web.api.SuperTest;
import com.dy.AutoTest.web.business.DataBusiness;

public class AccountInfoPageTest extends SuperTest {

	private AccountInfoPage accountInfoPage;

	private String URL = "";

	@BeforeClass
	public void init() {
		accountInfoPage = new AccountInfoPage(driver);
		URL = host.toString() + DataBusiness.getData_URL("mp_MMAccountInfo");
	}

	@DataProvider(name = "accountInfo")
	protected static Object[][] parametersPool() {
		data.loadDataBeanList("MP_Data_AccountInfo", AccountInfoBean.class);
		return data.getDataBeanArray();
	}

	@Test(dataProvider = "accountInfo", description = "商户门户-账户信息")
	public void testAccountInfo(AccountInfoBean accountInfoBean) {
		accountInfoPage.navigateTo(URL);
		wait.waitFor(500);
	}

}
