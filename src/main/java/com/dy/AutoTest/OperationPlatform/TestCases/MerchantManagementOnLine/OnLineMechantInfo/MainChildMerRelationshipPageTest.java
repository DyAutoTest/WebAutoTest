package com.dy.AutoTest.OperationPlatform.TestCases.MerchantManagementOnLine.OnLineMechantInfo;


import static org.testng.Assert.assertTrue;

import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.dy.AutoTest.OperationPlatform.POJO.MainChildMerRelationshipBean;
import com.dy.AutoTest.OperationPlatform.PageObject.MerchantManagementOnLine.OnLineMerchantInfo.MainChildMerRelationshipPage;
import com.dy.AutoTest.web.api.SuperTest;
import com.dy.AutoTest.web.business.DataBusiness;

public class MainChildMerRelationshipPageTest extends SuperTest{
	MainChildMerRelationshipPage MainChildMerRelationshipPage;
    String URL;
    
    @BeforeClass
	public void init() {
    	MainChildMerRelationshipPage=new MainChildMerRelationshipPage(driver);
    	MainChildMerRelationshipPage.setWaitTime(800);
		URL=host.toString()+DataBusiness.getData_URL("pop_MainChildMerRelationship");
	}
	
	@DataProvider(name="MainChildMerRelationship")
	protected static Object[][] parametersPool(){
		data.loadDataBeanList("POP_Data_MainChildMerRelationship");
		return data.getDataBeanArray();
	}
	
	
	
