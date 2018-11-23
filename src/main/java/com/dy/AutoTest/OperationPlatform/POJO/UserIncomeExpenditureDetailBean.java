package com.dy.AutoTest.OperationPlatform.POJO;

import java.io.Serializable;

public class UserIncomeExpenditureDetailBean implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private int ID;
	private String CaseNO;
	private String MobileNO;
	private String InnerUserNO;
	private String StartDate;
	private String EndDate;
	private String TransactionType;
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
	public String getInnerUserNO() {
		return InnerUserNO;
	}
	public void setInnerUserNO(String innerUserNO) {
		InnerUserNO = innerUserNO;
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
	public String getTransactionType() {
		return TransactionType;
	}
	public void setTransactionType(String transactionType) {
		TransactionType = transactionType;
	}
	
	
	
}
