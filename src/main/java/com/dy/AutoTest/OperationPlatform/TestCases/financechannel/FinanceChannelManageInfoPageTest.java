package com.dy.AutoTest.OperationPlatform.TestCases.financechannel;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.dy.AutoTest.OperationPlatform.POJO.FinanceChannelManageInfoBean;
import com.dy.AutoTest.OperationPlatform.PageObject.financechannel.FinanceChannelManageInfoPage;
import com.dy.AutoTest.web.api.SuperTest;
import com.dy.AutoTest.web.business.DataBusiness;

public class FinanceChannelManageInfoPageTest extends SuperTest {

	private FinanceChannelManageInfoPage financeChannelManageInfoPage;

	private String URL = "";

	@BeforeClass
	public void init() {
		financeChannelManageInfoPage = new FinanceChannelManageInfoPage(driver);
		URL = host.toString() + DataBusiness.getData_URL("pop_FinanceChannelManageInfo");
	}

	@DataProvider(name = "financeChannelManageInfo")
	protected static Object[][] parametersPool() {
		data.loadDataBeanList("POP_Data_FinanceChannelManageInfo");
		return data.getDataBeanArray();
	}

	@Test(dataProvider = "financeChannelManageInfo", description = "运营平台-通道信息维护")
	public void testFinanceChannelManageInfo(FinanceChannelManageInfoBean financeChannelManageInfoBean) {

		financeChannelManageInfoPage.navigateTo(URL);
		
		financeChannelManageInfoPage.setFocusOnChannelCode();
		financeChannelManageInfoPage.queryOnChannelCode(financeChannelManageInfoBean.getChannelCode());
		
		financeChannelManageInfoPage.setFocusOnInterfaceType();
		financeChannelManageInfoPage.queryOnInterfaceType(financeChannelManageInfoBean.getInterfaceType());
		
		financeChannelManageInfoPage.setFocusOnRequestType();
		financeChannelManageInfoPage.queryOnRequestType(financeChannelManageInfoBean.getRequestType());
		
		financeChannelManageInfoPage.setFocusOnEnableSelect();
		financeChannelManageInfoPage.queryOnEnableSelect(financeChannelManageInfoBean.getEnableSelect());
		
		financeChannelManageInfoPage.clickInquire();
		
		wait.waitFor(1000);
		
		financeChannelManageInfoPage.clickSelectionButton(0);
		
		String caseNo = financeChannelManageInfoBean.getCaseNo();
		
		switch (caseNo) {
		case "1":
			modifyCase(financeChannelManageInfoBean);
			break;
		case "2":
			enableCase(financeChannelManageInfoBean);
			break;
		case "3":
			addDeleteCase(financeChannelManageInfoBean);
			break;
		case "4":
			displayCase(financeChannelManageInfoBean);
			break;
		default:
			break;
		}
	}

