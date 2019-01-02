package com.dy.AutoTest.OperationPlatform.TestCases.OnlineRiskControl.RiskControlLvMaintain;

import static org.testng.Assert.assertTrue;

import java.lang.reflect.Method;

import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.dy.AutoTest.web.api.SuperTest;
import com.dy.AutoTest.OperationPlatform.PageObject.OnlineRiskControl.RiskControlLvMaintain.RiskOperationMaintainPage;
import com.dy.AutoTest.OperationPlatform.POJO.RiskControlLvMaintain_RiskOperationMaintainBean;
import com.dy.AutoTest.web.business.DataBusiness;

public class RiskOperationMaintainPageTest extends SuperTest{
	RiskOperationMaintainPage RiskOperationMaintainPage;
	String URL;

	@BeforeClass
	public void init() {
		/******** instant objectPage *********/
		RiskOperationMaintainPage=new RiskOperationMaintainPage(driver);
		//RiskOperationMaintainPage.setWaitTime(800);

		/******** set URL *********/
		URL=host.toString()+DataBusiness.getData_URL("pop_RiskControlLvMaintain_RiskOperationMaintain");

		/******** instant Interface *********/
		iQuery=RiskOperationMaintainPage;
//		iClickButton=RiskOperationMaintainPage;
//		iClickRadio=RiskOperationMaintainPage;
//		iSearchMerchantByNOorName=RiskOperationMaintainPage;
	}

	@DataProvider(name="RiskControlLvMaintain_RiskOperationMaintain")
	protected static Object[][] parametersPool(){
		data.loadDataBeanList("POP_Data_RiskControlLvMaintain_RiskOperationMaintain");
		return data.getDataBeanArray();
	}

	@DataProvider(name="RiskControlLvMaintain_RiskOperationMaintainByCaseNO")
	protected static Object[][] parametersPool(Method method){
		data.loadDataBeanList("POP_Data_RiskControlLvMaintain_RiskOperationMaintain",method.getName());
		return data.getDataBeanArray();
	}

