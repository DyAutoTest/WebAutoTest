package com.dy.AutoTest.AcquiringOperationPlatform.PageTest.MerchantInfoManagement;


import java.lang.reflect.Method;

import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.dy.AutoTest.web.api.SuperTest;
import com.dy.AutoTest.AcquiringOperationPlatform.PageObject.MerchantInfoManagement.MerchantInfoAddPage;
import com.dy.AutoTest.AcquiringOperationPlatform.POJO.MerchantInfoManagement_MerchantInfoAddBean;
import com.dy.AutoTest.web.business.DataBusiness;

public class MerchantInfoAddPageTest extends SuperTest{
	MerchantInfoAddPage MerchantInfoAddPage;
	String URL;

	@BeforeClass
	public void init() {
		/******** instant objectPage *********/
		MerchantInfoAddPage=new MerchantInfoAddPage(driver);
//		MerchantInfoAddPage.setWaitTime(800);

		/******** set URL *********/
		URL=host.toString()+DataBusiness.getData_URL("aop_MerchantInfoManagement_MerchantInfoAdd");

		/******** instant Interface *********/
//		iQuery=MerchantInfoAddPage;
//		iClickButton=MerchantInfoAddPage;
//		iClickRadio=MerchantInfoAddPage;
//		iSearchMerchantByNOorName=MerchantInfoAddPage;
	}

	@DataProvider(name="MerchantInfoManagement_MerchantInfoAdd")
	protected static Object[][] parametersPool(){
		data.loadDataBeanList("AOP_Data_MerchantInfoManagement_MerchantInfoAdd",MerchantInfoManagement_MerchantInfoAddBean.class);
		return data.getDataBeanArray();
	}

	@DataProvider(name="MerchantInfoManagement_MerchantInfoAddByCaseNO")
	protected static Object[][] parametersPool(Method method){
		data.loadDataBeanList("AOP_Data_MerchantInfoManagement_MerchantInfoAdd",method.getName(),MerchantInfoManagement_MerchantInfoAddBean.class);
		return data.getDataBeanArray();
	}

