package com.dy.AutoTest.OnlineCashier.TestCases.financechannel;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.dy.AutoTest.OnlineCashier.POJO.FinanceChannelManageRateCodeBean;
import com.dy.AutoTest.OnlineCashier.PageObject.financechannel.FinanceChannelManageRateCodePage;
import com.dy.AutoTest.web.api.SuperTest;
import com.dy.AutoTest.web.business.DataBusiness;

public class FinanceChannelManageRateCodePageTest extends SuperTest {

	private FinanceChannelManageRateCodePage financeChannelManageRateCodePage;

	private String URL = "";

	@BeforeClass
	public void init() {
		financeChannelManageRateCodePage = new FinanceChannelManageRateCodePage(driver);
		URL = host.toString() + DataBusiness.getData_URL("pop_FinanceChannelManageRateCode");
	}

	@DataProvider(name = "financeChannelManageRateCode")
	protected static Object[][] parametersPool() {
		data.loadDataBeanList("POP_Data_FinanceChannelManageRateCode");
		return data.getDataBeanArray();
	}

	@Test(dataProvider = "financeChannelManageRateCode", description = "运营平台-通道费率代码维护")
	public void testFinanceChannelManageRateCode(FinanceChannelManageRateCodeBean financeChannelManageRateCodeBean) {

		financeChannelManageRateCodePage.navigateTo(URL);

		financeChannelManageRateCodePage.setFocusOnSearch();
		financeChannelManageRateCodePage.inputOnSearch(financeChannelManageRateCodeBean.getSearch());

		wait.waitFor(1000);

		financeChannelManageRateCodePage.clickSelectionButton(0);

		String caseNo = financeChannelManageRateCodeBean.getCaseNo();

		switch (caseNo) {
		case "1":
			modifyCase(financeChannelManageRateCodeBean);
			break;
		case "2":
			addDeleteCaseOne(financeChannelManageRateCodeBean);
			break;
		case "3":
			addDeleteCaseTwo(financeChannelManageRateCodeBean);
			break;
		case "4":
			displayCase(financeChannelManageRateCodeBean);
			break;
		default:
			break;
		}

	}

	private void modifyCase(FinanceChannelManageRateCodeBean financeChannelManageRateCodeBean) {
		financeChannelManageRateCodePage.clickChange();
		
		financeChannelManageRateCodePage.setFocusOnChange_CodeName();
		financeChannelManageRateCodePage.inputOnChange_CodeName(financeChannelManageRateCodeBean.getCodeName());
		
		financeChannelManageRateCodePage.setFocusOnChange_ChargeType();
		financeChannelManageRateCodePage.inputOnChange_ChargeType(financeChannelManageRateCodeBean.getChargeType());
		
		financeChannelManageRateCodePage.setFocusOnChange_FeeCalculationBasis();
		financeChannelManageRateCodePage.inputOnChange_FeeCalculationBasis(financeChannelManageRateCodeBean.getFeeCalculatoin());
		
		financeChannelManageRateCodePage.setFocusOnAdd_BeginAmount();
		financeChannelManageRateCodePage.inputOnAdd_BeginAmount(financeChannelManageRateCodeBean.getBeginAmount());
		
		financeChannelManageRateCodePage.setFocusOnAdd_FlatRate();
		financeChannelManageRateCodePage.inputOnAdd_FlatRate(financeChannelManageRateCodeBean.getFlatRate());
		
		financeChannelManageRateCodePage.setFocusOnAdd_MinFeeAmount();
		financeChannelManageRateCodePage.inputOnAdd_MinFeeAmount(financeChannelManageRateCodeBean.getMinFeeAmount());
		
		financeChannelManageRateCodePage.setFocusOnAdd_MaxFeeAmount();
		financeChannelManageRateCodePage.inputOnAdd_MaxFeeAmount(financeChannelManageRateCodeBean.getMaxFeeAmount());
		
		financeChannelManageRateCodePage.clickChange_Confirm();
	}

