package com.dy.AutoTest.OnlineCashier.TestCases.idverification;

import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.dy.AutoTest.OnlineCashier.POJO.IdCardValidDateVerificationBean;
import com.dy.AutoTest.OnlineCashier.PageObject.idverification.IdCardValidDateVerificationPage;
import com.dy.AutoTest.web.api.SuperTest;
import com.dy.AutoTest.web.business.DataBusiness;

public class IdCardValidDateVerificationPageTest extends SuperTest {
	
	private IdCardValidDateVerificationPage idCardValidDateVerificationPage;

	private String URL = "";

	@BeforeClass
	public void init() {
		idCardValidDateVerificationPage = new IdCardValidDateVerificationPage(driver);
		URL = host.toString() + DataBusiness.getData_URL("pop_IdCardValidDateVerification");
	}

	@DataProvider(name = "idCardValidDateVerification")
	protected static Object[][] parametersPool() {
		data.loadDataBeanList("POP_Data_IdCardValidDateVerification");
		return data.getDataBeanArray();
	}

	@Test(dataProvider = "idCardValidDateVerification", description = "运营平台-身份证有效期审核")
	public void testIdCardValidDateVerification(IdCardValidDateVerificationBean idCardValidDateVerificationBean) {

		idCardValidDateVerificationPage.navigateTo(URL);
		
		idCardValidDateVerificationPage.setFocusOnUserMobile();
		idCardValidDateVerificationPage.queryOnUserMobile(idCardValidDateVerificationBean.getUserMobile());
		
		idCardValidDateVerificationPage.clickReset();
		idCardValidDateVerificationPage.clickQuery();
		
		wait.waitFor(1000);
		
		idCardValidDateVerificationPage.selectFirstRecord();
		
		String caseNo = idCardValidDateVerificationBean.getCaseNo();

		switch (caseNo) {
		case "1":
			verificationPassCase(idCardValidDateVerificationBean);
			break;
		case "2":
			verificationUnPassCase(idCardValidDateVerificationBean);
			break;
		default:
			break;
		}
	}

	private void verificationPassCase(IdCardValidDateVerificationBean idCardValidDateVerificationBean) {
		
		idCardValidDateVerificationPage.clickVerifyButton();
		
		idCardValidDateVerificationPage.setFocusOnVerifyComment();
		idCardValidDateVerificationPage.inputVerifyComment(idCardValidDateVerificationBean.getVerificationComment());
		
		wait.waitFor(500);
		
		idCardValidDateVerificationPage.clickCloseButton();
		
		Reporter.log("身份证有效期审核通过，用例成功！");
	}
	
	private void verificationUnPassCase(IdCardValidDateVerificationBean idCardValidDateVerificationBean) {
		
		idCardValidDateVerificationPage.clickVerifyButton();
		
		idCardValidDateVerificationPage.setFocusOnVerifyComment();
		idCardValidDateVerificationPage.inputVerifyComment(idCardValidDateVerificationBean.getVerificationComment());
		
		wait.waitFor(500);
		
		idCardValidDateVerificationPage.clickCloseButton();
		
		Reporter.log("身份证有效期审核未通过，用例成功！");
	}
	
}
