package com.dy.AutoTest.OperationPlatform.POJO;

import java.io.Serializable;

public class RiskControlParamManagement_AccountBalanceParamMaintainBean implements Serializable{
	private static final long serialVersionUID = 1L;

	private int ID;
	private String CaseNO;
	private String AccountType;
	private String MoneyType;
	private String RealNameSign;
	private String Radio;
	private String MaxBalanceLimit;
	private String Update_AccountType;
	private String Update_MoneyType;
	private String Update_RealNameSign;
	private String Update_MaxBalanceLimit;
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
	public String getAccountType() {
		return AccountType;
	}
	public void setAccountType(String AccountType) {
		this.AccountType = AccountType;
	}
	public String getMoneyType() {
		return MoneyType;
	}
	public void setMoneyType(String MoneyType) {
		this.MoneyType = MoneyType;
	}
	public String getRealNameSign() {
		return RealNameSign;
	}
	public void setRealNameSign(String RealNameSign) {
		this.RealNameSign = RealNameSign;
	}
	public String getRadio() {
		return Radio;
	}
	public void setRadio(String Radio) {
		this.Radio = Radio;
	}
	public String getMaxBalanceLimit() {
		return MaxBalanceLimit;
	}
	public void setMaxBalanceLimit(String MaxBalanceLimit) {
		this.MaxBalanceLimit = MaxBalanceLimit;
	}
	public String getUpdate_AccountType() {
		return Update_AccountType;
	}
	public void setUpdate_AccountType(String Update_AccountType) {
		this.Update_AccountType = Update_AccountType;
	}
	public String getUpdate_MoneyType() {
		return Update_MoneyType;
	}
	public void setUpdate_MoneyType(String Update_MoneyType) {
		this.Update_MoneyType = Update_MoneyType;
	}
	public String getUpdate_RealNameSign() {
		return Update_RealNameSign;
	}
	public void setUpdate_RealNameSign(String Update_RealNameSign) {
		this.Update_RealNameSign = Update_RealNameSign;
	}
	public String getUpdate_MaxBalanceLimit() {
		return Update_MaxBalanceLimit;
	}
	public void setUpdate_MaxBalanceLimit(String Update_MaxBalanceLimit) {
		this.Update_MaxBalanceLimit = Update_MaxBalanceLimit;
	}

}