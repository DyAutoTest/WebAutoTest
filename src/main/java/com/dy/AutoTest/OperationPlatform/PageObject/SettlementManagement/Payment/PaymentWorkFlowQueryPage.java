package com.dy.AutoTest.OperationPlatform.PageObject.SettlementManagement.Payment;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.dy.AutoTest.web.api.IQuery;
import com.dy.AutoTest.web.api.SuperPage;
import com.dy.AutoTest.web.actions.DoPlus;

public class PaymentWorkFlowQueryPage extends SuperPage
			implements IQuery{
	
	public PaymentWorkFlowQueryPage(WebDriver driver) {
		super(driver);
		du.loadLocator("POP_Loc_SettlementManagement_PaymentWorkFlowQuery");
	}
	public void setWaitTime(long waitTime) {
		du=new DoPlus(driver);
		du.waitTime=waitTime;
		du.loadLocator("POP_Loc_SettlementManagement_PaymentWorkFlowQuery");
	}

/***************************Manual Coding**********************************/


/****************************Auto Generate******************************/

	//付款银行
	public void selectPaymentBank(String value) {
		du.whatSelect("PaymentBank").selectByValue(value);
	}
	//付款类型
	/**
	 * @param value
	 * 
	 * 	value="42" : 认证打款
		value="21" : 商户结算
		value="11" : 用户提现
		value="22" : 商户自主结算
		value="41" : 资金调拨
	 * 
	 */
	public void selectPayType(String value) {
		du.whatSelect("PayType").selectByValue(value);
	}
	//审批工作流
	/**
	 * @param value
	 * 
	 * 	value='R1' : 待风控审批
		value='P1' : 待财务操作
		value='W1' : 付款待复核
		value='E1' : 审批结束
		value='W2' : 转网银待复核
		value='W3' : 撤销待复核
	 * 
	 */
	public void selectApprovalWorkFlow(String value) {
		du.whatSelect("ApprovalWorkFlow").selectByValue(value);
	}
	//付款申请日起始日期
	public void setPaymentApplicationDateBegin(String value) {
		du.what("PaymentApplicationDateBegin").sendKeys(Keys.CONTROL + "a");
		du.waitFor(500);
		du.what("PaymentApplicationDateBegin").sendKeys(value);
	}
	public String getPaymentApplicationDateBegin() {
		return du.what("PaymentApplicationDateBegin").getAttribute("value");
	}
	//付款申请日结束日期
	public void setPaymentApplicationDateEnd(String value) {
		du.what("PaymentApplicationDateEnd").sendKeys(Keys.CONTROL + "a");
		du.waitFor(500);
		du.what("PaymentApplicationDateEnd").sendKeys(value);
	}
	public String getPaymentApplicationDateEnd() {
		return du.what("PaymentApplicationDateEnd").getAttribute("value");
	}
	//内部用户号
	public void setInnerUserNO(String value) {
		du.what("InnerUserNO").clear();
		du.what("InnerUserNO").sendKeys(value);
	}
	public String getInnerUserNO() {
		return du.what("InnerUserNO").getAttribute("value");
	}
	//订单状态
	/**
	 * @param value
	 * 
	 * 	value="F4" : 付款失败待审核
		value="FW" : 失败待确认
		value="F1" : 付款失败
		value="F9" : 打款失败
		value="S9" : 付款完成
		value="S8" : 打款成功
		value="S2" : 付款成功
		value="S1" : 银行受理成功
		value="U0" : 初始状态
		value="W3" : 系统受理中
		value="A7" : 待审核
		value="F8" : 审核不通过
		value="R9" : 撤销成功
	 * 
	 */
	public void selectOrderStatus(String value) {
		du.whatSelect("OrderStatus").selectByValue(value);
	}
	//查询
	public void clickQuery() {
		du.what("Query").click();
	}
	//重置
	public void clickReset() {
		du.what("Reset").click();
	}
	//银联结算文件下载
	public void clickUnionFileDownload() {
		du.what("UnionFileDownload").click();
	}
	//工作流列表全选按钮
	public void clickCheckBoxAll() {
		du.what("CheckBoxAll").click();
	}
	//工作流列表多选按钮
	public void clickCheckBoxSingle() {
		du.what("CheckBoxSingle").click();
	}

}