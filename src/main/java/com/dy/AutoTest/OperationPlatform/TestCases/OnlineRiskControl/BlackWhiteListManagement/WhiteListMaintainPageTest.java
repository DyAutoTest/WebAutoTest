package com.dy.AutoTest.OperationPlatform.TestCases.OnlineRiskControl.BlackWhiteListManagement;

import static org.testng.Assert.assertTrue;

import java.lang.reflect.Method;

import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.dy.AutoTest.web.api.SuperTest;
import com.dy.AutoTest.OperationPlatform.PageObject.OnlineRiskControl.BlackWhiteListManagement.WhiteListMaintainPage;
import com.dy.AutoTest.OperationPlatform.POJO.BlackWhiteListManagement_WhiteListMaintainBean;
import com.dy.AutoTest.web.business.DataBusiness;

public class WhiteListMaintainPageTest extends SuperTest{
	WhiteListMaintainPage WhiteListMaintainPage;
	String URL;

	@BeforeClass
	public void init() {
		/******** instant objectPage *********/
		WhiteListMaintainPage=new WhiteListMaintainPage(driver);
		//WhiteListMaintainPage.setWaitTime(800);

		/******** set URL *********/
		URL=host.toString()+DataBusiness.getData_URL("pop_BlackWhiteListManagement_WhiteListMaintain");

		/******** instant Interface *********/
		iQuery=WhiteListMaintainPage;
//		iClickButton=WhiteListMaintainPage;
//		iClickRadio=WhiteListMaintainPage;
//		iSearchMerchantByNOorName=WhiteListMaintainPage;
	}

	@DataProvider(name="BlackWhiteListManagement_WhiteListMaintain")
	protected static Object[][] parametersPool(){
		data.loadDataBeanList("POP_Data_BlackWhiteListManagement_WhiteListMaintain");
		return data.getDataBeanArray();
	}

	@DataProvider(name="BlackWhiteListManagement_WhiteListMaintainByCaseNO")
	protected static Object[][] parametersPool(Method method){
		data.loadDataBeanList("POP_Data_BlackWhiteListManagement_WhiteListMaintain",method.getName());
		return data.getDataBeanArray();
	}

	@Test(dataProvider="BlackWhiteListManagement_WhiteListMaintainByCaseNO")
	public void testQuery(BlackWhiteListManagement_WhiteListMaintainBean bwlmBean) {
		WhiteListMaintainPage.navigateTo(URL);
		wait.waitFor(500);
		
		if(!bwlmBean.getPhoneOrMerchantNO().equals("")) {
			WhiteListMaintainPage.setPhoneOrMerchantNO(bwlmBean.getPhoneOrMerchantNO());
			doQuery();
		}
		if(!bwlmBean.getTradeType().equals("")) {
			WhiteListMaintainPage.selectTradeType(bwlmBean.getTradeType());
			doQuery();
		}
		if(!bwlmBean.getDateBegin().equals("")&&!bwlmBean.getDateEnd().equals("")) {
			WhiteListMaintainPage.setDateBegin(bwlmBean.getDateBegin());
			WhiteListMaintainPage.setDateEnd(bwlmBean.getDateEnd());
			doQuery();
		}
		if(!bwlmBean.getReleaseStatus().equals("")) {
			WhiteListMaintainPage.selectReleaseStatus(bwlmBean.getReleaseStatus());
			doQuery();
		}
	}
	
