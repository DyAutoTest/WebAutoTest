package com.dy.AutoTest.OperationPlatform.POJO;

import java.io.Serializable;

public class UserInfoQueryBean implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	private int ID;
	private String CaseNO;
	private String MobileNO;
	private String InnerUserNO;
	private String CredentialType;
	private String CredentialNO;
	private String AccountGrade;
	private String FrozenReason;
	private String UnFrozenReason;
	private String ResetPasswordFlag;
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
	public String getCredentialType() {
		return CredentialType;
	}
	public void setCredentialType(String credentialType) {
		CredentialType = credentialType;
	}
	public String getCredentialNO() {
		return CredentialNO;
	}
	public void setCredentialNO(String credentialNO) {
		CredentialNO = credentialNO;
	}
	public String getAccountGrade() {
		return AccountGrade;
	}
	public void setAccountGrade(String accountGrade) {
		AccountGrade = accountGrade;
	}
	public String getFrozenReason() {
		return FrozenReason;
	}
	public void setFrozenReason(String frozenReason) {
		FrozenReason = frozenReason;
	}
	public String getUnFrozenReason() {
		return UnFrozenReason;
	}
	public void setUnFrozenReason(String unFrozenReason) {
		UnFrozenReason = unFrozenReason;
	}
	public String getResetPasswordFlag() {
		return ResetPasswordFlag;
	}
	public void setResetPasswordFlag(String resetPasswordFlag) {
		ResetPasswordFlag = resetPasswordFlag;
	}
	
	
	
}
