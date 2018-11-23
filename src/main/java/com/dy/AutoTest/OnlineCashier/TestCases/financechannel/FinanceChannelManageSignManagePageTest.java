package com.dy.AutoTest.OnlineCashier.TestCases.financechannel;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.dy.AutoTest.OnlineCashier.POJO.FinanceChannelManageSignManageBean;
import com.dy.AutoTest.OnlineCashier.PageObject.financechannel.FinanceChannelManageSignManagePage;
import com.dy.AutoTest.web.api.SuperTest;
import com.dy.AutoTest.web.business.DataBusiness;

public class FinanceChannelManageSignManagePageTest extends SuperTest {
	
	private FinanceChannelManageSignManagePage financeChannelManageSignManagePage;

	private String URL = "";

	@BeforeClass
	public void init() {
		financeChannelManageSignManagePage = new FinanceChannelManageSignManagePage(driver);
		URL = host.toString() + DataBusiness.getData_URL("pop_FinanceChannelManageSignManage");
	}

	@DataProvider(name = "financeChannelManageSignManage")
	protected static Object[][] parametersPool() {
		data.loadDataBeanList("POP_Data_FinanceChannelManageSignManage");
		return data.getDataBeanArray();
	}

	@Test(dataProvider = "financeChannelManageSignManage", description = "运营平台-通道签约管理")
	public void testFinanceChannelManageSignManage(FinanceChannelManageSignManageBean financeChannelManageSignManageBean) {

		financeChannelManageSignManagePage.navigateTo(URL);

		wait.waitFor(1000);
		financeChannelManageSignManagePage.clickReset();
		
		financeChannelManageSignManagePage.clickAdvanceButton();
		
		financeChannelManageSignManagePage.setFocusOnName();
		financeChannelManageSignManagePage.inputOnName(financeChannelManageSignManageBean.getName());
		
		financeChannelManageSignManagePage.setFocusOnIDNum();
		financeChannelManageSignManagePage.inputOnIDNum(financeChannelManageSignManageBean.getIDNum());
		
		financeChannelManageSignManagePage.setFocusOnBankCardID();
		financeChannelManageSignManagePage.inputOnBankCardID(financeChannelManageSignManageBean.getBankCardID());
		
		wait.waitFor(500);
		financeChannelManageSignManagePage.setFocusOnSigningDateBegin();
		wait.waitFor(500);
		financeChannelManageSignManagePage.selectAllSigningDateBegin();
		wait.waitFor(500);
		financeChannelManageSignManagePage.inputOnSigningDateBegin(financeChannelManageSignManageBean.getSigningDateBegin());
		
		wait.waitFor(500);
		financeChannelManageSignManagePage.setFocusOnSigningDateEnd();
		wait.waitFor(500);
		financeChannelManageSignManagePage.selectAllSigningDateEnd();
		wait.waitFor(500);
		financeChannelManageSignManagePage.inputOnSigningDateEnd(financeChannelManageSignManageBean.getSigningDateEnd());
		
		financeChannelManageSignManagePage.setFocusOnChannel();
		financeChannelManageSignManagePage.inputOnChannel(financeChannelManageSignManageBean.getChannel());
		
		financeChannelManageSignManagePage.setFocusOnSendingCardBank();
		financeChannelManageSignManagePage.inputOnSendingCardBank(financeChannelManageSignManageBean.getSendingCardBank());
		
		financeChannelManageSignManagePage.setFocusOnSigningStatus();
		financeChannelManageSignManagePage.inputOnSigningStatus(financeChannelManageSignManageBean.getSigningStatus());
		
		financeChannelManageSignManagePage.setFocusOnPhoneNum();
		financeChannelManageSignManagePage.inputOnPhoneNum(financeChannelManageSignManageBean.getPhoneNum());
		
		financeChannelManageSignManagePage.setFocusOnPlatformExpressProtocol();
		financeChannelManageSignManagePage.inputOnPlatformExpressProtocol(financeChannelManageSignManageBean.getPlatformExpressProtocol());
		
		financeChannelManageSignManagePage.setFocusOnChannelReturnProtocolCode();
		financeChannelManageSignManagePage.inputOnChannelReturnProtocolCode(financeChannelManageSignManageBean.getChannelReturnProtocolCode());
		
		financeChannelManageSignManagePage.clickAdvanceButton();
		
		wait.waitFor(1000);
		
		financeChannelManageSignManagePage.clickInquire();
		
		wait.waitFor(1000);

		financeChannelManageSignManagePage.clickSelectionButton(0);
		
		financeChannelManageSignManagePage.clickCheck();
		wait.waitFor(1000);
		financeChannelManageSignManagePage.clickCheck_Close();
	}
	
}
