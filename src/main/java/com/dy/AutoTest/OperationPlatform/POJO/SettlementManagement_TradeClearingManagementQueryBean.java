package com.dy.AutoTest.OperationPlatform.POJO;

import java.io.Serializable;

public class SettlementManagement_TradeClearingManagementQueryBean implements Serializable{
	private static final long serialVersionUID = 1L;

	private String CaseNO;
	private String OrderDateEnd;
	private String MerchantNO;
	private String OrderDateBegin;
	private String MerchantOrderNO;
	private String Radio;
	private int ID;
	private String AccountingDateBegin;
	private String AccountingDateEnd;
	public String getCaseNO() {
		return CaseNO;
	}
	public void setCaseNO(String CaseNO) {
		this.CaseNO = CaseNO;
	}
	public String getOrderDateEnd() {
		return OrderDateEnd;
	}
	public void setOrderDateEnd(String OrderDateEnd) {
		this.OrderDateEnd = OrderDateEnd;
	}
	public String getMerchantNO() {
		return MerchantNO;
	}
	public void setMerchantNO(String MerchantNO) {
		this.MerchantNO = MerchantNO;
	}
	public String getOrderDateBegin() {
		return OrderDateBegin;
	}
	public void setOrderDateBegin(String OrderDateBegin) {
		this.OrderDateBegin = OrderDateBegin;
	}
	public String getMerchantOrderNO() {
		return MerchantOrderNO;
	}
	public void setMerchantOrderNO(String MerchantOrderNO) {
		this.MerchantOrderNO = MerchantOrderNO;
	}
	public String getRadio() {
		return Radio;
	}
	public void setRadio(String Radio) {
		this.Radio = Radio;
	}
	public int getID() {
		return ID;
	}
	public void setID(int ID) {
		this.ID = ID;
	}
	public String getAccountingDateBegin() {
		return AccountingDateBegin;
	}
	public void setAccountingDateBegin(String AccountingDateBegin) {
		this.AccountingDateBegin = AccountingDateBegin;
	}
	public String getAccountingDateEnd() {
		return AccountingDateEnd;
	}
	public void setAccountingDateEnd(String AccountingDateEnd) {
		this.AccountingDateEnd = AccountingDateEnd;
	}

}