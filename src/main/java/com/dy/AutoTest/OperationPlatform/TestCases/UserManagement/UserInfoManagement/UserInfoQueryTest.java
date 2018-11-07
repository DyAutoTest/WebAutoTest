package com.dy.AutoTest.OperationPlatform.TestCases.UserManagement.UserInfoManagement;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.dy.AutoTest.OperationPlatform.TestCases.SuperTest;
import com.dy.AutoTest.web.business.DataBusiness;
import com.dy.AutoTest.OperationPlatform.POJO.UserInfoQueryBean;
import com.dy.AutoTest.OperationPlatform.PageObject.UserManagement.UserInfoManagement.UserInfoQueryPage;

/**
 * @author Jerry
 * 
 * 先做主流程
 * 再校验相关字段：手机号搜索结果校验、冻结、解冻的按钮切换可用
 * 
 *
 */
public class UserInfoQueryTest extends SuperTest{
	
	UserInfoQueryPage UserInfoQueryPage;
    String URL;
    
    @BeforeClass
	public void init() {
    	UserInfoQueryPage=new UserInfoQueryPage(driver);
		URL=host.toString()+DataBusiness.getData_URL("pop_UserInfoQuery");
	}
	
	@DataProvider(name="pop_UserInfoQuery")
	protected static Object[][] parametersPool(){
		data.loadDataBeanList("POP_Data_UserInfoQuery");
		return data.getDataBeanArray();
	}
	
	@Test(dataProvider="pop_UserInfoQuery")
	public void testUserInfoQuery(UserInfoQueryBean UserInfoQueryBean) {
		UserInfoQueryPage.navigateTo(URL);
		
		if(!UserInfoQueryBean.getMobileNO().equals("")) {
			UserInfoQueryPage.setMobileNO(UserInfoQueryBean.getMobileNO());
			UserInfoQueryPage.doQuery();
			wait.waitFor(2000);
			UserInfoQueryPage.doReset();
		}
		if(!UserInfoQueryBean.getInnerUserNO().equals("")) {
			UserInfoQueryPage.setInnerUserNO(UserInfoQueryBean.getInnerUserNO());
			UserInfoQueryPage.doQuery();
			wait.waitFor(2000);
			UserInfoQueryPage.doReset();
		}
		if(!UserInfoQueryBean.getCredentialType().equals("")) {
			UserInfoQueryPage.setCredentialType(UserInfoQueryBean.getCredentialType());
			if(!UserInfoQueryBean.getCredentialNO().equals("")) {
				UserInfoQueryPage.setCredentialNO(UserInfoQueryBean.getCredentialNO());
				UserInfoQueryPage.doQuery();
				wait.waitFor(2000);
				UserInfoQueryPage.doReset();
			}
	
		}
		if(!UserInfoQueryBean.getAccountGrade().equals("")) {
			UserInfoQueryPage.setAccountGrade(UserInfoQueryBean.getAccountGrade());
			UserInfoQueryPage.doQuery();
			wait.waitFor(2000);
			UserInfoQueryPage.doReset();
		}
		
	}

	@Test(dataProvider="pop_UserInfoQuery")
	public void testUserInfoDetail(UserInfoQueryBean UserInfoQueryBean) {
		UserInfoQueryPage.navigateTo(URL);
		
		if(!UserInfoQueryBean.getInnerUserNO().equals("")) {
			UserInfoQueryPage.setInnerUserNO(UserInfoQueryBean.getInnerUserNO());
			UserInfoQueryPage.doQuery();
			wait.waitFor(1000);
		}
		
		UserInfoQueryPage.doSelect();
		wait.waitFor(1000);
		UserInfoQueryPage.doDetail();
		
		wait.waitFor(1000);
		UserInfoQueryPage.doFrozen();
				UserInfoQueryPage.setFrozenReason(UserInfoQueryBean.getFrozenReason());
				UserInfoQueryPage.doFrozenAfirm();
		wait.waitFor(1500);
		UserInfoQueryPage.doUnfrozen();
				UserInfoQueryPage.setUnFrozenReason(UserInfoQueryBean.getUnFrozenReason());
				UserInfoQueryPage.doUnFrozenReasonAfirm();
		wait.waitFor(1500);
		UserInfoQueryPage.doLoss();
				UserInfoQueryPage.doLossAfirm();
		wait.waitFor(1500);
		UserInfoQueryPage.doUnloss();
				UserInfoQueryPage.doUnlossAfirm();
		
				
		wait.waitFor(1500);
		UserInfoQueryPage.doResetPassword();
				UserInfoQueryPage.setResetPasswordType(UserInfoQueryBean.getResetPasswordFlag());
				UserInfoQueryPage.doResetPasswordAfirm();
		
	}
		
		
	
	
	
	
}
