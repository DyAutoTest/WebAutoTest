package com.dy.AutoTest.OnlineCashier.TestCases;

import static org.testng.Assert.assertTrue;


import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.dy.AutoTest.OnlineCashier.POJO.OnlineCashierB2BBean;
import com.dy.AutoTest.OnlineCashier.PageObject.OnlineCashierB2BPage;
import com.dy.AutoTest.OperationPlatform.TestCases.SuperTest;
import com.dy.AutoTest.web.actions.Switch;
import com.dy.AutoTest.web.business.DataBusiness;

public class OnlineCashierB2BTest extends SuperTest{
	OnlineCashierB2BPage OnlineCashierB2BPage;
    String URL;
    Switch switch1;
    
    @BeforeClass
	public void init() {
    	OnlineCashierB2BPage=new OnlineCashierB2BPage(driver);
		URL=host.toString();
		switch1=new Switch(driver);
	}
	
	@DataProvider(name="B2B")
	protected static Object[][] parametersPool(){
		data.loadDataBeanList("Online_Data_Cashier_B2B");
		return data.getDataBeanArray();
	}
	
	@Test(dataProvider="B2B",description="运营平台-用户资料管理")
	public void testOnlineCashierB2B(OnlineCashierB2BBean OnlineCashierB2BBean) {
		OnlineCashierB2BPage.navigateTo(URL);
		
		List<String> selectList=new ArrayList<String>();
		Map<String, Object> whereMap=new HashMap<String , Object>();
		selectList.add("*");
		whereMap.put("PresentID", OnlineCashierB2BBean.getID());
		List<Map<String, Object>> subMerchants=DataBusiness.queryMore("Online_Data_Cashier_B2B_Sub", selectList, whereMap);
		
		if(subMerchants.size()==0) {
			System.out.println("Select table(Online_Data_Cashier_B2B_Sub) is null");
			System.out.println("查询子商户结果为空");
			Reporter.log("查询子商户结果为空");
			assertTrue(false,"Select table(Online_Data_Cashier_B2B_Sub) is null");
		}
		if(OnlineCashierB2BBean.getReceiptMerchantType().equals("O")&&subMerchants.size()>1) {
			System.out.println("主商户收款类型为单笔，子商户查询出多笔，不符合要求，请检查测试数据");
			Reporter.log("主商户收款类型为单笔，子商户查询出多笔，不符合要求，请检查测试数据");
			assertTrue(false,"It is not a Single Payment");
		}
		if(OnlineCashierB2BBean.getReceiptMerchantType().equals("M")&&subMerchants.size()==1) {
			System.out.println("主商户收款类型为多笔，子商户查询出一笔，不符合要求，请检查测试数据");
			Reporter.log("主商户收款类型为多笔，子商户查询出一笔，不符合要求，请检查测试数据");
			assertTrue(false,"It is not a Multi Payment");
		}
			
		
		OnlineCashierB2BPage.setMerchantNO(OnlineCashierB2BBean.getMerchantNO());
		OnlineCashierB2BPage.setCertificatePassword(OnlineCashierB2BBean.getCertificatePassword());
		OnlineCashierB2BPage.resetMerchantResource();
		wait.waitFor(500);
		OnlineCashierB2BPage.GoToB2B();
		
		String merchantRequestNO=OnlineCashierB2BPage.getMerchantRequestNO();
		OnlineCashierB2BPage.setReceiptMerchantNO(OnlineCashierB2BBean.getReceiptMerchantNO());
		OnlineCashierB2BPage.setOrderAmount(OnlineCashierB2BBean.getOrderAmount());
		OnlineCashierB2BPage.setPaymentAmout(OnlineCashierB2BBean.getPaymentAmout());
		//ReceiptMerchantType : M代表多笔交易，O代表单笔交易
		OnlineCashierB2BPage.setReceiptMerchantType(OnlineCashierB2BBean.getReceiptMerchantType());
		
		
		for(int i=0;i<subMerchants.size()-1;i++) {
			OnlineCashierB2BPage.doSubOrderAdd();
		}
		
		for(int i=0;i<subMerchants.size();i++) {
			
			OnlineCashierB2BPage.setSubOrderNO("D"+merchantRequestNO+(i+1), i);
			OnlineCashierB2BPage.setSubOrderAmount(subMerchants.get(i).get("SubOrderAmount").toString(), i);
			OnlineCashierB2BPage.setSubPaymentAmount(subMerchants.get(i).get("SubPaymentAmount").toString(), i);
			OnlineCashierB2BPage.setSubReceiptMerchantNO(subMerchants.get(i).get("SubReceiptMerchantNO").toString(), i);
				
		}
		
		OnlineCashierB2BPage.doSubmit();
		OnlineCashierB2BPage.doSubmit2();
		
/*		if(OnlineCashierB2BPage.isOrderError()) {
			System.out.println(OnlineCashierB2BPage.getOrderErrorDetail());
			Reporter.log(OnlineCashierB2BPage.getOrderErrorDetail());
			assertTrue(false,OnlineCashierB2BPage.getOrderErrorDetail());
		}
		*/
		
		
			OnlineCashierB2BPage.waitForOnlineCashier();
			
		//跳转收银台页面失败，需要给出提示，如金额对不上
		
		switch(OnlineCashierB2BBean.getPaymentType()){
		
		case "E":	//企业网银支付
			OnlineCashierB2BPage.doEnterpriseEBank();
			OnlineCashierB2BPage.doChooseEnterpriseEBank();
			OnlineCashierB2BPage.doPayment();
			switch1.toSpecificWindow("银联在线支付");
			break;
		case "P":	//个人网银支付
			OnlineCashierB2BPage.doPersonalEBank();
			OnlineCashierB2BPage.doChoosePersonalEBank();
			OnlineCashierB2BPage.doPayment();
			switch1.toSpecificWindow("银联在线支付");
			OnlineCashierB2BPage.setEBank_CardNO(OnlineCashierB2BBean.getEBank_CardNO());
			OnlineCashierB2BPage.doEBank_UnionpayNext();
			OnlineCashierB2BPage.doEBank_GetUnionpaySMS();
			OnlineCashierB2BPage.setEBank_UnionpaySMS(OnlineCashierB2BBean.getEBank_SMS());
			OnlineCashierB2BPage.doEBank_UnionpayPay();
			
			if(OnlineCashierB2BPage.isEBank_UnionpaySuccess()) {
				OnlineCashierB2BPage.doEBank_UnionpayBack();
			}else {
				System.out.println(OnlineCashierB2BPage.getEBank_UnionpayMainWord());
				Reporter.log(OnlineCashierB2BPage.getEBank_UnionpayMainWord());
				assertTrue(false);
			}
			break;
		default :
			System.out.println("参数不正确，请检查自动化测试数据库PaymentType字段的参数");
			break;
		}
	
		if(OnlineCashierB2BPage.isPaySuccess()) {
			System.out.println("[info]"+merchantRequestNO+" 支付成功！ 在主商户 "
					+OnlineCashierB2BBean.getMerchantNO()+" 下，付款 "+Integer.parseInt(OnlineCashierB2BBean.getOrderAmount())*0.01+" 元");
			
			Reporter.log("[info]"+merchantRequestNO+" 支付成功！ 在主商户 "
					+OnlineCashierB2BBean.getMerchantNO()+" 下，付款 "+Integer.parseInt(OnlineCashierB2BBean.getOrderAmount())*0.01+" 元");
		}else {
			System.out.println(merchantRequestNO+"支付失败");
			Reporter.log(merchantRequestNO+"支付失败");
			assertTrue(false,merchantRequestNO+"Pay failed");
		}
	}
//	
//	@Test
//	public void quitBrowser() {
//		driver.quit();
//	}
//	
	
}
