package com.dy.AutoTest.OperationPlatform.PageObject.OnlineTransaction.Transfer;


import org.openqa.selenium.Keys;

import org.openqa.selenium.WebDriver;

import com.dy.AutoTest.web.api.IClickButton;
import com.dy.AutoTest.web.api.IClickRadio;
import com.dy.AutoTest.web.api.IQuery;
import com.dy.AutoTest.web.api.SuperPage;
import com.dy.AutoTest.web.actions.DoPlus;

public class OnlineTransferInOrderQueryPage extends SuperPage
			implements IQuery,IClickButton,IClickRadio{
	public OnlineTransferInOrderQueryPage(WebDriver driver) {
		super(driver);
		du.loadLocator("POP_Loc_OnlineTransferInOrderQuery");
	}
	public void setWaitTime(long waitTime) {
		du=new DoPlus(driver);
		du.waitTime=waitTime;
		du.loadLocator("POP_Loc_OnlineTransferInOrderQuery");
	}

/***************************Manual Coding**********************************/


/****************************Auto Generate******************************/

	//高级
	public void clickAdvance() {
		du.what("Advance").click();
	}
	//收款方手机
	public void setPayeePhoneNO(String value) {
		du.what("PayeePhoneNO").clear();
		du.what("PayeePhoneNO").sendKeys(value);
	}
	public String getPayeePhoneNO() {
		return du.what("PayeePhoneNO").getAttribute("value");
	}
	//订单状态
	public void selectOrderStatus(String value) {
		du.whatSelect("OrderStatus").selectByValue(value);
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
	//订单日期起始日期
	public void setOrderDateBegin(String value) {
		du.what("OrderDateBegin").sendKeys(Keys.CONTROL + "a");
		du.waitFor(500);
		du.what("OrderDateBegin").sendKeys(value);
	}
	public String getOrderDateBegin() {
		return du.what("OrderDateBegin").getAttribute("value");
	}
	//订单日期结束日期
	public void setOrderDateEnd(String value) {
		du.what("OrderDateEnd").sendKeys(Keys.CONTROL + "a");
		du.waitFor(500);
		du.what("OrderDateEnd").sendKeys(value);
	}
	public String getOrderDateEnd() {
		return du.what("OrderDateEnd").getAttribute("value");
	}
	//订单号
	public void setOrderNO(String value) {
		du.what("OrderNO").clear();
		du.what("OrderNO").sendKeys(value);
	}
	public String getOrderNO() {
		return du.what("OrderNO").getAttribute("value");
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