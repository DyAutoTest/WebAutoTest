package com.dy.AutoTest.OperationPlatform.TestCases.SettlementManagement.Clearing;

import java.lang.reflect.Method;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.dy.AutoTest.web.api.SuperTest;
import com.dy.AutoTest.OperationPlatform.PageObject.SettlementManagement.Clearing.SettlementBillQueryPage;
import com.dy.AutoTest.OperationPlatform.POJO.SettlementManagement_SettlementBillQueryBean;
import com.dy.AutoTest.web.business.DataBusiness;

public class SettlementBillQueryPageTest extends SuperTest{
	SettlementBillQueryPage SettlementBillQueryPage;
	String URL;

	@BeforeClass
	public void init() {
		/******** instant objectPage *********/
		SettlementBillQueryPage=new SettlementBillQueryPage(driver);
		//SettlementBillQueryPage.setWaitTime(800);

		/******** set URL *********/
		URL=host.toString()+DataBusiness.getData_URL("pop_SettlementManagement_SettlementBillQuery");

		/******** instant Interface *********/
		iQuery=SettlementBillQueryPage;
//		iClickButton=SettlementBillQueryPage;
//		iClickRadio=SettlementBillQueryPage;
		iSearchMerchantByNOorName=SettlementBillQueryPage;
	}

	@DataProvider(name="SettlementManagement_SettlementBillQuery")
	protected static Object[][] parametersPool(){
		data.loadDataBeanList("POP_Data_SettlementManagement_SettlementBillQuery");
		return data.getDataBeanArray();
	}

	@DataProvider(name="SettlementManagement_SettlementBillQueryByCaseNO")
	protected static Object[][] parametersPool(Method method){
		data.loadDataBeanList("POP_Data_SettlementManagement_SettlementBillQuery",method.getName());
		return data.getDataBeanArray();
	}

	@Test(dataProvider="SettlementManagement_SettlementBillQueryByCaseNO")
	public void testQuery(SettlementManagement_SettlementBillQueryBean ssbqBean) {
		SettlementBillQueryPage.navigateTo(URL);
		wait.waitFor(500);

		if(!ssbqBean.getMerchantNO().equals("")||!ssbqBean.getMerchantName().equals("")) {
			doSearchMerchantByNOorName(ssbqBean.getMerchantNO(), ssbqBean.getMerchantName(), ssbqBean.getRadio());
			doQuery();
		}
		if(!ssbqBean.getT0SettlementMarks().equals("")) {
			SettlementBillQueryPage.selectT0SettlementMarks(ssbqBean.getT0SettlementMarks());
			doQuery();
		}
		if(!ssbqBean.getSettlementType().equals("")) {
			SettlementBillQueryPage.selectSettlementType(ssbqBean.getSettlementType());
			doQuery();
		}
		if(!ssbqBean.getSettlementDateBegin().equals("")&&!ssbqBean.getSettlementDateEnd().equals("")) {
			SettlementBillQueryPage.setSettlementDateBegin(ssbqBean.getSettlementDateBegin());
			SettlementBillQueryPage.setSettlementDateEnd(ssbqBean.getSettlementDateEnd());
			SettlementBillQueryPage.doLoseFocus("SettlementDateEnd", 120, 0);
			doQuery();
		}
		if(!ssbqBean.getSettlementMethod().equals("")) {
			SettlementBillQueryPage.selectSettlementMethod(ssbqBean.getSettlementMethod());
			doQuery();
		}
		if(!ssbqBean.getSettlementBatchNO().equals("")) {
			SettlementBillQueryPage.setSettlementBatchNO(ssbqBean.getSettlementBatchNO());
			doQuery();
		}
	}
	
