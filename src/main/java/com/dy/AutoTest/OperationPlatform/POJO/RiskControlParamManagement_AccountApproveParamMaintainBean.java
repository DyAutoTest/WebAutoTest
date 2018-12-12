package com.dy.AutoTest.OperationPlatform.POJO;

import java.io.Serializable;

public class RiskControlParamManagement_AccountApproveParamMaintainBean implements Serializable{
	private static final long serialVersionUID = 1L;

	private int ID;
	private String CaseNO;
	private String AccountType;
	private String MoneyType;
	private String BusinessType;
	private String TradeType;
	private String LevelLimit;
	private String Radio;
	private String SingleApproveLimit;
	private String DayApproveLimit;
	private String DayApproveTimes;
	private String MonthApproveLimit;
	private String MonthApproveTimes;
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
	public String getBusinessType() {
		return BusinessType;
	}
	public void setBusinessType(String BusinessType) {
		this.BusinessType = BusinessType;
	}
	public String getTradeType() {
		return TradeType;
	}
	public void setTradeType(String TradeType) {
		this.TradeType = TradeType;
	}
	public String getLevelLimit() {
		return LevelLimit;
	}
	public void setLevelLimit(String LevelLimit) {
		this.LevelLimit = LevelLimit;
	}
	public String getRadio() {
		return Radio;
	}
	public void setRadio(String Radio) {
		this.Radio = Radio;
	}
	public String getSingleApproveLimit() {
		return SingleApproveLimit;
	}
	public void setSingleApproveLimit(String SingleApproveLimit) {
		this.SingleApproveLimit = SingleApproveLimit;
	}
	public String getDayApproveLimit() {
		return DayApproveLimit;
	}
	public void setDayApproveLimit(String DayApproveLimit) {
		this.DayApproveLimit = DayApproveLimit;
	}
	public String getDayApproveTimes() {
		return DayApproveTimes;
	}
	public void setDayApproveTimes(String DayApproveTimes) {
		this.DayApproveTimes = DayApproveTimes;
	}
	public String getMonthApproveLimit() {
		return MonthApproveLimit;
	}
	public void setMonthApproveLimit(String MonthApproveLimit) {
		this.MonthApproveLimit = MonthApproveLimit;
	}
	public String getMonthApproveTimes() {
		return MonthApproveTimes;
	}
	public void setMonthApproveTimes(String MonthApproveTimes) {
		this.MonthApproveTimes = MonthApproveTimes;
	}

}