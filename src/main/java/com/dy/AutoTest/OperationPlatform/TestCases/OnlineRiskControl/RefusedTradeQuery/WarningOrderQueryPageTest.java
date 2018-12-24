package com.dy.AutoTest.OperationPlatform.TestCases.OnlineRiskControl.RefusedTradeQuery;

import java.lang.reflect.Method;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.dy.AutoTest.web.api.SuperTest;
import com.dy.AutoTest.OperationPlatform.PageObject.OnlineRiskControl.RefusedTradeQuery.WarningOrderQueryPage;
import com.dy.AutoTest.OperationPlatform.POJO.RefusedTradeQuery_WarningOrderQueryBean;
import com.dy.AutoTest.web.business.DataBusiness;

public class WarningOrderQueryPageTest extends SuperTest{
	WarningOrderQueryPage WarningOrderQueryPage;
	String URL;

	@BeforeClass
	public void init() {
		/******** instant objectPage *********/
		WarningOrderQueryPage=new WarningOrderQueryPage(driver);
		//WarningOrderQueryPage.setWaitTime(800);

		/******** set URL *********/
		URL=host.toString()+DataBusiness.getData_URL("pop_RefusedTradeQuery_WarningOrderQuery");

		/******** instant Interface *********/
		iQuery=WarningOrderQueryPage;
//	iClickButton=WarningOrderQueryPage;
//	iClickRadio=WarningOrderQueryPage;
//	iSearchMerchantByNOorName=WarningOrderQueryPage;
	}

	@DataProvider(name="RefusedTradeQuery_WarningOrderQuery")
	protected static Object[][] parametersPool(){
		data.loadDataBeanList("POP_Data_RefusedTradeQuery_WarningOrderQuery");
		return data.getDataBeanArray();
	}

	@DataProvider(name="RefusedTradeQuery_WarningOrderQueryByCaseNO")
	protected static Object[][] parametersPool(Method method){
		data.loadDataBeanList("POP_Data_RefusedTradeQuery_WarningOrderQuery",method.getName());
		return data.getDataBeanArray();
	}

	@Test(dataProvider="RefusedTradeQuery_WarningOrderQueryByCaseNO")
	public void testQuery(RefusedTradeQuery_WarningOrderQueryBean RefusedTradeQuery_WarningOrderQueryBean) {
		WarningOrderQueryPage.navigateTo(URL);
		wait.waitFor(500);

	}
}