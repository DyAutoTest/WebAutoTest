package com.dy.AutoTest.MerchantPortal.TestCases.merchantmanage;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.dy.AutoTest.MerchantPortal.POJO.MMAddOperBean;
import com.dy.AutoTest.MerchantPortal.PageObject.merchantmanage.MMAddOperPage;
import com.dy.AutoTest.web.api.SuperTest;
import com.dy.AutoTest.web.business.DataBusiness;

public class MMAddOperPageTest  extends SuperTest {
	
	private MMAddOperPage mMAddOperPage;

	private String URL = "";

	@BeforeClass
	public void init() {
		mMAddOperPage = new MMAddOperPage(driver);
		URL = host.toString() + DataBusiness.getData_URL("mp_MMAddOper");
	}

	@DataProvider(name = "mMAddOper")
	protected static Object[][] parametersPool() {
		data.loadDataBeanList("MP_Data_MMAddOper", MMAddOperBean.class);
		return data.getDataBeanArray();
	}

	@Test(dataProvider = "mMAddOper", description = "商户门户-添加操作员")
	public void testMMAddOper(MMAddOperBean mMAddOperBean) {
		mMAddOperPage.navigateTo(URL);
		wait.waitFor(500);
		
		mMAddOperPage.setOperName(mMAddOperBean.getOperName());
		mMAddOperPage.setPhoneNO(mMAddOperBean.getPhoneNO());
		mMAddOperPage.setPassword(mMAddOperBean.getPassword());
		mMAddOperPage.setConfirmPassword(mMAddOperBean.getConfirmPassword());
		
		mMAddOperPage.clickMyDYInfoExpand();
		
		wait.waitFor(500);
		mMAddOperPage.clickAdd();
	}
	
}
