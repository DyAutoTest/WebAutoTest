package com.dy.AutoTest.OperationPlatform.PageObject.MerchantManagementOnLine.OnLineMerchantInfo;

import com.dy.AutoTest.web.api.ISearchMerchantByNOorName;

import org.openqa.selenium.WebDriver;

import com.dy.AutoTest.web.api.SuperPage;
import com.dy.AutoTest.web.actions.DoPlus;

public class MerchantIncomeExpenditureDetailPage extends SuperPage implements ISearchMerchantByNOorName{
	public MerchantIncomeExpenditureDetailPage(WebDriver driver) {
		super(driver);
		du.loadLocator("POP_Loc_MerchantIncomeExpenditureDetail");
	}
	public void setWaitTime(long waitTime) {
		du=new DoPlus(driver);
		du.waitTime=waitTime;
		du.loadLocator("POP_Loc_MerchantIncomeExpenditureDetail");
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
	//按钮_搜商户
	public void clickSearchMer() {
		du.what("SearchMer").click();
	}
	//内部订单号
	public void setInnerOrderNO(String value) {
		du.what("InnerOrderNO").clear();
		du.what("InnerOrderNO").sendKeys(value);
	}
	public String getInnerOrderNO() {
		return du.what("InnerOrderNO").getAttribute("value");
	}
	//记账开始时间
	public void setAccountingDateBegin(String value) {
		du.what("AccountingDateBegin").clear();
		du.waitFor(500);		du.what("AccountingDateBegin").sendKeys(value);
	}
	public String getAccountingDateBegin() {
		return du.what("AccountingDateBegin").getAttribute("value");
	}
	//记账结束时间
	public void setAccountingDateEnd(String value) {
		du.what("AccountingDateEnd").clear();
		du.waitFor(500);		du.what("AccountingDateEnd").sendKeys(value);
	}
	public String getAccountingDateEnd() {
		return du.what("AccountingDateEnd").getAttribute("value");
	}
	//业务渠道
	public void selectBusinessChannel(String value) {
		du.whatSelect("BusinessChannel").selectByValue(value);
	}
	//按钮_查询
	public void clickQuery() {
		du.what("Query").click();
	}
	//按钮_重置
	public void clickReset() {
		du.what("Reset").click();
	}
	//按钮_查看详情
	public void clickDetail() {
		du.what("Detail").click();
	}
	//商户索引
	public void clickMerchantRadio(String index) {
		du.what("MerchantRadio",index).click();
	}
	public boolean isMerchantRadioDisplayed(String index) {
		du.waitFor(500);
		return du.what("MerchantRadio",index).isDisplayed();
	}
	//搜商户_商户号
	public void setSearchMer_MerNO(String value) {
		du.what("SearchMer_MerNO").clear();
		du.what("SearchMer_MerNO").sendKeys(value);
	}
	public String getSearchMer_MerNO() {
		return du.what("SearchMer_MerNO").getAttribute("value");
	}
	//搜商户_商户名
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
	//搜商户_商户索引
	public void clickSearchMer_Radio(String index) {
		du.what("SearchMer_Radio",index).click();
	}
	public boolean isSearchMer_RadioDisplayed(String index) {
		du.waitFor(500);
		return du.what("SearchMer_Radio",index).isDisplayed();
	}
	//搜商户_提交
	public void clickSearchMer_Submit() {
		du.what("SearchMer_Submit").click();
	}
	//搜商户_关闭
	public void clickSearchMer_Close() {
		du.what("SearchMer_Close").click();
	}
	//查看详情_关闭
	public void clickDetail_Close() {
		du.what("Detail_Close").click();
	}

}