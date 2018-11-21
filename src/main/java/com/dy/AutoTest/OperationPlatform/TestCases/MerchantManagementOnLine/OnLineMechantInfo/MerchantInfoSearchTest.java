package com.dy.AutoTest.OperationPlatform.TestCases.MerchantManagementOnLine.OnLineMechantInfo;

import static org.testng.Assert.assertTrue;

import java.util.HashMap;
import java.util.Map;

import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.dy.AutoTest.OperationPlatform.POJO.MerchantInfoSearchBean;
import com.dy.AutoTest.OperationPlatform.PageObject.MerchantManagementOnLine.OnLineMerchantInfo.MerchantInfoSearchPage;
import com.dy.AutoTest.web.api.SuperTest;
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
			MerchantInfoSearchPage.setMerchantName(MerchantInfoSearchBean.getMerchantName());
			if(MerchantInfoSearchPage.isSearchMerchantIndexDisplayed(MerchantInfoSearchBean.getSearchMerchant_Index())) {
				MerchantInfoSearchPage.doSearchMerchantSubmit(MerchantInfoSearchBean.getSearchMerchant_Index());
			}else {
				MerchantInfoSearchPage.doSearchMerchantClose();
				System.out.println("搜商户 数据不存在，Please Check TestDate ! MerchantName is "+MerchantInfoSearchBean.getMerchantName());
				Reporter.log("搜商户 数据不存在，Please Check TestDate ! MerchantName is "+MerchantInfoSearchBean.getMerchantName());
				assertTrue(false);
			}
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
		
		doSearchMerchantByNOorName(MerchantInfoSearchBean);

		MerchantInfoSearchPage.doQuery();
		wait.waitFor(1000);
		MerchantInfoSearchPage.selectMerchant(MerchantInfoSearchBean.getMerchant_Index());
		MerchantInfoSearchPage.doDetail();
		MerchantInfoSearchPage.doConfirm();
	}
	
	
	@Test(dataProvider="MerchantInfo",description="线上运营平台-商户销户/取消销户")
	public void testMerchantClose(MerchantInfoSearchBean MerchantInfoSearchBean) {
		MerchantInfoSearchPage.navigateTo(URL);
		wait.waitFor(1000);
		
		doSearchMerchantByNOorName(MerchantInfoSearchBean);
		
		
		MerchantInfoSearchPage.doQuery();
		wait.waitFor(1000);
		MerchantInfoSearchPage.selectMerchant(MerchantInfoSearchBean.getMerchant_Index());
		if(MerchantInfoSearchPage.getMerchantStatus(MerchantInfoSearchBean.getMerchant_Index()).equals("正常")) {
			MerchantInfoSearchPage.doAccountClose();//销户
			MerchantInfoSearchPage.doCloseAccoutAfirm();
		}else {
			System.out.println("该商户状态为："+MerchantInfoSearchPage.getMerchantStatus(MerchantInfoSearchBean.getMerchant_Index())+" ，不允许销户");
			Reporter.log("该商户状态为："+MerchantInfoSearchPage.getMerchantStatus(MerchantInfoSearchBean.getMerchant_Index())+" ，不允许销户");
			assertTrue(false);
		}
		
		wait.waitFor(1000);
		MerchantInfoSearchPage.doQuery();
		
		MerchantInfoSearchPage.selectMerchant(MerchantInfoSearchBean.getMerchant_Index());
		if(MerchantInfoSearchPage.getMerchantStatus(MerchantInfoSearchBean.getMerchant_Index()).equals("销户")) {
			MerchantInfoSearchPage.doAccountClose();//取消销户
			MerchantInfoSearchPage.doOpenAccountAfirm();
		}else {
			System.out.println("该商户状态为："+MerchantInfoSearchPage.getMerchantStatus(MerchantInfoSearchBean.getMerchant_Index())+" ，不允许取消销户");
			Reporter.log("该商户状态为："+MerchantInfoSearchPage.getMerchantStatus(MerchantInfoSearchBean.getMerchant_Index())+" ，不允许取消销户");
			assertTrue(false);
		}
		wait.waitFor(1000);
		MerchantInfoSearchPage.doQuery();
	}
	
	
	@Test(dataProvider="MerchantInfo",description="线上运营平台-商户冻结/解冻")
	public void testMerchantFrozen(MerchantInfoSearchBean MerchantInfoSearchBean) {
		MerchantInfoSearchPage.navigateTo(URL);
		wait.waitFor(1000);
		
		
		doSearchMerchantByNOorName(MerchantInfoSearchBean);
		
		
		MerchantInfoSearchPage.doQuery();
		wait.waitFor(1000);
		MerchantInfoSearchPage.selectMerchant(MerchantInfoSearchBean.getMerchant_Index());
		if(MerchantInfoSearchPage.getMerchantStatus(MerchantInfoSearchBean.getMerchant_Index()).equals("正常")) {
			MerchantInfoSearchPage.doFrozen();
			MerchantInfoSearchPage.doFrozenAfirm();
		}else {
			System.out.println("该商户状态为："+MerchantInfoSearchPage.getMerchantStatus(MerchantInfoSearchBean.getMerchant_Index())+" ，不允许冻结");
			Reporter.log("该商户状态为："+MerchantInfoSearchPage.getMerchantStatus(MerchantInfoSearchBean.getMerchant_Index())+" ，不允许冻结");
			assertTrue(false);
		}

		wait.waitFor(1000);
		MerchantInfoSearchPage.doQuery();
		
		MerchantInfoSearchPage.selectMerchant(MerchantInfoSearchBean.getMerchant_Index());
		if(MerchantInfoSearchPage.getMerchantStatus(MerchantInfoSearchBean.getMerchant_Index()).equals("冻结")) {
			MerchantInfoSearchPage.doUnfrozen();
			MerchantInfoSearchPage.doUnfrozenAfirm();
		}else {
			System.out.println("该商户状态为："+MerchantInfoSearchPage.getMerchantStatus(MerchantInfoSearchBean.getMerchant_Index())+" ，不允许解冻");
			Reporter.log("该商户状态为："+MerchantInfoSearchPage.getMerchantStatus(MerchantInfoSearchBean.getMerchant_Index())+" ，不允许解冻");
			assertTrue(false);
		}
		
		wait.waitFor(1000);
		MerchantInfoSearchPage.doQuery();
	}
	
	@Test(dataProvider="MerchantInfo",description="线上运营平台-商户资料修改")
	public void testMerchantInfoAlter(MerchantInfoSearchBean MerchantInfoSearchBean) {
		MerchantInfoSearchPage.navigateTo(URL);
		wait.waitFor(1000);
		
		
		doSearchMerchantByNOorName(MerchantInfoSearchBean);
		
		
		MerchantInfoSearchPage.doQuery();
		if(MerchantInfoSearchBean.getMerchantNO().equals("")) {
			String MerchantNO=MerchantInfoSearchPage.getMerchantNO();
			Map<String, Object> updateMap=new HashMap<String, Object> ();
			Map<String, Object> whereMap=new HashMap<String, Object> ();
			
			updateMap.put("MerchantNO", MerchantNO);
			whereMap.put("ID", MerchantInfoSearchBean.getID());
			DataBusiness.updateTestData("POP_Data_MerchantInfoSearch", updateMap, whereMap);
		}
		
		wait.waitFor(1000);
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
		
		
		doSearchMerchantByNOorName(MerchantInfoSearchBean);
		
		
		MerchantInfoSearchPage.doQuery();
		wait.waitFor(1000);
		MerchantInfoSearchPage.selectMerchant(MerchantInfoSearchBean.getMerchant_Index());
		MerchantInfoSearchPage.doDetail();
		
		String MerchantInfoAlterVerify=MerchantInfoSearchPage.getAlterField();
		if(MerchantInfoAlterVerify.equals(MerchantInfoSearchBean.getAlterField())) {
			System.out.println("Alter Merchant( "+(!MerchantInfoSearchBean.getMerchantNO().equals("")?MerchantInfoSearchBean.getMerchantNO():MerchantInfoSearchBean.getMerchantName())+" ) Succeed !");
			Reporter.log("Alter Merchant( "+(!MerchantInfoSearchBean.getMerchantNO().equals("")?MerchantInfoSearchBean.getMerchantNO():MerchantInfoSearchBean.getMerchantName())+" ) Succeed !");
		}else {
			System.out.println("Alter Merchant( "+(!MerchantInfoSearchBean.getMerchantNO().equals("")?MerchantInfoSearchBean.getMerchantNO():MerchantInfoSearchBean.getMerchantName())+" ) Failed !");
			System.out.println("The AlterField value is "+MerchantInfoAlterVerify);
			Reporter.log("Alter Merchant( "+(!MerchantInfoSearchBean.getMerchantNO().equals("")?MerchantInfoSearchBean.getMerchantNO():MerchantInfoSearchBean.getMerchantName())+" ) Failed !");
			Reporter.log("The AlterField value is "+MerchantInfoAlterVerify);
		}
		
		MerchantInfoSearchPage.doConfirm();
	}
	
	public void doSearchMerchantByNOorName(MerchantInfoSearchBean MerchantInfoSearchBean) {
		if(!MerchantInfoSearchBean.getMerchantNO().equals("")) {
			MerchantInfoSearchPage.setMerchantNO(MerchantInfoSearchBean.getMerchantNO());
		}else if(!MerchantInfoSearchBean.getMerchantName().equals("")) {
			MerchantInfoSearchPage.setMerchantName(MerchantInfoSearchBean.getMerchantName());
			try {
				MerchantInfoSearchPage.isSearchMerchantIndexDisplayed(MerchantInfoSearchBean.getSearchMerchant_Index());
				MerchantInfoSearchPage.doSearchMerchantSubmit(MerchantInfoSearchBean.getSearchMerchant_Index());
			} catch (Exception e) {
				MerchantInfoSearchPage.doSearchMerchantClose();
				wait.waitFor(2000);
				System.out.println("搜商户 该商户名数据不存在，Please Check TestData ! MerchantName is "+MerchantInfoSearchBean.getMerchantName());
				Reporter.log("搜商户 该商户名数据不存在，Please Check TestData ! MerchantName is "+MerchantInfoSearchBean.getMerchantName());
				assertTrue(false);
			}
		}else {
			System.out.println("Both of MerchantNO and MerchantName are null ! Please check TestData !");
			Reporter.log("Both of MerchantNO and MerchantName are null ! Please check TestData !");
			assertTrue(false,"Both of MerchantNO and MerchantName are null ! Please check TestData !");
		}
	}
}
