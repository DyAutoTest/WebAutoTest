package com.dy.AutoTest.OperationPlatform.TestCases.OnlineRiskControl.RefusedTradeQuery;

import java.lang.reflect.Method;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.dy.AutoTest.web.api.SuperTest;
import com.dy.AutoTest.OperationPlatform.PageObject.OnlineRiskControl.RefusedTradeQuery.RefusedOrderQueryPage;
import com.dy.AutoTest.OperationPlatform.POJO.RefusedTradeQuery_RefusedOrderQueryBean;
import com.dy.AutoTest.web.business.DataBusiness;

public class RefusedOrderQueryPageTest extends SuperTest{
	RefusedOrderQueryPage RefusedOrderQueryPage;
	String URL;

	@BeforeClass
	public void init() {
		/******** instant objectPage *********/
		RefusedOrderQueryPage=new RefusedOrderQueryPage(driver);
		//RefusedOrderQueryPage.setWaitTime(800);

		/******** set URL *********/
		URL=host.toString()+DataBusiness.getData_URL("pop_RefusedTradeQuery_RefusedOrderQuery");

		/******** instant Interface *********/
		iQuery=RefusedOrderQueryPage;
//	iClickButton=RefusedOrderQueryPage;
//	iClickRadio=RefusedOrderQueryPage;
//	iSearchMerchantByNOorName=RefusedOrderQueryPage;
	}

	@DataProvider(name="RefusedTradeQuery_RefusedOrderQuery")
	protected static Object[][] parametersPool(){
		data.loadDataBeanList("POP_Data_RefusedTradeQuery_RefusedOrderQuery");
		return data.getDataBeanArray();
	}

	@DataProvider(name="RefusedTradeQuery_RefusedOrderQueryByCaseNO")
	protected static Object[][] parametersPool(Method method){
		data.loadDataBeanList("POP_Data_RefusedTradeQuery_RefusedOrderQuery",method.getName());
		return data.getDataBeanArray();
	}

	@Test(dataProvider="RefusedTradeQuery_RefusedOrderQueryByCaseNO")
	public void testQuery(RefusedTradeQuery_RefusedOrderQueryBean RefusedTradeQuery_RefusedOrderQueryBean) {
		RefusedOrderQueryPage.navigateTo(URL);
		wait.waitFor(500);

	}
}