package com.dy.AutoTest.MerchantPortal.TestCases.securitycenter;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.dy.AutoTest.MerchantPortal.POJO.SCLogManagementBean;
import com.dy.AutoTest.MerchantPortal.PageObject.securitycenter.SCLogManagementPage;
import com.dy.AutoTest.web.api.SuperTest;
import com.dy.AutoTest.web.business.DataBusiness;

public class SCLogManagementPageTest extends SuperTest {

	private SCLogManagementPage sCLogManagementPage;

	private String URL = "";

	@BeforeClass
	public void init() {
		sCLogManagementPage = new SCLogManagementPage(driver);
		URL = host.toString() + DataBusiness.getData_URL("mp_SCLogManagement");
	}

	@DataProvider(name = "sCLogManagement")
	protected static Object[][] parametersPool() {
		data.loadDataBeanList("MP_Data_SCLogManagement", SCLogManagementBean.class);
		return data.getDataBeanArray();
	}

	@Test(dataProvider = "sCLogManagement", description = "商户门户-日志管理")
	public void testSCLogManagement(SCLogManagementBean sCLogManagementBean) {
		sCLogManagementPage.navigateTo(URL);
		wait.waitFor(500);
		
		sCLogManagementPage.setDateBegin(sCLogManagementBean.getDateBegin());
		sCLogManagementPage.setDateEnd(sCLogManagementBean.getDateEnd());
		wait.waitFor(500);
		sCLogManagementPage.clickQuery();
	}

}
