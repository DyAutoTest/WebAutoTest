package com.dy.AutoTest.OperationPlatform.PageObject.OnlineRiskControl.ComplianceMaintain;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.dy.AutoTest.web.api.IQuery;
import com.dy.AutoTest.web.api.SuperPage;
import com.dy.AutoTest.web.actions.DoPlus;

public class ComplianceLimitMaintainPage extends SuperPage implements IQuery{
	public ComplianceLimitMaintainPage(WebDriver driver) {
		super(driver);
		du.loadLocator("POP_Loc_ComplianceMaintain_ComplianceLimitMaintain");
	}
	public void setWaitTime(long waitTime) {
		du=new DoPlus(driver);
		du.waitTime=waitTime;
		du.loadLocator("POP_Loc_ComplianceMaintain_ComplianceLimitMaintain");
	}

/***************************Manual Coding**********************************/


/****************************Auto Generate******************************/

	//用户级别
	public void selectUserLv(String value) {
		du.whatSelect("UserLv").selectByValue(value);
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
	//合规列表单选按钮
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
	//添加_机构编码
	public void setAdd_OrgnizationCode(String value) {
		du.what("Add_OrgnizationCode").clear();
		du.what("Add_OrgnizationCode").sendKeys(value);
	}
	public String getAdd_OrgnizationCode() {
		return du.what("Add_OrgnizationCode").getAttribute("value");
	}
	//添加_用户级别
	public void selectAdd_UserLv(String value) {
		du.whatSelect("Add_UserLv").selectByValue(value);
	}
	//添加_年限额
	public void setAdd_YearLimitMoney(String value) {
		du.what("Add_YearLimitMoney").clear();
		du.what("Add_YearLimitMoney").sendKeys(value);
	}
	public String getAdd_YearLimitMoney() {
		return du.what("Add_YearLimitMoney").getAttribute("value");
	}
	//添加_支付机构等级
	public void selectAdd_PaymentOrgnizationLv(String value) {
		du.whatSelect("Add_PaymentOrgnizationLv").selectByValue(value);
	}
	//添加_收付款方标志
	public void selectAdd_PayeeOrPaymentSign(String value) {
		du.whatSelect("Add_PayeeOrPaymentSign").selectByValue(value);
	}
	//添加_账户类型
	public void selectAdd_AccountType(String value) {
		du.whatSelect("Add_AccountType").selectByValue(value);
	}
	//添加_提交
	public void clickAdd_Submit() {
		du.what("Add_Submit").click();
	}
	//添加_关闭
	public void clickAdd_Close() {
		du.what("Add_Close").click();
	}
	//修改_年限额
	public void setUpdate_YearLimitMoney(String value) {
		du.what("Update_YearLimitMoney").clear();
		du.what("Update_YearLimitMoney").sendKeys(value);
	}
	public String getUpdate_YearLimitMoney() {
		return du.what("Update_YearLimitMoney").getAttribute("value");
	}
	//修改_收付款方标志
	public void selectUpdate_PayeeOrPayerSign(String value) {
		du.whatSelect("Update_PayeeOrPayerSign").selectByValue(value);
	}
	//修改_账户类型
	public void selectUpdate_AccountType(String value) {
		du.whatSelect("Update_AccountType").selectByValue(value);
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