package com.dy.AutoTest.OperationPlatform.PageObject.OnlineTransaction.PurchaseOrder;

import com.dy.AutoTest.web.api.IClickButton;
import com.dy.AutoTest.web.api.IClickRadio;
import com.dy.AutoTest.web.api.IQuery;

import org.openqa.selenium.Keys;

import org.openqa.selenium.WebDriver;

import com.dy.AutoTest.web.api.SuperPage;
import com.dy.AutoTest.web.actions.DoPlus;

public class OnlinePurchaseOrderQueryPage extends SuperPage implements IQuery,IClickRadio,IClickButton {
	public OnlinePurchaseOrderQueryPage(WebDriver driver) {
		super(driver);
		du.loadLocator("POP_Loc_OnlinePurchaseOrderQuery");
	}
	public void setWaitTime(long waitTime) {
		du=new DoPlus(driver);
		du.waitTime=waitTime;
		du.loadLocator("POP_Loc_OnlinePurchaseOrderQuery");
	}

/*************************** Manual Coding ******************************/


/****************************Auto Generate******************************/

	//高级
	public void clickAdvance() {
		du.what("Advance").click();
	}
	//商户订单号
	public void setMerchantOrderNO(String value) {
		du.what("MerchantOrderNO").clear();
		du.what("MerchantOrderNO").sendKeys(value);
	}
	public String getMerchantOrderNO() {
		return du.what("MerchantOrderNO").getAttribute("value");
	}
	//商户编号
	public void setMerchantNO(String value) {
		du.what("MerchantNO").clear();
		du.what("MerchantNO").sendKeys(value);
	}
	public String getMerchantNO() {
		return du.what("MerchantNO").getAttribute("value");
	}
	//会计日期（起始日期）
	public void setAccountingDateBegin(String value) {
		du.what("AccountingDateBegin").sendKeys(Keys.CONTROL + "a");
		du.waitFor(500);
		du.what("AccountingDateBegin").sendKeys(value);
	}
	public String getAccountingDateBegin() {
		return du.what("AccountingDateBegin").getAttribute("value");
	}
	//会计日期（结束日期）
	public void setAccountingDateEnd(String value) {
		du.what("AccountingDateEnd").sendKeys(Keys.CONTROL + "a");
		du.waitFor(500);
		du.what("AccountingDateEnd").sendKeys(value);
	}
	public String getAccountingDateEnd() {
		return du.what("AccountingDateEnd").getAttribute("value");
	}
	//订单日期（起始日期）
	public void setOrderDateBegin(String value) {
		du.what("OrderDateBegin").sendKeys(Keys.CONTROL + "a");
		du.waitFor(500);
		du.what("OrderDateBegin").sendKeys(value);
	}
	public String getOrderDateBegin() {
		return du.what("OrderDateBegin").getAttribute("value");
	}
	//订单日期（结束日期）
	public void setOrderDateEnd(String value) {
		du.what("OrderDateEnd").sendKeys(Keys.CONTROL + "a");
		du.waitFor(500);
		du.what("OrderDateEnd").sendKeys(value);
	}
	public String getOrderDateEnd() {
		return du.what("OrderDateEnd").getAttribute("value");
	}
	//业务渠道
	/**
	 * @param value
	 * 
	 * 	value='APP' : 移动客户端
		value='PGW' : 支付网关
		value='BUI' : BUI生产支撑系统
		value='WWW' : 门户网站
		value='SDK' : 移动收银台
		value='POS' : 收单POS
		value='PSM' : 清结算
		value='BOSS' : 运营系统
		value='SMS' : 短信
		value='UI'  : UI生产支撑系统
		value='SYS' : 支付系统平台
		value='BSP' : 联机批量
		value='BAT' : 批量
	 * 
	 * 
	 */
	public void selectBusinessChannel(String value) {
		du.whatSelect("BusinessChannel").selectByValue(value);
	}
	//支付方式
	/**
	 * @param value
	 * 
	 * 	value='1' : 账户支付
		value='0' : --
		value='8' : 营销工具支付
		value='5' : 消费卡支付
		value='6' : 终端刷卡支付
		value='3' : 银行卡支付
		value='4' : 网关支付
		value='9' : 信用卡快捷支付
		value='18' : 企业网银支付
		value='12' : 微信APP支付
		value='2' : 借记卡快捷支付
		value='7' : 微信C扫B支付
	 */
	public void selectPaymentMode(String value) {
		du.whatSelect("PaymentMode").selectByValue(value);
	}
	//用户手机号
	public void setUserPhoneNO(String value) {
		du.what("UserPhoneNO").clear();
		du.what("UserPhoneNO").sendKeys(value);
	}
	public String getUserPhoneNO() {
		return du.what("UserPhoneNO").getAttribute("value");
	}
	//内部订单号
	public void setInnerOrderNO(String value) {
		du.what("InnerOrderNO").clear();
		du.what("InnerOrderNO").sendKeys(value);
	}
	public String getInnerOrderNO() {
		return du.what("InnerOrderNO").getAttribute("value");
	}
	//订单状态
	/**
	 * @param value
	 * 
	 * 	value='BD' : 交易成功
		value='B1' : 直接支付付款方信息确认中
		value='BE' : 交易关闭
		value='BB' : 待付款
		value='X1' : 交易冻结
		value='BC' : 付款-处理中
		value='X0' : 交易止付
		value='B5' : 支付记账处理中
		value='B2' : 直接支付付款中
		value='BF' : 交易过期
		value='B4' : 支付通道受理中
		value='R9' : 审批拒绝
		value='BA' : 预登记
	 *	
	 */
	public void selectOrderStatus(String value) {
		du.whatSelect("OrderStatus").selectByValue(value);
	}
	//保留域
	public void setKeepDomain(String value) {
		du.what("KeepDomain").clear();
		du.what("KeepDomain").sendKeys(value);
	}
	public String getKeepDomain() {
		return du.what("KeepDomain").getAttribute("value");
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
	//导出excel
	public void clickExcel() {
		du.what("Excel").click();
	}
	//订单列表单选按钮
	public void clickRadio(String radio) {
		du.what("Radio",radio).click();
	}
	//查看_基本订单信息
	public void clickCheck_OrderBasicInfo() {
		du.what("Check_OrderBasicInfo").click();
	}
	//查看_付款信息
	public void clickCheck_PaymentInfo() {
		du.what("Check_PaymentInfo").click();
	}
	//查看_商户信息
	public void clickCheck_MerchantInfo() {
		du.what("Check_MerchantInfo").click();
	}
	//查看_关闭
	public void clickCheck_Close() {
		du.what("Check_Close").click();
	}
	//导出excel_确认
	public void clickExcel_Confirm() {
		du.what("Excel_Confirm").click();
	}
	//导出excel_关闭
	public void clickExcel_Close() {
		du.what("Excel_Close").click();
	}

}