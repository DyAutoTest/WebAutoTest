package com.dy.AutoTest.OperationPlatform.TestCases.OnlineRiskControl.RiskControlWarning;

import java.lang.reflect.Method;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.dy.AutoTest.web.api.SuperTest;
import com.dy.AutoTest.OperationPlatform.PageObject.OnlineRiskControl.RiskControlWarning.LimitWarningPage;
import com.dy.AutoTest.OperationPlatform.POJO.RiskControlWarning_LimitWarningBean;
import com.dy.AutoTest.web.business.DataBusiness;

public class LimitWarningPageTest extends SuperTest{
	LimitWarningPage LimitWarningPage;
	String URL;

	@BeforeClass
	public void init() {
		/******** instant objectPage *********/
		LimitWarningPage=new LimitWarningPage(driver);
		//LimitWarningPage.setWaitTime(800);

		/******** set URL *********/
		URL=host.toString()+DataBusiness.getData_URL("pop_RiskControlWarning_LimitWarning");

		/******** instant Interface *********/
		iQuery=LimitWarningPage;
//		iClickButton=LimitWarningPage;
//		iClickRadio=LimitWarningPage;
//		iSearchMerchantByNOorName=LimitWarningPage;
	}

	@DataProvider(name="RiskControlWarning_LimitWarning")
	protected static Object[][] parametersPool(){
		data.loadDataBeanList("POP_Data_RiskControlWarning_LimitWarning");
		return data.getDataBeanArray();
	}

	@DataProvider(name="RiskControlWarning_LimitWarningByCaseNO")
	protected static Object[][] parametersPool(Method method){
		data.loadDataBeanList("POP_Data_RiskControlWarning_LimitWarning",method.getName());
		return data.getDataBeanArray();
	}

	@Test(dataProvider="RiskControlWarning_LimitWarningByCaseNO")
	public void testQuery(RiskControlWarning_LimitWarningBean rlwBean) {
		LimitWarningPage.navigateTo(URL);
		wait.waitFor(500);

		if(!rlwBean.getModule().equals("")) {
			if(!rlwBean.getQueryDate().equals(""))
				LimitWarningPage.setQueryDate(rlwBean.getQueryDate());	
			LimitWarningPage.selectModule(rlwBean.getModule());
			doQuery();
		}
	}
}