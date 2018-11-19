package com.dy.AutoTest.OperationPlatform.TestCases.MerchantManagementOnLine.OnLineMechantInfo;

import static org.testng.Assert.assertTrue;

import java.util.HashMap;
import java.util.Map;

import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.dy.AutoTest.OperationPlatform.POJO.MerchantSettlementAlterBean;
import com.dy.AutoTest.OperationPlatform.POJO.MerchantSettlementBean;
import com.dy.AutoTest.OperationPlatform.PageObject.MerchantManagementOnLine.OnLineMerchantInfo.MerchantSettlementPage;
import com.dy.AutoTest.OperationPlatform.TestCases.SuperTest;
import com.dy.AutoTest.web.actions.SingletonSet;
import com.dy.AutoTest.web.business.DataBusiness;

/**
 * @author Jerry
 * @description
 * Process of Testing MerchantInfoInsert:
 * 	- Get url from Database ;
 * 	- Load dataProvider ;
 * 	- 两种方式搜索到指定商户：通过MerchantNO；通过MerchantName;
 * 	- 判断该商户状态是否可以被新增、修改、查询
 * 	- 新增流程，注意：起始日期需要取当前会计日期，"下一个结算日期"也需要取当前会计日期，早了无效；日期js需要失焦
 *  - Assert Notice is or not equal/contains expected value ;
 * 	- If true , insert new record in table "POP_Data_MerchantSettlement"
 * 
 */
public class MerchantSettlementPageTest extends SuperTest{ 
	
	MerchantSettlementPage merchantSettlementPage;
	String URL;
	
	
	@BeforeClass
	public void init() {
		merchantSettlementPage=new MerchantSettlementPage(driver);
		URL=host.toString()+DataBusiness.getData_URL("pop_OnlineMerchantSettlement");
		merchantSettlementPage.setWaitTime(1000);
	}
	
	@DataProvider(name="SettlementInfoInsert")
	protected static Object[][] parametersPoolForSqlite(){
		data.loadDataBeanList("POP_Data_MerchantSettlement");
		return data.getDataBeanArray();
	}
	
	@DataProvider(name="SettlementInfoAlter")
	protected static Object[][] parametersPoolForSqlite2(){
		data.loadDataBeanList("POP_Data_MerchantSettlementAlter");
		return data.getDataBeanArray();
	}
	
