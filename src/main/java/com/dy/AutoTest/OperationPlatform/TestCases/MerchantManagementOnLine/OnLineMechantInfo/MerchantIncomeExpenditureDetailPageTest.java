package com.dy.AutoTest.OperationPlatform.TestCases.MerchantManagementOnLine.OnLineMechantInfo;


import static org.testng.Assert.assertTrue;

import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.dy.AutoTest.OperationPlatform.POJO.MerchantIncomeExpenditureDetailBean;
import com.dy.AutoTest.OperationPlatform.PageObject.MerchantManagementOnLine.OnLineMerchantInfo.MerchantIncomeExpenditureDetailPage;
import com.dy.AutoTest.web.api.SuperTest;
import com.dy.AutoTest.web.business.DataBusiness;

public class MerchantIncomeExpenditureDetailPageTest extends SuperTest{
	MerchantIncomeExpenditureDetailPage MerchantIncomeExpenditureDetailPage;
    String URL;
    
    @BeforeClass
	public void init() {
    	MerchantIncomeExpenditureDetailPage=new MerchantIncomeExpenditureDetailPage(driver);
    	MerchantIncomeExpenditureDetailPage.setWaitTime(800);
    	URL=host.toString()+DataBusiness.getData_URL("pop_MerchantIncomeExpenditureDetail");
	}
	
	@DataProvider(name="MerchantIncomeExpenditureDetail")
	protected static Object[][] parametersPool(){
		data.loadDataBeanList("POP_Data_MerchantIncomeExpenditureDetail");
		return data.getDataBeanArray();
	}
	
	/**
	 * @param MerchantIncomeExpenditureDetailBean
	 * 
	 * 商户收支明细查询，如果数据库中查询日期为空，直接断言测试案例失败（程序设计不合理）
	 * 原因有两个：
	 * 	1. 查询逻辑要求，必须要带上查询日期，如果查询日期为空不让查询
	 *  2. 默认的查询日期是当前会计日，最近有交易数据的记账日必须是T-1日，当前会计日未经过跑批，查询是不会有数据的
	 * 
	 */
	@Test(dataProvider="MerchantIncomeExpenditureDetail")
	public void testMerchantIncomeExpenditureDetailSearch(MerchantIncomeExpenditureDetailBean MerchantIncomeExpenditureDetailBean) {
		MerchantIncomeExpenditureDetailPage.navigateTo(URL);
		wait.waitFor(1000);
		
		if(MerchantIncomeExpenditureDetailBean.getAccountingDateBegin().equals("")&&MerchantIncomeExpenditureDetailBean.getAccountingDateEnd().equals("")) {
			System.out.println("The field (AccountingDate) is null. Please check TestData!");
			Reporter.log("记账时间为空，请检查测试数据");
			assertTrue(false);
		}
		
		MerchantIncomeExpenditureDetailPage.clickAdvance();
		
		MerchantIncomeExpenditureDetailPage.clickReset();
		
		doSearchMerchantByNOorName(MerchantIncomeExpenditureDetailPage, MerchantIncomeExpenditureDetailBean.getMerchantNO(),
				MerchantIncomeExpenditureDetailBean.getMerchantName(), MerchantIncomeExpenditureDetailBean.getMerchantRadio());
		wait.waitFor(500);
		MerchantIncomeExpenditureDetailPage.setAccountingDateBegin(MerchantIncomeExpenditureDetailBean.getAccountingDateBegin());
		wait.waitFor(500);
		MerchantIncomeExpenditureDetailPage.setAccountingDateEnd(MerchantIncomeExpenditureDetailBean.getAccountingDateEnd());
		MerchantIncomeExpenditureDetailPage.doLoseFocus("AccountingDateEnd", 100, 0);
		MerchantIncomeExpenditureDetailPage.clickQuery();
		wait.waitFor(1000);
		MerchantIncomeExpenditureDetailPage.doPageDown();
		wait.waitFor(1000);
		MerchantIncomeExpenditureDetailPage.doPageUp();
		MerchantIncomeExpenditureDetailPage.clickReset();
		wait.waitFor(500);
		
		if(!MerchantIncomeExpenditureDetailBean.getInnerOrderNO().equals("")) {
			MerchantIncomeExpenditureDetailPage.setInnerOrderNO(MerchantIncomeExpenditureDetailBean.getInnerOrderNO());
			MerchantIncomeExpenditureDetailPage.setAccountingDateBegin(MerchantIncomeExpenditureDetailBean.getAccountingDateBegin());
			MerchantIncomeExpenditureDetailPage.setAccountingDateEnd(MerchantIncomeExpenditureDetailBean.getAccountingDateEnd());
			MerchantIncomeExpenditureDetailPage.doLoseFocus("AccountingDateEnd", 100, 0);
			MerchantIncomeExpenditureDetailPage.clickQuery();
			wait.waitFor(1000);
			MerchantIncomeExpenditureDetailPage.doPageDown();
			wait.waitFor(1000);
			MerchantIncomeExpenditureDetailPage.doPageUp();
			MerchantIncomeExpenditureDetailPage.clickReset();
			wait.waitFor(500);
		}
		
		if(!MerchantIncomeExpenditureDetailBean.getBusinessChannel().equals("")) {
			MerchantIncomeExpenditureDetailPage.selectBusinessChannel(MerchantIncomeExpenditureDetailBean.getBusinessChannel());
			MerchantIncomeExpenditureDetailPage.setAccountingDateBegin(MerchantIncomeExpenditureDetailBean.getAccountingDateBegin());
			MerchantIncomeExpenditureDetailPage.setAccountingDateEnd(MerchantIncomeExpenditureDetailBean.getAccountingDateEnd());
			MerchantIncomeExpenditureDetailPage.doLoseFocus("AccountingDateEnd", 100, 0);
			MerchantIncomeExpenditureDetailPage.clickQuery();
			wait.waitFor(1000);
			MerchantIncomeExpenditureDetailPage.doPageDown();
			wait.waitFor(1000);
			MerchantIncomeExpenditureDetailPage.doPageUp();
			MerchantIncomeExpenditureDetailPage.clickReset();
			wait.waitFor(500);
		}
		
	}
	