	private void modifyCase(FinanceChannelManageInfoBean financeChannelManageInfoBean) {
		
		financeChannelManageInfoPage.clickChange();
		
//		Change_EnableSelect
		financeChannelManageInfoPage.setFocusOnChange_EnableSelect();
		financeChannelManageInfoPage.queryOnChange_EnableSelect(financeChannelManageInfoBean.getEnableSelect());
		
//		Change_ChannelType
		financeChannelManageInfoPage.setFocusOnChange_ChannelType();
		financeChannelManageInfoPage.queryOnChange_ChannelType(financeChannelManageInfoBean.getChannelType());
		
//		Change_AccountCheckType
		financeChannelManageInfoPage.setFocusOnChange_AccountCheckType();
		financeChannelManageInfoPage.queryOnChange_AccountCheckType(financeChannelManageInfoBean.getAccountCheckType());
		
//		Change_CallServeName
		financeChannelManageInfoPage.setFocusOnChange_CallServeName();
		financeChannelManageInfoPage.inputChange_CallServeName(financeChannelManageInfoBean.getCallServeName());
		
//		Change_CallTradeCode
		financeChannelManageInfoPage.setFocusOnChange_CallTradeCode();
		financeChannelManageInfoPage.inputChange_CallTradeCode(financeChannelManageInfoBean.getCallTradeCode());
		
//		Change_ExtensionStatus
		financeChannelManageInfoPage.setFocusOnChange_ExtensionStatus();
		financeChannelManageInfoPage.queryOnChange_ExtensionStatus(financeChannelManageInfoBean.getExtensionStatus());
		
//		Change_ChannelPlateformNum
		financeChannelManageInfoPage.setFocusOnChange_ChannelPlateformNum();
		financeChannelManageInfoPage.queryOnChange_ChannelPlateformNum(financeChannelManageInfoBean.getChannelPlateformNum());
		
//		Change_ChannelMerchantNum
		financeChannelManageInfoPage.setFocusOnChange_ChannelMerchantNum();
		financeChannelManageInfoPage.queryOnChange_ChannelMerchantNum(financeChannelManageInfoBean.getChannelMerchantNum());
		
//		Change_ChannelObjectNum
		financeChannelManageInfoPage.setFocusOnChange_ChannelObjectNum();
		financeChannelManageInfoPage.queryOnChange_ChannelObjectNum(financeChannelManageInfoBean.getChannelObjectNum());
		
//		Change_InquireRequestType
		financeChannelManageInfoPage.setFocusOnChange_InquireRequestType();
		financeChannelManageInfoPage.queryOnChange_InquireRequestType(financeChannelManageInfoBean.getInquireRequestType());
		
//		Change_RefundRequestType
		financeChannelManageInfoPage.setFocusOnChange_RefundRequestType();
		financeChannelManageInfoPage.queryOnChange_RefundRequestType(financeChannelManageInfoBean.getRefundRequestType());
		
//		Change_RevocationRequestType
		financeChannelManageInfoPage.setFocusOnChange_RevocationRequestType();
		financeChannelManageInfoPage.queryOnChange_RevocationRequestType(financeChannelManageInfoBean.getRevocationRequestType());
		
//		Change_Change
//		financeChannelManageInfoPage.clickChange_Change();
		
//		Change_Close
		financeChannelManageInfoPage.clickChange_Close();
	}

	private void enableCase(FinanceChannelManageInfoBean financeChannelManageInfoBean) {
		
		financeChannelManageInfoPage.clickUnable();
		financeChannelManageInfoPage.clickDisable_Disable();
		
		wait.waitFor(1000);
		
		financeChannelManageInfoPage.setFocusOnEnableSelect();
		financeChannelManageInfoPage.queryOnEnableSelect("N");
		
		financeChannelManageInfoPage.clickInquire();
		
		wait.waitFor(1000);
		
		financeChannelManageInfoPage.clickSelectionButton(0);
		
		financeChannelManageInfoPage.clickEnable();
		financeChannelManageInfoPage.clickEnable_Enable();
	}