	@Test(dataProvider="MerchantInfoManagement_MerchantInfoAddByCaseNO")
	public void testMerchantAdd(MerchantInfoManagement_MerchantInfoAddBean bean) {
		MerchantInfoAddPage.navigateTo(URL);
		wait.waitFor(500);
//		必输项检查并提醒
		RequiredFieldValidation(bean);

		if(!bean.getBasicInfo_MerchantType().equals("")) {
			MerchantInfoAddPage.selectBasicInfo_MerchantType(bean.getBasicInfo_MerchantType());
		}
		if(!bean.getBasicInfo_MerchantPhoneNO().equals("")) {
			MerchantInfoAddPage.setBasicInfo_MerchantPhoneNO(bean.getBasicInfo_MerchantPhoneNO());
		}
		if(!bean.getBasicInfo_MerchantName().equals("")) {
			MerchantInfoAddPage.setBasicInfo_MerchantName(bean.getBasicInfo_MerchantName());
		}
		if(!bean.getBasicInfo_MerchantAbbreviation().equals("")) {
			MerchantInfoAddPage.setBasicInfo_MerchantAbbreviation(bean.getBasicInfo_MerchantAbbreviation());
		}
		if(!bean.getBasicInfo_MerchantSpellingAbbreviation().equals("")) {
			MerchantInfoAddPage.setBasicInfo_MerchantSpellingAbbreviation(bean.getBasicInfo_MerchantSpellingAbbreviation());
		}
		if(!bean.getBasicInfo_MerchantPhone().equals("")) {
			MerchantInfoAddPage.setBasicInfo_MerchantPhone(bean.getBasicInfo_MerchantPhone());
		}
		
		MerchantInfoAddPage.doLoseFocus("BasicInfo_MerchantPhone", 300, 0);
		wait.waitFor(500);
		MerchantInfoAddPage.doPageDown();
		wait.waitFor(500);
		
		
		if(!bean.getBasicInfo_MCC().equals("")) {
			MerchantInfoAddPage.clickBasicInfo_MCC();
			wait.waitFor(500);
			MerchantInfoAddPage.selectBasicInfo_MCC_Select(bean.getBasicInfo_MCC());
		}
		if(!bean.getBasicInfo_InnerMerchantType().equals("")) {
			MerchantInfoAddPage.selectBasicInfo_InnerMerchantType(bean.getBasicInfo_InnerMerchantType());
		}
		if(!bean.getBasicInfo_InnerMerchantTypeLv2().equals("")) {
			MerchantInfoAddPage.selectBasicInfo_InnerMerchantTypeLv2(bean.getBasicInfo_InnerMerchantTypeLv2());
		}
		if(!bean.getBasicInfo_BelongProvince().equals("")) {
			MerchantInfoAddPage.selectBasicInfo_BelongProvince(bean.getBasicInfo_BelongProvince());
		}
		if(!bean.getBasicInfo_BelongCity().equals("")) {
			MerchantInfoAddPage.selectBasicInfo_BelongCity(bean.getBasicInfo_BelongCity());
		}
		if(!bean.getBasicInfo_BusinessAddress().equals("")) {
			MerchantInfoAddPage.setBasicInfo_BusinessAddress(bean.getBasicInfo_BusinessAddress());
		}
		
		
		
		MerchantInfoAddPage.clickBasicInfo_BusinessLicenseETC();
		wait.waitFor(1000);
		
		if(!bean.getBasicInfo_MerchantCharacter().equals("")) {
			MerchantInfoAddPage.selectBasicInfo_MerchantCharacter(bean.getBasicInfo_MerchantCharacter());
		}
		if(!bean.getBasicInfo_BusinessLicenseNO().equals("")) {
			MerchantInfoAddPage.setBasicInfo_BusinessLicenseNO(bean.getBasicInfo_BusinessLicenseNO());
		}
		if(bean.getBasicInfo_BusinessLicensePassDate().equals("1")) {
			MerchantInfoAddPage.setBasicInfo_BusinessLicensePassDate(bean.getBasicInfo_BusinessLicensePassDate());
			MerchantInfoAddPage.doLoseFocus("BasicInfo_BusinessLicensePassDate", 300, 0);
		}
		if(bean.getBasicInfo_BusinessLicensePassDate_LongTerm().equals("1")) {
			MerchantInfoAddPage.clickBasicInfo_BusinessLicensePassDate_LongTerm();
		}
		if(!bean.getBasicInfo_RegisteredCapital().equals("")) {
			MerchantInfoAddPage.setBasicInfo_RegisteredCapital(bean.getBasicInfo_RegisteredCapital());
		}
		if(!bean.getBasicInfo_RegisteredAddress().equals("")) {
			MerchantInfoAddPage.setBasicInfo_RegisteredAddress(bean.getBasicInfo_RegisteredAddress());
		}
		if(!bean.getBasicInfo_OrganizingInstitutionCode().equals("")) {
			MerchantInfoAddPage.setBasicInfo_OrganizingInstitutionCode(bean.getBasicInfo_OrganizingInstitutionCode());
		}
		if(!bean.getBasicInfo_OrganizingInstitutionCodeCertificatePassDate().equals("")) {
			MerchantInfoAddPage.setBasicInfo_OrganizingInstitutionCodeCertificatePassDate(bean.getBasicInfo_OrganizingInstitutionCodeCertificatePassDate());
		}
		if(bean.getBasicInfo_OrganizingInstitutionCodeCertificatePassDate_LongTerm().equals("1")) {
			MerchantInfoAddPage.clickBasicInfo_OrganizingInstitutionCodeCertificatePassDate_LongTerm();
		}
		if(!bean.getBasicInfo_TaxRegistrationCertificateNO().equals("")) {
			MerchantInfoAddPage.setBasicInfo_TaxRegistrationCertificateNO(bean.getBasicInfo_TaxRegistrationCertificateNO());
		}
		if(!bean.getBasicInfo_TaxRegistrationCertificateNOPassDate().equals("")) {
			MerchantInfoAddPage.setBasicInfo_TaxRegistrationCertificateNOPassDate(bean.getBasicInfo_TaxRegistrationCertificateNOPassDate());
		}
		if(bean.getBasicInfo_TaxRegistrationCertificateNOPassDate_LongTerm().equals("1")) {
			MerchantInfoAddPage.clickBasicInfo_TaxRegistrationCertificateNOPassDate_LongTerm();
		}
		if(!bean.getBasicInfo_LegalPersonCertificateType().equals("")) {
			MerchantInfoAddPage.selectBasicInfo_LegalPersonCertificateType(bean.getBasicInfo_LegalPersonCertificateType());
		}
		if(!bean.getBasicInfo_LegalPersonCertificateNO().equals("")) {
			MerchantInfoAddPage.setBasicInfo_LegalPersonCertificateNO(bean.getBasicInfo_LegalPersonCertificateNO());
		}
		if(!bean.getBasicInfo_LegalPersonName().equals("")) {
			MerchantInfoAddPage.setBasicInfo_LegalPersonName(bean.getBasicInfo_LegalPersonName());
		}
		if(!bean.getBasicInfo_LegalPersonCertificatePassDate().equals("")) {
			MerchantInfoAddPage.setBasicInfo_LegalPersonCertificatePassDate(bean.getBasicInfo_LegalPersonCertificatePassDate());
		}
		if(!bean.getBasicInfo_LegalPersonCertificatePassDate_LongTerm().equals("")) {
			MerchantInfoAddPage.clickBasicInfo_LegalPersonCertificatePassDate_LongTerm();
		}


		
		MerchantInfoAddPage.clickBasicInfo_OtherInfoArea();
		wait.waitFor(1000);
		
		if(!bean.getBasicInfo_LinkageRelationship().equals("")) {
			MerchantInfoAddPage.selectBasicInfo_LinkageRelationship(bean.getBasicInfo_LinkageRelationship());
		}
		if(!bean.getBasicInfo_BusinessDistrict().equals("")) {
			MerchantInfoAddPage.selectBasicInfo_BusinessDistrict(bean.getBasicInfo_BusinessDistrict());
		}
		if(!bean.getBasicInfo_BusinessArea().equals("")) {
			MerchantInfoAddPage.selectBasicInfo_BusinessArea(bean.getBasicInfo_BusinessArea());
		}
		if(!bean.getBasicInfo_FestivalBusinessSign().equals("")) {
			MerchantInfoAddPage.selectBasicInfo_FestivalBusinessSign(bean.getBasicInfo_FestivalBusinessSign());
		}
		if(!bean.getBasicInfo_BusinessRange().equals("")) {
			MerchantInfoAddPage.setBasicInfo_BusinessRange(bean.getBasicInfo_BusinessRange());
		}
		if(!bean.getBasicInfo_BusinessDescribe().equals("")) {
			MerchantInfoAddPage.setBasicInfo_BusinessDescribe(bean.getBasicInfo_BusinessDescribe());
		}
		if(!bean.getBasicInfo_NumEmployees().equals("")) {
			MerchantInfoAddPage.setBasicInfo_NumEmployees(bean.getBasicInfo_NumEmployees());
		}
		if(!bean.getBasicInfo_OpenDate().equals("")) {
			MerchantInfoAddPage.setBasicInfo_OpenDate(bean.getBasicInfo_OpenDate());
			MerchantInfoAddPage.doLoseFocus("BasicInfo_OpenDate", 300, 0);
		}
		if(!bean.getBasicInfo_AccessAgency().equals("")) {
			MerchantInfoAddPage.selectBasicInfo_AccessAgency(bean.getBasicInfo_AccessAgency());
		}
		
		
		MerchantInfoAddPage.doLoseFocus("BasicInfo_AccessAgency", 300, 0);
		MerchantInfoAddPage.doPageUp();
		wait.waitFor(500);
		MerchantInfoAddPage.clickSettlementInfo();
		wait.waitFor(1000);
		
		if(!bean.getSettlementInfo_SettlementAccountPublicPrivateSign().equals("")) {
			MerchantInfoAddPage.selectSettlementInfo_SettlementAccountPublicPrivateSign(bean.getSettlementInfo_SettlementAccountPublicPrivateSign());
		}
		if(!bean.getSettlementInfo_MerchantSettlementSign().equals("")) {
			MerchantInfoAddPage.selectSettlementInfo_MerchantSettlementSign(bean.getSettlementInfo_MerchantSettlementSign());
		}
		if(!bean.getSettlementInfo_BankName().equals("")) {
			MerchantInfoAddPage.selectSettlementInfo_BankName(bean.getSettlementInfo_BankName());
		}
		if(!bean.getSettlementInfo_BranchBankBelongProvince().equals("")) {
			MerchantInfoAddPage.selectSettlementInfo_BranchBankBelongProvince(bean.getSettlementInfo_BranchBankBelongProvince());
		}
		if(!bean.getSettlementInfo_BranchBankBelongCity().equals("")) {
			MerchantInfoAddPage.selectSettlementInfo_BranchBankBelongCity(bean.getSettlementInfo_BranchBankBelongCity());
		}
		wait.waitFor(500);
		MerchantInfoAddPage.doLoseFocus("SettlementInfo_BranchBankBelongCity", 300, 0);
		wait.waitFor(500);
		MerchantInfoAddPage.doPageDown();
		
		if(!bean.getSettlementInfo_BranchBankSelect().equals("")) {
			MerchantInfoAddPage.selectSettlementInfo_BranchBankSelect(bean.getSettlementInfo_BranchBankSelect());
		}
		if(!bean.getSettlementInfo_BankAccount().equals("")) {
			MerchantInfoAddPage.setSettlementInfo_BankAccount(bean.getSettlementInfo_BankAccount());
		}
		if(!bean.getSettlementInfo_BankNewAccountName().equals("")) {
			MerchantInfoAddPage.setSettlementInfo_BankNewAccountName(bean.getSettlementInfo_BankNewAccountName());
		}
		if(!bean.getSettlementInfo_SettlementPeriod().equals("")) {
			MerchantInfoAddPage.selectSettlementInfo_SettlementPeriod(bean.getSettlementInfo_SettlementPeriod());
		}
		if(!bean.getSettlementInfo_SettlementTransferMoneyDay().equals("")) {
			MerchantInfoAddPage.setSettlementInfo_SettlementTransferMoneyDay(bean.getSettlementInfo_SettlementTransferMoneyDay());
		}
		if(!bean.getSettlementInfo_NextSettlementDate().equals("")) {
			MerchantInfoAddPage.setSettlementInfo_NextSettlementDate(bean.getSettlementInfo_NextSettlementDate());
			MerchantInfoAddPage.doLoseFocus("SettlementInfo_NextSettlementDate", 300, 0);
		}
		if(!bean.getSettlementInfo_StopSettlementSign().equals("")) {
			MerchantInfoAddPage.selectSettlementInfo_StopSettlementSign(bean.getSettlementInfo_StopSettlementSign());
		}
		if(!bean.getSettlementInfo_EffectiveDateBegin().equals("")&&!bean.getSettlementInfo_EffectiveDateEnd().equals("")) {
			MerchantInfoAddPage.setSettlementInfo_EffectiveDateBegin(bean.getSettlementInfo_EffectiveDateBegin());
			MerchantInfoAddPage.setSettlementInfo_EffectiveDateEnd(bean.getSettlementInfo_EffectiveDateEnd());
			MerchantInfoAddPage.doLoseFocus("SettlementInfo_EffectiveDateEnd", 120, 0);
		}
		if(!bean.getSettlementInfo_InitialMoney().equals("")) {
			MerchantInfoAddPage.setSettlementInfo_InitialMoney(bean.getSettlementInfo_InitialMoney());
		}
		if(!bean.getSettlementInfo_MerchantSettlementType().equals("")) {
			MerchantInfoAddPage.selectSettlementInfo_MerchantSettlementType(bean.getSettlementInfo_MerchantSettlementType());
		}
		if(!bean.getSettlementInfo_MerchantRateType().equals("")) {
			MerchantInfoAddPage.selectSettlementInfo_MerchantRateType(bean.getSettlementInfo_MerchantRateType());
		}
		if(!bean.getSettlementInfo_RefundType().equals("")) {
			MerchantInfoAddPage.selectSettlementInfo_RefundType(bean.getSettlementInfo_RefundType());
		}
		
		MerchantInfoAddPage.doLoseFocus("SettlementInfo_RefundType", 300, 0);
		wait.waitFor(500);
		MerchantInfoAddPage.doPageUp();
		wait.waitFor(500);
		MerchantInfoAddPage.clickRateInfo();
		wait.waitFor(1000);
		
		if(!bean.getRateInfo_FeeType1().equals("")) {
			MerchantInfoAddPage.selectRateInfo_FeeType1(bean.getRateInfo_FeeType1());
		}
		if(!bean.getRateInfo_FeeType1_EffectiveDateBegin().equals("")&&!bean.getRateInfo_FeeType1_EffectiveDateEnd().equals("")) {
			MerchantInfoAddPage.setRateInfo_FeeType1_EffectiveDateBegin(bean.getRateInfo_FeeType1_EffectiveDateBegin());
			MerchantInfoAddPage.setRateInfo_FeeType1_EffectiveDateEnd(bean.getRateInfo_FeeType1_EffectiveDateEnd());
			MerchantInfoAddPage.doLoseFocus("RateInfo_FeeType1_EffectiveDateEnd", 120, 0);
		}
		if(!bean.getRateInfo_CreditCard_RateNameCode().equals("")&&!bean.getRateInfo_CreditCard_SearchRate_RateRadio().equals("")) {
			MerchantInfoAddPage.clickRateInfo_CreditCard_SearchRate();
			doSearchMerchantFeeRate(bean.getRateInfo_CreditCard_RateNameCode(),bean.getRateInfo_CreditCard_SearchRate_RateRadio());
		}
		if(!bean.getRateInfo_DebitCard_RateNameCode().equals("")&&!bean.getRateInfo_DebitCard_SearchRate_RateRadio().equals("")) {
			MerchantInfoAddPage.clickRateInfo_DebitCard_SearchRate();
			doSearchMerchantFeeRate(bean.getRateInfo_DebitCard_RateNameCode(),bean.getRateInfo_DebitCard_SearchRate_RateRadio());
		}
		if(!bean.getRateInfo_OverseasCard_RateNameCode().equals("")&&!bean.getRateInfo_OverseasCard_SearchRate_RateRadio().equals("")) {
			MerchantInfoAddPage.clickRateInfo_OverseasCard_SearchRate();
			doSearchMerchantFeeRate(bean.getRateInfo_OverseasCard_RateNameCode(),bean.getRateInfo_OverseasCard_SearchRate_RateRadio());
		}
		
		MerchantInfoAddPage.doPageDown();
		wait.waitFor(500);
		
		
		if(!bean.getRateInfo_FeeType2().equals("")) {
			MerchantInfoAddPage.selectRateInfo_FeeType2(bean.getRateInfo_FeeType2());
		}
		if(!bean.getRateInfo_FeeType2_EffectiveDateBegin().equals("")&&!bean.getRateInfo_FeeType2_EffectiveDateEnd().equals("")) {
			MerchantInfoAddPage.setRateInfo_FeeType2_EffectiveDateBegin(bean.getRateInfo_FeeType2_EffectiveDateBegin());
			MerchantInfoAddPage.setRateInfo_FeeType2_EffectiveDateEnd(bean.getRateInfo_FeeType2_EffectiveDateEnd());
			MerchantInfoAddPage.doLoseFocus("RateInfo_FeeType2_EffectiveDateEnd", 120, 0);
		}
		if(!bean.getRateInfo_Unionpay_RateNameCode().equals("")&&!bean.getRateInfo_Unionpay_SearchRate_RateRadio().equals("")) {
			MerchantInfoAddPage.clickRateInfo_Unionpay_SearchRate();
			doSearchMerchantFeeRate(bean.getRateInfo_Unionpay_RateNameCode(),bean.getRateInfo_Unionpay_SearchRate_RateRadio());
		}
		if(!bean.getRateInfo_FeeType3().equals("")) {
			MerchantInfoAddPage.selectRateInfo_FeeType3(bean.getRateInfo_FeeType3());
		}
		if(!bean.getRateInfo_FeeType3_EffectiveDateBegin().equals("")&&!bean.getRateInfo_FeeType3_EffectiveDateEnd().equals("")) {
			MerchantInfoAddPage.setRateInfo_FeeType3_EffectiveDateBegin(bean.getRateInfo_FeeType3_EffectiveDateBegin());
			MerchantInfoAddPage.setRateInfo_FeeType3_EffectiveDateEnd(bean.getRateInfo_FeeType3_EffectiveDateEnd());
			MerchantInfoAddPage.doLoseFocus("RateInfo_FeeType3_EffectiveDateEnd", 120, 0);
		}
		if(!bean.getRateInfo_Alipay_RateNameCode().equals("")&&!bean.getRateInfo_Alipay_SearchRate_RateRadio().equals("")) {
			MerchantInfoAddPage.clickRateInfo_Alipay_SearchRate();
			doSearchMerchantFeeRate(bean.getRateInfo_Alipay_RateNameCode(),bean.getRateInfo_Alipay_SearchRate_RateRadio());
		}
		if(!bean.getRateInfo_FeeType4().equals("")) {
			MerchantInfoAddPage.selectRateInfo_FeeType4(bean.getRateInfo_FeeType4());
		}
		if(!bean.getRateInfo_FeeType4_EffectiveDateBegin().equals("")&&!bean.getRateInfo_FeeType4_EffectiveDateEnd().equals("")) {
			MerchantInfoAddPage.setRateInfo_FeeType4_EffectiveDateBegin(bean.getRateInfo_FeeType4_EffectiveDateBegin());
			MerchantInfoAddPage.setRateInfo_FeeType4_EffectiveDateEnd(bean.getRateInfo_FeeType4_EffectiveDateEnd());
			MerchantInfoAddPage.doLoseFocus("RateInfo_FeeType4_EffectiveDateEnd", 120, 0);
		}
		if(!bean.getRateInfo_Wechat_RateNameCode().equals("")&&!bean.getRateInfo_Wechat_SearchRate_RateRadio().equals("")) {
			MerchantInfoAddPage.clickRateInfo_Wechat_SearchRate();
			doSearchMerchantFeeRate(bean.getRateInfo_Wechat_RateNameCode(),bean.getRateInfo_Wechat_SearchRate_RateRadio());
		}
		
		
		MerchantInfoAddPage.doPageUp();
		wait.waitFor(500);
		MerchantInfoAddPage.clickContactInfo();
		wait.waitFor(1000);
		
		if(!bean.getContactInfo_ContactType().equals("")) {
			MerchantInfoAddPage.selectContactInfo_ContactType(bean.getContactInfo_ContactType());
		}
		if(!bean.getContactInfo_ContactName().equals("")) {
			MerchantInfoAddPage.setContactInfo_ContactName(bean.getContactInfo_ContactName());
		}
		if(!bean.getContactInfo_MobilePhoneNO().equals("")) {
			MerchantInfoAddPage.setContactInfo_MobilePhoneNO(bean.getContactInfo_MobilePhoneNO());
		}
		if(!bean.getContactInfo_TelephoneNO().equals("")) {
			MerchantInfoAddPage.setContactInfo_TelephoneNO(bean.getContactInfo_TelephoneNO());
		}
		if(!bean.getContactInfo_Email().equals("")) {
			MerchantInfoAddPage.setContactInfo_Email(bean.getContactInfo_Email());
		}
		if(!bean.getContactInfo_QQ().equals("")) {
			MerchantInfoAddPage.setContactInfo_QQ(bean.getContactInfo_QQ());
		}
		
		MerchantInfoAddPage.clickAggreementInfo();
		wait.waitFor(1000);
		
		if(!bean.getAggreementInfo_MerchantSource().equals("")) {
			MerchantInfoAddPage.selectAggreementInfo_MerchantSource(bean.getAggreementInfo_MerchantSource());
		}
		if(!bean.getAggreementInfo_CustomerManagementNO().equals("")) {
			MerchantInfoAddPage.setAggreementInfo_CustomerManagementNO(bean.getAggreementInfo_CustomerManagementNO());
		}
		if(!bean.getAggreementInfo_AggreementTips().equals("")) {
			MerchantInfoAddPage.setAggreementInfo_AggreementTips(bean.getAggreementInfo_AggreementTips());
		}
		if(!bean.getAggreementInfo_AggreementPassDate().equals("")) {
			MerchantInfoAddPage.setAggreementInfo_AggreementPassDate(bean.getAggreementInfo_AggreementPassDate());
		}
		
		
		MerchantInfoAddPage.clickSignedInvoiceInfo();
		wait.waitFor(1000);
		
		if(!bean.getSignedInvoiceInfo_InvoiceWay().equals("")
				&&!bean.getSignedInvoiceInfo_InvoiceTitle().equals("")&&!bean.getSignedInvoiceInfo_InvoiceMailAddress().equals("")
				&&!bean.getSignedInvoiceInfo_PostalCode().equals("")) {
			MerchantInfoAddPage.clickSignedInvoiceInfo_InvoiceSign();
			wait.waitFor(1000);
			MerchantInfoAddPage.selectSignedInvoiceInfo_InvoiceWay(bean.getSignedInvoiceInfo_InvoiceWay());
			MerchantInfoAddPage.setSignedInvoiceInfo_InvoiceTitle(bean.getSignedInvoiceInfo_InvoiceTitle());
			MerchantInfoAddPage.setSignedInvoiceInfo_InvoiceMailAddress(bean.getSignedInvoiceInfo_InvoiceMailAddress());
			MerchantInfoAddPage.setSignedInvoiceInfo_PostalCode(bean.getSignedInvoiceInfo_PostalCode());
		}
		
		
		MerchantInfoAddPage.clickReconciliationInfo();
		wait.waitFor(1000);
		
		if(!bean.getReconciliationInfo_EmailAddress().equals("")) {
			MerchantInfoAddPage.clickReconciliationInfo_MailSendBill();
			MerchantInfoAddPage.setReconciliationInfo_EmailAddress(bean.getReconciliationInfo_EmailAddress());
		}
		
		
		MerchantInfoAddPage.clickAddtionInfo();
		wait.waitFor(1000);
		
		if(!bean.getAddtionInfo_MerchantManagementName().equals("")) {
			MerchantInfoAddPage.setAddtionInfo_MerchantManagementName(bean.getAddtionInfo_MerchantManagementName());
		}
		if(!bean.getAddtionInfo_MerchantManagementPhoneNO().equals("")) {
			MerchantInfoAddPage.setAddtionInfo_MerchantManagementPhoneNO(bean.getAddtionInfo_MerchantManagementPhoneNO());
		}
		if(!bean.getAddtionInfo_MerchantManagementEmail().equals("")) {
			MerchantInfoAddPage.setAddtionInfo_MerchantManagementEmail(bean.getAddtionInfo_MerchantManagementEmail());
		}
		if(!bean.getAddtionInfo_MerchantPortType().equals("")) {
			MerchantInfoAddPage.selectAddtionInfo_MerchantPortType(bean.getAddtionInfo_MerchantPortType());
		}
		
		
		MerchantInfoAddPage.clickAttachmentUploading();
		wait.waitFor(1000);
		
		if(!bean.getAttachmentUploading_Uploading().equals("")) {
			MerchantInfoAddPage.setAttachmentUploading_AttachmentSelect(bean.getAttachmentUploading_Uploading());
			wait.waitFor(1000);
			MerchantInfoAddPage.clickAttachmentUploading_Uploading();
		}
		wait.waitFor(1000);
		MerchantInfoAddPage.clickEnterConfirm();
		System.out.println(MerchantInfoAddPage.getNotice());
		Reporter.log(MerchantInfoAddPage.getNotice());
		
	}
	
