package com.dy.AutoTest.MerchantPortal.TestCases.securitycenter;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.dy.AutoTest.MerchantPortal.POJO.SCDCManagementBean;
import com.dy.AutoTest.MerchantPortal.PageObject.securitycenter.SCDCManagementPage;
import com.dy.AutoTest.web.api.SuperTest;
import com.dy.AutoTest.web.business.DataBusiness;

public class SCDCManagementPageTest extends SuperTest {

	private SCDCManagementPage sCDCManagementPage;

	private String URL = "";

	@BeforeClass
	public void init() {
		sCDCManagementPage = new SCDCManagementPage(driver);
		URL = host.toString() + DataBusiness.getData_URL("mp_SCDCManagement");
	}

	@DataProvider(name = "sCDCManagement")
	protected static Object[][] parametersPool() {
		data.loadDataBeanList("MP_Data_SCDCManagement", SCDCManagementBean.class);
		return data.getDataBeanArray();
	}

	@Test(dataProvider = "sCDCManagement", description = "商户门户-数字证书管理")
	public void testSCDCManagement(SCDCManagementBean sCDCManagementBean) {
		sCDCManagementPage.navigateTo(URL);
		wait.waitFor(500);
		
		sCDCManagementPage.clickOpenDCService();
		wait.waitFor(500);
		sCDCManagementPage.clickOpenDCService_Close();
	}

}
