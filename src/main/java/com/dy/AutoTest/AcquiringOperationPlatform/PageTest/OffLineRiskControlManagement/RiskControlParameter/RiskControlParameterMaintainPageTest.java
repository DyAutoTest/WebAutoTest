package com.dy.AutoTest.AcquiringOperationPlatform.PageTest.OffLineRiskControlManagement.RiskControlParameter;

import static org.testng.Assert.assertTrue;

import java.lang.reflect.Method;

import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.dy.AutoTest.web.api.SuperTest;
import com.dy.AutoTest.AcquiringOperationPlatform.POJO.OffLineRiskControlManagement_RiskControlParameterMaintainBean;
import com.dy.AutoTest.AcquiringOperationPlatform.PageObject.OffLineRiskControlManagement.RiskControlParameter.RiskControlParameterMaintainPage;
import com.dy.AutoTest.web.business.DataBusiness;

public class RiskControlParameterMaintainPageTest extends SuperTest{
	RiskControlParameterMaintainPage RiskControlParameterMaintainPage;
	String URL;

	@BeforeClass
	public void init() {
		/******** instant objectPage *********/
		RiskControlParameterMaintainPage=new RiskControlParameterMaintainPage(driver);
		//RiskControlParameterMaintainPage.setWaitTime(800);

		/******** set URL *********/
		URL=host.toString()+DataBusiness.getData_URL("aop_OffLineRiskControlManagement_RiskControlParameterMaintain");

		/******** instant Interface *********/
		iQuery=RiskControlParameterMaintainPage;
//		iClickButton=RiskControlParameterMaintainPage;
//		iClickRadio=RiskControlParameterMaintainPage;
//		iSearchMerchant=RiskControlParameterMaintainPage;
		iSearchMerchant_Add=RiskControlParameterMaintainPage;
	}

	@DataProvider(name="OffLineRiskControlManagement_RiskControlParameterMaintain")
	protected static Object[][] parametersPool(){
		data.loadDataBeanList("AOP_Data_OffLineRiskControlManagement_RiskControlParameterMaintain",OffLineRiskControlManagement_RiskControlParameterMaintainBean.class);
		if(data.getDataBeanArray().length==0) {
			System.out.println("测试数据为空，请检查");
			Reporter.log("测试数据为空，请检查");
			assertTrue(false);
		}
		return data.getDataBeanArray();
	}

	@DataProvider(name="OffLineRiskControlManagement_RiskControlParameterMaintainByCaseNO")
	protected static Object[][] parametersPool(Method method){
		data.loadDataBeanList("AOP_Data_OffLineRiskControlManagement_RiskControlParameterMaintain",method.getName(),OffLineRiskControlManagement_RiskControlParameterMaintainBean.class);
		if(data.getDataBeanArray().length==0) {
			System.out.println("测试数据为空，请检查");
			Reporter.log("测试数据为空，请检查");
			assertTrue(false);
		}
		return data.getDataBeanArray();
	}

