package com.dy.AutoTest.OperationPlatform.POJO;

import java.io.Serializable;

public class AccountManageOnlineInternalAccountPaymentQueryBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8036178860960495065L;

	private int ID;
	private String CaseNo;
	private String InnerAccountNO;
	private String AccountType;
	private String MoneyStatus;
	private String DateBegin;
	private String DateEnd;

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

	public String getInnerAccountNO() {
		return InnerAccountNO;
	}

	public void setInnerAccountNO(String innerAccountNO) {
		InnerAccountNO = innerAccountNO;
	}

	public String getAccountType() {
		return AccountType;
	}

	public void setAccountType(String accountType) {
		AccountType = accountType;
	}

	public String getMoneyStatus() {
		return MoneyStatus;
	}

	public void setMoneyStatus(String moneyStatus) {
		MoneyStatus = moneyStatus;
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

}
