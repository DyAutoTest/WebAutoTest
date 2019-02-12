package com.dy.AutoTest.AcquiringOperationPlatform.PageTest.MerchantInfoManagement;

import static org.testng.Assert.assertTrue;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.dy.AutoTest.web.api.SuperTest;
import com.dy.AutoTest.AcquiringOperationPlatform.PageObject.MerchantInfoManagement.MerchantAuditPage;
import com.dy.AutoTest.AcquiringOperationPlatform.POJO.MerchantInfoManagement_MerchantAuditBean;
import com.dy.AutoTest.web.business.DataBusiness;

public class MerchantAuditPageTest extends SuperTest{
	MerchantAuditPage MerchantAuditPage;
	String URL;
//	private static Map<String,Map<String, String >> auditProperty=new HashMap<String ,Map<String,String>>();
//	private static Map<String, String > preAudit=new;
	@BeforeClass
	public void init() {
		/******** instant objectPage *********/
		MerchantAuditPage=new MerchantAuditPage(driver);
		//MerchantAuditPage.setWaitTime(800);

		/******** set URL *********/
		URL=host.toString()+DataBusiness.getData_URL("aop_MerchantInfoManagement_MerchantAudit");

		/******** instant Interface *********/
		iQuery=MerchantAuditPage;
//		iClickButton=MerchantAuditPage;
//		iClickRadio=MerchantAuditPage;
//		iSearchMerchant=MerchantAuditPage;
	}

	@DataProvider(name="MerchantInfoManagement_MerchantAudit")
	protected static Object[][] parametersPool(){
		data.loadDataBeanList("AOP_Data_MerchantInfoManagement_MerchantAudit",MerchantInfoManagement_MerchantAuditBean.class);
		return data.getDataBeanArray();
	}

	@DataProvider(name="MerchantInfoManagement_MerchantAuditByCaseNO")
	protected static Object[][] parametersPool(Method method){
		data.loadDataBeanList("AOP_Data_MerchantInfoManagement_MerchantAudit",method.getName(),MerchantInfoManagement_MerchantAuditBean.class);
		return data.getDataBeanArray();
	}

