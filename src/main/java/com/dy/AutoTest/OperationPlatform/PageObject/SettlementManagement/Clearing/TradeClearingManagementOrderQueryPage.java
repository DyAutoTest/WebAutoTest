package com.dy.AutoTest.OperationPlatform.PageObject.SettlementManagement.Clearing;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.dy.AutoTest.web.api.IClickButton;
import com.dy.AutoTest.web.api.IClickRadio;
import com.dy.AutoTest.web.api.IQuery;
import com.dy.AutoTest.web.api.ISearchMerchant;
import com.dy.AutoTest.web.api.SuperPage;
import com.dy.AutoTest.web.actions.DoPlus;

public class TradeClearingManagementOrderQueryPage extends SuperPage
		implements IQuery,IClickButton,IClickRadio,ISearchMerchant{
	
	public TradeClearingManagementOrderQueryPage(WebDriver driver) {
		super(driver);
		du.loadLocator("POP_Loc_SettlementManagement_TradeClearingManagementOrderQuery");
	}
	public void setWaitTime(long waitTime) {
		du=new DoPlus(driver);
		du.waitTime=waitTime;
		du.loadLocator("POP_Loc_SettlementManagement_TradeClearingManagementOrderQuery");
	}

/***************************Manual Coding**********************************/


/****************************Auto Generate******************************/

	//商户编号
	public void setMerchantNO(String value) {
		du.what("MerchantNO").clear();
		du.what("MerchantNO").sendKeys(value);
	}
	public String getMerchantNO() {
		return du.what("MerchantNO").getAttribute("value");
	}
	//搜商户
	public void clickSearchMer() {
		du.what("SearchMer").click();
	}
	//会计日期起始日期
	public void setAccountingDateBegin(String value) {
		du.what("AccountingDateBegin").sendKeys(Keys.CONTROL + "a");
		du.waitFor(500);
		du.what("AccountingDateBegin").sendKeys(value);
	}
	public String getAccountingDateBegin() {
		return du.what("AccountingDateBegin").getAttribute("value");
	}
	//会计日期结束日期
	public void setAccountingDateEnd(String value) {
		du.what("AccountingDateEnd").sendKeys(Keys.CONTROL + "a");
		du.waitFor(500);
		du.what("AccountingDateEnd").sendKeys(value);
	}
	public String getAccountingDateEnd() {
		return du.what("AccountingDateEnd").getAttribute("value");
	}
	//订单日期开始日期
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
	//订单状态
	/**
	 * @param value
	 * 
	 * 	value='P2' : 定时补偿处理中
		value='F1' : 支付记账失败
		value='S1' : 清分订单初步处理成功
		value='W2' : 手续费未配置或已过期
		value='W1' : 初始化
		value='P1' : 日终清分处理中
		value='P' : 账务超时处理中
		value='ZF' : 交易止付
		value='W4' : 原记录不存在,进行登记,待日终处理
		value='W3' : 结算信息未设置
		value='W6' : 等待人工配置费率或结算信息
		value='C1' : 已冲正
	 * 
	 */
	public void selectOrderStatus(String value) {
		du.whatSelect("OrderStatus").selectByValue(value);
	}
	//业务渠道
	/**
	 * @param value
	 * 
	 * 	value='WDC' : 提现
		value='APP' : 移动客户端
		value='BUI' : BUI生产支撑系统
		value='posm' : 收单
		value='WWW' : 门户网站
		value='SDK' : 移动收银台
		value='POS' : 收单POS
		value='PSM' : 清结算
		value='BOSS' : 运营系统
		value='SMS' : 短信
		value='UI' : UI生产支撑系统
		value='RPM' : 远程消费
		value='SYS' : 支付系统平台
		value='BSP' : 联机批量
		value='BAT' : 批量
	 * 
	 */
	public void selectBusinessChannel(String value) {
		du.whatSelect("BusinessChannel").selectByValue(value);
	}
	//交易类型
	/**
	 * @param value
	 * 
	 * 	value="02" : 消费
		value="03" : 退款
		value="50" : 手工调账
	 * 
	 */
	public void selectTradeType(String value) {
		du.whatSelect("TradeType").selectByValue(value);
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
	//重发
	public void clickResend() {
		du.what("Resend").click();
	}
	//订单列表单选按钮
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
	//搜商户_商户编号
	public void setSearchMer_MerNum(String value) {
		du.what("SearchMer_MerNum").clear();
		du.what("SearchMer_MerNum").sendKeys(value);
	}
	public String getSearchMer_MerNum() {
		return du.what("SearchMer_MerNum").getAttribute("value");
	}
	//搜商户_商户名称
	public void setSearchMer_MerName(String value) {
		du.what("SearchMer_MerName").clear();
		du.what("SearchMer_MerName").sendKeys(value);
	}
	public String getSearchMer_MerName() {
		return du.what("SearchMer_MerName").getAttribute("value");
	}
	//搜商户_搜索
	public void clickSearchMer_Search() {
		du.what("SearchMer_Search").click();
	}
	//搜商户_商户列表单选按钮
	public void clickSearchMer_Radio(String radio) {
		du.what("SearchMer_Radio",radio).click();
	}
	public boolean isSearchMer_RadioExist(String radio) {
		du.waitFor(500);
		return du.isElementExist("SearchMer_Radio",radio);
	}
	public boolean isSearchMer_RadioDisplayed(String radio) {
		du.waitFor(500);
		return du.what("SearchMer_Radio",radio).isDisplayed();
	}
	//搜商户_提交
	public void clickSearchMer_Submit() {
		du.what("SearchMer_Submit").click();
	}
	//搜商户_关闭
	public void clickSearchMer_Close() {
		du.what("SearchMer_Close").click();
	}
	//查看_关闭
	public void clickCheck_Close() {
		du.what("Check_Close").click();
	}
	//重发_重发
	public void clickResend_Resend() {
		du.what("Resend_Resend").click();
	}
	//重发_关闭
	public void clickResend_Close() {
		du.what("Resend_Close").click();
	}

}