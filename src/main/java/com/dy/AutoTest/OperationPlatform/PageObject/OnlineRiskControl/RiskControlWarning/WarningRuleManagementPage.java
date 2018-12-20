package com.dy.AutoTest.OperationPlatform.PageObject.OnlineRiskControl.RiskControlWarning;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.dy.AutoTest.web.api.IQuery;
import com.dy.AutoTest.web.api.SuperPage;
import com.dy.AutoTest.web.actions.DoPlus;

public class WarningRuleManagementPage extends SuperPage implements IQuery{
	public WarningRuleManagementPage(WebDriver driver) {
		super(driver);
		du.loadLocator("POP_Loc_RiskControlWarning_WarningRuleManagement");
	}
	public void setWaitTime(long waitTime) {
		du=new DoPlus(driver);
		du.waitTime=waitTime;
		du.loadLocator("POP_Loc_RiskControlWarning_WarningRuleManagement");
	}

/***************************Manual Coding**********************************/


/****************************Auto Generate******************************/

	//所属模块
	/**
	 * @param value
	 * 
	 * 	value="WDC" : 提现交易
		value="PWM" : 充值交易
		value="RPM" : 远程消费
	 * 
	 */
	public void selectModule(String value) {
		du.whatSelect("Module").selectByValue(value);
	}
	//查询
	public void clickQuery() {
		du.what("Query").click();
	}
	//重置
	public void clickReset() {
		du.what("Reset").click();
	}
	//修改
	public void clickUpdate() {
		du.what("Update").click();
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
	//修改_规则类型
	/**
	 * @param value
	 * 
	 * 	value="1" : 额度限制
		value="5" : 通路异常限制
		value="3" : 回盘逾期限制
		value="4" : 失败比例限制
		value="2" : 频次限制
	 * 
	 */
	public void selectUpdate_RuleType(String value) {
		du.whatSelect("Update_RuleType").selectByValue(value);
	}
	//修改_归属模块
	public void selectUpdate_Module(String value) {
		du.whatSelect("Update_Module").selectByValue(value);
	}
	//修改_风控参数
	public void setUpdate_RiskControlParam(String value) {
		du.what("Update_RiskControlParam").clear();
		du.what("Update_RiskControlParam").sendKeys(value);
	}
	public String getUpdate_RiskControlParam() {
		return du.what("Update_RiskControlParam").getAttribute("value");
	}
	//修改_规则描述
	public void setUpdate_RuleDescribe(String value) {
		du.what("Update_RuleDescribe").clear();
		du.what("Update_RuleDescribe").sendKeys(value);
	}
	public String getUpdate_RuleDescribe() {
		return du.what("Update_RuleDescribe").getAttribute("value");
	}
	//修改_备注
	public void setUpdate_Comment(String value) {
		du.what("Update_Comment").clear();
		du.what("Update_Comment").sendKeys(value);
	}
	public String getUpdate_Comment() {
		return du.what("Update_Comment").getAttribute("value");
	}
	//修改_确定
	public void clickUpdate_Confirm() {
		du.what("Update_Confirm").click();
	}
	//修改_关闭
	public void clickUpdate_Close() {
		du.what("Update_Close").click();
	}

}