package com.dy.AutoTest.OperationPlatform.PageObject.OnlineTransaction.Withdraw;

import org.openqa.selenium.Keys;

import org.openqa.selenium.WebDriver;

import com.dy.AutoTest.web.api.IClickButton;
import com.dy.AutoTest.web.api.IClickRadio;
import com.dy.AutoTest.web.api.IQuery;
import com.dy.AutoTest.web.api.SuperPage;
import com.dy.AutoTest.web.actions.DoPlus;

public class OnlineWithdrawOrderQueryPage extends SuperPage
			implements IQuery,IClickButton,IClickRadio{
	public OnlineWithdrawOrderQueryPage(WebDriver driver) {
		super(driver);
		du.loadLocator("POP_Loc_OnlineWithdrawOrderQuery");
	}
	public void setWaitTime(long waitTime) {
		du=new DoPlus(driver);
		du.waitTime=waitTime;
		du.loadLocator("POP_Loc_OnlineWithdrawOrderQuery");
	}

/***************************Manual Coding**********************************/


/****************************Auto Generate******************************/

	//高级
	public void clickAdvance() {
		du.what("Advance").click();
	}
	//付款银行
	public void selectTransferOutBank(String value) {
		du.whatSelect("TransferOutBank").selectByValue(value);
	}
	//收款银行
	public void selectTransferInBank(String value) {
		du.whatSelect("TransferInBank").selectByValue(value);
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
	//提现订单号
	public void setWithdrawalOrderNO(String value) {
		du.what("WithdrawalOrderNO").clear();
		du.what("WithdrawalOrderNO").sendKeys(value);
	}
	public String getWithdrawalOrderNO() {
		return du.what("WithdrawalOrderNO").getAttribute("value");
	}
	//用户手机号/商户号
	public void setUserPhoneOrMerchantNO(String value) {
		du.what("UserPhoneOrMerchantNO").clear();
		du.what("UserPhoneOrMerchantNO").sendKeys(value);
	}
	public String getUserPhoneOrMerchantNO() {
		return du.what("UserPhoneOrMerchantNO").getAttribute("value");
	}
	//提现类型
	/**
	 * @param value
	 * 
	 * 	value='42' : 认证打款
		value='21' : 商户结算
		value='11' : 用户提现
		value='22' : 商户自主结算
		value='41' : 资金调拨
	 * 
	 * 
	 */
	public void selectWithdrawalType(String value) {
		du.whatSelect("WithdrawalType").selectByValue(value);
	}
	//订单状态
	/**
	 * @param value
	 * 
	 * 	value='A7' : 待审核
		value='C3' : 交易关闭（订单逾期）
		value='H1' : 提现冻结成功..请求处理中
		value='W5' : B2C预授权转争议（已受理）
		value='S4' : 交易关闭（支付成功后，已撤销）
		value='BD' : 交易成功
		value='S8' : 打款成功
		value='P2' : 收款成功
		value='C4' : 交易关闭（冻结失败）
		value='B6' : 交易关闭（订单撤销）
		value='B1' : 待付款
		value='D1' : 待充值
		value='A1' : 预授权成功
		value='S9' : 打款完成
		value='DS' : 待还款
		value='S1' : 交易成功
		value='RP' : 部分退款
		value='B3' : 交易关闭（订单逾期）
		value='BB' : 等待用户付款
		value='H4' : 交易关闭（冻结模式下，银行返回失败）
		value='BC' : 待付款
		value='W1' : B2C预授权成功（商户收款）
		value='D3' : 交易关闭（订单逾期）
		value='CS' : 待确认
		value='D4' : 交易关闭 （合作机构返回失败）
		value='S7' : 交易关闭（成功扣款后，隐含返回失败）
		value='A5' : 预授权转争议(已受理）
		value='P1' : 支付成功（缴费中）
		value='H2' : 提现发出成功..银行处理中
		value='S2' : 交易成功
		value='S5' : 交易成功后转争议（已受理）
		value='S6' : 交易关闭 （入账失败，退款成功）
		value='F9' : 打款失败
		value='B4' : 通道处理中
		value='W3' : 系统受理中
		value='RF' : 全部退款
		value='DP' : 账期支付部分退款
		value='H3' : 交易关闭（审批未通过）
		value='S3' : 交易关闭（交易成功后已全额退款）
		value='R9' : 审批拒绝
		value='F8' : 审核不通过
		value='BA' : 预登记
		value='C1' : 等待提现
		value='F6' : 退单待复核
		value='F1' : 交易失败
		value='F5' : 审核通过到打款
		value='W2' : 待充值
		value='F4' : 付款失败待复核
		value='X1' : 交易冻结
		value='X0' : 交易止付
		value='F2' : 付款核销
		value='W4' : 银行受理中
		value='R8' : 系统拒绝
		value='U0' : 初始状态
		value='P0' : 预登记
	 * 
	 */
	public void selectOrderStatus(String value) {
		du.whatSelect("OrderStatus").selectByValue(value);
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
	//查看
	public void clickCheck() {
		du.what("Check").click();
	}
	//退回
	public void clickReturn() {
		du.what("Return").click();
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