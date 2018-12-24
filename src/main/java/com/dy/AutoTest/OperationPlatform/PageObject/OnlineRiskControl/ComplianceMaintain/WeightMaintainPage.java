package com.dy.AutoTest.OperationPlatform.PageObject.OnlineRiskControl.ComplianceMaintain;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.dy.AutoTest.web.api.IQuery;
import com.dy.AutoTest.web.api.SuperPage;
import com.dy.AutoTest.web.actions.DoPlus;

public class WeightMaintainPage extends SuperPage implements IQuery{
	public WeightMaintainPage(WebDriver driver) {
		super(driver);
		du.loadLocator("POP_Loc_ComplianceMaintain_WeightMaintain");
	}
	public void setWaitTime(long waitTime) {
		du=new DoPlus(driver);
		du.waitTime=waitTime;
		du.loadLocator("POP_Loc_ComplianceMaintain_WeightMaintain");
	}

/***************************Manual Coding**********************************/


/****************************Auto Generate******************************/

	//参考内容
	public void setReferenceContent(String value) {
		du.what("ReferenceContent").clear();
		du.what("ReferenceContent").sendKeys(value);
	}
	public String getReferenceContent() {
		return du.what("ReferenceContent").getAttribute("value");
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
	//权重列表单选按钮
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
	//添加_风险模型
	public void selectAdd_RiskModel(String value) {
		du.whatSelect("Add_RiskModel").selectByValue(value);
	}
	//添加_参考ID
	public void setAdd_ReferenceID(String value) {
		du.what("Add_ReferenceID").clear();
		du.what("Add_ReferenceID").sendKeys(value);
	}
	public String getAdd_ReferenceID() {
		return du.what("Add_ReferenceID").getAttribute("value");
	}
	//添加_参考内容
	public void setAdd_ReferenceContent(String value) {
		du.what("Add_ReferenceContent").clear();
		du.what("Add_ReferenceContent").sendKeys(value);
	}
	public String getAdd_ReferenceContent() {
		return du.what("Add_ReferenceContent").getAttribute("value");
	}
	//添加_风险系数
	public void setAdd_RiskModule(String value) {
		du.what("Add_RiskModule").clear();
		du.what("Add_RiskModule").sendKeys(value);
	}
	public String getAdd_RiskModule() {
		return du.what("Add_RiskModule").getAttribute("value");
	}
	//添加_权重
	public void setAdd_Weight(String value) {
		du.what("Add_Weight").clear();
		du.what("Add_Weight").sendKeys(value);
	}
	public String getAdd_Weight() {
		return du.what("Add_Weight").getAttribute("value");
	}
	//添加_备注
	public void setAdd_Tips(String value) {
		du.what("Add_Tips").clear();
		du.what("Add_Tips").sendKeys(value);
	}
	public String getAdd_Tips() {
		return du.what("Add_Tips").getAttribute("value");
	}
	//添加_提交
	public void clickAdd_Submit() {
		du.what("Add_Submit").click();
	}
	//添加_关闭
	public void clickAdd_Close() {
		du.what("Add_Close").click();
	}
	//修改_参考内容
	public void setUpdate_ReferenceContent(String value) {
		du.what("Update_ReferenceContent").clear();
		du.what("Update_ReferenceContent").sendKeys(value);
	}
	public String getUpdate_ReferenceContent() {
		return du.what("Update_ReferenceContent").getAttribute("value");
	}
	//修改_风险系数
	public void setUpdate_RiskModule(String value) {
		du.what("Update_RiskModule").clear();
		du.what("Update_RiskModule").sendKeys(value);
	}
	public String getUpdate_RiskModule() {
		return du.what("Update_RiskModule").getAttribute("value");
	}
	//修改_权重
	public void setUpdate_Weight(String value) {
		du.what("Update_Weight").clear();
		du.what("Update_Weight").sendKeys(value);
	}
	public String getUpdate_Weight() {
		return du.what("Update_Weight").getAttribute("value");
	}
	//修改_备注
	public void setUpdate_Tips(String value) {
		du.what("Update_Tips").clear();
		du.what("Update_Tips").sendKeys(value);
	}
	public String getUpdate_Tips() {
		return du.what("Update_Tips").getAttribute("value");
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