package com.dy.AutoTest.OperationPlatform.PageObject.OnlineRiskControl.RiskControlLvMaintain;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.dy.AutoTest.web.api.IQuery;
import com.dy.AutoTest.web.api.SuperPage;
import com.dy.AutoTest.web.actions.DoPlus;

public class RiskCustomerMaintainPage extends SuperPage implements IQuery{
	public RiskCustomerMaintainPage(WebDriver driver) {
		super(driver);
		du.loadLocator("POP_Loc_RiskControlLvMaintain_RiskCustomerMaintain");
	}
	public void setWaitTime(long waitTime) {
		du=new DoPlus(driver);
		du.waitTime=waitTime;
		du.loadLocator("POP_Loc_RiskControlLvMaintain_RiskCustomerMaintain");
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
	//查看
	public void clickCheck() {
		du.what("Check").click();
	}
	//删除
	public void clickDelete() {
		du.what("Delete").click();
	}

}