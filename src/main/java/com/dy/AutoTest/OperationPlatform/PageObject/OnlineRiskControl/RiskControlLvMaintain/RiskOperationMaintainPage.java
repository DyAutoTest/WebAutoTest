package com.dy.AutoTest.OperationPlatform.PageObject.OnlineRiskControl.RiskControlLvMaintain;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.dy.AutoTest.web.api.IQuery;
import com.dy.AutoTest.web.api.SuperPage;
import com.dy.AutoTest.web.actions.DoPlus;

public class RiskOperationMaintainPage extends SuperPage implements IQuery{
	public RiskOperationMaintainPage(WebDriver driver) {
		super(driver);
		du.loadLocator("POP_Loc_RiskControlLvMaintain_RiskOperationMaintain");
	}
	public void setWaitTime(long waitTime) {
		du=new DoPlus(driver);
		du.waitTime=waitTime;
		du.loadLocator("POP_Loc_RiskControlLvMaintain_RiskOperationMaintain");
	}

/***************************Manual Coding**********************************/


/****************************Auto Generate******************************/

	//风险业务类型
	public void setRiskBusinessType(String value) {
		du.what("RiskBusinessType").clear();
		du.what("RiskBusinessType").sendKeys(value);
	}
	public String getRiskBusinessType() {
		return du.what("RiskBusinessType").getAttribute("value");
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
	//操作列表单选按钮
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
	//添加_风险业务类型
	public void setAdd_RiskBusinessaType(String value) {
		du.what("Add_RiskBusinessaType").clear();
		du.what("Add_RiskBusinessaType").sendKeys(value);
	}
	public String getAdd_RiskBusinessaType() {
		return du.what("Add_RiskBusinessaType").getAttribute("value");
	}
	//添加_风险参考值
	public void setAdd_RiskReferenceValue(String value) {
		du.what("Add_RiskReferenceValue").clear();
		du.what("Add_RiskReferenceValue").sendKeys(value);
	}
	public String getAdd_RiskReferenceValue() {
		return du.what("Add_RiskReferenceValue").getAttribute("value");
	}
	//添加_风险参考名字
	public void setAdd_RiskReferenceName(String value) {
		du.what("Add_RiskReferenceName").clear();
		du.what("Add_RiskReferenceName").sendKeys(value);
	}
	public String getAdd_RiskReferenceName() {
		return du.what("Add_RiskReferenceName").getAttribute("value");
	}
	//添加_权重参考ID
	public void setAdd_WeightReferenceID(String value) {
		du.what("Add_WeightReferenceID").clear();
		du.what("Add_WeightReferenceID").sendKeys(value);
	}
	public String getAdd_WeightReferenceID() {
		return du.what("Add_WeightReferenceID").getAttribute("value");
	}
	//添加_风险参考描述
	public void setAdd_RiskReferenceDescribe(String value) {
		du.what("Add_RiskReferenceDescribe").clear();
		du.what("Add_RiskReferenceDescribe").sendKeys(value);
	}
	public String getAdd_RiskReferenceDescribe() {
		return du.what("Add_RiskReferenceDescribe").getAttribute("value");
	}
	//添加_提交
	public void clickAdd_Submit() {
		du.what("Add_Submit").click();
	}
	//添加_关闭
	public void clickAdd_Close() {
		du.what("Add_Close").click();
	}
	//修改_风险参考值
	public void setUpdate_RiskReferenceValue(String value) {
		du.what("Update_RiskReferenceValue").clear();
		du.what("Update_RiskReferenceValue").sendKeys(value);
	}
	public String getUpdate_RiskReferenceValue() {
		return du.what("Update_RiskReferenceValue").getAttribute("value");
	}
	//修改_风险参考名字
	public void setUpdate_ReferenceName(String value) {
		du.what("Update_ReferenceName").clear();
		du.what("Update_ReferenceName").sendKeys(value);
	}
	public String getUpdate_ReferenceName() {
		return du.what("Update_ReferenceName").getAttribute("value");
	}
	//修改_权重参考ID
	public void setUpdate_WeightReferenceID(String value) {
		du.what("Update_WeightReferenceID").clear();
		du.what("Update_WeightReferenceID").sendKeys(value);
	}
	public String getUpdate_WeightReferenceID() {
		return du.what("Update_WeightReferenceID").getAttribute("value");
	}
	//修改_风险参考描述
	public void setUpdate_RiskReferenceDescribe(String value) {
		du.what("Update_RiskReferenceDescribe").clear();
		du.what("Update_RiskReferenceDescribe").sendKeys(value);
	}
	public String getUpdate_RiskReferenceDescribe() {
		return du.what("Update_RiskReferenceDescribe").getAttribute("value");
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