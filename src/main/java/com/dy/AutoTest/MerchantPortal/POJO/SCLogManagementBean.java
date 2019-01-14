package com.dy.AutoTest.MerchantPortal.POJO;

import java.io.Serializable;

public class SCLogManagementBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1546142490493406246L;

	private int ID;
	private String CaseNo;
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
