package com.dy.AutoTest.OperationPlatform.PageObject.SettlementManagement.Clearing;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.dy.AutoTest.web.api.IQuery;
import com.dy.AutoTest.web.api.ISearchMerchant;
import com.dy.AutoTest.web.api.SuperPage;
import com.dy.AutoTest.web.actions.DoPlus;

public class SettlementBillQueryPage extends SuperPage
		implements IQuery,ISearchMerchant{
	
	public SettlementBillQueryPage(WebDriver driver) {
		super(driver);
		du.loadLocator("POP_Loc_SettlementManagement_SettlementBillQuery");
	}
	public void setWaitTime(long waitTime) {
		du=new DoPlus(driver);
		du.waitTime=waitTime;
		du.loadLocator("POP_Loc_SettlementManagement_SettlementBillQuery");
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
	//T+0结算标志
	public void selectT0SettlementMarks(String value) {
		du.whatSelect("T0SettlementMarks").selectByValue(value);
	}
	//结算类型
	public void selectSettlementType(String value) {
		du.whatSelect("SettlementType").selectByValue(value);
	}
	//结算日期开始日期
	public void setSettlementDateBegin(String value) {
		du.what("SettlementDateBegin").sendKeys(Keys.CONTROL + "a");
		du.waitFor(500);
		du.what("SettlementDateBegin").sendKeys(value);
	}
	public String getSettlementDateBegin() {
		return du.what("SettlementDateBegin").getAttribute("value");
	}
	//结算日期结束日期
	public void setSettlementDateEnd(String value) {
		du.what("SettlementDateEnd").sendKeys(Keys.CONTROL + "a");
		du.waitFor(500);
		du.what("SettlementDateEnd").sendKeys(value);
	}
	public String getSettlementDateEnd() {
		return du.what("SettlementDateEnd").getAttribute("value");
	}
	//结算方式
	public void selectSettlementMethod(String value) {
		du.whatSelect("SettlementMethod").selectByValue(value);
	}
	//结算批次号
	public void setSettlementBatchNO(String value) {
		du.what("SettlementBatchNO").clear();
		du.what("SettlementBatchNO").sendKeys(value);
	}
	public String getSettlementBatchNO() {
		return du.what("SettlementBatchNO").getAttribute("value");
	}
	//查询
	public void clickQuery() {
		du.what("Query").click();
	}
	//重置
	public void clickReset() {
		du.what("Reset").click();
	}
	//详情
	public void clickDetail() {
		du.what("Detail").click();
	}
	//查看明细
	public void clickCheck() {
		du.what("Check").click();
	}
	//结算单列表单选按钮
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
	//详情_关闭
	public void clickDetail_Close() {
		du.what("Detail_Close").click();
	}
	//查看明细_明细列表单选按钮
	public void clickCheck_DetailRadio(String radio) {
		du.what("Check_DetailRadio",radio).click();
	}
	public boolean isCheck_DetailRadioExist(String radio) {
		du.waitFor(500);
		return du.isElementExist("Check_DetailRadio",radio);
	}
	public boolean isCheck_DetailRadioDisplayed(String radio) {
		du.waitFor(500);
		return du.what("Check_DetailRadio",radio).isDisplayed();
	}
	//查看明细_关闭
	public void clickCheck_Close() {
		du.what("Check_Close").click();
	}

}