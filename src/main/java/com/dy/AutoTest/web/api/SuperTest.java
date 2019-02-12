package com.dy.AutoTest.web.api;

import static org.testng.Assert.assertTrue;

import java.lang.reflect.Method;
import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.dy.AutoTest.web.actions.SingletonSet;
import com.dy.AutoTest.web.actions.Wait;
import com.dy.AutoTest.web.business.DataBusiness;
import com.dy.AutoTest.web.util.BaseUtil;

public class SuperTest {
	protected Wait wait;
	protected WebDriver driver;

	protected static DataBusiness data = new DataBusiness();

	protected StringBuffer host = SingletonSet.URL;
	
	protected String testinfo=""; 
	
	
	/********** interface identify ***********/
	protected IQuery iQuery;
	protected IClickRadio iClickRadio;
	protected IClickButton iClickButton;
	protected ISearchMerchant iSearchMerchant;
	protected ISearchMerchant_Add iSearchMerchant_Add;
	
	/************* test area ****************/
	@BeforeClass
	public void beforeClass() { 
		wait = SingletonSet.wait;
		driver = SingletonSet.driver;
	}

	@BeforeTest
	public void BeforeTest(ITestContext context) {
		Reporter.log("        "+BaseUtil.fomatDateToString(new Date(), "yyyy-MM-dd HH:mm:ss")+"): [Test]-\""+context.getName()+"\" is started");
	}
	
	@AfterTest
	public void AfterTest(ITestContext context) {
		Reporter.log("        "+BaseUtil.fomatDateToString(new Date(), "yyyy-MM-dd HH:mm:ss")+"): [Test]-\""+context.getName()+"\" is finished");
	}
	
	@BeforeMethod
	public void beforeMethod(Method method) {
		
		Reporter.log("                "+BaseUtil.fomatDateToString(new Date(), "yyyy-MM-dd HH:mm:ss")+": [Method]-\""
		+this.getClass().getSimpleName()+"."+method.getName()+"\" is started");
	}
	
	@AfterMethod
	public void afterMethod(ITestResult result) {
		if(result.getStatus()==ITestResult.SUCCESS) {
			Reporter.log("                "+BaseUtil.fomatDateToString(new Date(), "yyyy-MM-dd HH:mm:ss")+": [Method]-\""
					+this.getClass().getSimpleName()+"."+result.getName()+"\" is passed");
		}else if(result.getStatus()==ITestResult.FAILURE) {
			Reporter.log("                "+BaseUtil.fomatDateToString(new Date(), "yyyy-MM-dd HH:mm:ss")+": [Method]-\""
					+this.getClass().getSimpleName()+"."+result.getName()+"\" is failed");
			Reporter.log("                        "+"The failure is "+result.getThrowable());
		}else if(result.getStatus()==ITestResult.SKIP){
			Reporter.log("                "+BaseUtil.fomatDateToString(new Date(), "yyyy-MM-dd HH:mm:ss")+": [Method]-\""
					+this.getClass().getSimpleName()+"."+result.getName()+"\" is skiped");
		}
		wait.waitFor(2000);
	}
	
	
	
/*************************** interface function *****************************/
	
	//搜商户
	public void doSearchMerchant(String merchantNO,String merchantName,String index) {
		if(!merchantNO.equals("")) {
			iSearchMerchant.setMerchantNO(merchantNO);
		}else if(!merchantName.equals("")) {
			iSearchMerchant.clickSearchMer();
			iSearchMerchant.setSearchMer_MerName(merchantName);
			iSearchMerchant.clickSearchMer_Search();
			wait.waitFor(800);
			try {
				iSearchMerchant.isSearchMer_RadioDisplayed(index);
			} catch (Exception e) {
				iSearchMerchant.clickSearchMer_Close();
				wait.waitFor(1000);
				System.out.println("搜商户 该商户名数据不存在，Please Check TestData ! MerchantName is "+merchantName);
				Reporter.log("搜商户 该商户名数据不存在，Please Check TestData ! MerchantName is "+merchantName);
				assertTrue(false);
			}
			iSearchMerchant.clickSearchMer_Radio(index);
			iSearchMerchant.clickSearchMer_Submit();
		}else {
			System.out.println("Both of MerchantNO and MerchantName are null ! Please check TestData !");
			Reporter.log("Both of MerchantNO and MerchantName are null ! Please check TestData !");
			assertTrue(false,"Both of MerchantNO and MerchantName are null ! Please check TestData !");
		}
	}
	//搜商户
	public void doSearchMerchant_Add(String merchantNO,String merchantName,String index) {
		if(merchantNO.equals("")&&merchantName.equals("")) {
			System.out.println("Both of MerchantNO and MerchantName are null ! Please check TestData !");
			Reporter.log("Both of MerchantNO and MerchantName are null ! Please check TestData !");
			assertTrue(false,"Both of MerchantNO and MerchantName are null ! Please check TestData !");
		}
		iSearchMerchant_Add.clickAdd_SearchMer();
		if(!merchantNO.equals("")) {
			iSearchMerchant_Add.setAdd_SearchMer_MerNO(merchantNO);
		}else if(!merchantName.equals("")) {
			iSearchMerchant_Add.setAdd_SearchMer_MerName(merchantName);
		}
		iSearchMerchant_Add.clickAdd_SearchMer_Search();
		wait.waitFor(800);
		try {
			iSearchMerchant_Add.isAdd_SearchMer_RadioDisplayed(index);
		} catch (Exception e) {
			iSearchMerchant_Add.clickAdd_SearchMer_Close();
			wait.waitFor(1000);
			System.out.println("搜商户 该商户名数据不存在，Please Check TestData ! MerchantName is "+merchantName);
			Reporter.log("搜商户 该商户名数据不存在，Please Check TestData ! MerchantName is "+merchantName);
			assertTrue(false);
		}
		iSearchMerchant_Add.clickAdd_SearchMer_Radio(index);
		iSearchMerchant_Add.clickAdd_SearchMer_Submit();
	}
	
