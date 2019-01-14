package com.dy.AutoTest.MerchantPortal.TestCases.trademanage;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.dy.AutoTest.MerchantPortal.POJO.TMB2BTradeSummaryQueryBean;
import com.dy.AutoTest.MerchantPortal.PageObject.trademanage.TMB2BTradeSummaryQueryPage;
import com.dy.AutoTest.web.api.SuperTest;
import com.dy.AutoTest.web.business.DataBusiness;

public class TMB2BTradeSummaryQueryPageTest extends SuperTest {

	private TMB2BTradeSummaryQueryPage tMB2BTradeSummaryQueryPage;

	private String URL = "";

	@BeforeClass
	public void init() {
		tMB2BTradeSummaryQueryPage = new TMB2BTradeSummaryQueryPage(driver);
		URL = host.toString() + DataBusiness.getData_URL("mp_TMB2BTradeSummaryQuery");
	}

	@DataProvider(name = "tMB2BTradeSummaryQuery")
	protected static Object[][] parametersPool() {
		data.loadDataBeanList("MP_Data_TMB2BTradeSummaryQuery", TMB2BTradeSummaryQueryBean.class);
		return data.getDataBeanArray();
	}

	@Test(dataProvider = "tMB2BTradeSummaryQuery", description = "商户门户-B2B交易汇总查询")
	public void testTMB2BTradeSummaryQuery(TMB2BTradeSummaryQueryBean tMB2BTradeSummaryQueryBean) {
		tMB2BTradeSummaryQueryPage.navigateTo(URL);
		wait.waitFor(500);
		
		tMB2BTradeSummaryQueryPage.setDateBegin(tMB2BTradeSummaryQueryBean.getDateBegin());
		tMB2BTradeSummaryQueryPage.setDateEnd(tMB2BTradeSummaryQueryBean.getDateEnd());
		tMB2BTradeSummaryQueryPage.setMerchantOrderNO(tMB2BTradeSummaryQueryBean.getMerchantOrderNO());
		tMB2BTradeSummaryQueryPage.selectPaymentWay(tMB2BTradeSummaryQueryBean.getPaymentWay());
		tMB2BTradeSummaryQueryPage.selectPaymentChannel(tMB2BTradeSummaryQueryBean.getPaymentChannel());
		tMB2BTradeSummaryQueryPage.selectOrderStatus(tMB2BTradeSummaryQueryBean.getOrderStatus());
		
		wait.waitFor(500);
		tMB2BTradeSummaryQueryPage.clickQuery();
		wait.waitFor(500);
		tMB2BTradeSummaryQueryPage.clickDetail();
		wait.waitFor(500);
		tMB2BTradeSummaryQueryPage.clickDetail_Close();
	}

}