	/**
	 * @param merchantSettlementBean
	 * 商户结算信息新增
	 */
	@Test(dataProvider="SettlementInfoInsert")
	public void testMerchantSettlementInsert(MerchantSettlementBean merchantSettlementBean) {
		//跳转商户结算页面
		merchantSettlementPage.navigateTo(URL);
		//如果数据中商户号和商户名都为空，直接打断测试
		if(merchantSettlementBean.getMerchantNO().equals("")
				&&merchantSettlementBean.getMerchantName().equals("")) {
			System.out.println("Both of NO and Name is null! Please check (SQLite--POP_Data_MerchantSettlement) ID= "+merchantSettlementBean.getID());
			Reporter.log("Both of NO and Name is null! Please check (SQLite--POP_Data_MerchantSettlement) ID= "+merchantSettlementBean.getID());

			assertTrue(false);
		}//如果商户号不为空，设置商户号
		else if(!merchantSettlementBean.getMerchantNO().equals("")) {
			merchantSettlementPage.setMerchantNO(merchantSettlementBean.getMerchantNO());
		}//如果商户号为空，使用商户名去搜索商户
		else {
			merchantSettlementPage.setMerchantNOByName(merchantSettlementBean.getMerchantName());
		}
		//查询结算信息
		merchantSettlementPage.doQuery();
		
		//判断是否可以新增结算信息
		String merchantNO=merchantSettlementPage.getMerchantNO();
		assertTrue(merchantSettlementPage.isSettlementInfoAddEnable()); 
		
		//插入当前会计日期为下个结算日期
		Map<String , Object > updateMap=new HashMap<>();
		if(merchantSettlementBean.getNextSettlementDate().equals("")){
			updateMap.put("NextSettlementDate", SingletonSet.CurrentAccountantDate.toString());
		}
		//插入当前会计日期为结算开始日期
		if(merchantSettlementBean.getSettlement_StartDate().equals("")){
			updateMap.put("Settlement_StartDate", SingletonSet.CurrentAccountantDate.toString());
		}
		//如果商户号为空，更新商户号
		if(merchantSettlementBean.getMerchantNO().equals("")) {
			updateMap.put("MerchantNO", merchantNO);
		}
		if(!updateMap.isEmpty()) {
//			data.updateSettlementByID(merchantSettlementBean.getID(),updateMap);
			Map<String , Object> whereMap=new HashMap<>();
			whereMap.put("ID", merchantSettlementBean.getID());
			DataBusiness.updateTestData("POP_Data_MerchantSettlement", updateMap, whereMap);
		}
		
		merchantSettlementPage.setBankName(merchantSettlementBean.getBankName());
		merchantSettlementPage.setSubBankBelongProvice(merchantSettlementBean.getSubBankBelongProvice());
		merchantSettlementPage.setSubBankBelongCity(merchantSettlementBean.getSubBankBelongCity());
		merchantSettlementPage.setSubBankInfo(merchantSettlementBean.getSubBankInfo());
		
		merchantSettlementPage.setAccount(merchantSettlementBean.getAccount());
		merchantSettlementPage.setAccountName(merchantSettlementBean.getAccountName());
		
		merchantSettlementPage.setSettlementCycle(merchantSettlementBean.getSettlementCycle());
		merchantSettlementPage.setSettlementDays(merchantSettlementBean.getSettlementDays());
		
		merchantSettlementPage.setNextSettlementDate(merchantSettlementBean.getNextSettlementDate());
		merchantSettlementPage.setSettlement_StartDate(merchantSettlementBean.getSettlement_StartDate());
		merchantSettlementPage.setSettlement_ExpireDate(merchantSettlementBean.getSettlement_ExpireDate());
				merchantSettlementPage.doLoseFocus();
		
		merchantSettlementPage.setStart_Amount(merchantSettlementBean.getStart_Amount());
		merchantSettlementPage.setMinimum_Amount(merchantSettlementBean.getMinimum_Amount());
		
		merchantSettlementPage.doButton_Submit();
		
		if(merchantSettlementPage.getNotice().contains("成功")) {
			Map<String , Object > updateMap2 =new HashMap<>();
			updateMap2.put("Status", "0");
//			data.updateSettlementByID(merchantSettlementBean.getID(), map2);
			Map<String , Object> whereMap2=new HashMap<>();
			whereMap2.put("ID", merchantSettlementBean.getID());
			DataBusiness.updateTestData("POP_Data_MerchantSettlement", updateMap2, whereMap2);
		}else {
			System.out.println(merchantSettlementPage.getNotice());
			Reporter.log(merchantSettlementPage.getNotice());
			assertTrue(false);
		}
		
	}
	
	

	@Test(dataProvider="SettlementInfoAlter")
	public void testMerchantSettlementDetail(MerchantSettlementAlterBean MerchantSettlementAlterBean) {
		merchantSettlementPage.navigateTo(URL);
		
		
		doSearchMerchantByNOorName(MerchantSettlementAlterBean);
		
		merchantSettlementPage.doQuery();
		wait.waitFor(1000);
		
		if(!merchantSettlementPage.getSettlementStatus().equals("已配置")){
			System.out.println("The SettlementStatus do not allow to see Detail");
			Reporter.log("The SettlementStatus do not allow to see Detail");
			assertTrue(false);
		}
		merchantSettlementPage.selectRadio();
		merchantSettlementPage.doDetail();
		merchantSettlementPage.doButton_Cancel();
	}
	
