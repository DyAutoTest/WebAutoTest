package com.dy.AutoTest.OnlineCashier.TestCases.authentication;

import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.dy.AutoTest.OnlineCashier.POJO.IdentityAuthenticationDetailsBean;
import com.dy.AutoTest.OnlineCashier.PageObject.authentication.IdentityAuthenticationDetailsPage;
import com.dy.AutoTest.web.api.SuperTest;
import com.dy.AutoTest.web.business.DataBusiness;

public class IdentityAuthenticationDetailsPageTest extends SuperTest {

	private IdentityAuthenticationDetailsPage identityAuthenticationDetailsPage;

	private String URL = "";

	@BeforeClass
	public void init() {
		identityAuthenticationDetailsPage = new IdentityAuthenticationDetailsPage(driver);
		URL = host.toString() + DataBusiness.getData_URL("pop_IdentityAuthenticationDetails");
	}

	@DataProvider(name = "identityAuthenticationDetails")
	protected static Object[][] parametersPool() {
		data.loadDataBeanList("POP_Data_IdentityAuthenticationDetails");
		return data.getDataBeanArray();
	}

	@Test(dataProvider = "identityAuthenticationDetails", description = "运营平台-用户身份证明明细管理")
	public void testIdentityAuthenticationDetails(IdentityAuthenticationDetailsBean identityAuthenticationDetailsBean) {

		identityAuthenticationDetailsPage.navigateTo(URL);
		
		identityAuthenticationDetailsPage.setFocusOnInnerUserid();
		identityAuthenticationDetailsPage.queryOnInnerUserId(identityAuthenticationDetailsBean.getInnerUserId());
		
		identityAuthenticationDetailsPage.setFocusOnUserName();
		identityAuthenticationDetailsPage.queryOnUserName(identityAuthenticationDetailsBean.getUserName());
		
		identityAuthenticationDetailsPage.setFocusOnCertificateStatus();
		identityAuthenticationDetailsPage.queryOnCertificateStatus(identityAuthenticationDetailsBean.getCertificateStatus());
		
		identityAuthenticationDetailsPage.setFocusOnCertificateNumberl();
		identityAuthenticationDetailsPage.queryOnCertificateNumber(identityAuthenticationDetailsBean.getCertificateNumber());
		
		identityAuthenticationDetailsPage.clickQuery();
		
		wait.waitFor(1000);
		
		identityAuthenticationDetailsPage.selectFirstRecord();
		identityAuthenticationDetailsPage.clickModifyButton();
		
		wait.waitFor(200);
		
		identityAuthenticationDetailsPage.submitModify();
		
		Reporter.log("身份认证明细修改成功！内部用户号：" + identityAuthenticationDetailsBean.getInnerUserId());
	}
	
}
