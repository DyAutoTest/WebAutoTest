package com.dy.AutoTest.OperationPlatform.PageObject.OnlineRiskControl.RiskControlParamManagement;

import org.openqa.selenium.WebDriver;

import com.dy.AutoTest.web.api.IQuery;
import com.dy.AutoTest.web.api.SuperPage;
import com.dy.AutoTest.web.actions.DoPlus;

public class AccountTradeParamMaintainPage extends SuperPage implements IQuery{
	public AccountTradeParamMaintainPage(WebDriver driver) {
		super(driver);
		du.loadLocator("POP_Loc_RiskControlParamManagement_AccountTradeParamMaintain");
	}
	public void setWaitTime(long waitTime) {
		du=new DoPlus(driver);
		du.waitTime=waitTime;
		du.loadLocator("POP_Loc_RiskControlParamManagement_AccountTradeParamMaintain");
	}

/***************************Manual Coding**********************************/


/****************************Auto Generate******************************/

	//账户种类
	/**
	 * @param value
	 * 
	 * 	value="100" : 100-个人账户
		value="800" : 800-商户账户
	 */
	public void selectAccountType(String value) {
		du.whatSelect("AccountType").selectByValue(value);
	}
	//资金种类
	/**
	 * @param value
	 * value="1" : 现金
	 */
	public void selectMoneyType(String value) {
		du.whatSelect("MoneyType").selectByValue(value);
	}
	//业务种类
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
	//查询
	public void clickQuery() {
		du.what("Query").click();
	}
	//重置
	public void clickReset() {
		du.what("Reset").click();
	}
	//添加
	public void clickAdd() {
		du.what("Add").click();
	}
	//修改
	public void clickUpdate() {
		du.what("Update").click();
	}
	//查看
	public void clickCheck() {
		du.what("Check").click();
	}
	//删除
	public void clickDelete() {
		du.what("Delete").click();
	}
	//参数列表单选按钮
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
	//添加_账户类型
	public void selectAdd_AccountType(String value) {
		du.whatSelect("Add_AccountType").selectByValue(value);
	}
	//添加_资金种类
	public void selectAdd_MoneyType(String value) {
		du.whatSelect("Add_MoneyType").selectByValue(value);
	}
	//添加_交易类型
	public void selectAdd_TradeType(String value) {
		du.whatSelect("Add_TradeType").selectByValue(value);
	}
	//添加_业务类型
	public void selectAdd_BusinessType(String value) {
		du.whatSelect("Add_BusinessType").selectByValue(value);
	}
	//添加_实名标志
	/**
	 * @param value
	 * 
	 * 	value="02" : 强实名
		value="01" : 弱实名
		value="00" : 非实名
	 * 
	 */
	public void selectAdd_RealNameSign(String value) {
		du.whatSelect("Add_RealNameSign").selectByValue(value);
	}
	//添加_收付标志
	/**
	 * @param value
	 * 
	 * 	value="C" : 收款方
		value="D" : 付款方
		
	 */
	public void selectAdd_PaymentCollectionSign(String value) {
		du.whatSelect("Add_PaymentCollectionSign").selectByValue(value);
	}
	//添加_限制级别
	/**
	 * @param value
	 * 
	 * 	value="1" : 用户级别限制
		value="0" : 客户级别限制
	 * 
	 */
	public void selectAdd_LimitLevel(String value) {
		du.whatSelect("Add_LimitLevel").selectByValue(value);
	}
	//添加_业务受理渠道
	/**
	 * @param value
	 * 
	 * 	value='WDC' : 提现
		value='APP' : 移动客户端
		value='BUI' : BUI生产支撑系统
		value='posm' : 收单
		value='QRP' : 会员码
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
	public void selectAdd_BusinessAcceptChannel(String value) {
		du.whatSelect("Add_BusinessAcceptChannel").selectByValue(value);
	}
	//添加_单笔最大金额
	public void setAdd_SingleMaxMoney(String value) {
		du.what("Add_SingleMaxMoney").clear();
		du.what("Add_SingleMaxMoney").sendKeys(value);
	}
	public String getAdd_SingleMaxMoney() {
		return du.what("Add_SingleMaxMoney").getAttribute("value");
	}
	//添加_单笔最小金额
	public void setAdd_SingleMinMoney(String value) {
		du.what("Add_SingleMinMoney").clear();
		du.what("Add_SingleMinMoney").sendKeys(value);
	}
	public String getAdd_SingleMinMoney() {
		return du.what("Add_SingleMinMoney").getAttribute("value");
	}
	//添加_日限额
	public void setAdd_DayLimitMoney(String value) {
		du.what("Add_DayLimitMoney").clear();
		du.what("Add_DayLimitMoney").sendKeys(value);
	}
	public String getAdd_DayLimitMoney() {
		return du.what("Add_DayLimitMoney").getAttribute("value");
	}
	//添加_日付款累计次数
	public void setAdd_DayPaymentTimes(String value) {
		du.what("Add_DayPaymentTimes").clear();
		du.what("Add_DayPaymentTimes").sendKeys(value);
	}
	public String getAdd_DayPaymentTimes() {
		return du.what("Add_DayPaymentTimes").getAttribute("value");
	}
	//添加_月限额
	public void setAdd_MonthLimitMoney(String value) {
		du.what("Add_MonthLimitMoney").clear();
		du.what("Add_MonthLimitMoney").sendKeys(value);
	}
	public String getAdd_MonthLimitMoney() {
		return du.what("Add_MonthLimitMoney").getAttribute("value");
	}
	//添加_月付款累计次数
	public void setAdd_MonthPaymentTimes(String value) {
		du.what("Add_MonthPaymentTimes").clear();
		du.what("Add_MonthPaymentTimes").sendKeys(value);
	}
	public String getAdd_MonthPaymentTimes() {
		return du.what("Add_MonthPaymentTimes").getAttribute("value");
	}
	//添加_提交
	public void clickAdd_Submit() {
		du.what("Add_Submit").click();
	}
	//添加_关闭
	public void clickAdd_Close() {
		du.what("Add_Close").click();
	}
	//修改_单笔最大金额
	public void setUpdate_SingleMaxMoney(String value) {
		du.what("Update_SingleMaxMoney").clear();
		du.what("Update_SingleMaxMoney").sendKeys(value);
	}
	public String getUpdate_SingleMaxMoney() {
		return du.what("Update_SingleMaxMoney").getAttribute("value");
	}
	//修改_单笔最小金额
	public void setUpdate_SingleMinMoney(String value) {
		du.what("Update_SingleMinMoney").clear();
		du.what("Update_SingleMinMoney").sendKeys(value);
	}
	public String getUpdate_SingleMinMoney() {
		return du.what("Update_SingleMinMoney").getAttribute("value");
	}
	//修改_日限额
	public void setUpdate_DayLimitMoney(String value) {
		du.what("Update_DayLimitMoney").clear();
		du.what("Update_DayLimitMoney").sendKeys(value);
	}
	public String getUpdate_DayLimitMoney() {
		return du.what("Update_DayLimitMoney").getAttribute("value");
	}
	//修改_日累计次数
	public void setUpdate_DayPaymentTimes(String value) {
		du.what("Update_DayPaymentTimes").clear();
		du.what("Update_DayPaymentTimes").sendKeys(value);
	}
	public String getUpdate_DayPaymentTimes() {
		return du.what("Update_DayPaymentTimes").getAttribute("value");
	}
	//修改_月限额
	public void setUpdate_MonthLimitMoney(String value) {
		du.what("Update_MonthLimitMoney").clear();
		du.what("Update_MonthLimitMoney").sendKeys(value);
	}
	public String getUpdate_MonthLimitMoney() {
		return du.what("Update_MonthLimitMoney").getAttribute("value");
	}
	//修改_月累计次数
	public void setUpdate_MonthPaymentTimes(String value) {
		du.what("Update_MonthPaymentTimes").clear();
		du.what("Update_MonthPaymentTimes").sendKeys(value);
	}
	public String getUpdate_MonthPaymentTimes() {
		return du.what("Update_MonthPaymentTimes").getAttribute("value");
	}
	//修改_提交
	public void clickUpdate_Submit() {
		du.what("Update_Submit").click();
	}
	//修改_关闭
	public void clickUpdate_Close() {
		du.what("Update_Close").click();
	}
	//查看_关闭
	public void clickCheck_Close() {
		du.what("Check_Close").click();
	}
	//删除_确认
	public void clickDelete_Confirm() {
		du.what("Delete_Confirm").click();
	}
	//删除_关闭
	public void clickDelete_Close() {
		du.what("Delete_Close").click();
	}

}