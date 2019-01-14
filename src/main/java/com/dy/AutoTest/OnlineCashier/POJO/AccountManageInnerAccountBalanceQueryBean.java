package com.dy.AutoTest.OnlineCashier.POJO;

import java.io.Serializable;

public class AccountManageInnerAccountBalanceQueryBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8377545029452782747L;

	private int ID;
	private String CaseNo;
	private String AccountType;
	private String AccountNO;

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

	public String getAccountType() {
		return AccountType;
	}

	public void setAccountType(String accountType) {
		AccountType = accountType;
	}

	public String getAccountNO() {
		return AccountNO;
	}

	public void setAccountNO(String accountNO) {
		AccountNO = accountNO;
	}

}
