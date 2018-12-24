package com.dy.AutoTest.OperationPlatform.POJO;

import java.io.Serializable;

public class RefusedTradeQuery_WarningOrderQueryBean implements Serializable{
	private static final long serialVersionUID = 1L;

	private int ID;
	private String CaseNO;
	private String PayerInternalNO;
	private String PayeeInternalNO;
	private String BusinessType;
	private String TradeType;
	private String TradeOrderNO;
	private String DateBegin;
	private String DateEnd;
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
	public String getPayerInternalNO() {
		return PayerInternalNO;
	}
	public void setPayerInternalNO(String PayerInternalNO) {
		this.PayerInternalNO = PayerInternalNO;
	}
	public String getPayeeInternalNO() {
		return PayeeInternalNO;
	}
	public void setPayeeInternalNO(String PayeeInternalNO) {
		this.PayeeInternalNO = PayeeInternalNO;
	}
	public String getBusinessType() {
		return BusinessType;
	}
	public void setBusinessType(String BusinessType) {
		this.BusinessType = BusinessType;
	}
	public String getTradeType() {
		return TradeType;
	}
	public void setTradeType(String TradeType) {
		this.TradeType = TradeType;
	}
	public String getTradeOrderNO() {
		return TradeOrderNO;
	}
	public void setTradeOrderNO(String TradeOrderNO) {
		this.TradeOrderNO = TradeOrderNO;
	}
	public String getDateBegin() {
		return DateBegin;
	}
	public void setDateBegin(String DateBegin) {
		this.DateBegin = DateBegin;
	}
	public String getDateEnd() {
		return DateEnd;
	}
	public void setDateEnd(String DateEnd) {
		this.DateEnd = DateEnd;
	}

}