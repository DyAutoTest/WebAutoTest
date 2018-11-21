package com.dy.AutoTest.web.util;


import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.dy.AutoTest.web.api.SuperTest;
import com.dy.AutoTest.web.beans.DemoBean;
import com.dy.AutoTest.web.business.DataBusiness;

public class DemoPageTest extends SuperTest{
	DemoPage DemoPage;
    String URL;
    
    @BeforeClass
	public void init() {
    	DemoPage=new DemoPage(driver);
		URL=host.toString()+DataBusiness.getData_URL("XXXX");
	}
	
	@DataProvider(name="xxxx")
	protected static Object[][] parametersPool(){
		data.loadDataBeanList("POP_Data_XXXX");
		return data.getDataBeanArray();
	}
	
	@Test(dataProvider="xxxx")
	public void testXXXX(DemoBean DemoBean) {
		DemoPage.navigateTo(URL);
		
	}
}