	@Test(dataProvider="MerchantInfoManagement_MerchantAuditByCaseNO")
	public void testQuery(MerchantInfoManagement_MerchantAuditBean bean) {
		MerchantAuditPage.navigateTo(URL);
		wait.waitFor(500);
		if(!bean.getTradeName().equals("")) {
			MerchantAuditPage.setTradeName(bean.getTradeName());
			doQuery();
		}
		if(!bean.getKeyInfo().equals("")) {
			MerchantAuditPage.setKeyInfo(bean.getKeyInfo());
			doQuery();
		}
		if(!bean.getMerchantCode().equals("")) {
			MerchantAuditPage.setMerchantCode(bean.getMerchantCode());
			doQuery();
		}
		if(!bean.getTradeCode().equals("")) {
			MerchantAuditPage.setTradeCode(bean.getTradeCode());
			doQuery();
		}
		if(!bean.getInnerMerchantType().equals("")&&bean.getInnerMerchantSubType().equals("")) {
			MerchantAuditPage.selectInnerMerchantType(bean.getInnerMerchantType());
			doQuery();
		}
		if(!bean.getInnerMerchantType().equals("")&&!bean.getInnerMerchantSubType().equals("")) {
			MerchantAuditPage.selectInnerMerchantType(bean.getInnerMerchantType());
			MerchantAuditPage.selectInnerMerchantSubType(bean.getInnerMerchantSubType());
			doQuery();
		}
		if(!bean.getTradeOperater().equals("")) {
			MerchantAuditPage.setTradeOperater(bean.getTradeOperater());
			doQuery();
		}
		if(!bean.getAuditStatus().equals("")) {
			MerchantAuditPage.selectAuditStatus(bean.getAuditStatus());
			doQuery();
		}
	}
	@Test(dataProvider="MerchantInfoManagement_MerchantAuditByCaseNO")
	public void testPreAuditPass(MerchantInfoManagement_MerchantAuditBean bean) {
		doPreAudit(bean);
//		MerchantAuditPage.clickPreAuditOperation_Pass();
//		String noticeForSuccess=MerchantAuditPage.getNotice();
//		System.out.println(noticeForSuccess);
//		Reporter.log(noticeForSuccess);
//		if(noticeForSuccess.equals("审核状态更新成功！")) {
//			doAddAuditRecord(bean,"testRecheckAuditPass","F1","初审通过","复审通过");
//			doAddAuditRecord(bean,"testRecheckAuditFail","F1","初审通过","复审不通过");
//		}
		MerchantAuditPage.clickPreAuditOperation_Close();
	}
	@Test(dataProvider="MerchantInfoManagement_MerchantAuditByCaseNO")
	public void testPreAuditFail(MerchantInfoManagement_MerchantAuditBean bean) {
		doPreAudit(bean);
//		MerchantAuditPage.clickPreAuditOperation_NoPass();
//		String noticeForSuccess=MerchantAuditPage.getNotice();
//		System.out.println(MerchantAuditPage.getNotice());
//		Reporter.log(MerchantAuditPage.getNotice());
//		if(noticeForSuccess.equals("审核状态更新成功！")) {
//			doUpdateAuditRecord(bean,"R1",bean.getPreAuditOperation_PreAuditTips(),bean.getRecheckOperation_RecheckTips());
//		}
		MerchantAuditPage.clickPreAuditOperation_Close();
	}
	@Test(dataProvider="MerchantInfoManagement_MerchantAuditByCaseNO")
	public void testRecheckAuditPass(MerchantInfoManagement_MerchantAuditBean bean) {
		doRecheckAudit(bean);
//		MerchantAuditPage.clickRecheckOperation_Pass();
//		System.out.println(MerchantAuditPage.getNotice());
//		Reporter.log(MerchantAuditPage.getNotice());
		MerchantAuditPage.clickRecheckOperation_Close();
	}
	@Test(dataProvider="MerchantInfoManagement_MerchantAuditByCaseNO")
	public void testRecheckAuditFail(MerchantInfoManagement_MerchantAuditBean bean) {
		doRecheckAudit(bean);
//		MerchantAuditPage.clickRecheckOperation_NoPass();
//		System.out.println(MerchantAuditPage.getNotice());
//		Reporter.log(MerchantAuditPage.getNotice());
		MerchantAuditPage.clickRecheckOperation_Close();
	}
	
	
	