	@Test(dataProvider="MerchantIncomeExpenditureDetail")
	public void testMerchantIncomeExpenditureDetailCheck(MerchantIncomeExpenditureDetailBean MerchantIncomeExpenditureDetailBean) {
		MerchantIncomeExpenditureDetailPage.navigateTo(URL);
		wait.waitFor(1000);
		MerchantIncomeExpenditureDetailPage.clickReset();
		
		doSearchMerchantByNOorName(MerchantIncomeExpenditureDetailPage, MerchantIncomeExpenditureDetailBean.getMerchantNO(),
				MerchantIncomeExpenditureDetailBean.getMerchantName(), MerchantIncomeExpenditureDetailBean.getSearchMer_Radio());
		
		MerchantIncomeExpenditureDetailPage.setAccountingDateBegin(MerchantIncomeExpenditureDetailBean.getAccountingDateBegin());
		MerchantIncomeExpenditureDetailPage.setAccountingDateEnd(MerchantIncomeExpenditureDetailBean.getAccountingDateEnd());
		MerchantIncomeExpenditureDetailPage.doLoseFocus("AccountingDateEnd", 100, 0);
		
		MerchantIncomeExpenditureDetailPage.clickQuery();
		wait.waitFor(1000);
		try {
			MerchantIncomeExpenditureDetailPage.isMerchantRadioDisplayed(MerchantIncomeExpenditureDetailBean.getMerchantRadio());
		} catch (Exception e) {
			System.out.println("查询数据不存在，请更换查询条件。Please Change TestData !");
			Reporter.log("搜商户 该商户名数据不存在，请更换查询条件。Please Change TestData !");
			assertTrue(false);
		}
		MerchantIncomeExpenditureDetailPage.clickMerchantRadio(MerchantIncomeExpenditureDetailBean.getMerchantRadio());
		wait.waitFor(500);
		MerchantIncomeExpenditureDetailPage.clickDetail();
		wait.waitFor(1000);
		MerchantIncomeExpenditureDetailPage.clickDetail_Close();
		
	}
	
	
}
