package com.dy.AutoTest.MerchantPortal.POJO;

import java.io.Serializable;

public class MMAddOperBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5209971725579930837L;

	private int ID;
	private String CaseNo;
	private String OperName;
	private String PhoneNO;
	private String Password;
	private String ConfirmPassword;

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

	public String getOperName() {
		return OperName;
	}

	public void setOperName(String operName) {
		OperName = operName;
	}

	public String getPhoneNO() {
		return PhoneNO;
	}

	public void setPhoneNO(String phoneNO) {
		PhoneNO = phoneNO;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public String getConfirmPassword() {
		return ConfirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		ConfirmPassword = confirmPassword;
	}

}
