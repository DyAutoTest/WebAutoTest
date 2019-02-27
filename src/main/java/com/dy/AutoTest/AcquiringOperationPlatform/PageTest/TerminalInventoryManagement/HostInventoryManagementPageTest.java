package com.dy.AutoTest.AcquiringOperationPlatform.PageTest.TerminalInventoryManagement;

import java.lang.reflect.Method;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.dy.AutoTest.web.api.SuperTest;
import com.dy.AutoTest.AcquiringOperationPlatform.PageObject.TerminalInventoryManagement.HostInventoryManagementPage;
import com.dy.AutoTest.AcquiringOperationPlatform.POJO.TerminalInventoryManagement_HostInventoryManagementBean;
import com.dy.AutoTest.web.business.DataBusiness;

public class HostInventoryManagementPageTest extends SuperTest{
	HostInventoryManagementPage HostInventoryManagementPage;
	String URL;

	@BeforeClass
	public void init() {
		/******** instant objectPage *********/
		HostInventoryManagementPage=new HostInventoryManagementPage(driver);
		//HostInventoryManagementPage.setWaitTime(800);

		/******** set URL *********/
		URL=host.toString()+DataBusiness.getData_URL("aop_TerminalInventoryManagement_HostInventoryManagement");

		/******** instant Interface *********/
		iQuery=HostInventoryManagementPage;
//		iClickButton=HostInventoryManagementPage;
//		iClickRadio=HostInventoryManagementPage;
//		iSearchMerchantByNOorName=HostInventoryManagementPage;
	}

	@DataProvider(name="TerminalInventoryManagement_HostInventoryManagement")
	protected static Object[][] parametersPool(){
		data.loadDataBeanList("AOP_Data_TerminalInventoryManagement_HostInventoryManagement",TerminalInventoryManagement_HostInventoryManagementBean.class);
		return data.getDataBeanArray();
	}

	@DataProvider(name="TerminalInventoryManagement_HostInventoryManagementByCaseNO")
	protected static Object[][] parametersPool(Method method){
		data.loadDataBeanList("AOP_Data_TerminalInventoryManagement_HostInventoryManagement",method.getName(),TerminalInventoryManagement_HostInventoryManagementBean.class);
		return data.getDataBeanArray();
	}

	@Test(dataProvider="TerminalInventoryManagement_HostInventoryManagementByCaseNO")
	public void testQuery(TerminalInventoryManagement_HostInventoryManagementBean bean) {
		HostInventoryManagementPage.navigateTo(URL);
		wait.waitFor(500);

	}
	@Test(dataProvider="TerminalInventoryManagement_HostInventoryManagementByCaseNO")
	public void testCheck(TerminalInventoryManagement_HostInventoryManagementBean bean) {
		HostInventoryManagementPage.navigateTo(URL);
		
		HostInventoryManagementPage.setTerminalSerialNO(bean.getTerminalSerialNO());
		HostInventoryManagementPage.setTermianlNO(bean.getTermianlNO());
		HostInventoryManagementPage.selectUseStatus(bean.getUseStatus());
		HostInventoryManagementPage.selectManufactureName(bean.getManufactureName());
		HostInventoryManagementPage.selectTerminalType(bean.getTerminalType());
		HostInventoryManagementPage.selectBelongOrgnizine(bean.getBelongOrgnizine());
		HostInventoryManagementPage.setMerchantNO(bean.getMerchantNO());
		HostInventoryManagementPage.setMerchantName(bean.getMerchantName());
		
		wait.waitFor(500);
		doQueryForClickButton(bean);
		HostInventoryManagementPage.clickCheck();
		wait.waitFor(2000);
		HostInventoryManagementPage.clickCheck_Close();
	}

