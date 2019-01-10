package com.dy.AutoTest.AcquiringOperationPlatform.PageObject;

import org.openqa.selenium.WebDriver;

import com.dy.AutoTest.web.api.SuperPage;
import com.dy.AutoTest.web.business.OperBusiness;
import com.dy.AutoTest.web.dao.OperDao;
import com.dy.AutoTest.web.dao.impl.OperDaoImpl;
import com.dy.AutoTest.web.actions.DoPlus;

public class LoginPage extends SuperPage{
	public LoginPage(WebDriver driver) {
		super(driver);
		du.loadLocator("AOP_Loc_Login");
	}
	public void setWaitTime(long waitTime) {
		du=new DoPlus(driver);
		du.waitTime=waitTime;
		du.loadLocator("AOP_Loc_Login");
	}

/***************************Manual Coding**********************************/


/****************************Auto Generate******************************/

	//操作员编号
	public void setOperNO(String value) {
		du.what("OperNO").clear();
		du.what("OperNO").sendKeys(value);
	}
	public String getOperNO() {
		return du.what("OperNO").getAttribute("value");
	}
	//操作员密码
	public void setPassword(String value) {
		du.what("Password").clear();
		du.what("Password").sendKeys(value);
	}
	public String getPassword() {
		return du.what("Password").getAttribute("value");
	}
	public void clickPassword() {
		du.what("Password").click();
	}
	//获取短信验证码
	public void clickGetSMS() {
		du.what("GetSMS").click();
	}
	/**获取数据库短信验证码
	 * @param userid
	 * @return
	 */
	public String getCode_SMS(String operMobileNo) {
		OperDao operDao=new OperDaoImpl();
		OperBusiness OperBusiness=new OperBusiness(operDao);
		return OperBusiness.getPOPLoginSMS(operMobileNo);
	}
	//输入短信验证码
	public void setSMSCode(String value) {
		du.what("SMSCode").clear();
		du.what("SMSCode").sendKeys(value);
	}
	public String getSMSCode() {
		return du.what("SMSCode").getAttribute("value");
	}
	//登录按钮
	public void clickLoginButton() {
		du.what("LoginButton").click();
	}


}