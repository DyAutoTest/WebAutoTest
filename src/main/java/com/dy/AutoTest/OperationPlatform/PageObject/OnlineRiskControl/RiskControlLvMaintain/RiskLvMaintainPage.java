package com.dy.AutoTest.OperationPlatform.PageObject.OnlineRiskControl.RiskControlLvMaintain;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.dy.AutoTest.web.api.IQuery;
import com.dy.AutoTest.web.api.SuperPage;
import com.dy.AutoTest.web.actions.DoPlus;

public class RiskLvMaintainPage extends SuperPage implements IQuery{
	public RiskLvMaintainPage(WebDriver driver) {
		super(driver);
		du.loadLocator("POP_Loc_RiskControlLvMaintain_RiskLvMaintain");
	}
	public void setWaitTime(long waitTime) {
		du=new DoPlus(driver);
		du.waitTime=waitTime;
		du.loadLocator("POP_Loc_RiskControlLvMaintain_RiskLvMaintain");
	}

/***************************Manual Coding**********************************/


/****************************Auto Generate******************************/

	//风险级别
	/**
	 * @param value
	 * 
	 * 	value="0" : 未评级
		value="1" : 低风险
		value="2" : 中风险
		value="3" : 高风险
	 * 
	 */
	public void selectRiskLv(String value) {
		du.whatSelect("RiskLv").selectByValue(value);
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
	//级别列表单选按钮
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
	//添加_风险级别
	public void setAdd_RiskLv(String value) {
		du.what("Add_RiskLv").clear();
		du.what("Add_RiskLv").sendKeys(value);
	}
	public String getAdd_RiskLv() {
		return du.what("Add_RiskLv").getAttribute("value");
	}
	//添加_风险系数最大值
	public void setAdd_RiskParameterMax(String value) {
		du.what("Add_RiskParameterMax").clear();
		du.what("Add_RiskParameterMax").sendKeys(value);
	}
	public String getAdd_RiskParameterMax() {
		return du.what("Add_RiskParameterMax").getAttribute("value");
	}
	//添加_风险系数最小值
	public void setAdd_RiskParameterMin(String value) {
		du.what("Add_RiskParameterMin").clear();
		du.what("Add_RiskParameterMin").sendKeys(value);
	}
	public String getAdd_RiskParameterMin() {
		return du.what("Add_RiskParameterMin").getAttribute("value");
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
	//修改_风险系数最大值
	public void setUpdate_RiskParameterMax(String value) {
		du.what("Update_RiskParameterMax").clear();
		du.what("Update_RiskParameterMax").sendKeys(value);
	}
	public String getUpdate_RiskParameterMax() {
		return du.what("Update_RiskParameterMax").getAttribute("value");
	}
	//修改_风险系数最小值
	public void setUpdate_RiskParameterMin(String value) {
		du.what("Update_RiskParameterMin").clear();
		du.what("Update_RiskParameterMin").sendKeys(value);
	}
	public String getUpdate_RiskParameterMin() {
		return du.what("Update_RiskParameterMin").getAttribute("value");
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