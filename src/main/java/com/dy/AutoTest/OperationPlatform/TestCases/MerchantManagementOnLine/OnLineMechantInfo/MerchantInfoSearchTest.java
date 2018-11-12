package com.dy.AutoTest.OperationPlatform.TestCases.MerchantManagementOnLine.OnLineMechantInfo;

import static org.testng.Assert.assertTrue;

import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.dy.AutoTest.OperationPlatform.POJO.MerchantInfoSearchBean;
import com.dy.AutoTest.OperationPlatform.PageObject.MerchantManagementOnLine.OnLineMerchantInfo.MerchantInfoSearchPage;
import com.dy.AutoTest.OperationPlatform.TestCases.SuperTest;
import com.dy.AutoTest.web.business.DataBusiness;


public class MerchantInfoSearchTest extends SuperTest{
	MerchantInfoSearchPage MerchantInfoSearchPage;
    String URL;
    
    @BeforeClass
	public void init() {
    	MerchantInfoSearchPage=new MerchantInfoSearchPage(driver);
    	MerchantInfoSearchPage.setWaitTime(1000);
		URL=host.toString()+DataBusiness.getData_URL("pop_MerchantInfoSearch");
	}
	
	@DataProvider(name="MerchantInfo")
	protected static Object[][] parametersPool(){
		data.loadDataBeanList("POP_Data_MerchantInfoSearch");
		return data.getDataBeanArray();
	}
	
	@Test(dataProvider="MerchantInfo",description="线上运营平台-商户资料查询")
	public void testMerchantInfoSearch(MerchantInfoSearchBean MerchantInfoSearchBean) {
		MerchantInfoSearchPage.navigateTo(URL);
		
		MerchantInfoSearchPage.doAdvance();
		
		if(!MerchantInfoSearchBean.getMerchantNO().equals("")) {
			MerchantInfoSearchPage.setMerchantNO(MerchantInfoSearchBean.getMerchantNO());
			MerchantInfoSearchPage.doQuery();
			wait.waitFor(1500);
			MerchantInfoSearchPage.doReset();
		}
		
		if(!MerchantInfoSearchBean.getMerchantName().equals("")) {
			MerchantInfoSearchPage.setMerchantName(MerchantInfoSearchBean.getMerchantName(),MerchantInfoSearchBean.getSearchMerchant_Index());
			MerchantInfoSearchPage.doQuery();
			wait.waitFor(1500);
			MerchantInfoSearchPage.doReset();
		}
		
		if(!MerchantInfoSearchBean.getMerchantType().equals("")) {
			MerchantInfoSearchPage.setMerchantType(MerchantInfoSearchBean.getMerchantType());
			MerchantInfoSearchPage.doQuery();
			wait.waitFor(1500);
			MerchantInfoSearchPage.doReset();
		}
		
		if(!MerchantInfoSearchBean.getStartDate().equals("")&&!MerchantInfoSearchBean.getEndDate().equals("")) {
			MerchantInfoSearchPage.setStartDate(MerchantInfoSearchBean.getStartDate());
			MerchantInfoSearchPage.setEndDate(MerchantInfoSearchBean.getEndDate());
			MerchantInfoSearchPage.doLoseFocus("EndDate", 0, -50);
			MerchantInfoSearchPage.doQuery();
			wait.waitFor(1500);
			MerchantInfoSearchPage.doReset();
		}
		
		if(!MerchantInfoSearchBean.getMerchantStatus().equals("")) {
			MerchantInfoSearchPage.setMerchantStatus(MerchantInfoSearchBean.getMerchantStatus());
			MerchantInfoSearchPage.doQuery();
			wait.waitFor(1500);
			MerchantInfoSearchPage.doReset();
		}
		
		if(!MerchantInfoSearchBean.getProvince().equals("")&&!MerchantInfoSearchBean.getCity().equals("")) {
			MerchantInfoSearchPage.setProvince(MerchantInfoSearchBean.getProvince());
			MerchantInfoSearchPage.setCity(MerchantInfoSearchBean.getCity());
			MerchantInfoSearchPage.doQuery();
			wait.waitFor(1500);
			MerchantInfoSearchPage.doReset();
		}
	}
	
