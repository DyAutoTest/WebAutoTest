package com.dy.AutoTest.MerchantPortal.TestCases.trademanage;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.dy.AutoTest.MerchantPortal.POJO.TMSettleAccountsQueryBean;
import com.dy.AutoTest.MerchantPortal.PageObject.trademanage.TMSettleAccountsQueryPage;
import com.dy.AutoTest.web.api.SuperTest;
import com.dy.AutoTest.web.business.DataBusiness;

public class TMSettleAccountsQueryPageTest extends SuperTest {
	
	private TMSettleAccountsQueryPage tMSettleAccountsQueryPage;

	private String URL = "";

	@BeforeClass
	public void init() {
		tMSettleAccountsQueryPage = new TMSettleAccountsQueryPage(driver);
		URL = host.toString() + DataBusiness.getData_URL("mp_TMSettleAccountsQuery");
	}

	@DataProvider(name = "tMSettleAccountsQuery")
	protected static Object[][] parametersPool() {
		data.loadDataBeanList("MP_Data_TMSettleAccountsQuery", TMSettleAccountsQueryBean.class);
		return data.getDataBeanArray();
	}

	@Test(dataProvider = "tMSettleAccountsQuery", description = "商户门户-结算查询")
	public void testTMAccountQuery(TMSettleAccountsQueryBean tMSettleAccountsQueryBean) {
		tMSettleAccountsQueryPage.navigateTo(URL);
		wait.waitFor(500);
		
		tMSettleAccountsQueryPage.setDateBegin(tMSettleAccountsQueryBean.getDateBegin());
		tMSettleAccountsQueryPage.setDateEnd(tMSettleAccountsQueryBean.getDateEnd());
		tMSettleAccountsQueryPage.selectSettleAccountType(tMSettleAccountsQueryBean.getSettleAccountType());
		tMSettleAccountsQueryPage.selectSettleAccountStatus(tMSettleAccountsQueryBean.getSettleAccountStatus());
		tMSettleAccountsQueryPage.setWithdrawDepositMoney(tMSettleAccountsQueryBean.getWithdrawDepositMoney());
		
		wait.waitFor(500);
		tMSettleAccountsQueryPage.clickQuery();
	}

}
