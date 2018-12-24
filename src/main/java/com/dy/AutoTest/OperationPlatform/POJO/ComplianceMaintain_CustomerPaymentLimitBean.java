package com.dy.AutoTest.OperationPlatform.POJO;

import java.io.Serializable;

public class ComplianceMaintain_CustomerPaymentLimitBean implements Serializable{
	private static final long serialVersionUID = 1L;

	private int ID;
	private String CaseNO;
	private String CustomerNO;
	private String UserNO;
	private String Radio;
	private String Update_UserNO;
	private String Update_UserLv;
	private String Update_DayPaymentLimit;
	private String Update_PaymentSystemRiskLimitMax;
	private String Update_PaymentSystemRiskDailyLimit;
	private String Update_MoneyType;
	private String Update_PayeeOrPaymentSign;
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
	public String getCustomerNO() {
		return CustomerNO;
	}
	public void setCustomerNO(String CustomerNO) {
		this.CustomerNO = CustomerNO;
	}
	public String getUserNO() {
		return UserNO;
	}
	public void setUserNO(String UserNO) {
		this.UserNO = UserNO;
	}
	public String getRadio() {
		return Radio;
	}
	public void setRadio(String Radio) {
		this.Radio = Radio;
	}
	public String getUpdate_UserNO() {
		return Update_UserNO;
	}
	public void setUpdate_UserNO(String Update_UserNO) {
		this.Update_UserNO = Update_UserNO;
	}
	public String getUpdate_UserLv() {
		return Update_UserLv;
	}
	public void setUpdate_UserLv(String Update_UserLv) {
		this.Update_UserLv = Update_UserLv;
	}
	public String getUpdate_DayPaymentLimit() {
		return Update_DayPaymentLimit;
	}
	public void setUpdate_DayPaymentLimit(String Update_DayPaymentLimit) {
		this.Update_DayPaymentLimit = Update_DayPaymentLimit;
	}
	public String getUpdate_PaymentSystemRiskLimitMax() {
		return Update_PaymentSystemRiskLimitMax;
	}
	public void setUpdate_PaymentSystemRiskLimitMax(String Update_PaymentSystemRiskLimitMax) {
		this.Update_PaymentSystemRiskLimitMax = Update_PaymentSystemRiskLimitMax;
	}
	public String getUpdate_PaymentSystemRiskDailyLimit() {
		return Update_PaymentSystemRiskDailyLimit;
	}
	public void setUpdate_PaymentSystemRiskDailyLimit(String Update_PaymentSystemRiskDailyLimit) {
		this.Update_PaymentSystemRiskDailyLimit = Update_PaymentSystemRiskDailyLimit;
	}
	public String getUpdate_MoneyType() {
		return Update_MoneyType;
	}
	public void setUpdate_MoneyType(String Update_MoneyType) {
		this.Update_MoneyType = Update_MoneyType;
	}
	public String getUpdate_PayeeOrPaymentSign() {
		return Update_PayeeOrPaymentSign;
	}
	public void setUpdate_PayeeOrPaymentSign(String Update_PayeeOrPaymentSign) {
		this.Update_PayeeOrPaymentSign = Update_PayeeOrPaymentSign;
	}

}