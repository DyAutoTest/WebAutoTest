package com.dy.AutoTest.OperationPlatform.POJO;

import java.io.Serializable;

public class RiskControlWarning_EmailWarningBean implements Serializable{
	private static final long serialVersionUID = 1L;

	private int ID;
	private String CaseNO;
	private String WarningName;
	private String EmailAddress;
	private String Radio;
	private String Add_WarningName;
	private String Add_EmailAddress;
	private String Update_WarningName;
	private String Update_EmailAddress;
	public int getID() {
		return ID;
	}
	public void setID(int ID) {
		this.ID = ID;
	}
	public String getCaseNO() {
		return CaseNO;
	}
	public void setCaseNO(String CaseNO) {
		this.CaseNO = CaseNO;
	}
	public String getWarningName() {
		return WarningName;
	}
	public void setWarningName(String WarningName) {
		this.WarningName = WarningName;
	}
	public String getEmailAddress() {
		return EmailAddress;
	}
	public void setEmailAddress(String EmailAddress) {
		this.EmailAddress = EmailAddress;
	}
	public String getRadio() {
		return Radio;
	}
	public void setRadio(String Radio) {
		this.Radio = Radio;
	}
	public String getAdd_WarningName() {
		return Add_WarningName;
	}
	public void setAdd_WarningName(String Add_WarningName) {
		this.Add_WarningName = Add_WarningName;
	}
	public String getAdd_EmailAddress() {
		return Add_EmailAddress;
	}
	public void setAdd_EmailAddress(String Add_EmailAddress) {
		this.Add_EmailAddress = Add_EmailAddress;
	}
	public String getUpdate_WarningName() {
		return Update_WarningName;
	}
	public void setUpdate_WarningName(String Update_WarningName) {
		this.Update_WarningName = Update_WarningName;
	}
	public String getUpdate_EmailAddress() {
		return Update_EmailAddress;
	}
	public void setUpdate_EmailAddress(String Update_EmailAddress) {
		this.Update_EmailAddress = Update_EmailAddress;
	}

}