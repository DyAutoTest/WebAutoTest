package com.dy.AutoTest.OperationPlatform.TestCases.OnlineRiskControl.RiskControlTotalQuery;

import java.lang.reflect.Method;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.dy.AutoTest.web.api.SuperTest;
import com.dy.AutoTest.OperationPlatform.PageObject.OnlineRiskControl.RiskControlTotalQuery.RiskControlTotalQueryPage;
import com.dy.AutoTest.OperationPlatform.POJO.RiskControlTotalQueryBean;
import com.dy.AutoTest.web.business.DataBusiness;

public class RiskControlTotalQueryPageTest extends SuperTest{
	RiskControlTotalQueryPage RiskControlTotalQueryPage;
	String URL;

	@BeforeClass
	public void init() {
		/******** instant objectPage *********/
		RiskControlTotalQueryPage=new RiskControlTotalQueryPage(driver);
		//RiskControlTotalQueryPage.setWaitTime(800);

		/******** set URL *********/
		URL=host.toString()+DataBusiness.getData_URL("pop_RiskControlTotalQuery");

		/******** instant Interface *********/
		iQuery=RiskControlTotalQueryPage;
//	iClickButton=RiskControlTotalQueryPage;
//	iClickRadio=RiskControlTotalQueryPage;
//	iSearchMerchantByNOorName=RiskControlTotalQueryPage;
	}

	@DataProvider(name="RiskControlTotalQuery")
	protected static Object[][] parametersPool(){
		data.loadDataBeanList("POP_Data_RiskControlTotalQuery");
		return data.getDataBeanArray();
	}

	@DataProvider(name="RiskControlTotalQueryByCaseNO")
	protected static Object[][] parametersPool(Method method){
		data.loadDataBeanList("POP_Data_RiskControlTotalQuery",method.getName());
		return data.getDataBeanArray();
	}

	@Test(dataProvider="RiskControlTotalQueryByCaseNO")
	public void testQuery(RiskControlTotalQueryBean RiskControlTotalQueryBean) {
		RiskControlTotalQueryPage.navigateTo(URL);
		wait.waitFor(500);

	}
}