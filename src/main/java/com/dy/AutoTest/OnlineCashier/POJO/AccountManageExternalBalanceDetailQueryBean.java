package com.dy.AutoTest.OnlineCashier.POJO;

import java.io.Serializable;

public class AccountManageExternalBalanceDetailQueryBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2812920272615761145L;

	private int ID;
	private String CaseNo;
	private String AccountNO;
	private String AccountType;
	private String InnerUserName;
	private String AccountingDateBegin;
	private String AccountingDateEnd;
	private String AccountingSerialNO;
	private String InnerOrderNO;
	private String Status;

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

	public String getAccountNO() {
		return AccountNO;
	}

	public void setAccountNO(String accountNO) {
		AccountNO = accountNO;
	}

	public String getAccountType() {
		return AccountType;
	}

	public void setAccountType(String accountType) {
		AccountType = accountType;
	}

	public String getInnerUserName() {
		return InnerUserName;
	}

	public void setInnerUserName(String innerUserName) {
		InnerUserName = innerUserName;
	}

	public String getAccountingDateBegin() {
		return AccountingDateBegin;
	}

	public void setAccountingDateBegin(String accountingDateBegin) {
		AccountingDateBegin = accountingDateBegin;
	}

	public String getAccountingDateEnd() {
		return AccountingDateEnd;
	}

	public void setAccountingDateEnd(String accountingDateEnd) {
		AccountingDateEnd = accountingDateEnd;
	}

	public String getAccountingSerialNO() {
		return AccountingSerialNO;
	}

	public void setAccountingSerialNO(String accountingSerialNO) {
		AccountingSerialNO = accountingSerialNO;
	}

	public String getInnerOrderNO() {
		return InnerOrderNO;
	}

	public void setInnerOrderNO(String innerOrderNO) {
		InnerOrderNO = innerOrderNO;
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}

}
