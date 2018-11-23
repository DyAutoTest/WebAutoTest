package com.dy.AutoTest.OperationPlatform.TestCases.UserManagement.UserInfoManagement;


import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.dy.AutoTest.web.api.SuperTest;
import com.dy.AutoTest.web.business.DataBusiness;
import com.dy.AutoTest.OperationPlatform.POJO.UserAccountModifySearchBean;
import com.dy.AutoTest.OperationPlatform.PageObject.UserManagement.UserInfoManagement.UserAccountModifySearchPage;


public class UserAccountModifySearchTest extends SuperTest{
	UserAccountModifySearchPage UserAccountModifySearchPage;
    String URL;
    
    @BeforeClass
   	public void init() {
    	UserAccountModifySearchPage=new UserAccountModifySearchPage(driver);
   		URL=host.toString()+DataBusiness.getData_URL("pop_UserAccountModifySearch");
   	}
   	
   	@DataProvider(name="UserAccountModifySearch")
   	protected static Object[][] parametersPool(){
   		data.loadDataBeanList("POP_Data_UserAccountModifySearch");
   		return data.getDataBeanArray();
   	}
   	
   	@Test(dataProvider="UserAccountModifySearch",description="运营平台-用户账户变更历史查询")
   	public void testUserAccountModifySearch(UserAccountModifySearchBean UserAccountModifySearchBean) {
   		UserAccountModifySearchPage.navigateTo(URL);
   		
   		UserAccountModifySearchPage.setMobileNO(UserAccountModifySearchBean.getMobileNO());
   		UserAccountModifySearchPage.doQuery();
   		wait.waitFor(1000);
   		UserAccountModifySearchPage.doReset();
   		wait.waitFor(1500);
   		
   	}
}
