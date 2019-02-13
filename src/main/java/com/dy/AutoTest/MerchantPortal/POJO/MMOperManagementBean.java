package com.dy.AutoTest.MerchantPortal.POJO;

import java.io.Serializable;

public class MMOperManagementBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2508570887434096536L;

	private int ID;
	private String CaseNo;
	private String OperManagement_LoginName;
	private String OperManagement_OperName;
	private String OperManagement_PhoneNO;
	private String OperManagement_OperType;
	private String OperManagement_Status;
	private String OperLog_BeginDate;
	private String OperLog_EndDate;
	private String OperLog_Oper;

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

	public String getOperManagement_LoginName() {
		return OperManagement_LoginName;
	}

	public void setOperManagement_LoginName(String operManagement_LoginName) {
		OperManagement_LoginName = operManagement_LoginName;
	}

	public String getOperManagement_OperName() {
		return OperManagement_OperName;
	}

	public void setOperManagement_OperName(String operManagement_OperName) {
		OperManagement_OperName = operManagement_OperName;
	}
	
	public String getOperManagement_PhoneNO() {
		return OperManagement_PhoneNO;
	}

	public void setOperManagement_PhoneNO(String operManagement_PhoneNO) {
		OperManagement_PhoneNO = operManagement_PhoneNO;
	}

	public String getOperManagement_OperType() {
		return OperManagement_OperType;
	}

	public void setOperManagement_OperType(String operManagement_OperType) {
		OperManagement_OperType = operManagement_OperType;
	}

	public String getOperManagement_Status() {
		return OperManagement_Status;
	}

	public void setOperManagement_Status(String operManagement_Status) {
		OperManagement_Status = operManagement_Status;
	}

	public String getOperLog_BeginDate() {
		return OperLog_BeginDate;
	}

	public void setOperLog_BeginDate(String operLog_BeginDate) {
		OperLog_BeginDate = operLog_BeginDate;
	}

	public String getOperLog_EndDate() {
		return OperLog_EndDate;
	}

	public void setOperLog_EndDate(String operLog_EndDate) {
		OperLog_EndDate = operLog_EndDate;
	}

	public String getOperLog_Oper() {
		return OperLog_Oper;
	}

	public void setOperLog_Oper(String operLog_Oper) {
		OperLog_Oper = operLog_Oper;
	}
	
}
