package com.dy.AutoTest.AcquiringOperationPlatform.PageTest.MachineInfoManagement;

import java.lang.reflect.Method;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.dy.AutoTest.web.api.SuperTest;
import com.dy.AutoTest.AcquiringOperationPlatform.PageObject.MachineInfoManagement.ManufacturerInfoBrowsePage;
import com.dy.AutoTest.AcquiringOperationPlatform.POJO.MachineInfoManagement_ManufacturerInfoBrowseBean;
import com.dy.AutoTest.web.business.DataBusiness;

public class ManufacturerInfoBrowsePageTest extends SuperTest{
	ManufacturerInfoBrowsePage ManufacturerInfoBrowsePage;
	String URL;

	@BeforeClass
	public void init() {
		/******** instant objectPage *********/
		ManufacturerInfoBrowsePage=new ManufacturerInfoBrowsePage(driver);

		/******** set URL *********/
		URL=host.toString()+DataBusiness.getData_URL("aop_MachineInfoManagement_ManufacturerInfoBrowse");

		/******** instant Interface *********/
		iQuery=ManufacturerInfoBrowsePage;
	}

	@DataProvider(name="MachineInfoManagement_ManufacturerInfoBrowse")
	protected static Object[][] parametersPool(){
		data.loadDataBeanList("AOP_Data_MachineInfoManagement_ManufacturerInfoBrowse",MachineInfoManagement_ManufacturerInfoBrowseBean.class);
		return data.getDataBeanArray();
	}

	@DataProvider(name="MachineInfoManagement_ManufacturerInfoBrowseByCaseNO")
	protected static Object[][] parametersPool(Method method){
		data.loadDataBeanList("AOP_Data_MachineInfoManagement_ManufacturerInfoBrowse",method.getName(),MachineInfoManagement_ManufacturerInfoBrowseBean.class);
		return data.getDataBeanArray();
	}

	@Test(dataProvider="MachineInfoManagement_ManufacturerInfoBrowseByCaseNO")
	public void testCheck(MachineInfoManagement_ManufacturerInfoBrowseBean bean) {
		ManufacturerInfoBrowsePage.navigateTo(URL);
		
		ManufacturerInfoBrowsePage.setManufacturerNO(bean.getManufacturerNO());
		ManufacturerInfoBrowsePage.setManufacturerName(bean.getManufacturerName());
		
		doQueryForClickButton(bean);
		ManufacturerInfoBrowsePage.clickCheck();
		wait.waitFor(2000);
		ManufacturerInfoBrowsePage.clickCheck_Close();
	}
	
	@Test(dataProvider="MachineInfoManagement_ManufacturerInfoBrowseByCaseNO")
	public void testDelete(MachineInfoManagement_ManufacturerInfoBrowseBean bean) {
		ManufacturerInfoBrowsePage.navigateTo(URL);
		
		ManufacturerInfoBrowsePage.setManufacturerNO(bean.getManufacturerNO());
		ManufacturerInfoBrowsePage.setManufacturerName(bean.getManufacturerName());
		
		wait.waitFor(500);
		doQueryForClickButton(bean);
		ManufacturerInfoBrowsePage.clickDelete();
		wait.waitFor(1000);
		ManufacturerInfoBrowsePage.clickDelete_Confirm();
//		ManufacturerInfoBrowsePage.clickDelete_Close();
	}
	
	@Test(dataProvider="MachineInfoManagement_ManufacturerInfoBrowseByCaseNO")
	public void testUpdate(MachineInfoManagement_ManufacturerInfoBrowseBean bean) {
		ManufacturerInfoBrowsePage.navigateTo(URL);
		
		ManufacturerInfoBrowsePage.setManufacturerNO(bean.getManufacturerNO());
		ManufacturerInfoBrowsePage.setManufacturerName(bean.getManufacturerName());
		
		wait.waitFor(500);
		doQueryForClickButton(bean);
		ManufacturerInfoBrowsePage.clickUpdate();
		wait.waitFor(1000);

		ManufacturerInfoBrowsePage.setUpdate_ManufacturerAddress(bean.getManufacturerAddress());
		ManufacturerInfoBrowsePage.setUpdate_PostalCode(bean.getPostalCode());
		ManufacturerInfoBrowsePage.setUpdate_ContactPerson(bean.getContactPerson());
		ManufacturerInfoBrowsePage.setUpdate_ContactNumber(bean.getContactNumber());
		ManufacturerInfoBrowsePage.setUpdate_SaleServiceHotline(bean.getSaleServiceHotline());
		ManufacturerInfoBrowsePage.selectUpdate_CompanyNature(bean.getCompanyNature());
		ManufacturerInfoBrowsePage.selectUpdate_CompanyScale(bean.getCompanyScale());
		ManufacturerInfoBrowsePage.setUpdate_CompanyURL(bean.getCompanyURL());
		ManufacturerInfoBrowsePage.setUpdate_CompanyMail(bean.getCompanyMail());
		ManufacturerInfoBrowsePage.setUpdate_TipsInfo(bean.getTipsInfo());
		
		wait.waitFor(1000);
		ManufacturerInfoBrowsePage.clickUpdate_Submit();
//		ManufacturerInfoBrowsePage.clickUpdate_Close();
	}
	
	@Test(dataProvider="MachineInfoManagement_ManufacturerInfoBrowseByCaseNO")
	public void testAdd(MachineInfoManagement_ManufacturerInfoBrowseBean bean) {
		ManufacturerInfoBrowsePage.navigateTo(URL);
		
		ManufacturerInfoBrowsePage.clickAdd();
		wait.waitFor(500);

		ManufacturerInfoBrowsePage.setAdd_ManufacturerNO("1" + bean.getManufacturerNO());
		ManufacturerInfoBrowsePage.setAdd_ManufacturerName(bean.getManufacturerName());
		ManufacturerInfoBrowsePage.setAdd_ManufacturerAddress(bean.getManufacturerAddress());
		ManufacturerInfoBrowsePage.setAdd_PostalCode(bean.getPostalCode());
		ManufacturerInfoBrowsePage.setAdd_ContactPerson(bean.getContactPerson());
		ManufacturerInfoBrowsePage.setAdd_ContactNumber(bean.getContactNumber());
		ManufacturerInfoBrowsePage.setAdd_SaleServiceHotline(bean.getSaleServiceHotline());
		ManufacturerInfoBrowsePage.selectAdd_CompanyNature(bean.getCompanyNature());
		ManufacturerInfoBrowsePage.selectAdd_CompanyScale(bean.getCompanyScale());
		ManufacturerInfoBrowsePage.setAdd_CompanyURL(bean.getCompanyURL());
		ManufacturerInfoBrowsePage.setAdd_CompanyMail(bean.getCompanyMail());
		ManufacturerInfoBrowsePage.setAdd_TipsInfo(bean.getTipsInfo());
		
		wait.waitFor(1000);

		ManufacturerInfoBrowsePage.clickAdd_Submit();
//		ManufacturerInfoBrowsePage.clickAdd_Close();
	}

	public void doQueryForClickButton(MachineInfoManagement_ManufacturerInfoBrowseBean bean) {
		ManufacturerInfoBrowsePage.clickQuery();
		wait.waitFor(500);
		ManufacturerInfoBrowsePage.clickRadio(bean.getRadio());
		wait.waitFor(500);
	}
}