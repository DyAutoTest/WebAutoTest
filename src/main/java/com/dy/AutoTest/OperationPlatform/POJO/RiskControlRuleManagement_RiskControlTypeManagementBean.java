package com.dy.AutoTest.OperationPlatform.POJO;

import java.io.Serializable;

public class RiskControlRuleManagement_RiskControlTypeManagementBean implements Serializable{
	private static final long serialVersionUID = 1L;

	private int ID;
	private String CaseNO;
	private String RiskType;
	private String ModuleName;
	private String RiskControlTypeDescribe;
	private String Radio;
	private String Update_ModuleName;
	private String Update_RiskControlTypeDescribe;
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
	public String getRiskType() {
		return RiskType;
	}
	public void setRiskType(String RiskType) {
		this.RiskType = RiskType;
	}
	public String getModuleName() {
		return ModuleName;
	}
	public void setModuleName(String ModuleName) {
		this.ModuleName = ModuleName;
	}
	public String getRiskControlTypeDescribe() {
		return RiskControlTypeDescribe;
	}
	public void setRiskControlTypeDescribe(String RiskControlTypeDescribe) {
		this.RiskControlTypeDescribe = RiskControlTypeDescribe;
	}
	public String getRadio() {
		return Radio;
	}
	public void setRadio(String Radio) {
		this.Radio = Radio;
	}
	public String getUpdate_ModuleName() {
		return Update_ModuleName;
	}
	public void setUpdate_ModuleName(String Update_ModuleName) {
		this.Update_ModuleName = Update_ModuleName;
	}
	public String getUpdate_RiskControlTypeDescribe() {
		return Update_RiskControlTypeDescribe;
	}
	public void setUpdate_RiskControlTypeDescribe(String Update_RiskControlTypeDescribe) {
		this.Update_RiskControlTypeDescribe = Update_RiskControlTypeDescribe;
	}

}