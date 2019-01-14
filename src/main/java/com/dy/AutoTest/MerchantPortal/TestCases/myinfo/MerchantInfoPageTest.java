package com.dy.AutoTest.MerchantPortal.TestCases.myinfo;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.dy.AutoTest.MerchantPortal.POJO.MerchantInfoBean;
import com.dy.AutoTest.MerchantPortal.PageObject.myinfo.MerchantInfoPage;
import com.dy.AutoTest.web.api.SuperTest;
import com.dy.AutoTest.web.business.DataBusiness;

public class MerchantInfoPageTest extends SuperTest {

	private MerchantInfoPage merchantInfoPage;

	private String URL = "";

	@BeforeClass
	public void init() {
		merchantInfoPage = new MerchantInfoPage(driver);
		URL = host.toString() + DataBusiness.getData_URL("mp_MerchantInfo");
	}

	@DataProvider(name = "merchantInfo")
	protected static Object[][] parametersPool() {
		data.loadDataBeanList("MP_Data_MerchantInfo", MerchantInfoBean.class);
		return data.getDataBeanArray();
	}

	@Test(dataProvider = "merchantInfo", description = "商户门户-商户信息")
	public void testMerchantInfo(MerchantInfoBean merchantInfoBean) {
		merchantInfoPage.navigateTo(URL);
		wait.waitFor(500);
	}

}
