package com.dy.AutoTest.OperationPlatform.TestCases.MerchantManagementOnLine.OnLineMechantInfo;


import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.dy.AutoTest.OperationPlatform.POJO.MerchantAccountManagementBean;
import com.dy.AutoTest.OperationPlatform.PageObject.MerchantManagementOnLine.OnLineMerchantInfo.MerchantAccountManagementPage;
import com.dy.AutoTest.web.api.SuperTest;
import com.dy.AutoTest.web.business.DataBusiness;

public class MerchantAccountManagementPageTest extends SuperTest{
	MerchantAccountManagementPage MerchantAccountManagementPage;
    String URL;
    
    @BeforeClass
	public void init() {
    	MerchantAccountManagementPage=new MerchantAccountManagementPage(driver);
//    	DemoPage.setWaitTime(800);
		URL=host.toString()+DataBusiness.getData_URL("pop_MerchantAccountManagement");
	}
	
	@DataProvider(name="MerchantAccountManagement")
	protected static Object[][] parametersPool(){
		data.loadDataBeanList("POP_Data_MerchantAccountManagement");
		return data.getDataBeanArray();
	}
	
	@Test(dataProvider="MerchantAccountManagement")
	public void testMerchantAccountManagementSearch(MerchantAccountManagementBean MerchantAccountManagementBean) {
		MerchantAccountManagementPage.navigateTo(URL);
		wait.waitFor(1500);
		
		MerchantAccountManagementPage.clickAdvance();
		wait.waitFor(1000);
		
		
		doSearchMerchant(MerchantAccountManagementBean.getMerchantNO(),
				MerchantAccountManagementBean.getMerchantName(), MerchantAccountManagementBean.getSearchMer_Radio());
		MerchantAccountManagementPage.clickQurey();
		wait.waitFor(1000);
		MerchantAccountManagementPage.doPageDown();
		wait.waitFor(1000);
		MerchantAccountManagementPage.doPageUp();
		wait.waitFor(500);
		MerchantAccountManagementPage.clickReset();
		
		
		if(!MerchantAccountManagementBean.getAccountNO().equals("")) {
			MerchantAccountManagementPage.setAccountNO(MerchantAccountManagementBean.getAccountNO());
			MerchantAccountManagementPage.clickQurey();
			wait.waitFor(1000);
			MerchantAccountManagementPage.doPageDown();
			wait.waitFor(1000);
			MerchantAccountManagementPage.doPageUp();
			wait.waitFor(500);
			MerchantAccountManagementPage.clickReset();
		}
		
		
		if(!MerchantAccountManagementBean.getMerType().equals("")) {
			MerchantAccountManagementPage.selectMerType(MerchantAccountManagementBean.getMerType());
			MerchantAccountManagementPage.clickQurey();
			wait.waitFor(1000);
			MerchantAccountManagementPage.doPageDown();
			wait.waitFor(1000);
			MerchantAccountManagementPage.doPageUp();
			wait.waitFor(500);
			MerchantAccountManagementPage.clickReset();
		}
		
		
		if(!MerchantAccountManagementBean.getAccountType().equals("")) {
			MerchantAccountManagementPage.selectAccountType(MerchantAccountManagementBean.getAccountType());
			MerchantAccountManagementPage.clickQurey();
			wait.waitFor(1000);
			MerchantAccountManagementPage.doPageDown();
			wait.waitFor(1000);
			MerchantAccountManagementPage.doPageUp();
			wait.waitFor(500);
			MerchantAccountManagementPage.clickReset();
		}
		
		
		if(!MerchantAccountManagementBean.getMerStatus().equals("")) {
			MerchantAccountManagementPage.selectMerStatus(MerchantAccountManagementBean.getMerStatus());
			MerchantAccountManagementPage.clickQurey();
			wait.waitFor(1000);
			MerchantAccountManagementPage.doPageDown();
			wait.waitFor(1000);
			MerchantAccountManagementPage.doPageUp();
			wait.waitFor(500);
			MerchantAccountManagementPage.clickReset();
		}
		
		
		
		if(!MerchantAccountManagementBean.getAccountStatus().equals("")) {
			MerchantAccountManagementPage.selectAccountStatus(MerchantAccountManagementBean.getAccountStatus());
			MerchantAccountManagementPage.clickQurey();
			wait.waitFor(1000);
			MerchantAccountManagementPage.doPageDown();
			wait.waitFor(1000);
			MerchantAccountManagementPage.doPageUp();
			wait.waitFor(500);
			MerchantAccountManagementPage.clickReset();
		}
		
	}
	
	@Test(dataProvider="MerchantAccountManagement")
	public void testMerchantAccountManagementFrozen(MerchantAccountManagementBean MerchantAccountManagementBean) {
		MerchantAccountManagementPage.navigateTo(URL);
		wait.waitFor(1000);
		
		
		doSearchMerchant(MerchantAccountManagementBean.getMerchantNO(),
				MerchantAccountManagementBean.getMerchantName(), MerchantAccountManagementBean.getSearchMer_Radio());
		MerchantAccountManagementPage.clickQurey();
		wait.waitFor(1000);
		
		MerchantAccountManagementPage.clickRadio(MerchantAccountManagementBean.getRadio());
		wait.waitFor(500);
		MerchantAccountManagementPage.clickFrozen();
		wait.waitFor(500);
		MerchantAccountManagementPage.clickFrozen_Confirm();
		wait.waitFor(1000);
		
		
		MerchantAccountManagementPage.clickRadio(MerchantAccountManagementBean.getRadio());
		wait.waitFor(500);
		MerchantAccountManagementPage.clickUnfrozen();
		wait.waitFor(500);
		MerchantAccountManagementPage.clickUnfrozen_Confirm();
		wait.waitFor(1000);
	}
	
}
