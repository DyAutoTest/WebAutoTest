package com.dy.AutoTest.OperationPlatform.POJO;

import java.io.Serializable;

public class RiskControlParamManagement_AccountTradeParamMaintainBean implements Serializable{
	private static final long serialVersionUID = 1L;

	private int ID;
	private String CaseNO;
	private String AccountType;
	private String MoneyType;
	private String BusinessType;
	private String TradeType;
	private String Radio;
	private String RealNameSign;
	private String PaymentCollectionSign;
	private String LimitLevel;
	private String BusinessAcceptChannel;
	private String SingleMaxMoney;
	private String SingleMinMoney;
	private String DayLimitMoney;
	private String DayPaymentTimes;
	private String MonthLimitMoney;
	private String MonthPaymentTimes;
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
	public String getRadio() {
		return Radio;
	}
	public void setRadio(String Radio) {
		this.Radio = Radio;
	}
	public String getRealNameSign() {
		return RealNameSign;
	}
	public void setRealNameSign(String RealNameSign) {
		this.RealNameSign = RealNameSign;
	}
	public String getPaymentCollectionSign() {
		return PaymentCollectionSign;
	}
	public void setPaymentCollectionSign(String PaymentCollectionSign) {
		this.PaymentCollectionSign = PaymentCollectionSign;
	}
	public String getLimitLevel() {
		return LimitLevel;
	}
	public void setLimitLevel(String LimitLevel) {
		this.LimitLevel = LimitLevel;
	}
	public String getBusinessAcceptChannel() {
		return BusinessAcceptChannel;
	}
	public void setBusinessAcceptChannel(String BusinessAcceptChannel) {
		this.BusinessAcceptChannel = BusinessAcceptChannel;
	}
	public String getSingleMaxMoney() {
		return SingleMaxMoney;
	}
	public void setSingleMaxMoney(String SingleMaxMoney) {
		this.SingleMaxMoney = SingleMaxMoney;
	}
	public String getSingleMinMoney() {
		return SingleMinMoney;
	}
	public void setSingleMinMoney(String SingleMinMoney) {
		this.SingleMinMoney = SingleMinMoney;
	}
	public String getDayLimitMoney() {
		return DayLimitMoney;
	}
	public void setDayLimitMoney(String DayLimitMoney) {
		this.DayLimitMoney = DayLimitMoney;
	}
	public String getDayPaymentTimes() {
		return DayPaymentTimes;
	}
	public void setDayPaymentTimes(String DayPaymentTimes) {
		this.DayPaymentTimes = DayPaymentTimes;
	}
	public String getMonthLimitMoney() {
		return MonthLimitMoney;
	}
	public void setMonthLimitMoney(String MonthLimitMoney) {
		this.MonthLimitMoney = MonthLimitMoney;
	}
	public String getMonthPaymentTimes() {
		return MonthPaymentTimes;
	}
	public void setMonthPaymentTimes(String MonthPaymentTimes) {
		this.MonthPaymentTimes = MonthPaymentTimes;
	}

}