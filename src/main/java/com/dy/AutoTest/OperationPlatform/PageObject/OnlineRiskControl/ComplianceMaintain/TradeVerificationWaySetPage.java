package com.dy.AutoTest.OperationPlatform.PageObject.OnlineRiskControl.ComplianceMaintain;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.dy.AutoTest.web.api.IQuery;
import com.dy.AutoTest.web.api.SuperPage;
import com.dy.AutoTest.web.actions.DoPlus;

public class TradeVerificationWaySetPage extends SuperPage implements IQuery{
	public TradeVerificationWaySetPage(WebDriver driver) {
		super(driver);
		du.loadLocator("POP_Loc_ComplianceMaintain_TradeVerificationWaySet");
	}
	public void setWaitTime(long waitTime) {
		du=new DoPlus(driver);
		du.waitTime=waitTime;
		du.loadLocator("POP_Loc_ComplianceMaintain_TradeVerificationWaySet");
	}

/***************************Manual Coding**********************************/


/****************************Auto Generate******************************/

	//ID
	public void setModeID(String value) {
		du.what("ModeID").clear();
		du.what("ModeID").sendKeys(value);
	}
	public String getModeID() {
		return du.what("ModeID").getAttribute("value");
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
	//验证列表单选按钮
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
	//添加_ID
	public void setAdd_ID(String value) {
		du.what("Add_ID").clear();
		du.what("Add_ID").sendKeys(value);
	}
	public String getAdd_ID() {
		return du.what("Add_ID").getAttribute("value");
	}
	//添加_日限额
	public void setAdd_DailyLimit(String value) {
		du.what("Add_DailyLimit").clear();
		du.what("Add_DailyLimit").sendKeys(value);
	}
	public String getAdd_DailyLimit() {
		return du.what("Add_DailyLimit").getAttribute("value");
	}
	//添加_验证方式
	public void selectAdd_VerificationWay(String value) {
		du.whatSelect("Add_VerificationWay").selectByValue(value);
	}
	//添加_验证数量
	public void setAdd_VerificationQuantity(String value) {
		du.what("Add_VerificationQuantity").clear();
		du.what("Add_VerificationQuantity").sendKeys(value);
	}
	public String getAdd_VerificationQuantity() {
		return du.what("Add_VerificationQuantity").getAttribute("value");
	}
	//添加_提交
	public void clickAdd_Submit() {
		du.what("Add_Submit").click();
	}
	//添加_关闭
	public void clickAdd_Close() {
		du.what("Add_Close").click();
	}
	//修改_日限额
	public void setUpdate_DailyLimit(String value) {
		du.what("Update_DailyLimit").clear();
		du.what("Update_DailyLimit").sendKeys(value);
	}
	public String getUpdate_DailyLimit() {
		return du.what("Update_DailyLimit").getAttribute("value");
	}
	//修改_验证方式
	public void selectUpdate_VerificationWay(String value) {
		du.whatSelect("Update_VerificationWay").selectByValue(value);
	}
	//修改_验证数量
	public void setUpdate_VerificationQuantity(String value) {
		du.what("Update_VerificationQuantity").clear();
		du.what("Update_VerificationQuantity").sendKeys(value);
	}
	public String getUpdate_VerificationQuantity() {
		return du.what("Update_VerificationQuantity").getAttribute("value");
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
	//删除_确定
	public void clickDelete_Confirm() {
		du.what("Delete_Confirm").click();
	}
	//删除_关闭
	public void clickDelete_Close() {
		du.what("Delete_Close").click();
	}

}