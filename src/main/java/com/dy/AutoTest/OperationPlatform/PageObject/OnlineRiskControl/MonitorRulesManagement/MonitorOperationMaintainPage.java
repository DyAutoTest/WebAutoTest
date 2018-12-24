package com.dy.AutoTest.OperationPlatform.PageObject.OnlineRiskControl.MonitorRulesManagement;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.dy.AutoTest.web.api.IQuery;
import com.dy.AutoTest.web.api.SuperPage;
import com.dy.AutoTest.web.actions.DoPlus;

public class MonitorOperationMaintainPage extends SuperPage implements IQuery{
	public MonitorOperationMaintainPage(WebDriver driver) {
		super(driver);
		du.loadLocator("POP_Loc_MonitorRulesManagement_MonitorOperationMaintain");
	}
	public void setWaitTime(long waitTime) {
		du=new DoPlus(driver);
		du.waitTime=waitTime;
		du.loadLocator("POP_Loc_MonitorRulesManagement_MonitorOperationMaintain");
	}

/***************************Manual Coding**********************************/


/****************************Auto Generate******************************/

	//监控规则
	public void selectMonitorRule(String value) {
		du.whatSelect("MonitorRule").selectByValue(value);
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
	//添加_监控规则
	public void selectAdd_MonitorRule(String value) {
		du.whatSelect("Add_MonitorRule").selectByValue(value);
	}
	//添加_监控操作
	public void selectAdd_MonitorOperation(String value) {
		du.whatSelect("Add_MonitorOperation").selectByValue(value);
	}
	//添加_提交
	public void clickAdd_Submit() {
		du.what("Add_Submit").click();
	}
	//添加_关闭
	public void clickAdd_Close() {
		du.what("Add_Close").click();
	}
	//修改_监控操作
	public void selectUpdate_MonitorOperation(String value) {
		du.whatSelect("Update_MonitorOperation").selectByValue(value);
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