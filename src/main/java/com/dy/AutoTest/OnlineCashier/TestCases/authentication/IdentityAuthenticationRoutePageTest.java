package com.dy.AutoTest.OnlineCashier.TestCases.authentication;

import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.dy.AutoTest.OnlineCashier.POJO.IdentityAuthenticationRouteBean;
import com.dy.AutoTest.OnlineCashier.PageObject.authentication.IdentityAuthenticationRoutePage;
import com.dy.AutoTest.web.api.SuperTest;
import com.dy.AutoTest.web.business.DataBusiness;

public class IdentityAuthenticationRoutePageTest extends SuperTest {

	private IdentityAuthenticationRoutePage identityAuthenticationRoutePage;

	private String URL = "";

	@BeforeClass
	public void init() {
		identityAuthenticationRoutePage = new IdentityAuthenticationRoutePage(driver);
		URL = host.toString() + DataBusiness.getData_URL("pop_IdentityAuthenticationRoute");
	}

	@DataProvider(name = "identityAuthenticationRoute")
	protected static Object[][] parametersPool() {
		data.loadDataBeanList("POP_Data_IdentityAuthenticationRoute");
		return data.getDataBeanArray();
	}

	@Test(dataProvider = "identityAuthenticationRoute", description = "运营平台-合作平台路由信息管理")
	public void testIdentityAuthenticationRoute(IdentityAuthenticationRouteBean identityAuthenticationRouteBean) {

		identityAuthenticationRoutePage.navigateTo(URL);
		
		identityAuthenticationRoutePage.setFocusOnCertificateType();
		identityAuthenticationRoutePage.queryOnCertificateType(identityAuthenticationRouteBean.getCertificateType());
		
		identityAuthenticationRoutePage.setFocusOnServiceType();
		identityAuthenticationRoutePage.queryOnServiceType(identityAuthenticationRouteBean.getServiceType());
		
		identityAuthenticationRoutePage.setFocusOnRouteChannelCode();
		identityAuthenticationRoutePage.queryOnRouteChannelCode(identityAuthenticationRouteBean.getRouteChannelCode());
		
		identityAuthenticationRoutePage.clickQuery();
		
		wait.waitFor(1000);
		
		identityAuthenticationRoutePage.selectFirstRecord();
		identityAuthenticationRoutePage.clickModifyButton();
		
		wait.waitFor(500);
		
		identityAuthenticationRoutePage.submitModify();
		
		Reporter.log("身份认证路由修改成功！合作业务类型：" + identityAuthenticationRouteBean.getServiceType());
	}

}
