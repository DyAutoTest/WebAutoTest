package com.dy.AutoTest.OnlineCashier.TestCases.financechannel;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.dy.AutoTest.OnlineCashier.POJO.FinanceChannelBalanceAccountBatchNumQueryBean;
import com.dy.AutoTest.OnlineCashier.PageObject.financechannel.FinanceChannelBalanceAccountBatchNumQueryPage;
import com.dy.AutoTest.web.api.SuperTest;
import com.dy.AutoTest.web.business.DataBusiness;

public class FinanceChannelBalanceAccountBatchNumQueryPageTest extends SuperTest {

	private FinanceChannelBalanceAccountBatchNumQueryPage financeChannelBalanceAccountBatchNumQueryPage;

	private String URL = "";

	@BeforeClass
	public void init() {
		financeChannelBalanceAccountBatchNumQueryPage = new FinanceChannelBalanceAccountBatchNumQueryPage(driver);
		URL = host.toString() + DataBusiness.getData_URL("pop_FinanceChannelBalanceAccountBatchNumQuery");
	}

	@DataProvider(name = "financeChannelBalanceAccountBatchNumQuery")
	protected static Object[][] parametersPool() {
		data.loadDataBeanList("POP_Data_FinanceChannelBalanceAccountBatchNumQuery");
		return data.getDataBeanArray();
	}

	@Test(dataProvider = "financeChannelBalanceAccountBatchNumQuery", description = "运营平台-对账批次查询")
	public void testFinanceChannelBalanceAccountBatchNumQueryPageTest(
			FinanceChannelBalanceAccountBatchNumQueryBean financeChannelBalanceAccountBatchNumQueryBean) {

		financeChannelBalanceAccountBatchNumQueryPage.navigateTo(URL);

		wait.waitFor(1000);
		financeChannelBalanceAccountBatchNumQueryPage.clickAdvance();
		wait.waitFor(1000);
		
		financeChannelBalanceAccountBatchNumQueryPage
				.inputOnChannel(financeChannelBalanceAccountBatchNumQueryBean.getChannel());
		financeChannelBalanceAccountBatchNumQueryPage
				.inputOnAccountCheckBatchNum(financeChannelBalanceAccountBatchNumQueryBean.getAccountCheckBatchNum());
		financeChannelBalanceAccountBatchNumQueryPage
				.inputOnAccountCheckType(financeChannelBalanceAccountBatchNumQueryBean.getAccountCheckType());
		financeChannelBalanceAccountBatchNumQueryPage
				.inputOnAccountCheckFileDate(financeChannelBalanceAccountBatchNumQueryBean.getAccountCheckFileDate());
		financeChannelBalanceAccountBatchNumQueryPage
				.inputOnChannelPlateform(financeChannelBalanceAccountBatchNumQueryBean.getChannelPlateform());
		financeChannelBalanceAccountBatchNumQueryPage
				.inputOnBatchAccountSign(financeChannelBalanceAccountBatchNumQueryBean.getBatchAccountSign());

		financeChannelBalanceAccountBatchNumQueryPage.clickInquire();

		wait.waitFor(1000);

		financeChannelBalanceAccountBatchNumQueryPage.clickSelectionButton(0);

		financeChannelBalanceAccountBatchNumQueryPage.clickCheck();
		wait.waitFor(1000);
		financeChannelBalanceAccountBatchNumQueryPage.clickCheck_Close();
		wait.waitFor(1000);
		financeChannelBalanceAccountBatchNumQueryPage.clickBalanceAccount();
		wait.waitFor(1000);
	}

}