	@Test(dataProvider="OffLineRiskControlManagement_RiskControlParameterMaintainByCaseNO")
	public void testQuery(OffLineRiskControlManagement_RiskControlParameterMaintainBean bean) {
		RiskControlParameterMaintainPage.navigateTo(URL);
		wait.waitFor(500);
		if(!bean.getTerminalNO().equals("")) {
			RiskControlParameterMaintainPage.setTerminalNO(bean.getTerminalNO());
			doQuery();
		}
		if(!bean.getMerchantNO().equals("")) {
			RiskControlParameterMaintainPage.setMerchantNO(bean.getMerchantNO());
			doQuery();
		}
		if(!bean.getMerchantName().equals("")) {
			RiskControlParameterMaintainPage.setMerchantName(bean.getMerchantName());
			doQuery();
		}
		if(!bean.getMerchantStatus().equals("")) {
			RiskControlParameterMaintainPage.selectMerchantStatus(bean.getMerchantStatus());
			doQuery();
		}
		if(!bean.getMCC().equals("")) {
			RiskControlParameterMaintainPage.selectMCC(bean.getMCC());
			doQuery();
		}
		if(!bean.getProvince().equals("")) {
			RiskControlParameterMaintainPage.selectProvince(bean.getProvince());
			doQuery();
		}
		if(!bean.getProvince().equals("")&&!bean.getCity().equals("")) {
			RiskControlParameterMaintainPage.selectProvince(bean.getProvince());
			RiskControlParameterMaintainPage.selectCity(bean.getCity());
			doQuery();
		}
		if(!bean.getInnerMerchantType().equals("")) {
			RiskControlParameterMaintainPage.selectInnerMerchantType(bean.getInnerMerchantType());
			doQuery();
		}
		if(!bean.getInnerMerchantType().equals("")&&!bean.getInnerMerchantTypeLv2().equals("")) {
			RiskControlParameterMaintainPage.selectInnerMerchantType(bean.getInnerMerchantType());
			RiskControlParameterMaintainPage.selectInnerMerchantTypeLv2(bean.getInnerMerchantTypeLv2());
			doQuery();
		}
		if(!bean.getStartDate().equals("")&&!bean.getEndDate().equals("")) {
			RiskControlParameterMaintainPage.setStartDate(bean.getStartDate());
			RiskControlParameterMaintainPage.setEndDate(bean.getEndDate());
			doQuery();
		}
	}
	@Test(dataProvider="OffLineRiskControlManagement_RiskControlParameterMaintainByCaseNO")
	public void testCheck(OffLineRiskControlManagement_RiskControlParameterMaintainBean bean) {
		RiskControlParameterMaintainPage.navigateTo(URL);
		wait.waitFor(500);
		doQueryForClickButton(bean);
		RiskControlParameterMaintainPage.clickCheck();
		wait.waitFor(2000);
		RiskControlParameterMaintainPage.clickCheck_Close();
	}
	@Test(dataProvider="OffLineRiskControlManagement_RiskControlParameterMaintainByCaseNO")
	public void testDelete(OffLineRiskControlManagement_RiskControlParameterMaintainBean bean) {
		RiskControlParameterMaintainPage.navigateTo(URL);
		wait.waitFor(500);
		doQueryForClickButton(bean);
		RiskControlParameterMaintainPage.clickDelete();
		wait.waitFor(1000);
		RiskControlParameterMaintainPage.clickDelete_Confirm();
		System.out.println(RiskControlParameterMaintainPage.getNotice());
		Reporter.log(RiskControlParameterMaintainPage.getNotice());
//		RiskControlParameterMaintainPage.clickDelete_Close();
	}
	@Test(dataProvider="OffLineRiskControlManagement_RiskControlParameterMaintainByCaseNO")
	public void testUpdate(OffLineRiskControlManagement_RiskControlParameterMaintainBean bean) {
		RiskControlParameterMaintainPage.navigateTo(URL);
		wait.waitFor(500);
		if(bean.getUpdate_SingleTradeDebitCardLimit().equals("")) {
			System.out.println("修改_单笔交易借记卡限额为必输项，不能为空");
			Reporter.log("修改_单笔交易借记卡限额字段为必输项，不能为空");
			assertTrue(false);
		}
		if(bean.getUpdate_DebitCardDayLimit().equals("")) {
			System.out.println("修改_借记卡单日限额为必输项，不能为空");
			Reporter.log("修改_借记卡单日限额字段为必输项，不能为空");
			assertTrue(false);
		}
		if(bean.getUpdate_SingleTradeCreditCardLimit().equals("")) {
			System.out.println("修改_单笔交易贷记卡限额为必输项，不能为空");
			Reporter.log("修改_单笔交易贷记卡限额字段为必输项，不能为空");
			assertTrue(false);
		}
		if(bean.getUpdate_CreditCardDayLimit().equals("")) {
			System.out.println("修改_贷记卡单日限额为必输项，不能为空");
			Reporter.log("修改_贷记卡单日限额字段为必输项，不能为空");
			assertTrue(false);
		}
		if(bean.getUpdate_ScanCodeSingleLimit().equals("")) {
			System.out.println("修改_扫码单笔交易限额为必输项，不能为空");
			Reporter.log("修改_扫码单笔交易限额字段为必输项，不能为空");
			assertTrue(false);
		}
		if(bean.getUpdate_ScanCodeDayLimit().equals("")) {
			System.out.println("修改_扫码交易当日限额为必输项，不能为空");
			Reporter.log("修改_扫码交易当日限额字段为必输项，不能为空");
			assertTrue(false);
		}
		if(bean.getUpdate_DayTotalLimit().equals("")) {
			System.out.println("修改_日累计总额为必输项，不能为空");
			Reporter.log("修改_日累计总额字段为必输项，不能为空");
			assertTrue(false);
		}
		if(bean.getUpdate_TerminalMerchantLimitTimeBegin().equals("")) {
			System.out.println("修改_终端/商户限制起始时间为必输项，不能为空");
			Reporter.log("修改_终端/商户限制起始时间字段为必输项，不能为空");
			assertTrue(false);
		}
		if(bean.getUpdate_TerminalMerchantLimitTimeEnd().equals("")) {
			System.out.println("修改_终端/商户限制结束时间为必输项，不能为空");
			Reporter.log("修改_终端/商户限制结束时间字段为必输项，不能为空");
			assertTrue(false);
		}
		doQueryForClickButton(bean);
		RiskControlParameterMaintainPage.clickUpdate();
		wait.waitFor(1000);
		RiskControlParameterMaintainPage.setUpdate_SingleTradeDebitCardLimit(bean.getUpdate_SingleTradeDebitCardLimit());
		RiskControlParameterMaintainPage.setUpdate_DebitCardDayLimit(bean.getUpdate_DebitCardDayLimit());
		RiskControlParameterMaintainPage.setUpdate_SingleTradeCreditCardLimit(bean.getUpdate_SingleTradeCreditCardLimit());
		RiskControlParameterMaintainPage.setUpdate_CreditCardDayLimit(bean.getUpdate_CreditCardDayLimit());
		RiskControlParameterMaintainPage.setUpdate_ScanCodeSingleLimit(bean.getUpdate_ScanCodeSingleLimit());
		RiskControlParameterMaintainPage.setUpdate_ScanCodeDayLimit(bean.getUpdate_ScanCodeDayLimit());
		RiskControlParameterMaintainPage.setUpdate_DayTotalLimit(bean.getUpdate_DayTotalLimit());
		RiskControlParameterMaintainPage.setUpdate_TerminalMerchantLimitTimeBegin(bean.getUpdate_TerminalMerchantLimitTimeBegin());
		RiskControlParameterMaintainPage.setUpdate_TerminalMerchantLimitTimeEnd(bean.getUpdate_TerminalMerchantLimitTimeEnd());
		wait.waitFor(1000);
		RiskControlParameterMaintainPage.clickUpdate_Submit();
		System.out.println(RiskControlParameterMaintainPage.getNotice());
		Reporter.log(RiskControlParameterMaintainPage.getNotice());
//		RiskControlParameterMaintainPage.clickUpdate_Close();
	}
	@Test(dataProvider="OffLineRiskControlManagement_RiskControlParameterMaintainByCaseNO")
	public void testAdd(OffLineRiskControlManagement_RiskControlParameterMaintainBean bean) {
		RiskControlParameterMaintainPage.navigateTo(URL);
		wait.waitFor(500);
//		add需要先判断必输项的测试数据是否为空
		if(bean.getAdd_LimitLv().equals("")) {
			System.out.println("添加_限制级别字段为必输项，不能为空");
			Reporter.log("添加_限制级别字段为必输项，不能为空");
			assertTrue(false);
		}
		if(bean.getAdd_SearchMer_MerNO().equals("")&&bean.getAdd_SearchMer_MerName().equals("")) {
			System.out.println("添加_商户号和商户名不能同时为空");
			Reporter.log("添加_商户号和商户名不能同时为空");
			assertTrue(false);
		}
		if(bean.getAdd_SingleTradeDebitCardLimit().equals("")) {
			System.out.println("添加_单笔交易借记卡限额为必输项，不能为空");
			Reporter.log("添加_单笔交易借记卡限额字段为必输项，不能为空");
			assertTrue(false);
		}
		if(bean.getAdd_DebitCardDayLimit().equals("")) {
			System.out.println("添加_借记卡单日限额为必输项，不能为空");
			Reporter.log("添加_借记卡单日限额字段为必输项，不能为空");
			assertTrue(false);
		}
		if(bean.getAdd_SingleTradeCreditCardLimit().equals("")) {
			System.out.println("添加_单笔交易贷记卡限额为必输项，不能为空");
			Reporter.log("添加_单笔交易贷记卡限额字段为必输项，不能为空");
			assertTrue(false);
		}
		if(bean.getAdd_CreditCardDayLimit().equals("")) {
			System.out.println("添加_贷记卡单日限额为必输项，不能为空");
			Reporter.log("添加_贷记卡单日限额字段为必输项，不能为空");
			assertTrue(false);
		}
		if(bean.getAdd_ScanCodeSingleLimit().equals("")) {
			System.out.println("添加_扫码单笔交易限额为必输项，不能为空");
			Reporter.log("添加_扫码单笔交易限额字段为必输项，不能为空");
			assertTrue(false);
		}
		if(bean.getAdd_ScanCodeDayLimit().equals("")) {
			System.out.println("添加_扫码交易当日限额为必输项，不能为空");
			Reporter.log("添加_扫码交易当日限额字段为必输项，不能为空");
			assertTrue(false);
		}
		if(bean.getAdd_DayTotalLimit().equals("")) {
			System.out.println("添加_日累计总额为必输项，不能为空");
			Reporter.log("添加_日累计总额字段为必输项，不能为空");
			assertTrue(false);
		}
		if(bean.getAdd_TerminalMerchantLimitTimeBegin().equals("")) {
			System.out.println("添加_终端/商户限制起始时间为必输项，不能为空");
			Reporter.log("添加_终端/商户限制起始时间字段为必输项，不能为空");
			assertTrue(false);
		}
		if(bean.getAdd_TerminalMerchantLimitTimeEnd().equals("")) {
			System.out.println("添加_终端/商户限制结束时间为必输项，不能为空");
			Reporter.log("添加_终端/商户限制结束时间字段为必输项，不能为空");
			assertTrue(false);
		}
		RiskControlParameterMaintainPage.clickAdd();
		wait.waitFor(1000);
		RiskControlParameterMaintainPage.selectAdd_LimitLv(bean.getAdd_LimitLv());
		doSearchMerchant_Add(bean.getAdd_SearchMer_MerNO(), bean.getAdd_SearchMer_MerName(), bean.getAdd_SearchMer_Radio());
		RiskControlParameterMaintainPage.setAdd_SingleTradeDebitCardLimit(bean.getAdd_SingleTradeDebitCardLimit());
		RiskControlParameterMaintainPage.setAdd_DebitCardDayLimit(bean.getAdd_DebitCardDayLimit());
		RiskControlParameterMaintainPage.setAdd_SingleTradeCreditCardLimit(bean.getAdd_SingleTradeCreditCardLimit());
		RiskControlParameterMaintainPage.setAdd_CreditCardDayLimit(bean.getAdd_CreditCardDayLimit());
		RiskControlParameterMaintainPage.setAdd_ScanCodeSingleLimit(bean.getAdd_ScanCodeSingleLimit());
		RiskControlParameterMaintainPage.setAdd_ScanCodeDayLimit(bean.getAdd_ScanCodeDayLimit());
		RiskControlParameterMaintainPage.setAdd_DayTotalLimit(bean.getAdd_DayTotalLimit());
		RiskControlParameterMaintainPage.setAdd_TerminalMerchantLimitTimeBegin(bean.getAdd_TerminalMerchantLimitTimeBegin());
		RiskControlParameterMaintainPage.setAdd_TerminalMerchantLimitTimeEnd(bean.getAdd_TerminalMerchantLimitTimeEnd());
		wait.waitFor(1000);
		RiskControlParameterMaintainPage.clickAdd_Submit();
		System.out.println(RiskControlParameterMaintainPage.getNotice());
		Reporter.log(RiskControlParameterMaintainPage.getNotice());
//		RiskControlParameterMaintainPage.clickAdd_Close();
	}