	@Test(dataProvider="MerchantInfo",description="线上运营平台-商户资料查看详情")
	public void testMerchantInfoDetail(MerchantInfoSearchBean MerchantInfoSearchBean) {
		MerchantInfoSearchPage.navigateTo(URL);
		wait.waitFor(1000);
		
		if(!MerchantInfoSearchBean.getMerchantNO().equals("")) {
			MerchantInfoSearchPage.setMerchantNO(MerchantInfoSearchBean.getMerchantNO());
			MerchantInfoSearchPage.doQuery();
			wait.waitFor(1500);
		}else if(!MerchantInfoSearchBean.getMerchantName().equals("")) {
			MerchantInfoSearchPage.setMerchantName(MerchantInfoSearchBean.getMerchantName(),MerchantInfoSearchBean.getSearchMerchant_Index());
			MerchantInfoSearchPage.doQuery();
			wait.waitFor(1500);
		}else {
			System.out.println("Both of MerchantNO and MerchantName are null ! Please check TestDate !");
			Reporter.log("Both of MerchantNO and MerchantName are null ! Please check TestDate !");
			assertTrue(false,"Both of MerchantNO and MerchantName are null ! Please check TestDate !");
		}
		
		MerchantInfoSearchPage.selectMerchant(MerchantInfoSearchBean.getMerchant_Index());
		MerchantInfoSearchPage.doDetail();
		MerchantInfoSearchPage.doConfirm();
	}
	
	
	@Test(dataProvider="MerchantInfo",description="线上运营平台-商户销户/取消销户")
	public void testMerchantClose(MerchantInfoSearchBean MerchantInfoSearchBean) {
		MerchantInfoSearchPage.navigateTo(URL);
		wait.waitFor(1000);
		
		if(!MerchantInfoSearchBean.getMerchantNO().equals("")) {
			MerchantInfoSearchPage.setMerchantNO(MerchantInfoSearchBean.getMerchantNO());
			MerchantInfoSearchPage.doQuery();
			wait.waitFor(1000);
		}else if(!MerchantInfoSearchBean.getMerchantName().equals("")) {
			MerchantInfoSearchPage.setMerchantName(MerchantInfoSearchBean.getMerchantName(),MerchantInfoSearchBean.getSearchMerchant_Index());
			MerchantInfoSearchPage.doQuery();
			wait.waitFor(1000);
		}else {
			System.out.println("Both of MerchantNO and MerchantName are null ! Please check TestDate !");
			Reporter.log("Both of MerchantNO and MerchantName are null ! Please check TestDate !");
			assertTrue(false,"Both of MerchantNO and MerchantName are null ! Please check TestDate !");
		}

		MerchantInfoSearchPage.selectMerchant(MerchantInfoSearchBean.getMerchant_Index());
		if(!MerchantInfoSearchPage.getMerchantStatus(MerchantInfoSearchBean.getMerchant_Index()).equals("冻结")) {
			MerchantInfoSearchPage.doAccountClose();//销户
			MerchantInfoSearchPage.doCloseAccoutAfirm();
		}
		
		wait.waitFor(1000);
		MerchantInfoSearchPage.doQuery();
		
		MerchantInfoSearchPage.selectMerchant(MerchantInfoSearchBean.getMerchant_Index());
		if(MerchantInfoSearchPage.getMerchantStatus(MerchantInfoSearchBean.getMerchant_Index()).equals("销户")) {
			MerchantInfoSearchPage.doAccountClose();//取消销户
			MerchantInfoSearchPage.doOpenAccountAfirm();
		}
		wait.waitFor(1000);
		MerchantInfoSearchPage.doQuery();
	}
	
	
	@Test(dataProvider="MerchantInfo",description="线上运营平台-商户冻结/解冻")
	public void testMerchantFrozen(MerchantInfoSearchBean MerchantInfoSearchBean) {
		MerchantInfoSearchPage.navigateTo(URL);
		wait.waitFor(1000);
		
		if(!MerchantInfoSearchBean.getMerchantNO().equals("")) {
			MerchantInfoSearchPage.setMerchantNO(MerchantInfoSearchBean.getMerchantNO());
			MerchantInfoSearchPage.doQuery();
			wait.waitFor(1000);
		}else if(!MerchantInfoSearchBean.getMerchantName().equals("")) {
			MerchantInfoSearchPage.setMerchantName(MerchantInfoSearchBean.getMerchantName(),MerchantInfoSearchBean.getSearchMerchant_Index());
			MerchantInfoSearchPage.doQuery();
			wait.waitFor(1000);
		}else {
			System.out.println("Both of MerchantNO and MerchantName are null ! Please check TestDate !");
			Reporter.log("Both of MerchantNO and MerchantName are null ! Please check TestDate !");
			assertTrue(false,"Both of MerchantNO and MerchantName are null ! Please check TestDate !");
		}

		MerchantInfoSearchPage.selectMerchant(MerchantInfoSearchBean.getMerchant_Index());
		if(MerchantInfoSearchPage.getMerchantStatus(MerchantInfoSearchBean.getMerchant_Index()).equals("正常")) {
			MerchantInfoSearchPage.doFrozen();
			MerchantInfoSearchPage.doFrozenAfirm();
		}

		wait.waitFor(1000);
		MerchantInfoSearchPage.doQuery();
		
		MerchantInfoSearchPage.selectMerchant(MerchantInfoSearchBean.getMerchant_Index());
		if(MerchantInfoSearchPage.getMerchantStatus(MerchantInfoSearchBean.getMerchant_Index()).equals("冻结")) {
			MerchantInfoSearchPage.doUnfrozen();
			MerchantInfoSearchPage.doUnfrozenAfirm();
		}
		
		wait.waitFor(1000);
		MerchantInfoSearchPage.doQuery();
	}
	
