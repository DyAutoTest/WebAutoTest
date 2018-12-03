package com.dy.AutoTest.OperationPlatform.PageObject.SettlementManagement;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.dy.AutoTest.web.api.SuperPage;
import com.dy.AutoTest.web.actions.DoPlus;

public class PaymentApprovalPage extends SuperPage{
	public PaymentApprovalPage(WebDriver driver) {
		super(driver);
		du.loadLocator("POP_Loc_SettlementManagement_PaymentApproval");
	}
	public void setWaitTime(long waitTime) {
		du=new DoPlus(driver);
		du.waitTime=waitTime;
		du.loadLocator("POP_Loc_SettlementManagement_PaymentApproval");
	}

/***************************Manual Coding**********************************/


/****************************Auto Generate******************************/

	//高级
	public void clickAdvance() {
		du.what("Advance").click();
	}
	//付款类型
	public void selectPaymentType(String value) {
		du.whatSelect("PaymentType").selectByValue(value);
	}
	//复核操作状态
	public void selectRecheckOperationStatus(String value) {
		du.whatSelect("RecheckOperationStatus").selectByValue(value);
	}
	//日期类型
	public void selectDateType(String value) {
		du.whatSelect("DateType").selectByValue(value);
	}
	//日期起始日期
	public void setDateBegin(String value) {
		du.what("DateBegin").sendKeys(Keys.CONTROL + "a");
		du.waitFor(500);
		du.what("DateBegin").sendKeys(value);
	}
	public String getDateBegin() {
		return du.what("DateBegin").getAttribute("value");
	}
	//日期结束日期
	public void setDateEnd(String value) {
		du.what("DateEnd").sendKeys(Keys.CONTROL + "a");
		du.waitFor(500);
		du.what("DateEnd").sendKeys(value);
	}
	public String getDateEnd() {
		return du.what("DateEnd").getAttribute("value");
	}
	//付款银行
	public void selectPaymentBank(String value) {
		du.whatSelect("PaymentBank").selectByValue(value);
	}
	//收款银行
	public void selectCollectionBank(String value) {
		du.whatSelect("CollectionBank").selectByValue(value);
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
	//明细操作
	public void clickCheck() {
		du.what("Check").click();
	}
	//批复核通过
	public void clickBatchRecheckPass() {
		du.what("BatchRecheckPass").click();
	}
	//批复核退回
	public void clickBatchRecheckRefuse() {
		du.what("BatchRecheckRefuse").click();
	}
	//订单列表全选按钮
	public void clickCheckBoxAll() {
		du.what("CheckBoxAll").click();
	}
	//订单列表多选按钮
	public void clickCheckBoxSingle() {
		du.what("CheckBoxSingle").click();
	}
	//明细操作_复核通过
	public void clickCheck_Pass() {
		du.what("Check_Pass").click();
	}
	//明细操作_复核退回
	public void clickCheck_Refuse() {
		du.what("Check_Refuse").click();
	}
	//明细操作_订单列表全选按钮
	public void clickCheck_OrderCheckBoxAll() {
		du.what("Check_OrderCheckBoxAll").click();
	}
	//明细操作_订单列表多选按钮
	public void clickCheck_OrderCheckBoxSingle() {
		du.what("Check_OrderCheckBoxSingle").click();
	}
	//明细操作_关闭
	public void clickCheck_Close() {
		du.what("Check_Close").click();
	}
	//批复核通过_通过原因
	public void setBatchRecheckPass_Text(String value) {
		du.what("BatchRecheckPass_Text").clear();
		du.what("BatchRecheckPass_Text").sendKeys(value);
	}
	public String getBatchRecheckPass_Text() {
		return du.what("BatchRecheckPass_Text").getAttribute("value");
	}
	//批复核通过_确认
	public void clickBatchRecheckPass_Confirm() {
		du.what("BatchRecheckPass_Confirm").click();
	}
	//批复核通过_关闭
	public void clickBatchRecheckPass_Close() {
		du.what("BatchRecheckPass_Close").click();
	}
	//批复核退回_退回原因
	public void setBatchRecheckRefuse_Text(String value) {
		du.what("BatchRecheckRefuse_Text").clear();
		du.what("BatchRecheckRefuse_Text").sendKeys(value);
	}
	public String getBatchRecheckRefuse_Text() {
		return du.what("BatchRecheckRefuse_Text").getAttribute("value");
	}
	//批复核退回_确认
	public void clickBatchRecheckRefuse_Confirm() {
		du.what("BatchRecheckRefuse_Confirm").click();
	}
	//批复核退回_关闭
	public void clickBatchRecheckRefuse_Close() {
		du.what("BatchRecheckRefuse_Close").click();
	}

}