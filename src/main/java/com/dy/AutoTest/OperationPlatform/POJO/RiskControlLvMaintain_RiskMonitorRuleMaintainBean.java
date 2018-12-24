package com.dy.AutoTest.OperationPlatform.POJO;

import java.io.Serializable;

public class RiskControlLvMaintain_RiskMonitorRuleMaintainBean implements Serializable{
	private static final long serialVersionUID = 1L;

	private int ID;
	private String CaseNO;
	private String RiskMonitorRuleID;
	private String RiskLv;
	private String MonitorWay;
	private String InformEmail;
	private String InformPhone;
	private String Radio;
	private String Update_MonitorWay;
	private String Update_InformEmail;
	private String Update_InformPhone;
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
	public String getRiskMonitorRuleID() {
		return RiskMonitorRuleID;
	}
	public void setRiskMonitorRuleID(String RiskMonitorRuleID) {
		this.RiskMonitorRuleID = RiskMonitorRuleID;
	}
	public String getRiskLv() {
		return RiskLv;
	}
	public void setRiskLv(String RiskLv) {
		this.RiskLv = RiskLv;
	}
	public String getMonitorWay() {
		return MonitorWay;
	}
	public void setMonitorWay(String MonitorWay) {
		this.MonitorWay = MonitorWay;
	}
	public String getInformEmail() {
		return InformEmail;
	}
	public void setInformEmail(String InformEmail) {
		this.InformEmail = InformEmail;
	}
	public String getInformPhone() {
		return InformPhone;
	}
	public void setInformPhone(String InformPhone) {
		this.InformPhone = InformPhone;
	}
	public String getRadio() {
		return Radio;
	}
	public void setRadio(String Radio) {
		this.Radio = Radio;
	}
	public String getUpdate_MonitorWay() {
		return Update_MonitorWay;
	}
	public void setUpdate_MonitorWay(String Update_MonitorWay) {
		this.Update_MonitorWay = Update_MonitorWay;
	}
	public String getUpdate_InformEmail() {
		return Update_InformEmail;
	}
	public void setUpdate_InformEmail(String Update_InformEmail) {
		this.Update_InformEmail = Update_InformEmail;
	}
	public String getUpdate_InformPhone() {
		return Update_InformPhone;
	}
	public void setUpdate_InformPhone(String Update_InformPhone) {
		this.Update_InformPhone = Update_InformPhone;
	}

}