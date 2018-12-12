package com.dy.AutoTest.OperationPlatform.POJO;

import java.io.Serializable;

public class RiskControlRuleManagement_RiskControlTypeCorrespondingRulesManagementBean implements Serializable{
	private static final long serialVersionUID = 1L;

	private int ID;
	private String CaseNO;
	private String RiskControlType;
	private String ModuleName;
	private String Radio;
	private String OperationSelection;
	private String RuleCheckbox;
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
	public String getRiskControlType() {
		return RiskControlType;
	}
	public void setRiskControlType(String RiskControlType) {
		this.RiskControlType = RiskControlType;
	}
	public String getModuleName() {
		return ModuleName;
	}
	public void setModuleName(String ModuleName) {
		this.ModuleName = ModuleName;
	}
	public String getRadio() {
		return Radio;
	}
	public void setRadio(String Radio) {
		this.Radio = Radio;
	}
	public String getOperationSelection() {
		return OperationSelection;
	}
	public void setOperationSelection(String OperationSelection) {
		this.OperationSelection = OperationSelection;
	}
	public String getRuleCheckbox() {
		return RuleCheckbox;
	}
	public void setRuleCheckbox(String RuleCheckbox) {
		this.RuleCheckbox = RuleCheckbox;
	}

}