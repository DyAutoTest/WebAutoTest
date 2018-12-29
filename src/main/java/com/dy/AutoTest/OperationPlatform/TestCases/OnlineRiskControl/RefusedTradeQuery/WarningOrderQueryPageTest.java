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
	public void testQuery(RefusedTradeQuery_WarningOrderQueryBean rwoqBean) {
		WarningOrderQueryPage.navigateTo(URL);
		wait.waitFor(500);
		if(!rwoqBean.getPayerInternalNO().equals("")) {
			if(!rwoqBean.getDateBegin().equals("")&&!rwoqBean.getDateEnd().equals("")) {
				if(!WarningOrderQueryPage.getDateBegin().equals(rwoqBean.getDateBegin())) {
					WarningOrderQueryPage.setDateBegin(rwoqBean.getDateBegin());
					WarningOrderQueryPage.setDateEnd(rwoqBean.getDateEnd());
					WarningOrderQueryPage.doLoseFocus("DateEnd", 120, 0);
				}
			}
			WarningOrderQueryPage.setPayerInternalNO(rwoqBean.getPayerInternalNO());
			doQuery();
		}
		if(!rwoqBean.getPayeeInternalNO().equals("")) {
			if(!rwoqBean.getDateBegin().equals("")&&!rwoqBean.getDateEnd().equals("")) {
				if(!WarningOrderQueryPage.getDateBegin().equals(rwoqBean.getDateBegin())) {
					WarningOrderQueryPage.setDateBegin(rwoqBean.getDateBegin());
					WarningOrderQueryPage.setDateEnd(rwoqBean.getDateEnd());
					WarningOrderQueryPage.doLoseFocus("DateEnd", 120, 0);
				}
			}
			WarningOrderQueryPage.setPayeeInternalNO(rwoqBean.getPayeeInternalNO());
			doQuery();
		}
		if(!rwoqBean.getBusinessType().equals("")) {
			if(!rwoqBean.getDateBegin().equals("")&&!rwoqBean.getDateEnd().equals("")) {
				if(!WarningOrderQueryPage.getDateBegin().equals(rwoqBean.getDateBegin())) {
					WarningOrderQueryPage.setDateBegin(rwoqBean.getDateBegin());
					WarningOrderQueryPage.setDateEnd(rwoqBean.getDateEnd());
					WarningOrderQueryPage.doLoseFocus("DateEnd", 120, 0);
				}
			}
			WarningOrderQueryPage.selectBusinessType(rwoqBean.getBusinessType());
			doQuery();
		}
		if(!rwoqBean.getTradeType().equals("")) {
			if(!rwoqBean.getDateBegin().equals("")&&!rwoqBean.getDateEnd().equals("")) {
				if(!WarningOrderQueryPage.getDateBegin().equals(rwoqBean.getDateBegin())) {
					WarningOrderQueryPage.setDateBegin(rwoqBean.getDateBegin());
					WarningOrderQueryPage.setDateEnd(rwoqBean.getDateEnd());
					WarningOrderQueryPage.doLoseFocus("DateEnd", 120, 0);
				}
			}
			WarningOrderQueryPage.selectTradeType(rwoqBean.getTradeType());
			doQuery();
		}
		if(!rwoqBean.getTradeOrderNO().equals("")) {
			if(!rwoqBean.getDateBegin().equals("")&&!rwoqBean.getDateEnd().equals("")) {
				if(!WarningOrderQueryPage.getDateBegin().equals(rwoqBean.getDateBegin())) {
					WarningOrderQueryPage.setDateBegin(rwoqBean.getDateBegin());
					WarningOrderQueryPage.setDateEnd(rwoqBean.getDateEnd());
					WarningOrderQueryPage.doLoseFocus("DateEnd", 120, 0);
				}
			}
			WarningOrderQueryPage.setTradeOrderNO(rwoqBean.getTradeOrderNO());
			doQuery();
		}
		if(!rwoqBean.getDateBegin().equals("")&&!rwoqBean.getDateEnd().equals("")) {
			if(!WarningOrderQueryPage.getDateBegin().equals(rwoqBean.getDateBegin())) {
				WarningOrderQueryPage.setDateBegin(rwoqBean.getDateBegin());
				WarningOrderQueryPage.setDateEnd(rwoqBean.getDateEnd());
				WarningOrderQueryPage.doLoseFocus("DateEnd", 120, 0);
			}
			doQuery();
		}
	}
}