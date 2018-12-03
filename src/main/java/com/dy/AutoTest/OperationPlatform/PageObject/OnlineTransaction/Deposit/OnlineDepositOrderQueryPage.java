package com.dy.AutoTest.OperationPlatform.PageObject.OnlineTransaction.Deposit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.dy.AutoTest.web.api.IClickButton;
import com.dy.AutoTest.web.api.IClickRadio;
import com.dy.AutoTest.web.api.IQuery;
import com.dy.AutoTest.web.api.SuperPage;
import com.dy.AutoTest.web.actions.DoPlus;

public class OnlineDepositOrderQueryPage extends SuperPage 
		implements IQuery,IClickButton,IClickRadio{
	public OnlineDepositOrderQueryPage(WebDriver driver) {
		super(driver);
		du.loadLocator("POP_Loc_OnlineDepositOrderQuery");
	}
	public void setWaitTime(long waitTime) {
		du=new DoPlus(driver);
		du.waitTime=waitTime;
		du.loadLocator("POP_Loc_OnlineDepositOrderQuery");
	}

/***************************Manual Coding**********************************/


/****************************Auto Generate******************************/

	//高级
	public void clickAdvance() {
		du.what("Advance").click();
	}
	//商户号
	public void setMerchantNO(String value) {
		du.what("MerchantNO").clear();
		du.what("MerchantNO").sendKeys(value);
	}
	public String getMerchantNO() {
		return du.what("MerchantNO").getAttribute("value");
	}
	//内部用户号
	public void setInnerUserNO(String value) {
		du.what("InnerUserNO").clear();
		du.what("InnerUserNO").sendKeys(value);
	}
	public String getInnerUserNO() {
		return du.what("InnerUserNO").getAttribute("value");
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
	//合作机构
	public void selectCooperation(String value) {
		du.whatSelect("Cooperation").selectByValue(value);
	}
	//充值类型
	/**
	 * @param value
	 * 
	 * 	value='0' : 个人普通充值
		value='1' : 商户普通充值
		value='2' : 普通消费补款
		value='3' : 网关消费补款
		value='6' : 企业普通充值
		value='7' : 企业用户线下打款
		value='8' : 普通聚合支付补款
		value='A' : 企业聚合消费补款
		value='B' : 企业B2B消费补款
		value='C' : 企业B2C消费补款
		value='D' : 企业聚合还款补款
		value='E' : 企业B2B还款补款
		value='F' : 企业B2C还款补款
		value='10' : 个人线下打款
		value='9' : 商户线下打款
		value='G' : 开放平台快捷消费补款
		value='H' : 开放平台网关消费补款
		value='I' : 开放平台B2B消费补款
		value='J' : 信用卡分期消费补款
		value='K' : 信用卡WAP版分期消费补款
		value='L' : 商户企业网银B2B消费补款
		value='M' : 商户个人网银B2B消费补款
	 * 
	 * 
	 */
	public void selectDepositType(String value) {
		du.whatSelect("DepositType").selectByValue(value);
	}
	//内部订单号
	public void setInnerOrderNO(String value) {
		du.what("InnerOrderNO").clear();
		du.what("InnerOrderNO").sendKeys(value);
	}
	public String getInnerOrderNO() {
		return du.what("InnerOrderNO").getAttribute("value");
	}
	//充值订单号
	public void setDepositOrderNO(String value) {
		du.what("DepositOrderNO").clear();
		du.what("DepositOrderNO").sendKeys(value);
	}
	public String getDepositOrderNO() {
		return du.what("DepositOrderNO").getAttribute("value");
	}
	//订单状态
	/**
	 * @param value
	 * 
	 * 	value='F1' : 交易失败
		value='S1' : 交易成功
		value='W2' : 等待充值
		value='R2' : 退款成功
		value='S2' : 付款成功
		value='E1' : 交易逾期
		value='C1' : 交易冲正
		value='S' : 交易成功
		value='F' : 交易失败
		value='P' : 充值处理中
		value='W4' : 第三方处理中
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
	//查看
	public void clickCheck() {
		du.what("Check").click();
	}
	//通道查询
	public void clickChannelQuery() {
		du.what("ChannelQuery").click();
	}
	//导出Excel
	public void clickExcel() {
		du.what("Excel").click();
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
	//Excel_确定
	public void clickExcel_Confirm() {
		du.what("Excel_Confirm").click();
	}
	//Excel_关闭
	public void clickExcel_Close() {
		du.what("Excel_Close").click();
	}

}