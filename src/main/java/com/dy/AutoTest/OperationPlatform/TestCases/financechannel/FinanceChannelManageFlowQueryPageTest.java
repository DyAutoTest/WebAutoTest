package com.dy.AutoTest.OperationPlatform.TestCases.financechannel;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.dy.AutoTest.OperationPlatform.POJO.FinanceChannelManageFlowQueryBean;
import com.dy.AutoTest.OperationPlatform.PageObject.financechannel.FinanceChannelManageFlowQueryPage;
import com.dy.AutoTest.web.api.SuperTest;
import com.dy.AutoTest.web.business.DataBusiness;

public class FinanceChannelManageFlowQueryPageTest extends SuperTest {

	private FinanceChannelManageFlowQueryPage financeChannelManageFlowQueryPage;

	private String URL = "";

	@BeforeClass
	public void init() {
		financeChannelManageFlowQueryPage = new FinanceChannelManageFlowQueryPage(driver);
		URL = host.toString() + DataBusiness.getData_URL("pop_FinanceChannelManageFlowQuery");
	}

	@DataProvider(name = "financeChannelManageFlowQuery")
	protected static Object[][] parametersPool() {
		data.loadDataBeanList("POP_Data_FinanceChannelManageFlowQuery");
		return data.getDataBeanArray();
	}

	@Test(dataProvider = "financeChannelManageFlowQuery", description = "运营平台-通道流水查询")
	public void testFinanceChannelManageFlowQuery(FinanceChannelManageFlowQueryBean financeChannelManageFlowQueryBean) {

		financeChannelManageFlowQueryPage.navigateTo(URL);

		wait.waitFor(1000);
		financeChannelManageFlowQueryPage.clickReset();
		
		financeChannelManageFlowQueryPage.clickAdvanceButton();

		financeChannelManageFlowQueryPage.setFocusOnRequestSerialNumber();
		financeChannelManageFlowQueryPage
				.inputOnRequestSerialNumber(financeChannelManageFlowQueryBean.getRequestSerialNumber());

		financeChannelManageFlowQueryPage.setFocusOnTradeStatus();
		financeChannelManageFlowQueryPage.inputOnTradeStatus(financeChannelManageFlowQueryBean.getTradeStatus());

		financeChannelManageFlowQueryPage.setFocusOnAccountDateBegin();
		financeChannelManageFlowQueryPage
				.inputOnAccountDateBegin(financeChannelManageFlowQueryBean.getAccountDateBegin());

		wait.waitFor(500);
		financeChannelManageFlowQueryPage.setFocusOnAccountDateEnd();
		financeChannelManageFlowQueryPage.inputOnAccountDateEnd(financeChannelManageFlowQueryBean.getAccountDateEnd());

		wait.waitFor(500);
		financeChannelManageFlowQueryPage.setFocusOnRequestDateBegin();
		financeChannelManageFlowQueryPage
				.inputOnRequestDateBegin(financeChannelManageFlowQueryBean.getRequestDateBegin());

		wait.waitFor(500);
		financeChannelManageFlowQueryPage.setFocusOnRequestDateEnd();
		financeChannelManageFlowQueryPage.inputOnRequestDateEnd(financeChannelManageFlowQueryBean.getRequestDateEnd());

		wait.waitFor(500);
		financeChannelManageFlowQueryPage.setFocusOnInterfaceType();
		financeChannelManageFlowQueryPage.inputOnInterfaceType(financeChannelManageFlowQueryBean.getInterfaceType());

		financeChannelManageFlowQueryPage.setFocusOnAccountCheckBatchNum();
		financeChannelManageFlowQueryPage
				.inputOnAccountCheckBatchNum(financeChannelManageFlowQueryBean.getAccountCheckBatchNum());

		financeChannelManageFlowQueryPage.setFocusOnInternalOrderNum();
		financeChannelManageFlowQueryPage
				.inputOnInternalOrderNum(financeChannelManageFlowQueryBean.getInternalOrderNum());

		financeChannelManageFlowQueryPage.setFocusOnMerchantNum();
		financeChannelManageFlowQueryPage.inputOnMerchantNum(financeChannelManageFlowQueryBean.getMerchantNum());

		financeChannelManageFlowQueryPage.setFocusOnChannel();
		financeChannelManageFlowQueryPage.inputOnChannel(financeChannelManageFlowQueryBean.getChannel());

		financeChannelManageFlowQueryPage.setFocusOnAccountCheckStatus();
		financeChannelManageFlowQueryPage
				.inputOnAccountCheckStatus(financeChannelManageFlowQueryBean.getAccountCheckStatus());

		financeChannelManageFlowQueryPage.setFocusOnChannelOrderNum();
		financeChannelManageFlowQueryPage
				.inputOnChannelOrderNum(financeChannelManageFlowQueryBean.getChannelOrderNum());

		financeChannelManageFlowQueryPage.clickInquire();

		wait.waitFor(500);
		financeChannelManageFlowQueryPage.clickAdvanceButton();
		
		wait.waitFor(1000);

		financeChannelManageFlowQueryPage.clickSelectionButton(0);

		String caseNo = financeChannelManageFlowQueryBean.getCaseNo();

		switch (caseNo) {
		case "1":
			displayCase(financeChannelManageFlowQueryBean);
			break;
		case "2":
			exportExcelCase(financeChannelManageFlowQueryBean);
			break;
		default:
			break;
		}
	}

	private void displayCase(FinanceChannelManageFlowQueryBean financeChannelManageFlowQueryBean) {
		financeChannelManageFlowQueryPage.clickCheck();
		wait.waitFor(1000);
		financeChannelManageFlowQueryPage.clickCheck_RequestInform();
		wait.waitFor(500);
		financeChannelManageFlowQueryPage.clickCheck_BusinessInform();
		wait.waitFor(500);
		financeChannelManageFlowQueryPage.clickCheck_ChannelInform();
		wait.waitFor(500);
		financeChannelManageFlowQueryPage.clickCheck_AccountCheckInform();
		wait.waitFor(500);
		financeChannelManageFlowQueryPage.clickCheck_OtherInform();
		wait.waitFor(500);
		financeChannelManageFlowQueryPage.clickCheck_Close();
	}

	private void exportExcelCase(FinanceChannelManageFlowQueryBean financeChannelManageFlowQueryBean) {
		financeChannelManageFlowQueryPage.clickExcel();
		wait.waitFor(500);
		financeChannelManageFlowQueryPage.clickExcel_Close();
	}

}
