package com.dy.AutoTest.OnlineCashier.POJO;

import java.io.Serializable;

public class AccountManageInternalAccountManageBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5346891055219374661L;

	private int ID;
	private String CaseNo;
	private String InternalAccountType;
	private String InternalAccountNO;
	private String ConditionCode;
	private String AccountsBelongingOrgnization;
	private String Status;
	private String InternalAccountName;

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

	public String getInternalAccountType() {
		return InternalAccountType;
	}

	public void setInternalAccountType(String internalAccountType) {
		InternalAccountType = internalAccountType;
	}

	public String getInternalAccountNO() {
		return InternalAccountNO;
	}

	public void setInternalAccountNO(String internalAccountNO) {
		InternalAccountNO = internalAccountNO;
	}

	public String getConditionCode() {
		return ConditionCode;
	}

	public void setConditionCode(String conditionCode) {
		ConditionCode = conditionCode;
	}

	public String getAccountsBelongingOrgnization() {
		return AccountsBelongingOrgnization;
	}

	public void setAccountsBelongingOrgnization(String accountsBelongingOrgnization) {
		AccountsBelongingOrgnization = accountsBelongingOrgnization;
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}

	public String getInternalAccountName() {
		return InternalAccountName;
	}

	public void setInternalAccountName(String internalAccountName) {
		InternalAccountName = internalAccountName;
	}
	
}
