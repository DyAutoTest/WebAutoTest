package com.dy.AutoTest.OperationPlatform.PageObject.OnlineRiskControl.RiskControlLvMaintain;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.dy.AutoTest.web.api.IQuery;
import com.dy.AutoTest.web.api.SuperPage;
import com.dy.AutoTest.web.actions.DoPlus;

public class RiskMonitorRuleMaintainPage extends SuperPage implements IQuery{
	public RiskMonitorRuleMaintainPage(WebDriver driver) {
		super(driver);
		du.loadLocator("POP_Loc_RiskControlLvMaintain_RiskMonitorRuleMaintain");
	}
	public void setWaitTime(long waitTime) {
		du=new DoPlus(driver);
		du.waitTime=waitTime;
		du.loadLocator("POP_Loc_RiskControlLvMaintain_RiskMonitorRuleMaintain");
	}

/***************************Manual Coding**********************************/


/****************************Auto Generate******************************/

	//风险监控规则ID
	public void setRiskMonitorRuleID(String value) {
		du.what("RiskMonitorRuleID").clear();
		du.what("RiskMonitorRuleID").sendKeys(value);
	}
	public String getRiskMonitorRuleID() {
		return du.what("RiskMonitorRuleID").getAttribute("value");
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
	//添加_风险级别
	public void setAdd_RiskLv(String value) {
		du.what("Add_RiskLv").clear();
		du.what("Add_RiskLv").sendKeys(value);
	}
	public String getAdd_RiskLv() {
		return du.what("Add_RiskLv").getAttribute("value");
	}
	//添加_风险监控规则
	public void setAdd_RiskMonitorRuleID(String value) {
		du.what("Add_RiskMonitorRuleID").clear();
		du.what("Add_RiskMonitorRuleID").sendKeys(value);
	}
	public String getAdd_RiskMonitorRuleID() {
		return du.what("Add_RiskMonitorRuleID").getAttribute("value");
	}
	//添加_监控方式
	public void setAdd_MonitorWay(String value) {
		du.what("Add_MonitorWay").clear();
		du.what("Add_MonitorWay").sendKeys(value);
	}
	public String getAdd_MonitorWay() {
		return du.what("Add_MonitorWay").getAttribute("value");
	}
	//添加_通知邮箱
	public void setAdd_InformEmail(String value) {
		du.what("Add_InformEmail").clear();
		du.what("Add_InformEmail").sendKeys(value);
	}
	public String getAdd_InformEmail() {
		return du.what("Add_InformEmail").getAttribute("value");
	}
	//添加_通知手机号
	public void setAdd_InformPhone(String value) {
		du.what("Add_InformPhone").clear();
		du.what("Add_InformPhone").sendKeys(value);
	}
	public String getAdd_InformPhone() {
		return du.what("Add_InformPhone").getAttribute("value");
	}
	//添加_提交
	public void clickAdd_Submit() {
		du.what("Add_Submit").click();
	}
	//添加_关闭
	public void clickAdd_Close() {
		du.what("Add_Close").click();
	}
	//修改_监控方式
	public void setUpdate_MonitorWay(String value) {
		du.what("Update_MonitorWay").clear();
		du.what("Update_MonitorWay").sendKeys(value);
	}
	public String getUpdate_MonitorWay() {
		return du.what("Update_MonitorWay").getAttribute("value");
	}
	//修改_通知邮箱
	public void setUpdate_InformEmail(String value) {
		du.what("Update_InformEmail").clear();
		du.what("Update_InformEmail").sendKeys(value);
	}
	public String getUpdate_InformEmail() {
		return du.what("Update_InformEmail").getAttribute("value");
	}
	//修改_通知手机号
	public void setUpdate_InformPhone(String value) {
		du.what("Update_InformPhone").clear();
		du.what("Update_InformPhone").sendKeys(value);
	}
	public String getUpdate_InformPhone() {
		return du.what("Update_InformPhone").getAttribute("value");
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