	@Test(dataProvider="SettlementInfoAlter")
	public void testMerchantSettlementAlter(MerchantSettlementAlterBean MerchantSettlementAlterBean) {
		merchantSettlementPage.navigateTo(URL);
		
		
		doSearchMerchantByNOorName(MerchantSettlementAlterBean);
		
		
		merchantSettlementPage.doQuery();
		wait.waitFor(1000);
		
		if(!merchantSettlementPage.getSettlementStatus().equals("已配置")){
			System.out.println("The SettlementStatus do not allow to see Detail");
			Reporter.log("The SettlementStatus do not allow to see Detail");
			assertTrue(false);
		}
		
		String merchantNO=merchantSettlementPage.getMerchantNO();
		Map<String , Object > updateMap=new HashMap<>();
		//如果商户号为空，更新商户号
		if(MerchantSettlementAlterBean.getMerchantNO().equals("")) {
			updateMap.put("MerchantNO", merchantNO);
		}
		if(!updateMap.isEmpty()) {
			Map<String , Object> whereMap=new HashMap<>();
			whereMap.put("ID", MerchantSettlementAlterBean.getID());
			DataBusiness.updateTestData("POP_Data_MerchantSettlementAlter", updateMap, whereMap);
		}
		
		merchantSettlementPage.selectRadio();
		merchantSettlementPage.doAlter();
/*		
		if(!MerchantSettlementAlterBean.getAccountType().equals("")&&!merchantSettlementPage.getAccountType().equals(MerchantSettlementAlterBean.getAccountType())) {
			merchantSettlementPage.setAccountType(MerchantSettlementAlterBean.getAccountType());
		}
		*/
/*		if(!MerchantSettlementAlterBean.getSettlementType().equals("")&&!merchantSettlementPage.getSettlementType().equals(MerchantSettlementAlterBean.getSettlementType())) {
			merchantSettlementPage.setSettlementType(MerchantSettlementAlterBean.getSettlementType());
		}*/
		
		if(!MerchantSettlementAlterBean.getBankName().equals("")&&!merchantSettlementPage.getBankName().equals(MerchantSettlementAlterBean.getBankName())) {
			merchantSettlementPage.setBankName(MerchantSettlementAlterBean.getBankName());
		}
		
		if(!MerchantSettlementAlterBean.getSubBankBelongProvice().equals("")&&!merchantSettlementPage.getSubBankBelongProvice().equals(MerchantSettlementAlterBean.getSubBankBelongProvice())) {
			merchantSettlementPage.setSubBankBelongProvice(MerchantSettlementAlterBean.getSubBankBelongProvice());
		}
		
		if(!MerchantSettlementAlterBean.getSubBankBelongCity().equals("")&&!merchantSettlementPage.getSubBankBelongCity().equals(MerchantSettlementAlterBean.getSubBankBelongCity())) {
			merchantSettlementPage.setSubBankBelongCity(MerchantSettlementAlterBean.getSubBankBelongCity());
		}
		
		if(!MerchantSettlementAlterBean.getSubBankInfo().equals("")&&!merchantSettlementPage.getSubBankInfo().equals(MerchantSettlementAlterBean.getSubBankInfo())) {
			merchantSettlementPage.setSubBankInfo(MerchantSettlementAlterBean.getSubBankInfo());
		}
		
		if(!MerchantSettlementAlterBean.getAccount().equals("")&&!merchantSettlementPage.getAccount().equals(MerchantSettlementAlterBean.getAccount())) {
			merchantSettlementPage.setAccount(MerchantSettlementAlterBean.getAccount());
		}
		
		if(!MerchantSettlementAlterBean.getAccountName().equals("")&&!merchantSettlementPage.getAccountName().equals(MerchantSettlementAlterBean.getAccountName())) {
			merchantSettlementPage.setAccountName(MerchantSettlementAlterBean.getAccountName());
		}
		
		if(!MerchantSettlementAlterBean.getSettlementCycle().equals("")&&!merchantSettlementPage.getSettlementCycle().equals(MerchantSettlementAlterBean.getSettlementCycle())) {
			merchantSettlementPage.setSettlementCycle(MerchantSettlementAlterBean.getSettlementCycle());
		}
		
		if(!MerchantSettlementAlterBean.getSettlementDays().equals("")&&!merchantSettlementPage.getSettlementDays().equals(MerchantSettlementAlterBean.getSettlementDays())) {
			merchantSettlementPage.setSettlementDays(MerchantSettlementAlterBean.getSettlementDays());
		}
		
		if(!MerchantSettlementAlterBean.getNextSettlementDate().equals("")&&!merchantSettlementPage.getNextSettlementDate().equals(MerchantSettlementAlterBean.getNextSettlementDate())) {
			merchantSettlementPage.setNextSettlementDate(MerchantSettlementAlterBean.getNextSettlementDate());
		}
			
		if(!MerchantSettlementAlterBean.getSettlement_StartDate().equals("")&&!merchantSettlementPage.getSettlement_StartDate().equals(MerchantSettlementAlterBean.getSettlement_StartDate())) {
			merchantSettlementPage.setSettlement_StartDate(MerchantSettlementAlterBean.getSettlement_StartDate());
		}

		if(!MerchantSettlementAlterBean.getSettlement_ExpireDate().equals("")&&!merchantSettlementPage.getSettlement_ExpireDate().equals(MerchantSettlementAlterBean.getSettlement_ExpireDate())) {
			merchantSettlementPage.selectAll("Settlement_ExpireDate");
			merchantSettlementPage.setSettlement_ExpireDate(MerchantSettlementAlterBean.getSettlement_ExpireDate());
		}
		
		
		if(!MerchantSettlementAlterBean.getStart_Amount().equals("")&&!merchantSettlementPage.getStart_Amount().equals(MerchantSettlementAlterBean.getStart_Amount())) {
			merchantSettlementPage.setStart_Amount(MerchantSettlementAlterBean.getStart_Amount());
		}
		
		if(!MerchantSettlementAlterBean.getMinimum_Amount().equals("")&&!merchantSettlementPage.getMinimum_Amount().equals(MerchantSettlementAlterBean.getMinimum_Amount())) {
			merchantSettlementPage.setMinimum_Amount(MerchantSettlementAlterBean.getMinimum_Amount());
		}
/*		
		if(!MerchantSettlementAlterBean.getMerchantSettlementType().equals("")&&!merchantSettlementPage.getMerchantSettlementType().equals(MerchantSettlementAlterBean.getMerchantSettlementType())) {
			merchantSettlementPage.setMerchantSettlementType(MerchantSettlementAlterBean.getMerchantSettlementType());
		}
		
		if(!MerchantSettlementAlterBean.getSelf_Settlement().equals("")&&!merchantSettlementPage.getSelf_Settlement().equals(MerchantSettlementAlterBean.getSelf_Settlement())) {
			merchantSettlementPage.setSelf_Settlement(MerchantSettlementAlterBean.getSelf_Settlement());
		}
		*/
	
		
		merchantSettlementPage.doButton_Submit();
		
		if(merchantSettlementPage.getNotice().contains("成功")) {
			System.out.println(merchantSettlementPage.getNotice());
			Reporter.log(merchantSettlementPage.getNotice());
		}else {
			System.out.println(merchantSettlementPage.getNotice());
			Reporter.log(merchantSettlementPage.getNotice());
			assertTrue(false);
		}
	}
	
	
	@Test(dataProvider="SettlementInfoAlter")
	public void testMerchantSettlementAlterVerify(MerchantSettlementAlterBean MerchantSettlementAlterBean) {
		merchantSettlementPage.navigateTo(URL);
		
		
		doSearchMerchantByNOorName(MerchantSettlementAlterBean);
		
		merchantSettlementPage.doQuery();
		wait.waitFor(1000);
		
		if(!merchantSettlementPage.getSettlementStatus().equals("已配置")){
			System.out.println("The SettlementStatus do not allow to see Detail");
			Reporter.log("The SettlementStatus do not allow to see Detail");
			assertTrue(false);
		}
		merchantSettlementPage.selectRadio();
		merchantSettlementPage.doDetail();
		
		wait.waitFor(5000);
		
		merchantSettlementPage.doButton_Cancel();
		
		
	}
	
