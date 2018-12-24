package com.dy.AutoTest.OperationPlatform.POJO;

import java.io.Serializable;

public class SuspiciousTradeManagement_SuspiciousTradeAnalyzeBean implements Serializable{
	private static final long serialVersionUID = 1L;

	private int ID;
	private String CaseNO;
	private String MonitorRule;
	private String MerchantNOPhoneNO;
	private String InnerOrderNO;
	private String MonitorSource;
	private String MonitorOperationResult;
	private String Radio;
	private String SuspiciousTradeAnalyze_CheckAnalyze;
	private String SuspiciousTradeAnalyze_Tips;
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
	public String getMerchantNOPhoneNO() {
		return MerchantNOPhoneNO;
	}
	public void setMerchantNOPhoneNO(String MerchantNOPhoneNO) {
		this.MerchantNOPhoneNO = MerchantNOPhoneNO;
	}
	public String getInnerOrderNO() {
		return InnerOrderNO;
	}
	public void setInnerOrderNO(String InnerOrderNO) {
		this.InnerOrderNO = InnerOrderNO;
	}
	public String getMonitorSource() {
		return MonitorSource;
	}
	public void setMonitorSource(String MonitorSource) {
		this.MonitorSource = MonitorSource;
	}
	public String getMonitorOperationResult() {
		return MonitorOperationResult;
	}
	public void setMonitorOperationResult(String MonitorOperationResult) {
		this.MonitorOperationResult = MonitorOperationResult;
	}
	public String getRadio() {
		return Radio;
	}
	public void setRadio(String Radio) {
		this.Radio = Radio;
	}
	public String getSuspiciousTradeAnalyze_CheckAnalyze() {
		return SuspiciousTradeAnalyze_CheckAnalyze;
	}
	public void setSuspiciousTradeAnalyze_CheckAnalyze(String SuspiciousTradeAnalyze_CheckAnalyze) {
		this.SuspiciousTradeAnalyze_CheckAnalyze = SuspiciousTradeAnalyze_CheckAnalyze;
	}
	public String getSuspiciousTradeAnalyze_Tips() {
		return SuspiciousTradeAnalyze_Tips;
	}
	public void setSuspiciousTradeAnalyze_Tips(String SuspiciousTradeAnalyze_Tips) {
		this.SuspiciousTradeAnalyze_Tips = SuspiciousTradeAnalyze_Tips;
	}

}