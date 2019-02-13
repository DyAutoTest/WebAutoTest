package com.dy.AutoTest.OperationPlatform.POJO;

import java.io.Serializable;

public class AccountManageManualAccountCheckBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5977609570944604661L;

	private int ID;
	private String CaseNo;
	private String SerialNum;
	private String Status;
	private String DateBegin;
	private String DateEnd;
	private String Comment;

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

	public String getSerialNum() {
		return SerialNum;
	}

	public void setSerialNum(String serialNum) {
		SerialNum = serialNum;
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
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

	public String getComment() {
		return Comment;
	}

	public void setComment(String comment) {
		Comment = comment;
	}

}