	@Test(dataProvider="TerminalInventoryManagement_HostInventoryManagementByCaseNO")
	public void testTerminalStore(TerminalInventoryManagement_HostInventoryManagementBean bean) {
		HostInventoryManagementPage.navigateTo(URL);
		wait.waitFor(500);

		HostInventoryManagementPage.clickTerminalEnterStorage();
		wait.waitFor(1000);

		HostInventoryManagementPage.selectTerminalEnterStorage_Manufacture(bean.getManufactureName());
		HostInventoryManagementPage.selectTerminalEnterStorage_TerminalType(bean.getTerminalType());
		HostInventoryManagementPage.setTerminalEnterStorage_InitialSerialNO1(bean.getInitialSerialNO1());
		HostInventoryManagementPage.setTerminalEnterStorage_InitialSerialNO2(bean.getInitialSerialNO2());
		HostInventoryManagementPage.setTerminalEnterStorage_FinalSerialNO(bean.getFinalSerialNO());
		HostInventoryManagementPage.selectTerminalEnterStorage_PropertyRightCharacteristics(bean.getPropertyRightCharacteristics());
		HostInventoryManagementPage.setTerminalEnterStorage_EnterStorageTime(bean.getEnterStorageTime());
		HostInventoryManagementPage.setTerminalEnterStorage_EnterStorageSource(bean.getEnterStorageSource());
		HostInventoryManagementPage.setTerminalEnterStorage_EnterStorageBatchNO(bean.getEnterStorageBatchNO());
		HostInventoryManagementPage.setTerminalEnterStorage_PurchasePrice(bean.getPurchasePrice());
		wait.waitFor(1000);
		
		HostInventoryManagementPage.clickTerminalEnterStorage_EnterStorageConfirm();
		wait.waitFor(3000);
	}
	@Test(dataProvider="TerminalInventoryManagement_HostInventoryManagementByCaseNO")
	public void testTerminalDeliver(TerminalInventoryManagement_HostInventoryManagementBean bean) {
		HostInventoryManagementPage.navigateTo(URL);
		wait.waitFor(500);

		HostInventoryManagementPage.setTerminalSerialNO(bean.getTerminalSerialNO());
		wait.waitFor(500);
		doQueryForClickButton(bean);
		
		HostInventoryManagementPage.clickOutStorage();
		wait.waitFor(1000);

		HostInventoryManagementPage.setOutStorage_OutStorageTime(bean.getOutStorageTime());
		HostInventoryManagementPage.selectOutStorage_OutStorageStatus(bean.getOutStorageStatus());
		HostInventoryManagementPage.setOutStorage_OutStorageDirection(bean.getOutStorageDirection());
		HostInventoryManagementPage.setOutStorage_ReciveSection(bean.getReciveSection());
		HostInventoryManagementPage.setOutStorage_Reciver(bean.getReciver());
		wait.waitFor(1000);
		
		HostInventoryManagementPage.clickOutStorage_Confirm();
		wait.waitFor(3000);
		
	}
	@Test(dataProvider="TerminalInventoryManagement_HostInventoryManagementByCaseNO")
	public void testTerminalRegister(TerminalInventoryManagement_HostInventoryManagementBean bean) {
		HostInventoryManagementPage.navigateTo(URL);
		wait.waitFor(500);

		HostInventoryManagementPage.setTerminalSerialNO(bean.getTerminalSerialNO());
		wait.waitFor(500);
		doQueryForClickButton(bean);
		
		HostInventoryManagementPage.clickRegist();
		wait.waitFor(1000);

//		HostInventoryManagementPage.setRegist_TerminalBelongMerchantNO(bean.getTerminalBelongMerchantNO());
//		HostInventoryManagementPage.setRegist_StoreName(bean.getStoreName());
		
		HostInventoryManagementPage.clickRegist_SearchMerchant();
		HostInventoryManagementPage.setRegist_SearchMerchant_MerchantNO(bean.getTerminalBelongMerchantNO());
		HostInventoryManagementPage.clickRegist_SearchMerchant_Confirm();
		wait.waitFor(1000);
		HostInventoryManagementPage.clickRegist_SearchMerchant_MerchantRadio(bean.getRadio());
		HostInventoryManagementPage.clickRegist_SearchMerchant_Submit();
		
		HostInventoryManagementPage.clickRegist_SearchStore();
		HostInventoryManagementPage.setRegist_SearchStore_StoreName(bean.getStoreName());
		HostInventoryManagementPage.clickRegist_SearchStore_Query();
		wait.waitFor(1000);
		HostInventoryManagementPage.clickRegist_SearchStore_StoreRadio(bean.getRadio());
		HostInventoryManagementPage.clickRegist_SearchStore_Submit();
		
		HostInventoryManagementPage.setRegist_RegistDate(bean.getRegistDate());
		HostInventoryManagementPage.setRegist_UnionStandardDistantRegionCode(bean.getUnionStandardDistantRegionCode());
		HostInventoryManagementPage.setRegist_CheckCycle(bean.getCheckCycle());
		HostInventoryManagementPage.setRegist_MaintainManager(bean.getMaintainManager());
		HostInventoryManagementPage.setRegist_InstallAddress(bean.getInstallAddress());
		HostInventoryManagementPage.setRegist_InstallContantPerson(bean.getInstallContantPerson());
		HostInventoryManagementPage.setRegist_InstallContantPersonPhoneNO(bean.getInstallContantPersonPhoneNO());
		HostInventoryManagementPage.setRegist_TelephoneNO(bean.getTelephoneNO());
		HostInventoryManagementPage.setRegist_SIMCardNO(bean.getSIMCardNO());
		
		wait.waitFor(1000);
		
		HostInventoryManagementPage.clickRegist_Regist();
		wait.waitFor(3000);
		
	}
	@Test(dataProvider="TerminalInventoryManagement_HostInventoryManagementByCaseNO")
	public void testTerminalSpecialStore(TerminalInventoryManagement_HostInventoryManagementBean bean) {
		HostInventoryManagementPage.navigateTo(URL);
		wait.waitFor(500);

		HostInventoryManagementPage.setTerminalSerialNO(bean.getTerminalSerialNO());
		wait.waitFor(500);
		doQueryForClickButton(bean);

		HostInventoryManagementPage.clickSpecialEnterStorage();
		wait.waitFor(1000);
		
		HostInventoryManagementPage.setSpecialEnterStorage_EnterStorageTime(bean.getEnterStorageTime());
		HostInventoryManagementPage.setSpecialEnterStorage_EnterStorageSource(bean.getEnterStorageSource());
		
		HostInventoryManagementPage.clickSpecialEnterStorage_SpecialEnterStorage();
		wait.waitFor(3000);
	}
	@Test(dataProvider="TerminalInventoryManagement_HostInventoryManagementByCaseNO")
	public void testTerminalRepair(TerminalInventoryManagement_HostInventoryManagementBean bean) {
		HostInventoryManagementPage.navigateTo(URL);
		wait.waitFor(500);

		HostInventoryManagementPage.setTerminalSerialNO(bean.getTerminalSerialNO());
		wait.waitFor(500);
		doQueryForClickButton(bean);
		
		HostInventoryManagementPage.clickReportFix();
		wait.waitFor(1000);

		HostInventoryManagementPage.clickReportFix_Confirm();
		wait.waitFor(3000);
	}
	@Test(dataProvider="TerminalInventoryManagement_HostInventoryManagementByCaseNO")
	public void testTerminalScrap(TerminalInventoryManagement_HostInventoryManagementBean bean) {
		HostInventoryManagementPage.navigateTo(URL);
		wait.waitFor(500);

		HostInventoryManagementPage.setTerminalSerialNO(bean.getTerminalSerialNO());
		wait.waitFor(500);
		doQueryForClickButton(bean);

		HostInventoryManagementPage.clickScrap();
		wait.waitFor(1000);

		HostInventoryManagementPage.clickScrap_Close();
		wait.waitFor(3000);
	}
	@Test(dataProvider="TerminalInventoryManagement_HostInventoryManagementByCaseNO")
	public void testTerminalAllocatoin(TerminalInventoryManagement_HostInventoryManagementBean bean) {
		HostInventoryManagementPage.navigateTo(URL);
		wait.waitFor(500);

		HostInventoryManagementPage.setTerminalSerialNO(bean.getTerminalSerialNO());
		wait.waitFor(500);
		doQueryForClickButton(bean);
		
		HostInventoryManagementPage.clickAllot();
		wait.waitFor(1000);

		HostInventoryManagementPage.setAllot_AllotTime(bean.getAllotTime());
		HostInventoryManagementPage.selectAllot_AllotOrgnization(bean.getAllotOrgnization());
		HostInventoryManagementPage.setAllot_AllotSection(bean.getAllotSection());
		HostInventoryManagementPage.setAllot_Alloter(bean.getAlloter());
		
		HostInventoryManagementPage.clickAllot_Confirm();
		wait.waitFor(3000);
	}
	@Test(dataProvider="TerminalInventoryManagement_HostInventoryManagementByCaseNO")
	public void testStoreUpdate(TerminalInventoryManagement_HostInventoryManagementBean bean) {
		HostInventoryManagementPage.navigateTo(URL);
		wait.waitFor(500);

		HostInventoryManagementPage.setTerminalSerialNO(bean.getTerminalSerialNO());
		wait.waitFor(500);
		doQueryForClickButton(bean);

		HostInventoryManagementPage.clickEnteredStroageUpdate();
		wait.waitFor(1000);

		HostInventoryManagementPage.setEnteredStorageUpdate_EnteredStorageSource(bean.getEnterStorageSource());
		HostInventoryManagementPage.setEnteredStorageUpdate_StorageBatchNO(bean.getEnterStorageBatchNO());
		HostInventoryManagementPage.setEnteredStorageUpdate_PurchusePrice(bean.getPurchasePrice());
		
		HostInventoryManagementPage.clickEnteredStorageUpdate_Confirm();
		wait.waitFor(3000);
	}
	@Test(dataProvider="TerminalInventoryManagement_HostInventoryManagementByCaseNO")
	public void testDeliverUpdate(TerminalInventoryManagement_HostInventoryManagementBean bean) {
		HostInventoryManagementPage.navigateTo(URL);
		wait.waitFor(500);

		HostInventoryManagementPage.setTerminalSerialNO(bean.getTerminalSerialNO());
		wait.waitFor(500);
		doQueryForClickButton(bean);

		HostInventoryManagementPage.clickOutStroageUpdate();
		wait.waitFor(1000);

		HostInventoryManagementPage.setOutStroageUpdate_OutStorageDirection(bean.getOutStorageDirection());
		HostInventoryManagementPage.setOutStroageUpdate_ReciveSection(bean.getReciveSection());
		HostInventoryManagementPage.setOutStroageUpdate_Reciver(bean.getReciver());
		
		HostInventoryManagementPage.clickOutStroageUpdate_Confirm();
		wait.waitFor(3000);
	}
	
	private void doQueryForClickButton(TerminalInventoryManagement_HostInventoryManagementBean bean) {

		HostInventoryManagementPage.clickQuery();
		wait.waitFor(500);
		HostInventoryManagementPage.clickRadio(bean.getRadio());
		wait.waitFor(500);
	}
}