package com.dy.AutoTest.OperationPlatform.PageObject.OnlineRiskControl.ComplianceMaintain;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.dy.AutoTest.web.api.IQuery;
import com.dy.AutoTest.web.api.SuperPage;
import com.dy.AutoTest.web.actions.DoPlus;

public class CustomerPaymentLimitPage extends SuperPage implements IQuery{
	public CustomerPaymentLimitPage(WebDriver driver) {
		super(driver);
		du.loadLocator("POP_Loc_ComplianceMaintain_CustomerPaymentLimit");
	}
	public void setWaitTime(long waitTime) {
		du=new DoPlus(driver);
		du.waitTime=waitTime;
		du.loadLocator("POP_Loc_ComplianceMaintain_CustomerPaymentLimit");
	}

/***************************Manual Coding**********************************/


/****************************Auto Generate******************************/

	//客户号
	public void setCustomerNO(String value) {
		du.what("CustomerNO").clear();
		du.what("CustomerNO").sendKeys(value);
	}
	public String getCustomerNO() {
		return du.what("CustomerNO").getAttribute("value");
	}
	//用户号
	public void setUserNO(String value) {
		du.what("UserNO").clear();
		du.what("UserNO").sendKeys(value);
	}
	public String getUserNO() {
		return du.what("UserNO").getAttribute("value");
	}
	//查询
	public void clickQuery() {
		du.what("Query").click();
	}
	//重置
	public void clickReset() {
		du.what("Reset").click();
	}
	//修改
	public void clickUpdate() {
		du.what("Update").click();
	}
	//查看
	public void clickCheck() {
		du.what("Check").click();
	}
	//限额列表单选按钮
	public void clickRadio(String radio) {
		du.what("Radio",radio).click();
	}
	public boolean isRadioExist(String radio) {
		du.waitFor(500);
		return du.isElementExist("Radio",radio);
	}
	public boolean isRadioDisplayed(String radio) {
		du.waitFor(500);
		return du.what("Radio",radio).isDisplayed();
	}
	//修改_用户号
	public void setUpdate_UserNO(String value) {
		du.what("Update_UserNO").clear();
		du.what("Update_UserNO").sendKeys(value);
	}
	public String getUpdate_UserNO() {
		return du.what("Update_UserNO").getAttribute("value");
	}
	//修改_用户级别
	public void selectUpdate_UserLv(String value) {
		du.whatSelect("Update_UserLv").selectByValue(value);
	}
	//修改_日累计付款限额
	public void setUpdate_DayPaymentLimit(String value) {
		du.what("Update_DayPaymentLimit").clear();
		du.what("Update_DayPaymentLimit").sendKeys(value);
	}
	public String getUpdate_DayPaymentLimit() {
		return du.what("Update_DayPaymentLimit").getAttribute("value");
	}
	//修改_支付系统风险最大限额
	public void setUpdate_PaymentSystemRiskLimitMax(String value) {
		du.what("Update_PaymentSystemRiskLimitMax").clear();
		du.what("Update_PaymentSystemRiskLimitMax").sendKeys(value);
	}
	public String getUpdate_PaymentSystemRiskLimitMax() {
		return du.what("Update_PaymentSystemRiskLimitMax").getAttribute("value");
	}
	//修改_支付系统风险日限额
	public void setUpdate_PaymentSystemRiskDailyLimit(String value) {
		du.what("Update_PaymentSystemRiskDailyLimit").clear();
		du.what("Update_PaymentSystemRiskDailyLimit").sendKeys(value);
	}
	public String getUpdate_PaymentSystemRiskDailyLimit() {
		return du.what("Update_PaymentSystemRiskDailyLimit").getAttribute("value");
	}
	//修改_资金类型
	public void selectUpdate_MoneyType(String value) {
		du.whatSelect("Update_MoneyType").selectByValue(value);
	}
	//修改_收付款方标志
	public void selectUpdate_PayeeOrPaymentSign(String value) {
		du.whatSelect("Update_PayeeOrPaymentSign").selectByValue(value);
	}
	//修改_提交
	public void clickUpdate_Submit() {
		du.what("Update_Submit").click();
	}
	//修改_关闭
	public void clickUpdate_Close() {
		du.what("Update_Close").click();
	}
	//查看_关闭
	public void clickCheck_Close() {
		du.what("Check_Close").click();
	}

}