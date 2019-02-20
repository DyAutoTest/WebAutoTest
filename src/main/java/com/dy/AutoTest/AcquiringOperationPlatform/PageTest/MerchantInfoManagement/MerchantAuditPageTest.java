package com.dy.AutoTest.AcquiringOperationPlatform.PageTest.MerchantInfoManagement;

import static org.testng.Assert.assertTrue;

import java.lang.reflect.Method;
import java.util.ArrayList;
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
import com.dy.AutoTest.web.business.MerchantBusiness;

public class MerchantAuditPageTest extends SuperTest{
	MerchantAuditPage MerchantAuditPage;
	String URL;
	List<MerchantInfoManagement_MerchantAuditBean> preAuditPassBeansList=new ArrayList<MerchantInfoManagement_MerchantAuditBean>();
	List<MerchantInfoManagement_MerchantAuditBean> preAuditFailBeansList=new ArrayList<MerchantInfoManagement_MerchantAuditBean>();
	List<MerchantInfoManagement_MerchantAuditBean> recheckAuditPassBeansList=new ArrayList<MerchantInfoManagement_MerchantAuditBean>();
	List<MerchantInfoManagement_MerchantAuditBean> recheckAuditFailBeansList=new ArrayList<MerchantInfoManagement_MerchantAuditBean>();
	List<String > selectList=new ArrayList<String>();
	Map<String, Object> insertMap=new HashMap<String,Object>();
	Map<String, Object> updateMap=new HashMap<String,Object>();
	Map<String, Object> whereMap=new HashMap<String,Object>();
	Map<String, Object> result;
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
		MerchantAuditPage.clickPreAuditOperation_Pass();
		String noticeForSuccess=MerchantAuditPage.getNotice();
		System.out.println(noticeForSuccess);
		Reporter.log(noticeForSuccess);
		if(noticeForSuccess.equals("审核状态更新成功！")) {
			preAuditPassBeansList.add(bean);
		}
//		MerchantAuditPage.clickPreAuditOperation_Close();
	}
	@Test(dataProvider="MerchantInfoManagement_MerchantAuditByCaseNO")
	public void testPreAuditFail(MerchantInfoManagement_MerchantAuditBean bean) {
		doPreAudit(bean);
		MerchantAuditPage.clickPreAuditOperation_NoPass();
		String noticeForSuccess=MerchantAuditPage.getNotice();
		System.out.println(MerchantAuditPage.getNotice());
		Reporter.log(MerchantAuditPage.getNotice());
		if(noticeForSuccess.equals("审核状态更新成功！")) {
			preAuditFailBeansList.add(bean);
		}
//		MerchantAuditPage.clickPreAuditOperation_Close();
	}
	@Test(dataProvider="MerchantInfoManagement_MerchantAuditByCaseNO")
	public void testRecheckAuditPass(MerchantInfoManagement_MerchantAuditBean bean) {
		doRecheckAudit(bean);
		MerchantAuditPage.clickRecheckOperation_Pass();
		String noticeForSuccess=MerchantAuditPage.getNotice();
		System.out.println(noticeForSuccess);
		Reporter.log(noticeForSuccess);
		if(noticeForSuccess.equals("审核状态更新成功！")) {
			//查询业务表的商户号
			String merchantNO=MerchantBusiness.getOfflineMerchantNOByName(bean.getKeyInfo());
			if(!merchantNO.equals("")) {
				bean.setMerchantCode(merchantNO);
				System.out.println("新增商户“"+bean.getKeyInfo()+"”的商户号号为："+merchantNO);
				Reporter.log("新增商户“"+bean.getKeyInfo()+"”的商户号号为："+merchantNO);
				recheckAuditPassBeansList.add(bean);
			}
		}
//		MerchantAuditPage.clickRecheckOperation_Close();
	}
	@Test(dataProvider="MerchantInfoManagement_MerchantAuditByCaseNO")
	public void testRecheckAuditFail(MerchantInfoManagement_MerchantAuditBean bean) {
		doRecheckAudit(bean);
		MerchantAuditPage.clickRecheckOperation_NoPass();
		String noticeForSuccess=MerchantAuditPage.getNotice();
		System.out.println(MerchantAuditPage.getNotice());
		Reporter.log(noticeForSuccess);
		if(noticeForSuccess.equals("审核状态更新成功！")) {
			//更改该条记录
			
		}
//		MerchantAuditPage.clickRecheckOperation_Close();
	}
	
	
