package com.dy.AutoTest.AcquiringOperationPlatform.PageObject.MerchantInfoManagement;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.dy.AutoTest.web.api.SuperPage;
import com.dy.AutoTest.web.actions.DoPlus;

public class MerchantInfoAddPage extends SuperPage{
	public MerchantInfoAddPage(WebDriver driver) {
		super(driver);
		du.loadLocator("AOP_Loc_MerchantInfoManagement_MerchantInfoAdd");
	}
	public void setWaitTime(long waitTime) {
		du=new DoPlus(driver);
		du.waitTime=waitTime;
		du.loadLocator("AOP_Loc_MerchantInfoManagement_MerchantInfoAdd");
	}

/***************************Manual Coding**********************************/


/****************************Auto Generate******************************/

	//基本信息
	public void clickBasicInfo() {
		du.what("BasicInfo").click();
	}
	//结算信息
	public void clickSettlementInfo() {
		du.what("SettlementInfo").click();
	}
	//费率信息
	public void clickRateInfo() {
		du.what("RateInfo").click();
	}
	//联系人信息
	public void clickContactInfo() {
		du.what("ContactInfo").click();
	}
	//协议信息
	public void clickAggreementInfo() {
		du.what("AggreementInfo").click();
	}
	//签约发票信息
	public void clickSignedInvoiceInfo() {
		du.what("SignedInvoiceInfo").click();
	}
	//对账单信息
	public void clickReconciliationInfo() {
		du.what("ReconciliationInfo").click();
	}
	//附加信息
	public void clickAddtionInfo() {
		du.what("AddtionInfo").click();
	}
	//附件上传
	public void clickAttachmentUploading() {
		du.what("AttachmentUploading").click();
	}
	//基本信息_基本信息录入区
	public void clickBasicInfo_BasicInfoEnteringArea() {
		du.what("BasicInfo_BasicInfoEnteringArea").click();
	}
	//基本信息_基本信息录入区_商户类型
	public void selectBasicInfo_MerchantType(String value) {
		du.whatSelect("BasicInfo_MerchantType").selectByValue(value);
	}
	//基本信息_基本信息录入区_商户手机号
	public void setBasicInfo_MerchantPhoneNO(String value) {
		du.what("BasicInfo_MerchantPhoneNO").clear();
		du.what("BasicInfo_MerchantPhoneNO").sendKeys(value);
	}
	public String getBasicInfo_MerchantPhoneNO() {
		return du.what("BasicInfo_MerchantPhoneNO").getAttribute("value");
	}
	//基本信息_基本信息录入区_商户名称
	public void setBasicInfo_MerchantName(String value) {
		du.what("BasicInfo_MerchantName").clear();
		du.what("BasicInfo_MerchantName").sendKeys(value);
	}
	public String getBasicInfo_MerchantName() {
		return du.what("BasicInfo_MerchantName").getAttribute("value");
	}
	//基本信息_基本信息录入区_商户简称
	public void setBasicInfo_MerchantAbbreviation(String value) {
		du.what("BasicInfo_MerchantAbbreviation").clear();
		du.what("BasicInfo_MerchantAbbreviation").sendKeys(value);
	}
	public String getBasicInfo_MerchantAbbreviation() {
		return du.what("BasicInfo_MerchantAbbreviation").getAttribute("value");
	}
	//基本信息_基本信息录入区_商户拼写简称
	public void setBasicInfo_MerchantSpellingAbbreviation(String value) {
		du.what("BasicInfo_MerchantSpellingAbbreviation").clear();
		du.what("BasicInfo_MerchantSpellingAbbreviation").sendKeys(value);
	}
	public String getBasicInfo_MerchantSpellingAbbreviation() {
		return du.what("BasicInfo_MerchantSpellingAbbreviation").getAttribute("value");
	}
	//基本信息_基本信息录入区_商户电话
	public void setBasicInfo_MerchantPhone(String value) {
		du.what("BasicInfo_MerchantPhone").clear();
		du.what("BasicInfo_MerchantPhone").sendKeys(value);
	}
	public String getBasicInfo_MerchantPhone() {
		return du.what("BasicInfo_MerchantPhone").getAttribute("value");
	}
	//基本信息_基本信息录入区_MCC码
	public void clickBasicInfo_MCC() {
		du.what("BasicInfo_MCC").clear();
		du.what("BasicInfo_MCC").click();
	}
	public String getBasicInfo_MCC() {
		return du.what("BasicInfo_MCC").getAttribute("value");
	}
	//基本信息_基本信息录入区_内部商户类型
	public void selectBasicInfo_InnerMerchantType(String value) {
		du.whatSelect("BasicInfo_InnerMerchantType").selectByValue(value);
	}
	//基本信息_基本信息录入区_归属省份
	public void selectBasicInfo_BelongProvince(String value) {
		du.whatSelect("BasicInfo_BelongProvince").selectByValue(value);
	}
	//基本信息_基本信息录入区_归属城市
	public void selectBasicInfo_BelongCity(String value) {
		du.whatSelect("BasicInfo_BelongCity").selectByValue(value);
	}
	//基本信息_基本信息录入区_营业地址
	public void setBasicInfo_BusinessAddress(String value) {
		du.what("BasicInfo_BusinessAddress").clear();
		du.what("BasicInfo_BusinessAddress").sendKeys(value);
	}
	public String getBasicInfo_BusinessAddress() {
		return du.what("BasicInfo_BusinessAddress").getAttribute("value");
	}
	//基本信息_营业执照,组织机构代码,税务,法人录入区
	public void clickBasicInfo_BusinessLicenseETC() {
		du.what("BasicInfo_BusinessLicenseETC").click();
	}
	//基本信息_营业执照,组织机构代码,税务,法人录入区_商户性质
	public void selectBasicInfo_MerchantCharacter(String value) {
		du.whatSelect("BasicInfo_MerchantCharacter").selectByValue(value);
	}
	//基本信息_营业执照,组织机构代码,税务,法人录入区_营业执照号
	public void setBasicInfo_BusinessLicenseNO(String value) {
		du.what("BasicInfo_BusinessLicenseNO").clear();
		du.what("BasicInfo_BusinessLicenseNO").sendKeys(value);
	}
	public String getBasicInfo_BusinessLicenseNO() {
		return du.what("BasicInfo_BusinessLicenseNO").getAttribute("value");
	}
	//基本信息_营业执照,组织机构代码,税务,法人录入区_营业执照过期日期
	public void setBasicInfo_BusinessLicensePassDate(String value) {
		du.what("BasicInfo_BusinessLicensePassDate").sendKeys(Keys.CONTROL + "a");
		du.waitFor(500);
		du.what("BasicInfo_BusinessLicensePassDate").sendKeys(value);
	}
	public String getBasicInfo_BusinessLicensePassDate() {
		return du.what("BasicInfo_BusinessLicensePassDate").getAttribute("value");
	}
	//基本信息_营业执照,组织机构代码,税务,法人录入区_营业执照过期日期_长期
	public void clickBasicInfo_BusinessLicensePassDate_LongTerm() {
		if(!du.what("BasicInfo_BusinessLicensePassDate_LongTerm").isSelected())
			du.what("BasicInfo_BusinessLicensePassDate_LongTerm").click();
	}
	//基本信息_营业执照,组织机构代码,税务,法人录入区_注册资本
	public void setBasicInfo_RegisteredCapital(String value) {
		du.what("BasicInfo_RegisteredCapital").clear();
		du.what("BasicInfo_RegisteredCapital").sendKeys(value);
	}
	public String getBasicInfo_RegisteredCapital() {
		return du.what("BasicInfo_RegisteredCapital").getAttribute("value");
	}
	//基本信息_营业执照,组织机构代码,税务,法人录入区_注册地址
	public void setBasicInfo_RegisteredAddress(String value) {
		du.what("BasicInfo_RegisteredAddress").clear();
		du.what("BasicInfo_RegisteredAddress").sendKeys(value);
	}
	public String getBasicInfo_RegisteredAddress() {
		return du.what("BasicInfo_RegisteredAddress").getAttribute("value");
	}
	//基本信息_营业执照,组织机构代码,税务,法人录入区_组织机构代码
	public void setBasicInfo_OrganizingInstitutionCode(String value) {
		du.what("BasicInfo_OrganizingInstitutionCode").clear();
		du.what("BasicInfo_OrganizingInstitutionCode").sendKeys(value);
	}
	public String getBasicInfo_OrganizingInstitutionCode() {
		return du.what("BasicInfo_OrganizingInstitutionCode").getAttribute("value");
	}
	//基本信息_营业执照,组织机构代码,税务,法人录入区_组织机构代码证过期日期
	public void setBasicInfo_OrganizingInstitutionCodeCertificatePassDate(String value) {
		du.what("BasicInfo_OrganizingInstitutionCodeCertificatePassDate").sendKeys(Keys.CONTROL + "a");
		du.waitFor(500);
		du.what("BasicInfo_OrganizingInstitutionCodeCertificatePassDate").sendKeys(value);
	}
	public String getBasicInfo_OrganizingInstitutionCodeCertificatePassDate() {
		return du.what("BasicInfo_OrganizingInstitutionCodeCertificatePassDate").getAttribute("value");
	}
	//基本信息_营业执照,组织机构代码,税务,法人录入区_组织机构代码证过期日期_长期
	public void clickBasicInfo_OrganizingInstitutionCodeCertificatePassDate_LongTerm() {
		if(!du.what("BasicInfo_OrganizingInstitutionCodeCertificatePassDate_LongTerm").isSelected())
			du.what("BasicInfo_OrganizingInstitutionCodeCertificatePassDate_LongTerm").click();
	}
	//基本信息_营业执照,组织机构代码,税务,法人录入区_税务登记证号
	public void setBasicInfo_TaxRegistrationCertificateNO(String value) {
		du.what("BasicInfo_TaxRegistrationCertificateNO").clear();
		du.what("BasicInfo_TaxRegistrationCertificateNO").sendKeys(value);
	}
	public String getBasicInfo_TaxRegistrationCertificateNO() {
		return du.what("BasicInfo_TaxRegistrationCertificateNO").getAttribute("value");
	}
	//基本信息_营业执照,组织机构代码,税务,法人录入区_税务登记证过期日期
	public void setBasicInfo_TaxRegistrationCertificateNOPassDate(String value) {
		du.what("BasicInfo_TaxRegistrationCertificateNOPassDate").sendKeys(Keys.CONTROL + "a");
		du.waitFor(500);
		du.what("BasicInfo_TaxRegistrationCertificateNOPassDate").sendKeys(value);
	}
	public String getBasicInfo_TaxRegistrationCertificateNOPassDate() {
		return du.what("BasicInfo_TaxRegistrationCertificateNOPassDate").getAttribute("value");
	}
	//基本信息_营业执照,组织机构代码,税务,法人录入区_税务登记证过期日期_长期
	public void clickBasicInfo_TaxRegistrationCertificateNOPassDate_LongTerm() {
		if(!du.what("BasicInfo_TaxRegistrationCertificateNOPassDate_LongTerm").isSelected())
			du.what("BasicInfo_TaxRegistrationCertificateNOPassDate_LongTerm").click();
	}
	//基本信息_营业执照,组织机构代码,税务,法人录入区_法人证件类型
	public void selectBasicInfo_LegalPersonCertificateType(String value) {
		du.whatSelect("BasicInfo_LegalPersonCertificateType").selectByValue(value);
	}
	//基本信息_营业执照,组织机构代码,税务,法人录入区_法人证件号码
	public void setBasicInfo_LegalPersonCertificateNO(String value) {
		du.what("BasicInfo_LegalPersonCertificateNO").clear();
		du.what("BasicInfo_LegalPersonCertificateNO").sendKeys(value);
	}
	public String getBasicInfo_LegalPersonCertificateNO() {
		return du.what("BasicInfo_LegalPersonCertificateNO").getAttribute("value");
	}
	//基本信息_营业执照,组织机构代码,税务,法人录入区_法人姓名
	public void setBasicInfo_LegalPersonName(String value) {
		du.what("BasicInfo_LegalPersonName").clear();
		du.what("BasicInfo_LegalPersonName").sendKeys(value);
	}
	public String getBasicInfo_LegalPersonName() {
		return du.what("BasicInfo_LegalPersonName").getAttribute("value");
	}
	//基本信息_营业执照,组织机构代码,税务,法人录入区_法人证件过期日期
	public void setBasicInfo_LegalPersonCertificatePassDate(String value) {
		du.what("BasicInfo_LegalPersonCertificatePassDate").sendKeys(Keys.CONTROL + "a");
		du.waitFor(500);
		du.what("BasicInfo_LegalPersonCertificatePassDate").sendKeys(value);
	}
	public String getBasicInfo_LegalPersonCertificatePassDate() {
		return du.what("BasicInfo_LegalPersonCertificatePassDate").getAttribute("value");
	}
	//基本信息_营业执照,组织机构代码,税务,法人录入区_法人证件过期日期_长期
	public void clickBasicInfo_LegalPersonCertificatePassDate_LongTerm() {
		if(!du.what("BasicInfo_LegalPersonCertificatePassDate_LongTerm").isSelected())
			du.what("BasicInfo_LegalPersonCertificatePassDate_LongTerm").click();
	}
	//基本信息_其他信息区
	public void clickBasicInfo_OtherInfoArea() {
		du.what("BasicInfo_OtherInfoArea").click();
	}
	//基本信息_其他信息区_连锁关系
	public void selectBasicInfo_LinkageRelationship(String value) {
		du.whatSelect("BasicInfo_LinkageRelationship").selectByValue(value);
	}
	//基本信息_其他信息区_营业地段
	public void selectBasicInfo_BusinessDistrict(String value) {
		du.whatSelect("BasicInfo_BusinessDistrict").selectByValue(value);
	}
	//基本信息_其他信息区_营业区域
	public void selectBasicInfo_BusinessArea(String value) {
		du.whatSelect("BasicInfo_BusinessArea").selectByValue(value);
	}
	//基本信息_其他信息区_节假日营业标志
	public void selectBasicInfo_FestivalBusinessSign(String value) {
		du.whatSelect("BasicInfo_FestivalBusinessSign").selectByValue(value);
	}
	//基本信息_其他信息区_经营范围
	public void setBasicInfo_BusinessRange(String value) {
		du.what("BasicInfo_BusinessRange").clear();
		du.what("BasicInfo_BusinessRange").sendKeys(value);
	}
	public String getBasicInfo_BusinessRange() {
		return du.what("BasicInfo_BusinessRange").getAttribute("value");
	}
	//基本信息_其他信息区_商户行业描述
	public void setBasicInfo_BusinessDescribe(String value) {
		du.what("BasicInfo_BusinessDescribe").clear();
		du.what("BasicInfo_BusinessDescribe").sendKeys(value);
	}
	public String getBasicInfo_BusinessDescribe() {
		return du.what("BasicInfo_BusinessDescribe").getAttribute("value");
	}
	//基本信息_其他信息区_员工人数
	public void setBasicInfo_NumEmployees(String value) {
		du.what("BasicInfo_NumEmployees").clear();
		du.what("BasicInfo_NumEmployees").sendKeys(value);
	}
	public String getBasicInfo_NumEmployees() {
		return du.what("BasicInfo_NumEmployees").getAttribute("value");
	}
	//基本信息_其他信息区_开业日期
	public void setBasicInfo_OpenDate(String value) {
		du.what("BasicInfo_OpenDate").sendKeys(Keys.CONTROL + "a");
		du.waitFor(500);
		du.what("BasicInfo_OpenDate").sendKeys(value);
	}
	public String getBasicInfo_OpenDate() {
		return du.what("BasicInfo_OpenDate").getAttribute("value");
	}
	//基本信息_其他信息区_接入机构
	public void selectBasicInfo_AccessAgency(String value) {
		du.whatSelect("BasicInfo_AccessAgency").selectByValue(value);
	}
	//结算信息_结算账号公私标志
	public void selectSettlementInfo_SettlementAccountPublicPrivateSign(String value) {
		du.whatSelect("SettlementInfo_SettlementAccountPublicPrivateSign").selectByValue(value);
	}
	//结算信息_商户结算实时标志
	public void selectSettlementInfo_MerchantSettlementSign(String value) {
		du.whatSelect("SettlementInfo_MerchantSettlementSign").selectByValue(value);
	}
	//结算信息_银行名称
	public void selectSettlementInfo_BankName(String value) {
		du.whatSelect("SettlementInfo_BankName").selectByValue(value);
	}
	//结算信息_支行归属省份
	public void selectSettlementInfo_BranchBankBelongProvince(String value) {
		du.whatSelect("SettlementInfo_BranchBankBelongProvince").selectByValue(value);
	}
	//结算信息_支行归属城市
	public void selectSettlementInfo_BranchBankBelongCity(String value) {
		du.whatSelect("SettlementInfo_BranchBankBelongCity").selectByValue(value);
	}
	//结算信息_支行信息
	public void setSettlementInfo_BranchBankInfo(String value) {
		du.what("SettlementInfo_BranchBankInfo").clear();
		du.what("SettlementInfo_BranchBankInfo").sendKeys(value);
	}
	public String getSettlementInfo_BranchBankInfo() {
		return du.what("SettlementInfo_BranchBankInfo").getAttribute("value");
	}
	//结算信息_查询支行信息
	public void clickSettlementInfo_QueryBranchBankInfo() {
		du.what("SettlementInfo_QueryBranchBankInfo").click();
	}
	//结算信息_选择支行
	public void selectSettlementInfo_BranchBankSelect(String value) {
		du.whatSelect("SettlementInfo_BranchBankSelect").selectByValue(value);
	}
	//结算信息_联行行号
	public void setSettlementInfo_CNAPSNO(String value) {
		du.what("SettlementInfo_CNAPSNO").clear();
		du.what("SettlementInfo_CNAPSNO").sendKeys(value);
	}
	public String getSettlementInfo_CNAPSNO() {
		return du.what("SettlementInfo_CNAPSNO").getAttribute("value");
	}
	//结算信息_结算银行名称
	public void setSettlementInfo_SettlementBankName(String value) {
		du.what("SettlementInfo_SettlementBankName").clear();
		du.what("SettlementInfo_SettlementBankName").sendKeys(value);
	}
	public String getSettlementInfo_SettlementBankName() {
		return du.what("SettlementInfo_SettlementBankName").getAttribute("value");
	}
	//结算信息_银行账号
	public void setSettlementInfo_BankAccount(String value) {
		du.what("SettlementInfo_BankAccount").clear();
		du.what("SettlementInfo_BankAccount").sendKeys(value);
	}
	public String getSettlementInfo_BankAccount() {
		return du.what("SettlementInfo_BankAccount").getAttribute("value");
	}
	//结算信息_银行开户名称
	public void setSettlementInfo_BankNewAccountName(String value) {
		du.what("SettlementInfo_BankNewAccountName").clear();
		du.what("SettlementInfo_BankNewAccountName").sendKeys(value);
	}
	public String getSettlementInfo_BankNewAccountName() {
		return du.what("SettlementInfo_BankNewAccountName").getAttribute("value");
	}
	//结算信息_结算周期
	public void selectSettlementInfo_SettlementPeriod(String value) {
		du.whatSelect("SettlementInfo_SettlementPeriod").selectByValue(value);
	}
	//结算信息_结算划款天数
	public void setSettlementInfo_SettlementTransferMoneyDay(String value) {
		du.what("SettlementInfo_SettlementTransferMoneyDay").clear();
		du.what("SettlementInfo_SettlementTransferMoneyDay").sendKeys(value);
	}
	public String getSettlementInfo_SettlementTransferMoneyDay() {
		return du.what("SettlementInfo_SettlementTransferMoneyDay").getAttribute("value");
	}
	//结算信息_下一个结算日期
	public void setSettlementInfo_NextSettlementDate(String value) {
		du.what("SettlementInfo_NextSettlementDate").sendKeys(Keys.CONTROL + "a");
		du.waitFor(500);
		du.what("SettlementInfo_NextSettlementDate").sendKeys(value);
	}
	public String getSettlementInfo_NextSettlementDate() {
		return du.what("SettlementInfo_NextSettlementDate").getAttribute("value");
	}
	//结算信息_暂停结算标志
	public void selectSettlementInfo_StopSettlementSign(String value) {
		du.whatSelect("SettlementInfo_StopSettlementSign").selectByValue(value);
	}
	//结算信息_有效日期开始
	public void setSettlementInfo_EffectiveDateBegin(String value) {
		du.what("SettlementInfo_EffectiveDateBegin").sendKeys(Keys.CONTROL + "a");
		du.waitFor(500);
		du.what("SettlementInfo_EffectiveDateBegin").sendKeys(value);
	}
	public String getSettlementInfo_EffectiveDateBegin() {
		return du.what("SettlementInfo_EffectiveDateBegin").getAttribute("value");
	}
	//结算信息_有效日期结束
	public void setSettlementInfo_EffectiveDateEnd(String value) {
		du.what("SettlementInfo_EffectiveDateEnd").sendKeys(Keys.CONTROL + "a");
		du.waitFor(500);
		du.what("SettlementInfo_EffectiveDateEnd").sendKeys(value);
	}
	public String getSettlementInfo_EffectiveDateEnd() {
		return du.what("SettlementInfo_EffectiveDateEnd").getAttribute("value");
	}
	//结算信息_起始金额
	public void setSettlementInfo_InitialMoney(String value) {
		du.what("SettlementInfo_InitialMoney").clear();
		du.what("SettlementInfo_InitialMoney").sendKeys(value);
	}
	public String getSettlementInfo_InitialMoney() {
		return du.what("SettlementInfo_InitialMoney").getAttribute("value");
	}
	//结算信息_商户结算类型
	public void selectSettlementInfo_MerchantSettlementType(String value) {
		du.whatSelect("SettlementInfo_MerchantSettlementType").selectByValue(value);
	}
	//结算信息_商户费率类型
	public void selectSettlementInfo_MerchantRateType(String value) {
		du.whatSelect("SettlementInfo_MerchantRateType").selectByValue(value);
	}
	//结算信息_是否退手续费
	public void selectSettlementInfo_RefundType(String value) {
		du.whatSelect("SettlementInfo_RefundType").selectByValue(value);
	}
	//费率信息_贷记卡_搜费率
	public void clickRateInfo_CreditCard_SearchRate() {
		du.what("RateInfo_CreditCard_SearchRate").click();
	}
	//费率信息_借记卡_搜费率
	public void clickRateInfo_DebitCard_SearchRate() {
		du.what("RateInfo_DebitCard_SearchRate").click();
	}
	//费率信息_境外卡_搜费率
	public void clickRateInfo_OverseasCard_SearchRate() {
		du.what("RateInfo_OverseasCard_SearchRate").click();
	}
	//费率信息_银联二维码_搜费率
	public void clickRateInfo_Unionpay_SearchRate() {
		du.what("RateInfo_Unionpay_SearchRate").click();
	}
	//费率信息_支付宝_搜费率
	public void clickRateInfo_Alipay_SearchRate() {
		du.what("RateInfo_Alipay_SearchRate").click();
	}
	//费率信息_微信_搜费率
	public void clickRateInfo_Wechat_SearchRate() {
		du.what("RateInfo_Wechat_SearchRate").click();
	}
	//费率信息_搜费率_费率名称费率代码
	public void setRateInfo_SearchRate_RateNameCode(String value) {
		du.what("RateInfo_SearchRate_RateNameCode").clear();
		du.what("RateInfo_SearchRate_RateNameCode").sendKeys(value);
	}
	public String getRateInfo_SearchRate_RateNameCode() {
		return du.what("RateInfo_SearchRate_RateNameCode").getAttribute("value");
	}
	//费率信息_搜费率_搜索
	public void clickRateInfo_SearchRate_Search() {
		du.what("RateInfo_SearchRate_Search").click();
	}
	//费率信息_搜费率_费率列表单选按钮
	public void clickRateInfo_SearchRate_RateRadio(String radio) {
		du.what("RateInfo_SearchRate_RateRadio",radio).click();
	}
	public boolean isRateInfo_SearchRate_RateRadioExist(String radio) {
		du.waitFor(500);
		return du.isElementExist("RateInfo_SearchRate_RateRadio",radio);
	}
	public boolean isRateInfo_SearchRate_RateRadioDisplayed(String radio) {
		du.waitFor(500);
		return du.what("RateInfo_SearchRate_RateRadio",radio).isDisplayed();
	}
	//费率信息_搜费率_提交
	public void clickRateInfo_SearchRate_Submit() {
		du.what("RateInfo_SearchRate_Submit").click();
	}
	//费率信息_搜费率_关闭
	public void clickRateInfo_SearchRate_Close() {
		du.what("RateInfo_SearchRate_Close").click();
	}
	//费率信息_借记卡_重置
	public void clickRateInfo_CreditCard_Reset() {
		du.what("RateInfo_CreditCard_Reset").click();
	}
	//费率信息_境外卡_重置
	public void clickRateInfo_OverseasCard_Reset() {
		du.what("RateInfo_OverseasCard_Reset").click();
	}
	//费率信息_费用类型1
	public void selectRateInfo_FeeType1(String value) {
		du.whatSelect("RateInfo_FeeType1").selectByValue(value);
	}
	//费率信息_费用类型1_有效日期开始
	public void setRateInfo_FeeType1_EffectiveDateBegin(String value) {
		du.what("RateInfo_FeeType1_EffectiveDateBegin").sendKeys(Keys.CONTROL + "a");
		du.waitFor(500);
		du.what("RateInfo_FeeType1_EffectiveDateBegin").sendKeys(value);
	}
	public String getRateInfo_FeeType1_EffectiveDateBegin() {
		return du.what("RateInfo_FeeType1_EffectiveDateBegin").getAttribute("value");
	}
	//费率信息_费用类型1_有效日期结束
	public void setRateInfo_FeeType1_EffectiveDateEnd(String value) {
		du.what("RateInfo_FeeType1_EffectiveDateEnd").sendKeys(Keys.CONTROL + "a");
		du.waitFor(500);
		du.what("RateInfo_FeeType1_EffectiveDateEnd").sendKeys(value);
	}
	public String getRateInfo_FeeType1_EffectiveDateEnd() {
		return du.what("RateInfo_FeeType1_EffectiveDateEnd").getAttribute("value");
	}
	//费率信息_费用类型2
	public void selectRateInfo_FeeType2(String value) {
		du.whatSelect("RateInfo_FeeType2").selectByValue(value);
	}
	//费率信息_费用类型2_有效日期开始
	public void setRateInfo_FeeType2_EffectiveDateBegin(String value) {
		du.what("RateInfo_FeeType2_EffectiveDateBegin").sendKeys(Keys.CONTROL + "a");
		du.waitFor(500);
		du.what("RateInfo_FeeType2_EffectiveDateBegin").sendKeys(value);
	}
	public String getRateInfo_FeeType2_EffectiveDateBegin() {
		return du.what("RateInfo_FeeType2_EffectiveDateBegin").getAttribute("value");
	}
	//费率信息_费用类型2_有效日期结束
	public void setRateInfo_FeeType2_EffectiveDateEnd(String value) {
		du.what("RateInfo_FeeType2_EffectiveDateEnd").sendKeys(Keys.CONTROL + "a");
		du.waitFor(500);
		du.what("RateInfo_FeeType2_EffectiveDateEnd").sendKeys(value);
	}
	public String getRateInfo_FeeType2_EffectiveDateEnd() {
		return du.what("RateInfo_FeeType2_EffectiveDateEnd").getAttribute("value");
	}
	//费率信息_费用类型3
	public void selectRateInfo_FeeType3(String value) {
		du.whatSelect("RateInfo_FeeType3").selectByValue(value);
	}
	//费率信息_费用类型3_有效日期开始
	public void setRateInfo_FeeType3_EffectiveDateBegin(String value) {
		du.what("RateInfo_FeeType3_EffectiveDateBegin").sendKeys(Keys.CONTROL + "a");
		du.waitFor(500);
		du.what("RateInfo_FeeType3_EffectiveDateBegin").sendKeys(value);
	}
	public String getRateInfo_FeeType3_EffectiveDateBegin() {
		return du.what("RateInfo_FeeType3_EffectiveDateBegin").getAttribute("value");
	}
	//费率信息_费用类型3_有效日期结束
	public void setRateInfo_FeeType3_EffectiveDateEnd(String value) {
		du.what("RateInfo_FeeType3_EffectiveDateEnd").sendKeys(Keys.CONTROL + "a");
		du.waitFor(500);
		du.what("RateInfo_FeeType3_EffectiveDateEnd").sendKeys(value);
	}
	public String getRateInfo_FeeType3_EffectiveDateEnd() {
		return du.what("RateInfo_FeeType3_EffectiveDateEnd").getAttribute("value");
	}
	//费率信息_费用类型4
	public void selectRateInfo_FeeType4(String value) {
		du.whatSelect("RateInfo_FeeType4").selectByValue(value);
	}
	//费率信息_费用类型4_有效日期开始
	public void setRateInfo_FeeType4_EffectiveDateBegin(String value) {
		du.what("RateInfo_FeeType4_EffectiveDateBegin").sendKeys(Keys.CONTROL + "a");
		du.waitFor(500);
		du.what("RateInfo_FeeType4_EffectiveDateBegin").sendKeys(value);
	}
	public String getRateInfo_FeeType4_EffectiveDateBegin() {
		return du.what("RateInfo_FeeType4_EffectiveDateBegin").getAttribute("value");
	}
	//费率信息_费用类型4_有效日期结束
	public void setRateInfo_FeeType4_EffectiveDateEnd(String value) {
		du.what("RateInfo_FeeType4_EffectiveDateEnd").sendKeys(Keys.CONTROL + "a");
		du.waitFor(500);
		du.what("RateInfo_FeeType4_EffectiveDateEnd").sendKeys(value);
	}
	public String getRateInfo_FeeType4_EffectiveDateEnd() {
		return du.what("RateInfo_FeeType4_EffectiveDateEnd").getAttribute("value");
	}
	//联系人信息_联系人类型
	public void selectContactInfo_ContactType(String value) {
		du.whatSelect("ContactInfo_ContactType").selectByValue(value);
	}
	//联系人信息_联系人姓名
	public void setContactInfo_ContactName(String value) {
		du.what("ContactInfo_ContactName").clear();
		du.what("ContactInfo_ContactName").sendKeys(value);
	}
	public String getContactInfo_ContactName() {
		return du.what("ContactInfo_ContactName").getAttribute("value");
	}
	//联系人信息_移动电话
	public void setContactInfo_MobilePhoneNO(String value) {
		du.what("ContactInfo_MobilePhoneNO").clear();
		du.what("ContactInfo_MobilePhoneNO").sendKeys(value);
	}
	public String getContactInfo_MobilePhoneNO() {
		return du.what("ContactInfo_MobilePhoneNO").getAttribute("value");
	}
	//联系人信息_固定电话
	public void setContactInfo_TelephoneNO(String value) {
		du.what("ContactInfo_TelephoneNO").clear();
		du.what("ContactInfo_TelephoneNO").sendKeys(value);
	}
	public String getContactInfo_TelephoneNO() {
		return du.what("ContactInfo_TelephoneNO").getAttribute("value");
	}
	//联系人信息_Email
	public void setContactInfo_Email(String value) {
		du.what("ContactInfo_Email").clear();
		du.what("ContactInfo_Email").sendKeys(value);
	}
	public String getContactInfo_Email() {
		return du.what("ContactInfo_Email").getAttribute("value");
	}
	//联系人信息_QQ
	public void setContactInfo_QQ(String value) {
		du.what("ContactInfo_QQ").clear();
		du.what("ContactInfo_QQ").sendKeys(value);
	}
	public String getContactInfo_QQ() {
		return du.what("ContactInfo_QQ").getAttribute("value");
	}
	//协议信息_商户来源
	public void selectAggreementInfo_MerchantSource(String value) {
		du.whatSelect("AggreementInfo_MerchantSource").selectByValue(value);
	}
	//协议信息_客户经理编号
	public void setAggreementInfo_CustomerManagementNO(String value) {
		du.what("AggreementInfo_CustomerManagementNO").clear();
		du.what("AggreementInfo_CustomerManagementNO").sendKeys(value);
	}
	public String getAggreementInfo_CustomerManagementNO() {
		return du.what("AggreementInfo_CustomerManagementNO").getAttribute("value");
	}
	//协议信息_协议备注
	public void setAggreementInfo_AggreementTips(String value) {
		du.what("AggreementInfo_AggreementTips").clear();
		du.what("AggreementInfo_AggreementTips").sendKeys(value);
	}
	public String getAggreementInfo_AggreementTips() {
		return du.what("AggreementInfo_AggreementTips").getAttribute("value");
	}
	//协议信息_协议到期日
	public void setAggreementInfo_AggreementPassDate(String value) {
		du.what("AggreementInfo_AggreementPassDate").sendKeys(Keys.CONTROL + "a");
		du.waitFor(500);
		du.what("AggreementInfo_AggreementPassDate").sendKeys(value);
	}
	public String getAggreementInfo_AggreementPassDate() {
		return du.what("AggreementInfo_AggreementPassDate").getAttribute("value");
	}
	//签约发票信息_是否需要发票
	public void clickSignedInvoiceInfo_InvoiceSign() {
		du.what("SignedInvoiceInfo_InvoiceSign").click();
	}
	//签约发票信息_发票开具方式
	public void selectSignedInvoiceInfo_InvoiceWay(String value) {
		du.whatSelect("SignedInvoiceInfo_InvoiceWay").selectByValue(value);
	}
	//签约发票信息_发票抬头
	public void setSignedInvoiceInfo_InvoiceTitle(String value) {
		du.what("SignedInvoiceInfo_InvoiceTitle").clear();
		du.what("SignedInvoiceInfo_InvoiceTitle").sendKeys(value);
	}
	public String getSignedInvoiceInfo_InvoiceTitle() {
		return du.what("SignedInvoiceInfo_InvoiceTitle").getAttribute("value");
	}
	//签约发票信息_发票邮寄地址
	public void setSignedInvoiceInfo_InvoiceMailAddress(String value) {
		du.what("SignedInvoiceInfo_InvoiceMailAddress").clear();
		du.what("SignedInvoiceInfo_InvoiceMailAddress").sendKeys(value);
	}
	public String getSignedInvoiceInfo_InvoiceMailAddress() {
		return du.what("SignedInvoiceInfo_InvoiceMailAddress").getAttribute("value");
	}
	//签约发票信息_邮政编码
	public void setSignedInvoiceInfo_PostalCode(String value) {
		du.what("SignedInvoiceInfo_PostalCode").clear();
		du.what("SignedInvoiceInfo_PostalCode").sendKeys(value);
	}
	public String getSignedInvoiceInfo_PostalCode() {
		return du.what("SignedInvoiceInfo_PostalCode").getAttribute("value");
	}
	//对账单信息_邮箱发送对账单
	public void clickReconciliationInfo_MailSendBill() {
		du.what("ReconciliationInfo_MailSendBill").click();
	}
	//对账单信息_Email地址
	public void setReconciliationInfo_EmailAddress(String value) {
		du.what("ReconciliationInfo_EmailAddress").clear();
		du.what("ReconciliationInfo_EmailAddress").sendKeys(value);
	}
	public String getReconciliationInfo_EmailAddress() {
		return du.what("ReconciliationInfo_EmailAddress").getAttribute("value");
	}
	//附加信息_商户管理员姓名
	public void setAddtionInfo_MerchantManagementName(String value) {
		du.what("AddtionInfo_MerchantManagementName").clear();
		du.what("AddtionInfo_MerchantManagementName").sendKeys(value);
	}
	public String getAddtionInfo_MerchantManagementName() {
		return du.what("AddtionInfo_MerchantManagementName").getAttribute("value");
	}
	//附加信息_商户管理员手机号
	public void setAddtionInfo_MerchantManagementPhoneNO(String value) {
		du.what("AddtionInfo_MerchantManagementPhoneNO").clear();
		du.what("AddtionInfo_MerchantManagementPhoneNO").sendKeys(value);
	}
	public String getAddtionInfo_MerchantManagementPhoneNO() {
		return du.what("AddtionInfo_MerchantManagementPhoneNO").getAttribute("value");
	}
	//附加信息_商户管理员Email
	public void setAddtionInfo_MerchantManagementEmail(String value) {
		du.what("AddtionInfo_MerchantManagementEmail").clear();
		du.what("AddtionInfo_MerchantManagementEmail").sendKeys(value);
	}
	public String getAddtionInfo_MerchantManagementEmail() {
		return du.what("AddtionInfo_MerchantManagementEmail").getAttribute("value");
	}
	//附加信息_商户接口类型
	public void selectAddtionInfo_MerchantPortType(String value) {
		du.whatSelect("AddtionInfo_MerchantPortType").selectByValue(value);
	}
	//附件上传_附件
	public void setAttachmentUploading_AttachmentSelect(String content) {
		du.what("AttachmentUploading_AttachmentSelect").sendKeys(content);
	}
	//附件上传_上传
	public void clickAttachmentUploading_Uploading() {
		du.what("AttachmentUploading_Uploading").click();
		du.waitForElementPresent("NoticeForUpload");
	}
	//基本信息_基本信息录入区_二级内部商户类型
	public void selectBasicInfo_InnerMerchantTypeLv2(String value) {
		du.whatSelect("BasicInfo_InnerMerchantTypeLv2").selectByValue(value);
	}
	//确认录入
	public void clickEnterConfirm() {
		du.what("EnterConfirm").click();
	}
	public void setWaitTime(int time) {
		du.waitTime=time;	
	}
//	public String getNoticeForMerchAddSuccess() {
//		if(du.what("Notice").isDisplayed()) {
////			return du.what("Notice").getText();
//			return du.what("Notice").getAttribute("textContent");
//		}
//		return null;
//	}
	//基本信息_基本信息录入区_MCC码
	public void selectBasicInfo_MCC_Select(String value) {
		du.whatSelect("BasicInfo_MCC_Select").selectByValue(value);
	}

}