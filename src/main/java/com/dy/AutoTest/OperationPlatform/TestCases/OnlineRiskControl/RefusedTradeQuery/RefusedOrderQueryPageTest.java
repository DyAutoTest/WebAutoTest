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
	public void testQuery(RefusedTradeQuery_RefusedOrderQueryBean rroqBean) {
		RefusedOrderQueryPage.navigateTo(URL);
		wait.waitFor(500);
		RefusedOrderQueryPage.clickAdvance();
		wait.waitFor(800);
		
		if(!rroqBean.getPayerInternalNO().equals("")) {
			if(!rroqBean.getDateBegin().equals("")&&!rroqBean.getDateEnd().equals("")) {
				if(!RefusedOrderQueryPage.getDateBegin().equals(rroqBean.getDateBegin())) {
					RefusedOrderQueryPage.setDateBegin(rroqBean.getDateBegin());
					RefusedOrderQueryPage.setDateEnd(rroqBean.getDateEnd());
					RefusedOrderQueryPage.doLoseFocus("DateEnd", 120, 0);
				}
			}
			RefusedOrderQueryPage.setPayerInternalNO(rroqBean.getPayerInternalNO());
			doQuery();
		}
		if(!rroqBean.getPayeeInternalNO().equals("")) {
			if(!rroqBean.getDateBegin().equals("")&&!rroqBean.getDateEnd().equals("")) {
				if(!RefusedOrderQueryPage.getDateBegin().equals(rroqBean.getDateBegin())) {
					RefusedOrderQueryPage.setDateBegin(rroqBean.getDateBegin());
					RefusedOrderQueryPage.setDateEnd(rroqBean.getDateEnd());
					RefusedOrderQueryPage.doLoseFocus("DateEnd", 120, 0);
				}
			}
			RefusedOrderQueryPage.setPayeeInternalNO(rroqBean.getPayeeInternalNO());
			doQuery();
		}
		if(!rroqBean.getBusinessType().equals("")) {
			if(!rroqBean.getDateBegin().equals("")&&!rroqBean.getDateEnd().equals("")) {
				if(!RefusedOrderQueryPage.getDateBegin().equals(rroqBean.getDateBegin())) {
					RefusedOrderQueryPage.setDateBegin(rroqBean.getDateBegin());
					RefusedOrderQueryPage.setDateEnd(rroqBean.getDateEnd());
					RefusedOrderQueryPage.doLoseFocus("DateEnd", 120, 0);
				}
			}
			RefusedOrderQueryPage.selectBusinessType(rroqBean.getBusinessType());
			doQuery();
		}
		if(!rroqBean.getTradeType().equals("")) {
			if(!rroqBean.getDateBegin().equals("")&&!rroqBean.getDateEnd().equals("")) {
				if(!RefusedOrderQueryPage.getDateBegin().equals(rroqBean.getDateBegin())) {
					RefusedOrderQueryPage.setDateBegin(rroqBean.getDateBegin());
					RefusedOrderQueryPage.setDateEnd(rroqBean.getDateEnd());
					RefusedOrderQueryPage.doLoseFocus("DateEnd", 120, 0);
				}
			}
			RefusedOrderQueryPage.selectTradeType(rroqBean.getTradeType());
			doQuery();
		}
		if(!rroqBean.getTradeOrderNO().equals("")) {
			if(!rroqBean.getDateBegin().equals("")&&!rroqBean.getDateEnd().equals("")) {
				if(!RefusedOrderQueryPage.getDateBegin().equals(rroqBean.getDateBegin())) {
					RefusedOrderQueryPage.setDateBegin(rroqBean.getDateBegin());
					RefusedOrderQueryPage.setDateEnd(rroqBean.getDateEnd());
					RefusedOrderQueryPage.doLoseFocus("DateEnd", 120, 0);
				}
			}
			RefusedOrderQueryPage.setTradeOrderNO(rroqBean.getTradeOrderNO());
			doQuery();
		}
		if(!rroqBean.getDateBegin().equals("")&&!rroqBean.getDateEnd().equals("")) {
			if(!RefusedOrderQueryPage.getDateBegin().equals(rroqBean.getDateBegin())) {
				RefusedOrderQueryPage.setDateBegin(rroqBean.getDateBegin());
				RefusedOrderQueryPage.setDateEnd(rroqBean.getDateEnd());
				RefusedOrderQueryPage.doLoseFocus("DateEnd", 120, 0);
			}
			doQuery();
		}
		if(!rroqBean.getPhone().equals("")) {
			if(!rroqBean.getDateBegin().equals("")&&!rroqBean.getDateEnd().equals("")) {
				if(!RefusedOrderQueryPage.getDateBegin().equals(rroqBean.getDateBegin())) {
					RefusedOrderQueryPage.setDateBegin(rroqBean.getDateBegin());
					RefusedOrderQueryPage.setDateEnd(rroqBean.getDateEnd());
					RefusedOrderQueryPage.doLoseFocus("DateEnd", 120, 0);
				}
			}
			RefusedOrderQueryPage.setPhone(rroqBean.getPhone());
			doQuery();
		}
	}
}