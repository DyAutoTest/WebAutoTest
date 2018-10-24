package com.dy.AutoTest.OperationPlatform.TestCases.MerchantManagementOnLine.OnLineMechantInfo;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.dy.AutoTest.OperationPlatform.POJO.MerchantAuditBean;
import com.dy.AutoTest.OperationPlatform.PageObject.MerchantManagementOnLine.OnLineMerchantInfo.MerchantAuditPage;
import com.dy.AutoTest.OperationPlatform.TestCases.SuperTest;
import com.dy.AutoTest.web.business.DataBusiness;
import com.dy.AutoTest.web.business.MerchantBusiness;
import com.dy.AutoTest.web.dao.MerchantDao;
import com.dy.AutoTest.web.dao.impl.MerchantDaoImpl;

public class MerchantAuditPageTest extends SuperTest{
	private MerchantAuditPage merchantAuditPage;

	private String URL="";

	@BeforeClass
	public void init() {
		merchantAuditPage=new MerchantAuditPage(driver);
		URL=host.toString()+DataBusiness.getData_URL("pop_OnlineMerchantAudit");
	}
	
	@Parameters({"AuditID"})
	@Test
	public void testMerchantAuditPass(String AuditID) {
		MerchantAuditBean merchantAuditBean=data.getDataBean("POP_Data_MerchantAudit", AuditID);
//		merchantAuditPage.setWaitTime(500);
		merchantAuditPage.navigateTo(URL);
		
		merchantAuditPage.setTrasactionName(merchantAuditBean.getTransactionName());
		merchantAuditPage.setOperID(merchantAuditBean.getOperID());
		merchantAuditPage.doQuery();
		
		List<WebElement> radioes=merchantAuditPage.getRadioes();
		for (int i=0;i<radioes.size();i++) {
			if(merchantAuditPage.isTestingData(i)) {
				if(i>2) merchantAuditPage.doPageDown();
				merchantAuditPage.selectRadio(i);
//				wait.waitFor(500);
				if(i>2) {
					merchantAuditPage.doLoseFocus(i);
					merchantAuditPage.doUp();
				}
//				wait.waitFor(500);
				merchantAuditPage.doAudit();
				if(AuditID.equals("1")){
					String merchantName=merchantAuditPage.getMerchantName();
					merchantAuditPage.setAuditComment("Pass");
					merchantAuditPage.doPass();
					if(merchantAuditPage.getNotice().equals("商户资料通过复核！")) {
						MerchantDao merchantDaoImpl=new MerchantDaoImpl();
						MerchantBusiness merchantBusiness=new MerchantBusiness(merchantDaoImpl);
						String merchantNO=merchantBusiness.getMerchantNOByName(merchantName);
//						data.updateMerchantInfoStatusToPass(merchantNO, merchantName);
						Map<String , Object> updateMap =new HashMap<>();
						Map<String , Object> whereMap =new HashMap<>();
						updateMap.put("MerchantNO", merchantNO);
						updateMap.put("AuditStatus", "1");
						whereMap.put("A_MerchantName", merchantName);
						DataBusiness.updateTestData("POP_Data_MerchantInfo", updateMap, whereMap);
						
//						data.insertMerchantSettlementInfo(merchantNO, merchantName);
						
						Map<String , Object> insertMap =new HashMap<>();
						insertMap.put("MerchantNO", merchantNO);
						insertMap.put("MerchantName", merchantName);
						DataBusiness.insertTestData("POP_Data_MerchantSettlement", insertMap);
						i--;
					}else {
						System.out.println(merchantAuditPage.getNotice());
						wait.waitFor(500);
						merchantAuditPage.doCancel();
						assertTrue(false);
					}
<<<<<<< HEAD
				} 
				//如果是商户结算信息新增审核
=======
				}
>>>>>>> refs/heads/master
				if(AuditID.equals(("6"))){
					String merchantNO=merchantAuditPage.getSettlementMerchantNO();
					String merchantName=merchantAuditPage.getSettlementMerchantName();
					merchantAuditPage.setAuditComment2("Pass");
					merchantAuditPage.doSettlement_Pass();
					if(merchantAuditPage.getNotice().equals("商户结算信息通过复核！")) {
						System.out.println(merchantNO+" 结算信息复核成功");
//						data.insertMerchantFeeRate(merchantNO,merchantName);
						Map<String , Object > insertMap=new HashMap<>();
						insertMap.put("MerchantNO", merchantNO);
						insertMap.put("MerchantName", merchantName);
						DataBusiness.insertTestData("POP_Data_MerchantFeeRate", insertMap);
						i--;
					}else {
						System.out.println(merchantAuditPage.getNotice());
						wait.waitFor(500);
						merchantAuditPage.doCancel();
						assertTrue(false);
					}
				}
				if(AuditID.equals(("3"))){
					String merchantNO=merchantAuditPage.getFeeRate_MerchantNO();
					String merchantName=merchantAuditPage.getFeeRate_MerchantName();
					String productType=merchantAuditPage.getProductType();
					merchantAuditPage.setAuditComment3("Pass");
					merchantAuditPage.doFeeRate_Pass();
					if(merchantAuditPage.getNotice().contains("通过复核！")) {
						System.out.println(merchantNO+" 费率复核成功");
						List<String > selectList=new ArrayList<>();
						Map<String , Object> whereMap=new HashMap<>();
						selectList.add("ProductType");
						whereMap.put("MerchantNO", merchantNO);
//						Map<String , Object> result=data.querySingleMerchantProduct(list,queryMap);
						Map<String , Object> result=DataBusiness.querySingle("POP_Data_MerchantProduct", selectList, whereMap);
						if(result.isEmpty()) {
							Map<String , Object> insertMap=new HashMap<>();
							insertMap.put("MerchantNO", merchantNO);
							insertMap.put("MerchantName", merchantName);
							insertMap.put("ProductType", productType);
//							data.insertMerchantProduct(insertMap);
							DataBusiness.insertTestData("POP_Data_MerchantProduct", insertMap);
						}else {
							Map<String, Object> updateMap2=new HashMap<>();
							Map<String, Object> whereMap2=new HashMap<>();
							updateMap2.put("ProductType=ProductType||\',"+productType+"\'", "");
							whereMap2.put("MerchantNO", merchantNO);
							DataBusiness.updateTestData("POP_Data_MerchantProduct", updateMap2, whereMap2,true);
						}
						i--;
					}else {
						System.out.println(merchantAuditPage.getNotice());
						wait.waitFor(500);
						merchantAuditPage.doCancel();
						assertTrue(false);
					}
				}
			}
			radioes=merchantAuditPage.getRadioes();
		}
	}
	
	@Parameters({"AuditID"})
	@Test
	public void testMerchantAuditRefuse(String AuditID) {
		MerchantAuditBean merchantAuditBean=data.getDataBean("POP_Data_MerchantAudit", AuditID);
		
		merchantAuditPage.setWaitTime(500);
		
		merchantAuditPage.navigateTo(URL);
		
		merchantAuditPage.setTrasactionName(merchantAuditBean.getTransactionName());
		merchantAuditPage.setOperID(merchantAuditBean.getOperID());
		merchantAuditPage.doQuery();
		
		List<WebElement> radioes=merchantAuditPage.getRadioes();
		for (int i=0;i<(radioes.size());i++) { 
			if(merchantAuditPage.isTestingData(i)) {
				merchantAuditPage.selectRadio(i);
				merchantAuditPage.doAudit();
				if(AuditID.equals("1")||AuditID.equals(("2"))){
					String merchantName=merchantAuditPage.getMerchantName();
					merchantAuditPage.setAuditComment("Refuse");
					merchantAuditPage.doRefuse();
					if(merchantAuditPage.getNotice().equals("审核状态更新成功！")) {
						System.out.println(" 商户信息拒绝审核成功");
//						data.updateMerchantInfoStatusToRefuse(merchantName);
						Map<String , Object> updateMap=new HashMap<>();
						Map<String , Object> whereMap=new HashMap<>();
						updateMap.put("AuditStatus", "2");
						whereMap.put("A_MerchantName", merchantName);
						DataBusiness.updateTestData("POP_Data_MerchantInfo", updateMap, whereMap);
						i--;
					}else {
						System.out.println(merchantAuditPage.getNotice());
						Reporter.log(merchantAuditPage.getNotice());
						wait.waitFor(500);
						merchantAuditPage.doCancel();
						assertTrue(false);
					}
				}
				if(AuditID.equals("5")||AuditID.equals(("6"))){
					String merchantNO=merchantAuditPage.getSettlementMerchantNO();
					merchantAuditPage.setAuditComment2("Refuse");
					merchantAuditPage.doSettlement_Refuse();
					if(merchantAuditPage.getNotice().equals("审核状态更新成功！")) {
//						data.update
						System.out.println(merchantNO+" 结算信息拒绝审核成功");
						i--;
					}else {
						System.out.println(merchantAuditPage.getNotice());
						wait.waitFor(500);
						merchantAuditPage.doCancel();
						assertTrue(false);
					}
				}
				if(AuditID.equals("3")||AuditID.equals(("4"))){
					String merchantNO=merchantAuditPage.getFeeRate_MerchantNO();
					merchantAuditPage.setAuditComment3("Refuse");
					merchantAuditPage.doFeeRate_Refuse();
					if(merchantAuditPage.getNotice().equals("审核状态更新成功！")) {
						System.out.println(merchantNO+" 费率拒绝审核成功");
						i--;
					}else {
						System.out.println(merchantAuditPage.getNotice());
						wait.waitFor(500);
						merchantAuditPage.doCancel();
						assertTrue(false);
						
					}
				}
			}

			radioes=merchantAuditPage.getRadioes();
		}
			
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
