package com.dy.AutoTest.OperationPlatform.POJO;

import java.io.Serializable;

public class OnlineRefundOrderQueryBean implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int ID;
	private String CaseNO;
	private String MerchantNO;
	private String MerchantOrderNO;
	private String AccountingDateBegin;
	private String AccountingDateEnd;
	private String OrderDateBegin;
	private String OrderDateEnd;
	private String RefundStatus;
	private String UserPhoneNO;
	private String InnerOrderNO;
	private String Radio;
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getCaseNO() {
		return CaseNO;
	}
	public void setCaseNO(String caseNO) {
		CaseNO = caseNO;
	}
	public String getMerchantNO() {
		return MerchantNO;
	}
	public void setMerchantNO(String merchantNO) {
		MerchantNO = merchantNO;
	}
	public String getMerchantOrderNO() {
		return MerchantOrderNO;
	}
	public void setMerchantOrderNO(String merchantOrderNO) {
		MerchantOrderNO = merchantOrderNO;
	}
	public String getAccountingDateBegin() {
		return AccountingDateBegin;
	}
	public void setAccountingDateBegin(String accountingDateBegin) {
		AccountingDateBegin = accountingDateBegin;
	}
	public String getAccountingDateEnd() {
		return AccountingDateEnd;
	}
	public void setAccountingDateEnd(String accountingDateEnd) {
		AccountingDateEnd = accountingDateEnd;
	}
	public String getOrderDateBegin() {
		return OrderDateBegin;
	}
	public void setOrderDateBegin(String orderDateBegin) {
		OrderDateBegin = orderDateBegin;
	}
	public String getOrderDateEnd() {
		return OrderDateEnd;
	}
	public void setOrderDateEnd(String orderDateEnd) {
		OrderDateEnd = orderDateEnd;
	}
	public String getRefundStatus() {
		return RefundStatus;
	}
	public void setRefundStatus(String refundStatus) {
		RefundStatus = refundStatus;
	}
	public String getUserPhoneNO() {
		return UserPhoneNO;
	}
	public void setUserPhoneNO(String userPhoneNO) {
		UserPhoneNO = userPhoneNO;
	}
	public String getInnerOrderNO() {
		return InnerOrderNO;
	}
	public void setInnerOrderNO(String innerOrderNO) {
		InnerOrderNO = innerOrderNO;
	}
	public String getRadio() {
		return Radio;
	}
	public void setRadio(String radio) {
		Radio = radio;
	}
	
	
}
