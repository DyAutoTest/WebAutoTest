package com.dy.AutoTest.OperationPlatform.POJO;

import java.io.Serializable;

public class RiskControlWarning_WarningRuleManagementBean implements Serializable{
	private static final long serialVersionUID = 1L;

	private int ID;
	private String CaseNO;
	private String Module;
	private String Radio;
	private String Update_RuleType;
	private String Update_Module;
	private String Update_RiskControlParam;
	private String Update_RuleDescribe;
	private String Update_Comment;
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
	public String getModule() {
		return Module;
	}
	public void setModule(String Module) {
		this.Module = Module;
	}
	public String getRadio() {
		return Radio;
	}
	public void setRadio(String Radio) {
		this.Radio = Radio;
	}
	public String getUpdate_RuleType() {
		return Update_RuleType;
	}
	public void setUpdate_RuleType(String Update_RuleType) {
		this.Update_RuleType = Update_RuleType;
	}
	public String getUpdate_Module() {
		return Update_Module;
	}
	public void setUpdate_Module(String Update_Module) {
		this.Update_Module = Update_Module;
	}
	public String getUpdate_RiskControlParam() {
		return Update_RiskControlParam;
	}
	public void setUpdate_RiskControlParam(String Update_RiskControlParam) {
		this.Update_RiskControlParam = Update_RiskControlParam;
	}
	public String getUpdate_RuleDescribe() {
		return Update_RuleDescribe;
	}
	public void setUpdate_RuleDescribe(String Update_RuleDescribe) {
		this.Update_RuleDescribe = Update_RuleDescribe;
	}
	public String getUpdate_Comment() {
		return Update_Comment;
	}
	public void setUpdate_Comment(String Update_Comment) {
		this.Update_Comment = Update_Comment;
	}

}