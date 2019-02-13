package com.dy.AutoTest.MerchantPortal.POJO;

import java.io.Serializable;

public class SCUpdateLoginPasswordBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4311997470820654911L;

	private int ID;
	private String CaseNo;
	private String OriginLoginPassword;
	private String NewLoginPassword;
	private String ConfirmNewLoginPassword;

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

	public String getOriginLoginPassword() {
		return OriginLoginPassword;
	}

	public void setOriginLoginPassword(String originLoginPassword) {
		OriginLoginPassword = originLoginPassword;
	}

	public String getNewLoginPassword() {
		return NewLoginPassword;
	}

	public void setNewLoginPassword(String newLoginPassword) {
		NewLoginPassword = newLoginPassword;
	}

	public String getConfirmNewLoginPassword() {
		return ConfirmNewLoginPassword;
	}

	public void setConfirmNewLoginPassword(String confirmNewLoginPassword) {
		ConfirmNewLoginPassword = confirmNewLoginPassword;
	}

}
