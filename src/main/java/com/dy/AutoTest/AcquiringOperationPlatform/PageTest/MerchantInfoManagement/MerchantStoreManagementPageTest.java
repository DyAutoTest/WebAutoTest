package com.dy.AutoTest.AcquiringOperationPlatform.PageTest.MerchantInfoManagement;

import static org.testng.Assert.assertTrue;

import java.lang.reflect.Method;

import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.dy.AutoTest.web.api.SuperTest;
import com.dy.AutoTest.AcquiringOperationPlatform.PageObject.MerchantInfoManagement.MerchantStoreManagementPage;
import com.dy.AutoTest.AcquiringOperationPlatform.POJO.MerchantInfoManagement_MerchantStoreManagementBean;
import com.dy.AutoTest.web.business.DataBusiness;

public class MerchantStoreManagementPageTest extends SuperTest{
	MerchantStoreManagementPage MerchantStoreManagementPage;
	String URL;
	@BeforeClass
	public void init() {
		/******** instant objectPage *********/
		MerchantStoreManagementPage=new MerchantStoreManagementPage(driver);
		//MerchantStoreManagementPage.setWaitTime(800);

		/******** set URL *********/
		URL=host.toString()+DataBusiness.getData_URL("aop_MerchantInfoManagement_MerchantStoreManagement");

		/******** instant Interface *********/
		iQuery=MerchantStoreManagementPage;
//		iClickButton=MerchantStoreManagementPage;
//		iClickRadio=MerchantStoreManagementPage;
		iSearchMerchant=MerchantStoreManagementPage;
		iSearchMerchant_Add=MerchantStoreManagementPage;
	}
	
	@DataProvider(name="MerchantInfoManagement_MerchantStoreManagement")
	protected static Object[][] parametersPool(){
		data.loadDataBeanList("AOP_Data_MerchantInfoManagement_MerchantStoreManagement",MerchantInfoManagement_MerchantStoreManagementBean.class);
		if(data.getDataBeanArray().length==0) {
			System.out.println("测试数据为空，请检查");
			Reporter.log("测试数据为空，请检查");
			assertTrue(false);
		}
		return data.getDataBeanArray();
	}

	@DataProvider(name="MerchantInfoManagement_MerchantStoreManagementByCaseNO")
	protected static Object[][] parametersPool(Method method){
		data.loadDataBeanList("AOP_Data_MerchantInfoManagement_MerchantStoreManagement",method.getName(),MerchantInfoManagement_MerchantStoreManagementBean.class);
		if(data.getDataBeanArray().length==0) {
			System.out.println("测试数据为空，请检查");
			Reporter.log("测试数据为空，请检查");
			assertTrue(false);
		}
		return data.getDataBeanArray();
	}

