package com.dy.AutoTest.OperationPlatform.TestCases.OnlineRiskControl.RiskControlWarning;

import java.lang.reflect.Method;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.dy.AutoTest.web.api.SuperTest;
import com.dy.AutoTest.OperationPlatform.PageObject.OnlineRiskControl.RiskControlWarning.EmailWarningPage;
import com.dy.AutoTest.OperationPlatform.POJO.RiskControlWarning_EmailWarningBean;
import com.dy.AutoTest.web.business.DataBusiness;

public class EmailWarningPageTest extends SuperTest{
	EmailWarningPage EmailWarningPage;
	String URL;

	@BeforeClass
	public void init() {
		/******** instant objectPage *********/
		EmailWarningPage=new EmailWarningPage(driver);
		//EmailWarningPage.setWaitTime(800);

		/******** set URL *********/
		URL=host.toString()+DataBusiness.getData_URL("pop_RiskControlWarning_EmailWarning");

		/******** instant Interface *********/
//		iQuery=EmailWarningPage;
//		iClickButton=EmailWarningPage;
//		iClickRadio=EmailWarningPage;
//		iSearchMerchantByNOorName=EmailWarningPage;
	}

	@DataProvider(name="RiskControlWarning_EmailWarning")
	protected static Object[][] parametersPool(){
		data.loadDataBeanList("POP_Data_RiskControlWarning_EmailWarning");
		return data.getDataBeanArray();
	}

	@DataProvider(name="RiskControlWarning_EmailWarningByCaseNO")
	protected static Object[][] parametersPool(Method method){
		data.loadDataBeanList("POP_Data_RiskControlWarning_EmailWarning",method.getName());
		return data.getDataBeanArray();
	}

	@Test(dataProvider="RiskControlWarning_EmailWarningByCaseNO")
	public void testQuery(RiskControlWarning_EmailWarningBean RiskControlWarning_EmailWarningBean) {
		EmailWarningPage.navigateTo(URL);
		wait.waitFor(500);

	}
}