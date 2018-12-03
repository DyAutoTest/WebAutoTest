package com.dy.AutoTest.OperationPlatform.POJO;

import java.io.Serializable;

public class OnlinePurchaseOrderQueryBean implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int ID;
	private String CaseNO;
	private String MerchantOrderNO;
	private String MerchantNO;
	private String AccountingDateBegin;
	private String AccountingDateEnd;
	private String OrderDateBegin;
	private String OrderDateEnd;
	private String BusinessChannel;
	private String PaymentMode;
	private String UserPhoneNO;
	private String InnerOrderNO;
	private String OrderStatus;
	private String KeepDomain;
	private String Radio;
	
	public String getMerchantNO() {
		return MerchantNO;
	}
	public void setMerchantNO(String merchantNO) {
		MerchantNO = merchantNO;
	}
	public String getRadio() {
		return Radio;
	}
	public void setRadio(String radio) {
		Radio = radio;
	}
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
	public String getBusinessChannel() {
		return BusinessChannel;
	}
	public void setBusinessChannel(String businessChannel) {
		BusinessChannel = businessChannel;
	}
	public String getPaymentMode() {
		return PaymentMode;
	}
	public void setPaymentMode(String paymentMode) {
		PaymentMode = paymentMode;
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
	public String getOrderStatus() {
		return OrderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		OrderStatus = orderStatus;
	}
	public String getKeepDomain() {
		return KeepDomain;
	}
	public void setKeepDomain(String keepDomain) {
		KeepDomain = keepDomain;
	}
}
