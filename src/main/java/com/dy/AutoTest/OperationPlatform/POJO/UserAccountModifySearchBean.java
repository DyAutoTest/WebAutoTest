package com.dy.AutoTest.OperationPlatform.POJO;

import java.io.Serializable;

public class UserAccountModifySearchBean implements Serializable{
		
	private static final long serialVersionUID = 1L;
	private int ID;
	private String CaseNO;
	private String MobileNO;
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
	
	
	
}
