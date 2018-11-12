package com.dy.AutoTest.OperationPlatform.TestCases.UserManagement.UserInfoManagement;


import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.dy.AutoTest.OperationPlatform.POJO.UserActionBean;
import com.dy.AutoTest.OperationPlatform.PageObject.UserManagement.UserInfoManagement.UserActionPage;
import com.dy.AutoTest.OperationPlatform.TestCases.SuperTest;
import com.dy.AutoTest.web.business.DataBusiness;


public class UserActionTest extends SuperTest{
	UserActionPage UserActionPage;
    String URL;
    
    @BeforeClass
	public void init() {
    	UserActionPage=new UserActionPage(driver);
		URL=host.toString()+DataBusiness.getData_URL("pop_UserAction");
	}
	
	@DataProvider(name="UserAction")
	protected static Object[][] parametersPool(){
		data.loadDataBeanList("POP_Date_UserAction");
		return data.getDataBeanArray();
	}
	
	@Test(dataProvider="UserAction")
	public void testUserAction(UserActionBean UserActionBean) {
		UserActionPage.navigateTo(URL);
		
		UserActionPage.setMobileNO(UserActionBean.getMobileNO());
		
		if(!UserActionBean.getStartDate().equals("") && !UserActionBean.getEndDate().equals("")) {
			UserActionPage.setStartDate(UserActionBean.getStartDate());
			UserActionPage.setEndDate(UserActionBean.getEndDate());
		}
		
		UserActionPage.doLoseFocus("EndDate", 0, -50);
		
		UserActionPage.doQuery();
		
		
	}
}
