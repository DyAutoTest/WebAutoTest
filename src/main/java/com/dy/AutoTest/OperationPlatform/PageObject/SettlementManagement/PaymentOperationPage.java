package com.dy.AutoTest.OperationPlatform.PageObject.SettlementManagement;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.dy.AutoTest.web.api.SuperPage;
import com.dy.AutoTest.web.actions.DoPlus;

public class PaymentOperationPage extends SuperPage{
	public PaymentOperationPage(WebDriver driver) {
		super(driver);
		du.loadLocator("POP_Loc_SettlementManagement_PaymentOperation");
	}
	public void setWaitTime(long waitTime) {
		du=new DoPlus(driver);
		du.waitTime=waitTime;
		du.loadLocator("POP_Loc_SettlementManagement_PaymentOperation");
	}

/***************************Manual Coding**********************************/


/****************************Auto Generate******************************/

	//高级
	public void clickAdvance() {
		du.what("Advance").click();
	}
	//付款银行
	public void selectPaymentBank(String value) {
		du.whatSelect("PaymentBank").selectByValue(value);
	}
	//收款银行
	public void selectCollectionBank(String value) {
		du.whatSelect("CollectionBank").selectByValue(value);
	}
	//日期类型
	public void selectDateType(String value) {
		du.whatSelect("DateType").selectByValue(value);
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
	//付款类型
	public void selectPaymentType(String value) {
		du.whatSelect("PaymentType").selectByValue(value);
	}
	//内部用户号
	public void setInnerUserNO(String value) {
		du.what("InnerUserNO").clear();
		du.what("InnerUserNO").sendKeys(value);
	}
	public String getInnerUserNO() {
		return du.what("InnerUserNO").getAttribute("value");
	}
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
	//付款状态
	public void selectPaymentStatus(String value) {
		du.whatSelect("PaymentStatus").selectByValue(value);
	}
	//查询
	public void clickQuery() {
		du.what("Query").click();
	}
	//重置
	public void clickReset() {
		du.what("Reset").click();
	}
	//明细操作
	public void clickCheck() {
		du.what("Check").click();
	}
	//批确认
	public void clickBatchConfirm() {
		du.what("BatchConfirm").click();
	}
	//批撤销
	public void clickBatchCancel() {
		du.what("BatchCancel").click();
	}
	//批转网银
	public void clickBatchTurnEbank() {
		du.what("BatchTurnEbank").click();
	}
	//操作列表全选按钮
	public void clickCheckBoxAll() {
		du.what("CheckBoxAll").click();
	}
	//操作列表单选按钮
	public void clickCheckBoxSingle() {
		du.what("CheckBoxSingle").click();
	}
	//搜商户_商户号
	public void setSearchMer_MerNO(String value) {
		du.what("SearchMer_MerNO").clear();
		du.what("SearchMer_MerNO").sendKeys(value);
	}
	public String getSearchMer_MerNO() {
		return du.what("SearchMer_MerNO").getAttribute("value");
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
	public void clickSearchMer_MerchantRadio() {
		du.what("SearchMer_MerchantRadio").click();
	}
	//搜商户_确定
	public void clickSearchMer_Confirm() {
		du.what("SearchMer_Confirm").click();
	}
	//搜商户_关闭
	public void clickSearchMer_Close() {
		du.what("SearchMer_Close").click();
	}
	//明细操作_通过
	public void clickCheck_Pass() {
		du.what("Check_Pass").click();
	}
	//明细操作_撤销
	public void clickCheck_Cancel() {
		du.what("Check_Cancel").click();
	}
	//明细操作_转网银
	public void clickCheck_TurnEbank() {
		du.what("Check_TurnEbank").click();
	}
	//明细操作_操作列表全选按钮
	public void clickCheck_OperationCheckboxAll() {
		du.what("Check_OperationCheckboxAll").click();
	}
	//明细操作_操作列表多选按钮
	public void clickCheck_OperationCheckboxSingle() {
		du.what("Check_OperationCheckboxSingle").click();
	}
	//明细操作_关闭
	public void clickCheck_Close() {
		du.what("Check_Close").click();
	}
	//批确认_确认
	public void clickBatchPass_Confirm() {
		du.what("BatchPass_Confirm").click();
	}
	//批确认_关闭
	public void clickBatchPass_Close() {
		du.what("BatchPass_Close").click();
	}
	//批撤销_撤销原因
	public void setBatchCancel_Text(String value) {
		du.what("BatchCancel_Text").clear();
		du.what("BatchCancel_Text").sendKeys(value);
	}
	public String getBatchCancel_Text() {
		return du.what("BatchCancel_Text").getAttribute("value");
	}
	//批撤销_确定
	public void clickBatchCancel_Confirm() {
		du.what("BatchCancel_Confirm").click();
	}
	//批撤销_关闭
	public void clickBatchCancel_Close() {
		du.what("BatchCancel_Close").click();
	}
	//批转网银_付款银行
	public void selectBatchTurnEbank_PaymentBank(String value) {
		du.whatSelect("BatchTurnEbank_PaymentBank").selectByValue(value);
	}
	//批转网银_确认
	public void clickBatchTurnEbank_Confirm() {
		du.what("BatchTurnEbank_Confirm").click();
	}
	//批转网银_关闭
	public void clickBatchTurnEbank_Close() {
		du.what("BatchTurnEbank_Close").click();
	}

}