	@Test(dataProvider="MerchantInfoManagement_MerchantStoreManagementByCaseNO")
	public void testQuery(MerchantInfoManagement_MerchantStoreManagementBean bean) {
		MerchantStoreManagementPage.navigateTo(URL);
		wait.waitFor(500);
		if(!bean.getMerchantNO().equals("")) {
			doSearchMerchant(bean.getMerchantNO(), bean.getSearchMer_MerName(), bean.getRadio());
			doQuery();
		}
		if(!bean.getSearchMer_MerName().equals("")) {
			doSearchMerchant("", bean.getSearchMer_MerName(), bean.getRadio());
			doQuery();
		}
		if(!bean.getStoreName().equals("")) {
			MerchantStoreManagementPage.setStoreName(bean.getStoreName());
			doQuery();
		}
	}
	@Test(dataProvider="MerchantInfoManagement_MerchantStoreManagementByCaseNO")
	public void testDelete(MerchantInfoManagement_MerchantStoreManagementBean bean) {
		MerchantStoreManagementPage.navigateTo(URL);
		wait.waitFor(500);
		doQueryForClickButton(bean);
		MerchantStoreManagementPage.clickDelete();
		wait.waitFor(1000);
//		MerchantStoreManagementPage.clickDelete_Confirm();
//		System.out.println(MerchantStoreManagementPage.getNotice());
//		Reporter.log(MerchantStoreManagementPage.getNotice());
		MerchantStoreManagementPage.clickDelete_Close();
	}
	@Test(dataProvider="MerchantInfoManagement_MerchantStoreManagementByCaseNO")
	public void testUpdate(MerchantInfoManagement_MerchantStoreManagementBean bean) {
		MerchantStoreManagementPage.navigateTo(URL);
		wait.waitFor(500);
		if(bean.getUpdate_StoreName().equals("")) {
			System.out.println("门店名字段为必输项，不能为空");
			Reporter.log("门店名字段为必输项，不能为空");
			assertTrue(false);
		}
		if(bean.getUpdate_StoreAddress().equals("")) {
			System.out.println("门店地址字段为必输项，不能为空");
			Reporter.log("门店地址字段为必输项，不能为空");
			assertTrue(false);
		}
		doQueryForClickButton(bean);
		MerchantStoreManagementPage.clickUpdate();
		wait.waitFor(1000);
		MerchantStoreManagementPage.setUpdate_StoreName(bean.getUpdate_StoreName());
		MerchantStoreManagementPage.setUpdate_StoreAddress(bean.getUpdate_StoreAddress());
		wait.waitFor(1000);
		MerchantStoreManagementPage.clickUpdate_Submit();
		System.out.println(MerchantStoreManagementPage.getNotice());
		Reporter.log(MerchantStoreManagementPage.getNotice());
//		MerchantStoreManagementPage.clickUpdate_Close();
	}
	@Test(dataProvider="MerchantInfoManagement_MerchantStoreManagementByCaseNO")
	public void testAdd(MerchantInfoManagement_MerchantStoreManagementBean bean) {
		MerchantStoreManagementPage.navigateTo(URL);
		wait.waitFor(500);
//		add需要先判断必输项的测试数据是否为空
		if(bean.getAdd_SearchMer_MerNO().equals("")&&bean.getAdd_SearchMer_MerName().equals("")) {
			System.out.println("商户名与商户号 字段不能同时为空");
			Reporter.log("商户名与商户号 字段不能同时为空");
			assertTrue(false);
		}
		if(bean.getAdd_StoreName().equals("")) {
			System.out.println("门店名字段为必输项，不能为空");
			Reporter.log("门店名字段为必输项，不能为空");
			assertTrue(false);
		}
		if(bean.getAdd_StoreAddress().equals("")) {
			System.out.println("门店地址字段为必输项，不能为空");
			Reporter.log("门店地址字段为必输项，不能为空");
			assertTrue(false);
		}
		MerchantStoreManagementPage.clickAdd();
		doSearchMerchant_Add(bean.getAdd_SearchMer_MerNO(), bean.getAdd_SearchMer_MerName(), bean.getAdd_SearchMer_Radio());
		MerchantStoreManagementPage.setAdd_StoreName(bean.getAdd_StoreName());
		MerchantStoreManagementPage.setAdd_StoreAddress(bean.getAdd_StoreAddress());
		wait.waitFor(1000);

		MerchantStoreManagementPage.clickAdd_Submit();
		System.out.println(MerchantStoreManagementPage.getNotice());
		Reporter.log(MerchantStoreManagementPage.getNotice());
//		MerchantStoreManagementPage.clickAdd_Close();
	}


	public void doQueryForClickButton(MerchantInfoManagement_MerchantStoreManagementBean bean) {
		doSearchMerchant(bean.getMerchantNO(), bean.getSearchMer_MerName(), bean.getRadio());
		if(!bean.getStoreName().equals("")) {
			MerchantStoreManagementPage.setStoreName(bean.getStoreName());
		}
		MerchantStoreManagementPage.clickQuery();
		wait.waitFor(500);
		MerchantStoreManagementPage.clickRadio(bean.getRadio());
		wait.waitFor(500);
	}
}