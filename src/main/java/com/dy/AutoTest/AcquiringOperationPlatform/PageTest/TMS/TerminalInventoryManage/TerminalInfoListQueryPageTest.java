package com.dy.AutoTest.AcquiringOperationPlatform.PageTest.TMS.TerminalInventoryManage;

import static org.testng.Assert.assertTrue;

import java.lang.reflect.Method;

import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.dy.AutoTest.web.api.SuperTest;
import com.dy.AutoTest.AcquiringOperationPlatform.PageObject.TMS.TerminalInventoryManage.TerminalInfoListQueryPage;
import com.dy.AutoTest.AcquiringOperationPlatform.POJO.TerminalInventoryManage_TerminalInfoListQueryBean;
import com.dy.AutoTest.web.business.DataBusiness;

public class TerminalInfoListQueryPageTest extends SuperTest{
	TerminalInfoListQueryPage TerminalInfoListQueryPage;
	String URL;

	@BeforeClass
	public void init() {
		/******** instant objectPage *********/
		TerminalInfoListQueryPage=new TerminalInfoListQueryPage(driver);
		//TerminalInfoListQueryPage.setWaitTime(800);

		/******** set URL *********/
		URL=host.toString()+DataBusiness.getData_URL("aop_TerminalInventoryManage_TerminalInfoListQuery");

		/******** instant Interface *********/
		iQuery=TerminalInfoListQueryPage;
//		iClickButton=TerminalInfoListQueryPage;
//		iClickRadio=TerminalInfoListQueryPage;
//		iSearchMerchant=TerminalInfoListQueryPage;
	}

	@DataProvider(name="TerminalInventoryManage_TerminalInfoListQuery")
	protected static Object[][] parametersPool(){
		data.loadDataBeanList("AOP_Data_TerminalInventoryManage_TerminalInfoListQuery",TerminalInventoryManage_TerminalInfoListQueryBean.class);
		return data.getDataBeanArray();
	}

	@DataProvider(name="TerminalInventoryManage_TerminalInfoListQueryByCaseNO")
	protected static Object[][] parametersPool(Method method){
		data.loadDataBeanList("AOP_Data_TerminalInventoryManage_TerminalInfoListQuery",method.getName(),TerminalInventoryManage_TerminalInfoListQueryBean.class);
		return data.getDataBeanArray();
	}

