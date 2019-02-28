package com.dy.AutoTest.OperationPlatform.TestCases.MerchantManagementOnLine.OnLineMechantInfo;

import java.lang.reflect.Method;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.dy.AutoTest.web.api.SuperTest;
import com.dy.AutoTest.OperationPlatform.PageObject.MerchantManagementOnLine.OnLineMerchantInfo.MerchantProductPage;
import com.dy.AutoTest.OperationPlatform.POJO.MerchantProductBean;
import com.dy.AutoTest.web.business.DataBusiness;

public class MerchantProductPageTest extends SuperTest{
	MerchantProductPage MerchantProductPage;
	String URL;

	@BeforeClass
	public void init() {
		/******** instant objectPage *********/
		MerchantProductPage=new MerchantProductPage(driver);
		//MerchantProductPage.setWaitTime(800);

		/******** set URL *********/
		URL=host.toString()+DataBusiness.getData_URL("pop_MerchantProduct");

		/******** instant Interface *********/
		iQuery=MerchantProductPage;
//		iClickButton=MerchantProductPage;
//		iClickRadio=MerchantProductPage;
//		iSearchMerchant=MerchantProductPage;
	}

	@DataProvider(name="MerchantProduct")
	protected static Object[][] parametersPool(){
		data.loadDataBeanList("POP_Data_MerchantProduct");
		return data.getDataBeanArray();
	}

	@DataProvider(name="MerchantProductByCaseNO")
	protected static Object[][] parametersPool(Method method){
		data.loadDataBeanList("POP_Data_MerchantProduct");
		return data.getDataBeanArray();
	}

//	@Test(dataProvider="MerchantProductByCaseNO")
//	public void testQuery(MerchantProductBean bean) {
//		MerchantProductPage.navigateTo(URL);
//		wait.waitFor(500);
//
//	}
//	@Test(dataProvider="MerchantProductByCaseNO")
//	public void testCheck(MerchantProductBean bean) {
//		MerchantProductPage.navigateTo(URL);
//		wait.waitFor(500);
//		doQueryForClickButton(bean);
//		MerchantProductPage.clickCheck();
//		wait.waitFor(2000);
//		MerchantProductPage.clickCheck_Close();
//	}
//	@Test(dataProvider="MerchantProductByCaseNO")
//	public void testDelete(MerchantProductBean bean) {
//		MerchantProductPage.navigateTo(URL);
//		wait.waitFor(500);
//		doQueryForClickButton(bean);
//		MerchantProductPage.clickDelete();
//		wait.waitFor(1000);
////		MerchantProductPage.clickDelete_Confirm();
////		System.out.println(MerchantProductPage.getNotice());
////		Reporter.log(MerchantProductPage.getNotice());
//		MerchantProductPage.clickDelete_Close();
//	}
	@Test(dataProvider="MerchantProductByCaseNO")
	public void testUpdate(MerchantProductBean bean) {
		MerchantProductPage.navigateTo(URL);
		wait.waitFor(500);
		
		MerchantProductPage.setMerchantNO(bean.getMerchantNO());
		MerchantProductPage.clickQueryMerchantAuth();
		wait.waitFor(1000);
		
		String productType = bean.getProductType();
		String[] productTypeArray = productType.split(",");
		
		MerchantProductPage.doDown();
		
		for (String pt : productTypeArray) {
			switch (pt) {
			case "01":
				MerchantProductPage.clickPayment_Account();
				break;
			case "02":
				MerchantProductPage.clickPayment_QR();
				break;
			case "03":
				MerchantProductPage.clickPayment_Personal_Ebank();
				break;
			case "18":
				MerchantProductPage.clickPayment_Enterprise_Ebank();
				break;
			case "05":
				MerchantProductPage.clickPayment_Credit();
				break;
			case "06":
				MerchantProductPage.clickPayment_Debit();
				break;
			case "07":
				MerchantProductPage.clickPayment_Batch();
				break;
			case "08":
				MerchantProductPage.clickReceipt_Batch();
				break;
			case "19":
				MerchantProductPage.clickPayment_WeChatAPP();
				break;
			case "17":
				MerchantProductPage.clickAgentReceipt();
				break;
			case "12":
				MerchantProductPage.clickAgentPayment();
				break;
			case "13":
				MerchantProductPage.clickAgentReceipt_Batch();
				break;
			case "14":
				MerchantProductPage.clickAgentPayment_Batch();
				break;
			default:
				break;
			}
			
			wait.waitFor(500);
		}
		
		wait.waitFor(1000);
		MerchantProductPage.clickUpdateAuth();
	}
//	@Test(dataProvider="MerchantProductByCaseNO")
//	public void testAdd(MerchantProductBean bean) {
//		MerchantProductPage.navigateTo(URL);
//		wait.waitFor(500);
////		add需要先判断必输项的测试数据是否为空
//
////			System.out.println("验证方式字段为必输项，不能为空");
////			Reporter.log("验证方式字段为必输项，不能为空");
////			assertTrue(false);
//
//		MerchantProductPage.clickAdd();
//		wait.waitFor(1000);
//
////		MerchantProductPage.clickAdd_Submit();
////		System.out.println(MerchantProductPage.getNotice());
////		Reporter.log(MerchantProductPage.getNotice());
//		MerchantProductPage.clickAdd_Close();
//	}
//
//
//	public void doQueryForClickButton(MerchantProductBean bean) {
//
//		MerchantProductPage.clickQuery();
//		wait.waitFor(500);
//		MerchantProductPage.clickRadio(bean.getRadio());
//		wait.waitFor(500);
//	}
}