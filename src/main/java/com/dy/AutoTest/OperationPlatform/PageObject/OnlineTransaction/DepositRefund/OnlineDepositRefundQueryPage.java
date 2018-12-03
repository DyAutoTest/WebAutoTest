package com.dy.AutoTest.OperationPlatform.PageObject.OnlineTransaction.DepositRefund;

import org.openqa.selenium.Keys;

import org.openqa.selenium.WebDriver;

import com.dy.AutoTest.web.api.IClickButton;
import com.dy.AutoTest.web.api.IClickRadio;
import com.dy.AutoTest.web.api.IQuery;
import com.dy.AutoTest.web.api.SuperPage;
import com.dy.AutoTest.web.actions.DoPlus;

public class OnlineDepositRefundQueryPage extends SuperPage
			implements IQuery,IClickButton,IClickRadio{
	public OnlineDepositRefundQueryPage(WebDriver driver) {
		super(driver);
		du.loadLocator("POP_Loc_OnlineDepositRefundQuery");
	}
	public void setWaitTime(long waitTime) {
		du=new DoPlus(driver);
		du.waitTime=waitTime;
		du.loadLocator("POP_Loc_OnlineDepositRefundQuery");
	}

/***************************Manual Coding**********************************/


/****************************Auto Generate******************************/

	//高级
	public void clickAdvance() {
		du.what("Advance").click();
	}
	//内部订单号
	public void setInnerOrderNO(String value) {
		du.what("InnerOrderNO").clear();
		du.what("InnerOrderNO").sendKeys(value);
	}
	public String getInnerOrderNO() {
		return du.what("InnerOrderNO").getAttribute("value");
	}
	//流水号
	public void setSerialNO(String value) {
		du.what("SerialNO").clear();
		du.what("SerialNO").sendKeys(value);
	}
	public String getSerialNO() {
		return du.what("SerialNO").getAttribute("value");
	}
	//会计日期起始日期
	public void setAccountDateBegin(String value) {
		du.what("AccountDateBegin").sendKeys(Keys.CONTROL + "a");
		du.waitFor(500);
		du.what("AccountDateBegin").sendKeys(value);
	}
	public String getAccountDateBegin() {
		return du.what("AccountDateBegin").getAttribute("value");
	}
	//会计日期结束日期
	public void setAccountDateEnd(String value) {
		du.what("AccountDateEnd").sendKeys(Keys.CONTROL + "a");
		du.waitFor(500);
		du.what("AccountDateEnd").sendKeys(value);
	}
	public String getAccountDateEnd() {
		return du.what("AccountDateEnd").getAttribute("value");
	}
	//申请退款日期起始日期
	public void setRefundApplicationDateBegin(String value) {
		du.what("RefundApplicationDateBegin").sendKeys(Keys.CONTROL + "a");
		du.waitFor(500);
		du.what("RefundApplicationDateBegin").sendKeys(value);
	}
	public String getRefundApplicationDateBegin() {
		return du.what("RefundApplicationDateBegin").getAttribute("value");
	}
	//申请退款日期结束日期
	public void setRefundApplicationDateEnd(String value) {
		du.what("RefundApplicationDateEnd").sendKeys(Keys.CONTROL + "a");
		du.waitFor(500);
		du.what("RefundApplicationDateEnd").sendKeys(value);
	}
	public String getRefundApplicationDateEnd() {
		return du.what("RefundApplicationDateEnd").getAttribute("value");
	}
	//退款状态
	/**
	 * @param value
	 * 
	 * 	value='0' : 退款申请
		value='1' : 退款处理
		value='2' : 退款成功
		value='3' : 退款失败
		value='4' : 退款取消
		value='5' : 批量退款中
	 * 
	 * 
	 */
	public void selectRefundStatus(String value) {
		du.whatSelect("RefundStatus").selectByValue(value);
	}
	//手机号/商户号
	public void setPhoneNO(String value) {
		du.what("PhoneNO").clear();
		du.what("PhoneNO").sendKeys(value);
	}
	public String getPhoneNO() {
		return du.what("PhoneNO").getAttribute("value");
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
	//订单列表单选按钮
	public void clickRadio(String radio) {
		du.what("Radio",radio).click();
	}
	public boolean isRadioExist(String radio) {
		du.waitFor(500);
		return du.isElementExist("Radio",radio);
	}
	//查看_关闭
	public void clickCheck_Close() {
		du.what("Check_Close").click();
	}

}