package com.dy.AutoTest.AcquiringOperationPlatform.PageObject.TerminalInventoryManagement;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.dy.AutoTest.web.api.IQuery;
import com.dy.AutoTest.web.api.SuperPage;
import com.dy.AutoTest.web.actions.DoPlus;

public class HostInventoryManagementPage extends SuperPage implements IQuery{
	public HostInventoryManagementPage(WebDriver driver) {
		super(driver);
		du.loadLocator("AOP_Loc_TerminalInventoryManagement_HostInventoryManagement");
	}
	public void setWaitTime(long waitTime) {
		du=new DoPlus(driver);
		du.waitTime=waitTime;
		du.loadLocator("AOP_Loc_TerminalInventoryManagement_HostInventoryManagement");
	}

/***************************Manual Coding**********************************/


/****************************Auto Generate******************************/

	//终端序列号
	public void setTerminalSerialNO(String value) {
		du.what("TerminalSerialNO").clear();
		du.what("TerminalSerialNO").sendKeys(value);
	}
	public String getTerminalSerialNO() {
		return du.what("TerminalSerialNO").getAttribute("value");
	}
	//终端号
	public void setTermianlNO(String value) {
		du.what("TermianlNO").clear();
		du.what("TermianlNO").sendKeys(value);
	}
	public String getTermianlNO() {
		return du.what("TermianlNO").getAttribute("value");
	}
	//使用状态
	public void selectUseStatus(String value) {
		du.whatSelect("UseStatus").selectByValue(value);
	}
	//厂商名称
	public void selectManufactureName(String value) {
		du.whatSelect("ManufactureName").selectByValue(value);
	}
	//终端型号
	public void selectTerminalType(String value) {
		du.whatSelect("TerminalType").selectByValue(value);
	}
	//所属机构
	public void selectBelongOrgnizine(String value) {
		du.whatSelect("BelongOrgnizine").selectByValue(value);
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
	//终端入库
	public void clickTerminalEnterStorage() {
		du.what("TerminalEnterStorage").click();
	}
	//出库
	public void clickOutStorage() {
		du.what("OutStorage").click();
	}
	//注册
	public void clickRegist() {
		du.what("Regist").click();
	}
	//特殊入库
	public void clickSpecialEnterStorage() {
		du.what("SpecialEnterStorage").click();
	}
	//报修
	public void clickReportFix() {
		du.what("ReportFix").click();
	}
	//报废
	public void clickScrap() {
		du.what("Scrap").click();
	}
	//调拨
	public void clickAllot() {
		du.what("Allot").click();
	}
	//已入库修改
	public void clickEnteredStroageUpdate() {
		du.what("EnteredStroageUpdate").click();
	}
	//已出库修改
	public void clickOutStroageUpdate() {
		du.what("OutStroageUpdate").click();
	}
	//库存列表单选按钮
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
	//终端入库_厂商名称
	public void selectTerminalEnterStorage_Manufacture(String value) {
		du.whatSelect("TerminalEnterStorage_Manufacture").selectByValue(value);
	}
	//终端入库_终端型号
	public void selectTerminalEnterStorage_TerminalType(String value) {
		du.whatSelect("TerminalEnterStorage_TerminalType").selectByValue(value);
	}
	//终端入库_起序列号1
	public void setTerminalEnterStorage_InitialSerialNO1(String value) {
		du.what("TerminalEnterStorage_InitialSerialNO1").clear();
		du.what("TerminalEnterStorage_InitialSerialNO1").sendKeys(value);
	}
	public String getTerminalEnterStorage_InitialSerialNO1() {
		return du.what("TerminalEnterStorage_InitialSerialNO1").getAttribute("value");
	}
	//终端入库_起序列号2
	public void setTerminalEnterStorage_InitialSerialNO2(String value) {
		du.what("TerminalEnterStorage_InitialSerialNO2").clear();
		du.what("TerminalEnterStorage_InitialSerialNO2").sendKeys(value);
	}
	public String getTerminalEnterStorage_InitialSerialNO2() {
		return du.what("TerminalEnterStorage_InitialSerialNO2").getAttribute("value");
	}
	//终端入库_终序列号
	public void setTerminalEnterStorage_FinalSerialNO(String value) {
		du.what("TerminalEnterStorage_FinalSerialNO").clear();
		du.what("TerminalEnterStorage_FinalSerialNO").sendKeys(value);
	}
	public String getTerminalEnterStorage_FinalSerialNO() {
		return du.what("TerminalEnterStorage_FinalSerialNO").getAttribute("value");
	}
	//终端入库_产权属性
	public void selectTerminalEnterStorage_PropertyRightCharacteristics(String value) {
		du.whatSelect("TerminalEnterStorage_PropertyRightCharacteristics").selectByValue(value);
	}
	//终端入库_入库时间
	public void setTerminalEnterStorage_EnterStorageTime(String value) {
		du.what("TerminalEnterStorage_EnterStorageTime").clear();
		du.what("TerminalEnterStorage_EnterStorageTime").sendKeys(value);
	}
	public String getTerminalEnterStorage_EnterStorageTime() {
		return du.what("TerminalEnterStorage_EnterStorageTime").getAttribute("value");
	}
	//终端入库_入库来源
	public void setTerminalEnterStorage_EnterStorageSource(String value) {
		du.what("TerminalEnterStorage_EnterStorageSource").clear();
		du.what("TerminalEnterStorage_EnterStorageSource").sendKeys(value);
	}
	public String getTerminalEnterStorage_EnterStorageSource() {
		return du.what("TerminalEnterStorage_EnterStorageSource").getAttribute("value");
	}
	//终端入库_入库批次号
	public void setTerminalEnterStorage_EnterStorageBatchNO(String value) {
		du.what("TerminalEnterStorage_EnterStorageBatchNO").clear();
		du.what("TerminalEnterStorage_EnterStorageBatchNO").sendKeys(value);
	}
	public String getTerminalEnterStorage_EnterStorageBatchNO() {
		return du.what("TerminalEnterStorage_EnterStorageBatchNO").getAttribute("value");
	}
	//终端入库_合同编号
	public void setTerminalEnterStorage_ContractNO(String value) {
		du.what("TerminalEnterStorage_ContractNO").clear();
		du.what("TerminalEnterStorage_ContractNO").sendKeys(value);
	}
	public String getTerminalEnterStorage_ContractNO() {
		return du.what("TerminalEnterStorage_ContractNO").getAttribute("value");
	}
	//终端入库_采购价格
	public void setTerminalEnterStorage_PurchasePrice(String value) {
		du.what("TerminalEnterStorage_PurchasePrice").clear();
		du.what("TerminalEnterStorage_PurchasePrice").sendKeys(value);
	}
	public String getTerminalEnterStorage_PurchasePrice() {
		return du.what("TerminalEnterStorage_PurchasePrice").getAttribute("value");
	}
	//终端入库_确定入库
	public void clickTerminalEnterStorage_EnterStorageConfirm() {
		du.what("TerminalEnterStorage_EnterStorageConfirm").click();
	}
	//终端入库_关闭
	public void clickTerminalEnterStorage_Close() {
		du.what("TerminalEnterStorage_Close").click();
	}
	//出库_出库时间
	public void setOutStorage_OutStorageTime(String value) {
		du.what("OutStorage_OutStorageTime").clear();
		du.what("OutStorage_OutStorageTime").sendKeys(value);
	}
	public String getOutStorage_OutStorageTime() {
		return du.what("OutStorage_OutStorageTime").getAttribute("value");
	}
	//出库_出库状态
	public void selectOutStorage_OutStorageStatus(String value) {
		du.whatSelect("OutStorage_OutStorageStatus").selectByValue(value);
	}
	//出库_出库去向
	public void setOutStorage_OutStorageDirection(String value) {
		du.what("OutStorage_OutStorageDirection").clear();
		du.what("OutStorage_OutStorageDirection").sendKeys(value);
	}
	public String getOutStorage_OutStorageDirection() {
		return du.what("OutStorage_OutStorageDirection").getAttribute("value");
	}
	//出库_领用部门
	public void setOutStorage_ReciveSection(String value) {
		du.what("OutStorage_ReciveSection").clear();
		du.what("OutStorage_ReciveSection").sendKeys(value);
	}
	public String getOutStorage_ReciveSection() {
		return du.what("OutStorage_ReciveSection").getAttribute("value");
	}
	//出库_领用人
	public void setOutStorage_Reciver(String value) {
		du.what("OutStorage_Reciver").clear();
		du.what("OutStorage_Reciver").sendKeys(value);
	}
	public String getOutStorage_Reciver() {
		return du.what("OutStorage_Reciver").getAttribute("value");
	}
	//出库_确定
	public void clickOutStorage_Confirm() {
		du.what("OutStorage_Confirm").click();
	}
	//出库_关闭
	public void clickOutStorage_Close() {
		du.what("OutStorage_Close").click();
	}
	//注册_终端归属商户号
	public void setRegist_TerminalBelongMerchantNO(String value) {
		du.what("Regist_TerminalBelongMerchantNO").clear();
		du.what("Regist_TerminalBelongMerchantNO").sendKeys(value);
	}
	public String getRegist_TerminalBelongMerchantNO() {
		return du.what("Regist_TerminalBelongMerchantNO").getAttribute("value");
	}
	//注册_搜商户
	public void clickRegist_SearchMerchant() {
		du.what("Regist_SearchMerchant").click();
	}
	//注册_门店名称
	public void setRegist_StoreName(String value) {
		du.what("Regist_StoreName").clear();
		du.what("Regist_StoreName").sendKeys(value);
	}
	public String getRegist_StoreName() {
		return du.what("Regist_StoreName").getAttribute("value");
	}
	//注册_搜门店
	public void clickRegist_SearchStore() {
		du.what("Regist_SearchStore").click();
	}
	//注册_注册日期
	public void setRegist_RegistDate(String value) {
		du.what("Regist_RegistDate").sendKeys(Keys.CONTROL + "a");
		du.waitFor(500);
		du.what("Regist_RegistDate").sendKeys(value);
	}
	public String getRegist_RegistDate() {
		return du.what("Regist_RegistDate").getAttribute("value");
	}
	//注册_银联标准地区码
	public void setRegist_UnionStandardDistantRegionCode(String value) {
		du.what("Regist_UnionStandardDistantRegionCode").clear();
		du.what("Regist_UnionStandardDistantRegionCode").sendKeys(value);
	}
	public String getRegist_UnionStandardDistantRegionCode() {
		return du.what("Regist_UnionStandardDistantRegionCode").getAttribute("value");
	}
	//注册_巡检周期
	public void setRegist_CheckCycle(String value) {
		du.what("Regist_CheckCycle").clear();
		du.what("Regist_CheckCycle").sendKeys(value);
	}
	public String getRegist_CheckCycle() {
		return du.what("Regist_CheckCycle").getAttribute("value");
	}
	//注册_维护经理
	public void setRegist_MaintainManager(String value) {
		du.what("Regist_MaintainManager").clear();
		du.what("Regist_MaintainManager").sendKeys(value);
	}
	public String getRegist_MaintainManager() {
		return du.what("Regist_MaintainManager").getAttribute("value");
	}
	//注册_安装地址
	public void setRegist_InstallAddress(String value) {
		du.what("Regist_InstallAddress").clear();
		du.what("Regist_InstallAddress").sendKeys(value);
	}
	public String getRegist_InstallAddress() {
		return du.what("Regist_InstallAddress").getAttribute("value");
	}
	//注册_装机联系人
	public void setRegist_InstallContantPerson(String value) {
		du.what("Regist_InstallContantPerson").clear();
		du.what("Regist_InstallContantPerson").sendKeys(value);
	}
	public String getRegist_InstallContantPerson() {
		return du.what("Regist_InstallContantPerson").getAttribute("value");
	}
	//注册_装机联系人电话
	public void setRegist_InstallContantPersonPhoneNO(String value) {
		du.what("Regist_InstallContantPersonPhoneNO").clear();
		du.what("Regist_InstallContantPersonPhoneNO").sendKeys(value);
	}
	public String getRegist_InstallContantPersonPhoneNO() {
		return du.what("Regist_InstallContantPersonPhoneNO").getAttribute("value");
	}
	//注册_电话号码
	public void setRegist_TelephoneNO(String value) {
		du.what("Regist_TelephoneNO").clear();
		du.what("Regist_TelephoneNO").sendKeys(value);
	}
	public String getRegist_TelephoneNO() {
		return du.what("Regist_TelephoneNO").getAttribute("value");
	}
	//注册_SIM卡号码
	public void setRegist_SIMCardNO(String value) {
		du.what("Regist_SIMCardNO").clear();
		du.what("Regist_SIMCardNO").sendKeys(value);
	}
	public String getRegist_SIMCardNO() {
		return du.what("Regist_SIMCardNO").getAttribute("value");
	}
	//注册_注册
	public void clickRegist_Regist() {
		du.what("Regist_Regist").click();
	}
	//注册_关闭
	public void clickRegist_Close() {
		du.what("Regist_Close").click();
	}
	//特殊入库_入库时间
	public void setSpecialEnterStorage_EnterStorageTime(String value) {
		du.what("SpecialEnterStorage_EnterStorageTime").clear();
		du.what("SpecialEnterStorage_EnterStorageTime").sendKeys(value);
	}
	public String getSpecialEnterStorage_EnterStorageTime() {
		return du.what("SpecialEnterStorage_EnterStorageTime").getAttribute("value");
	}
	//特殊入库_入库来源
	public void setSpecialEnterStorage_EnterStorageSource(String value) {
		du.what("SpecialEnterStorage_EnterStorageSource").clear();
		du.what("SpecialEnterStorage_EnterStorageSource").sendKeys(value);
	}
	public String getSpecialEnterStorage_EnterStorageSource() {
		return du.what("SpecialEnterStorage_EnterStorageSource").getAttribute("value");
	}
	//特殊入库_确定特殊入库
	public void clickSpecialEnterStorage_SpecialEnterStorage() {
		du.what("SpecialEnterStorage_SpecialEnterStorage").click();
	}
	//特殊入库_关闭
	public void clickSpecialEnterStorage_Close() {
		du.what("SpecialEnterStorage_Close").click();
	}
	//报修_确定
	public void clickReportFix_Confirm() {
		du.what("ReportFix_Confirm").click();
	}
	//报修_关闭
	public void clickReportFix_Close() {
		du.what("ReportFix_Close").click();
	}
	//报废_确认
	public void clickScrap_Confirm() {
		du.what("Scrap_Confirm").click();
	}
	//报废_关闭
	public void clickScrap_Close() {
		du.what("Scrap_Close").click();
	}
	//调拨_调拨时间
	public void setAllot_AllotTime(String value) {
		du.what("Allot_AllotTime").clear();
		du.what("Allot_AllotTime").sendKeys(value);
	}
	public String getAllot_AllotTime() {
		return du.what("Allot_AllotTime").getAttribute("value");
	}
	//调拨_调拨机构
	public void selectAllot_AllotOrgnization(String value) {
		du.whatSelect("Allot_AllotOrgnization").selectByValue(value);
	}
	//调拨_调拨部门
	public void setAllot_AllotSection(String value) {
		du.what("Allot_AllotSection").clear();
		du.what("Allot_AllotSection").sendKeys(value);
	}
	public String getAllot_AllotSection() {
		return du.what("Allot_AllotSection").getAttribute("value");
	}
	//调拨_调拨人
	public void setAllot_Alloter(String value) {
		du.what("Allot_Alloter").clear();
		du.what("Allot_Alloter").sendKeys(value);
	}
	public String getAllot_Alloter() {
		return du.what("Allot_Alloter").getAttribute("value");
	}
	//调拨_确定
	public void clickAllot_Confirm() {
		du.what("Allot_Confirm").click();
	}
	//调拨_关闭
	public void clickAllot_Close() {
		du.what("Allot_Close").click();
	}
	//已入库修改_入库来源
	public void setEnteredStorageUpdate_EnteredStorageSource(String value) {
		du.what("EnteredStorageUpdate_EnteredStorageSource").clear();
		du.what("EnteredStorageUpdate_EnteredStorageSource").sendKeys(value);
	}
	public String getEnteredStorageUpdate_EnteredStorageSource() {
		return du.what("EnteredStorageUpdate_EnteredStorageSource").getAttribute("value");
	}
	//已入库修改_库批次
	public void setEnteredStorageUpdate_StorageBatchNO(String value) {
		du.what("EnteredStorageUpdate_StorageBatchNO").clear();
		du.what("EnteredStorageUpdate_StorageBatchNO").sendKeys(value);
	}
	public String getEnteredStorageUpdate_StorageBatchNO() {
		return du.what("EnteredStorageUpdate_StorageBatchNO").getAttribute("value");
	}
	//已入库修改_合同编号
	public void setEnteredStorageUpdate_ContractNO(String value) {
		du.what("EnteredStorageUpdate_ContractNO").clear();
		du.what("EnteredStorageUpdate_ContractNO").sendKeys(value);
	}
	public String getEnteredStorageUpdate_ContractNO() {
		return du.what("EnteredStorageUpdate_ContractNO").getAttribute("value");
	}
	//已入库修改_采购价格
	public void setEnteredStorageUpdate_PurchusePrice(String value) {
		du.what("EnteredStorageUpdate_PurchusePrice").clear();
		du.what("EnteredStorageUpdate_PurchusePrice").sendKeys(value);
	}
	public String getEnteredStorageUpdate_PurchusePrice() {
		return du.what("EnteredStorageUpdate_PurchusePrice").getAttribute("value");
	}
	//已入库修改_确定
	public void clickEnteredStorageUpdate_Confirm() {
		du.what("EnteredStorageUpdate_Confirm").click();
	}
	//已入库修改_关闭
	public void clickEnteredStorageUpdate_Close() {
		du.what("EnteredStorageUpdate_Close").click();
	}
	//已出库修改_终端序列号
	public void setOutStroageUpdate_TerminalSerialNO(String value) {
		du.what("OutStroageUpdate_TerminalSerialNO").clear();
		du.what("OutStroageUpdate_TerminalSerialNO").sendKeys(value);
	}
	public String getOutStroageUpdate_TerminalSerialNO() {
		return du.what("OutStroageUpdate_TerminalSerialNO").getAttribute("value");
	}
	//已出库修改_出库去向
	public void setOutStroageUpdate_OutStorageDirection(String value) {
		du.what("OutStroageUpdate_OutStorageDirection").clear();
		du.what("OutStroageUpdate_OutStorageDirection").sendKeys(value);
	}
	public String getOutStroageUpdate_OutStorageDirection() {
		return du.what("OutStroageUpdate_OutStorageDirection").getAttribute("value");
	}
	//已出库修改_领用部门
	public void setOutStroageUpdate_ReciveSection(String value) {
		du.what("OutStroageUpdate_ReciveSection").clear();
		du.what("OutStroageUpdate_ReciveSection").sendKeys(value);
	}
	public String getOutStroageUpdate_ReciveSection() {
		return du.what("OutStroageUpdate_ReciveSection").getAttribute("value");
	}
	//已出库修改_领用人
	public void setOutStroageUpdate_Reciver(String value) {
		du.what("OutStroageUpdate_Reciver").clear();
		du.what("OutStroageUpdate_Reciver").sendKeys(value);
	}
	public String getOutStroageUpdate_Reciver() {
		return du.what("OutStroageUpdate_Reciver").getAttribute("value");
	}
	//已出库修改_确定
	public void clickOutStroageUpdate_Confirm() {
		du.what("OutStroageUpdate_Confirm").click();
	}
	//已出库修改_关闭
	public void clickOutStroageUpdate_Close() {
		du.what("OutStroageUpdate_Close").click();
	}
	//注册_搜商户_商户号
	public void setRegist_SearchMerchant_MerchantNO(String value) {
		du.what("Regist_SearchMerchant_MerchantNO").clear();
		du.what("Regist_SearchMerchant_MerchantNO").sendKeys(value);
	}
	public String getRegist_SearchMerchant_MerchantNO() {
		return du.what("Regist_SearchMerchant_MerchantNO").getAttribute("value");
	}
	//注册_搜商户_商户名
	public void setRegist_SearchMerchant_MerchantName(String value) {
		du.what("Regist_SearchMerchant_MerchantName").clear();
		du.what("Regist_SearchMerchant_MerchantName").sendKeys(value);
	}
	public String getRegist_SearchMerchant_MerchantName() {
		return du.what("Regist_SearchMerchant_MerchantName").getAttribute("value");
	}
	//注册_搜商户_确认
	public void clickRegist_SearchMerchant_Confirm() {
		du.what("Regist_SearchMerchant_Confirm").click();
	}
	//注册_搜商户_商户列表单选按钮
	public void clickRegist_SearchMerchant_MerchantRadio(String radio) {
		du.what("Regist_SearchMerchant_MerchantRadio",radio).click();
	}
	public boolean isRegist_SearchMerchant_MerchantRadioExist(String radio) {
		du.waitFor(500);
		return du.isElementExist("Regist_SearchMerchant_MerchantRadio",radio);
	}
	public boolean isRegist_SearchMerchant_MerchantRadioDisplayed(String radio) {
		du.waitFor(500);
		return du.what("Regist_SearchMerchant_MerchantRadio",radio).isDisplayed();
	}
	//注册_搜商户_提交
	public void clickRegist_SearchMerchant_Submit() {
		du.what("Regist_SearchMerchant_Submit").click();
	}
	//注册_搜商户_关闭
	public void clickRegist_SearchMerchant_Close() {
		du.what("Regist_SearchMerchant_Close").click();
	}
	//注册_搜门店_门店名称
	public void setRegist_SearchStore_StoreName(String value) {
		du.what("Regist_SearchStore_StoreName").clear();
		du.what("Regist_SearchStore_StoreName").sendKeys(value);
	}
	public String getRegist_SearchStore_StoreName() {
		return du.what("Regist_SearchStore_StoreName").getAttribute("value");
	}
	//注册_搜门店_查询
	public void clickRegist_SearchStore_Query() {
		du.what("Regist_SearchStore_Query").click();
	}
	//注册_搜门店_门店列表单选按钮
	public void clickRegist_SearchStore_StoreRadio(String radio) {
		du.what("Regist_SearchStore_StoreRadio",radio).click();
	}
	public boolean isRegist_SearchStore_StoreRadioExist(String radio) {
		du.waitFor(500);
		return du.isElementExist("Regist_SearchStore_StoreRadio",radio);
	}
	public boolean isRegist_SearchStore_StoreRadioDisplayed(String radio) {
		du.waitFor(500);
		return du.what("Regist_SearchStore_StoreRadio",radio).isDisplayed();
	}
	//注册_搜门店_提交
	public void clickRegist_SearchStore_Submit() {
		du.what("Regist_SearchStore_Submit").click();
	}
	//注册_搜门店_关闭
	public void clickRegist_SearchStore_Close() {
		du.what("Regist_SearchStore_Close").click();
	}

}