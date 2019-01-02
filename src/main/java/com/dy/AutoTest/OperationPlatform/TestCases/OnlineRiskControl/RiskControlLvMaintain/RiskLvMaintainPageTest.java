package com.dy.AutoTest.OperationPlatform.TestCases.OnlineRiskControl.RiskControlLvMaintain;

import static org.testng.Assert.assertTrue;

import java.lang.reflect.Method;

import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.dy.AutoTest.web.api.SuperTest;
import com.dy.AutoTest.OperationPlatform.PageObject.OnlineRiskControl.RiskControlLvMaintain.RiskLvMaintainPage;
import com.dy.AutoTest.OperationPlatform.POJO.RiskControlLvMaintain_RiskLvMaintainBean;
import com.dy.AutoTest.web.business.DataBusiness;

public class RiskLvMaintainPageTest extends SuperTest{
	RiskLvMaintainPage RiskLvMaintainPage;
	String URL;

	@BeforeClass
	public void init() {
		/******** instant objectPage *********/
		RiskLvMaintainPage=new RiskLvMaintainPage(driver);
		//RiskLvMaintainPage.setWaitTime(800);

		/******** set URL *********/
		URL=host.toString()+DataBusiness.getData_URL("pop_RiskControlLvMaintain_RiskLvMaintain");

		/******** instant Interface *********/
		iQuery=RiskLvMaintainPage;
//	iClickButton=RiskLvMaintainPage;
//	iClickRadio=RiskLvMaintainPage;
//	iSearchMerchantByNOorName=RiskLvMaintainPage;
	}

	@DataProvider(name="RiskControlLvMaintain_RiskLvMaintain")
	protected static Object[][] parametersPool(){
		data.loadDataBeanList("POP_Data_RiskControlLvMaintain_RiskLvMaintain");
		return data.getDataBeanArray();
	}

	@DataProvider(name="RiskControlLvMaintain_RiskLvMaintainByCaseNO")
	protected static Object[][] parametersPool(Method method){
		data.loadDataBeanList("POP_Data_RiskControlLvMaintain_RiskLvMaintain",method.getName());
		return data.getDataBeanArray();
	}