	public void doSearchMerchantByNOorName(MerchantSettlementAlterBean MerchantSettlementAlterBean) {
		if(!MerchantSettlementAlterBean.getMerchantNO().equals("")) {
			merchantSettlementPage.setMerchantNO(MerchantSettlementAlterBean.getMerchantNO());
		}else if(!MerchantSettlementAlterBean.getMerchantName().equals("")) {
			merchantSettlementPage.setMerchantName(MerchantSettlementAlterBean.getMerchantName());
			try {
				merchantSettlementPage.isSearchMerchantIndexDisplayed(MerchantSettlementAlterBean.getSearchMerchant_Index());
				merchantSettlementPage.doSearchMerchantSubmit(MerchantSettlementAlterBean.getSearchMerchant_Index());
			} catch (Exception e) {
				merchantSettlementPage.doSearchMerchantClose();
				wait.waitFor(1000);
				System.out.println("搜商户 该商户名数据不存在，Please Check TestDate ! MerchantName is "+MerchantSettlementAlterBean.getMerchantName());
				Reporter.log("搜商户 该商户名数据不存在，Please Check TestDate ! MerchantName is "+MerchantSettlementAlterBean.getMerchantName());
				assertTrue(false);
			}
		}else {
			System.out.println("Both of MerchantNO and MerchantName are null ! Please check TestDate !");
			Reporter.log("Both of MerchantNO and MerchantName are null ! Please check TestDate !");
			assertTrue(false,"Both of MerchantNO and MerchantName are null ! Please check TestDate !");
		}
	}
	
	
}