	@Test(dataProvider="TerminalInventoryManage_TerminalInfoListQueryByCaseNO")
	public void testQuery(TerminalInventoryManage_TerminalInfoListQueryBean bean) {
		TerminalInfoListQueryPage.navigateTo(URL);
		wait.waitFor(500);
		if(!bean.getMerchantNO().equals("")) {
			TerminalInfoListQueryPage.setMerchantNO(bean.getMerchantNO());
			doQuery();
		}
		if(!bean.getTerminalNO().equals("")) {
			TerminalInfoListQueryPage.setTerminalNO(bean.getTerminalNO());
			doQuery();
		}
		if(!bean.getTerminalSerialNO().equals("")) {
			TerminalInfoListQueryPage.setTerminalSerialNO(bean.getTerminalSerialNO());
			doQuery();
		}
		if(!bean.getMaintainManager().equals("")) {
			TerminalInfoListQueryPage.setMaintainManager(bean.getMaintainManager());
			doQuery();
		}
		if(!bean.getStoreName().equals("")) {
			TerminalInfoListQueryPage.setStoreName(bean.getStoreName());
			doQuery();
		}
		if(!bean.getUseStatus().equals("")) {
			TerminalInfoListQueryPage.selectUseStatus(bean.getUseStatus());
			doQuery();
		}
		if(!bean.getSuperiorMerchantNO().equals("")) {
			TerminalInfoListQueryPage.setSuperiorMerchantNO(bean.getSuperiorMerchantNO());
			doQuery();
		}
		if(!bean.getSuperiorMerchantName().equals("")) {
			TerminalInfoListQueryPage.setSuperiorMerchantName(bean.getSuperiorMerchantName());
			doQuery();
		}
		if(!bean.getAgentNO().equals("")) {
			TerminalInfoListQueryPage.setAgentNO(bean.getAgentNO());
			doQuery();
		}
		if(!bean.getAgentName().equals("")) {
			TerminalInfoListQueryPage.setAgentName(bean.getAgentName());
			doQuery();
		}
		if(!bean.getBelongOrgnization().equals("")) {
			TerminalInfoListQueryPage.selectBelongOrgnization(bean.getBelongOrgnization());
			doQuery();
		}
		if(!bean.getBelongProvince().equals("")) {
			TerminalInfoListQueryPage.selectBelongProvince(bean.getBelongProvince());
			doQuery();
		}
		if(!bean.getBelongProvince().equals("")&&!bean.getBelongCity().equals("")) {
			TerminalInfoListQueryPage.selectBelongProvince(bean.getBelongProvince());
			TerminalInfoListQueryPage.selectBelongCity(bean.getBelongCity());
			doQuery();
		}
		if(!bean.getSignStatus().equals("")) {
			TerminalInfoListQueryPage.selectSignStatus(bean.getSignStatus());
			doQuery();
		}
	}
	@Test(dataProvider="TerminalInventoryManage_TerminalInfoListQueryByCaseNO")
	public void testCheck(TerminalInventoryManage_TerminalInfoListQueryBean bean) {
		TerminalInfoListQueryPage.navigateTo(URL);
		wait.waitFor(500);
		doQueryForClickButton(bean);
		TerminalInfoListQueryPage.clickCheck();
		wait.waitFor(2000);
		TerminalInfoListQueryPage.clickCheck_Close();
	}
	@Test(dataProvider="TerminalInventoryManage_TerminalInfoListQueryByCaseNO")
	public void testDelete(TerminalInventoryManage_TerminalInfoListQueryBean bean) {
		TerminalInfoListQueryPage.navigateTo(URL);
		wait.waitFor(500);
		doQueryForClickButton(bean);
		TerminalInfoListQueryPage.clickDelete();
		wait.waitFor(1000);
//		TerminalInfoListQueryPage.clickDelete_Confirm();
//		System.out.println(TerminalInfoListQueryPage.getNotice());
//		Reporter.log(TerminalInfoListQueryPage.getNotice()); 
		TerminalInfoListQueryPage.clickDelete_Close();
	}
	@Test(dataProvider="TerminalInventoryManage_TerminalInfoListQueryByCaseNO")
	public void testUpdate(TerminalInventoryManage_TerminalInfoListQueryBean bean) {
		TerminalInfoListQueryPage.navigateTo(URL);
		wait.waitFor(500);
		doQueryForClickButton(bean);
		TerminalInfoListQueryPage.clickUpdate();
		wait.waitFor(1000);
//		判断update字段是否为空
		if(!bean.getUpdate_SearchStore_StoreName().equals("")) {
			doSearchStore(bean);
		}
		if(!bean.getUpdate_EquipmentStatus().equals("")) {
			TerminalInfoListQueryPage.selectUpdate_EquipmentStatus(bean.getUpdate_EquipmentStatus());
		}
		if(!bean.getUpdate_EquipmentBelong().equals("")) {
			TerminalInfoListQueryPage.selectUpdate_EquipmentBelong(bean.getUpdate_EquipmentBelong());
		}
		if(!bean.getUpdate_EquipmentType().equals("")) {
			TerminalInfoListQueryPage.selectUpdate_EquipmentType(bean.getUpdate_EquipmentType());
		}
		if(!bean.getUpdate_Name().equals("")) {
			TerminalInfoListQueryPage.setUpdate_Name(bean.getUpdate_Name());
		}
		if(!bean.getUpdate_BelongProvince().equals("")) {
			TerminalInfoListQueryPage.selectUpdate_BelongProvince(bean.getUpdate_BelongProvince());
		}
		if(!bean.getUpdate_BelongProvince().equals("")&&!bean.getUpdate_BelongCity().equals("")) {
			TerminalInfoListQueryPage.selectUpdate_BelongCity(bean.getUpdate_BelongCity());
		}
		if(!bean.getUpdate_InstallDate().equals("")) {
			TerminalInfoListQueryPage.setUpdate_InstallDate(bean.getUpdate_InstallDate());
		}
		if(!bean.getUpdate_CheckCircle().equals("")) {
			TerminalInfoListQueryPage.setUpdate_CheckCircle(bean.getUpdate_CheckCircle());
		}
		if(!bean.getUpdate_AllowCurrency().equals("")) {
			TerminalInfoListQueryPage.selectUpdate_AllowCurrency(bean.getUpdate_AllowCurrency());
		}
		if(!bean.getUpdate_TerminalRightControlInfo().equals("")) {
			TerminalInfoListQueryPage.selectUpdate_TerminalRightControlInfo(bean.getUpdate_TerminalRightControlInfo());
		}
//		if(!bean.getUpdate_Explain().equals("")) {
//			TerminalInfoListQueryPage.setUpdate_Explain(bean.getUpdate_Explain());
//		}
		if(!bean.getUpdate_TelephoneNO().equals("")) {
			TerminalInfoListQueryPage.setUpdate_TelephoneNO(bean.getUpdate_TelephoneNO());
		}
		if(!bean.getUpdate_SIMCardNO().equals("")) {
			TerminalInfoListQueryPage.setUpdate_SIMCardNO(bean.getUpdate_SIMCardNO());
		}
		if(!bean.getUpdate_UnionStandardArea().equals("")) {
			TerminalInfoListQueryPage.setUpdate_UnionStandardArea(bean.getUpdate_UnionStandardArea());
		}
		if(!bean.getUpdate_OnlineRefundSign().equals("")) {
			TerminalInfoListQueryPage.selectUpdate_OnlineRefundSign(bean.getUpdate_OnlineRefundSign());
		}
		if(!bean.getUpdate_CTerminalAccessAppreciationServices().equals("")) {
			TerminalInfoListQueryPage.selectUpdate_CTerminalAccessAppreciationServices(bean.getUpdate_CTerminalAccessAppreciationServices());
		}
		if(!bean.getUpdate_MaintainManager().equals("")) {
			TerminalInfoListQueryPage.setUpdate_MaintainManager(bean.getUpdate_MaintainManager());
		}
		
		wait.waitFor(2000);
//		TerminalInfoListQueryPage.clickUpdate_Submit();
//		System.out.println(TerminalInfoListQueryPage.getNotice());
//		Reporter.log(TerminalInfoListQueryPage.getNotice());
		TerminalInfoListQueryPage.clickUpdate_Close();
	}