	@Test(dataProvider="RiskControlLvMaintain_RiskLvMaintainByCaseNO")
	public void testQuery(RiskControlLvMaintain_RiskLvMaintainBean rlmBean) {
		RiskLvMaintainPage.navigateTo(URL);
		wait.waitFor(500);
		if(!rlmBean.getRiskLv().equals("")) {
			RiskLvMaintainPage.selectRiskLv(rlmBean.getRiskLv());
			doQuery();
		}
	}
	@Test(dataProvider="RiskControlLvMaintain_RiskLvMaintainByCaseNO")
	public void testCheck(RiskControlLvMaintain_RiskLvMaintainBean rlmBean) {
		RiskLvMaintainPage.navigateTo(URL);
		wait.waitFor(500);
		doQueryForClickButton(rlmBean);
		RiskLvMaintainPage.clickCheck();
		wait.waitFor(2000);
		RiskLvMaintainPage.clickCheck_Close();
	}
	@Test(dataProvider="RiskControlLvMaintain_RiskLvMaintainByCaseNO")
	public void testDelete(RiskControlLvMaintain_RiskLvMaintainBean rlmBean) {
		RiskLvMaintainPage.navigateTo(URL);
		wait.waitFor(500);
		doQueryForClickButton(rlmBean);
		RiskLvMaintainPage.clickDelete();
		wait.waitFor(1000);
//		RiskLvMaintainPage.clickDelete_Confirm();
//		System.out.println(RiskLvMaintainPage.getNotice());
//		Reporter.log(RiskLvMaintainPage.getNotice());
		RiskLvMaintainPage.clickDelete_Close();
	}
	@Test(dataProvider="RiskControlLvMaintain_RiskLvMaintainByCaseNO")
	public void testUpdate(RiskControlLvMaintain_RiskLvMaintainBean rlmBean) {
		RiskLvMaintainPage.navigateTo(URL);
		wait.waitFor(500);
		doQueryForClickButton(rlmBean);
		RiskLvMaintainPage.clickUpdate();
		wait.waitFor(1000);
		if(!rlmBean.getUpdate_RiskParameterMax().equals(""))
			RiskLvMaintainPage.setUpdate_RiskParameterMax(rlmBean.getUpdate_RiskParameterMax());
		if(!rlmBean.getUpdate_RiskParameterMin().equals(""))
			RiskLvMaintainPage.setUpdate_RiskParameterMin(rlmBean.getUpdate_RiskParameterMin());
		if(!rlmBean.getUpdate_Tips().equals(""))
			RiskLvMaintainPage.setUpdate_Tips(rlmBean.getUpdate_Tips());
		wait.waitFor(1000);
//		RiskLvMaintainPage.clickUpdate_Submit();
//		System.out.println(RiskLvMaintainPage.getNotice());
//		Reporter.log(RiskLvMaintainPage.getNotice());
		RiskLvMaintainPage.clickUpdate_Close();
	}
	@Test(dataProvider="RiskControlLvMaintain_RiskLvMaintainByCaseNO")
	public void testAdd(RiskControlLvMaintain_RiskLvMaintainBean rlmBean) {
		RiskLvMaintainPage.navigateTo(URL);
		wait.waitFor(500);
		RiskLvMaintainPage.clickAdd();
		wait.waitFor(1000);
		if(!rlmBean.getRiskModel().equals("")) {
			System.out.println("风险模型字段为必输项，不能为空");
			Reporter.log("风险模型字段为必输项，不能为空");
			assertTrue(false);
		}
		if(!rlmBean.getRiskLv().equals("")) {
			System.out.println("风险级别字段为必输项，不能为空");
			Reporter.log("风险级别字段为必输项，不能为空");
			assertTrue(false);
		}
		if(!rlmBean.getRiskParameterMax().equals("")) {
			System.out.println("风险系数最大值字段为必输项，不能为空");
			Reporter.log("风险系数最大值字段为必输项，不能为空");
			assertTrue(false);
		}
		if(!rlmBean.getRiskParameterMin().equals("")) {
			System.out.println("风险系数最小值字段为必输项，不能为空");
			Reporter.log("风险系数最小值字段为必输项，不能为空");
			assertTrue(false);
		}
		if(!rlmBean.getTips().equals("")) {
			System.out.println("备注最小值字段为必输项，不能为空");
			Reporter.log("备注最小值字段为必输项，不能为空");
			assertTrue(false);
		}
		RiskLvMaintainPage.selectAdd_RiskModel(rlmBean.getRiskModel());
		RiskLvMaintainPage.setAdd_RiskLv(rlmBean.getRiskLv());
		RiskLvMaintainPage.setAdd_RiskParameterMax(rlmBean.getRiskParameterMax());
		RiskLvMaintainPage.setAdd_RiskParameterMin(rlmBean.getRiskParameterMin());
		RiskLvMaintainPage.setAdd_Tips(rlmBean.getTips());
		wait.waitFor(1000);
//		RiskLvMaintainPage.clickAdd_Submit();
//		System.out.println(RiskLvMaintainPage.getNotice());
//		Reporter.log(RiskLvMaintainPage.getNotice());
		RiskLvMaintainPage.clickAdd_Close();
	}
	
	
	
	
	
	public void doQueryForClickButton(RiskControlLvMaintain_RiskLvMaintainBean rlmBean) {
		//主要功能是if的填值，query点击，radio选择
		if(!rlmBean.getRiskLv().equals("")) {
			RiskLvMaintainPage.selectRiskLv(rlmBean.getRiskLv());
		}
		RiskLvMaintainPage.clickQuery();
		wait.waitFor(500);
		RiskLvMaintainPage.clickRadio(rlmBean.getRadio());
		wait.waitFor(500);
		
	}
}