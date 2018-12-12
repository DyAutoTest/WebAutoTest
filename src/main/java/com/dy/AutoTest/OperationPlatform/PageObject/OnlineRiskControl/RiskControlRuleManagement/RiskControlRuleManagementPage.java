package com.dy.AutoTest.OperationPlatform.PageObject.OnlineRiskControl.RiskControlRuleManagement;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.dy.AutoTest.web.api.IQuery;
import com.dy.AutoTest.web.api.SuperPage;
import com.dy.AutoTest.web.actions.DoPlus;

public class RiskControlRuleManagementPage extends SuperPage implements IQuery{
	public RiskControlRuleManagementPage(WebDriver driver) {
		super(driver);
		du.loadLocator("POP_Loc_RiskControlRuleManagement_RiskControlRuleManagement");
	}
	public void setWaitTime(long waitTime) {
		du=new DoPlus(driver);
		du.waitTime=waitTime;
		du.loadLocator("POP_Loc_RiskControlRuleManagement_RiskControlRuleManagement");
	}

/***************************Manual Coding**********************************/


/****************************Auto Generate******************************/

	//规则ID
	public void setRuleID(String value) {
		du.what("RuleID").clear();
		du.what("RuleID").sendKeys(value);
	}
	public String getRuleID() {
		return du.what("RuleID").getAttribute("value");
	}
	//规则类别
	/**
	 * @param value
	 * 
	 * 	value="1" : 额度限制
		value="0" : 渠道限制
		value="2" : 频次限制
	 * 
	 */
	public void selectRuleType(String value) {
		du.whatSelect("RuleType").selectByValue(value);
	}
	//收付标志
	/**
	 * @param value
	 * 
	 * 	value="C" : 收款方
		value="D" : 付款方
	 * 
	 */
	public void selectPaymentCollectionSign(String value) {
		du.whatSelect("PaymentCollectionSign").selectByValue(value);
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
	//规则列表单选按钮
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
	//添加_规则ID
	public void setAdd_RuleID(String value) {
		du.what("Add_RuleID").clear();
		du.what("Add_RuleID").sendKeys(value);
	}
	public String getAdd_RuleID() {
		return du.what("Add_RuleID").getAttribute("value");
	}
	//添加_规则类别
	public void selectAdd_RuleType(String value) {
		du.whatSelect("Add_RuleType").selectByValue(value);
	}
	//添加_收付标志
	public void selectAdd_PaymentCollectionSign(String value) {
		du.whatSelect("Add_PaymentCollectionSign").selectByValue(value);
	}
	//添加_规则描述
	public void setAdd_RuleDiscribe(String value) {
		du.what("Add_RuleDiscribe").clear();
		du.what("Add_RuleDiscribe").sendKeys(value);
	}
	public String getAdd_RuleDiscribe() {
		return du.what("Add_RuleDiscribe").getAttribute("value");
	}
	//添加_组件名称
	public void setAdd_ComponentName(String value) {
		du.what("Add_ComponentName").clear();
		du.what("Add_ComponentName").sendKeys(value);
	}
	public String getAdd_ComponentName() {
		return du.what("Add_ComponentName").getAttribute("value");
	}
	//添加_提交
	public void clickAdd_Submit() {
		du.what("Add_Submit").click();
	}
	//添加_关闭
	public void clickAdd_Close() {
		du.what("Add_Close").click();
	}
	//修改_规则类别
	public void selectUpdate_RuleType(String value) {
		du.whatSelect("Update_RuleType").selectByValue(value);
	}
	//修改_收付标志
	public void selectUpdate_PaymentCollectionSign(String value) {
		du.whatSelect("Update_PaymentCollectionSign").selectByValue(value);
	}
	//修改_规则描述
	public void setUpdate_RuleDiscribe(String value) {
		du.what("Update_RuleDiscribe").sendKeys(Keys.CONTROL + "a");
		du.waitFor(500);
		du.what("Update_RuleDiscribe").sendKeys(value);
	}
	public String getUpdate_RuleDiscribe() {
		return du.what("Update_RuleDiscribe").getAttribute("value");
	}
	//修改_组件名称
	public void setUpdate_ComponentName(String value) {
		du.what("Update_ComponentName").sendKeys(Keys.CONTROL + "a");
		du.waitFor(500);
		du.what("Update_ComponentName").sendKeys(value);
	}
	public String getUpdate_ComponentName() {
		return du.what("Update_ComponentName").getAttribute("value");
	}
	//修改_提交
	public void clickUpdate_Confirm() {
		du.what("Update_Confirm").click();
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