	private void addDeleteCaseOne(FinanceChannelManageRateCodeBean financeChannelManageRateCodeBean) {
		financeChannelManageRateCodePage.clickAdd();
		
		financeChannelManageRateCodePage.setFocusOnAdd_CodeNum();
		financeChannelManageRateCodePage.inputOnAdd_CodeNum(financeChannelManageRateCodeBean.getCodeNum());
		
		financeChannelManageRateCodePage.setFocusOnAdd_CodeName();
		financeChannelManageRateCodePage.inputOnAdd_CodeName(financeChannelManageRateCodeBean.getCodeName());
		
		financeChannelManageRateCodePage.setFocusOnAdd_ChargeType();
		financeChannelManageRateCodePage.inputOnAdd_ChargeType(financeChannelManageRateCodeBean.getChargeType());
		
		financeChannelManageRateCodePage.setFocusOnAdd_FeeCalculationBasis();
		financeChannelManageRateCodePage.inputOnAdd_FeeCalculationBasis(financeChannelManageRateCodeBean.getFeeCalculatoin());
		
		financeChannelManageRateCodePage.setFocusOnAdd_BeginAmount();
		financeChannelManageRateCodePage.inputOnAdd_BeginAmount(financeChannelManageRateCodeBean.getBeginAmount());
		
		financeChannelManageRateCodePage.setFocusOnAdd_FlatRate();
		financeChannelManageRateCodePage.inputOnAdd_FlatRate(financeChannelManageRateCodeBean.getFlatRate());
		
		financeChannelManageRateCodePage.setFocusOnAdd_MinFeeAmount();
		financeChannelManageRateCodePage.inputOnAdd_MinFeeAmount(financeChannelManageRateCodeBean.getMinFeeAmount());
		
		financeChannelManageRateCodePage.setFocusOnAdd_MaxFeeAmount();
		financeChannelManageRateCodePage.inputOnAdd_MaxFeeAmount(financeChannelManageRateCodeBean.getMaxFeeAmount());
		
		financeChannelManageRateCodePage.clickAdd_Confirm();
		
		wait.waitFor(1000);
		
		financeChannelManageRateCodePage.setFocusOnSearch();
		financeChannelManageRateCodePage.inputOnSearch(financeChannelManageRateCodeBean.getCodeNum());

		wait.waitFor(1000);

		financeChannelManageRateCodePage.clickSelectionButton(0);
		
		financeChannelManageRateCodePage.clickDelete();
		wait.waitFor(1000);
		financeChannelManageRateCodePage.clickDelete_Confirm();
		
	}

	private void addDeleteCaseTwo(FinanceChannelManageRateCodeBean financeChannelManageRateCodeBean) {
		financeChannelManageRateCodePage.clickAdd();
		
		financeChannelManageRateCodePage.setFocusOnAdd_CodeNum();
		financeChannelManageRateCodePage.inputOnAdd_CodeNum(financeChannelManageRateCodeBean.getCodeNum());
		
		financeChannelManageRateCodePage.setFocusOnAdd_CodeName();
		financeChannelManageRateCodePage.inputOnAdd_CodeName(financeChannelManageRateCodeBean.getCodeName());
		
		financeChannelManageRateCodePage.setFocusOnAdd_ChargeType();
		financeChannelManageRateCodePage.inputOnAdd_ChargeType(financeChannelManageRateCodeBean.getChargeType());
		
		financeChannelManageRateCodePage.setFocusOnAdd_FeeCalculationBasis();
		financeChannelManageRateCodePage.inputOnAdd_FeeCalculationBasis(financeChannelManageRateCodeBean.getFeeCalculatoin());
		
		financeChannelManageRateCodePage.setFocusOnChange_SettledMoney();
		financeChannelManageRateCodePage.inputOnChange_SettledMoney(financeChannelManageRateCodeBean.getSettledMoney());
		
		financeChannelManageRateCodePage.clickAdd_Confirm();
		
		wait.waitFor(1000);
		
		financeChannelManageRateCodePage.setFocusOnSearch();
		financeChannelManageRateCodePage.inputOnSearch(financeChannelManageRateCodeBean.getCodeNum());

		wait.waitFor(1000);

		financeChannelManageRateCodePage.clickSelectionButton(0);
		
		financeChannelManageRateCodePage.clickDelete();
		wait.waitFor(1000);
		financeChannelManageRateCodePage.clickDelete_Confirm();
	}

	private void displayCase(FinanceChannelManageRateCodeBean financeChannelManageRateCodeBean) {
		financeChannelManageRateCodePage.clickCheck();
		wait.waitFor(1000);
		financeChannelManageRateCodePage.clickCheck_Close();
	}

}