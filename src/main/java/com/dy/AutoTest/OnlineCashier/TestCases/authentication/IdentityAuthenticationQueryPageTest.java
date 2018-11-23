package com.dy.AutoTest.OnlineCashier.TestCases.authentication;

import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.dy.AutoTest.OnlineCashier.POJO.IdentityAuthenticationQueryBean;
import com.dy.AutoTest.OnlineCashier.PageObject.authentication.IdentityAuthenticationQueryPage;
import com.dy.AutoTest.web.api.SuperTest;
import com.dy.AutoTest.web.business.DataBusiness;

public class IdentityAuthenticationQueryPageTest extends SuperTest {

	private IdentityAuthenticationQueryPage identityAuthenticationQueryPage;

	private String URL = "";

	@BeforeClass
	public void init() {
		identityAuthenticationQueryPage = new IdentityAuthenticationQueryPage(driver);
		URL = host.toString() + DataBusiness.getData_URL("pop_IdentityAuthenticationQuery");
	}

	@DataProvider(name = "identityAuthenticationQuery")
	protected static Object[][] parametersPool() {
		data.loadDataBeanList("POP_Data_IdentityAuthenticationQuery");
		return data.getDataBeanArray();
	}

	@Test(dataProvider = "identityAuthenticationQuery", description = "运营平台-身份认证流水查询")
	public void testIdentityAuthenticationQuery(IdentityAuthenticationQueryBean identityAuthenticationQueryBean) {

		identityAuthenticationQueryPage.navigateTo(URL);
		
		identityAuthenticationQueryPage.setFocusOnInnerUserId();
		identityAuthenticationQueryPage.queryOnInnerUserId(identityAuthenticationQueryBean.getInnerUserId());
		
		identityAuthenticationQueryPage.setFocusOnCertificateStatus();
		identityAuthenticationQueryPage.queryOnCertificateStatus(identityAuthenticationQueryBean.getCertificateStatus());
		
		identityAuthenticationQueryPage.setFocusOnValidDateFrom();
		identityAuthenticationQueryPage.queryOnValidDateFrom(identityAuthenticationQueryBean.getValidDateFrom());
		
		identityAuthenticationQueryPage.setFocusOnValidDateTo();
		identityAuthenticationQueryPage.queryOnValidDateTo(identityAuthenticationQueryBean.getValidDateTo());
		
		identityAuthenticationQueryPage.clickQuery();
		
		wait.waitFor(1000);
		
		identityAuthenticationQueryPage.selectFirstRecord();
		identityAuthenticationQueryPage.clickSwitchButton();
		
		Reporter.log("身份认证流水查询切换成功！内部用户号：" + identityAuthenticationQueryBean.getInnerUserId());
	}
	
}