	//查询 testQuery()
	public void doQuery() {
		doQuery(1000);
	}
	public void doQuery(int waitTime) {
//		iQuery.doPageDown();
		iQuery.clickQuery();
		wait.waitFor(waitTime);
		iQuery.doPageDown();
		wait.waitFor(500+waitTime);
		iQuery.doPageUp();
		wait.waitFor(waitTime);
		iQuery.clickReset();
		wait.waitFor(waitTime);
	}
	public void clickAdvanceBeforeDoQuery() {
		clickAdvanceBeforeDoQuery(1000);
	}
	public void clickAdvanceBeforeDoQuery(int waitTime) {
		wait.waitFor(1000);
		iQuery.clickAdvance();
		wait.waitFor(1000);
		iQuery.clickQuery();
		wait.waitFor(waitTime);
		iQuery.doPageDown();
		wait.waitFor(1000+waitTime);
		iQuery.doPageUp();
		wait.waitFor(waitTime);
		iQuery.clickReset();
		wait.waitFor(waitTime);
	}
	
	//点击Radio
	public void clickRadio(String radio) {
		clickRadio(radio,1000);
	}
	public void clickRadio(String radio,int waitTime) {
		iClickRadio.clickQuery();
		wait.waitFor(waitTime);
		if(!iClickRadio.isElementExist("Radio",radio)) {	
			System.out.println("查询数据不存在，请更换查询条件。Please Change TestData !");
			Reporter.log("查询数据数据不存在，请更换查询条件。Please Change TestData !");
			assertTrue(false);
		}
		while(!iClickRadio.isElementDisplayed("Radio",radio)) {
			iClickRadio.doPageDown();
			wait.waitFor(300);
		}
		iClickRadio.clickRadio(radio);
		wait.waitFor(waitTime);
		iClickRadio.doLoseFocus("Radio",radio,80,0 );
	}
	//Click Button
	public void clickButton(String buttonName) {
		if(!iClickButton.isElementExist(buttonName)) {	
			System.out.println("按钮不存在，Please Change TestData !");
			Reporter.log("按钮不存在，Please Change TestData !");
			assertTrue(false);
		}
		while(!iClickButton.isElementDisplayed(buttonName)) {
			iClickButton.doPageUp();
			wait.waitFor(300);
		}
		iClickButton.clickElement(buttonName);
		wait.waitFor(2000);
	}
	
	
	//查看 
	//修改
	
	
//	public void doQueryForClickButton() {
		//主要功能是if的填值，query点击，radio选择
/*		
		if(!raapmBean.getAccountType().equals("")) {
			AccountApproveParamMaintainPage.selectAccountType(raapmBean.getAccountType());
		}
		AccountApproveParamMaintainPage.clickQuery();
		wait.waitFor(500);
		AccountApproveParamMaintainPage.clickRadio(raapmBean.getRadio());
		wait.waitFor(500);
		*/
//	}
//	public void testAdd() {
		/*		
		if(ctvwsBean.getModeID().equals("")) {
			System.out.println("ID字段为必输项，不能为空");
			Reporter.log("ID字段为必输项，不能为空");
			assertTrue(false);
		}
		*/
	
//	System.out.println(TradeVerificationWaySetPage.getNotice());
//	Reporter.log(TradeVerificationWaySetPage.getNotice());
	
//	}
	
	
}

