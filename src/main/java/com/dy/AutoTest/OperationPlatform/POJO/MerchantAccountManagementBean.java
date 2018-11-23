package com.dy.AutoTest.OperationPlatform.POJO;

import java.io.Serializable;

public class MerchantAccountManagementBean implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int ID;
	private String CaseNO;
	private String MerchantNO;
	private String MerchantName;
	private String SearchMer_Radio;
	private String AccountNO;
	private String MerType;
	private String AccountType;
	private String MerStatus;
	private String AccountStatus;
	private String Radio;
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
	public String getMerchantNO() {
		return MerchantNO;
	}
	public void setMerchantNO(String merchantNO) {
		MerchantNO = merchantNO;
	}
	public String getMerchantName() {
		return MerchantName;
	}
	public void setMerchantName(String merchantName) {
		MerchantName = merchantName;
	}
	public String getSearchMer_Radio() {
		return SearchMer_Radio;
	}
	public void setSearchMer_Radio(String searchMer_Radio) {
		SearchMer_Radio = searchMer_Radio;
	}
	public String getAccountNO() {
		return AccountNO;
	}
	public void setAccountNO(String accountNO) {
		AccountNO = accountNO;
	}
	public String getMerType() {
		return MerType;
	}
	public void setMerType(String merType) {
		MerType = merType;
	}
	public String getAccountType() {
		return AccountType;
	}
	public void setAccountType(String accountType) {
		AccountType = accountType;
	}
	public String getMerStatus() {
		return MerStatus;
	}
	public void setMerStatus(String merStatus) {
		MerStatus = merStatus;
	}
	public String getAccountStatus() {
		return AccountStatus;
	}
	public void setAccountStatus(String accountStatus) {
		AccountStatus = accountStatus;
	}
	public String getRadio() {
		return Radio;
	}
	public void setRadio(String radio) {
		Radio = radio;
	}
	
	
	
}