	void doSearchMerchantFeeRate(String rateNameCode,String radio) {
		MerchantInfoAddPage.setRateInfo_SearchRate_RateNameCode(rateNameCode);
		MerchantInfoAddPage.clickRateInfo_SearchRate_Search();
		MerchantInfoAddPage.clickRateInfo_SearchRate_RateRadio(radio);
		wait.waitFor(2000);
		MerchantInfoAddPage.clickRateInfo_SearchRate_Submit();
	}
	
	
	
	
	void RequiredFieldValidation(MerchantInfoManagement_MerchantInfoAddBean bean) {
//		必输项检查并提醒
		if(bean.getBasicInfo_MerchantPhoneNO().equals("")) {
			System.out.println("商户手机号字段为必输项，不能为空");
			Reporter.log("商户手机号字段为必输项，不能为空");
		}
		if(bean.getBasicInfo_MerchantName().equals("")) {
			System.out.println("商户名称字段为必输项，不能为空");
			Reporter.log("商户名称字段为必输项，不能为空");
		}
		if(bean.getBasicInfo_MerchantAbbreviation().equals("")) {
			System.out.println("商户简称字段为必输项，不能为空");
			Reporter.log("商户简称字段为必输项，不能为空");
		}
		if(bean.getBasicInfo_MerchantPhone().equals("")) {
			System.out.println("商户电话字段为必输项，不能为空");
			Reporter.log("商户电话字段为必输项，不能为空");
		}		
		if(bean.getBasicInfo_MCC().equals("")) {
			System.out.println("MCC码字段为必输项，不能为空");
			Reporter.log("MCC码字段为必输项，不能为空");
		}
		if(bean.getBasicInfo_InnerMerchantType().equals("")) {
			System.out.println("内部商户类型字段为必输项，不能为空");
			Reporter.log("内部商户类型字段为必输项，不能为空");
		}
		if(bean.getBasicInfo_BelongProvince().equals("")) {
			System.out.println("归属省字段为必输项，不能为空");
			Reporter.log("归属省字段为必输项，不能为空");
		}
		if(bean.getBasicInfo_BelongCity().equals("")) {
			System.out.println("归属市字段为必输项，不能为空");
			Reporter.log("归属市字段为必输项，不能为空");
		}
		if(bean.getBasicInfo_BusinessAddress().equals("")) {
			System.out.println("营业地址字段为必输项，不能为空");
			Reporter.log("营业地址字段为必输项，不能为空");
		}
		if(bean.getBasicInfo_BusinessLicenseNO().equals("")) {
			System.out.println("营业执照号字段为必输项，不能为空");
			Reporter.log("营业执照号字段为必输项，不能为空");
		}
		if(bean.getBasicInfo_BusinessLicensePassDate().equals("")
				&&bean.getBasicInfo_BusinessLicensePassDate_LongTerm().equals("")) {
			System.out.println("营业执照过期日期字段为必输项，不能为空");
			Reporter.log("营业执照过期日期字段为必输项，不能为空");
		}
		if(bean.getBasicInfo_RegisteredCapital().equals("")) {
			System.out.println("注册资本字段为必输项，不能为空");
			Reporter.log("注册资本字段为必输项，不能为空");
		}		
		if(bean.getBasicInfo_RegisteredAddress().equals("")) {
			System.out.println("注册地址字段为必输项，不能为空");
			Reporter.log("注册地址字段为必输项，不能为空");
		}
		if(bean.getBasicInfo_LegalPersonCertificateNO().equals("")) {
			System.out.println("法人证件号码字段为必输项，不能为空");
			Reporter.log("法人证件号码字段为必输项，不能为空");
		}
		if(bean.getBasicInfo_LegalPersonName().equals("")) {
			System.out.println("法人姓名字段为必输项，不能为空");
			Reporter.log("法人姓名字段为必输项，不能为空");
		}
		if(bean.getBasicInfo_LegalPersonCertificatePassDate().equals("")
				&&bean.getBasicInfo_LegalPersonCertificatePassDate_LongTerm().equals("")) {
			System.out.println("法人证件过期日期字段为必输项，不能为空");
			Reporter.log("法人证件过期日期字段为必输项，不能为空");
		}
		if(bean.getBasicInfo_BusinessRange().equals("")) {
			System.out.println("经营范围字段为必输项，不能为空");
			Reporter.log("经营范围字段为必输项，不能为空");
		}
		if(bean.getBasicInfo_OpenDate().equals("")) {
			System.out.println("开业日期字段为必输项，不能为空");
			Reporter.log("开业日期字段为必输项，不能为空");
		}
		if(bean.getSettlementInfo_BranchBankBelongProvince().equals("")
				||bean.getSettlementInfo_BranchBankBelongCity().equals("")) {
			System.out.println("支行归属省市字段为必输项，不能为空");
			Reporter.log("支行归属省市字段为必输项，不能为空");
		}
		if(bean.getSettlementInfo_BankAccount().equals("")) {
			System.out.println("银行帐号字段为必输项，不能为空");
			Reporter.log("银行帐号字段为必输项，不能为空");
		}		
		if(bean.getSettlementInfo_BankNewAccountName().equals("")) {
			System.out.println("银行开户名称字段为必输项，不能为空");
			Reporter.log("银行开户名称字段为必输项，不能为空");
		}
		if(bean.getSettlementInfo_SettlementTransferMoneyDay().equals("")) {
			System.out.println("结算划款天数类型字段为必输项，不能为空");
			Reporter.log("结算划款天数类型字段为必输项，不能为空");
		}
		if(bean.getSettlementInfo_NextSettlementDate().equals("")) {
			System.out.println("下一个结算日期字段为必输项，不能为空");
			Reporter.log("下一个结算日期字段为必输项，不能为空");
		}
		if(bean.getSettlementInfo_EffectiveDateBegin().equals("")
				||bean.getSettlementInfo_EffectiveDateEnd().equals("")) {
			System.out.println("有效日期字段为必输项，不能为空");
			Reporter.log("有效日期字段为必输项，不能为空");
		}
		if(bean.getSettlementInfo_InitialMoney().equals("")) {
			System.out.println("起始金额字段为必输项，不能为空");
			Reporter.log("起始金额字段为必输项，不能为空");
		}
		if(bean.getRateInfo_FeeType1_EffectiveDateBegin().equals("")
				||bean.getRateInfo_FeeType1_EffectiveDateEnd().equals("")) {
			System.out.println("银行收单-费率有效日期字段为必输项，不能为空");
			Reporter.log("银行收单-费率有效日期字段为必输项，不能为空");
		}
		if(bean.getRateInfo_CreditCard_RateNameCode().equals("")
				||bean.getRateInfo_CreditCard_SearchRate_RateRadio().equals("")) {
			System.out.println("贷记卡费率内容为必输项，不能为空");
			Reporter.log("贷记卡费率内容为必输项，不能为空");
		}		
		if(bean.getRateInfo_DebitCard_RateNameCode().equals("")
				||bean.getRateInfo_DebitCard_SearchRate_RateRadio().equals("")) {
			System.out.println("借记卡费率内容为必输项，不能为空");
			Reporter.log("借记卡费率内容为必输项，不能为空");
		}
		if(bean.getRateInfo_OverseasCard_RateNameCode().equals("")
				||bean.getRateInfo_OverseasCard_SearchRate_RateRadio().equals("")) {
			System.out.println("境外卡费率内容为必输项，不能为空");
			Reporter.log("境外卡费率内容为必输项，不能为空");
		}
		if(bean.getRateInfo_FeeType2_EffectiveDateBegin().equals("")
				||bean.getRateInfo_FeeType2_EffectiveDateEnd().equals("")) {
			System.out.println("银行二维码-费率有效日期字段为必输项，不能为空");
			Reporter.log("银行二维码-费率有效日期字段为必输项，不能为空");
		}
		if(bean.getRateInfo_Unionpay_RateNameCode().equals("")
				||bean.getRateInfo_Unionpay_SearchRate_RateRadio().equals("")) {
			System.out.println("银联二维码费率内容为必输项，不能为空");
			Reporter.log("银联二维码费率内容为必输项，不能为空");
		}
		if(bean.getRateInfo_FeeType3_EffectiveDateBegin().equals("")
				||bean.getRateInfo_FeeType3_EffectiveDateEnd().equals("")) {
			System.out.println("支付宝-费率有效日期字段为必输项，不能为空");
			Reporter.log("支付宝-费率有效日期字段为必输项，不能为空");
		}
		if(bean.getRateInfo_Alipay_RateNameCode().equals("")
				||bean.getRateInfo_Alipay_SearchRate_RateRadio().equals("")) {
			System.out.println("支付宝费率内容为必输项，不能为空");
			Reporter.log("支付宝费率内容为必输项，不能为空");
		}
		if(bean.getRateInfo_FeeType4_EffectiveDateBegin().equals("")
				||bean.getRateInfo_FeeType4_EffectiveDateEnd().equals("")) {
			System.out.println("微信-费率有效日期字段为必输项，不能为空");
			Reporter.log("微信-费率有效日期字段为必输项，不能为空");
		}		
		if(bean.getRateInfo_Wechat_RateNameCode().equals("")
				||bean.getRateInfo_Wechat_SearchRate_RateRadio().equals("")) {
			System.out.println("微信费率内容为必输项，不能为空");
			Reporter.log("微信费率内容为必输项，不能为空");
		}
		if(bean.getAggreementInfo_CustomerManagementNO().equals("")){
			System.out.println("客户经理编号字段为必输项，不能为空");
			Reporter.log("客户经理编号字段为必输项，不能为空");
		}
		if(bean.getAggreementInfo_AggreementPassDate().equals("")) {
			System.out.println("协议到期日字段为必输项，不能为空");
			Reporter.log("协议到期日字段为必输项，不能为空");
		}
		if(bean.getAddtionInfo_MerchantManagementName().equals("")){
			System.out.println("商户管理员姓名字段为必输项，不能为空");
			Reporter.log("商户管理员姓名字段为必输项，不能为空");
		}
		if(bean.getAddtionInfo_MerchantManagementPhoneNO().equals("")){
			System.out.println("商户管理员手机号字段为必输项，不能为空");
			Reporter.log("商户管理员手机号字段为必输项，不能为空");
		}
		if(bean.getAddtionInfo_MerchantManagementEmail().equals("")){
			System.out.println("商户管理员Email字段为必输项，不能为空");
			Reporter.log("商户管理员Email字段为必输项，不能为空");
		}
		if(bean.getAttachmentUploading_Uploading().equals("")){
			System.out.println("附件为必输项，不能为空");
			Reporter.log("附件为必输项，不能为空");
		}
		
	}
	
	
	
	
//	public void doQueryForClickButton(MerchantInfoManagement_MerchantInfoAddBean bean) {
//
//		MerchantInfoAddPage.clickQuery();
//		wait.waitFor(500);
//		MerchantInfoAddPage.clickRadio(bean.getRadio());
//		wait.waitFor(500);
//	}
}