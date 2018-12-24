package com.dy.AutoTest.OperationPlatform.POJO;

import java.io.Serializable;

public class MonitorRulesManagement_MonitorRulesMaintainBean implements Serializable{
	private static final long serialVersionUID = 1L;

	private int ID;
	private String CaseNO;
	private String RuleNO;
	private String DailyCheck;
	private String Radio;
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
	public String getRuleNO() {
		return RuleNO;
	}
	public void setRuleNO(String RuleNO) {
		this.RuleNO = RuleNO;
	}
	public String getDailyCheck() {
		return DailyCheck;
	}
	public void setDailyCheck(String DailyCheck) {
		this.DailyCheck = DailyCheck;
	}
	public String getRadio() {
		return Radio;
	}
	public void setRadio(String Radio) {
		this.Radio = Radio;
	}

}