package com.dy.AutoTest.OperationPlatform.POJO;

import java.io.Serializable;

public class IdCardValidDateVerificationBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7628344243954144465L;

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
