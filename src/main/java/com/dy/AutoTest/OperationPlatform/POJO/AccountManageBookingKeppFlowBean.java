package com.dy.AutoTest.OperationPlatform.POJO;

import java.io.Serializable;

public class AccountManageBookingKeppFlowBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2119396629111486354L;

	private int ID;
	private String CaseNo;
	private String BusinessSerialNO;
	private String JournalAccountNO;
	private String StatusOfKeepingAccount;
	private String TradeType;
	private String BusinessType;
	private String AccountType;
	private String TradeDateBegin;
	private String TradeDateEnd;

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getCaseNo() {
		return CaseNo;
	}

	public void setCaseNo(String caseNo) {
		CaseNo = caseNo;
	}

	public String getBusinessSerialNO() {
		return BusinessSerialNO;
	}

	public void setBusinessSerialNO(String businessSerialNO) {
		BusinessSerialNO = businessSerialNO;
	}

	public String getJournalAccountNO() {
		return JournalAccountNO;
	}

	public void setJournalAccountNO(String journalAccountNO) {
		JournalAccountNO = journalAccountNO;
	}

	public String getStatusOfKeepingAccount() {
		return StatusOfKeepingAccount;
	}

	public void setStatusOfKeepingAccount(String statusOfKeepingAccount) {
		StatusOfKeepingAccount = statusOfKeepingAccount;
	}

	public String getTradeType() {
		return TradeType;
	}

	public void setTradeType(String tradeType) {
		TradeType = tradeType;
	}

	public String getBusinessType() {
		return BusinessType;
	}

	public void setBusinessType(String businessType) {
		BusinessType = businessType;
	}

	public String getAccountType() {
		return AccountType;
	}

	public void setAccountType(String accountType) {
		AccountType = accountType;
	}

	public String getTradeDateBegin() {
		return TradeDateBegin;
	}

	public void setTradeDateBegin(String tradeDateBegin) {
		TradeDateBegin = tradeDateBegin;
	}

	public String getTradeDateEnd() {
		return TradeDateEnd;
	}

	public void setTradeDateEnd(String tradeDateEnd) {
		TradeDateEnd = tradeDateEnd;
	}

}
