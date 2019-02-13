package com.dy.AutoTest.MerchantPortal.POJO;

import java.io.Serializable;

public class TMAccountQueryBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -861731944744237321L;

	private int ID;
	private String CaseNo;
	private String DateBegin;
	private String DateEnd;
	private String TradeType;
	private String AccountType;
	private String IncomeExpensesSign;
	private String MerchantOrderNO;

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

	public String getDateBegin() {
		return DateBegin;
	}

	public void setDateBegin(String dateBegin) {
		DateBegin = dateBegin;
	}

	public String getDateEnd() {
		return DateEnd;
	}

	public void setDateEnd(String dateEnd) {
		DateEnd = dateEnd;
	}

	public String getTradeType() {
		return TradeType;
	}

	public void setTradeType(String tradeType) {
		TradeType = tradeType;
	}

	public String getAccountType() {
		return AccountType;
	}

	public void setAccountType(String accountType) {
		AccountType = accountType;
	}

	public String getIncomeExpensesSign() {
		return IncomeExpensesSign;
	}

	public void setIncomeExpensesSign(String incomeExpensesSign) {
		IncomeExpensesSign = incomeExpensesSign;
	}

	public String getMerchantOrderNO() {
		return MerchantOrderNO;
	}

	public void setMerchantOrderNO(String merchantOrderNO) {
		MerchantOrderNO = merchantOrderNO;
	}

}
