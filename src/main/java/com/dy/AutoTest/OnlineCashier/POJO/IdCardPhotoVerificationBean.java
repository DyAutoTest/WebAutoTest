package com.dy.AutoTest.OnlineCashier.POJO;

import java.io.Serializable;

public class IdCardPhotoVerificationBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8269575876446665460L;

	private int ID;
	private String CaseNo;
	private String UserMobile;
	private String VerificationComment;

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

	public String getUserMobile() {
		return UserMobile;
	}

	public void setUserMobile(String userMobile) {
		UserMobile = userMobile;
	}

	public String getVerificationComment() {
		return VerificationComment;
	}

	public void setVerificationComment(String verificationComment) {
		VerificationComment = verificationComment;
	}

}
