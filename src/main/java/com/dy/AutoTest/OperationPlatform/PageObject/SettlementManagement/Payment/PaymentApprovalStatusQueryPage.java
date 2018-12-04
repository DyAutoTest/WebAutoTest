package com.dy.AutoTest.OperationPlatform.PageObject.SettlementManagement.Payment;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.dy.AutoTest.web.api.IQuery;
import com.dy.AutoTest.web.api.SuperPage;
import com.dy.AutoTest.web.actions.DoPlus;

public class PaymentApprovalStatusQueryPage extends SuperPage
		implements IQuery{
	public PaymentApprovalStatusQueryPage(WebDriver driver) {
		super(driver);
		du.loadLocator("POP_Loc_SettlementManagement_PaymentApprovalStatusQuery");
	}
	public void setWaitTime(long waitTime) {
		du=new DoPlus(driver);
		du.waitTime=waitTime;
		du.loadLocator("POP_Loc_SettlementManagement_PaymentApprovalStatusQuery");
	}

/***************************Manual Coding**********************************/


/****************************Auto Generate******************************/

	//高级
	public void clickAdvance() {
		du.what("Advance").click();
	}
	//风控审批状态
	/**
	 * @param value
	 * 
	 * 	value='1' : 待风控审批
		value='0' : 不需要审批
		value='3' : 风控拒绝-单笔超限
		value='9' : 风控拒绝-累计超限
		value='2' : 风控审批通过
	 * 
	 */
	public void selectRiskApprovalStatus(String value) {
		du.whatSelect("RiskApprovalStatus").selectByValue(value);
	}
	//付款审批状态
	/**
	 * @param value
	 * 
	 * 	value='1' : 待财务操作
		value='2' : 付款操作确认
		value='3' : 付款操作转网银
		value='4' : 付款操作撤销
		value='0' : 不需要操作
	 * 
	 */
	public void selectPaymentApprovalStatus(String value) {
		du.whatSelect("PaymentApprovalStatus").selectByValue(value);
	}
	//日期类型
	/**
	 * @param value
	 * 
	 * 	value="1" : 付款日
		value="3" : 订单日
	 * 
	 */
	public void selectDateType(String value) {
		du.whatSelect("DateType").selectByValue(value);
	}
	//选择日期起始日期
	public void setDateBegin(String value) {
		du.what("DateBegin").sendKeys(Keys.CONTROL + "a");
		du.waitFor(500);
		du.what("DateBegin").sendKeys(value);
	}
	public String getDateBegin() {
		return du.what("DateBegin").getAttribute("value");
	}
	//选择日期结束日期
	public void setDateEnd(String value) {
		du.what("DateEnd").sendKeys(Keys.CONTROL + "a");
		du.waitFor(500);
		du.what("DateEnd").sendKeys(value);
	}
	public String getDateEnd() {
		return du.what("DateEnd").getAttribute("value");
	}
	//复核审批状态
	/**
	 * @param value
	 * 
	 * 	value='1' : 待复核
		value='2' : 复核付款
		value='3' : 复核退回
		value='0' : 不需要复核
		value='6' : 系统拒绝
		value='4' : 复核转网银
		value='5' : 复核撤销
	 * 
	 */
	public void selectRecheckApprovalStatus(String value) {
		du.whatSelect("RecheckApprovalStatus").selectByValue(value);
	}
	//付款类型
	/**
	 * @param value
	 * 
	 * 	value='42' : 认证打款
		value='21' : 商户结算
		value='11' : 用户提现
		value='22' : 商户自主结算
		value='41' : 资金调拨
	 * 
	 */
	public void selectPaymentType(String value) {
		du.whatSelect("PaymentType").selectByValue(value);
	}
	//付款银行
	public void selectPaymentBank(String value) {
		du.whatSelect("PaymentBank").selectByValue(value);
	}
	//内部用户号
	public void setInnerUserNO(String value) {
		du.what("InnerUserNO").clear();
		du.what("InnerUserNO").sendKeys(value);
	}
	public String getInnerUserNO() {
		return du.what("InnerUserNO").getAttribute("value");
	}
	//查询
	public void clickQuery() {
		du.what("Query").click();
	}
	//重置
	public void clickReset() {
		du.what("Reset").click();
	}
	//状态列表单选按钮
	public void clickRadio(String radio) {
		du.what("Radio",radio).click();
	}
	public boolean isRadioExist(String radio) {
		du.waitFor(500);
		return du.isElementExist("Radio",radio);
	}

}