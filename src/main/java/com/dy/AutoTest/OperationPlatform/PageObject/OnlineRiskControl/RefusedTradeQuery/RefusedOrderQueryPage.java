package com.dy.AutoTest.OperationPlatform.PageObject.OnlineRiskControl.RefusedTradeQuery;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.dy.AutoTest.web.api.IQuery;
import com.dy.AutoTest.web.api.SuperPage;
import com.dy.AutoTest.web.actions.DoPlus;

public class RefusedOrderQueryPage extends SuperPage implements IQuery{
	public RefusedOrderQueryPage(WebDriver driver) {
		super(driver);
		du.loadLocator("POP_Loc_RefusedTradeQuery_RefusedOrderQuery");
	}
	public void setWaitTime(long waitTime) {
		du=new DoPlus(driver);
		du.waitTime=waitTime;
		du.loadLocator("POP_Loc_RefusedTradeQuery_RefusedOrderQuery");
	}

/***************************Manual Coding**********************************/


/****************************Auto Generate******************************/

	//高级
	public void clickAdvance() {
		du.what("Advance").click();
	}
	//付款方内部号
	public void setPayerInternalNO(String value) {
		du.what("PayerInternalNO").clear();
		du.what("PayerInternalNO").sendKeys(value);
	}
	public String getPayerInternalNO() {
		return du.what("PayerInternalNO").getAttribute("value");
	}
	//收款方内部号
	public void setPayeeInternalNO(String value) {
		du.what("PayeeInternalNO").clear();
		du.what("PayeeInternalNO").sendKeys(value);
	}
	public String getPayeeInternalNO() {
		return du.what("PayeeInternalNO").getAttribute("value");
	}
	//业务类型
	/**
	 * @param value
	 * 
	 * 	value='E050' : 手机缴费
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
	 * 	value='52' : 代收
		value='02' : 消费
		value='04' : 提现
		value='01' : 充值
		value='03' : 消费退款
		value='E1' : 缴费
		value='51' : 代付
		value='05' : 转帐
	 * 
	 */
	public void selectTradeType(String value) {
		du.whatSelect("TradeType").selectByValue(value);
	}
	//交易订单号
	public void setTradeOrderNO(String value) {
		du.what("TradeOrderNO").clear();
		du.what("TradeOrderNO").sendKeys(value);
	}
	public String getTradeOrderNO() {
		return du.what("TradeOrderNO").getAttribute("value");
	}
	//有效日期起始日期
	public void setDateBegin(String value) {
		du.what("DateBegin").sendKeys(Keys.CONTROL + "a");
		du.waitFor(500);
		du.what("DateBegin").sendKeys(value);
	}
	public String getDateBegin() {
		return du.what("DateBegin").getAttribute("value");
	}
	//有效日期结束日期
	public void setDateEnd(String value) {
		du.what("DateEnd").sendKeys(Keys.CONTROL + "a");
		du.waitFor(500);
		du.what("DateEnd").sendKeys(value);
	}
	public String getDateEnd() {
		return du.what("DateEnd").getAttribute("value");
	}
	//手机号/邮箱
	public void setPhone(String value) {
		du.what("Phone").clear();
		du.what("Phone").sendKeys(value);
	}
	public String getPhone() {
		return du.what("Phone").getAttribute("value");
	}
	//查询
	public void clickQuery() {
		du.what("Query").click();
	}
	//重置
	public void clickReset() {
		du.what("Reset").click();
	}

}