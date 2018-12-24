package com.dy.AutoTest.OperationPlatform.POJO;

import java.io.Serializable;

public class MonitorRulesManagement_MonitorOperationMaintainBean implements Serializable{
	private static final long serialVersionUID = 1L;

	private int ID;
	private String CaseNO;
	private String MonitorRule;
	private String MonitorOperation;
	private String Radio;
	private String Update_MonitorOperation;
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
	public String getMonitorOperation() {
		return MonitorOperation;
	}
	public void setMonitorOperation(String MonitorOperation) {
		this.MonitorOperation = MonitorOperation;
	}
	public String getRadio() {
		return Radio;
	}
	public void setRadio(String Radio) {
		this.Radio = Radio;
	}
	public String getUpdate_MonitorOperation() {
		return Update_MonitorOperation;
	}
	public void setUpdate_MonitorOperation(String Update_MonitorOperation) {
		this.Update_MonitorOperation = Update_MonitorOperation;
	}

}