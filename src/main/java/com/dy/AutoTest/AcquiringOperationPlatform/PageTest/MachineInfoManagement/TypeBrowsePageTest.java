package com.dy.AutoTest.AcquiringOperationPlatform.PageTest.MachineInfoManagement;

import java.lang.reflect.Method;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.dy.AutoTest.web.api.SuperTest;
import com.dy.AutoTest.AcquiringOperationPlatform.PageObject.MachineInfoManagement.TypeBrowsePage;
import com.dy.AutoTest.AcquiringOperationPlatform.POJO.MachineInfoManagement_TypeBrowseBean;
import com.dy.AutoTest.web.business.DataBusiness;

public class TypeBrowsePageTest extends SuperTest{
	TypeBrowsePage TypeBrowsePage;
	String URL;

	@BeforeClass
	public void init() {
		/******** instant objectPage *********/
		TypeBrowsePage=new TypeBrowsePage(driver);
		//TypeBrowsePage.setWaitTime(800);

		/******** set URL *********/
		URL=host.toString()+DataBusiness.getData_URL("aop_MachineInfoManagement_TypeBrowse");

		/******** instant Interface *********/
		iQuery=TypeBrowsePage;
//		iClickButton=TypeBrowsePage;
//		iClickRadio=TypeBrowsePage;
//		iSearchMerchantByNOorName=TypeBrowsePage;
	}

	@DataProvider(name="MachineInfoManagement_TypeBrowse")
	protected static Object[][] parametersPool(){
		data.loadDataBeanList("AOP_Data_MachineInfoManagement_TypeBrowse",MachineInfoManagement_TypeBrowseBean.class);
		return data.getDataBeanArray();
	}

	@DataProvider(name="MachineInfoManagement_TypeBrowseByCaseNO")
	protected static Object[][] parametersPool(Method method){
		data.loadDataBeanList("AOP_Data_MachineInfoManagement_TypeBrowse",method.getName(),MachineInfoManagement_TypeBrowseBean.class);
		return data.getDataBeanArray();
	}