	@Test(dataProvider="MerchantInfo",description="线上运营平台-商户资料修改")
	public void testMerchantInfoAlter(MerchantInfoSearchBean MerchantInfoSearchBean) {
		MerchantInfoSearchPage.navigateTo(URL);
		wait.waitFor(1000);
		
		if(!MerchantInfoSearchBean.getMerchantNO().equals("")) {
			MerchantInfoSearchPage.setMerchantNO(MerchantInfoSearchBean.getMerchantNO());
			MerchantInfoSearchPage.doQuery();
			wait.waitFor(1000);
		}else if(!MerchantInfoSearchBean.getMerchantName().equals("")) {
			MerchantInfoSearchPage.setMerchantName(MerchantInfoSearchBean.getMerchantName(),MerchantInfoSearchBean.getSearchMerchant_Index());
			MerchantInfoSearchPage.doQuery();
			wait.waitFor(1000);
		}else {
			System.out.println("Both of MerchantNO and MerchantName are null ! Please check TestDate !");
			Reporter.log("Both of MerchantNO and MerchantName are null ! Please check TestDate !");
			assertTrue(false,"Both of MerchantNO and MerchantName are null ! Please check TestDate !");
		}

		MerchantInfoSearchPage.selectMerchant(MerchantInfoSearchBean.getMerchant_Index());
		MerchantInfoSearchPage.doAlter();
		String AlterFireld=MerchantInfoSearchPage.getAlterField();
		if(!AlterFireld.equals(MerchantInfoSearchBean.getAlterField())) {
			MerchantInfoSearchPage.setAlterField(MerchantInfoSearchBean.getAlterField());
			MerchantInfoSearchPage.doAlterSubmit();
		}else {
			System.out.println("修改的值与页面原值是一样，无需修改，页面原值为："+AlterFireld);
			Reporter.log("修改的值与页面原值是一样，无需修改，页面原值为："+AlterFireld);
			MerchantInfoSearchPage.doAlterClose();
			assertTrue(false);
		}
	}
	
	@Test(dataProvider="MerchantInfo",description="线上运营平台-商户资料修改")
	public void testMerchantInfoAlterVerify(MerchantInfoSearchBean MerchantInfoSearchBean) {
		MerchantInfoSearchPage.navigateTo(URL);
		wait.waitFor(1000);
		
		if(!MerchantInfoSearchBean.getMerchantNO().equals("")) {
			MerchantInfoSearchPage.setMerchantNO(MerchantInfoSearchBean.getMerchantNO());
			MerchantInfoSearchPage.doQuery();
			wait.waitFor(1500);
		}else if(!MerchantInfoSearchBean.getMerchantName().equals("")) {
			MerchantInfoSearchPage.setMerchantName(MerchantInfoSearchBean.getMerchantName(),MerchantInfoSearchBean.getSearchMerchant_Index());
			MerchantInfoSearchPage.doQuery();
			wait.waitFor(1500);
		}else {
			System.out.println("Both of MerchantNO and MerchantName are null ! Please check TestDate !");
			Reporter.log("Both of MerchantNO and MerchantName are null ! Please check TestDate !");
			assertTrue(false,"Both of MerchantNO and MerchantName are null ! Please check TestDate !");
		}
		
		MerchantInfoSearchPage.selectMerchant(MerchantInfoSearchBean.getMerchant_Index());
		MerchantInfoSearchPage.doDetail();
		
		String MerchantInfoAlterVerify=MerchantInfoSearchPage.getAlterField();
		if(MerchantInfoAlterVerify.equals(MerchantInfoSearchBean.getAlterField())) {
			System.out.println("Alter Merchant( "+MerchantInfoSearchBean.getMerchantNO()+" ) Succeed !");
			Reporter.log("Alter Merchant( "+MerchantInfoSearchBean.getMerchantNO()+" ) Succeed !");
		}else {
			System.out.println("Alter Merchant( "+MerchantInfoSearchBean.getMerchantNO()+" ) Failed !");
			System.out.println("The AlterField value is "+MerchantInfoAlterVerify);
			Reporter.log("Alter Merchant( "+MerchantInfoSearchBean.getMerchantNO()+" ) Failed !");
			Reporter.log("The AlterField value is "+MerchantInfoAlterVerify);
		}
		
		MerchantInfoSearchPage.doConfirm();
	}
	
	
	
}
