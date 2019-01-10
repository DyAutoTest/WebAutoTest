package com.dy.AutoTest.AcquiringOperationPlatform.POJO;

import java.io.Serializable;

public class MerchantInfoManagement_MerchantInfoAddBean implements Serializable{
	private static final long serialVersionUID = 1L;

	private int ID;
	private String CaseNO;
	private String BasicInfo_MerchantType;
	private String BasicInfo_MerchantPhoneNO;
	private String BasicInfo_MerchantName;
	private String BasicInfo_MerchantAbbreviation;
	private String BasicInfo_MerchantSpellingAbbreviation;
	private String BasicInfo_MerchantPhone;
	private String BasicInfo_MCC;
	private String BasicInfo_InnerMerchantType;
	private String BasicInfo_InnerMerchantTypeLv2;
	private String BasicInfo_BelongProvince;
	private String BasicInfo_BelongCity;
	private String BasicInfo_BusinessAddress;
	private String BasicInfo_MerchantCharacter;
	private String BasicInfo_BusinessLicenseNO;
	private String BasicInfo_BusinessLicensePassDate;
	private String BasicInfo_BusinessLicensePassDate_LongTerm;
	private String BasicInfo_RegisteredCapital;
	private String BasicInfo_RegisteredAddress;
	private String BasicInfo_OrganizingInstitutionCode;
	private String BasicInfo_OrganizingInstitutionCodeCertificatePassDate;
	private String BasicInfo_OrganizingInstitutionCodeCertificatePassDate_LongTerm;
	private String BasicInfo_TaxRegistrationCertificateNO;
	private String BasicInfo_TaxRegistrationCertificateNOPassDate;
	private String BasicInfo_TaxRegistrationCertificateNOPassDate_LongTerm;
	private String BasicInfo_LegalPersonCertificateType;
	private String BasicInfo_LegalPersonCertificateNO;
	private String BasicInfo_LegalPersonName;
	private String BasicInfo_LegalPersonCertificatePassDate;
	private String BasicInfo_LegalPersonCertificatePassDate_LongTerm;
	private String BasicInfo_LinkageRelationship;
	private String BasicInfo_BusinessDistrict;
	private String BasicInfo_BusinessArea;
	private String BasicInfo_FestivalBusinessSign;
	private String BasicInfo_BusinessRange;
	private String BasicInfo_BusinessDescribe;
	private String BasicInfo_NumEmployees;
	private String BasicInfo_OpenDate;
	private String BasicInfo_AccessAgency;
	private String SettlementInfo_SettlementAccountPublicPrivateSign;
	private String SettlementInfo_MerchantSettlementSign;
	private String SettlementInfo_BankName;
	private String SettlementInfo_BranchBankBelongProvince;
	private String SettlementInfo_BranchBankBelongCity;
	private String SettlementInfo_BranchBankInfo;
	private String SettlementInfo_BranchBankSelect;
	private String SettlementInfo_CNAPSNO;
	private String SettlementInfo_SettlementBankName;
	private String SettlementInfo_BankAccount;
	private String SettlementInfo_BankNewAccountName;
	private String SettlementInfo_SettlementPeriod;
	private String SettlementInfo_SettlementTransferMoneyDay;
	private String SettlementInfo_NextSettlementDate;
	private String SettlementInfo_StopSettlementSign;
	private String SettlementInfo_EffectiveDateBegin;
	private String SettlementInfo_EffectiveDateEnd;
	private String SettlementInfo_InitialMoney;
	private String SettlementInfo_MerchantSettlementType;
	private String SettlementInfo_MerchantRateType;
	private String SettlementInfo_RefundType;
	private String RateInfo_FeeType1;
	private String RateInfo_FeeType1_EffectiveDateBegin;
	private String RateInfo_FeeType1_EffectiveDateEnd;
	private String RateInfo_CreditCard_RateNameCode;
	private String RateInfo_CreditCard_SearchRate_RateRadio;
	private String RateInfo_DebitCard_RateNameCode;
	private String RateInfo_DebitCard_SearchRate_RateRadio;
	private String RateInfo_OverseasCard_RateNameCode;
	private String RateInfo_OverseasCard_SearchRate_RateRadio;
	private String RateInfo_FeeType2;
	private String RateInfo_FeeType2_EffectiveDateBegin;
	private String RateInfo_FeeType2_EffectiveDateEnd;
	private String RateInfo_Unionpay_RateNameCode;
	private String RateInfo_Unionpay_SearchRate_RateRadio;
	private String RateInfo_FeeType3;
	private String RateInfo_FeeType3_EffectiveDateBegin;
	private String RateInfo_FeeType3_EffectiveDateEnd;
	private String RateInfo_Alipay_RateNameCode;
	private String RateInfo_Alipay_SearchRate_RateRadio;
	private String RateInfo_FeeType4;
	private String RateInfo_FeeType4_EffectiveDateBegin;
	private String RateInfo_FeeType4_EffectiveDateEnd;
	private String RateInfo_Wechat_RateNameCode;
	private String RateInfo_Wechat_SearchRate_RateRadio;
	private String ContactInfo_ContactType;
	private String ContactInfo_ContactName;
	private String ContactInfo_MobilePhoneNO;
	private String ContactInfo_TelephoneNO;
	private String ContactInfo_Email;
	private String ContactInfo_QQ;
	private String AggreementInfo_MerchantSource;
	private String AggreementInfo_CustomerManagementNO;
	private String AggreementInfo_AggreementTips;
	private String AggreementInfo_AggreementPassDate;
	private String SignedInvoiceInfo_InvoiceWay;
	private String SignedInvoiceInfo_InvoiceTitle;
	private String SignedInvoiceInfo_InvoiceMailAddress;
	private String SignedInvoiceInfo_PostalCode;
	private String ReconciliationInfo_MailSendBill;
	private String ReconciliationInfo_EmailAddress;
	private String AddtionInfo_MerchantManagementName;
	private String AddtionInfo_MerchantManagementPhoneNO;
	private String AddtionInfo_MerchantManagementEmail;
	private String AddtionInfo_MerchantPortType;
	private String AttachmentUploading_Uploading;
	public int getID() {
		return ID;
	}
	public void setID(int ID) {
		this.ID = ID;
	}
	public String getCaseNO() {
		return CaseNO;
	}
	public void setCaseNO(String CaseNO) {
		this.CaseNO = CaseNO;
	}
	public String getBasicInfo_MerchantType() {
		return BasicInfo_MerchantType;
	}
	public void setBasicInfo_MerchantType(String BasicInfo_MerchantType) {
		this.BasicInfo_MerchantType = BasicInfo_MerchantType;
	}
	public String getBasicInfo_MerchantPhoneNO() {
		return BasicInfo_MerchantPhoneNO;
	}
	public void setBasicInfo_MerchantPhoneNO(String BasicInfo_MerchantPhoneNO) {
		this.BasicInfo_MerchantPhoneNO = BasicInfo_MerchantPhoneNO;
	}
	public String getBasicInfo_MerchantName() {
		return BasicInfo_MerchantName;
	}
	public void setBasicInfo_MerchantName(String BasicInfo_MerchantName) {
		this.BasicInfo_MerchantName = BasicInfo_MerchantName;
	}
	public String getBasicInfo_MerchantAbbreviation() {
		return BasicInfo_MerchantAbbreviation;
	}
	public void setBasicInfo_MerchantAbbreviation(String BasicInfo_MerchantAbbreviation) {
		this.BasicInfo_MerchantAbbreviation = BasicInfo_MerchantAbbreviation;
	}
	public String getBasicInfo_MerchantSpellingAbbreviation() {
		return BasicInfo_MerchantSpellingAbbreviation;
	}
	public void setBasicInfo_MerchantSpellingAbbreviation(String BasicInfo_MerchantSpellingAbbreviation) {
		this.BasicInfo_MerchantSpellingAbbreviation = BasicInfo_MerchantSpellingAbbreviation;
	}
	public String getBasicInfo_MerchantPhone() {
		return BasicInfo_MerchantPhone;
	}
	public void setBasicInfo_MerchantPhone(String BasicInfo_MerchantPhone) {
		this.BasicInfo_MerchantPhone = BasicInfo_MerchantPhone;
	}
	public String getBasicInfo_MCC() {
		return BasicInfo_MCC;
	}
	public void setBasicInfo_MCC(String BasicInfo_MCC) {
		this.BasicInfo_MCC = BasicInfo_MCC;
	}
	public String getBasicInfo_InnerMerchantType() {
		return BasicInfo_InnerMerchantType;
	}
	public void setBasicInfo_InnerMerchantType(String BasicInfo_InnerMerchantType) {
		this.BasicInfo_InnerMerchantType = BasicInfo_InnerMerchantType;
	}
	public String getBasicInfo_InnerMerchantTypeLv2() {
		return BasicInfo_InnerMerchantTypeLv2;
	}
	public void setBasicInfo_InnerMerchantTypeLv2(String BasicInfo_InnerMerchantTypeLv2) {
		this.BasicInfo_InnerMerchantTypeLv2 = BasicInfo_InnerMerchantTypeLv2;
	}
	public String getBasicInfo_BelongProvince() {
		return BasicInfo_BelongProvince;
	}
	public void setBasicInfo_BelongProvince(String BasicInfo_BelongProvince) {
		this.BasicInfo_BelongProvince = BasicInfo_BelongProvince;
	}
	public String getBasicInfo_BelongCity() {
		return BasicInfo_BelongCity;
	}
	public void setBasicInfo_BelongCity(String BasicInfo_BelongCity) {
		this.BasicInfo_BelongCity = BasicInfo_BelongCity;
	}
	public String getBasicInfo_BusinessAddress() {
		return BasicInfo_BusinessAddress;
	}
	public void setBasicInfo_BusinessAddress(String BasicInfo_BusinessAddress) {
		this.BasicInfo_BusinessAddress = BasicInfo_BusinessAddress;
	}
	public String getBasicInfo_MerchantCharacter() {
		return BasicInfo_MerchantCharacter;
	}
	public void setBasicInfo_MerchantCharacter(String BasicInfo_MerchantCharacter) {
		this.BasicInfo_MerchantCharacter = BasicInfo_MerchantCharacter;
	}
	public String getBasicInfo_BusinessLicenseNO() {
		return BasicInfo_BusinessLicenseNO;
	}
	public void setBasicInfo_BusinessLicenseNO(String BasicInfo_BusinessLicenseNO) {
		this.BasicInfo_BusinessLicenseNO = BasicInfo_BusinessLicenseNO;
	}
	public String getBasicInfo_BusinessLicensePassDate() {
		return BasicInfo_BusinessLicensePassDate;
	}
	public void setBasicInfo_BusinessLicensePassDate(String BasicInfo_BusinessLicensePassDate) {
		this.BasicInfo_BusinessLicensePassDate = BasicInfo_BusinessLicensePassDate;
	}
	public String getBasicInfo_BusinessLicensePassDate_LongTerm() {
		return BasicInfo_BusinessLicensePassDate_LongTerm;
	}
	public void setBasicInfo_BusinessLicensePassDate_LongTerm(String BasicInfo_BusinessLicensePassDate_LongTerm) {
		this.BasicInfo_BusinessLicensePassDate_LongTerm = BasicInfo_BusinessLicensePassDate_LongTerm;
	}
	public String getBasicInfo_RegisteredCapital() {
		return BasicInfo_RegisteredCapital;
	}
	public void setBasicInfo_RegisteredCapital(String BasicInfo_RegisteredCapital) {
		this.BasicInfo_RegisteredCapital = BasicInfo_RegisteredCapital;
	}
	public String getBasicInfo_RegisteredAddress() {
		return BasicInfo_RegisteredAddress;
	}
	public void setBasicInfo_RegisteredAddress(String BasicInfo_RegisteredAddress) {
		this.BasicInfo_RegisteredAddress = BasicInfo_RegisteredAddress;
	}
	public String getBasicInfo_OrganizingInstitutionCode() {
		return BasicInfo_OrganizingInstitutionCode;
	}
	public void setBasicInfo_OrganizingInstitutionCode(String BasicInfo_OrganizingInstitutionCode) {
		this.BasicInfo_OrganizingInstitutionCode = BasicInfo_OrganizingInstitutionCode;
	}
	public String getBasicInfo_OrganizingInstitutionCodeCertificatePassDate() {
		return BasicInfo_OrganizingInstitutionCodeCertificatePassDate;
	}
	public void setBasicInfo_OrganizingInstitutionCodeCertificatePassDate(String BasicInfo_OrganizingInstitutionCodeCertificatePassDate) {
		this.BasicInfo_OrganizingInstitutionCodeCertificatePassDate = BasicInfo_OrganizingInstitutionCodeCertificatePassDate;
	}
	public String getBasicInfo_OrganizingInstitutionCodeCertificatePassDate_LongTerm() {
		return BasicInfo_OrganizingInstitutionCodeCertificatePassDate_LongTerm;
	}
	public void setBasicInfo_OrganizingInstitutionCodeCertificatePassDate_LongTerm(String BasicInfo_OrganizingInstitutionCodeCertificatePassDate_LongTerm) {
		this.BasicInfo_OrganizingInstitutionCodeCertificatePassDate_LongTerm = BasicInfo_OrganizingInstitutionCodeCertificatePassDate_LongTerm;
	}
	public String getBasicInfo_TaxRegistrationCertificateNO() {
		return BasicInfo_TaxRegistrationCertificateNO;
	}
	public void setBasicInfo_TaxRegistrationCertificateNO(String BasicInfo_TaxRegistrationCertificateNO) {
		this.BasicInfo_TaxRegistrationCertificateNO = BasicInfo_TaxRegistrationCertificateNO;
	}
	public String getBasicInfo_TaxRegistrationCertificateNOPassDate() {
		return BasicInfo_TaxRegistrationCertificateNOPassDate;
	}
	public void setBasicInfo_TaxRegistrationCertificateNOPassDate(String BasicInfo_TaxRegistrationCertificateNOPassDate) {
		this.BasicInfo_TaxRegistrationCertificateNOPassDate = BasicInfo_TaxRegistrationCertificateNOPassDate;
	}
	public String getBasicInfo_TaxRegistrationCertificateNOPassDate_LongTerm() {
		return BasicInfo_TaxRegistrationCertificateNOPassDate_LongTerm;
	}
	public void setBasicInfo_TaxRegistrationCertificateNOPassDate_LongTerm(String BasicInfo_TaxRegistrationCertificateNOPassDate_LongTerm) {
		this.BasicInfo_TaxRegistrationCertificateNOPassDate_LongTerm = BasicInfo_TaxRegistrationCertificateNOPassDate_LongTerm;
	}
	public String getBasicInfo_LegalPersonCertificateType() {
		return BasicInfo_LegalPersonCertificateType;
	}
	public void setBasicInfo_LegalPersonCertificateType(String BasicInfo_LegalPersonCertificateType) {
		this.BasicInfo_LegalPersonCertificateType = BasicInfo_LegalPersonCertificateType;
	}
	public String getBasicInfo_LegalPersonCertificateNO() {
		return BasicInfo_LegalPersonCertificateNO;
	}
	public void setBasicInfo_LegalPersonCertificateNO(String BasicInfo_LegalPersonCertificateNO) {
		this.BasicInfo_LegalPersonCertificateNO = BasicInfo_LegalPersonCertificateNO;
	}
	public String getBasicInfo_LegalPersonName() {
		return BasicInfo_LegalPersonName;
	}
	public void setBasicInfo_LegalPersonName(String BasicInfo_LegalPersonName) {
		this.BasicInfo_LegalPersonName = BasicInfo_LegalPersonName;
	}
	public String getBasicInfo_LegalPersonCertificatePassDate() {
		return BasicInfo_LegalPersonCertificatePassDate;
	}
	public void setBasicInfo_LegalPersonCertificatePassDate(String BasicInfo_LegalPersonCertificatePassDate) {
		this.BasicInfo_LegalPersonCertificatePassDate = BasicInfo_LegalPersonCertificatePassDate;
	}
	public String getBasicInfo_LegalPersonCertificatePassDate_LongTerm() {
		return BasicInfo_LegalPersonCertificatePassDate_LongTerm;
	}
	public void setBasicInfo_LegalPersonCertificatePassDate_LongTerm(String BasicInfo_LegalPersonCertificatePassDate_LongTerm) {
		this.BasicInfo_LegalPersonCertificatePassDate_LongTerm = BasicInfo_LegalPersonCertificatePassDate_LongTerm;
	}
	public String getBasicInfo_LinkageRelationship() {
		return BasicInfo_LinkageRelationship;
	}
	public void setBasicInfo_LinkageRelationship(String BasicInfo_LinkageRelationship) {
		this.BasicInfo_LinkageRelationship = BasicInfo_LinkageRelationship;
	}
	public String getBasicInfo_BusinessDistrict() {
		return BasicInfo_BusinessDistrict;
	}
	public void setBasicInfo_BusinessDistrict(String BasicInfo_BusinessDistrict) {
		this.BasicInfo_BusinessDistrict = BasicInfo_BusinessDistrict;
	}
	public String getBasicInfo_BusinessArea() {
		return BasicInfo_BusinessArea;
	}
	public void setBasicInfo_BusinessArea(String BasicInfo_BusinessArea) {
		this.BasicInfo_BusinessArea = BasicInfo_BusinessArea;
	}
	public String getBasicInfo_FestivalBusinessSign() {
		return BasicInfo_FestivalBusinessSign;
	}
	public void setBasicInfo_FestivalBusinessSign(String BasicInfo_FestivalBusinessSign) {
		this.BasicInfo_FestivalBusinessSign = BasicInfo_FestivalBusinessSign;
	}
	public String getBasicInfo_BusinessRange() {
		return BasicInfo_BusinessRange;
	}
	public void setBasicInfo_BusinessRange(String BasicInfo_BusinessRange) {
		this.BasicInfo_BusinessRange = BasicInfo_BusinessRange;
	}
	public String getBasicInfo_BusinessDescribe() {
		return BasicInfo_BusinessDescribe;
	}
	public void setBasicInfo_BusinessDescribe(String BasicInfo_BusinessDescribe) {
		this.BasicInfo_BusinessDescribe = BasicInfo_BusinessDescribe;
	}
	public String getBasicInfo_NumEmployees() {
		return BasicInfo_NumEmployees;
	}
	public void setBasicInfo_NumEmployees(String BasicInfo_NumEmployees) {
		this.BasicInfo_NumEmployees = BasicInfo_NumEmployees;
	}
	public String getBasicInfo_OpenDate() {
		return BasicInfo_OpenDate;
	}
	public void setBasicInfo_OpenDate(String BasicInfo_OpenDate) {
		this.BasicInfo_OpenDate = BasicInfo_OpenDate;
	}
	public String getBasicInfo_AccessAgency() {
		return BasicInfo_AccessAgency;
	}
	public void setBasicInfo_AccessAgency(String BasicInfo_AccessAgency) {
		this.BasicInfo_AccessAgency = BasicInfo_AccessAgency;
	}
	public String getSettlementInfo_SettlementAccountPublicPrivateSign() {
		return SettlementInfo_SettlementAccountPublicPrivateSign;
	}
	public void setSettlementInfo_SettlementAccountPublicPrivateSign(String SettlementInfo_SettlementAccountPublicPrivateSign) {
		this.SettlementInfo_SettlementAccountPublicPrivateSign = SettlementInfo_SettlementAccountPublicPrivateSign;
	}
	public String getSettlementInfo_MerchantSettlementSign() {
		return SettlementInfo_MerchantSettlementSign;
	}
	public void setSettlementInfo_MerchantSettlementSign(String SettlementInfo_MerchantSettlementSign) {
		this.SettlementInfo_MerchantSettlementSign = SettlementInfo_MerchantSettlementSign;
	}
	public String getSettlementInfo_BankName() {
		return SettlementInfo_BankName;
	}
	public void setSettlementInfo_BankName(String SettlementInfo_BankName) {
		this.SettlementInfo_BankName = SettlementInfo_BankName;
	}
	public String getSettlementInfo_BranchBankBelongProvince() {
		return SettlementInfo_BranchBankBelongProvince;
	}
	public void setSettlementInfo_BranchBankBelongProvince(String SettlementInfo_BranchBankBelongProvince) {
		this.SettlementInfo_BranchBankBelongProvince = SettlementInfo_BranchBankBelongProvince;
	}
	public String getSettlementInfo_BranchBankBelongCity() {
		return SettlementInfo_BranchBankBelongCity;
	}
	public void setSettlementInfo_BranchBankBelongCity(String SettlementInfo_BranchBankBelongCity) {
		this.SettlementInfo_BranchBankBelongCity = SettlementInfo_BranchBankBelongCity;
	}
	public String getSettlementInfo_BranchBankInfo() {
		return SettlementInfo_BranchBankInfo;
	}
	public void setSettlementInfo_BranchBankInfo(String SettlementInfo_BranchBankInfo) {
		this.SettlementInfo_BranchBankInfo = SettlementInfo_BranchBankInfo;
	}
	public String getSettlementInfo_BranchBankSelect() {
		return SettlementInfo_BranchBankSelect;
	}
	public void setSettlementInfo_BranchBankSelect(String SettlementInfo_BranchBankSelect) {
		this.SettlementInfo_BranchBankSelect = SettlementInfo_BranchBankSelect;
	}
	public String getSettlementInfo_CNAPSNO() {
		return SettlementInfo_CNAPSNO;
	}
	public void setSettlementInfo_CNAPSNO(String SettlementInfo_CNAPSNO) {
		this.SettlementInfo_CNAPSNO = SettlementInfo_CNAPSNO;
	}
	public String getSettlementInfo_SettlementBankName() {
		return SettlementInfo_SettlementBankName;
	}
	public void setSettlementInfo_SettlementBankName(String SettlementInfo_SettlementBankName) {
		this.SettlementInfo_SettlementBankName = SettlementInfo_SettlementBankName;
	}
	public String getSettlementInfo_BankAccount() {
		return SettlementInfo_BankAccount;
	}
	public void setSettlementInfo_BankAccount(String SettlementInfo_BankAccount) {
		this.SettlementInfo_BankAccount = SettlementInfo_BankAccount;
	}
	public String getSettlementInfo_BankNewAccountName() {
		return SettlementInfo_BankNewAccountName;
	}
	public void setSettlementInfo_BankNewAccountName(String SettlementInfo_BankNewAccountName) {
		this.SettlementInfo_BankNewAccountName = SettlementInfo_BankNewAccountName;
	}
	public String getSettlementInfo_SettlementPeriod() {
		return SettlementInfo_SettlementPeriod;
	}
	public void setSettlementInfo_SettlementPeriod(String SettlementInfo_SettlementPeriod) {
		this.SettlementInfo_SettlementPeriod = SettlementInfo_SettlementPeriod;
	}
	public String getSettlementInfo_SettlementTransferMoneyDay() {
		return SettlementInfo_SettlementTransferMoneyDay;
	}
	public void setSettlementInfo_SettlementTransferMoneyDay(String SettlementInfo_SettlementTransferMoneyDay) {
		this.SettlementInfo_SettlementTransferMoneyDay = SettlementInfo_SettlementTransferMoneyDay;
	}
	public String getSettlementInfo_NextSettlementDate() {
		return SettlementInfo_NextSettlementDate;
	}
	public void setSettlementInfo_NextSettlementDate(String SettlementInfo_NextSettlementDate) {
		this.SettlementInfo_NextSettlementDate = SettlementInfo_NextSettlementDate;
	}
	public String getSettlementInfo_StopSettlementSign() {
		return SettlementInfo_StopSettlementSign;
	}
	public void setSettlementInfo_StopSettlementSign(String SettlementInfo_StopSettlementSign) {
		this.SettlementInfo_StopSettlementSign = SettlementInfo_StopSettlementSign;
	}
	public String getSettlementInfo_EffectiveDateBegin() {
		return SettlementInfo_EffectiveDateBegin;
	}
	public void setSettlementInfo_EffectiveDateBegin(String SettlementInfo_EffectiveDateBegin) {
		this.SettlementInfo_EffectiveDateBegin = SettlementInfo_EffectiveDateBegin;
	}
	public String getSettlementInfo_EffectiveDateEnd() {
		return SettlementInfo_EffectiveDateEnd;
	}
	public void setSettlementInfo_EffectiveDateEnd(String SettlementInfo_EffectiveDateEnd) {
		this.SettlementInfo_EffectiveDateEnd = SettlementInfo_EffectiveDateEnd;
	}
	public String getSettlementInfo_InitialMoney() {
		return SettlementInfo_InitialMoney;
	}
	public void setSettlementInfo_InitialMoney(String SettlementInfo_InitialMoney) {
		this.SettlementInfo_InitialMoney = SettlementInfo_InitialMoney;
	}
	public String getSettlementInfo_MerchantSettlementType() {
		return SettlementInfo_MerchantSettlementType;
	}
	public void setSettlementInfo_MerchantSettlementType(String SettlementInfo_MerchantSettlementType) {
		this.SettlementInfo_MerchantSettlementType = SettlementInfo_MerchantSettlementType;
	}
	public String getSettlementInfo_MerchantRateType() {
		return SettlementInfo_MerchantRateType;
	}
	public void setSettlementInfo_MerchantRateType(String SettlementInfo_MerchantRateType) {
		this.SettlementInfo_MerchantRateType = SettlementInfo_MerchantRateType;
	}
	public String getSettlementInfo_RefundType() {
		return SettlementInfo_RefundType;
	}
	public void setSettlementInfo_RefundType(String SettlementInfo_RefundType) {
		this.SettlementInfo_RefundType = SettlementInfo_RefundType;
	}
	public String getRateInfo_FeeType1() {
		return RateInfo_FeeType1;
	}
	public void setRateInfo_FeeType1(String RateInfo_FeeType1) {
		this.RateInfo_FeeType1 = RateInfo_FeeType1;
	}
	public String getRateInfo_FeeType1_EffectiveDateBegin() {
		return RateInfo_FeeType1_EffectiveDateBegin;
	}
	public void setRateInfo_FeeType1_EffectiveDateBegin(String RateInfo_FeeType1_EffectiveDateBegin) {
		this.RateInfo_FeeType1_EffectiveDateBegin = RateInfo_FeeType1_EffectiveDateBegin;
	}
	public String getRateInfo_FeeType1_EffectiveDateEnd() {
		return RateInfo_FeeType1_EffectiveDateEnd;
	}
	public void setRateInfo_FeeType1_EffectiveDateEnd(String RateInfo_FeeType1_EffectiveDateEnd) {
		this.RateInfo_FeeType1_EffectiveDateEnd = RateInfo_FeeType1_EffectiveDateEnd;
	}
	public String getRateInfo_CreditCard_RateNameCode() {
		return RateInfo_CreditCard_RateNameCode;
	}
	public void setRateInfo_CreditCard_RateNameCode(String RateInfo_CreditCard_RateNameCode) {
		this.RateInfo_CreditCard_RateNameCode = RateInfo_CreditCard_RateNameCode;
	}
	public String getRateInfo_CreditCard_SearchRate_RateRadio() {
		return RateInfo_CreditCard_SearchRate_RateRadio;
	}
	public void setRateInfo_CreditCard_SearchRate_RateRadio(String RateInfo_CreditCard_SearchRate_RateRadio) {
		this.RateInfo_CreditCard_SearchRate_RateRadio = RateInfo_CreditCard_SearchRate_RateRadio;
	}
	public String getRateInfo_DebitCard_RateNameCode() {
		return RateInfo_DebitCard_RateNameCode;
	}
	public void setRateInfo_DebitCard_RateNameCode(String RateInfo_DebitCard_RateNameCode) {
		this.RateInfo_DebitCard_RateNameCode = RateInfo_DebitCard_RateNameCode;
	}
	public String getRateInfo_DebitCard_SearchRate_RateRadio() {
		return RateInfo_DebitCard_SearchRate_RateRadio;
	}
	public void setRateInfo_DebitCard_SearchRate_RateRadio(String RateInfo_DebitCard_SearchRate_RateRadio) {
		this.RateInfo_DebitCard_SearchRate_RateRadio = RateInfo_DebitCard_SearchRate_RateRadio;
	}
	public String getRateInfo_OverseasCard_RateNameCode() {
		return RateInfo_OverseasCard_RateNameCode;
	}
	public void setRateInfo_OverseasCard_RateNameCode(String RateInfo_OverseasCard_RateNameCode) {
		this.RateInfo_OverseasCard_RateNameCode = RateInfo_OverseasCard_RateNameCode;
	}
	public String getRateInfo_OverseasCard_SearchRate_RateRadio() {
		return RateInfo_OverseasCard_SearchRate_RateRadio;
	}
	public void setRateInfo_OverseasCard_SearchRate_RateRadio(String RateInfo_OverseasCard_SearchRate_RateRadio) {
		this.RateInfo_OverseasCard_SearchRate_RateRadio = RateInfo_OverseasCard_SearchRate_RateRadio;
	}
	public String getRateInfo_FeeType2() {
		return RateInfo_FeeType2;
	}
	public void setRateInfo_FeeType2(String RateInfo_FeeType2) {
		this.RateInfo_FeeType2 = RateInfo_FeeType2;
	}
	public String getRateInfo_FeeType2_EffectiveDateBegin() {
		return RateInfo_FeeType2_EffectiveDateBegin;
	}
	public void setRateInfo_FeeType2_EffectiveDateBegin(String RateInfo_FeeType2_EffectiveDateBegin) {
		this.RateInfo_FeeType2_EffectiveDateBegin = RateInfo_FeeType2_EffectiveDateBegin;
	}
	public String getRateInfo_FeeType2_EffectiveDateEnd() {
		return RateInfo_FeeType2_EffectiveDateEnd;
	}
	public void setRateInfo_FeeType2_EffectiveDateEnd(String RateInfo_FeeType2_EffectiveDateEnd) {
		this.RateInfo_FeeType2_EffectiveDateEnd = RateInfo_FeeType2_EffectiveDateEnd;
	}
	public String getRateInfo_Unionpay_RateNameCode() {
		return RateInfo_Unionpay_RateNameCode;
	}
	public void setRateInfo_Unionpay_RateNameCode(String RateInfo_Unionpay_RateNameCode) {
		this.RateInfo_Unionpay_RateNameCode = RateInfo_Unionpay_RateNameCode;
	}
	public String getRateInfo_Unionpay_SearchRate_RateRadio() {
		return RateInfo_Unionpay_SearchRate_RateRadio;
	}
	public void setRateInfo_Unionpay_SearchRate_RateRadio(String RateInfo_Unionpay_SearchRate_RateRadio) {
		this.RateInfo_Unionpay_SearchRate_RateRadio = RateInfo_Unionpay_SearchRate_RateRadio;
	}
	public String getRateInfo_FeeType3() {
		return RateInfo_FeeType3;
	}
	public void setRateInfo_FeeType3(String RateInfo_FeeType3) {
		this.RateInfo_FeeType3 = RateInfo_FeeType3;
	}
	public String getRateInfo_FeeType3_EffectiveDateBegin() {
		return RateInfo_FeeType3_EffectiveDateBegin;
	}
	public void setRateInfo_FeeType3_EffectiveDateBegin(String RateInfo_FeeType3_EffectiveDateBegin) {
		this.RateInfo_FeeType3_EffectiveDateBegin = RateInfo_FeeType3_EffectiveDateBegin;
	}
	public String getRateInfo_FeeType3_EffectiveDateEnd() {
		return RateInfo_FeeType3_EffectiveDateEnd;
	}
	public void setRateInfo_FeeType3_EffectiveDateEnd(String RateInfo_FeeType3_EffectiveDateEnd) {
		this.RateInfo_FeeType3_EffectiveDateEnd = RateInfo_FeeType3_EffectiveDateEnd;
	}
	public String getRateInfo_Alipay_RateNameCode() {
		return RateInfo_Alipay_RateNameCode;
	}
	public void setRateInfo_Alipay_RateNameCode(String RateInfo_Alipay_RateNameCode) {
		this.RateInfo_Alipay_RateNameCode = RateInfo_Alipay_RateNameCode;
	}
	public String getRateInfo_Alipay_SearchRate_RateRadio() {
		return RateInfo_Alipay_SearchRate_RateRadio;
	}
	public void setRateInfo_Alipay_SearchRate_RateRadio(String RateInfo_Alipay_SearchRate_RateRadio) {
		this.RateInfo_Alipay_SearchRate_RateRadio = RateInfo_Alipay_SearchRate_RateRadio;
	}
	public String getRateInfo_FeeType4() {
		return RateInfo_FeeType4;
	}
	public void setRateInfo_FeeType4(String RateInfo_FeeType4) {
		this.RateInfo_FeeType4 = RateInfo_FeeType4;
	}
	public String getRateInfo_FeeType4_EffectiveDateBegin() {
		return RateInfo_FeeType4_EffectiveDateBegin;
	}
	public void setRateInfo_FeeType4_EffectiveDateBegin(String RateInfo_FeeType4_EffectiveDateBegin) {
		this.RateInfo_FeeType4_EffectiveDateBegin = RateInfo_FeeType4_EffectiveDateBegin;
	}
	public String getRateInfo_FeeType4_EffectiveDateEnd() {
		return RateInfo_FeeType4_EffectiveDateEnd;
	}
	public void setRateInfo_FeeType4_EffectiveDateEnd(String RateInfo_FeeType4_EffectiveDateEnd) {
		this.RateInfo_FeeType4_EffectiveDateEnd = RateInfo_FeeType4_EffectiveDateEnd;
	}
	public String getRateInfo_Wechat_RateNameCode() {
		return RateInfo_Wechat_RateNameCode;
	}
	public void setRateInfo_Wechat_RateNameCode(String RateInfo_Wechat_RateNameCode) {
		this.RateInfo_Wechat_RateNameCode = RateInfo_Wechat_RateNameCode;
	}
	public String getRateInfo_Wechat_SearchRate_RateRadio() {
		return RateInfo_Wechat_SearchRate_RateRadio;
	}
	public void setRateInfo_Wechat_SearchRate_RateRadio(String RateInfo_Wechat_SearchRate_RateRadio) {
		this.RateInfo_Wechat_SearchRate_RateRadio = RateInfo_Wechat_SearchRate_RateRadio;
	}
	public String getContactInfo_ContactType() {
		return ContactInfo_ContactType;
	}
	public void setContactInfo_ContactType(String ContactInfo_ContactType) {
		this.ContactInfo_ContactType = ContactInfo_ContactType;
	}
	public String getContactInfo_ContactName() {
		return ContactInfo_ContactName;
	}
	public void setContactInfo_ContactName(String ContactInfo_ContactName) {
		this.ContactInfo_ContactName = ContactInfo_ContactName;
	}
	public String getContactInfo_MobilePhoneNO() {
		return ContactInfo_MobilePhoneNO;
	}
	public void setContactInfo_MobilePhoneNO(String ContactInfo_MobilePhoneNO) {
		this.ContactInfo_MobilePhoneNO = ContactInfo_MobilePhoneNO;
	}
	public String getContactInfo_TelephoneNO() {
		return ContactInfo_TelephoneNO;
	}
	public void setContactInfo_TelephoneNO(String ContactInfo_TelephoneNO) {
		this.ContactInfo_TelephoneNO = ContactInfo_TelephoneNO;
	}
	public String getContactInfo_Email() {
		return ContactInfo_Email;
	}
	public void setContactInfo_Email(String ContactInfo_Email) {
		this.ContactInfo_Email = ContactInfo_Email;
	}
	public String getContactInfo_QQ() {
		return ContactInfo_QQ;
	}
	public void setContactInfo_QQ(String ContactInfo_QQ) {
		this.ContactInfo_QQ = ContactInfo_QQ;
	}
	public String getAggreementInfo_MerchantSource() {
		return AggreementInfo_MerchantSource;
	}
	public void setAggreementInfo_MerchantSource(String AggreementInfo_MerchantSource) {
		this.AggreementInfo_MerchantSource = AggreementInfo_MerchantSource;
	}
	public String getAggreementInfo_CustomerManagementNO() {
		return AggreementInfo_CustomerManagementNO;
	}
	public void setAggreementInfo_CustomerManagementNO(String AggreementInfo_CustomerManagementNO) {
		this.AggreementInfo_CustomerManagementNO = AggreementInfo_CustomerManagementNO;
	}
	public String getAggreementInfo_AggreementTips() {
		return AggreementInfo_AggreementTips;
	}
	public void setAggreementInfo_AggreementTips(String AggreementInfo_AggreementTips) {
		this.AggreementInfo_AggreementTips = AggreementInfo_AggreementTips;
	}
	public String getAggreementInfo_AggreementPassDate() {
		return AggreementInfo_AggreementPassDate;
	}
	public void setAggreementInfo_AggreementPassDate(String AggreementInfo_AggreementPassDate) {
		this.AggreementInfo_AggreementPassDate = AggreementInfo_AggreementPassDate;
	}
	public String getSignedInvoiceInfo_InvoiceWay() {
		return SignedInvoiceInfo_InvoiceWay;
	}
	public void setSignedInvoiceInfo_InvoiceWay(String SignedInvoiceInfo_InvoiceWay) {
		this.SignedInvoiceInfo_InvoiceWay = SignedInvoiceInfo_InvoiceWay;
	}
	public String getSignedInvoiceInfo_InvoiceTitle() {
		return SignedInvoiceInfo_InvoiceTitle;
	}
	public void setSignedInvoiceInfo_InvoiceTitle(String SignedInvoiceInfo_InvoiceTitle) {
		this.SignedInvoiceInfo_InvoiceTitle = SignedInvoiceInfo_InvoiceTitle;
	}
	public String getSignedInvoiceInfo_InvoiceMailAddress() {
		return SignedInvoiceInfo_InvoiceMailAddress;
	}
	public void setSignedInvoiceInfo_InvoiceMailAddress(String SignedInvoiceInfo_InvoiceMailAddress) {
		this.SignedInvoiceInfo_InvoiceMailAddress = SignedInvoiceInfo_InvoiceMailAddress;
	}
	public String getSignedInvoiceInfo_PostalCode() {
		return SignedInvoiceInfo_PostalCode;
	}
	public void setSignedInvoiceInfo_PostalCode(String SignedInvoiceInfo_PostalCode) {
		this.SignedInvoiceInfo_PostalCode = SignedInvoiceInfo_PostalCode;
	}
	public String getReconciliationInfo_MailSendBill() {
		return ReconciliationInfo_MailSendBill;
	}
	public void setReconciliationInfo_MailSendBill(String ReconciliationInfo_MailSendBill) {
		this.ReconciliationInfo_MailSendBill = ReconciliationInfo_MailSendBill;
	}
	public String getReconciliationInfo_EmailAddress() {
		return ReconciliationInfo_EmailAddress;
	}
	public void setReconciliationInfo_EmailAddress(String ReconciliationInfo_EmailAddress) {
		this.ReconciliationInfo_EmailAddress = ReconciliationInfo_EmailAddress;
	}
	public String getAddtionInfo_MerchantManagementName() {
		return AddtionInfo_MerchantManagementName;
	}
	public void setAddtionInfo_MerchantManagementName(String AddtionInfo_MerchantManagementName) {
		this.AddtionInfo_MerchantManagementName = AddtionInfo_MerchantManagementName;
	}
	public String getAddtionInfo_MerchantManagementPhoneNO() {
		return AddtionInfo_MerchantManagementPhoneNO;
	}
	public void setAddtionInfo_MerchantManagementPhoneNO(String AddtionInfo_MerchantManagementPhoneNO) {
		this.AddtionInfo_MerchantManagementPhoneNO = AddtionInfo_MerchantManagementPhoneNO;
	}
	public String getAddtionInfo_MerchantManagementEmail() {
		return AddtionInfo_MerchantManagementEmail;
	}
	public void setAddtionInfo_MerchantManagementEmail(String AddtionInfo_MerchantManagementEmail) {
		this.AddtionInfo_MerchantManagementEmail = AddtionInfo_MerchantManagementEmail;
	}
	public String getAddtionInfo_MerchantPortType() {
		return AddtionInfo_MerchantPortType;
	}
	public void setAddtionInfo_MerchantPortType(String AddtionInfo_MerchantPortType) {
		this.AddtionInfo_MerchantPortType = AddtionInfo_MerchantPortType;
	}
	public String getAttachmentUploading_Uploading() {
		return AttachmentUploading_Uploading;
	}
	public void setAttachmentUploading_Uploading(String AttachmentUploading_Uploading) {
		this.AttachmentUploading_Uploading = AttachmentUploading_Uploading;
	}

}