	private void addDeleteCase(FinanceChannelManageInfoBean financeChannelManageInfoBean) {
		
		financeChannelManageInfoPage.clickAdd();
		
//		Add_ChannelCode
		financeChannelManageInfoPage.setFocusOnAdd_ChannelCode();
		financeChannelManageInfoPage.queryOnAdd_ChannelCode(financeChannelManageInfoBean.getChannelCode());
		
//		Add_RequestType
		financeChannelManageInfoPage.setFocusOnAdd_RequestType();
		financeChannelManageInfoPage.queryOnAdd_RequestType(financeChannelManageInfoBean.getRequestType());
		
//		Add_InterfaceType
		financeChannelManageInfoPage.setFocusOnAdd_InterfaceType();
		financeChannelManageInfoPage.queryOnAdd_InterfaceType(financeChannelManageInfoBean.getInterfaceType());
		
//		Add_CallBackSelect
		financeChannelManageInfoPage.setFocusOnAdd_CallBackSelect();
		financeChannelManageInfoPage.queryOnAdd_CallBackSelect(financeChannelManageInfoBean.getCallBackSelect());
		
//		Add_SerialNumberRule
		financeChannelManageInfoPage.setFocusOnAdd_SerialNumberRule();
		financeChannelManageInfoPage.queryOnAdd_SerialNumberRule(financeChannelManageInfoBean.getSerialNumberRule());
		
//		Change_EnableSelect
		financeChannelManageInfoPage.setFocusOnChange_EnableSelect();
		financeChannelManageInfoPage.queryOnChange_EnableSelect(financeChannelManageInfoBean.getEnableSelect());
		
//		Change_ChannelType
		financeChannelManageInfoPage.setFocusOnChange_ChannelType();
		financeChannelManageInfoPage.queryOnChange_ChannelType(financeChannelManageInfoBean.getChannelType());
		
//		Change_AccountCheckType
		financeChannelManageInfoPage.setFocusOnChange_AccountCheckType();
		financeChannelManageInfoPage.queryOnChange_AccountCheckType(financeChannelManageInfoBean.getAccountCheckType());
		
//		Change_CallServeName
		financeChannelManageInfoPage.setFocusOnChange_CallServeName();
		financeChannelManageInfoPage.inputChange_CallServeName(financeChannelManageInfoBean.getCallServeName());
		
//		Change_CallTradeCode
		financeChannelManageInfoPage.setFocusOnChange_CallTradeCode();
		financeChannelManageInfoPage.inputChange_CallTradeCode(financeChannelManageInfoBean.getCallTradeCode());
		
//		Change_ExtensionStatus
		financeChannelManageInfoPage.setFocusOnChange_ExtensionStatus();
		financeChannelManageInfoPage.queryOnChange_ExtensionStatus(financeChannelManageInfoBean.getExtensionStatus());
		
//		Change_ChannelPlateformNum
		financeChannelManageInfoPage.setFocusOnChange_ChannelPlateformNum();
		financeChannelManageInfoPage.queryOnChange_ChannelPlateformNum(financeChannelManageInfoBean.getChannelPlateformNum());
		
//		Change_ChannelMerchantNum
		financeChannelManageInfoPage.setFocusOnChange_ChannelMerchantNum();
		financeChannelManageInfoPage.queryOnChange_ChannelMerchantNum(financeChannelManageInfoBean.getChannelMerchantNum());
		
//		Change_ChannelObjectNum
		financeChannelManageInfoPage.setFocusOnChange_ChannelObjectNum();
		financeChannelManageInfoPage.queryOnChange_ChannelObjectNum(financeChannelManageInfoBean.getChannelObjectNum());
		
//		Change_InquireRequestType
		financeChannelManageInfoPage.setFocusOnChange_InquireRequestType();
		financeChannelManageInfoPage.queryOnChange_InquireRequestType(financeChannelManageInfoBean.getInquireRequestType());
		
//		Change_RefundRequestType
		financeChannelManageInfoPage.setFocusOnChange_RefundRequestType();
		financeChannelManageInfoPage.queryOnChange_RefundRequestType(financeChannelManageInfoBean.getRefundRequestType());
		
//		Change_RevocationRequestType
		financeChannelManageInfoPage.setFocusOnChange_RevocationRequestType();
		financeChannelManageInfoPage.queryOnChange_RevocationRequestType(financeChannelManageInfoBean.getRevocationRequestType());
		
		financeChannelManageInfoPage.clickAdd_Close();
	}

	private void displayCase(FinanceChannelManageInfoBean financeChannelManageInfoBean) {
		financeChannelManageInfoPage.clickCheck();
		wait.waitFor(1000);
		financeChannelManageInfoPage.clickCheck_Close();
	}
	
	
	
}
