package com.dy.AutoTest.OperationPlatform.TestCases.MerchantManagementOnLine.OnLineMechantInfo;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.dy.AutoTest.OperationPlatform.POJO.MerchantFeeRateBean;
import com.dy.AutoTest.OperationPlatform.PageObject.MerchantManagementOnLine.OnLineMerchantInfo.MerchantFeeRatePage;
import com.dy.AutoTest.OperationPlatform.TestCases.SuperTest;
import com.dy.AutoTest.web.actions.SingletonSet;
import com.dy.AutoTest.web.business.DataBusiness;

public class MerchantFeeRatePageTest extends SuperTest{
	private MerchantFeeRatePage MerchantFreeRatePage;
	private String URL;
    
    @BeforeClass
	public void init() {
    	MerchantFreeRatePage=new MerchantFeeRatePage(driver);
		URL=host.toString()+DataBusiness.getData_URL("pop_OnlineMerchantFeeRate");
	}
	
	@DataProvider(name="feeRate")
	protected static Object[][] parametersPool(){
		data.loadDataBeanList("POP_Data_MerchantFeeRate");
		return data.getDataBeanArray();
	}
	
	/**
	 * @param MerchantFeeRateBean
	 * 测试费率新增
	 */
	@Test(dataProvider="feeRate")
	public void testMerchantFeeRateAdd(MerchantFeeRateBean MerchantFeeRateBean) {
		//跳转到费率管理页面
		MerchantFreeRatePage.navigateTo(URL);
		
		String ProductTypes[]=MerchantFeeRateBean.getProductType().split(",");
		String FeeRateCodes[]=MerchantFeeRateBean.getFeeRateCode().split(",");
		
		for(int i=0;i<ProductTypes.length;i++) {
			MerchantFreeRatePage.doMerchantFeeRateAdd();
			//如果商户号与商户名为空，直接打断测试
			if(MerchantFeeRateBean.getMerchantNO().equals("")
					&&MerchantFeeRateBean.getMerchantName().equals("")) {
				System.out.println("Both of NO and Name is null! Please check (SQLite--POP_Data_MerchantSettlement) ID= "+MerchantFeeRateBean.getID());
				assertTrue(false);
			}//如果商户号为空，使用商户名进行搜索
			else if(!MerchantFeeRateBean.getMerchantNO().equals("")) {
				MerchantFreeRatePage.setMerchantNO(MerchantFeeRateBean.getMerchantNO());
			}else {
				MerchantFreeRatePage.setMerchantName(MerchantFeeRateBean.getMerchantName());
			}
			
			MerchantFreeRatePage.setProductType(ProductTypes[i]);
			//设置费率起始日期
			MerchantFreeRatePage.setFeeRate_StartDate(SingletonSet.CurrentAccountantDate.toString());
			MerchantFreeRatePage.setFeeRate_ExpireDate(MerchantFeeRateBean.getFeeRate_ExpireDate());
			MerchantFreeRatePage.doLoseFocus("FeeRate_StartDate",-80,0);
			//设置费率类型
			MerchantFreeRatePage.setFeeRateType(MerchantFeeRateBean.getFeeRateType());
			
			MerchantFreeRatePage.setSettlementType(MerchantFeeRateBean.getSettlementType());
			MerchantFreeRatePage.setRefundType(MerchantFeeRateBean.getRefundType());
			MerchantFreeRatePage.setRefundMode(MerchantFeeRateBean.getRefundMode());
			//如果费率类型存在，取费率类型，如果不存在，费率代码取 X52
			if(i<FeeRateCodes.length)
				MerchantFreeRatePage.setFeeRateCode(FeeRateCodes[i]);
			else
				MerchantFreeRatePage.setFeeRateCode("X52");
			
			MerchantFreeRatePage.doButton_Confirm();
		}
	}
	
	
}
