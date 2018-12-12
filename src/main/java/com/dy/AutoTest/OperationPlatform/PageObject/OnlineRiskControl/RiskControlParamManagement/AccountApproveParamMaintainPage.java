package com.dy.AutoTest.OperationPlatform.PageObject.OnlineRiskControl.RiskControlParamManagement;

import org.openqa.selenium.WebDriver;

import com.dy.AutoTest.web.api.IQuery;
import com.dy.AutoTest.web.api.SuperPage;
import com.dy.AutoTest.web.actions.DoPlus;

public class AccountApproveParamMaintainPage extends SuperPage implements IQuery{
	public AccountApproveParamMaintainPage(WebDriver driver) {
		super(driver);
		du.loadLocator("POP_Loc_RiskControlParamManagement_AccountApproveParamMaintain");
	}
	public void setWaitTime(long waitTime) {
		du=new DoPlus(driver);
		du.waitTime=waitTime;
		du.loadLocator("POP_Loc_RiskControlParamManagement_AccountApproveParamMaintain");
	}

/***************************Manual Coding**********************************/


/****************************Auto Generate******************************/

	//高级
	public void clickAdvance() {
		du.what("Advance").click();
	}
	//账户种类
	/**
	 * @param value
	 * 
	 * 		value="100" : 100-个人账户
		value="800" : 800-商户账户
	 * 
	 */
	public void selectAccountType(String value) {
		du.whatSelect("AccountType").selectByValue(value);
	}
	//资金种类
	/**
	 * @param value
	 * 
	 * value="1" : 现金
	 */
	public void selectMoneyType(String value) {
		du.whatSelect("MoneyType").selectByValue(value);
	}
	//业务类型
	/**
	 * @param value
	 * 
	 * 		value='E050' : 手机缴费
		value='0013' : 非注册用户消费
		value='0021' : 非注册用户消费退款
		value='003A' : B2B充值
		value='0030' : 转账到账户
		value='E052' : 信用卡还款
		value='0009' : 用户消费
		value='0017' : 用户消费退款
		value='0001' : B2C充值
		value='B071' : 代收自账户
		value='0027' : 商户提现
		value='0026' : 用户提现
		value='0004' : 快捷充值
		value='E051' : 生活缴费
		value='0813' : 代收自账户
		value='0821' : 代收自银行卡
		value='0811' : 代付到账户
		value='0819' : 代付到银行卡
	 * 
	 */
	public void selectBusinessType(String value) {
		du.whatSelect("BusinessType").selectByValue(value);
	}
	//交易类型
	/**
	 * @param value
	 * 
	 * 		value='52' : 代收
		value='02' : 消费
		value='04' : 提现
		value='01' : 充值
		value='03' : 消费退款
		value='E1' : 缴费
		value='51' : 代付
		value='05' : 转帐
		
	 */
	public void selectTradeType(String value) {
		du.whatSelect("TradeType").selectByValue(value);
	}
	//级别限制
	/**
	 * @param value
	 * 
	 * 		value="02" : 强实名
		value="01" : 弱实名
		value="00" : 非实名
	 * 
	 */
	public void selectLevelLimit(String value) {
		du.whatSelect("LevelLimit").selectByValue(value);
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
	//参数列表单选按钮
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
	//添加_账户类型
	public void selectAdd_AccountType(String value) {
		du.whatSelect("Add_AccountType").selectByValue(value);
	}
	//添加_资金种类
	public void selectAdd_MoneyType(String value) {
		du.whatSelect("Add_MoneyType").selectByValue(value);
	}
	//添加_交易类型
	public void selectAdd_TradeType(String value) {
		du.whatSelect("Add_TradeType").selectByValue(value);
	}
	//添加_业务类型
	public void selectAdd_BusinessType(String value) {
		du.whatSelect("Add_BusinessType").selectByValue(value);
	}
	//添加_限制级别
	public void selectAdd_LimitLevel(String value) {
		du.whatSelect("Add_LimitLevel").selectByValue(value);
	}
	//添加_单笔审批限额
	public void setAdd_SingleApproveLimit(String value) {
		du.what("Add_SingleApproveLimit").clear();
		du.what("Add_SingleApproveLimit").sendKeys(value);
	}
	public String getAdd_SingleApproveLimit() {
		return du.what("Add_SingleApproveLimit").getAttribute("value");
	}
	//添加_日审批限额
	public void setAdd_DayApproveLimit(String value) {
		du.what("Add_DayApproveLimit").clear();
		du.what("Add_DayApproveLimit").sendKeys(value);
	}
	public String getAdd_DayApproveLimit() {
		return du.what("Add_DayApproveLimit").getAttribute("value");
	}
	//添加_日审批累计次数
	public void setAdd_DayApproveTimes(String value) {
		du.what("Add_DayApproveTimes").clear();
		du.what("Add_DayApproveTimes").sendKeys(value);
	}
	public String getAdd_DayApproveTimes() {
		return du.what("Add_DayApproveTimes").getAttribute("value");
	}
	//添加_月审批限额
	public void setAdd_MonthApproveLimit(String value) {
		du.what("Add_MonthApproveLimit").clear();
		du.what("Add_MonthApproveLimit").sendKeys(value);
	}
	public String getAdd_MonthApproveLimit() {
		return du.what("Add_MonthApproveLimit").getAttribute("value");
	}
	//添加_月审批累计次数
	public void setAdd_MonthApproveTimes(String value) {
		du.what("Add_MonthApproveTimes").clear();
		du.what("Add_MonthApproveTimes").sendKeys(value);
	}
	public String getAdd_MonthApproveTimes() {
		return du.what("Add_MonthApproveTimes").getAttribute("value");
	}
	//添加_提交
	public void clickAdd_Submit() {
		du.what("Add_Submit").click();
	}
	//添加_关闭
	public void clickAdd_Close() {
		du.what("Add_Close").click();
	}
	//修改_单笔审批限额
	public void setUpdate_SingleApproveLimit(String value) {
		du.what("Update_SingleApproveLimit").clear();
		du.what("Update_SingleApproveLimit").sendKeys(value);
	}
	public String getUpdate_SingleApproveLimit() {
		return du.what("Update_SingleApproveLimit").getAttribute("value");
	}
	//修改_日审批限额
	public void setUpdate_DayApproveLimit(String value) {
		du.what("Update_DayApproveLimit").clear();
		du.what("Update_DayApproveLimit").sendKeys(value);
	}
	public String getUpdate_DayApproveLimit() {
		return du.what("Update_DayApproveLimit").getAttribute("value");
	}
	//修改_日审批累计次数
	public void setUpdate_DayApproveTimes(String value) {
		du.what("Update_DayApproveTimes").clear();
		du.what("Update_DayApproveTimes").sendKeys(value);
	}
	public String getUpdate_DayApproveTimes() {
		return du.what("Update_DayApproveTimes").getAttribute("value");
	}
	//修改_月审批限额
	public void setUpdate_MonthApproveLimit(String value) {
		du.what("Update_MonthApproveLimit").clear();
		du.what("Update_MonthApproveLimit").sendKeys(value);
	}
	public String getUpdate_MonthApproveLimit() {
		return du.what("Update_MonthApproveLimit").getAttribute("value");
	}
	//修改_月审批累计次数
	public void setUpdate_MonthApproveTimes(String value) {
		du.what("Update_MonthApproveTimes").clear();
		du.what("Update_MonthApproveTimes").sendKeys(value);
	}
	public String getUpdate_MonthApproveTimes() {
		return du.what("Update_MonthApproveTimes").getAttribute("value");
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