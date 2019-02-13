package com.dy.AutoTest.MerchantPortal.POJO;

import java.io.Serializable;

public class SCUpdatePaymentPasswordBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4948489744991004901L;

	private int ID;
	private String CaseNo;
	private String OriginPaymentPassword;
	private String NewPaymentPassword;
	private String ConfirmNewPaymentPassword;

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

	public String getOriginPaymentPassword() {
		return OriginPaymentPassword;
	}

	public void setOriginPaymentPassword(String originPaymentPassword) {
		OriginPaymentPassword = originPaymentPassword;
	}

	public String getNewPaymentPassword() {
		return NewPaymentPassword;
	}

	public void setNewPaymentPassword(String newPaymentPassword) {
		NewPaymentPassword = newPaymentPassword;
	}

	public String getConfirmNewPaymentPassword() {
		return ConfirmNewPaymentPassword;
	}

	public void setConfirmNewPaymentPassword(String confirmNewPaymentPassword) {
		ConfirmNewPaymentPassword = confirmNewPaymentPassword;
	}

}
