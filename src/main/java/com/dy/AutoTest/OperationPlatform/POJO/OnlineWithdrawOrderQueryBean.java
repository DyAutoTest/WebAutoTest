package com.dy.AutoTest.OperationPlatform.POJO;

import java.io.Serializable;

public class OnlineWithdrawOrderQueryBean implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int ID;
	private String CaseNO;
	private String TransferOutBank;
	private String TransferInBank;
	private String AccountDateBegin;
	private String AccountDateEnd;
	private String OrderDateBegin;
	private String OrderDateEnd;
	private String WithdrawalOrderNO;
	private String UserPhoneOrMerchantNO;
	private String WithdrawalType;
	private String OrderStatus;
	private String InnerUserNO;
	private String Radio;
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
	public String getTransferOutBank() {
		return TransferOutBank;
	}
	public void setTransferOutBank(String transferOutBank) {
		TransferOutBank = transferOutBank;
	}
	public String getTransferInBank() {
		return TransferInBank;
	}
	public void setTransferInBank(String transferInBank) {
		TransferInBank = transferInBank;
	}
	public String getAccountDateBegin() {
		return AccountDateBegin;
	}
	public void setAccountDateBegin(String accountDateBegin) {
		AccountDateBegin = accountDateBegin;
	}
	public String getAccountDateEnd() {
		return AccountDateEnd;
	}
	public void setAccountDateEnd(String accountDateEnd) {
		AccountDateEnd = accountDateEnd;
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
	public String getWithdrawalOrderNO() {
		return WithdrawalOrderNO;
	}
	public void setWithdrawalOrderNO(String withdrawalOrderNO) {
		WithdrawalOrderNO = withdrawalOrderNO;
	}
	public String getUserPhoneOrMerchantNO() {
		return UserPhoneOrMerchantNO;
	}
	public void setUserPhoneOrMerchantNO(String userPhoneOrMerchantNO) {
		UserPhoneOrMerchantNO = userPhoneOrMerchantNO;
	}
	public String getWithdrawalType() {
		return WithdrawalType;
	}
	public void setWithdrawalType(String withdrawalType) {
		WithdrawalType = withdrawalType;
	}
	public String getOrderStatus() {
		return OrderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		OrderStatus = orderStatus;
	}
	public String getInnerUserNO() {
		return InnerUserNO;
	}
	public void setInnerUserNO(String innerUserNO) {
		InnerUserNO = innerUserNO;
	}
}