	@Test(dataProvider="MainChildMerRelationship")
	public void testMainChildMerRelationshipSearch(MainChildMerRelationshipBean MainChildMerRelationshipBean) {
		MainChildMerRelationshipPage.navigateTo(URL);
		if(MainChildMerRelationshipBean.getMainMerNum().equals("")&&MainChildMerRelationshipBean.getMainMerName().equals("")&&
				MainChildMerRelationshipBean.getChildMerNum().equals("")&&MainChildMerRelationshipBean.getChildMerName().equals("")) {
			System.out.println("All of MerchantNO and MerchantName are null ! Please check TestData !");
			Reporter.log("All of MerchantNO and MerchantName are null ! Please check TestData !");
			assertTrue(false,"All of MerchantNO and MerchantName are null ! Please check TestData !");
		}
		
		
		wait.waitFor(1000);
		SearchMainMer(MainChildMerRelationshipBean.getMainMerNum(),MainChildMerRelationshipBean.getMainMerName(),
				MainChildMerRelationshipBean.getSearchMainMer_Radio());
		MainChildMerRelationshipPage.clickQuery();
		wait.waitFor(1000);
		MainChildMerRelationshipPage.doPageDown();
		wait.waitFor(1000);
		MainChildMerRelationshipPage.doPageUp();
		wait.waitFor(500);
		MainChildMerRelationshipPage.clickReset();
		
		
		SearchChildMer(MainChildMerRelationshipBean.getChildMerNum(),MainChildMerRelationshipBean.getChildMerName(),
				MainChildMerRelationshipBean.getSearchChildMer_Radio());
		MainChildMerRelationshipPage.clickQuery();
		wait.waitFor(1000);
		MainChildMerRelationshipPage.clickReset();
	}
	
	
	
	
	@Test(dataProvider="MainChildMerRelationship")
	public void testMainChildMerRelationshipCheck(MainChildMerRelationshipBean MainChildMerRelationshipBean) {
		MainChildMerRelationshipPage.navigateTo(URL);
		if(MainChildMerRelationshipBean.getMainMerNum().equals("")&&MainChildMerRelationshipBean.getMainMerName().equals("")&&
				MainChildMerRelationshipBean.getChildMerNum().equals("")&&MainChildMerRelationshipBean.getChildMerName().equals("")) {
			System.out.println("All of MerchantNO and MerchantName are null ! Please check TestData !");
			Reporter.log("All of MerchantNO and MerchantName are null ! Please check TestData !");
			assertTrue(false,"All of MerchantNO and MerchantName are null ! Please check TestData !");
		}
		
		
		wait.waitFor(1000);
		if(!MainChildMerRelationshipBean.getMainMerNum().equals("")||!MainChildMerRelationshipBean.getMainMerName().equals("")) {
			SearchMainMer(MainChildMerRelationshipBean.getMainMerNum(),MainChildMerRelationshipBean.getMainMerName(),
					MainChildMerRelationshipBean.getSearchMainMer_Radio());
		}if(!MainChildMerRelationshipBean.getChildMerNum().equals("")||!MainChildMerRelationshipBean.getMainMerName().equals("")) {
			SearchChildMer(MainChildMerRelationshipBean.getChildMerNum(),MainChildMerRelationshipBean.getChildMerName(),
					MainChildMerRelationshipBean.getSearchChildMer_Radio());
		}
		
		
		MainChildMerRelationshipPage.clickQuery();
		wait.waitFor(1000);
		try {
			MainChildMerRelationshipPage.isRadioDisplayed(MainChildMerRelationshipBean.getRadio());
		} catch (Exception e) {
			System.out.println("查询数据不存在，请更换查询条件。Please Change TestData !");
			Reporter.log("查询数据名数据不存在，请更换查询条件。Please Change TestData !");
			assertTrue(false);
		}
		MainChildMerRelationshipPage.clickRadio(MainChildMerRelationshipBean.getRadio());
		wait.waitFor(1000);
		MainChildMerRelationshipPage.clickCheck();
		wait.waitFor(2000);
		MainChildMerRelationshipPage.clickCheck_Close();
	}
	
	
	
	
	@Test(dataProvider="MainChildMerRelationship")
	public void testMainChildMerRelationshipUpdate(MainChildMerRelationshipBean MainChildMerRelationshipBean) {
		MainChildMerRelationshipPage.navigateTo(URL);
		if(MainChildMerRelationshipBean.getMainMerNum().equals("")&&MainChildMerRelationshipBean.getMainMerName().equals("")&&
				MainChildMerRelationshipBean.getChildMerNum().equals("")&&MainChildMerRelationshipBean.getChildMerName().equals("")) {
			System.out.println("All of MerchantNO and MerchantName are null ! Please check TestData !");
			Reporter.log("All of MerchantNO and MerchantName are null ! Please check TestData !");
			assertTrue(false,"All of MerchantNO and MerchantName are null ! Please check TestData !");
		}
		
		
		wait.waitFor(1000);
		if(!MainChildMerRelationshipBean.getMainMerNum().equals("")||!MainChildMerRelationshipBean.getMainMerName().equals("")) {
			SearchMainMer(MainChildMerRelationshipBean.getMainMerNum(),MainChildMerRelationshipBean.getMainMerName(),
					MainChildMerRelationshipBean.getSearchMainMer_Radio());
		}if(!MainChildMerRelationshipBean.getChildMerNum().equals("")||!MainChildMerRelationshipBean.getMainMerName().equals("")) {
			SearchChildMer(MainChildMerRelationshipBean.getChildMerNum(),MainChildMerRelationshipBean.getChildMerName(),
					MainChildMerRelationshipBean.getSearchChildMer_Radio());
		}
		
		
		MainChildMerRelationshipPage.clickQuery();
		wait.waitFor(1000);
		try {
			MainChildMerRelationshipPage.isRadioDisplayed(MainChildMerRelationshipBean.getRadio());
		} catch (Exception e) {
			System.out.println("查询数据不存在，请更换查询条件。Please Change TestData !");
			Reporter.log("搜商户 该商户名数据不存在，请更换查询条件。Please Change TestData !");
			assertTrue(false);
		}
		MainChildMerRelationshipPage.clickRadio(MainChildMerRelationshipBean.getRadio());
		wait.waitFor(1000);
		MainChildMerRelationshipPage.clickUpdate();
		wait.waitFor(1500);
		MainChildMerRelationshipPage.selectUpdate_Status(MainChildMerRelationshipBean.getUpdate_Status());
		wait.waitFor(1000);
		MainChildMerRelationshipPage.clickUpdate_Confirm();
		wait.waitFor(500);
		MainChildMerRelationshipPage.clickQuery();
	}
	
	
	
	
	@Test(dataProvider="MainChildMerRelationship")
	public void testMainChildMerRelationshipDelete(MainChildMerRelationshipBean MainChildMerRelationshipBean) {
		MainChildMerRelationshipPage.navigateTo(URL);
		if(MainChildMerRelationshipBean.getMainMerNum().equals("")&&MainChildMerRelationshipBean.getMainMerName().equals("")&&
				MainChildMerRelationshipBean.getChildMerNum().equals("")&&MainChildMerRelationshipBean.getChildMerName().equals("")) {
			System.out.println("All of MerchantNO and MerchantName are null ! Please check TestData !");
			Reporter.log("All of MerchantNO and MerchantName are null ! Please check TestData !");
			assertTrue(false,"All of MerchantNO and MerchantName are null ! Please check TestData !");
		}
		
		
		wait.waitFor(1000);
		if(!MainChildMerRelationshipBean.getMainMerNum().equals("")||!MainChildMerRelationshipBean.getMainMerName().equals("")) {
			SearchMainMer(MainChildMerRelationshipBean.getMainMerNum(),MainChildMerRelationshipBean.getMainMerName(),
					MainChildMerRelationshipBean.getSearchMainMer_Radio());
		}if(!MainChildMerRelationshipBean.getChildMerNum().equals("")||!MainChildMerRelationshipBean.getMainMerName().equals("")) {
			SearchChildMer(MainChildMerRelationshipBean.getChildMerNum(),MainChildMerRelationshipBean.getChildMerName(),
					MainChildMerRelationshipBean.getSearchChildMer_Radio());
		}
		
		
		MainChildMerRelationshipPage.clickQuery();
		wait.waitFor(1000);
		try {
			MainChildMerRelationshipPage.isRadioDisplayed(MainChildMerRelationshipBean.getRadio());
		} catch (Exception e) {
			System.out.println("查询数据不存在，请更换查询条件。Please Change TestData !");
			Reporter.log("搜商户 该商户名数据不存在，请更换查询条件。Please Change TestData !");
			assertTrue(false);
		}
		MainChildMerRelationshipPage.clickRadio(MainChildMerRelationshipBean.getRadio());
		wait.waitFor(1000);
		MainChildMerRelationshipPage.clickDelete();
		wait.waitFor(1000);
		MainChildMerRelationshipPage.clickDelete_Confirm();
		
	}
	
	
	
	
	@Test(dataProvider="MainChildMerRelationship")
	public void testMainChildMerRelationshipAdd(MainChildMerRelationshipBean MainChildMerRelationshipBean) {
		MainChildMerRelationshipPage.navigateTo(URL);
		if(MainChildMerRelationshipBean.getMainMerNum().equals("")&&MainChildMerRelationshipBean.getMainMerName().equals("")) {
			System.out.println("Both of Main MerchantNO and MerchantName are null ! Please check TestData !");
			Reporter.log("Both of MerchantNO and MerchantName are null ! Please check TestData !");
			assertTrue(false,"Both of MerchantNO and MerchantName are null ! Please check TestData !");
		}
		if(MainChildMerRelationshipBean.getChildMerNum().equals("")&&MainChildMerRelationshipBean.getChildMerName().equals("")) {
			System.out.println("Both of Child MerchantNO and MerchantName are null ! Please check TestData !");
			Reporter.log("Both of Child MerchantNO and MerchantName are null ! Please check TestData !");
			assertTrue(false,"Both of Child MerchantNO and MerchantName are null ! Please check TestData !");
		}
		
		wait.waitFor(1000);
		MainChildMerRelationshipPage.clickMainChildMerAdd();
		
		SearchMainMer(true,MainChildMerRelationshipBean.getMainMerNum(),MainChildMerRelationshipBean.getMainMerName(),
				MainChildMerRelationshipBean.getSearchMainMer_Radio());
		wait.waitFor(1000);
		SearchChildMer(true,MainChildMerRelationshipBean.getChildMerNum(),MainChildMerRelationshipBean.getChildMerName(),
				MainChildMerRelationshipBean.getSearchChildMer_Radio());
		
		MainChildMerRelationshipPage.selectMainChildMerAdd_Status(MainChildMerRelationshipBean.getMainChildMerAdd_Status());
		String mainMerNum=MainChildMerRelationshipPage.getAdd_MainMerNum();
		String childMerNum=MainChildMerRelationshipPage.getAdd_ChildMerNum();
		wait.waitFor(500);
		MainChildMerRelationshipPage.clickMainChildMerAdd_Confirm();
		String notice=MainChildMerRelationshipPage.getNotice();
		if(notice.contains("成功")){
			System.out.println("主商户号 "+mainMerNum+"，子商户号 "+childMerNum+"，维护成功！");
			Reporter.log("主商户号 "+mainMerNum+"，子商户号 "+childMerNum+"，维护成功！");
		}else {
			System.out.println(notice);
			System.out.println("主商户号 "+mainMerNum+"，子商户号 "+childMerNum+"，维护失败！");
			Reporter.log(notice);
			Reporter.log("主商户号 "+mainMerNum+"，子商户号 "+childMerNum+"，维护失败！");
			MainChildMerRelationshipPage.clickMainChildMerAdd_Close();
			assertTrue(false);
		}
	}
	
	
	
	
	public void SearchMainMer(String merchantNO,String merchantName,String radio) {
		if(!merchantNO.equals("")) {
			MainChildMerRelationshipPage.setMainMerNum(merchantNO);
		}else if(!merchantName.equals("")) {
			MainChildMerRelationshipPage.clickSearchMainMer();
			MainChildMerRelationshipPage.setSearchMainMer_MerName(merchantName);
			MainChildMerRelationshipPage.clickSearchMainMer_Search();
			try {
				MainChildMerRelationshipPage.isSearchMainMer_RadioDisplayed(radio);
			} catch (Exception e) {
				MainChildMerRelationshipPage.clickSearchMainMer_Close();
				wait.waitFor(1000);
				System.out.println("搜商户 该商户名数据不存在，Please Check TestData ! MerchantName is "+merchantName);
				Reporter.log("搜商户 该商户名数据不存在，Please Check TestData ! MerchantName is "+merchantName);
				assertTrue(false);
			}
			MainChildMerRelationshipPage.clickSearchMainMer_Radio(radio);
			MainChildMerRelationshipPage.clickSearchMainMer_Submit();
		}
	}
	
