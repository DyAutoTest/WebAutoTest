package com.dy.AutoTest.OperationPlatform.PageObject.SettlementManagement;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.dy.AutoTest.web.api.SuperPage;
import com.dy.AutoTest.web.actions.DoPlus;

public class PaymentWorkFlowQueryPage extends SuperPage{
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
	public void selectPayType(String value) {
		du.whatSelect("PayType").selectByValue(value);
	}
	//审批工作流
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