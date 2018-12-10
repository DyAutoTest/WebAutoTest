package com.dy.AutoTest.OperationPlatform.PageObject.SettlementManagement.Payment;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.dy.AutoTest.web.api.IClickButton;
import com.dy.AutoTest.web.api.IQuery;
import com.dy.AutoTest.web.api.SuperPage;
import com.dy.AutoTest.web.actions.DoPlus;

public class RiskApprovalPage extends SuperPage
		implements IQuery,IClickButton{
	
	public RiskApprovalPage(WebDriver driver) {
		super(driver);
		du.loadLocator("POP_Loc_SettlementManagement_RiskApproval");
	}
	public void setWaitTime(long waitTime) {
		du=new DoPlus(driver);
		du.waitTime=waitTime;
		du.loadLocator("POP_Loc_SettlementManagement_RiskApproval");
	}

/***************************Manual Coding**********************************/


/****************************Auto Generate******************************/

	//高级
	public void clickAdvance() {
		du.what("Advance").click();
	}
	//付款银行
	public void selectPaymentBank(String value) {
		du.whatSelect("PaymentBank").selectByValue(value);
	}
	//收款银行
	public void selectCollectionBank(String value) {
		du.whatSelect("CollectionBank").selectByValue(value);
	}
	//日期类型
	/**
	 * @param value
	 * 
		value="1" : 付款日
		value="3" : 订单日
	 */
	public void selectDateType(String value) {
		du.whatSelect("DateType").selectByValue(value);
	}
	//付款/订单日期起始日期
	public void setDateBegin(String value) {
		du.what("DateBegin").sendKeys(Keys.CONTROL + "a");
		du.waitFor(500);
		du.what("DateBegin").sendKeys(value);
	}
	public String getDateBegin() {
		return du.what("DateBegin").getAttribute("value");
	}
	//付款/订单日期结束日期
	public void setDateEnd(String value) {
		du.what("DateEnd").sendKeys(Keys.CONTROL + "a");
		du.waitFor(500);
		du.what("DateEnd").sendKeys(value);
	}
	public String getDateEnd() {
		return du.what("DateEnd").getAttribute("value");
	}
	//付款类型
	/**
	 * @param value
	 * 
		value="42" : 认证打款
		value="21" : 商户结算
		value="11" : 用户提现
		value="22" : 商户自主结算
		value="41" : 资金调拨
	 * 
	 */
	public void selectPaymentType(String value) {
		du.whatSelect("PaymentType").selectByValue(value);
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
	//批审批通过
	public void clickPass() {
		du.what("Pass").click();
	}
	//批审批拒绝
	public void clickRefuse() {
		du.what("Refuse").click();
	}
	//操作类型列表单选按钮
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
	//明细操作_审批通过
	public void clickCheck_Pass() {
		du.what("Check_Pass").click();
	}
	//明细操作_审批拒绝
	public void clickCheck_Refuse() {
		du.what("Check_Refuse").click();
	}
	//明细操作_明细列表单选按钮
	public void clickCheck_Radio(String radio) {
		du.what("Check_Radio",radio).click();
	}
	public boolean isCheck_RadioExist(String radio) {
		du.waitFor(500);
		return du.isElementExist("Check_Radio",radio);
	}
	public boolean isCheck_RadioDisplayed(String radio) {
		du.waitFor(500);
		return du.what("Check_Radio",radio).isDisplayed();
	}
	//明细操作_关闭
	public void clickCheck_Close() {
		du.what("Check_Close").click();
	}
	//批审批通过_通过原因
	public void setPass_Text(String value) {
		du.what("Pass_Text").clear();
		du.what("Pass_Text").sendKeys(value);
	}
	public String getPass_Text() {
		return du.what("Pass_Text").getAttribute("value");
	}
	//批审批通过_确定
	public void clickPass_Confirm() {
		du.what("Pass_Confirm").click();
	}
	//批审批通过_关闭
	public void clickPass_Close() {
		du.what("Pass_Close").click();
	}
	//批审批拒绝_拒绝原因
	public void setRefuse_Text(String value) {
		du.what("Refuse_Text").clear();
		du.what("Refuse_Text").sendKeys(value);
	}
	public String getRefuse_Text() {
		return du.what("Refuse_Text").getAttribute("value");
	}
	//批审批拒绝_确定
	public void clickRefuse_Confirm() {
		du.what("Refuse_Confirm").click();
	}
	//批审批拒绝_关闭
	public void clickRefuse_Close() {
		du.what("Refuse_Close").click();
	}
	//明细操作_审批拒绝理由
	public void setCheck_Refuse_Text(String value) {
		du.what("Check_Refuse_Text").clear();
		du.what("Check_Refuse_Text").sendKeys(value);
	}
	public String getCheck_Refuse_Text() {
		return du.what("Check_Refuse_Text").getAttribute("value");
	}
	//明细操作_审批通过理由
	public void setCheck_Pass_Text(String value) {
		du.what("Check_Pass_Text").clear();
		du.what("Check_Pass_Text").sendKeys(value);
	}
	public String getCheck_Pass_Text() {
		return du.what("Check_Pass_Text").getAttribute("value");
	}
	//明细操作_审批拒绝_确认
	public void clickCheck_Refuse_Confirm() {
		du.what("Check_Refuse_Confirm").click();
	}
	//明细操作_审批拒绝_关闭
	public void clickCheck_Refuse_Close() {
		du.what("Check_Refuse_Close").click();
	}
	//明细操作_审批通过_确认
	public void clickCheck_Pass_Confirm() {
		du.what("Check_Pass_Confirm").click();
	}
	//明细操作_审批通过_关闭
	public void clickCheck_Pass_Close() {
		du.what("Check_Pass_Close").click();
	}

}