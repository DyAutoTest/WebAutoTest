package com.dy.AutoTest.OperationPlatform.TestCases.SettlementManagement.Payment;

import java.lang.reflect.Method;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.dy.AutoTest.web.api.SuperTest;
import com.dy.AutoTest.OperationPlatform.POJO.SettlementManagement_PaymentApprovalStatusQueryBean;
import com.dy.AutoTest.OperationPlatform.PageObject.SettlementManagement.Payment.PaymentApprovalStatusQueryPage;
import com.dy.AutoTest.web.business.DataBusiness;

/**
 * @author Jerry
 * 
 * 		待复核，“付款操作”结束后，进入“付款审核”
		复核付款，“付款操作”中选择“确认”，“付款审核”中，复核“通过”的记录
		复核回退，付款操作”中选择“确认”，“付款审核”中，复核“退回”的记录
		不需要复核，
		系统拒绝，
		复核转网银，“付款操作”中选择“转网银”，“付款审核”中，复核“通过”的记录
		复核撤销，“付款操作”中选择“撤销”，“付款审核”中，复核“通过”的记录
 *
 */
public class PaymentApprovalStatusQueryPageTest extends SuperTest{
	PaymentApprovalStatusQueryPage PaymentApprovalStatusQueryPage;
	String URL;

	@BeforeClass
	public void init() {
		/******** instant objectPage *********/
		PaymentApprovalStatusQueryPage=new PaymentApprovalStatusQueryPage(driver);
		//PaymentApprovalStatusQueryPage.setWaitTime(800);

		/******** set URL *********/
		URL=host.toString()+DataBusiness.getData_URL("pop_SettlementManagement_PaymentApprovalStatusQuery");

		/******** instant Interface *********/
		iQuery=PaymentApprovalStatusQueryPage;
//		iClickButton=PaymentApprovalStatusQueryPage;
//		iClickRadio=PaymentApprovalStatusQueryPage;
//		iSearchMerchant=PaymentApprovalStatusQueryPage;
	}

	@DataProvider(name="SettlementManagement_PaymentApprovalStatusQuery")
	protected static Object[][] parametersPool(){
		data.loadDataBeanList("POP_Data_SettlementManagement_PaymentApprovalStatusQuery");
		return data.getDataBeanArray();
	}

	@DataProvider(name="SettlementManagement_PaymentApprovalStatusQueryByCaseNO")
	protected static Object[][] parametersPool(Method method){
		data.loadDataBeanList("POP_Data_SettlementManagement_PaymentApprovalStatusQuery",method.getName());
		return data.getDataBeanArray();
	}

	@Test(dataProvider="SettlementManagement_PaymentApprovalStatusQueryByCaseNO")
	public void testQuery(SettlementManagement_PaymentApprovalStatusQueryBean spasqBean) {
		PaymentApprovalStatusQueryPage.navigateTo(URL);
		wait.waitFor(500);
		PaymentApprovalStatusQueryPage.clickAdvance();
		wait.waitFor(500);
		
		PaymentApprovalStatusQueryPage.clickReset();
		
		if(!spasqBean.getRiskApprovalStatus().equals("")) {
			PaymentApprovalStatusQueryPage.selectRiskApprovalStatus(spasqBean.getRiskApprovalStatus());
			doQuery();
		}
		if(!spasqBean.getPaymentApprovalStatus().equals("")) {
			PaymentApprovalStatusQueryPage.selectPaymentApprovalStatus(spasqBean.getPaymentApprovalStatus());
			doQuery();
		}
		if(!spasqBean.getDateType().equals("")) {
			PaymentApprovalStatusQueryPage.selectDateType(spasqBean.getDateType());
			doQuery();
		}
		if(!spasqBean.getDateBegin().equals("")&&!spasqBean.getDateEnd().equals("")) {
			PaymentApprovalStatusQueryPage.setDateBegin(spasqBean.getDateBegin());
			PaymentApprovalStatusQueryPage.setDateEnd(spasqBean.getDateEnd());
			PaymentApprovalStatusQueryPage.doLoseFocus("DateEnd", 120, 0);
			doQuery();
		}
		if(!spasqBean.getRecheckApprovalStatus().equals("")) {
			PaymentApprovalStatusQueryPage.selectRecheckApprovalStatus(spasqBean.getRecheckApprovalStatus());
			doQuery();
		}
		if(!spasqBean.getRecheckApprovalStatus().equals("")) {
			PaymentApprovalStatusQueryPage.selectRecheckApprovalStatus(spasqBean.getRecheckApprovalStatus());
			doQuery();
		}
		if(!spasqBean.getRiskApprovalStatus().equals("")) {
			PaymentApprovalStatusQueryPage.selectRiskApprovalStatus(spasqBean.getRiskApprovalStatus());
			doQuery();
		}
		if(!spasqBean.getPaymentType().equals("")) {
			PaymentApprovalStatusQueryPage.selectPaymentType(spasqBean.getPaymentType());
			doQuery();
		}
		if(!spasqBean.getPaymentBank().equals("")) {
			PaymentApprovalStatusQueryPage.selectPaymentBank(spasqBean.getPaymentBank());
			doQuery();
		}
		if(!spasqBean.getInnerUserNO().equals("")) {
			PaymentApprovalStatusQueryPage.setInnerUserNO(spasqBean.getInnerUserNO());
			doQuery();
		}
	}
}