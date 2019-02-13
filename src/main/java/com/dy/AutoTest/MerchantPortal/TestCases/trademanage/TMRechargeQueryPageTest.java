package com.dy.AutoTest.MerchantPortal.TestCases.trademanage;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.dy.AutoTest.MerchantPortal.POJO.TMRechargeQueryBean;
import com.dy.AutoTest.MerchantPortal.PageObject.trademanage.TMRechargeQueryPage;
import com.dy.AutoTest.web.api.SuperTest;
import com.dy.AutoTest.web.business.DataBusiness;

public class TMRechargeQueryPageTest extends SuperTest {
	
	private TMRechargeQueryPage tMRechargeQueryPage;

	private String URL = "";

	@BeforeClass
	public void init() {
		tMRechargeQueryPage = new TMRechargeQueryPage(driver);
		URL = host.toString() + DataBusiness.getData_URL("mp_TMRechargeQuery");
	}

	@DataProvider(name = "tMRechargeQuery")
	protected static Object[][] parametersPool() {
		data.loadDataBeanList("MP_Data_TMRechargeQuery", TMRechargeQueryBean.class);
		return data.getDataBeanArray();
	}

	@Test(dataProvider = "tMRechargeQuery", description = "商户门户-充值查询")
	public void testTMRechargeQuery(TMRechargeQueryBean tMRechargeQueryBean) {
		tMRechargeQueryPage.navigateTo(URL);
		wait.waitFor(500);
		
		tMRechargeQueryPage.setDateBegin(tMRechargeQueryBean.getDateBegin());
		tMRechargeQueryPage.setDateEnd(tMRechargeQueryBean.getDateEnd());
		tMRechargeQueryPage.setRechargeOrderNO(tMRechargeQueryBean.getRechargeOrderNO());
		tMRechargeQueryPage.selectRechargeWay(tMRechargeQueryBean.getRechargeWay());
		tMRechargeQueryPage.setRechargeMoney(tMRechargeQueryBean.getRechargeMoney());
		tMRechargeQueryPage.selectOrderStatus(tMRechargeQueryBean.getOrderStatus());
		
		wait.waitFor(500);
		tMRechargeQueryPage.clickQuery();
	}

}
