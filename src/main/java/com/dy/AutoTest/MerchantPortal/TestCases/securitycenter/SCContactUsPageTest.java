package com.dy.AutoTest.MerchantPortal.TestCases.securitycenter;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.dy.AutoTest.MerchantPortal.POJO.SCContactUsBean;
import com.dy.AutoTest.MerchantPortal.PageObject.securitycenter.SCContactUsPage;
import com.dy.AutoTest.web.api.SuperTest;
import com.dy.AutoTest.web.business.DataBusiness;

public class SCContactUsPageTest extends SuperTest {

	private SCContactUsPage sCContactUsPage;

	private String URL = "";

	@BeforeClass
	public void init() {
		sCContactUsPage = new SCContactUsPage(driver);
		URL = host.toString() + DataBusiness.getData_URL("mp_SCContactUs");
	}

	@DataProvider(name = "sCContactUs")
	protected static Object[][] parametersPool() {
		data.loadDataBeanList("MP_Data_SCContactUs", SCContactUsBean.class);
		return data.getDataBeanArray();
	}

	@Test(dataProvider = "sCContactUs", description = "商户门户-联系我们")
	public void testSCDCManagement(SCContactUsBean sCContactUsBean) {
		sCContactUsPage.navigateTo(URL);
		wait.waitFor(500);
	}

}
