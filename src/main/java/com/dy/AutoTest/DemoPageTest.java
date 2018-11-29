package com.dy.AutoTest;


import java.lang.reflect.Method;

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
    	/******** instant objectPage *********/
    	DemoPage=new DemoPage(driver);
//    	DemoPage.setWaitTime(800);
    	
    	/******** set URL *********/
		URL=host.toString()+DataBusiness.getData_URL("XXXX");
		
		/******** instant Interface *********/
//		iQuery=DemoPage;
//		iClickButton=DemoPage;
	}
	
	@DataProvider(name="xxxx")
	protected static Object[][] parametersPool(){
		data.loadDataBeanList("POP_Data_XXXX");
		return data.getDataBeanArray();
	}
	
	@DataProvider(name="xxxxByCaseNO")
	protected static Object[][] parametersPool(Method method){
		data.loadDataBeanList("POP_Data_XXXX",method.getName());
		return data.getDataBeanArray();
	}
	
	@Test(dataProvider="xxxx")       
	public void testXXXX(DemoBean DemoBean) {    
		DemoPage.navigateTo(URL);
	}
}
