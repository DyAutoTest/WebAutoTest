package com.dy.AutoTest.OperationPlatform.TestCases.OnlineRiskControl.RefusedTradeQuery;

import java.lang.reflect.Method;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.dy.AutoTest.web.api.SuperTest;
import com.dy.AutoTest.OperationPlatform.PageObject.OnlineRiskControl.RefusedTradeQuery.BeforehandBlackListRefusedQueryPage;
import com.dy.AutoTest.OperationPlatform.POJO.RefusedTradeQuery_BeforehandBlackListRefusedQueryBean;
import com.dy.AutoTest.web.business.DataBusiness;

public class BeforehandBlackListRefusedQueryPageTest extends SuperTest{
	BeforehandBlackListRefusedQueryPage BeforehandBlackListRefusedQueryPage;
	String URL;

	@BeforeClass
	public void init() {
		/******** instant objectPage *********/
		BeforehandBlackListRefusedQueryPage=new BeforehandBlackListRefusedQueryPage(driver);
		//BeforehandBlackListRefusedQueryPage.setWaitTime(800);

		/******** set URL *********/
		URL=host.toString()+DataBusiness.getData_URL("pop_RefusedTradeQuery_BeforehandBlackListRefusedQuery");

		/******** instant Interface *********/
		iQuery=BeforehandBlackListRefusedQueryPage;
//	iClickButton=BeforehandBlackListRefusedQueryPage;
//	iClickRadio=BeforehandBlackListRefusedQueryPage;
//	iSearchMerchantByNOorName=BeforehandBlackListRefusedQueryPage;
	}

	@DataProvider(name="RefusedTradeQuery_BeforehandBlackListRefusedQuery")
	protected static Object[][] parametersPool(){
		data.loadDataBeanList("POP_Data_RefusedTradeQuery_BeforehandBlackListRefusedQuery");
		return data.getDataBeanArray();
	}

	@DataProvider(name="RefusedTradeQuery_BeforehandBlackListRefusedQueryByCaseNO")
	protected static Object[][] parametersPool(Method method){
		data.loadDataBeanList("POP_Data_RefusedTradeQuery_BeforehandBlackListRefusedQuery",method.getName());
		return data.getDataBeanArray();
	}

	@Test(dataProvider="RefusedTradeQuery_BeforehandBlackListRefusedQueryByCaseNO")
	public void testQuery(RefusedTradeQuery_BeforehandBlackListRefusedQueryBean RefusedTradeQuery_BeforehandBlackListRefusedQueryBean) {
		BeforehandBlackListRefusedQueryPage.navigateTo(URL);
		wait.waitFor(500);

	}
}