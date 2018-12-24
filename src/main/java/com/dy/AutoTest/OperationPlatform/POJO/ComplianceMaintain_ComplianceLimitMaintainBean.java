package com.dy.AutoTest.OperationPlatform.POJO;

import java.io.Serializable;

public class ComplianceMaintain_ComplianceLimitMaintainBean implements Serializable{
	private static final long serialVersionUID = 1L;

	private int ID;
	private String CaseNO;
	private String UserLv;
	private String OrgnizationCode;
	private String YearLimitMoney;
	private String PaymentOrgnizationLv;
	private String PayeeOrPaymentSign;
	private String AccountType;
	private String Radio;
	private String Update_YearLimitMoney;
	private String Update_PayeeOrPayerSign;
	private String Update_AccountType;
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
	public String getUserLv() {
		return UserLv;
	}
	public void setUserLv(String UserLv) {
		this.UserLv = UserLv;
	}
	public String getOrgnizationCode() {
		return OrgnizationCode;
	}
	public void setOrgnizationCode(String OrgnizationCode) {
		this.OrgnizationCode = OrgnizationCode;
	}
	public String getYearLimitMoney() {
		return YearLimitMoney;
	}
	public void setYearLimitMoney(String YearLimitMoney) {
		this.YearLimitMoney = YearLimitMoney;
	}
	public String getPaymentOrgnizationLv() {
		return PaymentOrgnizationLv;
	}
	public void setPaymentOrgnizationLv(String PaymentOrgnizationLv) {
		this.PaymentOrgnizationLv = PaymentOrgnizationLv;
	}
	public String getPayeeOrPaymentSign() {
		return PayeeOrPaymentSign;
	}
	public void setPayeeOrPaymentSign(String PayeeOrPaymentSign) {
		this.PayeeOrPaymentSign = PayeeOrPaymentSign;
	}
	public String getAccountType() {
		return AccountType;
	}
	public void setAccountType(String AccountType) {
		this.AccountType = AccountType;
	}
	public String getRadio() {
		return Radio;
	}
	public void setRadio(String Radio) {
		this.Radio = Radio;
	}
	public String getUpdate_YearLimitMoney() {
		return Update_YearLimitMoney;
	}
	public void setUpdate_YearLimitMoney(String Update_YearLimitMoney) {
		this.Update_YearLimitMoney = Update_YearLimitMoney;
	}
	public String getUpdate_PayeeOrPayerSign() {
		return Update_PayeeOrPayerSign;
	}
	public void setUpdate_PayeeOrPayerSign(String Update_PayeeOrPayerSign) {
		this.Update_PayeeOrPayerSign = Update_PayeeOrPayerSign;
	}
	public String getUpdate_AccountType() {
		return Update_AccountType;
	}
	public void setUpdate_AccountType(String Update_AccountType) {
		this.Update_AccountType = Update_AccountType;
	}

}