package com.dy.AutoTest.MerchantPortal.TestCases.merchantmanage;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.dy.AutoTest.MerchantPortal.POJO.MMOperManagementBean;
import com.dy.AutoTest.MerchantPortal.PageObject.merchantmanage.MMOperManagementPage;
import com.dy.AutoTest.web.api.SuperTest;
import com.dy.AutoTest.web.business.DataBusiness;

public class MMOperManagementPageTest  extends SuperTest {
	
	private MMOperManagementPage mMOperManagementPage;

	private String URL = "";

	@BeforeClass
	public void init() {
		mMOperManagementPage = new MMOperManagementPage(driver);
		URL = host.toString() + DataBusiness.getData_URL("mp_MMOperManagement");
	}

	@DataProvider(name = "mMOperManagement")
	protected static Object[][] parametersPool() {
		data.loadDataBeanList("MP_Data_MMOperManagement", MMOperManagementBean.class);
		return data.getDataBeanArray();
	}

	@Test(dataProvider = "mMOperManagement", description = "商户门户-操作员管理")
	public void testMMOperManagement(MMOperManagementBean mMOperManagementBean) {
		mMOperManagementPage.navigateTo(URL);
		wait.waitFor(500);
		
		mMOperManagementPage.setOperManagement_PhoneNO(mMOperManagementBean.getOperManagement_PhoneNO());
		mMOperManagementPage.clickOperManagement_Query();
		wait.waitFor(500);

		mMOperManagementPage.clickOperManagement_Modify();
		wait.waitFor(500);
		mMOperManagementPage.clickOperManagement_ModifyCancel();
		
		wait.waitFor(500);
		mMOperManagementPage.clickOperLog();
		
		wait.waitFor(500);
		mMOperManagementPage.setOperLog_BeginDate(mMOperManagementBean.getOperLog_BeginDate());
		mMOperManagementPage.setOperLog_EndDate(mMOperManagementBean.getOperLog_EndDate());
		mMOperManagementPage.setOperLog_Oper(mMOperManagementBean.getOperLog_Oper());
		
		wait.waitFor(500);
		mMOperManagementPage.clickOperLog_Query();
	}
	
}
