package com.dy.AutoTest.OperationPlatform.TestCases.financechannel;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.dy.AutoTest.OperationPlatform.POJO.FinanceChannelManageReturnCodeBean;
import com.dy.AutoTest.OperationPlatform.PageObject.financechannel.FinanceChannelManageReturnCodePage;
import com.dy.AutoTest.web.api.SuperTest;
import com.dy.AutoTest.web.business.DataBusiness;

public class FinanceChannelManageReturnCodePageTest extends SuperTest {
	
	private FinanceChannelManageReturnCodePage financeChannelManageReturnCodePage;

	private String URL = "";

	@BeforeClass
	public void init() {
		financeChannelManageReturnCodePage = new FinanceChannelManageReturnCodePage(driver);
		URL = host.toString() + DataBusiness.getData_URL("pop_FinanceChannelManageReturnCode");
	}

	@DataProvider(name = "financeChannelManageReturnCode")
	protected static Object[][] parametersPool() {
		data.loadDataBeanList("POP_Data_FinanceChannelManageReturnCode");
		return data.getDataBeanArray();
	}

	@Test(dataProvider = "financeChannelManageReturnCode", description = "运营平台-通道返回码维护")
	public void testFinanceChannelManageReturnCode(FinanceChannelManageReturnCodeBean financeChannelManageReturnCodeBean) {

		financeChannelManageReturnCodePage.navigateTo(URL);

		wait.waitFor(1000);
		financeChannelManageReturnCodePage.clickReset();
		
		financeChannelManageReturnCodePage.setFocusOnChannelCode();
		financeChannelManageReturnCodePage.inputOnChannelCode(financeChannelManageReturnCodeBean.getChannelCode());
		
		financeChannelManageReturnCodePage.setFocusOnChannelReturnCode();
		financeChannelManageReturnCodePage.inputOnChannelReturnCode(financeChannelManageReturnCodeBean.getChannelReturnCode());
		
		financeChannelManageReturnCodePage.setFocusOnEnableSelect();
		financeChannelManageReturnCodePage.inputOnEnableSelect(financeChannelManageReturnCodeBean.getEnableSelect());
		
		financeChannelManageReturnCodePage.setFocusOnPlateformInformCode();
		financeChannelManageReturnCodePage.inputOnPlateformInformCode(financeChannelManageReturnCodeBean.getPlateformInformCode());

		financeChannelManageReturnCodePage.clickInquire();
		
		wait.waitFor(1000);

		financeChannelManageReturnCodePage.clickSelectionButton(0);

		String caseNo = financeChannelManageReturnCodeBean.getCaseNo();

		switch (caseNo) {
		case "1":
			modiyCase(financeChannelManageReturnCodeBean);
			break;
		case "2":
			enableCase(financeChannelManageReturnCodeBean);
			break;
		case "3":
			createCase(financeChannelManageReturnCodeBean);
			break;
		case "4":
			displayCase(financeChannelManageReturnCodeBean);
			break;
		default:
			break;
		}
	}

	private void modiyCase(FinanceChannelManageReturnCodeBean financeChannelManageReturnCodeBean) {
		financeChannelManageReturnCodePage.clickChange();
		
		financeChannelManageReturnCodePage.setFocusOnChange_PlateformInformCode();
		financeChannelManageReturnCodePage.inputOnChange_PlateformInformCode(financeChannelManageReturnCodeBean.getPlateformInformCode());
		
		financeChannelManageReturnCodePage.setFocusOnChange_PlateformInformCodeDescribe();
		financeChannelManageReturnCodePage.inputOnChange_PlateformInformCodeDescribe(financeChannelManageReturnCodeBean.getPlateformInformCodeDescribe());
		
		financeChannelManageReturnCodePage.setFocusOnChange_EnableSelect();
		financeChannelManageReturnCodePage.inputOnChange_EnableSelect(financeChannelManageReturnCodeBean.getEnableSelect());
		
		financeChannelManageReturnCodePage.clickChange_Change();
	}

	private void enableCase(FinanceChannelManageReturnCodeBean financeChannelManageReturnCodeBean) {
		financeChannelManageReturnCodePage.clickDisable();
		financeChannelManageReturnCodePage.clickDisable_Disable();
		
		wait.waitFor(1000);
		
		financeChannelManageReturnCodePage.setFocusOnEnableSelect();
		financeChannelManageReturnCodePage.inputOnEnableSelect("1");

		financeChannelManageReturnCodePage.clickInquire();
		
		wait.waitFor(1000);

		financeChannelManageReturnCodePage.clickSelectionButton(0);
		
		financeChannelManageReturnCodePage.clickEnable();
		financeChannelManageReturnCodePage.clickEnable_Enable();
	}

	private void createCase(FinanceChannelManageReturnCodeBean financeChannelManageReturnCodeBean) {
		financeChannelManageReturnCodePage.clickAdd();
		
		financeChannelManageReturnCodePage.setFocusOnAdd_ChannelCode();
		financeChannelManageReturnCodePage.inputOnAdd_ChannelCode(financeChannelManageReturnCodeBean.getChannelCode());
		
		financeChannelManageReturnCodePage.setFocusOnAdd_ChannelReturnCode();
		financeChannelManageReturnCodePage.inputOnAdd_ChannelReturnCode(financeChannelManageReturnCodeBean.getChannelReturnCode());
		
		financeChannelManageReturnCodePage.setFocusOnAdd_ChannelReturnCodeDescribe();
		financeChannelManageReturnCodePage.inputOnAdd_ChannelReturnCodeDescribe(financeChannelManageReturnCodeBean.getChannelReturnCodeDescribe());
		
		financeChannelManageReturnCodePage.setFocusOnAdd_PlateformInformCode();
		financeChannelManageReturnCodePage.inputOnAdd_PlateformInformCode(financeChannelManageReturnCodeBean.getPlateformInformCode());
		
		financeChannelManageReturnCodePage.setFocusOnAdd_PlateformInformCodeDescribe();
		financeChannelManageReturnCodePage.inputOnAdd_PlateformInformCodeDescribe(financeChannelManageReturnCodeBean.getPlateformInformCodeDescribe());
		
		financeChannelManageReturnCodePage.setFocusOnAdd_EnableSelect();
		financeChannelManageReturnCodePage.inputOnAdd_EnableSelect(financeChannelManageReturnCodeBean.getEnableSelect());
		
		financeChannelManageReturnCodePage.setFocusOnAdd_ChannelType();
		financeChannelManageReturnCodePage.inputOnAdd_ChannelType(financeChannelManageReturnCodeBean.getChannelType());
		
		financeChannelManageReturnCodePage.clickAdd_Close();
	}
	
	private void displayCase(FinanceChannelManageReturnCodeBean financeChannelManageReturnCodeBean) {
		financeChannelManageReturnCodePage.clickCheck();
		wait.waitFor(1000);
		financeChannelManageReturnCodePage.clickCheck_Close();
	}
}
