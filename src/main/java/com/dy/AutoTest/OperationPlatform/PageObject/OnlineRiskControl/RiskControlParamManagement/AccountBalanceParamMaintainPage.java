package com.dy.AutoTest.OperationPlatform.PageObject.OnlineRiskControl.RiskControlParamManagement;

import org.openqa.selenium.WebDriver;

import com.dy.AutoTest.web.api.IQuery;
import com.dy.AutoTest.web.api.SuperPage;
import com.dy.AutoTest.web.actions.DoPlus;

public class AccountBalanceParamMaintainPage extends SuperPage implements IQuery{
	public AccountBalanceParamMaintainPage(WebDriver driver) {
		super(driver);
		du.loadLocator("POP_Loc_RiskControlParamManagement_AccountBalanceParamMaintain");
	}
	public void setWaitTime(long waitTime) {
		du=new DoPlus(driver);
		du.waitTime=waitTime;
		du.loadLocator("POP_Loc_RiskControlParamManagement_AccountBalanceParamMaintain");
	}

/***************************Manual Coding**********************************/


/****************************Auto Generate******************************/

	//账户种类
	/**
	 * @param value
	 * 
	 * 	value="100" : 100-个人账户
		value="800" : 800-商户账户
	 */
	public void selectAccountType(String value) {
		du.whatSelect("AccountType").selectByValue(value);
	}
	//资金种类
	/**
	 * @param value
	 * 
	 * value="1" : 现金
	 * 
	 */
	public void selectMoneyType(String value) {
		du.whatSelect("MoneyType").selectByValue(value);
	}
	//实名标志
	/**
	 * @param value
	 * 
	 * 	value="02" : 强实名
		value="01" : 弱实名
		value="00" : 非实名
	 * 
	 */
	public void selectRealNameSign(String value) {
		du.whatSelect("RealNameSign").selectByValue(value);
	}
	//查询
	public void clickQuery() {
		du.what("Query").click();
	}
	//重置
	public void clickReset() {
		du.what("Reset").click();
	}
	//添加
	public void clickAdd() {
		du.what("Add").click();
	}
	//修改
	public void clickUpdate() {
		du.what("Update").click();
	}
	//查看
	public void clickCheck() {
		du.what("Check").click();
	}
	//删除
	public void clickDelete() {
		du.what("Delete").click();
	}
	//账户列表单选按钮
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
	//添加_账户类型
	public void selectAdd_AccountType(String value) {
		du.whatSelect("Add_AccountType").selectByValue(value);
	}
	//添加_资金种类
	public void selectAdd_MoneyType(String value) {
		du.whatSelect("Add_MoneyType").selectByValue(value);
	}
	//添加_实名标志
	public void selectAdd_RealNameSign(String value) {
		du.whatSelect("Add_RealNameSign").selectByValue(value);
	}
	//添加_最大余额限额
	public void setAdd_MaxBalanceLimit(String value) {
		du.what("Add_MaxBalanceLimit").clear();
		du.what("Add_MaxBalanceLimit").sendKeys(value);
	}
	public String getAdd_MaxBalanceLimit() {
		return du.what("Add_MaxBalanceLimit").getAttribute("value");
	}
	//添加_提交
	public void clickAdd_Submit() {
		du.what("Add_Submit").click();
	}
	//添加_关闭
	public void clickAdd_Close() {
		du.what("Add_Close").click();
	}
	//修改_账户类型
	public void selectUpdate_AccountType(String value) {
		du.whatSelect("Update_AccountType").selectByValue(value);
	}
	//修改_资金种类
	public void selectUpdate_MoneyType(String value) {
		du.whatSelect("Update_MoneyType").selectByValue(value);
	}
	//修改_实名标志
	public void selectUpdate_RealNameSign(String value) {
		du.whatSelect("Update_RealNameSign").selectByValue(value);
	}
	//修改_最大余额限额
	public void setUpdate_MaxBalanceLimit(String value) {
		du.what("Update_MaxBalanceLimit").clear();
		du.what("Update_MaxBalanceLimit").sendKeys(value);
	}
	public String getUpdate_MaxBalanceLimit() {
		return du.what("Update_MaxBalanceLimit").getAttribute("value");
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
	//删除_确认
	public void clickDelete_Confirm() {
		du.what("Delete_Confirm").click();
	}
	//删除_关闭
	public void clickDelete_Close() {
		du.what("Delete_Close").click();
	}

}