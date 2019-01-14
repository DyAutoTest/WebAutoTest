package com.dy.AutoTest.OperationPlatform.TestCases.cooperatingagent.agentinfo;

import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.dy.AutoTest.OperationPlatform.POJO.CooperatingServiceChannelBean;
import com.dy.AutoTest.OperationPlatform.PageObject.cooperatingagent.agentinfo.CooperatingServiceChannelPage;
import com.dy.AutoTest.web.api.SuperTest;
import com.dy.AutoTest.web.business.DataBusiness;

public class CooperatingServiceChannelPageTest extends SuperTest {
	
	private CooperatingServiceChannelPage cooperatingServiceChannelPage;

	private String URL = "";

	@BeforeClass
	public void init() {
		cooperatingServiceChannelPage = new CooperatingServiceChannelPage(driver);
		URL = host.toString() + DataBusiness.getData_URL("pop_CooperatingServiceChannel");
	}

	@DataProvider(name = "cooperatingServiceChannel")
	protected static Object[][] parametersPool() {
		data.loadDataBeanList("POP_Data_CooperatingServiceChannel");
		return data.getDataBeanArray();
	}

	@Test(dataProvider = "cooperatingServiceChannel", description = "运营平台-业务通道管理")
	public void testCooperatingServiceChannel(CooperatingServiceChannelBean cooperatingServiceChannelBean) {

		cooperatingServiceChannelPage.navigateTo(URL);
		
		cooperatingServiceChannelPage.setFocusOnSearch();
		cooperatingServiceChannelPage.queryOnSearch(cooperatingServiceChannelBean.getSearch());
		
		wait.waitFor(1000);
		
		cooperatingServiceChannelPage.selectFirstRecord();
		
		String caseNo = cooperatingServiceChannelBean.getCaseNo();

		switch (caseNo) {
		case "1":
			modifyCase(cooperatingServiceChannelBean);
			break;
		case "2":
			enableCase(cooperatingServiceChannelBean);
			break;
		default:
			break;
		}
	}

	private void enableCase(CooperatingServiceChannelBean cooperatingServiceChannelBean) {
		cooperatingServiceChannelPage.clickDetailsButton();
		cooperatingServiceChannelPage.clickAddCloseButton();
		
		cooperatingServiceChannelPage.clickDisableButton();
		cooperatingServiceChannelPage.DisableConfirm();
		
		wait.waitFor(1000);

		cooperatingServiceChannelPage.selectFirstRecord();
		
		cooperatingServiceChannelPage.clickEnableButton();
		cooperatingServiceChannelPage.EnableConfirm();
		
		Reporter.log("业务通道管理开启/关闭成功！合作机构编码：" + cooperatingServiceChannelBean.getSearch());
	}

	private void modifyCase(CooperatingServiceChannelBean cooperatingServiceChannelBean) {
		cooperatingServiceChannelPage.clickModifyButton();
		cooperatingServiceChannelPage.submitModify();
		
		Reporter.log("业务通道管理修改成功！合作机构编码：" + cooperatingServiceChannelBean.getSearch());
	}
	
}
