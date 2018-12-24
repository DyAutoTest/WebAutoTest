package com.dy.AutoTest.OperationPlatform.POJO;

import java.io.Serializable;

public class MonitorRulesManagement_MonitorParameterMaintainBean implements Serializable{
	private static final long serialVersionUID = 1L;

	private int ID;
	private String CaseNO;
	private String MonitorRule;
	private String MonitorParameterMaintain;
	private String MonitorParameterValue;
	private String PersonalMonitorParameterValue;
	private String MerchantMonitorParameterValue;
	private String Radio;
	private String Update_MonitorParameterName;
	private String Update_MonitorParameterValue;
	private String Update_PersonalMonitorParameterValue;
	private String Update_MerchantMonitorParameterValue;
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
	public String getMonitorRule() {
		return MonitorRule;
	}
	public void setMonitorRule(String MonitorRule) {
		this.MonitorRule = MonitorRule;
	}
	public String getMonitorParameterMaintain() {
		return MonitorParameterMaintain;
	}
	public void setMonitorParameterMaintain(String MonitorParameterMaintain) {
		this.MonitorParameterMaintain = MonitorParameterMaintain;
	}
	public String getMonitorParameterValue() {
		return MonitorParameterValue;
	}
	public void setMonitorParameterValue(String MonitorParameterValue) {
		this.MonitorParameterValue = MonitorParameterValue;
	}
	public String getPersonalMonitorParameterValue() {
		return PersonalMonitorParameterValue;
	}
	public void setPersonalMonitorParameterValue(String PersonalMonitorParameterValue) {
		this.PersonalMonitorParameterValue = PersonalMonitorParameterValue;
	}
	public String getMerchantMonitorParameterValue() {
		return MerchantMonitorParameterValue;
	}
	public void setMerchantMonitorParameterValue(String MerchantMonitorParameterValue) {
		this.MerchantMonitorParameterValue = MerchantMonitorParameterValue;
	}
	public String getRadio() {
		return Radio;
	}
	public void setRadio(String Radio) {
		this.Radio = Radio;
	}
	public String getUpdate_MonitorParameterName() {
		return Update_MonitorParameterName;
	}
	public void setUpdate_MonitorParameterName(String Update_MonitorParameterName) {
		this.Update_MonitorParameterName = Update_MonitorParameterName;
	}
	public String getUpdate_MonitorParameterValue() {
		return Update_MonitorParameterValue;
	}
	public void setUpdate_MonitorParameterValue(String Update_MonitorParameterValue) {
		this.Update_MonitorParameterValue = Update_MonitorParameterValue;
	}
	public String getUpdate_PersonalMonitorParameterValue() {
		return Update_PersonalMonitorParameterValue;
	}
	public void setUpdate_PersonalMonitorParameterValue(String Update_PersonalMonitorParameterValue) {
		this.Update_PersonalMonitorParameterValue = Update_PersonalMonitorParameterValue;
	}
	public String getUpdate_MerchantMonitorParameterValue() {
		return Update_MerchantMonitorParameterValue;
	}
	public void setUpdate_MerchantMonitorParameterValue(String Update_MerchantMonitorParameterValue) {
		this.Update_MerchantMonitorParameterValue = Update_MerchantMonitorParameterValue;
	}

}