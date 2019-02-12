package com.dy.AutoTest.AcquiringOperationPlatform.PageObject.OffLineRiskControlManagement.RiskControlParameter;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.dy.AutoTest.web.api.IQuery;
import com.dy.AutoTest.web.api.ISearchMerchant_Add;
import com.dy.AutoTest.web.api.SuperPage;
import com.dy.AutoTest.web.actions.DoPlus;

public class RiskControlParameterMaintainPage extends SuperPage implements IQuery,ISearchMerchant_Add{
	public RiskControlParameterMaintainPage(WebDriver driver) {
		super(driver);
		du.loadLocator("AOP_Loc_OffLineRiskControlManagement_RiskControlParameterMaintain");
	}
	public void setWaitTime(long waitTime) {
		du=new DoPlus(driver);
		du.waitTime=waitTime;
		du.loadLocator("AOP_Loc_OffLineRiskControlManagement_RiskControlParameterMaintain");
	}

/***************************Manual Coding**********************************/


/****************************Auto Generate******************************/

	//终端号
	public void setTerminalNO(String value) {
		du.what("TerminalNO").clear();
		du.what("TerminalNO").sendKeys(value);
	}
	public String getTerminalNO() {
		return du.what("TerminalNO").getAttribute("value");
	}
	//商户号
	public void setMerchantNO(String value) {
		du.what("MerchantNO").clear();
		du.what("MerchantNO").sendKeys(value);
	}
	public String getMerchantNO() {
		return du.what("MerchantNO").getAttribute("value");
	}
	//商户名称
	public void setMerchantName(String value) {
		du.what("MerchantName").clear();
		du.what("MerchantName").sendKeys(value);
	}
	public String getMerchantName() {
		return du.what("MerchantName").getAttribute("value");
	}
	//商户状态
	public void selectMerchantStatus(String value) {
		du.whatSelect("MerchantStatus").selectByValue(value);
	}
	//MCC码
	public void selectMCC(String value) {
		du.whatSelect("MCC").selectByValue(value);
	}
	//选择省份
	public void selectProvince(String value) {
		du.whatSelect("Province").selectByValue(value);
	}
	//选择城市
	public void selectCity(String value) {
		du.whatSelect("City").selectByValue(value);
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
	//删除
	public void clickDelete() {
		du.what("Delete").click();
	}
	//修改
	public void clickUpdate() {
		du.what("Update").click();
	}
	//添加
	public void clickAdd() {
		du.what("Add").click();
	}
	//批量添加
	public void clickBatchAdd() {
		du.what("BatchAdd").click();
	}
	//商户列表单选按钮
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
	//修改_单笔交易借记卡限额
	public void setUpdate_SingleTradeDebitCardLimit(String value) {
		du.what("Update_SingleTradeDebitCardLimit").clear();
		du.what("Update_SingleTradeDebitCardLimit").sendKeys(value);
	}
	public String getUpdate_SingleTradeDebitCardLimit() {
		return du.what("Update_SingleTradeDebitCardLimit").getAttribute("value");
	}
	//修改_单笔交易贷记卡限额
	public void setUpdate_SingleTradeCreditCardLimit(String value) {
		du.what("Update_SingleTradeCreditCardLimit").clear();
		du.what("Update_SingleTradeCreditCardLimit").sendKeys(value);
	}
	public String getUpdate_SingleTradeCreditCardLimit() {
		return du.what("Update_SingleTradeCreditCardLimit").getAttribute("value");
	}
	//修改_借记卡日累积限额
	public void setUpdate_DebitCardDayLimit(String value) {
		du.what("Update_DebitCardDayLimit").clear();
		du.what("Update_DebitCardDayLimit").sendKeys(value);
	}
	public String getUpdate_DebitCardDayLimit() {
		return du.what("Update_DebitCardDayLimit").getAttribute("value");
	}
	//修改_贷记卡日累积限额
	public void setUpdate_CreditCardDayLimit(String value) {
		du.what("Update_CreditCardDayLimit").clear();
		du.what("Update_CreditCardDayLimit").sendKeys(value);
	}
	public String getUpdate_CreditCardDayLimit() {
		return du.what("Update_CreditCardDayLimit").getAttribute("value");
	}
	//修改_日累计总限额
	public void setUpdate_DayTotalLimit(String value) {
		du.what("Update_DayTotalLimit").clear();
		du.what("Update_DayTotalLimit").sendKeys(value);
	}
	public String getUpdate_DayTotalLimit() {
		return du.what("Update_DayTotalLimit").getAttribute("value");
	}
	//修改_终端/商户限制起始时间
	public void setUpdate_TerminalMerchantLimitTimeBegin(String value) {
		du.what("Update_TerminalMerchantLimitTimeBegin").clear();
		du.what("Update_TerminalMerchantLimitTimeBegin").sendKeys(value);
	}
	public String getUpdate_TerminalMerchantLimitTimeBegin() {
		return du.what("Update_TerminalMerchantLimitTimeBegin").getAttribute("value");
	}
	//修改_终端/商户限制截止时间
	public void setUpdate_TerminalMerchantLimitTimeEnd(String value) {
		du.what("Update_TerminalMerchantLimitTimeEnd").clear();
		du.what("Update_TerminalMerchantLimitTimeEnd").sendKeys(value);
	}
	public String getUpdate_TerminalMerchantLimitTimeEnd() {
		return du.what("Update_TerminalMerchantLimitTimeEnd").getAttribute("value");
	}
	//修改_提交
	public void clickUpdate_Submit() {
		du.what("Update_Submit").click();
	}
	//修改_关闭
	public void clickUpdate_Close() {
		du.what("Update_Close").click();
	}
	//添加_限制级别
	public void selectAdd_LimitLv(String value) {
		du.whatSelect("Add_LimitLv").selectByValue(value);
	}
	//添加_搜商户
	public void clickAdd_SearchMer() {
		du.what("Add_SearchMer").click();
	}
	//添加_搜商户_商户编号
	public void setAdd_SearchMer_MerNO(String value) {
		du.what("Add_SearchMer_MerNO").clear();
		du.what("Add_SearchMer_MerNO").sendKeys(value);
	}
	public String getAdd_SearchMer_MerNO() {
		return du.what("Add_SearchMer_MerNO").getAttribute("value");
	}
	//添加_搜商户_商户名称
	public void setAdd_SearchMer_MerName(String value) {
		du.what("Add_SearchMer_MerName").clear();
		du.what("Add_SearchMer_MerName").sendKeys(value);
	}
	public String getAdd_SearchMer_MerName() {
		return du.what("Add_SearchMer_MerName").getAttribute("value");
	}
	//添加_搜商户_确认
	public void clickAdd_SearchMer_Search() {
		du.what("Add_SearchMer_Search").click();
	}
	//添加_搜商户_商户列表单选按钮
	public void clickAdd_SearchMer_Radio(String radio) {
		du.what("Add_SearchMer_Radio",radio).click();
	}
	public boolean isAdd_SearchMer_RadioExist(String radio) {
		du.waitFor(500);
		return du.isElementExist("Add_SearchMer_Radio",radio);
	}
	public boolean isAdd_SearchMer_RadioDisplayed(String radio) {
		du.waitFor(500);
		return du.what("Add_SearchMer_Radio",radio).isDisplayed();
	}
	//添加_搜商户_提交
	public void clickAdd_SearchMer_Submit() {
		du.what("Add_SearchMer_Submit").click();
	}
	//添加_搜商户_关闭
	public void clickAdd_SearchMer_Close() {
		du.what("Add_SearchMer_Close").click();
	}
	//添加_单笔交易借记卡限额
	public void setAdd_SingleTradeDebitCardLimit(String value) {
		du.what("Add_SingleTradeDebitCardLimit").clear();
		du.what("Add_SingleTradeDebitCardLimit").sendKeys(value);
	}
	public String getAdd_SingleTradeDebitCardLimit() {
		return du.what("Add_SingleTradeDebitCardLimit").getAttribute("value");
	}
	//添加_单笔交易贷记卡限额
	public void setAdd_SingleTradeCreditCardLimit(String value) {
		du.what("Add_SingleTradeCreditCardLimit").clear();
		du.what("Add_SingleTradeCreditCardLimit").sendKeys(value);
	}
	public String getAdd_SingleTradeCreditCardLimit() {
		return du.what("Add_SingleTradeCreditCardLimit").getAttribute("value");
	}
	//添加_借记卡日累积限额
	public void setAdd_DebitCardDayLimit(String value) {
		du.what("Add_DebitCardDayLimit").clear();
		du.what("Add_DebitCardDayLimit").sendKeys(value);
	}
	public String getAdd_DebitCardDayLimit() {
		return du.what("Add_DebitCardDayLimit").getAttribute("value");
	}
	//添加_贷记卡日累积限额
	public void setAdd_CreditCardDayLimit(String value) {
		du.what("Add_CreditCardDayLimit").clear();
		du.what("Add_CreditCardDayLimit").sendKeys(value);
	}
	public String getAdd_CreditCardDayLimit() {
		return du.what("Add_CreditCardDayLimit").getAttribute("value");
	}
	//添加_日累积总限额
	public void setAdd_DayTotalLimit(String value) {
		du.what("Add_DayTotalLimit").clear();
		du.what("Add_DayTotalLimit").sendKeys(value);
	}
	public String getAdd_DayTotalLimit() {
		return du.what("Add_DayTotalLimit").getAttribute("value");
	}
	//添加_终端/商户限制起始时间
	public void setAdd_TerminalMerchantLimitTimeBegin(String value) {
		du.what("Add_TerminalMerchantLimitTimeBegin").clear();
		du.what("Add_TerminalMerchantLimitTimeBegin").sendKeys(value);
	}
	public String getAdd_TerminalMerchantLimitTimeBegin() {
		return du.what("Add_TerminalMerchantLimitTimeBegin").getAttribute("value");
	}
	//添加_终端/商户限制截止时间
	public void setAdd_TerminalMerchantLimitTimeEnd(String value) {
		du.what("Add_TerminalMerchantLimitTimeEnd").clear();
		du.what("Add_TerminalMerchantLimitTimeEnd").sendKeys(value);
	}
	public String getAdd_TerminalMerchantLimitTimeEnd() {
		return du.what("Add_TerminalMerchantLimitTimeEnd").getAttribute("value");
	}
	//添加_提交
	public void clickAdd_Submit() {
		du.what("Add_Submit").click();
	}
	//添加_关闭
	public void clickAdd_Close() {
		du.what("Add_Close").click();
	}
	//批量添加_选择文件
	public void clickBatch_SelectFile() {
		du.what("Batch_SelectFile").click();
	}
	//批量添加_确认
	public void clickBatch_Confirm() {
		du.what("Batch_Confirm").click();
	}
	//批量添加_关闭
	public void clickBatch_Close() {
		du.what("Batch_Close").click();
	}
	//内部商户类型
	public void selectInnerMerchantType(String value) {
		du.whatSelect("InnerMerchantType").selectByValue(value);
	}
	//操作起始时间
	public void setStartDate(String value) {
		du.what("StartDate").sendKeys(Keys.CONTROL + "a");
		du.waitFor(500);
		du.what("StartDate").sendKeys(value);
	}
	public String getStartDate() {
		return du.what("StartDate").getAttribute("value");
	}
	//操作结束时间
	public void setEndDate(String value) {
		du.what("EndDate").sendKeys(Keys.CONTROL + "a");
		du.waitFor(500);
		du.what("EndDate").sendKeys(value);
	}
	public String getEndDate() {
		return du.what("EndDate").getAttribute("value");
	}
	//二级内部商户类型
	public void selectInnerMerchantTypeLv2(String value) {
		du.whatSelect("InnerMerchantTypeLv2").selectByValue(value);
	}
	//修改_扫码单笔限额
	public void setUpdate_ScanCodeSingleLimit(String value) {
		du.what("Update_ScanCodeSingleLimit").clear();
		du.what("Update_ScanCodeSingleLimit").sendKeys(value);
	}
	public String getUpdate_ScanCodeSingleLimit() {
		return du.what("Update_ScanCodeSingleLimit").getAttribute("value");
	}
	//修改_扫码单日限额
	public void setUpdate_ScanCodeDayLimit(String value) {
		du.what("Update_ScanCodeDayLimit").clear();
		du.what("Update_ScanCodeDayLimit").sendKeys(value);
	}
	public String getUpdate_ScanCodeDayLimit() {
		return du.what("Update_ScanCodeDayLimit").getAttribute("value");
	}
	//添加_扫码单笔限额
	public void setAdd_ScanCodeSingleLimit(String value) {
		du.what("Add_ScanCodeSingleLimit").clear();
		du.what("Add_ScanCodeSingleLimit").sendKeys(value);
	}
	public String getAdd_ScanCodeSingleLimit() {
		return du.what("Add_ScanCodeSingleLimit").getAttribute("value");
	}
	//添加_扫码单日限额
	public void setAdd_ScanCodeDayLimit(String value) {
		du.what("Add_ScanCodeDayLimit").clear();
		du.what("Add_ScanCodeDayLimit").sendKeys(value);
	}
	public String getAdd_ScanCodeDayLimit() {
		return du.what("Add_ScanCodeDayLimit").getAttribute("value");
	}
	//添加_终端号
	public void selectAdd_TerminalNO(String value) {
		du.whatSelect("Add_TerminalNO").selectByValue(value);
	}

}