	public void SearchMainMer(boolean isAdd,String merchantNO,String merchantName,String radio) {
		MainChildMerRelationshipPage.clickMainChildMerAdd_SearchMainMer();
		if(!merchantNO.equals("")) {
			MainChildMerRelationshipPage.setSearchMainMer_MerNum(merchantNO);
		}else if(!merchantName.equals("")) {
			MainChildMerRelationshipPage.setSearchMainMer_MerName(merchantName);
		}
		MainChildMerRelationshipPage.clickSearchMainMer_Search();
			try {
				MainChildMerRelationshipPage.isSearchMainMer_RadioDisplayed(radio);
			} catch (Exception e) {
				MainChildMerRelationshipPage.clickSearchMainMer_Close();
				wait.waitFor(1000);
				System.out.println("搜商户 该商户名数据不存在，Please Check TestData ! MerchantName is "+merchantName);
				Reporter.log("搜商户 该商户名数据不存在，Please Check TestData ! MerchantName is "+merchantName);
				assertTrue(false);
			}
			MainChildMerRelationshipPage.clickSearchMainMer_Radio(radio);
			MainChildMerRelationshipPage.clickSearchMainMer_Submit();
	}
	
	public void SearchChildMer(String merchantNO,String merchantName,String radio) {
		if(!merchantNO.equals("")) {
			MainChildMerRelationshipPage.setChildMerNum(merchantNO);
		}else if(!merchantName.equals("")) {
			MainChildMerRelationshipPage.clickSearchChildMer();
			MainChildMerRelationshipPage.setSearchChildMer_MerName(merchantName);
			MainChildMerRelationshipPage.clickSearchChildMer_Search();
			try {
				MainChildMerRelationshipPage.isSearchChildMer_RadioDisplayed(radio);
			} catch (Exception e) {
				MainChildMerRelationshipPage.clickSearchChildMer_Close();
				wait.waitFor(1000);
				System.out.println("搜商户 该商户名数据不存在，Please Check TestData ! MerchantName is "+merchantName);
				Reporter.log("搜商户 该商户名数据不存在，Please Check TestData ! MerchantName is "+merchantName);
				assertTrue(false);
			}
			MainChildMerRelationshipPage.clickSearchChildMer_Radio(radio);
			MainChildMerRelationshipPage.clickSearchChildMer_Submit();
		}
	}
	
	
	public void SearchChildMer(boolean isAdd,String merchantNO,String merchantName,String radio) {
		MainChildMerRelationshipPage.clickMainChildMerAdd_SearchChildMer();
		if(!merchantNO.equals("")) {
			MainChildMerRelationshipPage.setSearchChildMer_MerNum(merchantNO);
		}else if(!merchantName.equals("")) {
			MainChildMerRelationshipPage.setSearchChildMer_MerName(merchantName);
		}
			MainChildMerRelationshipPage.clickSearchChildMer_Search();
			try {
				MainChildMerRelationshipPage.isSearchChildMer_RadioDisplayed(radio);
			} catch (Exception e) {
				MainChildMerRelationshipPage.clickSearchChildMer_Close();
				wait.waitFor(1000);
				System.out.println("搜商户 该商户名数据不存在，Please Check TestData ! MerchantName is "+merchantName);
				Reporter.log("搜商户 该商户名数据不存在，Please Check TestData ! MerchantName is "+merchantName);
				assertTrue(false);
			}
			MainChildMerRelationshipPage.clickSearchChildMer_Radio(radio);
			MainChildMerRelationshipPage.clickSearchChildMer_Submit();
	}
	
	
	
}
