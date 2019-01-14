package com.dy.AutoTest.MerchantPortal.POJO;

import java.io.Serializable;

public class AccountInfoBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3513961246104612511L;

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
