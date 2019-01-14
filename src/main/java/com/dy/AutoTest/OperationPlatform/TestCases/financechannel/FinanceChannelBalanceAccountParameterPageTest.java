package com.dy.AutoTest.OperationPlatform.TestCases.financechannel;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.dy.AutoTest.OperationPlatform.POJO.FinanceChannelBalanceAccountParameterBean;
import com.dy.AutoTest.OperationPlatform.PageObject.financechannel.FinanceChannelBalanceAccountParameterPage;
import com.dy.AutoTest.web.api.SuperTest;
import com.dy.AutoTest.web.business.DataBusiness;

public class FinanceChannelBalanceAccountParameterPageTest extends SuperTest {

	private FinanceChannelBalanceAccountParameterPage financeChannelBalanceAccountParameterPage;

	private String URL = "";

	@BeforeClass
	public void init() {
		financeChannelBalanceAccountParameterPage = new FinanceChannelBalanceAccountParameterPage(driver);
		URL = host.toString() + DataBusiness.getData_URL("pop_FinanceChannelBalanceAccountParameter");
	}

	@DataProvider(name = "financeChannelBalanceAccountParameter")
	protected static Object[][] parametersPool() {
		data.loadDataBeanList("POP_Data_FinanceChannelBalanceAccountParameter");
		return data.getDataBeanArray();
	}

	@Test(dataProvider = "financeChannelBalanceAccountParameter", description = "运营平台-对账参数维护")
	public void testFinanceChannelBalanceAccountParameterPageTest(
			FinanceChannelBalanceAccountParameterBean financeChannelBalanceAccountParameterBean) {

		financeChannelBalanceAccountParameterPage.navigateTo(URL);
		
		financeChannelBalanceAccountParameterPage.setFocusOnChannelName();
		financeChannelBalanceAccountParameterPage.inputOnChannelName(financeChannelBalanceAccountParameterBean.getChannelName());
		
		financeChannelBalanceAccountParameterPage.setFocusOnAccountCheckType();
		financeChannelBalanceAccountParameterPage.inputOnAccountCheckType(financeChannelBalanceAccountParameterBean.getAccountCheckType());
		
		financeChannelBalanceAccountParameterPage.setFocusOnChannelPlateformNum();
		financeChannelBalanceAccountParameterPage.inputOnChannelPlateformNum(financeChannelBalanceAccountParameterBean.getChannelPlateformNum());
		
		financeChannelBalanceAccountParameterPage.setFocusOnBatchAccountCheckSign();
		financeChannelBalanceAccountParameterPage.inputOnBatchAccountCheckSign(financeChannelBalanceAccountParameterBean.getBatchAccountCheckSign());
		
		financeChannelBalanceAccountParameterPage.clickInquire();

		wait.waitFor(1000);

		financeChannelBalanceAccountParameterPage.clickSelectionButton(0);

		String caseNo = financeChannelBalanceAccountParameterBean.getCaseNo();

		switch (caseNo) {
		case "1":
			modifyCase(financeChannelBalanceAccountParameterBean);
			break;
		case "2":
			enableCase(financeChannelBalanceAccountParameterBean);
			break;
		case "3":
			addDeleteCase(financeChannelBalanceAccountParameterBean);
			break;
		case "4":
			displayCase(financeChannelBalanceAccountParameterBean);
			break;
		default:
			break;
		}
	}

