package com.dy.AutoTest.OnlineCashier.TestCases.financechannel;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.dy.AutoTest.OnlineCashier.POJO.FinanceChannelBalanceAccountErrorManageBean;
import com.dy.AutoTest.OnlineCashier.PageObject.financechannel.FinanceChannelBalanceAccountErrorManagePage;
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

	@Test(dataProvider = "financeChannelBalanceAccountErrorManage", description = "运营平台-对账批次查询")
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
	}
	
}
