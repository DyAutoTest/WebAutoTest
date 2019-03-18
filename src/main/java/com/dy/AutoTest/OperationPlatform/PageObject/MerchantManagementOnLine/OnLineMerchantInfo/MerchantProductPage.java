package com.dy.AutoTest.OperationPlatform.PageObject.MerchantManagementOnLine.OnLineMerchantInfo;

import org.openqa.selenium.WebDriver;

import com.dy.AutoTest.web.api.IQuery;
import com.dy.AutoTest.web.api.SuperPage;
import com.dy.AutoTest.web.actions.DoPlus;

public class MerchantProductPage extends SuperPage implements IQuery{
	public MerchantProductPage(WebDriver driver) {
		super(driver);
		du.loadLocator("POP_Loc_MerchantProduct");
	}
	public void setWaitTime(long waitTime) {
		du=new DoPlus(driver);
		du.waitTime=waitTime;
		du.loadLocator("POP_Loc_MerchantProduct");
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
	//查询商户权限
	public void clickQueryMerchantAuth() {
		du.what("QueryMerchantAuth").click();
	}
	//账户支付
	public void clickPayment_Account() {
		du.what("Payment_Account").click();
	}
	//扫码支付
	public void clickPayment_QR() {
		du.what("Payment_QR").click();
	}
	//个人网银
	public void clickPayment_Personal_Ebank() {
		du.what("Payment_Personal_Ebank").click();
	}
	//企业网银
	public void clickPayment_Enterprise_Ebank() {
		du.what("Payment_Enterprise_Ebank").click();
	}
	//信用卡快捷
	public void clickPayment_Credit() {
		du.what("Payment_Credit").click();
	}
	//借记卡快捷
	public void clickPayment_Debit() {
		du.what("Payment_Debit").click();
	}
	//批量付款
	public void clickPayment_Batch() {
		du.what("Payment_Batch").click();
	}
	//批量收款
	public void clickReceipt_Batch() {
		du.what("Receipt_Batch").click();
	}
	//微信支付APP
	public void clickPayment_WeChatAPP() {
		du.what("Payment_WeChatAPP").click();
	}
	//单笔代收
	public void clickAgentReceipt() {
		du.what("AgentReceipt").click();
	}
	//单笔代付
	public void clickAgentPayment() {
		du.what("AgentPayment").click();
	}
	//批量代收
	public void clickAgentReceipt_Batch() {
		du.what("AgentReceipt_Batch").click();
	}
	//批量代付
	public void clickAgentPayment_Batch() {
		du.what("AgentPayment_Batch").click();
	}
	//按钮_修改权限
	public void clickUpdateAuth() {
		du.what("UpdateAuth").click();
	}
	//通知信息
	public String getNotice() {
		return du.what("Notice").getText();
	}
	@Override
	public void clickQuery() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void clickReset() {
		// TODO Auto-generated method stub
		
	}
	//支付方式动态获取
	public void clickProductType(String ProductType) {
		du.what("ProductType",ProductType).click();
	}
}