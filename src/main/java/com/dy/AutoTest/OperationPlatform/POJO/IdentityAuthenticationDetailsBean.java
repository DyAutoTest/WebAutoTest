package com.dy.AutoTest.OperationPlatform.POJO;

import java.io.Serializable;

public class IdentityAuthenticationDetailsBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2065973662850557643L;
	
	private int ID;
	private String InnerUserId;
	private String UserName;
	private String CertificateStatus;
	private String CertificateNumber;
	
	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getInnerUserId() {
		return InnerUserId;
	}
	
	public void setInnerUserId(String innerUserId) {
		InnerUserId = innerUserId;
	}
	
	public String getUserName() {
		return UserName;
	}
	
	public void setUserName(String userName) {
		UserName = userName;
	}
	
	public String getCertificateStatus() {
		return CertificateStatus;
	}
	
	public void setCertificateStatus(String certificateStatus) {
		CertificateStatus = certificateStatus;
	}
	
	public String getCertificateNumber() {
		return CertificateNumber;
	}
	
	public void setCertificateNumber(String certificateNumber) {
		CertificateNumber = certificateNumber;
	}
	
}
