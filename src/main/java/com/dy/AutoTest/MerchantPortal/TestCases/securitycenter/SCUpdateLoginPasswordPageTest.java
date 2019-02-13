package com.dy.AutoTest.MerchantPortal.TestCases.securitycenter;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.dy.AutoTest.MerchantPortal.POJO.SCUpdateLoginPasswordBean;
import com.dy.AutoTest.MerchantPortal.PageObject.securitycenter.SCUpdateLoginPasswordPage;
import com.dy.AutoTest.web.api.SuperTest;
import com.dy.AutoTest.web.business.DataBusiness;

public class SCUpdateLoginPasswordPageTest extends SuperTest {

	private SCUpdateLoginPasswordPage sCUpdateLoginPasswordPage;

	private String URL = "";

	@BeforeClass
	public void init() {
		sCUpdateLoginPasswordPage = new SCUpdateLoginPasswordPage(driver);
		URL = host.toString() + DataBusiness.getData_URL("mp_SCUpdateLoginPassword");
	}

	@DataProvider(name = "sCUpdateLoginPassword")
	protected static Object[][] parametersPool() {
		data.loadDataBeanList("MP_Data_SCUpdateLoginPassword", SCUpdateLoginPasswordBean.class);
		return data.getDataBeanArray();
	}

	@Test(dataProvider = "sCUpdateLoginPassword", description = "商户门户-修改登录密码")
	public void testSCUpdateLoginPassword(SCUpdateLoginPasswordBean sCUpdateLoginPasswordBean) {
		sCUpdateLoginPasswordPage.navigateTo(URL);
		wait.waitFor(500);
		
		sCUpdateLoginPasswordPage.setOriginLoginPassword(sCUpdateLoginPasswordBean.getOriginLoginPassword());
		sCUpdateLoginPasswordPage.setNewLoginPassword(sCUpdateLoginPasswordBean.getNewLoginPassword());
		sCUpdateLoginPasswordPage.setConfirmNewLoginPassword(sCUpdateLoginPasswordBean.getConfirmNewLoginPassword());
		
		wait.waitFor(500);
		sCUpdateLoginPasswordPage.clickSave();
//		wait.waitFor(500);
//		sCUpdateLoginPasswordPage.clickConfirm();
	}

}
