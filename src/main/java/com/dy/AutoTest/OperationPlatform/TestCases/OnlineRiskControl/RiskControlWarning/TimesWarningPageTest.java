package com.dy.AutoTest.OperationPlatform.TestCases.OnlineRiskControl.RiskControlWarning;

import java.lang.reflect.Method;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.dy.AutoTest.web.api.SuperTest;
import com.dy.AutoTest.OperationPlatform.PageObject.OnlineRiskControl.RiskControlWarning.TimesWarningPage;
import com.dy.AutoTest.OperationPlatform.POJO.RiskControlWarning_TimesWarningBean;
import com.dy.AutoTest.web.business.DataBusiness;

public class TimesWarningPageTest extends SuperTest{
	TimesWarningPage TimesWarningPage;
	String URL;

	@BeforeClass
	public void init() {
		/******** instant objectPage *********/
		TimesWarningPage=new TimesWarningPage(driver);
		//TimesWarningPage.setWaitTime(800);

		/******** set URL *********/
		URL=host.toString()+DataBusiness.getData_URL("pop_RiskControlWarning_TimesWarning");

		/******** instant Interface *********/
		iQuery=TimesWarningPage;
//		iClickButton=TimesWarningPage;
//		iClickRadio=TimesWarningPage;
//		iSearchMerchant=TimesWarningPage;
	}

	@DataProvider(name="RiskControlWarning_TimesWarning")
	protected static Object[][] parametersPool(){
		data.loadDataBeanList("POP_Data_RiskControlWarning_TimesWarning");
		return data.getDataBeanArray();
	}

	@DataProvider(name="RiskControlWarning_TimesWarningByCaseNO")
	protected static Object[][] parametersPool(Method method){
		data.loadDataBeanList("POP_Data_RiskControlWarning_TimesWarning",method.getName());
		return data.getDataBeanArray();
	}

	@Test(dataProvider="RiskControlWarning_TimesWarningByCaseNO")
	public void testQuery(RiskControlWarning_TimesWarningBean rtwBean) {
		TimesWarningPage.navigateTo(URL);
		wait.waitFor(500);
		
		if(!rtwBean.getModule().equals("")) {
			if(!rtwBean.getQueryDate().equals(""))
				TimesWarningPage.setQueryDate(rtwBean.getQueryDate());	
			TimesWarningPage.selectModule(rtwBean.getModule());
			doQuery();
		}
	}
}