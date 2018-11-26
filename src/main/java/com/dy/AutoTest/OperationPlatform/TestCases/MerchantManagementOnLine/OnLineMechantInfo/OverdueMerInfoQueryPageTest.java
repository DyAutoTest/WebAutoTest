package com.dy.AutoTest.OperationPlatform.TestCases.MerchantManagementOnLine.OnLineMechantInfo;


import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.dy.AutoTest.OperationPlatform.POJO.OverdueMerInfoQueryBean;
import com.dy.AutoTest.OperationPlatform.PageObject.MerchantManagementOnLine.OnLineMerchantInfo.OverdueMerInfoQueryPage;
import com.dy.AutoTest.web.api.SuperTest;
import com.dy.AutoTest.web.beans.DemoBean;
import com.dy.AutoTest.web.business.DataBusiness;

public class OverdueMerInfoQueryPageTest extends SuperTest{
	OverdueMerInfoQueryPage OverdueMerInfoQueryPage;
    String URL;
    
    @BeforeClass
	public void init() {
    	OverdueMerInfoQueryPage=new OverdueMerInfoQueryPage(driver);
//    	DemoPage.setWaitTime(800);
		URL=host.toString()+DataBusiness.getData_URL("pop_OverdueMerInfoQuery");
	}
	
	@DataProvider(name="OverdueMerInfoQuery")
	protected static Object[][] parametersPool(){
		data.loadDataBeanList("POP_Data_OverdueMerInfoQuery");
		return data.getDataBeanArray();
	}
	
	@Test(dataProvider="OverdueMerInfoQuery")
	public void testOverdueMerInfoQuery(OverdueMerInfoQueryBean OverdueMerInfoQueryBean) {
		OverdueMerInfoQueryPage.navigateTo(URL);
		wait.waitFor(1000);
		
		
		OverdueMerInfoQueryPage.setRemindDateBegin(OverdueMerInfoQueryBean.getRemindDateBegin());
		wait.waitFor(500);
		OverdueMerInfoQueryPage.setRemindDateEnd(OverdueMerInfoQueryBean.getRemindDateEnd());
		OverdueMerInfoQueryPage.doLoseFocus("RemindDateEnd", 100, 0);
		
		OverdueMerInfoQueryPage.clickQuery();
		wait.waitFor(1000);
		OverdueMerInfoQueryPage.doPageDown();
		wait.waitFor(2000);
		OverdueMerInfoQueryPage.doPageUp();
		
	}
}
