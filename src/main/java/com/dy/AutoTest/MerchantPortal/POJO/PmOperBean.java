package com.dy.AutoTest.MerchantPortal.POJO;

import java.io.Serializable;

public class PmOperBean implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3283487097169837697L;
	
	private String CaseNO;
	private String OperID;
	private String password;
	private String comment;
	private String mobileNO;
	private String payPwd;

	public PmOperBean() {

	}

	public PmOperBean(String operID, String password, String mobileNO, String comment) {
		this.OperID = operID;
		this.password = password;
		this.mobileNO = mobileNO;
		this.comment = comment;
	}

	public String getCaseNO() {
		return CaseNO;
	}

	public void setCaseNO(String caseNO) {
		CaseNO = caseNO;
	}

	public String getOperID() {
		return OperID;
	}

	public void setOperID(String operID) {
		this.OperID = operID;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMobileNO() {
		return mobileNO;
	}

	public void setMobileNO(String mobileNO) {
		this.mobileNO = mobileNO;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getPayPwd() {
		return payPwd;
	}

	public void setPayPwd(String payPwd) {
		this.payPwd = payPwd;
	}

	public void displayInfo() {
		System.out.println("TestCaseID:" + CaseNO);
		System.out.println("OperID:" + getOperID());
		System.out.println("password:" + getPassword());
		System.out.println("comment:" + getComment());
		System.out.println("mobileNO:" + getMobileNO());
		System.out.println("payPwd:" + getPayPwd());
	}
}
