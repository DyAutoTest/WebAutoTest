package com.dy.AutoTest.MerchantPortal.POJO;

import java.io.Serializable;

public class HelpCenterBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3898380042199562979L;

	private int ID;
	private String CaseNo;

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

}