	@Test(dataProvider="BlackWhiteListManagement_WhiteListMaintainByCaseNO")
	public void testRelease(BlackWhiteListManagement_WhiteListMaintainBean bwlmBean) {
		WhiteListMaintainPage.navigateTo(URL);
		wait.waitFor(500);
		
		doQueryForClickButton(bwlmBean);
		
		WhiteListMaintainPage.clickRelease();
		wait.waitFor(1000);
//		WhiteListMaintainPage.clickRelease_Confirm();
//		System.out.println(WhiteListMaintainPage.getNotice());
//		Reporter.log(WhiteListMaintainPage.getNotice());
		WhiteListMaintainPage.clickRelease_Close();
	}
	
	
	@Test(dataProvider="BlackWhiteListManagement_WhiteListMaintainByCaseNO")
	public void testAdd(BlackWhiteListManagement_WhiteListMaintainBean bwlmBean) {
		WhiteListMaintainPage.navigateTo(URL);
		wait.waitFor(500);
		
		if(bwlmBean.getPhoneOrMerchantNO().equals("")) {
			System.out.println("手机号/商户号为必输项，不能为空。Please check field \"PhoneOrMerchantNO\"");
			Reporter.log("手机号/商户号为必输项，不能为空。Please check field \"PhoneOrMerchantNO\"");
			assertTrue(false);
		}
		if(bwlmBean.getTradeType().equals("")) {
			System.out.println("交易类型为必输项，不能为空。Please check field \"TradeType\"");
			Reporter.log("交易类型为必输项，不能为空。Please check field \"TradeType\"");
			assertTrue(false);
		}
		if(bwlmBean.getAddReason().equals("")) {
			System.out.println("加入理由为必输项，不能为空。Please check field \"AddReason\"");
			Reporter.log("加入理由为必输项，不能为空。Please check field \"AddReason\"");
			assertTrue(false);
		}
		if(bwlmBean.getDateBegin().equals("")||bwlmBean.getDateEnd().equals("")) {
			System.out.println("生效日期为必输项，不能为空。Please check field \"DateBegin\", \"DateEnd\"");
			Reporter.log("生效日期为必输项，不能为空。Please check field \"DateBegin\", \"DateEnd\"");
			assertTrue(false);
		}
		
		
		WhiteListMaintainPage.clickAdd();
		if(!bwlmBean.getPersonalEnterpraiseStatus().equals("")) {
			WhiteListMaintainPage.selectAdd_PersonalEnterpraiseStatus(bwlmBean.getPersonalEnterpraiseStatus());
		}
		WhiteListMaintainPage.setAdd_PhoneOrMerchantNO(bwlmBean.getPhoneOrMerchantNO());
		WhiteListMaintainPage.selectAdd_TradeType(bwlmBean.getTradeType());
		WhiteListMaintainPage.setAdd_AddReason(bwlmBean.getAddReason());
		WhiteListMaintainPage.setAdd_DateBegin(bwlmBean.getDateBegin());
		WhiteListMaintainPage.setAdd_DateEnd(bwlmBean.getDateEnd());
		WhiteListMaintainPage.doLoseFocus("Add_DateEnd", 120, 0);
		wait.waitFor(2000);
//		WhiteListMaintainPage.clickAdd_Submit();
//		System.out.println(WhiteListMaintainPage.getNotice());
//		Reporter.log(WhiteListMaintainPage.getNotice());
		WhiteListMaintainPage.clickAdd_Close();
	}
	
	
	
	
	
	public void doQueryForClickButton(BlackWhiteListManagement_WhiteListMaintainBean bwlmBean) {
		if(!bwlmBean.getPhoneOrMerchantNO().equals("")) {
			WhiteListMaintainPage.setPhoneOrMerchantNO(bwlmBean.getPhoneOrMerchantNO());
		}
		if(!bwlmBean.getTradeType().equals("")) {
			WhiteListMaintainPage.selectTradeType(bwlmBean.getTradeType());
		}
		if(!bwlmBean.getDateBegin().equals("")&&!bwlmBean.getDateEnd().equals("")) {
			WhiteListMaintainPage.setDateBegin(bwlmBean.getDateBegin());
			WhiteListMaintainPage.setDateEnd(bwlmBean.getDateEnd());
		}
		if(!bwlmBean.getReleaseStatus().equals("")) {
			WhiteListMaintainPage.selectReleaseStatus(bwlmBean.getReleaseStatus());
		}
		WhiteListMaintainPage.clickQuery();
		wait.waitFor(500);
		WhiteListMaintainPage.clickRadio(bwlmBean.getRadio());
		wait.waitFor(500);
	}
}