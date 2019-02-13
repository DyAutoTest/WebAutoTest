package com.dy.AutoTest.MerchantPortal.TestCases.trademanage;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.dy.AutoTest.MerchantPortal.POJO.TMServiceChargeQueryBean;
import com.dy.AutoTest.MerchantPortal.PageObject.trademanage.TMServiceChargeQueryPage;
import com.dy.AutoTest.web.api.SuperTest;
import com.dy.AutoTest.web.business.DataBusiness;

public class TMServiceChargeQueryPageTest extends SuperTest {
	
	private TMServiceChargeQueryPage tMServiceChargeQueryPage;

	private String URL = "";

	@BeforeClass
	public void init() {
		tMServiceChargeQueryPage = new TMServiceChargeQueryPage(driver);
		URL = host.toString() + DataBusiness.getData_URL("mp_TMServiceChargeQuery");
	}

	@DataProvider(name = "tMServiceChargeQuery")
	protected static Object[][] parametersPool() {
		data.loadDataBeanList("MP_Data_TMServiceChargeQuery", TMServiceChargeQueryBean.class);
		return data.getDataBeanArray();
	}

	@Test(dataProvider = "tMServiceChargeQuery", description = "商户门户-手续费查询")
	public void testTMServiceChargeQuery(TMServiceChargeQueryBean tMServiceChargeQueryBean) {
		tMServiceChargeQueryPage.navigateTo(URL);
		wait.waitFor(500);
		
		tMServiceChargeQueryPage.setDateBegin(tMServiceChargeQueryBean.getDateBegin());
		tMServiceChargeQueryPage.setDateEnd(tMServiceChargeQueryBean.getDateEnd());
		tMServiceChargeQueryPage.setMerchantOrderNO(tMServiceChargeQueryBean.getMerchantOrderNO());
		tMServiceChargeQueryPage.setTradeMoney(tMServiceChargeQueryBean.getTradeMoney());
		tMServiceChargeQueryPage.selectPaymentChannel(tMServiceChargeQueryBean.getPaymentChannel());
		
		wait.waitFor(500);
		tMServiceChargeQueryPage.clickQuery();
	}

}
