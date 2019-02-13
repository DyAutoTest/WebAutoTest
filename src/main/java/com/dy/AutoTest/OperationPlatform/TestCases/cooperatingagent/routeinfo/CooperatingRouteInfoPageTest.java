package com.dy.AutoTest.OperationPlatform.TestCases.cooperatingagent.routeinfo;

import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.dy.AutoTest.OperationPlatform.POJO.CooperatingRouteInfoBean;
import com.dy.AutoTest.OperationPlatform.PageObject.cooperatingagent.routeinfo.CooperatingRouteInfoPage;
import com.dy.AutoTest.web.api.SuperTest;
import com.dy.AutoTest.web.business.DataBusiness;

public class CooperatingRouteInfoPageTest extends SuperTest {

	private CooperatingRouteInfoPage cooperatingRouteInfoPage;

	private String URL = "";

	@BeforeClass
	public void init() {
		cooperatingRouteInfoPage = new CooperatingRouteInfoPage(driver);
		URL = host.toString() + DataBusiness.getData_URL("pop_CooperatingRouteInfo");
	}

	@DataProvider(name = "cooperatingRouteInfo")
	protected static Object[][] parametersPool() {
		data.loadDataBeanList("POP_Data_CooperatingRouteInfo");
		return data.getDataBeanArray();
	}

	@Test(dataProvider = "cooperatingRouteInfo", description = "运营平台-身份认证路由管理")
	public void testCooperatingRouteInfo(CooperatingRouteInfoBean cooperatingRouteInfoBean) {

		cooperatingRouteInfoPage.navigateTo(URL);
		
		cooperatingRouteInfoPage.setFocusOnSearch();
		cooperatingRouteInfoPage.queryOnSearch(cooperatingRouteInfoBean.getSearch());
		
		wait.waitFor(1000);
		
		String caseNo = cooperatingRouteInfoBean.getCaseNo();

		switch (caseNo) {
		case "1":
			modifyCase(cooperatingRouteInfoBean);
			break;
		case "2":
			detailsCase(cooperatingRouteInfoBean);
			break;
		default:
			break;
		}
	}

	private void detailsCase(CooperatingRouteInfoBean cooperatingRouteInfoBean) {
		cooperatingRouteInfoPage.selectFirstRecord();
		
		cooperatingRouteInfoPage.clickDetailsButton();
		cooperatingRouteInfoPage.clickAddCloseButton();
		
		Reporter.log("合作机构路由管理详细显示成功！合作机构编码：" + cooperatingRouteInfoBean.getSearch());
	}

	private void modifyCase(CooperatingRouteInfoBean cooperatingRouteInfoBean) {
		cooperatingRouteInfoPage.selectFirstRecord();
		cooperatingRouteInfoPage.clickModifyButton();
		
		wait.waitFor(500);
		
		cooperatingRouteInfoPage.submitModify();
		
		Reporter.log("合作机构路由管理修改成功！合作机构编码：" + cooperatingRouteInfoBean.getSearch());
	}
	
}
