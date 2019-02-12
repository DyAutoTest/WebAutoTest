package com.dy.AutoTest.AcquiringOperationPlatform.POJO;

import java.io.Serializable;

public class MerchantInfoManagement_MerchantAuditBean implements Serializable{
	private static final long serialVersionUID = 1L;

	private int ID;
	private String CaseNO;
	private String TradeName;
	private String KeyInfo;
	private String MerchantCode;
	private String TradeCode;
	private String InnerMerchantType;
	private String InnerMerchantSubType;
	private String TradeOperater;
	private String AuditStatus;
	private String AuditCheckboxAll;
	private String Radio;
	private String PreAuditOperation_PreAuditTips;
	private String RecheckOperation_RecheckTips;
	private String RecheckAudit_RiskTemplate;
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
	public String getTradeName() {
		return TradeName;
	}
	public void setTradeName(String TradeName) {
		this.TradeName = TradeName;
	}
	public String getKeyInfo() {
		return KeyInfo;
	}
	public void setKeyInfo(String KeyInfo) {
		this.KeyInfo = KeyInfo;
	}
	public String getMerchantCode() {
		return MerchantCode;
	}
	public void setMerchantCode(String MerchantCode) {
		this.MerchantCode = MerchantCode;
	}
	public String getTradeCode() {
		return TradeCode;
	}
	public void setTradeCode(String TradeCode) {
		this.TradeCode = TradeCode;
	}
	public String getInnerMerchantType() {
		return InnerMerchantType;
	}
	public void setInnerMerchantType(String InnerMerchantType) {
		this.InnerMerchantType = InnerMerchantType;
	}
	public String getInnerMerchantSubType() {
		return InnerMerchantSubType;
	}
	public void setInnerMerchantSubType(String InnerMerchantSubType) {
		this.InnerMerchantSubType = InnerMerchantSubType;
	}
	public String getTradeOperater() {
		return TradeOperater;
	}
	public void setTradeOperater(String TradeOperater) {
		this.TradeOperater = TradeOperater;
	}
	public String getAuditStatus() {
		return AuditStatus;
	}
	public void setAuditStatus(String AuditStatus) {
		this.AuditStatus = AuditStatus;
	}
	public String getAuditCheckboxAll() {
		return AuditCheckboxAll;
	}
	public void setAuditCheckboxAll(String AuditCheckboxAll) {
		this.AuditCheckboxAll = AuditCheckboxAll;
	}
	public String getRadio() {
		return Radio;
	}
	public void setRadio(String Radio) {
		this.Radio = Radio;
	}
	public String getPreAuditOperation_PreAuditTips() {
		return PreAuditOperation_PreAuditTips;
	}
	public void setPreAuditOperation_PreAuditTips(String PreAuditOperation_PreAuditTips) {
		this.PreAuditOperation_PreAuditTips = PreAuditOperation_PreAuditTips;
	}
	public String getRecheckOperation_RecheckTips() {
		return RecheckOperation_RecheckTips;
	}
	public void setRecheckOperation_RecheckTips(String RecheckOperation_RecheckTips) {
		this.RecheckOperation_RecheckTips = RecheckOperation_RecheckTips;
	}
	public String getRecheckAudit_RiskTemplate() {
		return RecheckAudit_RiskTemplate;
	}
	public void setRecheckAudit_RiskTemplate(String RecheckAudit_RiskTemplate) {
		this.RecheckAudit_RiskTemplate = RecheckAudit_RiskTemplate;
	}

}