	@Test(dataProvider="RiskControlLvMaintain_RiskOperationMaintainByCaseNO")
	public void testQuery(RiskControlLvMaintain_RiskOperationMaintainBean bean) {
		RiskOperationMaintainPage.navigateTo(URL);
		wait.waitFor(500);
		if(!bean.getRiskBusinessType().equals("")) {
			RiskOperationMaintainPage.setRiskBusinessType(bean.getRiskBusinessType());
			doQuery();
		}
	}
	@Test(dataProvider="RiskControlLvMaintain_RiskOperationMaintainByCaseNO")
	public void testCheck(RiskControlLvMaintain_RiskOperationMaintainBean bean) {
		RiskOperationMaintainPage.navigateTo(URL);
		wait.waitFor(500);
		doQueryForClickButton(bean);
		RiskOperationMaintainPage.clickCheck();
		wait.waitFor(2000);
		RiskOperationMaintainPage.clickCheck_Close();
	}
	@Test(dataProvider="RiskControlLvMaintain_RiskOperationMaintainByCaseNO")
	public void testDelete(RiskControlLvMaintain_RiskOperationMaintainBean bean) {
		RiskOperationMaintainPage.navigateTo(URL);
		wait.waitFor(500);
		doQueryForClickButton(bean);
		RiskOperationMaintainPage.clickDelete();
		wait.waitFor(1000);
//		RiskOperationMaintainPage.clickDelete_Confirm();
//		System.out.println(RiskOperationMaintainPage.getNotice());
//		Reporter.log(RiskOperationMaintainPage.getNotice());
		RiskOperationMaintainPage.clickDelete_Close();
	}
	@Test(dataProvider="RiskControlLvMaintain_RiskOperationMaintainByCaseNO")
	public void testUpdate(RiskControlLvMaintain_RiskOperationMaintainBean bean) {
		RiskOperationMaintainPage.navigateTo(URL);
		wait.waitFor(500);
		doQueryForClickButton(bean);
		RiskOperationMaintainPage.clickUpdate();
		wait.waitFor(1000);
//		判断update字段是否为空
		if(!bean.getUpdate_RiskReferenceValue().equals("")) {
			RiskOperationMaintainPage.setUpdate_RiskReferenceValue(bean.getUpdate_RiskReferenceValue());
		}
		if(!bean.getUpdate_ReferenceName().equals("")) {
			RiskOperationMaintainPage.setUpdate_ReferenceName(bean.getUpdate_ReferenceName());
		}
		if(!bean.getUpdate_WeightReferenceID().equals("")) {
			RiskOperationMaintainPage.setUpdate_WeightReferenceID(bean.getUpdate_WeightReferenceID());
		}
		if(!bean.getUpdate_RiskReferenceDescribe().equals("")) {
			RiskOperationMaintainPage.setUpdate_RiskReferenceDescribe(bean.getUpdate_RiskReferenceDescribe());
		}
		wait.waitFor(1000);
//		RiskOperationMaintainPage.clickUpdate_Submit();
//		System.out.println(RiskOperationMaintainPage.getNotice());
//		Reporter.log(RiskOperationMaintainPage.getNotice());
		RiskOperationMaintainPage.clickUpdate_Close();
	}
	@Test(dataProvider="RiskControlLvMaintain_RiskOperationMaintainByCaseNO")
	public void testAdd(RiskControlLvMaintain_RiskOperationMaintainBean bean) {
		RiskOperationMaintainPage.navigateTo(URL);
		wait.waitFor(500);
//		add需要先判断必输项的测试数据是否为空
		if(bean.getRiskBusinessType().equals("")) {
			System.out.println("验证方式字段为必输项，不能为空");
			Reporter.log("验证方式字段为必输项，不能为空");
			assertTrue(false);
		}
		if(bean.getRiskReferenceValue().equals("")) {
			System.out.println("验证方式字段为必输项，不能为空");
			Reporter.log("验证方式字段为必输项，不能为空");
			assertTrue(false);
		}
		if(bean.getRiskReferenceName().equals("")) {
			System.out.println("验证方式字段为必输项，不能为空");
			Reporter.log("验证方式字段为必输项，不能为空");
			assertTrue(false);
		}
		if(bean.getWeightReferenceID().equals("")) {
			System.out.println("验证方式字段为必输项，不能为空");
			Reporter.log("验证方式字段为必输项，不能为空");
			assertTrue(false);
		}
		if(bean.getRiskReferenceDescribe().equals("")) {
			System.out.println("验证方式字段为必输项，不能为空");
			Reporter.log("验证方式字段为必输项，不能为空");
			assertTrue(false);
		}
		RiskOperationMaintainPage.clickAdd();
		
		RiskOperationMaintainPage.setAdd_RiskBusinessaType(bean.getRiskBusinessType());
		RiskOperationMaintainPage.setAdd_RiskReferenceValue(bean.getRiskReferenceValue());
		RiskOperationMaintainPage.setAdd_RiskReferenceName(bean.getRiskReferenceName());
		RiskOperationMaintainPage.setAdd_WeightReferenceID(bean.getWeightReferenceID());
		RiskOperationMaintainPage.setAdd_RiskReferenceDescribe(bean.getRiskReferenceDescribe());
		wait.waitFor(1000);

//		RiskOperationMaintainPage.clickAdd_Submit();
//		System.out.println(RiskOperationMaintainPage.getNotice());
//		Reporter.log(RiskOperationMaintainPage.getNotice());
		RiskOperationMaintainPage.clickAdd_Close();
	}


	public void doQueryForClickButton(RiskControlLvMaintain_RiskOperationMaintainBean bean) {
		if(!bean.getRiskBusinessType().equals("")) {
			RiskOperationMaintainPage.setRiskBusinessType(bean.getRiskBusinessType());
		}
		RiskOperationMaintainPage.clickQuery();
		wait.waitFor(500);
		RiskOperationMaintainPage.clickRadio(bean.getRadio());
		wait.waitFor(500);
	}
}