	@Test(dataProvider="SettlementManagement_SettlementBillQueryByCaseNO")
	public void testCheck(SettlementManagement_SettlementBillQueryBean ssbqBean) {
		SettlementBillQueryPage.navigateTo(URL);
		wait.waitFor(500);
		

		if(!ssbqBean.getMerchantNO().equals("")||!ssbqBean.getMerchantName().equals("")) {
			doSearchMerchantByNOorName(ssbqBean.getMerchantNO(), ssbqBean.getMerchantName(), ssbqBean.getSearchMer_Radio());
		}
		if(!ssbqBean.getT0SettlementMarks().equals("")) {
			SettlementBillQueryPage.selectT0SettlementMarks(ssbqBean.getT0SettlementMarks());
		}
		if(!ssbqBean.getSettlementType().equals("")) {
			SettlementBillQueryPage.selectSettlementType(ssbqBean.getSettlementType());
		}
		if(!ssbqBean.getSettlementDateBegin().equals("")&&!ssbqBean.getSettlementDateEnd().equals("")) {
			SettlementBillQueryPage.setSettlementDateBegin(ssbqBean.getSettlementDateBegin());
			SettlementBillQueryPage.setSettlementDateEnd(ssbqBean.getSettlementDateEnd());
			SettlementBillQueryPage.doLoseFocus("SettlementDateEnd", 120, 0);
		}
		if(!ssbqBean.getSettlementMethod().equals("")) {
			SettlementBillQueryPage.selectSettlementMethod(ssbqBean.getSettlementMethod());
		}
		if(!ssbqBean.getSettlementBatchNO().equals("")) {
			SettlementBillQueryPage.setSettlementBatchNO(ssbqBean.getSettlementBatchNO());
		}
		
		SettlementBillQueryPage.clickQuery();
		wait.waitFor(500);
		
		SettlementBillQueryPage.doPageDown();
		wait.waitFor(500);
		
		SettlementBillQueryPage.clickRadio(ssbqBean.getRadio());
		wait.waitFor(500);
		
		SettlementBillQueryPage.clickCheck();
		wait.waitFor(2000);
		
		SettlementBillQueryPage.clickCheck_Close();
		wait.waitFor(1000);
		
		SettlementBillQueryPage.doPageUp();
	}
	
	
	@Test(dataProvider="SettlementManagement_SettlementBillQueryByCaseNO")
	public void testDetail(SettlementManagement_SettlementBillQueryBean ssbqBean) {
		SettlementBillQueryPage.navigateTo(URL);
		wait.waitFor(500);
		

		if(!ssbqBean.getMerchantNO().equals("")||!ssbqBean.getMerchantName().equals("")) {
			doSearchMerchantByNOorName(ssbqBean.getMerchantNO(), ssbqBean.getMerchantName(), ssbqBean.getSearchMer_Radio());
		}
		if(!ssbqBean.getT0SettlementMarks().equals("")) {
			SettlementBillQueryPage.selectT0SettlementMarks(ssbqBean.getT0SettlementMarks());
		}
		if(!ssbqBean.getSettlementType().equals("")) {
			SettlementBillQueryPage.selectSettlementType(ssbqBean.getSettlementType());
		}
		if(!ssbqBean.getSettlementDateBegin().equals("")&&!ssbqBean.getSettlementDateEnd().equals("")) {
			SettlementBillQueryPage.setSettlementDateBegin(ssbqBean.getSettlementDateBegin());
			SettlementBillQueryPage.setSettlementDateEnd(ssbqBean.getSettlementDateEnd());
			SettlementBillQueryPage.doLoseFocus("SettlementDateEnd", 120, 0);
		}
		if(!ssbqBean.getSettlementMethod().equals("")) {
			SettlementBillQueryPage.selectSettlementMethod(ssbqBean.getSettlementMethod());
		}
		if(!ssbqBean.getSettlementBatchNO().equals("")) {
			SettlementBillQueryPage.setSettlementBatchNO(ssbqBean.getSettlementBatchNO());
		}
		
		SettlementBillQueryPage.clickQuery();
		wait.waitFor(500);
		
		SettlementBillQueryPage.doPageDown();
		wait.waitFor(500);
		
		SettlementBillQueryPage.clickRadio(ssbqBean.getRadio());
		wait.waitFor(500);
		
		SettlementBillQueryPage.clickDetail();
		wait.waitFor(2000);
		
		SettlementBillQueryPage.clickDetail_Close();
		wait.waitFor(1000);
		
		SettlementBillQueryPage.doPageUp();
	}
}