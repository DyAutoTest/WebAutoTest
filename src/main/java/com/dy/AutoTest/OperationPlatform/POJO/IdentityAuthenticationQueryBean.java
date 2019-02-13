package com.dy.AutoTest.OperationPlatform.POJO;

import java.io.Serializable;

public class IdentityAuthenticationQueryBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7714064724995125739L;

	private int ID;
	private String InnerUserId;
	private String CertificateStatus;
	private String ValidDateFrom;
	private String ValidDateTo;

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

	public String getCertificateStatus() {
		return CertificateStatus;
	}

	public void setCertificateStatus(String certificateStatus) {
		CertificateStatus = certificateStatus;
	}

	public String getValidDateFrom() {
		return ValidDateFrom;
	}

	public void setValidDateFrom(String validDateFrom) {
		ValidDateFrom = validDateFrom;
	}

	public String getValidDateTo() {
		return ValidDateTo;
	}

	public void setValidDateTo(String validDateTo) {
		ValidDateTo = validDateTo;
	}

}
