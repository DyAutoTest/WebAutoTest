package com.dy.AutoTest.OperationPlatform.TestCases.financechannel;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.dy.AutoTest.OperationPlatform.POJO.FinanceChannelBalanceAccountErrorManageBean;
import com.dy.AutoTest.OperationPlatform.PageObject.financechannel.FinanceChannelBalanceAccountErrorManagePage;
import com.dy.AutoTest.web.api.SuperTest;
import com.dy.AutoTest.web.business.DataBusiness;

public class FinanceChannelBalanceAccountErrorManagePageTest extends SuperTest {
	
	private FinanceChannelBalanceAccountErrorManagePage financeChannelBalanceAccountErrorManagePage;

	private String URL = "";

	@BeforeClass
	public void init() {
		financeChannelBalanceAccountErrorManagePage = new FinanceChannelBalanceAccountErrorManagePage(driver);
		URL = host.toString() + DataBusiness.getData_URL("pop_FinanceChannelBalanceAccountErrorManage");
	}

	@DataProvider(name = "financeChannelBalanceAccountErrorManage")
	protected static Object[][] parametersPool() {
		data.loadDataBeanList("POP_Data_FinanceChannelBalanceAccountErrorManage");
		return data.getDataBeanArray();
	}

	@Test(dataProvider = "financeChannelBalanceAccountErrorManage", description = "运营平台-对账差错管理")
	public void testFinanceChannelBalanceAccountBatchNumQueryPageTest(
			FinanceChannelBalanceAccountErrorManageBean financeChannelBalanceAccountErrorManageBean) {

		financeChannelBalanceAccountErrorManagePage.navigateTo(URL);

		wait.waitFor(1000);
		
		financeChannelBalanceAccountErrorManagePage.inputOnErrorKeys(financeChannelBalanceAccountErrorManageBean.getErrorKeys());
		financeChannelBalanceAccountErrorManagePage.inputOnErrorBatchNum(financeChannelBalanceAccountErrorManageBean.getErrorBatchNum());
		financeChannelBalanceAccountErrorManagePage.inputOnChannel(financeChannelBalanceAccountErrorManageBean.getChannel());
		financeChannelBalanceAccountErrorManagePage.inputOnAccountCheckType(financeChannelBalanceAccountErrorManageBean.getAccountCheckType());
		financeChannelBalanceAccountErrorManagePage.inputOnErrorStatus(financeChannelBalanceAccountErrorManageBean.getErrorStatus());
		financeChannelBalanceAccountErrorManagePage.inputOnErrorBuildDateBegin(financeChannelBalanceAccountErrorManageBean.getErrorBuildDateBegin());
		financeChannelBalanceAccountErrorManagePage.inputOnErrorBuildDateEnd(financeChannelBalanceAccountErrorManageBean.getErrorBuildDateEnd());

		financeChannelBalanceAccountErrorManagePage.clickInquire();

		wait.waitFor(1000);

		financeChannelBalanceAccountErrorManagePage.clickSelectionButton(0);

		financeChannelBalanceAccountErrorManagePage.clickErrorCheck();
		wait.waitFor(1000);
		financeChannelBalanceAccountErrorManagePage.clickCheck_Close();
		
		String caseNo = financeChannelBalanceAccountErrorManageBean.getCaseNo();

		switch (caseNo) {
		case "1":
			mineOwnCase(financeChannelBalanceAccountErrorManageBean);
			break;
		case "2":
			mineNoneCase(financeChannelBalanceAccountErrorManageBean);
			break;
		default:
			break;
		}
	}

	private void mineOwnCase(FinanceChannelBalanceAccountErrorManageBean financeChannelBalanceAccountErrorManageBean) {
		wait.waitFor(1000);
		financeChannelBalanceAccountErrorManagePage.clickReplacementOrder();
		wait.waitFor(1000);
		financeChannelBalanceAccountErrorManagePage.clickCancelOrder();
		wait.waitFor(1000);
		financeChannelBalanceAccountErrorManagePage.clickCancelOder_Close();
		wait.waitFor(1000);
		financeChannelBalanceAccountErrorManagePage.clickErrorCancel();
		wait.waitFor(1000);
		financeChannelBalanceAccountErrorManagePage.clickErrorCancel_Close();
		wait.waitFor(1000);
		financeChannelBalanceAccountErrorManagePage.clickRefundOperation();
		wait.waitFor(1000);
		financeChannelBalanceAccountErrorManagePage.clickRefundCheck();
		wait.waitFor(1000);		
	}

	private void mineNoneCase(
			FinanceChannelBalanceAccountErrorManageBean financeChannelBalanceAccountErrorManageBean) {
		wait.waitFor(1000);
		financeChannelBalanceAccountErrorManagePage.clickReplacementOrder();
		wait.waitFor(1000);
		financeChannelBalanceAccountErrorManagePage.clickCancelOrder();
		wait.waitFor(1000);
		financeChannelBalanceAccountErrorManagePage.clickCancelOder_Close();
		wait.waitFor(1000);
		financeChannelBalanceAccountErrorManagePage.clickErrorCancel();
		wait.waitFor(1000);
		financeChannelBalanceAccountErrorManagePage.clickErrorCancel_Close();
		wait.waitFor(1000);
		financeChannelBalanceAccountErrorManagePage.clickRefundOperation();
		wait.waitFor(1000);
		financeChannelBalanceAccountErrorManagePage.clickRefundOperation_Confirm();
		wait.waitFor(1000);
		financeChannelBalanceAccountErrorManagePage.clickRefundCheck();
		wait.waitFor(1000);
	}
	
}
