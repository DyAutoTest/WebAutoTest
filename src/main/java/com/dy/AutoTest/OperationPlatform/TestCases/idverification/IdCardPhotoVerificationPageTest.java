package com.dy.AutoTest.OperationPlatform.TestCases.idverification;

import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.dy.AutoTest.OperationPlatform.POJO.IdCardPhotoVerificationBean;
import com.dy.AutoTest.OperationPlatform.PageObject.idverification.IdCardPhotoVerificationPage;
import com.dy.AutoTest.web.api.SuperTest;
import com.dy.AutoTest.web.business.DataBusiness;

public class IdCardPhotoVerificationPageTest extends SuperTest {
	
	private IdCardPhotoVerificationPage idCardPhotoVerificationPage;

	private String URL = "";

	@BeforeClass
	public void init() {
		idCardPhotoVerificationPage = new IdCardPhotoVerificationPage(driver);
		URL = host.toString() + DataBusiness.getData_URL("pop_IdCardPhotoVerification");
	}

	@DataProvider(name = "idCardPhotoVerification")
	protected static Object[][] parametersPool() {
		data.loadDataBeanList("POP_Data_IdCardPhotoVerification");
		return data.getDataBeanArray();
	}

	@Test(dataProvider = "idCardPhotoVerification", description = "运营平台-注册身份证照片审核")
	public void testIdCardPhotoVerification(IdCardPhotoVerificationBean idCardPhotoVerificationBean) {

		idCardPhotoVerificationPage.navigateTo(URL);
		
		idCardPhotoVerificationPage.setFocusOnUserMobile();
		idCardPhotoVerificationPage.queryOnUserMobile(idCardPhotoVerificationBean.getUserMobile());
		
		idCardPhotoVerificationPage.clickReset();
		idCardPhotoVerificationPage.clickQuery();
		
		wait.waitFor(1000);
		
		idCardPhotoVerificationPage.selectFirstRecord();
		
		String caseNo = idCardPhotoVerificationBean.getCaseNo();
		
		switch (caseNo) {
		case "1":
			verificationPassCase(idCardPhotoVerificationBean);
			break;
		case "2":
			verificationUnPassCase(idCardPhotoVerificationBean);
			break;
		default:
			break;
		}
	}

	private void verificationPassCase(IdCardPhotoVerificationBean idCardPhotoVerificationBean) {
		idCardPhotoVerificationPage.clickVerifyButton();
		
		idCardPhotoVerificationPage.setFocusOnVerifyComment();
		idCardPhotoVerificationPage.inputVerifyComment(idCardPhotoVerificationBean.getVerificationComment());
		
		wait.waitFor(500);
		
		idCardPhotoVerificationPage.clickCloseButton();
		
		Reporter.log("注册身份证照片审核通过，用例成功！");
	}
	
	private void verificationUnPassCase(IdCardPhotoVerificationBean idCardPhotoVerificationBean) {
		idCardPhotoVerificationPage.clickVerifyButton();
		
		idCardPhotoVerificationPage.setFocusOnVerifyComment();
		idCardPhotoVerificationPage.inputVerifyComment(idCardPhotoVerificationBean.getVerificationComment());
		
		wait.waitFor(500);
		
		idCardPhotoVerificationPage.clickCloseButton();
		
		Reporter.log("注册身份证照片审核不通过，用例成功！");
	}
	
}
