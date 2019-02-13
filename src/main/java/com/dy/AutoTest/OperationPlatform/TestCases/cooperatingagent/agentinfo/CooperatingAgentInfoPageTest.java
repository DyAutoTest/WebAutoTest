package com.dy.AutoTest.OperationPlatform.TestCases.cooperatingagent.agentinfo;

import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.dy.AutoTest.OperationPlatform.POJO.CooperatingAgentInfoBean;
import com.dy.AutoTest.OperationPlatform.PageObject.cooperatingagent.agentinfo.CooperatingAgentInfoPage;
import com.dy.AutoTest.web.api.SuperTest;
import com.dy.AutoTest.web.business.DataBusiness;

public class CooperatingAgentInfoPageTest extends SuperTest {

	private CooperatingAgentInfoPage cooperatingAgentInfoPage;

	private String URL = "";

	@BeforeClass
	public void init() {
		cooperatingAgentInfoPage = new CooperatingAgentInfoPage(driver);
		URL = host.toString() + DataBusiness.getData_URL("pop_CooperatingAgencyInfo");
	}

	@DataProvider(name = "cooperatingAgencyInfo")
	protected static Object[][] parametersPool() {
		data.loadDataBeanList("POP_Data_CooperatingAgencyInfo");
		return data.getDataBeanArray();
	}

	@Test(dataProvider = "cooperatingAgencyInfo", description = "运营平台-合作机构基本信息管理")
	public void testCooperatingAgencyInfo(CooperatingAgentInfoBean cooperatingAgentInfoBean) {

		cooperatingAgentInfoPage.navigateTo(URL);

		cooperatingAgentInfoPage.setFocusOnSearch();
		cooperatingAgentInfoPage.queryOnSearch(cooperatingAgentInfoBean.getSearch());

		wait.waitFor(1000);

		cooperatingAgentInfoPage.selectFirstRecord();

		String caseNo = cooperatingAgentInfoBean.getCaseNo();

		switch (caseNo) {
		case "1":
			modifyCase(cooperatingAgentInfoBean);
			break;
		case "2":
			addCase(cooperatingAgentInfoBean);
			break;
		case "3":
			enableCase(cooperatingAgentInfoBean);
			break;
		default:
			break;
		}
	}

	private void modifyCase(CooperatingAgentInfoBean cooperatingAgentInfoBean) {
		cooperatingAgentInfoPage.clickModifyButton();

		cooperatingAgentInfoPage.setFocusOnContactName();
		cooperatingAgentInfoPage.inputContactName(cooperatingAgentInfoBean.getContactName());

		cooperatingAgentInfoPage.setFocusOnContactTelephone();
		cooperatingAgentInfoPage.inputContactTelephone(cooperatingAgentInfoBean.getContactTelephone());

		cooperatingAgentInfoPage.setFocusOnCustomerManager();
		cooperatingAgentInfoPage.inputCustomerManager(cooperatingAgentInfoBean.getCustomerManager());

		cooperatingAgentInfoPage.submitModify();

		wait.waitFor(1000);

		cooperatingAgentInfoPage.selectFirstRecord();
		cooperatingAgentInfoPage.clickModifyButton();

		cooperatingAgentInfoPage.setFocusOnContactName();
		cooperatingAgentInfoPage.inputContactName("");

		cooperatingAgentInfoPage.setFocusOnContactTelephone();
		cooperatingAgentInfoPage.inputContactTelephone("");

		cooperatingAgentInfoPage.setFocusOnCustomerManager();
		cooperatingAgentInfoPage.inputCustomerManager("");

		cooperatingAgentInfoPage.submitModify();
		
		Reporter.log("合作机构管理修改成功！合作机构编码：" + cooperatingAgentInfoBean.getSearch());
	}

	private void addCase(CooperatingAgentInfoBean cooperatingAgentInfoBean) {
		cooperatingAgentInfoPage.clickAddButton();
		
		cooperatingAgentInfoPage.setFocusOnAgentCode();
		cooperatingAgentInfoPage.inputAgentCode(cooperatingAgentInfoBean.getAgentCode());
		
		cooperatingAgentInfoPage.setFocusOnAgentName();
		cooperatingAgentInfoPage.inputAgentName(cooperatingAgentInfoBean.getAgentName());
		
		cooperatingAgentInfoPage.setFocusOnEnableFlag();
		cooperatingAgentInfoPage.inputEnableFlag(cooperatingAgentInfoBean.getEnableFlag());
		
		cooperatingAgentInfoPage.setFocusOnAgentCategory();
		cooperatingAgentInfoPage.inputAgentCategory(cooperatingAgentInfoBean.getAgentCategory());
		
		cooperatingAgentInfoPage.setFocusOnContactName();
		cooperatingAgentInfoPage.inputContactName(cooperatingAgentInfoBean.getContactName());
		
		cooperatingAgentInfoPage.setFocusOnContactTelephone();
		cooperatingAgentInfoPage.inputContactTelephone(cooperatingAgentInfoBean.getContactTelephone());
		
		cooperatingAgentInfoPage.setFocusOnCustomerManager();
		cooperatingAgentInfoPage.inputCustomerManager(cooperatingAgentInfoBean.getCustomerManager());
		
		cooperatingAgentInfoPage.clickAddCloseButton();
		
		Reporter.log("合作机构管理新增成功！合作机构编码：" + cooperatingAgentInfoBean.getSearch());
	}

	private void enableCase(CooperatingAgentInfoBean cooperatingAgentInfoBean) {
		cooperatingAgentInfoPage.clickDetailsButton();
		cooperatingAgentInfoPage.clickAddCloseButton();
		
		cooperatingAgentInfoPage.clickDisableButton();
		cooperatingAgentInfoPage.DisableConfirm();
		
		wait.waitFor(1000);

		cooperatingAgentInfoPage.selectFirstRecord();
		
		cooperatingAgentInfoPage.clickEnableButton();
		cooperatingAgentInfoPage.EnableConfirm();
		
		Reporter.log("合作机构管理开启/关闭成功！合作机构编码：" + cooperatingAgentInfoBean.getSearch());
	}

}
