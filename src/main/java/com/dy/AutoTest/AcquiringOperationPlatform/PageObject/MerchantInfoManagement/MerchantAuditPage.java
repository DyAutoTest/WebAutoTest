package com.dy.AutoTest.AcquiringOperationPlatform.PageObject.MerchantInfoManagement;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.dy.AutoTest.web.api.IQuery;
import com.dy.AutoTest.web.api.SuperPage;
import com.dy.AutoTest.web.actions.DoPlus;

public class MerchantAuditPage extends SuperPage implements IQuery{
	public MerchantAuditPage(WebDriver driver) {
		super(driver);
		du.loadLocator("AOP_Loc_MerchantInfoManagement_MerchantAudit");
	}
	public void setWaitTime(long waitTime) {
		du=new DoPlus(driver);
		du.waitTime=waitTime;
		du.loadLocator("AOP_Loc_MerchantInfoManagement_MerchantAudit");
	}

/***************************Manual Coding**********************************/


/****************************Auto Generate******************************/

	//交易名称
	public void setTradeName(String value) {
		du.what("TradeName").clear();
		du.what("TradeName").sendKeys(value);
	}
	public String getTradeName() {
		return du.what("TradeName").getAttribute("value");
	}
	//关键信息
	public void setKeyInfo(String value) {
		du.what("KeyInfo").clear();
		du.what("KeyInfo").sendKeys(value);
	}
	public String getKeyInfo() {
		return du.what("KeyInfo").getAttribute("value");
	}
	//商户编码
	public void setMerchantCode(String value) {
		du.what("MerchantCode").clear();
		du.what("MerchantCode").sendKeys(value);
	}
	public String getMerchantCode() {
		return du.what("MerchantCode").getAttribute("value");
	}
	//交易码
	public void setTradeCode(String value) {
		du.what("TradeCode").clear();
		du.what("TradeCode").sendKeys(value);
	}
	public String getTradeCode() {
		return du.what("TradeCode").getAttribute("value");
	}
	//交易操作员
	public void setTradeOperater(String value) {
		du.what("TradeOperater").clear();
		du.what("TradeOperater").sendKeys(value);
	}
	public String getTradeOperater() {
		return du.what("TradeOperater").getAttribute("value");
	}
	//审核状态
	public void selectAuditStatus(String value) {
		du.whatSelect("AuditStatus").selectByValue(value);
	}
	//查询
	public void clickQuery() {
		du.what("Query").click();
	}
	//重置
	public void clickReset() {
		du.what("Reset").click();
	}
	//初审操作
	public void clickPreAuditOperation() {
		du.what("PreAuditOperation").click();
	}
	//复审操作
	public void clickRecheckOperation() {
		du.what("RecheckOperation").click();
	}
	//审核列表全选按钮
	public void clickAuditCheckboxAll() {
		du.what("AuditCheckboxAll").click();
	}
	//审核列表多选按钮
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
	//初审操作_初审备注
	public void setPreAuditOperation_PreAuditTips(String value) {
		du.what("PreAuditOperation_PreAuditTips").clear();
		du.what("PreAuditOperation_PreAuditTips").sendKeys(value);
	}
	public String getPreAuditOperation_PreAuditTips() {
		return du.what("PreAuditOperation_PreAuditTips").getAttribute("value");
	}
	//初审操作_通过
	public void clickPreAuditOperation_Pass() {
		du.what("PreAuditOperation_Pass").click();
	}
	//初审操作_不通过
	public void clickPreAuditOperation_NoPass() {
		du.what("PreAuditOperation_NoPass").click();
	}
	//初审操作_关闭
	public void clickPreAuditOperation_Close() {
		du.what("PreAuditOperation_Close").click();
	}
	//复审操作_复审备注
	public void setRecheckOperation_RecheckTips(String value) {
		du.what("RecheckOperation_RecheckTips").clear();
		du.what("RecheckOperation_RecheckTips").sendKeys(value);
	}
	public String getRecheckOperation_RecheckTips() {
		return du.what("RecheckOperation_RecheckTips").getAttribute("value");
	}
	//复审操作_通过
	public void clickRecheckOperation_Pass() {
		du.what("RecheckOperation_Pass").click();
	}
	//复审操作_不通过
	public void clickRecheckOperation_NoPass() {
		du.what("RecheckOperation_NoPass").click();
	}
	//复审操作_关闭
	public void clickRecheckOperation_Close() {
		du.what("RecheckOperation_Close").click();
	}
	//基本信息
	public void clickBasicInfo() {
		du.what("BasicInfo").click();
	}
	//结算信息
	public void clickSettlementInfo() {
		du.what("SettlementInfo").click();
	}
	//费率信息
	public void clickRateInfo() {
		du.what("RateInfo").click();
	}
	//联系人信息
	public void clickContactInfo() {
		du.what("ContactInfo").click();
	}
	//协议信息
	public void clickAggreementInfo() {
		du.what("AggreementInfo").click();
	}
	//签约发票信息
	public void clickSignedInvoiceInfo() {
		du.what("SignedInvoiceInfo").click();
	}
	//对账单信息
	public void clickReconciliationInfo() {
		du.what("ReconciliationInfo").click();
	}
	//附加信息
	public void clickAdditionInfo() {
		du.what("AdditionInfo").click();
	}
	//附件上传
	public void clickAdditionalUpload() {
		du.what("AdditionalUpload").click();
	}
	//内部商户类型
	public void selectInnerMerchantType(String value) {
		du.whatSelect("InnerMerchantType").selectByValue(value);
	}
	//内部商户子类型
	public void selectInnerMerchantSubType(String value) {
		du.whatSelect("InnerMerchantSubType").selectByValue(value);
	}
	//复审操作_风控选择模板
	public void selectRecheckAudit_RiskTemplate(String value) {
		du.whatSelect("RecheckAudit_RiskTemplate").selectByValue(value);
	}

}