	public void doQueryForClickButton(TerminalInventoryManage_TerminalInfoListQueryBean bean) {
		if(!bean.getMerchantNO().equals("")) {
			TerminalInfoListQueryPage.setMerchantNO(bean.getMerchantNO());
		}
		if(!bean.getTerminalNO().equals("")) {
			TerminalInfoListQueryPage.setTerminalNO(bean.getTerminalNO());
		}
		if(!bean.getTerminalSerialNO().equals("")) {
			TerminalInfoListQueryPage.setTerminalSerialNO(bean.getTerminalSerialNO());
		}
		if(!bean.getMaintainManager().equals("")) {
			TerminalInfoListQueryPage.setMaintainManager(bean.getMaintainManager());
		}
		if(!bean.getStoreName().equals("")) {
			TerminalInfoListQueryPage.setStoreName(bean.getStoreName());
		}
		if(!bean.getUseStatus().equals("")) {
			TerminalInfoListQueryPage.selectUseStatus(bean.getUseStatus());
		}
		if(!bean.getSuperiorMerchantNO().equals("")) {
			TerminalInfoListQueryPage.setSuperiorMerchantNO(bean.getSuperiorMerchantNO());
		}
		if(!bean.getSuperiorMerchantName().equals("")) {
			TerminalInfoListQueryPage.setSuperiorMerchantName(bean.getSuperiorMerchantName());
		}
		if(!bean.getAgentNO().equals("")) {
			TerminalInfoListQueryPage.setAgentNO(bean.getAgentNO());
		}
		if(!bean.getAgentName().equals("")) {
			TerminalInfoListQueryPage.setAgentName(bean.getAgentName());
		}
		if(!bean.getBelongOrgnization().equals("")) {
			TerminalInfoListQueryPage.selectBelongOrgnization(bean.getBelongOrgnization());
		}
		if(!bean.getBelongProvince().equals("")) {
			TerminalInfoListQueryPage.selectBelongProvince(bean.getBelongProvince());
		}
		if(!bean.getBelongProvince().equals("")&&!bean.getBelongCity().equals("")) {
			TerminalInfoListQueryPage.selectBelongCity(bean.getBelongCity());
		}
		if(!bean.getSignStatus().equals("")) {
			TerminalInfoListQueryPage.selectSignStatus(bean.getSignStatus());
		}
		TerminalInfoListQueryPage.clickQuery();
		wait.waitFor(500);
		TerminalInfoListQueryPage.clickRadio(bean.getRadio());
		wait.waitFor(500);
	}
	
	//搜门店
	public void doSearchStore(TerminalInventoryManage_TerminalInfoListQueryBean bean) {
		TerminalInfoListQueryPage.clickUpdate_SearchStore();
		TerminalInfoListQueryPage.setUpdate_SearchStore_StoreName(bean.getUpdate_SearchStore_StoreName());
		TerminalInfoListQueryPage.clickUpdate_SearchStore_Query();
		wait.waitFor(800);
		try {
			TerminalInfoListQueryPage.isUpdate_SearchStore_RadioDisplayed(bean.getUpdate_SearchStore_Radio());
		} catch (Exception e) {
			TerminalInfoListQueryPage.clickUpdate_SearchStore_Close();
			wait.waitFor(1000);
			System.out.println("搜门店 该门店数据不存在，Please Check TestData !");
			Reporter.log("搜门店 该门店名数据不存在，Please Check TestData !");
			assertTrue(false);
		}
		TerminalInfoListQueryPage.clickUpdate_SearchStore_Radio(bean.getUpdate_SearchStore_Radio());
		TerminalInfoListQueryPage.clickUpdate_SearchStore_Submit();
	}
}