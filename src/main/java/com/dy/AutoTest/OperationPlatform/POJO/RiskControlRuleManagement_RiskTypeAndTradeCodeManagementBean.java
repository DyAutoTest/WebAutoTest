package com.dy.AutoTest.OperationPlatform.POJO;

import java.io.Serializable;

public class RiskControlRuleManagement_RiskTypeAndTradeCodeManagementBean implements Serializable{
	private static final long serialVersionUID = 1L;

	private int ID;
	private String CaseNO;
	private String TradeCode;
	private String TradeName;
	private String RiskControlType;
	private String ModuleName;
	private String RiskControlTradeSubcode;
	private String Radio;
	private String Update_TradeName;
	private String Update_RiskControlType;
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
	public String getTradeCode() {
		return TradeCode;
	}
	public void setTradeCode(String TradeCode) {
		this.TradeCode = TradeCode;
	}
	public String getTradeName() {
		return TradeName;
	}
	public void setTradeName(String TradeName) {
		this.TradeName = TradeName;
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
	public String getRiskControlTradeSubcode() {
		return RiskControlTradeSubcode;
	}
	public void setRiskControlTradeSubcode(String RiskControlTradeSubcode) {
		this.RiskControlTradeSubcode = RiskControlTradeSubcode;
	}
	public String getRadio() {
		return Radio;
	}
	public void setRadio(String Radio) {
		this.Radio = Radio;
	}
	public String getUpdate_TradeName() {
		return Update_TradeName;
	}
	public void setUpdate_TradeName(String Update_TradeName) {
		this.Update_TradeName = Update_TradeName;
	}
	public String getUpdate_RiskControlType() {
		return Update_RiskControlType;
	}
	public void setUpdate_RiskControlType(String Update_RiskControlType) {
		this.Update_RiskControlType = Update_RiskControlType;
	}

}