package com.dy.AutoTest.OperationPlatform.POJO;

import java.io.Serializable;

public class SuspiciousTradeManagement_BeingProcessedSuspiciousTradeMaintainBean implements Serializable{
	private static final long serialVersionUID = 1L;

	private int ID;
	private String CaseNO;
	private String MonitorRule;
	private String MerchantNOPhoneNO;
	private String Radio;
	private String WriteProcessResult_HandleSuggestion;
	private String WriteProcessResult_HandleTips;
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
	public String getRadio() {
		return Radio;
	}
	public void setRadio(String Radio) {
		this.Radio = Radio;
	}
	public String getWriteProcessResult_HandleSuggestion() {
		return WriteProcessResult_HandleSuggestion;
	}
	public void setWriteProcessResult_HandleSuggestion(String WriteProcessResult_HandleSuggestion) {
		this.WriteProcessResult_HandleSuggestion = WriteProcessResult_HandleSuggestion;
	}
	public String getWriteProcessResult_HandleTips() {
		return WriteProcessResult_HandleTips;
	}
	public void setWriteProcessResult_HandleTips(String WriteProcessResult_HandleTips) {
		this.WriteProcessResult_HandleTips = WriteProcessResult_HandleTips;
	}

}