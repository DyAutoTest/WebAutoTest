package com.dy.AutoTest.AcquiringOperationPlatform.PageTest;

import static org.testng.Assert.assertTrue;

import java.lang.reflect.Method;

import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.dy.AutoTest.web.actions.SingletonSet;
import com.dy.AutoTest.web.api.SuperTest;
import com.dy.AutoTest.AcquiringOperationPlatform.PageObject.LoginPage;
import com.dy.AutoTest.AcquiringOperationPlatform.POJO.LoginBean;
import com.dy.AutoTest.web.business.DataBusiness;

public class LoginPageTest extends SuperTest{
	LoginPage LoginPage;
	String URL;

	@BeforeClass
	public void init() {
		/******** instant objectPage *********/
		LoginPage=new LoginPage(driver);
		//LoginPage.setWaitTime(800);

		/******** set URL *********/
		URL=host.toString()+DataBusiness.getData_URL("aop_Login");

		/******** instant Interface *********/
//		iQuery=LoginPage;
//		iClickButton=LoginPage;
//		iClickRadio=LoginPage;
//		iSearchMerchant=LoginPage;
	}

	@DataProvider(name="Login")
	protected static Object[][] parametersPool(){
		data.loadDataBeanList("AOP_Data_Login",LoginBean.class);
		return data.getDataBeanArray();
	}

	@DataProvider(name="LoginByCaseNO")
	protected static Object[][] parametersPool(Method method){
		data.loadDataBeanList("AOP_Data_Login",method.getName(),LoginBean.class);
		return data.getDataBeanArray();
	}

	@Test(dataProvider="LoginByCaseNO")
	public void testLogin(LoginBean bean) {
		LoginPage.navigateTo(URL);
		wait.waitFor(500);
		if(bean.getOperID().equals("")) {
			System.out.println("操作员号字段为必输项，不能为空");
			Reporter.log("操作员号字段为必输项，不能为空");
			assertTrue(false);
		}
		if(bean.getPassword().equals("")) {
			System.out.println("操作员密码字段为必输项，不能为空");
			Reporter.log("操作员密码字段为必输项，不能为空");
			assertTrue(false);
		}
		if(bean.getMobileNO().equals("")) {
			System.out.println("操作员手机号字段为必输项，不能为空");
			Reporter.log("操作员手机号字段为必输项，不能为空");
			assertTrue(false);
		}
		LoginPage.setOperNO(bean.getOperID());
		LoginPage.clickPassword();
//		LoginPage.setPassword(bean.getPassword());
		wait.waitFor(5000);
		LoginPage.clickGetSMS();
		wait.waitFor(1000);
		String SMSCode = LoginPage.getCode_SMS(bean.getMobileNO());
		LoginPage.setSMSCode(SMSCode);
		wait.waitFor(500);
		LoginPage.clickLoginButton();
		wait.waitFor(500);
		if(LoginPage.isElementExist("CurrentAccountantDate")&&SingletonSet.CurrentAccountantDate.toString().equals(""))
			SingletonSet.CurrentAccountantDate.append(LoginPage.getCurrentAccountantDate());
		else {
			System.out.println(LoginPage.getNotice());
			Reporter.log(LoginPage.getNotice());
			assertTrue(false);
		}
	}
	@Test(dataProvider="LoginByCaseNO")
	public void testAuditLogin(LoginBean bean) {
		LoginPage.navigateTo(URL);
		wait.waitFor(500);
		if(bean.getOperID().equals("")) {
			System.out.println("操作员号字段为必输项，不能为空");
			Reporter.log("操作员号字段为必输项，不能为空");
			assertTrue(false);
		}
		if(bean.getPassword().equals("")) {
			System.out.println("操作员密码字段为必输项，不能为空");
			Reporter.log("操作员密码字段为必输项，不能为空");
			assertTrue(false);
		}
		if(bean.getMobileNO().equals("")) {
			System.out.println("操作员手机号字段为必输项，不能为空");
			Reporter.log("操作员手机号字段为必输项，不能为空");
			assertTrue(false);
		}
		LoginPage.setOperNO(bean.getOperID());
		LoginPage.clickPassword();
//		LoginPage.setPassword(bean.getPassword());
		wait.waitFor(5000);
		LoginPage.clickGetSMS();
		wait.waitFor(1000);
		String SMSCode = LoginPage.getCode_SMS(bean.getMobileNO());
		LoginPage.setSMSCode(SMSCode);
		wait.waitFor(500);
		LoginPage.clickLoginButton();
		wait.waitFor(500);
		if(LoginPage.isElementExist("CurrentAccountantDate")&&SingletonSet.CurrentAccountantDate.toString().equals(""))
			SingletonSet.CurrentAccountantDate.append(LoginPage.getCurrentAccountantDate());
		else {
			System.out.println(LoginPage.getNotice());
			Reporter.log(LoginPage.getNotice());
			assertTrue(false);
		}
	}
	
	@Test
	public void testQuit() {
		wait.waitFor(500);
		LoginPage.clickPersonal();
		wait.waitFor(1000);
		LoginPage.clickQuit();
	}

}