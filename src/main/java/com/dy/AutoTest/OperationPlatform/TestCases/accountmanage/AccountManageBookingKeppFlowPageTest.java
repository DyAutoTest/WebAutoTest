package com.dy.AutoTest.OperationPlatform.TestCases.accountmanage;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.dy.AutoTest.OperationPlatform.POJO.AccountManageBookingKeppFlowBean;
import com.dy.AutoTest.OperationPlatform.PageObject.accountmanage.AccountManageBookingKeppFlowPage;
import com.dy.AutoTest.web.api.SuperTest;
import com.dy.AutoTest.web.business.DataBusiness;

public class AccountManageBookingKeppFlowPageTest extends SuperTest {

	private AccountManageBookingKeppFlowPage accountManageBookingKeppFlowPage;

	private String URL = "";

	@BeforeClass
	public void init() {
		accountManageBookingKeppFlowPage = new AccountManageBookingKeppFlowPage(driver);
		URL = host.toString() + DataBusiness.getData_URL("pop_AccountManageBookingKeppFlow");
	}

	@DataProvider(name = "accountManageBookingKeppFlow")
	protected static Object[][] parametersPool() {
		data.loadDataBeanList("POP_Data_AccountManageBookingKeppFlow");
		return data.getDataBeanArray();
	}

	@Test(dataProvider = "accountManageBookingKeppFlow", description = "运营平台-记账流水查询")
	public void testAccountManageBookingKeppFlow(
			AccountManageBookingKeppFlowBean accountManageBookingKeppFlowBean) {

		accountManageBookingKeppFlowPage.navigateTo(URL);
		
		wait.waitFor(1000);
		accountManageBookingKeppFlowPage.clickAdvance();
		wait.waitFor(1000);
		accountManageBookingKeppFlowPage.clickReset();
		
		wait.waitFor(1000);
		accountManageBookingKeppFlowPage.setBusinessSerialNO(accountManageBookingKeppFlowBean.getBusinessSerialNO());
		accountManageBookingKeppFlowPage.setJournalAccountNO(accountManageBookingKeppFlowBean.getJournalAccountNO());
		accountManageBookingKeppFlowPage.selectStatusOfKeepingAccount(accountManageBookingKeppFlowBean.getStatusOfKeepingAccount());
		accountManageBookingKeppFlowPage.selectTradeType(accountManageBookingKeppFlowBean.getTradeType());
		accountManageBookingKeppFlowPage.selectBusinessType(accountManageBookingKeppFlowBean.getBusinessType());
		accountManageBookingKeppFlowPage.selectAccountType(accountManageBookingKeppFlowBean.getAccountType());
		accountManageBookingKeppFlowPage.setTradeDateBegin(accountManageBookingKeppFlowBean.getTradeDateBegin());
		accountManageBookingKeppFlowPage.setTradeDateEnd(accountManageBookingKeppFlowBean.getTradeDateEnd());
		
		wait.waitFor(1000);
		accountManageBookingKeppFlowPage.clickQuery();
		
	}

}
