package com.dy.AutoTest.MerchantPortal.TestCases.helper;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.dy.AutoTest.MerchantPortal.POJO.HelpCenterBean;
import com.dy.AutoTest.MerchantPortal.PageObject.helper.HelpCenterPage;
import com.dy.AutoTest.web.api.SuperTest;
import com.dy.AutoTest.web.business.DataBusiness;

public class HelpCenterPageTest  extends SuperTest {
	
	private HelpCenterPage helpCenterPage;

	private String URL = "";

	@BeforeClass
	public void init() {
		helpCenterPage = new HelpCenterPage(driver);
		URL = host.toString() + DataBusiness.getData_URL("mp_HelpCenter");
	}

	@DataProvider(name = "helpCenter")
	protected static Object[][] parametersPool() {
		data.loadDataBeanList("MP_Data_HelpCenter", HelpCenterBean.class);
		return data.getDataBeanArray();
	}

	@Test(dataProvider = "helpCenter", description = "商户门户-帮助中心")
	public void testHelpCenter(HelpCenterBean helpCenterBean) {
		wait.waitFor(500);
		helpCenterPage.navigateTo(URL);
		wait.waitFor(500);
	}
	
}
