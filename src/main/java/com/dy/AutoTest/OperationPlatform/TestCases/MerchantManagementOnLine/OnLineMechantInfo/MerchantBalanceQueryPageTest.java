package com.dy.AutoTest.OperationPlatform.TestCases.MerchantManagementOnLine.OnLineMechantInfo;



import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.dy.AutoTest.OperationPlatform.POJO.MerchantBalanceQueryBean;
import com.dy.AutoTest.OperationPlatform.PageObject.MerchantManagementOnLine.OnLineMerchantInfo.MerchantBalanceQueryPage;
import com.dy.AutoTest.web.api.SuperTest;
import com.dy.AutoTest.web.business.DataBusiness;

public class MerchantBalanceQueryPageTest extends SuperTest{
	MerchantBalanceQueryPage MerchantBalanceQueryPage;
    String URL;
    
    @BeforeClass
	public void init() {
    	MerchantBalanceQueryPage=new MerchantBalanceQueryPage(driver);
    	MerchantBalanceQueryPage.setWaitTime(800);
		URL=host.toString()+DataBusiness.getData_URL("pop_MerchantBalanceQuery");
	}
	
	@DataProvider(name="MerchantBalanceQuery")
	protected static Object[][] parametersPool(){
		data.loadDataBeanList("POP_Data_MerchantBalanceQuery");
		return data.getDataBeanArray();
	}
	
	@Test(dataProvider="MerchantBalanceQuery")
	public void testMerchantBalanceQuery(MerchantBalanceQueryBean MerchantBalanceQueryBean) {
		MerchantBalanceQueryPage.navigateTo(URL);
		
		doSearchMerchantByNOorName(MerchantBalanceQueryBean.getMerchantNO(),MerchantBalanceQueryBean.getMerchantName(),MerchantBalanceQueryBean.getSearchMer_Index());
		
		MerchantBalanceQueryPage.clickQuery();
		wait.waitFor(1000);
		MerchantBalanceQueryPage.doPageDown();
		wait.waitFor(1500);
		MerchantBalanceQueryPage.doPageUp();
		
	}
	

}
