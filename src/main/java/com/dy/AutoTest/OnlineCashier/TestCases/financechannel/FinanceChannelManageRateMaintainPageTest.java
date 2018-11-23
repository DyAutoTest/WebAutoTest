package com.dy.AutoTest.OnlineCashier.TestCases.financechannel;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.dy.AutoTest.OnlineCashier.POJO.FinanceChannelManageRateMaintainBean;
import com.dy.AutoTest.OnlineCashier.PageObject.financechannel.FinanceChannelManageRateMaintainPage;
import com.dy.AutoTest.web.api.SuperTest;
import com.dy.AutoTest.web.business.DataBusiness;

public class FinanceChannelManageRateMaintainPageTest extends SuperTest {

	private FinanceChannelManageRateMaintainPage financeChannelManageRateMaintainPage;

	private String URL = "";

	@BeforeClass
	public void init() {
		financeChannelManageRateMaintainPage = new FinanceChannelManageRateMaintainPage(driver);
		URL = host.toString() + DataBusiness.getData_URL("pop_FinanceChannelManageRateMaintain");
	}

	@DataProvider(name = "financeChannelManageRateMaintain")
	protected static Object[][] parametersPool() {
		data.loadDataBeanList("POP_Data_FinanceChannelManageRateMaintain");
		return data.getDataBeanArray();
	}

	@Test(dataProvider = "financeChannelManageRateMaintain", description = "运营平台-通道费率维护")
	public void testFinanceChannelManageRateMaintain(
			FinanceChannelManageRateMaintainBean financeChannelManageRateMaintainBean) {

		financeChannelManageRateMaintainPage.navigateTo(URL);

		wait.waitFor(1000);
		financeChannelManageRateMaintainPage.clickReset();

		financeChannelManageRateMaintainPage.setFocusOnChannelCode();
		financeChannelManageRateMaintainPage.inputOnChannelCode(financeChannelManageRateMaintainBean.getChannelCode());
		
		financeChannelManageRateMaintainPage.setFocusOnProductType();
		financeChannelManageRateMaintainPage.inputOnProductType(financeChannelManageRateMaintainBean.getProductType());
		
		financeChannelManageRateMaintainPage.clickInquire();

		wait.waitFor(1000);

		financeChannelManageRateMaintainPage.clickSelectionButton(0);

		String caseNo = financeChannelManageRateMaintainBean.getCaseNo();

		switch (caseNo) {
		case "1":
			addCase(financeChannelManageRateMaintainBean);
			break;
		case "2":
			modifyCase(financeChannelManageRateMaintainBean);
			break;
		case "3":
			displayCase(financeChannelManageRateMaintainBean);
			break;
		default:
			break;
		}

	}

	private void addCase(FinanceChannelManageRateMaintainBean financeChannelManageRateMaintainBean) {
		financeChannelManageRateMaintainPage.clickChannelRateTypeIn();
		
		wait.waitFor(1000);
		financeChannelManageRateMaintainPage.setFocusOnTypeIn_ChannelCode();
		financeChannelManageRateMaintainPage.inputOnTypeIn_ChannelCode(financeChannelManageRateMaintainBean.getChannelCode());
		
		financeChannelManageRateMaintainPage.setFocusOnTypeIn_ProductType();
		financeChannelManageRateMaintainPage.inputOnTypeIn_ProductType(financeChannelManageRateMaintainBean.getProductType());
		
		financeChannelManageRateMaintainPage.setFocusOnTypeIn_RateType();
		financeChannelManageRateMaintainPage.inputOnTypeIn_RateType(financeChannelManageRateMaintainBean.getRateType());
		
		financeChannelManageRateMaintainPage.clickTypeIn_RateCodeSearch();
		
		financeChannelManageRateMaintainPage.setFocusOnTypeIn_RateCodeSearch_Input();
		financeChannelManageRateMaintainPage.inputOnTypeIn_RateCodeSearch_Input(financeChannelManageRateMaintainBean.getRateCodeSearch());
		
		financeChannelManageRateMaintainPage.clickTypeIn_RateCodeSearch_Search();
		wait.waitFor(1000);
		financeChannelManageRateMaintainPage.clickTypeIn_RateCodeSearch_Search();
		
		wait.waitFor(1000);
		financeChannelManageRateMaintainPage.clickChange_Search_SelectButton(0);
		
		financeChannelManageRateMaintainPage.clickRateCodeSearch_Confirm();
		
		financeChannelManageRateMaintainPage.clickTypeIn_Close();
	}

	private void modifyCase(FinanceChannelManageRateMaintainBean financeChannelManageRateMaintainBean) {
		financeChannelManageRateMaintainPage.clickChange();
		wait.waitFor(1000);
		financeChannelManageRateMaintainPage.clickChange_Close();
	}

	private void displayCase(FinanceChannelManageRateMaintainBean financeChannelManageRateMaintainBean) {
		financeChannelManageRateMaintainPage.clickCheck();
		wait.waitFor(1000);
		financeChannelManageRateMaintainPage.clickCheck_Close();
	}

}
