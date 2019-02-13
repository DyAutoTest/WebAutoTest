package com.dy.AutoTest.OperationPlatform.POJO;

import java.io.Serializable;

public class AccountManageSummonsQueryBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -931338497122250039L;

	private int ID;
	private String CaseNo;
	private String SummonsNum;
	private String AccountSerialNum;
	private String AccountType;
	private String DateBegin;
	private String DateEnd;
	private String AccountNo;
	private String AccountAffiliationOrgnization;
	private String ManualSummonsFlag;

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

	public String getSummonsNum() {
		return SummonsNum;
	}

	public void setSummonsNum(String summonsNum) {
		SummonsNum = summonsNum;
	}

	public String getAccountSerialNum() {
		return AccountSerialNum;
	}

	public void setAccountSerialNum(String accountSerialNum) {
		AccountSerialNum = accountSerialNum;
	}

	public String getAccountType() {
		return AccountType;
	}

	public void setAccountType(String accountType) {
		AccountType = accountType;
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

	public String getAccountNo() {
		return AccountNo;
	}

	public void setAccountNo(String accountNo) {
		AccountNo = accountNo;
	}

	public String getAccountAffiliationOrgnization() {
		return AccountAffiliationOrgnization;
	}

	public void setAccountAffiliationOrgnization(String accountAffiliationOrgnization) {
		AccountAffiliationOrgnization = accountAffiliationOrgnization;
	}

	public String getManualSummonsFlag() {
		return ManualSummonsFlag;
	}

	public void setManualSummonsFlag(String manualSummonsFlag) {
		ManualSummonsFlag = manualSummonsFlag;
	}

}
