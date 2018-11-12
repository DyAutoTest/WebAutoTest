package com.dy.AutoTest.OperationPlatform.POJO;

import java.io.Serializable;

public class UserActionBean implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private int ID;
	private String CaseNO;
	private String MobileNO;
	private String StartDate;
	private String EndDate;
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
	public String getMobileNO() {
		return MobileNO;
	}
	public void setMobileNO(String mobileNO) {
		MobileNO = mobileNO;
	}
	public String getStartDate() {
		return StartDate;
	}
	public void setStartDate(String startDate) {
		StartDate = startDate;
	}
	public String getEndDate() {
		return EndDate;
	}
	public void setEndDate(String endDate) {
		EndDate = endDate;
	}
	
	
}
