package com.dy.AutoTest.OperationPlatform.TestCases.OnlineRiskControl.ComplianceMaintain;

import static org.testng.Assert.assertTrue;

import java.lang.reflect.Method;

import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.dy.AutoTest.web.api.SuperTest;
import com.dy.AutoTest.OperationPlatform.PageObject.OnlineRiskControl.ComplianceMaintain.WeightMaintainPage;
import com.dy.AutoTest.OperationPlatform.POJO.ComplianceMaintain_WeightMaintainBean;
import com.dy.AutoTest.web.business.DataBusiness;

public class WeightMaintainPageTest extends SuperTest{
	WeightMaintainPage WeightMaintainPage;
	String URL;

	@BeforeClass
	public void init() {
		/******** instant objectPage *********/
		WeightMaintainPage=new WeightMaintainPage(driver);
		//WeightMaintainPage.setWaitTime(800);

		/******** set URL *********/
		URL=host.toString()+DataBusiness.getData_URL("pop_ComplianceMaintain_WeightMaintain");

		/******** instant Interface *********/
		iQuery=WeightMaintainPage;
//	iClickButton=WeightMaintainPage;
//	iClickRadio=WeightMaintainPage;
//	iSearchMerchantByNOorName=WeightMaintainPage;
	}

	@DataProvider(name="ComplianceMaintain_WeightMaintain")
	protected static Object[][] parametersPool(){
		data.loadDataBeanList("POP_Data_ComplianceMaintain_WeightMaintain");
		return data.getDataBeanArray();
	}

	@DataProvider(name="ComplianceMaintain_WeightMaintainByCaseNO")
	protected static Object[][] parametersPool(Method method){
		data.loadDataBeanList("POP_Data_ComplianceMaintain_WeightMaintain",method.getName());
		return data.getDataBeanArray();
	}

	@Test(dataProvider="ComplianceMaintain_WeightMaintainByCaseNO")
	public void testQuery(ComplianceMaintain_WeightMaintainBean cwmBean) {
		WeightMaintainPage.navigateTo(URL);
		wait.waitFor(500);
		if(!cwmBean.getReferenceContent().equals("")) {
			WeightMaintainPage.setReferenceContent(cwmBean.getReferenceContent());
			doQuery();
		}
	}

	@Test(dataProvider="ComplianceMaintain_WeightMaintainByCaseNO")
	public void testCheck(ComplianceMaintain_WeightMaintainBean cwmBean) {
		WeightMaintainPage.navigateTo(URL);
		wait.waitFor(500);
		doQueryForClickButton(cwmBean);
		WeightMaintainPage.clickCheck();
		wait.waitFor(2000);
		WeightMaintainPage.clickCheck_Close();
	}
	

	@Test(dataProvider="ComplianceMaintain_WeightMaintainByCaseNO")
	public void testDelete(ComplianceMaintain_WeightMaintainBean cwmBean) {
		WeightMaintainPage.navigateTo(URL);
		wait.waitFor(500);
		doQueryForClickButton(cwmBean);
		WeightMaintainPage.clickDelete();
		wait.waitFor(1000);
//		WeightMaintainPage.clickDelete_Confirm();
//		System.out.println(WeightMaintainPage.getNotice());
//		Reporter.log(WeightMaintainPage.getNotice());
		WeightMaintainPage.clickDelete_Close();
	}

	@Test(dataProvider="ComplianceMaintain_WeightMaintainByCaseNO")
	public void testUpdate(ComplianceMaintain_WeightMaintainBean cwmBean) {
		WeightMaintainPage.navigateTo(URL);
		wait.waitFor(500);
		doQueryForClickButton(cwmBean);
		WeightMaintainPage.clickUpdate();
		wait.waitFor(2000);
		if(!cwmBean.getUpdate_ReferenceContent().equals("")) {
			WeightMaintainPage.setUpdate_ReferenceContent(cwmBean.getUpdate_ReferenceContent());
		}
		if(!cwmBean.getUpdate_RiskModule().equals("")) {
			WeightMaintainPage.setUpdate_RiskModule(cwmBean.getUpdate_RiskModule());
		}
		if(!cwmBean.getUpdate_Weight().equals("")) {
			WeightMaintainPage.setUpdate_Weight(cwmBean.getUpdate_Weight());
		}
		if(!cwmBean.getUpdate_Tips().equals("")) {
			WeightMaintainPage.setUpdate_Tips(cwmBean.getUpdate_Tips());
		}
		wait.waitFor(1000);
//		WeightMaintainPage.clickUpdate_Submit();
//		System.out.println(WeightMaintainPage.getNotice());
//		Reporter.log(WeightMaintainPage.getNotice());
		WeightMaintainPage.clickUpdate_Close();
	}
	
	@Test(dataProvider="ComplianceMaintain_WeightMaintainByCaseNO")
	public void testAdd(ComplianceMaintain_WeightMaintainBean cwmBean) {
		WeightMaintainPage.navigateTo(URL);
		wait.waitFor(500);
		WeightMaintainPage.clickAdd();
		wait.waitFor(500);
		if(cwmBean.getRiskModel().equals("")) {
			System.out.println("风险模型字段为必输项，不能为空");
			Reporter.log("风险模型字段为必输项，不能为空");
			assertTrue(false);
		}
		if(cwmBean.getReferenceID().equals("")) {
			System.out.println("参考ID字段为必输项，不能为空");
			Reporter.log("参考ID字段为必输项，不能为空");
			assertTrue(false);
		}
		if(cwmBean.getReferenceContent().equals("")) {
			System.out.println("参考内容字段为必输项，不能为空");
			Reporter.log("参考内容字段为必输项，不能为空");
			assertTrue(false);
		}
		if(cwmBean.getRiskModule().equals("")) {
			System.out.println("风险系数字段为必输项，不能为空");
			Reporter.log("风险系数字段为必输项，不能为空");
			assertTrue(false);
		}
		if(cwmBean.getWeight().equals("")) {
			System.out.println("权重字段为必输项，不能为空");
			Reporter.log("权重字段为必输项，不能为空");
			assertTrue(false);
		}
		if(cwmBean.getTips().equals("")) {
			System.out.println("备注字段为必输项，不能为空");
			Reporter.log("备注字段为必输项，不能为空");
			assertTrue(false);
		}
		WeightMaintainPage.selectAdd_RiskModel(cwmBean.getRiskModel());
		WeightMaintainPage.setAdd_ReferenceID(cwmBean.getReferenceID());
		WeightMaintainPage.setAdd_ReferenceContent(cwmBean.getReferenceContent());
		WeightMaintainPage.setAdd_RiskModule(cwmBean.getRiskModule());
		WeightMaintainPage.setAdd_Weight(cwmBean.getWeight());
		WeightMaintainPage.setAdd_Tips(cwmBean.getTips());
		wait.waitFor(1000);
//		WeightMaintainPage.clickAdd_Submit();
//		System.out.println(WeightMaintainPage.getNotice());
//		Reporter.log(WeightMaintainPage.getNotice());
		WeightMaintainPage.clickAdd_Close();
	}
	
	
	
	public void doQueryForClickButton(ComplianceMaintain_WeightMaintainBean cwmBean) {
		//主要功能是if的填值，query点击，radio选择
		if(!cwmBean.getReferenceContent().equals("")) {
			WeightMaintainPage.setReferenceContent(cwmBean.getReferenceContent());
		}
		WeightMaintainPage.clickQuery();
		wait.waitFor(500);
		WeightMaintainPage.clickRadio(cwmBean.getRadio());
		wait.waitFor(500);
	}
}