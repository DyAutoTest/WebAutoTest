package com.dy.AutoTest.OperationPlatform.POJO;

import java.io.Serializable;

public class RiskControlLvMaintain_RiskLvMaintainBean implements Serializable{
	private static final long serialVersionUID = 1L;

	private int ID;
	private String CaseNO;
	private String RiskLv;
	private String RiskModel;
	private String RiskParameterMax;
	private String RiskParameterMin;
	private String Tips;
	private String Radio;
	private String Update_RiskParameterMax;
	private String Update_RiskParameterMin;
	private String Update_Tips;
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
	public String getRiskLv() {
		return RiskLv;
	}
	public void setRiskLv(String RiskLv) {
		this.RiskLv = RiskLv;
	}
	public String getRiskModel() {
		return RiskModel;
	}
	public void setRiskModel(String RiskModel) {
		this.RiskModel = RiskModel;
	}
	public String getRiskParameterMax() {
		return RiskParameterMax;
	}
	public void setRiskParameterMax(String RiskParameterMax) {
		this.RiskParameterMax = RiskParameterMax;
	}
	public String getRiskParameterMin() {
		return RiskParameterMin;
	}
	public void setRiskParameterMin(String RiskParameterMin) {
		this.RiskParameterMin = RiskParameterMin;
	}
	public String getTips() {
		return Tips;
	}
	public void setTips(String Tips) {
		this.Tips = Tips;
	}
	public String getRadio() {
		return Radio;
	}
	public void setRadio(String Radio) {
		this.Radio = Radio;
	}
	public String getUpdate_RiskParameterMax() {
		return Update_RiskParameterMax;
	}
	public void setUpdate_RiskParameterMax(String Update_RiskParameterMax) {
		this.Update_RiskParameterMax = Update_RiskParameterMax;
	}
	public String getUpdate_RiskParameterMin() {
		return Update_RiskParameterMin;
	}
	public void setUpdate_RiskParameterMin(String Update_RiskParameterMin) {
		this.Update_RiskParameterMin = Update_RiskParameterMin;
	}
	public String getUpdate_Tips() {
		return Update_Tips;
	}
	public void setUpdate_Tips(String Update_Tips) {
		this.Update_Tips = Update_Tips;
	}

}