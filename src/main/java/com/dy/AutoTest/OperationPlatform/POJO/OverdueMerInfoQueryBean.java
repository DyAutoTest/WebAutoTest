package com.dy.AutoTest.OperationPlatform.POJO;

import java.io.Serializable;

public class OverdueMerInfoQueryBean implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int ID;
	private String CaseNO;
	private String RemindDateBegin;
	private String RemindDateEnd;
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getCaseNO() {
		return CaseNO;
	}
	public void setCaseNO(String caseNO) {
		CaseNO = caseNO;
	}
	public String getRemindDateBegin() {
		return RemindDateBegin;
	}
	public void setRemindDateBegin(String remindDateBegin) {
		RemindDateBegin = remindDateBegin;
	}
	public String getRemindDateEnd() {
		return RemindDateEnd;
	}
	public void setRemindDateEnd(String remindDateEnd) {
		RemindDateEnd = remindDateEnd;
	}
	
}