//	***********************数据库操作**********************************************

	@Test
	public void testInsertRecheckAuditPassRecord() {
		if(preAuditPassBeansList.size()>0) {
			for(MerchantInfoManagement_MerchantAuditBean bean:preAuditPassBeansList) {
				insertMap.put("CaseNO", "testRecheckAuditPass");
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
				insertMap.put("AuditStatus","F1");
				if(!bean.getRadio().equals("")) {
					insertMap.put("Radio",bean.getRadio());
				}else {
					insertMap.put("Radio","0");
				}
				if(!bean.getPreAuditOperation_PreAuditTips().equals("")) {
					insertMap.put("PreAuditOperation_PreAuditTips", bean.getPreAuditOperation_PreAuditTips());
					
				}
				insertMap.put("RecheckOperation_RecheckTips", "复审通过");
				if(!bean.getRecheckAudit_RiskTemplate().equals("")) {
					insertMap.put("RecheckAudit_RiskTemplate",bean.getRecheckAudit_RiskTemplate());
				}else {
					insertMap.put("RecheckAudit_RiskTemplate","运营");
				}
				selectList.add("count(1) count");
				result=DataBusiness.querySingle("AOP_Data_MerchantInfoManagement_MerchantAudit", selectList, insertMap);
				if((Integer)result.get("count")==0) {
					DataBusiness.insertTestData("AOP_Data_MerchantInfoManagement_MerchantAudit", insertMap);
				}else {
					System.out.println("关键字“"+insertMap.get("KeyInfo")+"”的测试数据已存在，ID为："+insertMap.get("ID"));
					Reporter.log("关键字“"+insertMap.get("KeyInfo")+"”的测试数据已存在，ID为："+insertMap.get("ID"));
				}
			}
			clearSqlCollection();
			preAuditPassBeansList.clear();
		}
	}
	@Test
	public void testInsertRecheckAuditFailRecord() {
		if(preAuditFailBeansList.size()>0) {
			for(MerchantInfoManagement_MerchantAuditBean bean:preAuditFailBeansList) {
				insertMap.put("CaseNO", "testRecheckAuditFail");
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
				insertMap.put("AuditStatus","F1");
				if(!bean.getRadio().equals("")) {
					insertMap.put("Radio",bean.getRadio());
				}else {
					insertMap.put("Radio","0");
				}
				if(!bean.getPreAuditOperation_PreAuditTips().equals("")) {
					insertMap.put("PreAuditOperation_PreAuditTips", bean.getPreAuditOperation_PreAuditTips());
					
				}
				insertMap.put("RecheckOperation_RecheckTips", "复审不通过");
				if(!bean.getRecheckAudit_RiskTemplate().equals("")) {
					insertMap.put("RecheckAudit_RiskTemplate",bean.getRecheckAudit_RiskTemplate());
				}else {
					insertMap.put("RecheckAudit_RiskTemplate","运营");
				}
				selectList.add("count(1) count");
				result=DataBusiness.querySingle("AOP_Data_MerchantInfoManagement_MerchantAudit", selectList, insertMap);
				if((Integer)result.get("count")==0) {
					DataBusiness.insertTestData("AOP_Data_MerchantInfoManagement_MerchantAudit", insertMap);
				}else {
					System.out.println("关键字“"+insertMap.get("KeyInfo")+"”的测试数据已存在，ID为："+insertMap.get("ID"));
					Reporter.log("关键字“"+insertMap.get("KeyInfo")+"”的测试数据已存在，ID为："+insertMap.get("ID"));
				}
			}
			clearSqlCollection();
			preAuditFailBeansList.clear();
		}
	}
	@Test
	public void testInsertStoreRecord() {
		if(recheckAuditPassBeansList.size()>0) {
			for(MerchantInfoManagement_MerchantAuditBean bean:recheckAuditPassBeansList) {
				//插入前检查
				Map<String, Object> whereMap=new HashMap<String,Object>();
				selectList.add("count(1) count");
				whereMap.put("CaseNO", "testAdd");
				whereMap.put("SearchMer_MerName", bean.getKeyInfo());
				Map<String, Object> result1=DataBusiness.querySingle("AOP_Data_MerchantInfoManagement_MerchantStoreManagement", selectList, whereMap);
				whereMap.remove("SearchMer_MerName");
				whereMap.put("SearchMer_MerchantNO", bean.getMerchantCode());
				Map<String, Object> result2=DataBusiness.querySingle("AOP_Data_MerchantInfoManagement_MerchantStoreManagement", selectList, whereMap);
				if((Integer)result1.get("count")==0&&(Integer)result2.get("count")==0){
					DataBusiness.insertTestData("AOP_Data_MerchantInfoManagement_MerchantStoreManagement", insertMap);
				}
			}
			clearSqlCollection();
			recheckAuditPassBeansList.clear();
		}
	}
	@Test
	public void testUpdatePreAuditFailRecord() {
		if(preAuditFailBeansList.size()>0) {
			for(MerchantInfoManagement_MerchantAuditBean bean:preAuditFailBeansList) {
				updateMap.put("AuditStatus", "R1");
				whereMap.put("ID", bean.getID());
				DataBusiness.updateTestData("AOP_Data_MerchantInfoManagement_MerchantAudit", updateMap, whereMap);
			}
			clearSqlCollection();
			preAuditFailBeansList.clear();
		}
	}
	@Test
	public void testUpdateRecheckFailAuditRecord() {
		if(recheckAuditFailBeansList.size()>0) {
			for(MerchantInfoManagement_MerchantAuditBean bean:recheckAuditFailBeansList) {
				updateMap.put("AuditStatus", "Z1");
				whereMap.put("ID", bean.getID());
				DataBusiness.updateTestData("AOP_Data_MerchantInfoManagement_MerchantAudit", updateMap, whereMap);
			}
			clearSqlCollection();
			recheckAuditFailBeansList.clear();
		}
	}
	
	public void clearSqlCollection() {
		selectList.clear();
		insertMap.clear();
		updateMap.clear();
		whereMap.clear();
	}
	
//	*****************************************************************************
	
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
			System.out.println("RecheckOperation_RecheckTips（复审备注）字段为必输项，不能为空");
			Reporter.log("RecheckOperation_RecheckTips（复审备注）字段为必输项，不能为空");
			assertTrue(false);
		}
		if(bean.getRecheckAudit_RiskTemplate().equals("")) {
			System.out.println("RecheckAudit_RiskTemplate（实时风控参数模版） 字段为必输项，不能为空");
			Reporter.log("RecheckAudit_RiskTemplate（实时风控参数模版） 字段为必输项，不能为空");
			assertTrue(false);
		}
		doQueryForClickButton(bean);
		MerchantAuditPage.clickRecheckOperation();
		wait.waitFor(1000);
		MerchantAuditPage.selectRecheckAudit_RiskTemplate(bean.getRecheckAudit_RiskTemplate());
		MerchantAuditPage.setRecheckOperation_RecheckTips(bean.getRecheckOperation_RecheckTips());
		wait.waitFor(2000);
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