	@Test(dataProvider="MachineInfoManagement_TypeBrowseByCaseNO")
	public void testQuery(MachineInfoManagement_TypeBrowseBean bean) {
		TypeBrowsePage.navigateTo(URL);
		wait.waitFor(500);

	}
	@Test(dataProvider="MachineInfoManagement_TypeBrowseByCaseNO")
	public void testCheck(MachineInfoManagement_TypeBrowseBean bean) {
		TypeBrowsePage.navigateTo(URL);
		wait.waitFor(500);
		
		TypeBrowsePage.setManufactureNO(bean.getManufactureName());
		TypeBrowsePage.setTypeNO(bean.getTypeNO());
		
		doQueryForClickButton(bean);
		TypeBrowsePage.clickCheck();
		wait.waitFor(2000);
		TypeBrowsePage.clickCheck_Close();
	}
	@Test(dataProvider="MachineInfoManagement_TypeBrowseByCaseNO")
	public void testDelete(MachineInfoManagement_TypeBrowseBean bean) {
		TypeBrowsePage.navigateTo(URL);
		wait.waitFor(500);
		
		TypeBrowsePage.setManufactureNO(bean.getManufactureName());
		TypeBrowsePage.setTypeNO(bean.getTypeNO());
		
		doQueryForClickButton(bean);
		TypeBrowsePage.clickDelete();
		wait.waitFor(1000);
		TypeBrowsePage.clickDelete_Confirm();
//		TypeBrowsePage.clickDelete_Close();
	}
	@Test(dataProvider="MachineInfoManagement_TypeBrowseByCaseNO")
	public void testUpdate(MachineInfoManagement_TypeBrowseBean bean) {
		TypeBrowsePage.navigateTo(URL);
		wait.waitFor(500);
		
		TypeBrowsePage.setManufactureNO(bean.getManufactureName());
		TypeBrowsePage.setTypeNO(bean.getTypeNO());
		
		doQueryForClickButton(bean);
		TypeBrowsePage.clickUpdate();
		wait.waitFor(1000);
		
		TypeBrowsePage.setUpdate_TypeName(bean.getTypeName());
		TypeBrowsePage.selectUpdate_TerminalType(bean.getTerminalType());
		TypeBrowsePage.setUpdate_CPUandFrequency(bean.getCPUandFrequency());
		TypeBrowsePage.setUpdate_RAMCapacity(bean.getRAMCapacity());
		TypeBrowsePage.selectUpdate_MagneticTrackEncryptionSign(bean.getMagneticTrackEncryptionSign());
		TypeBrowsePage.setUpdate_Resolution(bean.getResolution());
		TypeBrowsePage.selectUpdate_PrintWay(bean.getPrintWay());
		TypeBrowsePage.setUpdate_PrintSpeed(bean.getPrintSpeed());
		TypeBrowsePage.selectUpdate_CommunicationWay(bean.getCommunicationWay());
		TypeBrowsePage.selectUpdate_CardRead(bean.getCardRead());
		TypeBrowsePage.setUpdate_PSAMCardRead(bean.getPSAMCardRead());
		TypeBrowsePage.setUpdate_AuthenticationPass(bean.getAuthenticationPass());
		TypeBrowsePage.setUpdate_WarrantyPeriod(bean.getWarrantyPeriod());
		TypeBrowsePage.selectUpdate_DevelopmentPlateform(bean.getDevelopmentPlateform());
		TypeBrowsePage.selectUpdate_VoltageType(bean.getVoltageType());
		TypeBrowsePage.setUpdate_EquipmentVolume(bean.getEquipmentVolume());
		TypeBrowsePage.setUpdate_EquipmentWeight(bean.getEquipmentWeight());
		TypeBrowsePage.setUpdate_WorkingTemp(bean.getWorkingTemp());
		TypeBrowsePage.setUpdate_WorkingHumidity(bean.getWorkingHumidity());
		TypeBrowsePage.setUpdate_GuidingPrice(bean.getGuidingPrice());
		TypeBrowsePage.selectUpdate_PasswordKeybroad(bean.getPasswordKeybroad());
		TypeBrowsePage.setUpdate_Tips(bean.getTips());
		TypeBrowsePage.selectUpdate_ProgramUpdateWay(bean.getProgramUpdateWay());
		
		wait.waitFor(1000);
		TypeBrowsePage.clickUpdate_Submit();
//		TypeBrowsePage.clickUpdate_Close();
	}
	@Test(dataProvider="MachineInfoManagement_TypeBrowseByCaseNO")
	public void testAdd(MachineInfoManagement_TypeBrowseBean bean) {
		TypeBrowsePage.navigateTo(URL);
		wait.waitFor(500);
		
		TypeBrowsePage.clickAdd();
		wait.waitFor(1000);
		
		TypeBrowsePage.selectAdd_ManufactureName(bean.getManufactureName());
		TypeBrowsePage.setAdd_TypeNO(bean.getTypeNO());
		TypeBrowsePage.setAdd_TypeName(bean.getTypeName());
		TypeBrowsePage.selectAdd_TerminalType(bean.getTerminalType());
		TypeBrowsePage.setAdd_CPUandFrequency(bean.getCPUandFrequency());
		TypeBrowsePage.setAdd_RAMCapacity(bean.getRAMCapacity());
		TypeBrowsePage.selectAdd_MagneticTrackEncryptionSign(bean.getMagneticTrackEncryptionSign());
		TypeBrowsePage.setAdd_Resolution(bean.getResolution());
		TypeBrowsePage.selectAdd_PrintWay(bean.getPrintWay());
		TypeBrowsePage.setAdd_PrintSpeed(bean.getPrintSpeed());
		TypeBrowsePage.selectAdd_CommunicationWay(bean.getCommunicationWay());
		TypeBrowsePage.selectAdd_CardRead(bean.getCardRead());
		TypeBrowsePage.setAdd_PSAMCardRead(bean.getPSAMCardRead());
		TypeBrowsePage.setAdd_AuthenticationPass(bean.getAuthenticationPass());
		TypeBrowsePage.setAdd_WarrantyPeriod(bean.getWarrantyPeriod());
		TypeBrowsePage.selectAdd_DevelopmentPlateform(bean.getDevelopmentPlateform());
		TypeBrowsePage.selectAdd_VoltageType(bean.getVoltageType());
		TypeBrowsePage.setAdd_EquipmentVolume(bean.getEquipmentVolume());
		TypeBrowsePage.setAdd_EquipmentWeight(bean.getEquipmentWeight());
		TypeBrowsePage.setAdd_WorkingTemp(bean.getWorkingTemp());
		TypeBrowsePage.setAdd_WorkingHumidity(bean.getWorkingHumidity());
		TypeBrowsePage.setAdd_GuidingPrice(bean.getGuidingPrice());
		TypeBrowsePage.selectAdd_PasswordKeybroad(bean.getPasswordKeybroad());
		TypeBrowsePage.setAdd_Tips(bean.getTips());
		TypeBrowsePage.selectAdd_ProgramUpdateWay(bean.getProgramUpdateWay());
		
		TypeBrowsePage.clickAdd_Submit();
		wait.waitFor(3000);
	}


	public void doQueryForClickButton(MachineInfoManagement_TypeBrowseBean bean) {

		TypeBrowsePage.clickQuery();
		wait.waitFor(500);
		TypeBrowsePage.clickRadio(bean.getRadio());
		wait.waitFor(500);
	}
}