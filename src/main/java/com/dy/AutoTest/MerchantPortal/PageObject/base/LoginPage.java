package com.dy.AutoTest.MerchantPortal.PageObject.base;


import org.openqa.selenium.WebDriver;

import com.dy.AutoTest.web.actions.DoPlus;
import com.dy.AutoTest.web.api.SuperPage;
import com.dy.AutoTest.web.business.OperBusiness;
import com.dy.AutoTest.web.dao.OperDao;
import com.dy.AutoTest.web.dao.impl.OperDaoImpl;

import safeInput.KeyBoardSimulator;

public class LoginPage extends SuperPage {
	
	
	public LoginPage(WebDriver driver) {
		super(driver);
		du.loadLocator("MP_Loc_Login");
	}
		
	public void setWaitTime(long waitTime) {
		du=new DoPlus(driver);
		du.waitTime=waitTime;
		du.loadLocator("MP_Loc_Login");
	}
	
	
	/**填写用户名
	 * @param userid
	 */
	public void setOperID(String userid) {
		du.what("UserName").sendKeys(userid);
	}
	
	/**填写密码控件
	 * @param password
	 */
	public void setPassword(String password) {
		try {
			du.what("Password").click();
			du.waitFor(500);
			KeyBoardSimulator.inputMockKeyBoard(password);
		} catch (Exception e) {
			e.printStackTrace();
			du.waitFor(15000);
		}
	}
	
	/**发送短信验证码
	 * 
	 */
	public void sendCode_SMS() {
		du.what("SendMessage").click();
	}
	
	/**获取短信验证码
	 * @param userid
	 * @return
	 */
	public String getCode_SMS(String operMobileNo) {
		OperDao operDao=new OperDaoImpl();
		OperBusiness OperBusiness=new OperBusiness(operDao);
		return OperBusiness.getPOPLoginSMS(operMobileNo);
	}
	
	/**填入短信验证码
	 * @param code_sms
	 */
	public void setCode_SMS(String code_sms) {
		du.what("MessageVerificationCode").sendKeys(code_sms);
	}
	
	public void setFocusOnVerificationCode() {
		du.what("VerificationCode").click();
	}
	
	/**点击登录
	 * @param url
	 */
	public void doLogin() {
		du.what("Login").click();
	}

	
}