	private void modifyCase(FinanceChannelBalanceAccountParameterBean financeChannelBalanceAccountParameterBean) {
		
		financeChannelBalanceAccountParameterPage.clickChange();
		
		wait.waitFor(1000);
		
		financeChannelBalanceAccountParameterPage.setFocusOnChange_EnableFlag();
		financeChannelBalanceAccountParameterPage.inputOnChange_EnableFlag(financeChannelBalanceAccountParameterBean.getEnableFlag());

		financeChannelBalanceAccountParameterPage.setFocusOnChange_AccountCheckFlag();
		financeChannelBalanceAccountParameterPage.inputOnChange_AccountCheckFlag(financeChannelBalanceAccountParameterBean.getAccoutCheckFlag());
		
		financeChannelBalanceAccountParameterPage.setFocusOnChange_BatchAccountCheckSign();
		financeChannelBalanceAccountParameterPage.inputOnChange_BatchAccountCheckSign(financeChannelBalanceAccountParameterBean.getBatchAccountCheckSign());
		
		financeChannelBalanceAccountParameterPage.setFocusOnChange_ChannelPlateformNum();
		financeChannelBalanceAccountParameterPage.inputOnChange_ChannelPlateformNum(financeChannelBalanceAccountParameterBean.getChannelPlateformNum());
		
		financeChannelBalanceAccountParameterPage.setFocusOnChange_StorageEnteringService();
		financeChannelBalanceAccountParameterPage.inputOnChange_StorageEnteringService(financeChannelBalanceAccountParameterBean.getStorageEnteringService());
		
		financeChannelBalanceAccountParameterPage.setFocusOnChange_StorageEnteringTrade();
		financeChannelBalanceAccountParameterPage.inputOnChange_StorageEnteringTrade(financeChannelBalanceAccountParameterBean.getStorageEnteringTrade());
		
		financeChannelBalanceAccountParameterPage.setFocusOnChange_AccountCheckService();
		financeChannelBalanceAccountParameterPage.inputOnChange_AccountCheckService(financeChannelBalanceAccountParameterBean.getAccountCheckService());
		
		financeChannelBalanceAccountParameterPage.setFocusOnChange_AccountCheckTrade();
		financeChannelBalanceAccountParameterPage.inputOnChange_AccountCheckTrade(financeChannelBalanceAccountParameterBean.getAccountCheckTrade());
		
		financeChannelBalanceAccountParameterPage.setFocusOnChange_TurnErrorDays();
		financeChannelBalanceAccountParameterPage.inputOnChange_TurnErrorDays(financeChannelBalanceAccountParameterBean.getTurnErrorDays());
		
		financeChannelBalanceAccountParameterPage.setFocusOnChange_AccountCheckBeginTime();
		financeChannelBalanceAccountParameterPage.inputOnChange_AccountCheckBeginTime(financeChannelBalanceAccountParameterBean.getAccountCheckBeginTime());
		
		financeChannelBalanceAccountParameterPage.setFocusOnChange_AccountCheckEndTime();
		financeChannelBalanceAccountParameterPage.inputOnChange_AccountCheckEndTime(financeChannelBalanceAccountParameterBean.getAccountCheckEndTime());
		
		financeChannelBalanceAccountParameterPage.setFocusOnChange_ChannelPlateformNum();
		
		wait.waitFor(1000);
		
		financeChannelBalanceAccountParameterPage.clickChange_Close();
	}

	private void enableCase(FinanceChannelBalanceAccountParameterBean financeChannelBalanceAccountParameterBean) {
		financeChannelBalanceAccountParameterPage.clickEnable();
		wait.waitFor(1000);
		financeChannelBalanceAccountParameterPage.clickEnable_Confirm();
		wait.waitFor(1000);
		financeChannelBalanceAccountParameterPage.clickInquire();
		wait.waitFor(1000);
		financeChannelBalanceAccountParameterPage.clickSelectionButton(0);

		financeChannelBalanceAccountParameterPage.clickDisable();
		wait.waitFor(1000);
		financeChannelBalanceAccountParameterPage.clickDisable_Confirm();
	}

