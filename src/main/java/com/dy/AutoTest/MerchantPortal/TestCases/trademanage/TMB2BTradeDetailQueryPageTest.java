package com.dy.AutoTest.MerchantPortal.TestCases.trademanage;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.dy.AutoTest.MerchantPortal.POJO.TMB2BTradeDetailQueryBean;
import com.dy.AutoTest.MerchantPortal.PageObject.trademanage.TMB2BTradeDetailQueryPage;
import com.dy.AutoTest.web.api.SuperTest;
import com.dy.AutoTest.web.business.DataBusiness;

public class TMB2BTradeDetailQueryPageTest extends SuperTest {

	private TMB2BTradeDetailQueryPage tMB2BTradeDetailQueryPage;

	private String URL = "";

	@BeforeClass
	public void init() {
		tMB2BTradeDetailQueryPage = new TMB2BTradeDetailQueryPage(driver);
		URL = host.toString() + DataBusiness.getData_URL("mp_TMB2BTradeDetailQuery");
	}

	@DataProvider(name = "tMB2BTradeDetailQuery")
	protected static Object[][] parametersPool() {
		data.loadDataBeanList("MP_Data_TMB2BTradeDetailQuery", TMB2BTradeDetailQueryBean.class);
		return data.getDataBeanArray();
	}

	@Test(dataProvider = "tMB2BTradeDetailQuery", description = "商户门户-B2B交易明细查询")
	public void testTMB2BTradeDetailQuery(TMB2BTradeDetailQueryBean tMB2BTradeDetailQueryBean) {
		tMB2BTradeDetailQueryPage.navigateTo(URL);
		wait.waitFor(500);
		
		tMB2BTradeDetailQueryPage.setDateBegin(tMB2BTradeDetailQueryBean.getDateBegin());
		tMB2BTradeDetailQueryPage.setDateEnd(tMB2BTradeDetailQueryBean.getDateEnd());
		tMB2BTradeDetailQueryPage.setMerchantOrderNO(tMB2BTradeDetailQueryBean.getMerchantOrderNO());
		tMB2BTradeDetailQueryPage.selectPaymentWay(tMB2BTradeDetailQueryBean.getPaymentWay());
		tMB2BTradeDetailQueryPage.selectOrderStatus(tMB2BTradeDetailQueryBean.getOrderStatus());
		
		wait.waitFor(500);
		tMB2BTradeDetailQueryPage.clickQuery();
	}

}