	public void doQueryForClickButton(OffLineRiskControlManagement_RiskControlParameterMaintainBean bean) {
		if(!bean.getTerminalNO().equals("")) {
			RiskControlParameterMaintainPage.setTerminalNO(bean.getTerminalNO());
		}
		if(!bean.getMerchantNO().equals("")) {
			RiskControlParameterMaintainPage.setMerchantNO(bean.getMerchantNO());
		}
		if(!bean.getMerchantName().equals("")) {
			RiskControlParameterMaintainPage.setMerchantName(bean.getMerchantName());
		}
		if(!bean.getMerchantStatus().equals("")) {
			RiskControlParameterMaintainPage.selectMerchantStatus(bean.getMerchantStatus());
		}
		if(!bean.getMCC().equals("")) {
			RiskControlParameterMaintainPage.selectMCC(bean.getMCC());
		}
		if(!bean.getProvince().equals("")) {
			RiskControlParameterMaintainPage.selectProvince(bean.getProvince());
		}
		if(!bean.getProvince().equals("")&&!bean.getCity().equals("")) {
			RiskControlParameterMaintainPage.selectCity(bean.getCity());
		}
		if(!bean.getInnerMerchantType().equals("")) {
			RiskControlParameterMaintainPage.selectInnerMerchantType(bean.getInnerMerchantType());
		}
		if(!bean.getInnerMerchantType().equals("")&&!bean.getInnerMerchantTypeLv2().equals("")) {
			RiskControlParameterMaintainPage.selectInnerMerchantType(bean.getInnerMerchantType());
			RiskControlParameterMaintainPage.selectInnerMerchantTypeLv2(bean.getInnerMerchantTypeLv2());
		}
		if(!bean.getStartDate().equals("")&&!bean.getEndDate().equals("")) {
			RiskControlParameterMaintainPage.setStartDate(bean.getStartDate());
			RiskControlParameterMaintainPage.setEndDate(bean.getEndDate());
		}
		RiskControlParameterMaintainPage.clickQuery();
		wait.waitFor(500);
		RiskControlParameterMaintainPage.clickRadio(bean.getRadio());
		wait.waitFor(500);
	}
}