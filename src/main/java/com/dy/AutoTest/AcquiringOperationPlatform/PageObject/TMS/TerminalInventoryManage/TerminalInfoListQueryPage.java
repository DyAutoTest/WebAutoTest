package com.dy.AutoTest.AcquiringOperationPlatform.PageObject.TMS.TerminalInventoryManage;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.dy.AutoTest.web.api.IQuery;
import com.dy.AutoTest.web.api.SuperPage;
import com.dy.AutoTest.web.actions.DoPlus;

public class TerminalInfoListQueryPage extends SuperPage implements IQuery{
	public TerminalInfoListQueryPage(WebDriver driver) {
		super(driver);
		du.loadLocator("AOP_Loc_TerminalInventoryManage_TerminalInfoListQuery");
	}
	public void setWaitTime(long waitTime) {
		du=new DoPlus(driver);
		du.waitTime=waitTime;
		du.loadLocator("AOP_Loc_TerminalInventoryManage_TerminalInfoListQuery");
	}

/***************************Manual Coding**********************************/


/****************************Auto Generate******************************/

	//商户号
	public void setMerchantNO(String value) {
		du.what("MerchantNO").clear();
		du.what("MerchantNO").sendKeys(value);
	}
	public String getMerchantNO() {
		return du.what("MerchantNO").getAttribute("value");
	}
	//终端号
	public void setTerminalNO(String value) {
		du.what("TerminalNO").clear();
		du.what("TerminalNO").sendKeys(value);
	}
	public String getTerminalNO() {
		return du.what("TerminalNO").getAttribute("value");
	}
	//终端序列号
	public void setTerminalSerialNO(String value) {
		du.what("TerminalSerialNO").clear();
		du.what("TerminalSerialNO").sendKeys(value);
	}
	public String getTerminalSerialNO() {
		return du.what("TerminalSerialNO").getAttribute("value");
	}
	//维护经理
	public void setMaintainManager(String value) {
		du.what("MaintainManager").clear();
		du.what("MaintainManager").sendKeys(value);
	}
	public String getMaintainManager() {
		return du.what("MaintainManager").getAttribute("value");
	}
	//门店名称
	public void setStoreName(String value) {
		du.what("StoreName").clear();
		du.what("StoreName").sendKeys(value);
	}
	public String getStoreName() {
		return du.what("StoreName").getAttribute("value");
	}
	//使用状态
	public void selectUseStatus(String value) {
		du.whatSelect("UseStatus").selectByValue(value);
	}
	//上级商户号
	public void setSuperiorMerchantNO(String value) {
		du.what("SuperiorMerchantNO").clear();
		du.what("SuperiorMerchantNO").sendKeys(value);
	}
	public String getSuperiorMerchantNO() {
		return du.what("SuperiorMerchantNO").getAttribute("value");
	}
	//上级商户名称
	public void setSuperiorMerchantName(String value) {
		du.what("SuperiorMerchantName").clear();
		du.what("SuperiorMerchantName").sendKeys(value);
	}
	public String getSuperiorMerchantName() {
		return du.what("SuperiorMerchantName").getAttribute("value");
	}
	//代理商编号
	public void setAgentNO(String value) {
		du.what("AgentNO").clear();
		du.what("AgentNO").sendKeys(value);
	}
	public String getAgentNO() {
		return du.what("AgentNO").getAttribute("value");
	}
	//代理商名称
	public void setAgentName(String value) {
		du.what("AgentName").clear();
		du.what("AgentName").sendKeys(value);
	}
	public String getAgentName() {
		return du.what("AgentName").getAttribute("value");
	}
	//所属机构
	public void selectBelongOrgnization(String value) {
		du.whatSelect("BelongOrgnization").selectByValue(value);
	}
	//归属省
	public void selectBelongProvince(String value) {
		du.whatSelect("BelongProvince").selectByValue(value);
	}
	//归属市
	public void selectBelongCity(String value) {
		du.whatSelect("BelongCity").selectByValue(value);
	}
	//签到状态
	public void selectSignStatus(String value) {
		du.whatSelect("SignStatus").selectByValue(value);
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
	//修改
	public void clickUpdate() {
		du.what("Update").click();
	}
	//注销
	public void clickDelete() {
		du.what("Delete").click();
	}
	//终端列表单选按钮
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
	//修改_搜门店
	public void clickUpdate_SearchStore() {
		du.what("Update_SearchStore").click();
	}
	//修改_搜门店_门店名称
	public void setUpdate_SearchStore_StoreName(String value) {
		du.what("Update_SearchStore_StoreName").clear();
		du.what("Update_SearchStore_StoreName").sendKeys(value);
	}
	public String getUpdate_SearchStore_StoreName() {
		return du.what("Update_SearchStore_StoreName").getAttribute("value");
	}
	//修改_搜门店_查询
	public void clickUpdate_SearchStore_Query() {
		du.what("Update_SearchStore_Query").click();
	}
	//修改_搜门店_门店列表单选按钮
	public void clickUpdate_SearchStore_Radio(String radio) {
		du.what("Update_SearchStore_Radio",radio).click();
	}
	public boolean isUpdate_SearchStore_RadioExist(String radio) {
		du.waitFor(500);
		return du.isElementExist("Update_SearchStore_Radio",radio);
	}
	public boolean isUpdate_SearchStore_RadioDisplayed(String radio) {
		du.waitFor(500);
		return du.what("Update_SearchStore_Radio",radio).isDisplayed();
	}
	//修改_搜门店_提交
	public void clickUpdate_SearchStore_Submit() {
		du.what("Update_SearchStore_Submit").click();
	}
	//修改_搜门店_关闭
	public void clickUpdate_SearchStore_Close() {
		du.what("Update_SearchStore_Close").click();
	}
	//修改_设备状态
	public void selectUpdate_EquipmentStatus(String value) {
		du.whatSelect("Update_EquipmentStatus").selectByValue(value);
	}
	//修改_设备归属
	public void selectUpdate_EquipmentBelong(String value) {
		du.whatSelect("Update_EquipmentBelong").selectByValue(value);
	}
	//修改_设备类型
	public void selectUpdate_EquipmentType(String value) {
		du.whatSelect("Update_EquipmentType").selectByValue(value);
	}
	//修改_设备名称
	public void setUpdate_Name(String value) {
		du.what("Update_Name").clear();
		du.what("Update_Name").sendKeys(value);
	}
	public String getUpdate_Name() {
		return du.what("Update_Name").getAttribute("value");
	}
	//修改_归属省
	public void selectUpdate_BelongProvince(String value) {
		du.whatSelect("Update_BelongProvince").selectByValue(value);
	}
	//修改_归属市
	public void selectUpdate_BelongCity(String value) {
		du.whatSelect("Update_BelongCity").selectByValue(value);
	}
	//修改_安装日期
	public void setUpdate_InstallDate(String value) {
		du.what("Update_InstallDate").sendKeys(Keys.CONTROL + "a");
		du.waitFor(500);
		du.what("Update_InstallDate").sendKeys(value);
	}
	public String getUpdate_InstallDate() {
		return du.what("Update_InstallDate").getAttribute("value");
	}
	//修改_起用日期
	public void setUpdate_UseDate(String value) {
		du.what("Update_UseDate").sendKeys(Keys.CONTROL + "a");
		du.waitFor(500);
		du.what("Update_UseDate").sendKeys(value);
	}
	public String getUpdate_UseDate() {
		return du.what("Update_UseDate").getAttribute("value");
	}
	//修改_巡检周期
	public void setUpdate_CheckCircle(String value) {
		du.what("Update_CheckCircle").clear();
		du.what("Update_CheckCircle").sendKeys(value);
	}
	public String getUpdate_CheckCircle() {
		return du.what("Update_CheckCircle").getAttribute("value");
	}
	//修改_允许的币种
	public void selectUpdate_AllowCurrency(String value) {
		du.whatSelect("Update_AllowCurrency").selectByValue(value);
	}
	//修改_终端权限控制信息
	public void selectUpdate_TerminalRightControlInfo(String value) {
		du.whatSelect("Update_TerminalRightControlInfo").selectByValue(value);
	}
	//修改_电话号码
	public void setUpdate_TelephoneNO(String value) {
		du.what("Update_TelephoneNO").clear();
		du.what("Update_TelephoneNO").sendKeys(value);
	}
	public String getUpdate_TelephoneNO() {
		return du.what("Update_TelephoneNO").getAttribute("value");
	}
	//修改_SIM卡号
	public void setUpdate_SIMCardNO(String value) {
		du.what("Update_SIMCardNO").clear();
		du.what("Update_SIMCardNO").sendKeys(value);
	}
	public String getUpdate_SIMCardNO() {
		return du.what("Update_SIMCardNO").getAttribute("value");
	}
	//修改_当前批次号
	public void setUpdate_CurrentBatchNO(String value) {
		du.what("Update_CurrentBatchNO").clear();
		du.what("Update_CurrentBatchNO").sendKeys(value);
	}
	public String getUpdate_CurrentBatchNO() {
		return du.what("Update_CurrentBatchNO").getAttribute("value");
	}
	//修改_银联标准地
	public void setUpdate_UnionStandardArea(String value) {
		du.what("Update_UnionStandardArea").clear();
		du.what("Update_UnionStandardArea").sendKeys(value);
	}
	public String getUpdate_UnionStandardArea() {
		return du.what("Update_UnionStandardArea").getAttribute("value");
	}
	//修改_联机退货标志
	public void selectUpdate_OnlineRefundSign(String value) {
		du.whatSelect("Update_OnlineRefundSign").selectByValue(value);
	}
	//修改_C端访问增值服务方式
	public void selectUpdate_CTerminalAccessAppreciationServices(String value) {
		du.whatSelect("Update_CTerminalAccessAppreciationServices").selectByValue(value);
	}
	//修改_维护经理
	public void setUpdate_MaintainManager(String value) {
		du.what("Update_MaintainManager").clear();
		du.what("Update_MaintainManager").sendKeys(value);
	}
	public String getUpdate_MaintainManager() {
		return du.what("Update_MaintainManager").getAttribute("value");
	}
	//修改_提交
	public void clickUpdate_Submit() {
		du.what("Update_Submit").click();
	}
	//修改_关闭
	public void clickUpdate_Close() {
		du.what("Update_Close").click();
	}
	//注销_确定
	public void clickDelete_Confirm() {
		du.what("Delete_Confirm").click();
	}
	//注销_关闭
	public void clickDelete_Close() {
		du.what("Delete_Close").click();
	}
	//修改_说明
	public void setUpdate_Explain(String value) {
		du.what("Update_Explain").clear();
		du.what("Update_Explain").sendKeys(value);
	}
	public String getUpdate_Explain() {
		return du.what("Update_Explain").getAttribute("value");
	}

}