package com.dy.AutoTest.OperationPlatform.POJO;

import java.io.Serializable;

public class ComplianceMaintain_TradeVerificationWaySetBean implements Serializable{
	private static final long serialVersionUID = 1L;

	private int ID;
	private String CaseNO;
	private String ModeID;
	private String DailyLimit;
	private String VerificationWay;
	private String VerificationQuantity;
	private String Radio;
	private String Update_DailyLimit;
	private String Update_VerificationWay;
	private String Update_VerificationQuantity;
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
	public String getModeID() {
		return ModeID;
	}
	public void setModeID(String ModeID) {
		this.ModeID = ModeID;
	}
	public String getDailyLimit() {
		return DailyLimit;
	}
	public void setDailyLimit(String DailyLimit) {
		this.DailyLimit = DailyLimit;
	}
	public String getVerificationWay() {
		return VerificationWay;
	}
	public void setVerificationWay(String VerificationWay) {
		this.VerificationWay = VerificationWay;
	}
	public String getVerificationQuantity() {
		return VerificationQuantity;
	}
	public void setVerificationQuantity(String VerificationQuantity) {
		this.VerificationQuantity = VerificationQuantity;
	}
	public String getRadio() {
		return Radio;
	}
	public void setRadio(String Radio) {
		this.Radio = Radio;
	}
	public String getUpdate_DailyLimit() {
		return Update_DailyLimit;
	}
	public void setUpdate_DailyLimit(String Update_DailyLimit) {
		this.Update_DailyLimit = Update_DailyLimit;
	}
	public String getUpdate_VerificationWay() {
		return Update_VerificationWay;
	}
	public void setUpdate_VerificationWay(String Update_VerificationWay) {
		this.Update_VerificationWay = Update_VerificationWay;
	}
	public String getUpdate_VerificationQuantity() {
		return Update_VerificationQuantity;
	}
	public void setUpdate_VerificationQuantity(String Update_VerificationQuantity) {
		this.Update_VerificationQuantity = Update_VerificationQuantity;
	}

}