package com.dy.AutoTest.OperationPlatform.TestCases.UserManagement.UserInfoManagement;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.dy.AutoTest.OperationPlatform.PageObject.UserManagement.UserInfoManagement.UserIncomeExpenditureDetailPage;
import com.dy.AutoTest.OperationPlatform.POJO.UserIncomeExpenditureDetailBean;
import com.dy.AutoTest.web.api.SuperTest;
import com.dy.AutoTest.web.business.DataBusiness;

public class UserIncomeExpenditureDetailTest extends SuperTest{
	UserIncomeExpenditureDetailPage UserIncomeExpenditureDetailPage;
    String URL;
    
    @BeforeClass
	public void init() {
    	UserIncomeExpenditureDetailPage=new UserIncomeExpenditureDetailPage(driver);
		URL=host.toString()+DataBusiness.getData_URL("pop_UserIncomeExpenditureDetail");
	}
	
	@DataProvider(name="UserIncomeExpenditureDetail")
	protected static Object[][] parametersPool(){
		data.loadDataBeanList("POP_Data_UserIncomeExpenditureDetail");
		return data.getDataBeanArray();
	}
	


	@Test(dataProvider="UserIncomeExpenditureDetail")
	public void testUserIncomeExpenditureDetail(UserIncomeExpenditureDetailBean UserIncomeExpenditureDetailBean) {
		UserIncomeExpenditureDetailPage.navigateTo(URL);
		if(!UserIncomeExpenditureDetailBean.getMobileNO().equals("")) {
			UserIncomeExpenditureDetailPage.setMobileNO(UserIncomeExpenditureDetailBean.getMobileNO());
			UserIncomeExpenditureDetailPage.doQuery();
			wait.waitFor(1000);
			UserIncomeExpenditureDetailPage.doReset();
		}
		
		if(!UserIncomeExpenditureDetailBean.getInnerUserNO().equals("")) {
			UserIncomeExpenditureDetailPage.setInnerUserNO(UserIncomeExpenditureDetailBean.getInnerUserNO());
			UserIncomeExpenditureDetailPage.doQuery();
			wait.waitFor(1000);
			UserIncomeExpenditureDetailPage.doReset();
		}
		
		if(!UserIncomeExpenditureDetailBean.getStartDate().equals("")&& !UserIncomeExpenditureDetailBean.getEndDate().equals("")) {
			UserIncomeExpenditureDetailPage.setStartDate(UserIncomeExpenditureDetailBean.getStartDate());
			UserIncomeExpenditureDetailPage.setEndDate(UserIncomeExpenditureDetailBean.getEndDate());
			UserIncomeExpenditureDetailPage.doQuery();
			wait.waitFor(1000);
			UserIncomeExpenditureDetailPage.doReset();
		}
		
		if(!UserIncomeExpenditureDetailBean.getTransactionType().equals("")) {
			UserIncomeExpenditureDetailPage.setTransactionType(UserIncomeExpenditureDetailBean.getTransactionType());
			UserIncomeExpenditureDetailPage.doQuery();
			wait.waitFor(1000);
			UserIncomeExpenditureDetailPage.doReset();
		}
		
		if(!UserIncomeExpenditureDetailBean.getMobileNO().equals("")) {
			UserIncomeExpenditureDetailPage.setMobileNO(UserIncomeExpenditureDetailBean.getMobileNO());
		}if(!UserIncomeExpenditureDetailBean.getInnerUserNO().equals("")) {
			UserIncomeExpenditureDetailPage.setInnerUserNO(UserIncomeExpenditureDetailBean.getInnerUserNO());
		}if(!UserIncomeExpenditureDetailBean.getStartDate().equals("")&& !UserIncomeExpenditureDetailBean.getEndDate().equals("")) {
			UserIncomeExpenditureDetailPage.setStartDate(UserIncomeExpenditureDetailBean.getStartDate());
			UserIncomeExpenditureDetailPage.setEndDate(UserIncomeExpenditureDetailBean.getEndDate());
		}if(!UserIncomeExpenditureDetailBean.getTransactionType().equals("")) {
			UserIncomeExpenditureDetailPage.setTransactionType(UserIncomeExpenditureDetailBean.getTransactionType());
		}
		UserIncomeExpenditureDetailPage.doQuery();
		wait.waitFor(1000);
		UserIncomeExpenditureDetailPage.selectRadio();
		wait.waitFor(1000);
		UserIncomeExpenditureDetailPage.doDetail();
		wait.waitFor(1500);
		UserIncomeExpenditureDetailPage.doClose();
		
	}
}