	private void addDeleteCase(FinanceChannelBalanceAccountParameterBean financeChannelBalanceAccountParameterBean) {
		financeChannelBalanceAccountParameterPage.clickAdd();
		
		wait.waitFor(1000);
		
		financeChannelBalanceAccountParameterPage.setFocusOnAdd_ChannelName();
		financeChannelBalanceAccountParameterPage.inputOnAdd_ChannelName(financeChannelBalanceAccountParameterBean.getChannelName());
		
		financeChannelBalanceAccountParameterPage.setFocusOnAdd_AccountCheckType();
		financeChannelBalanceAccountParameterPage.inputOnAdd_AccountCheckType(financeChannelBalanceAccountParameterBean.getAccountCheckType());
		
		financeChannelBalanceAccountParameterPage.setFocusOnAdd_EnableFlag();
		financeChannelBalanceAccountParameterPage.inputOnAdd_EnableFlag(financeChannelBalanceAccountParameterBean.getEnableFlag());

		financeChannelBalanceAccountParameterPage.setFocusOnAdd_AccountCheckFlag();
		financeChannelBalanceAccountParameterPage.inputOnAdd_AccountCheckFlag(financeChannelBalanceAccountParameterBean.getAccoutCheckFlag());
		
		financeChannelBalanceAccountParameterPage.setFocusOnAdd_BatchAccountCheckSign();
		financeChannelBalanceAccountParameterPage.inputOnAdd_BatchAccountCheckSign(financeChannelBalanceAccountParameterBean.getBatchAccountCheckSign());
		
		financeChannelBalanceAccountParameterPage.setFocusOnAdd_ChannelPlateformNum();
		financeChannelBalanceAccountParameterPage.inputOnAdd_ChannelPlateformNum(financeChannelBalanceAccountParameterBean.getChannelPlateformNum());
		
		financeChannelBalanceAccountParameterPage.setFocusOnAdd_StorageEnteringService();
		financeChannelBalanceAccountParameterPage.inputOnAdd_StorageEnteringService(financeChannelBalanceAccountParameterBean.getStorageEnteringService());
		
		financeChannelBalanceAccountParameterPage.setFocusOnAdd_StorageEnteringTrade();
		financeChannelBalanceAccountParameterPage.inputOnAdd_StorageEnteringTrade(financeChannelBalanceAccountParameterBean.getStorageEnteringTrade());
		
		financeChannelBalanceAccountParameterPage.setFocusOnAdd_AccountCheckService();
		financeChannelBalanceAccountParameterPage.inputOnAdd_AccountCheckService(financeChannelBalanceAccountParameterBean.getAccountCheckService());
		
		financeChannelBalanceAccountParameterPage.setFocusOnAdd_AccountCheckTrade();
		financeChannelBalanceAccountParameterPage.inputOnAdd_AccountCheckTrade(financeChannelBalanceAccountParameterBean.getAccountCheckTrade());
		
		financeChannelBalanceAccountParameterPage.setFocusOnAdd_TurnErrorDays();
		financeChannelBalanceAccountParameterPage.inputOnAdd_TurnErrorDays(financeChannelBalanceAccountParameterBean.getTurnErrorDays());
		
		financeChannelBalanceAccountParameterPage.setFocusOnAdd_AccountCheckBeginTime();
		financeChannelBalanceAccountParameterPage.inputOnAdd_AccountCheckBeginTime(financeChannelBalanceAccountParameterBean.getAccountCheckBeginTime());
		
		financeChannelBalanceAccountParameterPage.setFocusOnAdd_AccountCheckEndTime();
		financeChannelBalanceAccountParameterPage.inputOnAdd_AccountCheckEndTime(financeChannelBalanceAccountParameterBean.getAccountCheckEndTime());
		
		financeChannelBalanceAccountParameterPage.setFocusOnAdd_ChannelPlateformNum();
		
		wait.waitFor(1000);
		
		financeChannelBalanceAccountParameterPage.clickAdd_Close();
	}
	
	private void displayCase(FinanceChannelBalanceAccountParameterBean financeChannelBalanceAccountParameterBean) {
		financeChannelBalanceAccountParameterPage.clickCheck();
		wait.waitFor(1000);
		financeChannelBalanceAccountParameterPage.clickCheck_Close();
	}

}