	public void doPreAudit(MerchantInfoManagement_MerchantAuditBean bean) {
		if(!driver.getCurrentUrl().equals(URL)) {
			MerchantAuditPage.navigateTo(URL);
		}
		if(bean.getPreAuditOperation_PreAuditTips().equals("")) {
			System.out.println("初审备注字段为必输项，不能为空");
			Reporter.log("初审备注字段为必输项，不能为空");
			assertTrue(false);
		}
		doQueryForClickButton(bean);
		MerchantAuditPage.clickPreAuditOperation();
		wait.waitFor(1000);
		MerchantAuditPage.setPreAuditOperation_PreAuditTips(bean.getPreAuditOperation_PreAuditTips());
		wait.waitFor(2000);
	}
	public void doRecheckAudit(MerchantInfoManagement_MerchantAuditBean bean) {
		if(!driver.getCurrentUrl().equals(URL)) {
			MerchantAuditPage.navigateTo(URL);
		}
		if(bean.getRecheckOperation_RecheckTips().equals("")) {
			System.out.println("复审备注字段为必输项，不能为空");
			Reporter.log("复审备注字段为必输项，不能为空");
			assertTrue(false);
		}
		doQueryForClickButton(bean);
		MerchantAuditPage.clickRecheckOperation();
		wait.waitFor(1000);
		MerchantAuditPage.selectRecheckAudit_RiskTemplate(bean.getRecheckAudit_RiskTemplate());
		MerchantAuditPage.setRecheckOperation_RecheckTips(bean.getRecheckOperation_RecheckTips());
		wait.waitFor(2000);
	}
	public void doAddAuditRecord(MerchantInfoManagement_MerchantAuditBean bean,String caseNO,String auditStatus,String preTips,
			String recheckTips) {
		Map<String, Object> insertMap=new HashMap<String,Object>();
		insertMap.put("CaseNO", caseNO);
		if(!bean.getTradeName().equals("")) {
			insertMap.put("TradeName",bean.getTradeName());
		}
		if(!bean.getKeyInfo().equals("")) {
			insertMap.put("KeyInfo",bean.getKeyInfo());
		}
		if(!bean.getMerchantCode().equals("")) {
			insertMap.put("MerchantCode",bean.getMerchantCode());
		}
		if(!bean.getTradeCode().equals("")) {
			insertMap.put("TradeCode",bean.getTradeCode());
		}
		if(!bean.getInnerMerchantType().equals("")) {
			insertMap.put("InnerMerchantType",bean.getInnerMerchantType());
		}
		if(!bean.getInnerMerchantSubType().equals("")) {
			insertMap.put("InnerMerchantSubType",bean.getInnerMerchantSubType());
		}
		if(!bean.getTradeOperater().equals("")) {
			insertMap.put("TradeOperater",bean.getTradeOperater());
		}
		insertMap.put("AuditStatus",auditStatus);
		if(!bean.getRadio().equals("")) {
			insertMap.put("Radio",bean.getRadio());
		}else {
			insertMap.put("Radio","0");
		}
		insertMap.put("PreAuditOperation_PreAuditTips", preTips);
		insertMap.put("RecheckOperation_RecheckTips", recheckTips);
		if(!bean.getRecheckAudit_RiskTemplate().equals("")) {
			insertMap.put("RecheckAudit_RiskTemplate",bean.getRecheckAudit_RiskTemplate());
		}else {
			insertMap.put("RecheckAudit_RiskTemplate","运营");
		}
		DataBusiness.insertTestData("AOP_Data_MerchantInfoManagement_MerchantAudit", insertMap);
	}
	public void doUpdateAuditRecord(MerchantInfoManagement_MerchantAuditBean bean,String auditStatus,String preTips,String recheckTips) {
		Map<String, Object> updateMap=new HashMap<String,Object>();
		Map<String, Object> whereMap=new HashMap<String,Object>();
		updateMap.put("AuditStatus", auditStatus);
		updateMap.put("PreAuditOperation_PreAuditTips", preTips);
		updateMap.put("RecheckOperation_RecheckTips", recheckTips);
		whereMap.put("ID", bean.getID());
//		DataBusiness.insertTestData("AOP_Data_MerchantInfoManagement_MerchantAudit", insertMap);
		DataBusiness.updateTestData("AOP_Data_MerchantInfoManagement_MerchantAudit", updateMap, whereMap);
	}
	
	
	public void doQueryForClickButton(MerchantInfoManagement_MerchantAuditBean bean) {
		if(!bean.getTradeName().equals("")) {
			MerchantAuditPage.setTradeName(bean.getTradeName());
		}
		if(!bean.getKeyInfo().equals("")) {
			MerchantAuditPage.setKeyInfo(bean.getKeyInfo());
		}
		if(!bean.getMerchantCode().equals("")) {
			MerchantAuditPage.setMerchantCode(bean.getMerchantCode());
		}
		if(!bean.getTradeCode().equals("")) {
			MerchantAuditPage.setTradeCode(bean.getTradeCode());
		}
		if(!bean.getInnerMerchantType().equals("")&&bean.getInnerMerchantSubType().equals("")) {
			MerchantAuditPage.selectInnerMerchantType(bean.getInnerMerchantType());
		}
		if(!bean.getInnerMerchantType().equals("")&&!bean.getInnerMerchantSubType().equals("")) {
			MerchantAuditPage.selectInnerMerchantType(bean.getInnerMerchantType());
			MerchantAuditPage.selectInnerMerchantSubType(bean.getInnerMerchantSubType());
		}
		if(!bean.getTradeOperater().equals("")) {
			MerchantAuditPage.setTradeOperater(bean.getTradeOperater());
		}
		if(!bean.getAuditStatus().equals("")) {
			MerchantAuditPage.selectAuditStatus(bean.getAuditStatus());
		}
		MerchantAuditPage.clickQuery();
		wait.waitFor(500);
		MerchantAuditPage.clickRadio(bean.getRadio());
		wait.waitFor(500);
	}
}