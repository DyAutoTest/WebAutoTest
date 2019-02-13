package com.dy.AutoTest.MerchantPortal.TestCases.securitycenter;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.dy.AutoTest.MerchantPortal.POJO.SCUpdatePaymentPasswordBean;
import com.dy.AutoTest.MerchantPortal.PageObject.securitycenter.SCUpdatePaymentPasswordPage;
import com.dy.AutoTest.web.api.SuperTest;
import com.dy.AutoTest.web.business.DataBusiness;

public class SCUpdatePaymentPasswordPageTest extends SuperTest {

	private SCUpdatePaymentPasswordPage sCUpdatePaymentPasswordPage;

	private String URL = "";

	@BeforeClass
	public void init() {
		sCUpdatePaymentPasswordPage = new SCUpdatePaymentPasswordPage(driver);
		URL = host.toString() + DataBusiness.getData_URL("mp_SCUpdatePaymentPassword");
	}

	@DataProvider(name = "sCUpdatePaymentPassword")
	protected static Object[][] parametersPool() {
		data.loadDataBeanList("MP_Data_SCUpdatePaymentPassword", SCUpdatePaymentPasswordBean.class);
		return data.getDataBeanArray();
	}

	@Test(dataProvider = "sCUpdatePaymentPassword", description = "商户门户-修改支付密码")
	public void testSCUpdatePaymentPassword(SCUpdatePaymentPasswordBean sCUpdatePaymentPasswordBean) {
		sCUpdatePaymentPasswordPage.navigateTo(URL);
		wait.waitFor(500);
		
		sCUpdatePaymentPasswordPage.setOriginPaymentPassword(sCUpdatePaymentPasswordBean.getOriginPaymentPassword());
		sCUpdatePaymentPasswordPage.setNewPaymentPassword(sCUpdatePaymentPasswordBean.getNewPaymentPassword());
		sCUpdatePaymentPasswordPage.setConfirmNewPaymentPassword(sCUpdatePaymentPasswordBean.getConfirmNewPaymentPassword());
		
		wait.waitFor(500);
		sCUpdatePaymentPasswordPage.clickSave();
//		wait.waitFor(500);
//		sCUpdateLoginPasswordPage.clickConfirm();
	}

}
