package com.dy.AutoTest.OperationPlatform.POJO;

import java.io.Serializable;

public class BlackWhiteListManagement_WhiteListMaintainBean implements Serializable{
	private static final long serialVersionUID = 1L;

	private int ID;
	private String CaseNO;
	private String PhoneOrMerchantNO;
	private String TradeType;
	private String DateBegin;
	private String DateEnd;
	private String ReleaseStatus;
	private String Radio;
	private String PersonalEnterpraiseStatus;
	private String AddReason;
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
	public String getPhoneOrMerchantNO() {
		return PhoneOrMerchantNO;
	}
	public void setPhoneOrMerchantNO(String PhoneOrMerchantNO) {
		this.PhoneOrMerchantNO = PhoneOrMerchantNO;
	}
	public String getTradeType() {
		return TradeType;
	}
	public void setTradeType(String TradeType) {
		this.TradeType = TradeType;
	}
	public String getDateBegin() {
		return DateBegin;
	}
	public void setDateBegin(String DateBegin) {
		this.DateBegin = DateBegin;
	}
	public String getDateEnd() {
		return DateEnd;
	}
	public void setDateEnd(String DateEnd) {
		this.DateEnd = DateEnd;
	}
	public String getReleaseStatus() {
		return ReleaseStatus;
	}
	public void setReleaseStatus(String ReleaseStatus) {
		this.ReleaseStatus = ReleaseStatus;
	}
	public String getRadio() {
		return Radio;
	}
	public void setRadio(String Radio) {
		this.Radio = Radio;
	}
	public String getPersonalEnterpraiseStatus() {
		return PersonalEnterpraiseStatus;
	}
	public void setPersonalEnterpraiseStatus(String PersonalEnterpraiseStatus) {
		this.PersonalEnterpraiseStatus = PersonalEnterpraiseStatus;
	}
	public String getAddReason() {
		return AddReason;
	}
	public void setAddReason(String AddReason) {
		this.AddReason = AddReason;
	}

}