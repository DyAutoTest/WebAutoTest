package com.dy.AutoTest.MerchantPortal.TestCases.base;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.dy.AutoTest.MerchantPortal.POJO.PmOperBean;
import com.dy.AutoTest.MerchantPortal.PageObject.base.LoginPage;
import com.dy.AutoTest.web.api.SuperTest;
import com.dy.AutoTest.web.business.DataBusiness;

public class LoginPageTest extends SuperTest{ 
	private LoginPage loginPage;
	private String URL="";
	
	private PmOperBean operBean;
	
	@BeforeClass
	public void init() {
		loginPage=new LoginPage(driver);
		URL=host.toString()+DataBusiness.getData_URL("mp_login");
	}
	
	@Parameters({ "OperID" })
	@Test(description = "商户门户-登录")
	public void testLogin(String OperID) {
		operBean = data.getDataBean("MP_Data_Oper", OperID);
		loginPage.navigateTo(URL);
		loginPage.setOperID(operBean.getOperID());
		loginPage.setPassword(operBean.getPassword());
		wait.waitFor(2000);
		loginPage.sendCode_SMS();
		wait.waitFor(500);
		String code_SMS = loginPage.getCode_SMS(operBean.getMobileNO());
		loginPage.setCode_SMS(code_SMS);
		
		wait.waitFor(10000);
		
		loginPage.doLogin();
	}
}
