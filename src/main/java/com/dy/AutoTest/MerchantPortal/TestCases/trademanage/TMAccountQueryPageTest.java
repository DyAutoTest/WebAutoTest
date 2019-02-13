package com.dy.AutoTest.MerchantPortal.TestCases.trademanage;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.dy.AutoTest.MerchantPortal.POJO.TMAccountQueryBean;
import com.dy.AutoTest.MerchantPortal.PageObject.trademanage.TMAccountQueryPage;
import com.dy.AutoTest.web.api.SuperTest;
import com.dy.AutoTest.web.business.DataBusiness;

public class TMAccountQueryPageTest extends SuperTest {
	
	private TMAccountQueryPage tMAccountQueryPage;

	private String URL = "";

	@BeforeClass
	public void init() {
		tMAccountQueryPage = new TMAccountQueryPage(driver);
		URL = host.toString() + DataBusiness.getData_URL("mp_TMAccountQuery");
	}

	@DataProvider(name = "tMAccountQuery")
	protected static Object[][] parametersPool() {
		data.loadDataBeanList("MP_Data_TMAccountQuery", TMAccountQueryBean.class);
		return data.getDataBeanArray();
	}

	@Test(dataProvider = "tMAccountQuery", description = "商户门户-账户查询")
	public void testTMAccountQuery(TMAccountQueryBean tMAccountQueryBean) {
		tMAccountQueryPage.navigateTo(URL);
		wait.waitFor(500);
		
		tMAccountQueryPage.setDateBegin(tMAccountQueryBean.getDateBegin());
		tMAccountQueryPage.setDateEnd(tMAccountQueryBean.getDateEnd());
		tMAccountQueryPage.selectTradeType(tMAccountQueryBean.getTradeType());
		tMAccountQueryPage.selectAccountType(tMAccountQueryBean.getAccountType());
		tMAccountQueryPage.selectIncomeExpensesSign(tMAccountQueryBean.getIncomeExpensesSign());
		tMAccountQueryPage.setMerchantOrderNO(tMAccountQueryBean.getMerchantOrderNO());
		
		wait.waitFor(500);
		tMAccountQueryPage.clickQuery();
	}

}
