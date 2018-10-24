package com.dy.AutoTest.OperationPlatform.TestCases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.dy.AutoTest.OperationPlatform.POJO.OperBean;
import com.dy.AutoTest.OperationPlatform.PageObject.LoginPage;
import com.dy.AutoTest.web.actions.SingletonSet;
import com.dy.AutoTest.web.business.DataBusiness;

/**
 * @author Jerry
 * @description
 * Process of Testing Login:
 * 	- Get url from Database ;
 *  - Get get OperBean
 *  - SendKeys OperID, Password
 *  - Get SMS and sendKeys SMS
 *  - Do Login and record "CurrentAccountantDate" on index.jsp
 *
 */
public class LoginPageTest extends SuperTest{
	private LoginPage loginPage;
	private String URL="";
	
	private OperBean operBean;
	
	@BeforeClass
	public void init() {
		loginPage=new LoginPage(driver);
		URL=host.toString()+DataBusiness.getData_URL("pop_login");
	}
	
	@Parameters({ "OperID" })
	@Test
	public void testLogin(String OperID) {
		operBean = data.getDataBean("POP_Data_Oper", OperID);
		//跳转登录页
		loginPage.navigateTo(URL);
		//填写操作员ID
		loginPage.setOperID(operBean.getOperID());
		//填写密码
		loginPage.setPassword(operBean.getPassword());
		//发送短信验证码
		loginPage.sendCode_SMS();
		wait.waitFor(500);
		String code_SMS = loginPage.getCode_SMS(operBean.getMobileNO());
		//填写短信验证码
		loginPage.setCode_SMS(code_SMS);
		//登录
		loginPage.doLogin();
		if(SingletonSet.CurrentAccountantDate.toString().equals(""))
			SingletonSet.CurrentAccountantDate.append(loginPage.getCurrentAccountantDate());
	}
}
