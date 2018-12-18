package com.dy.AutoTest.OperationPlatform.TestCases.OnlineRiskControl.BlackWhiteListManagement;

import static org.testng.Assert.assertTrue;

import java.lang.reflect.Method;

import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.dy.AutoTest.web.api.SuperTest;
import com.dy.AutoTest.OperationPlatform.PageObject.OnlineRiskControl.BlackWhiteListManagement.BlackListMaintainPage;
import com.dy.AutoTest.OperationPlatform.POJO.BlackWhiteListManagement_BlackListMaintainBean;
import com.dy.AutoTest.web.business.DataBusiness;

public class BlackListMaintainPageTest extends SuperTest{
	BlackListMaintainPage BlackListMaintainPage;
	String URL;

	@BeforeClass
	public void init() {
		/******** instant objectPage *********/
		BlackListMaintainPage=new BlackListMaintainPage(driver);
		//BlackListMaintainPage.setWaitTime(800);

		/******** set URL *********/
		URL=host.toString()+DataBusiness.getData_URL("pop_BlackWhiteListManagement_BlackListMaintain");

		/******** instant Interface *********/
		iQuery=BlackListMaintainPage;
//		iClickButton=BlackListMaintainPage;
//		iClickRadio=BlackListMaintainPage;
//		iSearchMerchantByNOorName=BlackListMaintainPage;
	}

	@DataProvider(name="BlackWhiteListManagement_BlackListMaintain")
	protected static Object[][] parametersPool(){
		data.loadDataBeanList("POP_Data_BlackWhiteListManagement_BlackListMaintain");
		return data.getDataBeanArray();
	}

	@DataProvider(name="BlackWhiteListManagement_BlackListMaintainByCaseNO")
	protected static Object[][] parametersPool(Method method){
		data.loadDataBeanList("POP_Data_BlackWhiteListManagement_BlackListMaintain",method.getName());
		return data.getDataBeanArray();
	}

	@Test(dataProvider="BlackWhiteListManagement_BlackListMaintainByCaseNO")
	public void testQuery(BlackWhiteListManagement_BlackListMaintainBean bblmBean) {
		BlackListMaintainPage.navigateTo(URL);
		wait.waitFor(500);
		
		if(!bblmBean.getPhoneOrMerchantNO().equals("")) {
			BlackListMaintainPage.setPhoneOrMerchantNO(bblmBean.getPhoneOrMerchantNO());
			doQuery();
		}
		if(!bblmBean.getDateBegin().equals("")&&!bblmBean.getDateEnd().equals("")) {
			BlackListMaintainPage.setDateBegin(bblmBean.getDateBegin());
			BlackListMaintainPage.setDateEnd(bblmBean.getDateEnd());
			doQuery();
		}
		if(!bblmBean.getReleaseStatus().equals("")) {
			BlackListMaintainPage.selectReleaseStatus(bblmBean.getReleaseStatus());
			doQuery();
		}
	}
	
	
	@Test(dataProvider="BlackWhiteListManagement_BlackListMaintainByCaseNO")
	public void testRelease(BlackWhiteListManagement_BlackListMaintainBean bblmBean) {
		BlackListMaintainPage.navigateTo(URL);
		wait.waitFor(500);
		
		doQueryForClickButton(bblmBean);
		
		BlackListMaintainPage.clickRelease();
		wait.waitFor(1000);
//		BlackListMaintainPage.clickRelease_Confirm();
//		System.out.println(BlackListMaintainPage.getNotice());
//		Reporter.log(BlackListMaintainPage.getNotice());
		BlackListMaintainPage.clickRelease_Close();
	}
	
	@Test(dataProvider="BlackWhiteListManagement_BlackListMaintainByCaseNO")
	public void testAdd(BlackWhiteListManagement_BlackListMaintainBean bblmBean) {
		BlackListMaintainPage.navigateTo(URL);
		wait.waitFor(500);
		
		
		if(bblmBean.getAddReason().equals("")) {
			System.out.println("加入理由为必输项，不能为空。Please check field \"AddReason\"");
			Reporter.log("加入理由为必输项，不能为空。Please check field \"AddReason\"");
			assertTrue(false);
		}
		if(bblmBean.getDateBegin().equals("")||bblmBean.getDateEnd().equals("")) {
			System.out.println("生效日期为必输项，不能为空。Please check field \"DateBegin\", \"DateEnd\"");
			Reporter.log("生效日期为必输项，不能为空。Please check field \"DateBegin\", \"DateEnd\"");
			assertTrue(false);
		}
		
		BlackListMaintainPage.clickAdd();
		if(!bblmBean.getPersonalEnterpraiseStatus().equals("")) {
			BlackListMaintainPage.selectAdd_PersonalEnterpraiseStatus(bblmBean.getPersonalEnterpraiseStatus());
		}if(!bblmBean.getPhoneOrMerchantNO().equals("")) {
			BlackListMaintainPage.setAdd_PhoneOrMerchantNO(bblmBean.getPhoneOrMerchantNO());
		}if(!bblmBean.getPersonalName().equals("")) {
			BlackListMaintainPage.setAdd_PersonalName(bblmBean.getPersonalName());
		}if(!bblmBean.getPersonalIDType().equals("")) {
			BlackListMaintainPage.selectAdd_PersonalIDType(bblmBean.getPersonalIDType());
		}if(!bblmBean.getPersonalID().equals("")) {
			BlackListMaintainPage.setAdd_PersonalID(bblmBean.getPersonalID());
		}if(!bblmBean.getBankAccountName().equals("")) {
			BlackListMaintainPage.setAdd_BankAccountName(bblmBean.getBankAccountName());
		}if(!bblmBean.getBankAccountNO().equals("")) {
			BlackListMaintainPage.setAdd_BankAccountNO(bblmBean.getBankAccountNO());
		}
		BlackListMaintainPage.setAdd_AddReason(bblmBean.getAddReason());
		BlackListMaintainPage.setAdd_DateBegin(bblmBean.getDateBegin());
		BlackListMaintainPage.setAdd_DateEnd(bblmBean.getDateEnd());
		BlackListMaintainPage.doLoseFocus("Add_DateEnd", 120, 0);
		
//		BlackListMaintainPage.clickAdd_Submit();
//		System.out.println(BlackListMaintainPage.getNotice());
//		Reporter.log(BlackListMaintainPage.getNotice());
		BlackListMaintainPage.clickAdd_Close();
	}
	
	
	
	
	public void doQueryForClickButton(BlackWhiteListManagement_BlackListMaintainBean bblmBean) {
		if(!bblmBean.getPhoneOrMerchantNO().equals("")) {
			BlackListMaintainPage.setPhoneOrMerchantNO(bblmBean.getPhoneOrMerchantNO());
		}
		if(!bblmBean.getDateBegin().equals("")&&!bblmBean.getDateEnd().equals("")) {
			BlackListMaintainPage.setDateBegin(bblmBean.getDateBegin());
			BlackListMaintainPage.setDateEnd(bblmBean.getDateEnd());
		}
		if(!bblmBean.getReleaseStatus().equals("")) {
			BlackListMaintainPage.selectReleaseStatus(bblmBean.getReleaseStatus());
		}
		BlackListMaintainPage.clickQuery();
		wait.waitFor(500);
		BlackListMaintainPage.clickRadio(bblmBean.getRadio());
		wait.waitFor(500);
	}
}