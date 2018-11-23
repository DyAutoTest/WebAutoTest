package com.dy.AutoTest.OnlineCashier.TestCases.cooperatingagent.agentinfo;

import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.dy.AutoTest.OnlineCashier.POJO.CooperatingPaymentChannelBean;
import com.dy.AutoTest.OnlineCashier.PageObject.cooperatingagent.agentinfo.CooperatingPaymentChannelPage;
import com.dy.AutoTest.web.api.SuperTest;
import com.dy.AutoTest.web.business.DataBusiness;

public class CooperatingPaymentChannelPageTest extends SuperTest {

	private CooperatingPaymentChannelPage cooperatingPaymentChannelPage;

	private String URL = "";

	@BeforeClass
	public void init() {
		cooperatingPaymentChannelPage = new CooperatingPaymentChannelPage(driver);
		URL = host.toString() + DataBusiness.getData_URL("pop_CooperatingPaymentChannel");
	}

	@DataProvider(name = "cooperatingAgencyInfo")
	protected static Object[][] parametersPool() {
		data.loadDataBeanList("POP_Data_CooperatingPaymentChannel");
		return data.getDataBeanArray();
	}

	@Test(dataProvider = "cooperatingAgencyInfo", description = "运营平台-资金通道管理")
	public void testCooperatingPaymentChannel(CooperatingPaymentChannelBean cooperatingPaymentChannelBean) {

		cooperatingPaymentChannelPage.navigateTo(URL);

		cooperatingPaymentChannelPage.setFocusOnSearch();
		cooperatingPaymentChannelPage.queryOnSearch(cooperatingPaymentChannelBean.getSearch());

		wait.waitFor(1000);

		cooperatingPaymentChannelPage.selectFirstRecord();

		String caseNo = cooperatingPaymentChannelBean.getCaseNo();

		switch (caseNo) {
		case "1":
			modifyCase(cooperatingPaymentChannelBean);
			break;
		case "2":
			enableCase(cooperatingPaymentChannelBean);
			break;
		default:
			break;
		}

	}

	private void modifyCase(CooperatingPaymentChannelBean cooperatingPaymentChannelBean) {
		cooperatingPaymentChannelPage.clickModifyButton();

		cooperatingPaymentChannelPage.setFocusOnBankCode();
		cooperatingPaymentChannelPage.inputBankCode(cooperatingPaymentChannelBean.getUnionBankCode());

		cooperatingPaymentChannelPage.setFocusOnCashAccount();
		cooperatingPaymentChannelPage.inputCashAccount(cooperatingPaymentChannelBean.getCashAccount());

		cooperatingPaymentChannelPage.setFocusOnSettleAccountDirect();
		cooperatingPaymentChannelPage.inputSettleAccountDirect(cooperatingPaymentChannelBean.getSettleAccountDirect());
		
		cooperatingPaymentChannelPage.setFocusOnSettleBankCode();
		cooperatingPaymentChannelPage.inputSettleBankCode(cooperatingPaymentChannelBean.getSettleBankCode());

		cooperatingPaymentChannelPage.setFocusOnSettleAccountBankName();
		cooperatingPaymentChannelPage.inputSettleAccountBankName(cooperatingPaymentChannelBean.getSettleAccountBankName());
		
		cooperatingPaymentChannelPage.setFocusOnSettleAccountName();
		cooperatingPaymentChannelPage.inputSettleAccountName(cooperatingPaymentChannelBean.getSettleAccountName());

		cooperatingPaymentChannelPage.setFocusOnSettleAccount();
		cooperatingPaymentChannelPage.inputSettleAccount(cooperatingPaymentChannelBean.getSettleAccount());

		cooperatingPaymentChannelPage.setFocusOnMerchantNumber();
		cooperatingPaymentChannelPage.inputMerchantNumber(cooperatingPaymentChannelBean.getMerchantNumber());

		cooperatingPaymentChannelPage.setFocusOnContactName();
		cooperatingPaymentChannelPage.inputContactName(cooperatingPaymentChannelBean.getContactName());

		cooperatingPaymentChannelPage.setFocusOnCustomerManager();
		cooperatingPaymentChannelPage.inputCustomerManager(cooperatingPaymentChannelBean.getCustomerManager());

		cooperatingPaymentChannelPage.submitModify();

		wait.waitFor(1000);

		cooperatingPaymentChannelPage.selectFirstRecord();
		cooperatingPaymentChannelPage.clickModifyButton();

		cooperatingPaymentChannelPage.setFocusOnBankCode();
		cooperatingPaymentChannelPage.inputBankCode("");

		cooperatingPaymentChannelPage.setFocusOnCashAccount();
		cooperatingPaymentChannelPage.inputCashAccount("");

		cooperatingPaymentChannelPage.setFocusOnSettleBankCode();
		cooperatingPaymentChannelPage.inputSettleBankCode("");

		cooperatingPaymentChannelPage.setFocusOnSettleAccountBankName();
		cooperatingPaymentChannelPage.inputSettleAccountBankName("");
		
		cooperatingPaymentChannelPage.setFocusOnSettleAccountName();
		cooperatingPaymentChannelPage.inputSettleAccountName("");

		cooperatingPaymentChannelPage.setFocusOnSettleAccount();
		cooperatingPaymentChannelPage.inputSettleAccount("");

		cooperatingPaymentChannelPage.setFocusOnMerchantNumber();
		cooperatingPaymentChannelPage.inputMerchantNumber("");

		cooperatingPaymentChannelPage.setFocusOnContactName();
		cooperatingPaymentChannelPage.inputContactName("");

		cooperatingPaymentChannelPage.setFocusOnCustomerManager();
		cooperatingPaymentChannelPage.inputCustomerManager("");

		cooperatingPaymentChannelPage.submitModify();
		
		Reporter.log("资金通道管理修改成功！合作机构编码：" + cooperatingPaymentChannelBean.getSearch());
	}
	
	private void enableCase(CooperatingPaymentChannelBean cooperatingPaymentChannelBean) {
		cooperatingPaymentChannelPage.clickDetailsButton();
		cooperatingPaymentChannelPage.clickAddCloseButton();
		
		cooperatingPaymentChannelPage.clickDisableButton();
		cooperatingPaymentChannelPage.DisableConfirm();
		
		wait.waitFor(1000);

		cooperatingPaymentChannelPage.selectFirstRecord();
		
		cooperatingPaymentChannelPage.clickEnableButton();
		cooperatingPaymentChannelPage.EnableConfirm();
		
		Reporter.log("资金通道管理开启/关闭成功！合作机构编码：" + cooperatingPaymentChannelBean.getSearch());
	}

}
