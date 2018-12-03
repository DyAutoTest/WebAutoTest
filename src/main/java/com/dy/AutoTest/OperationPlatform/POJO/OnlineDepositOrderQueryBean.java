package com.dy.AutoTest.OperationPlatform.POJO;

import java.io.Serializable;

public class OnlineDepositOrderQueryBean implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int ID;
	private String CaseNO;
	private String MerchantNO;
	private String InnerUserNO;
	private String AccountDateBegin;
	private String AccountDateEnd;
	private String OrderDateBegin;
	private String OrderDateEnd;
	private String Cooperation;
	private String DepositType;
	private String InnerOrderNO;
	private String DepositOrderNO;
	private String OrderStatus;
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
	public String getMerchantNO() {
		return MerchantNO;
	}
	public void setMerchantNO(String merchantNO) {
		MerchantNO = merchantNO;
	}
	public String getInnerUserNO() {
		return InnerUserNO;
	}
	public void setInnerUserNO(String innerUserNO) {
		InnerUserNO = innerUserNO;
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
	public String getCooperation() {
		return Cooperation;
	}
	public void setCooperation(String cooperation) {
		Cooperation = cooperation;
	}
	public String getDepositType() {
		return DepositType;
	}
	public void setDepositType(String depositType) {
		DepositType = depositType;
	}
	public String getInnerOrderNO() {
		return InnerOrderNO;
	}
	public void setInnerOrderNO(String innerOrderNO) {
		InnerOrderNO = innerOrderNO;
	}
	public String getDepositOrderNO() {
		return DepositOrderNO;
	}
	public void setDepositOrderNO(String depositOrderNO) {
		DepositOrderNO = depositOrderNO;
	}
	public String getOrderStatus() {
		return OrderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		OrderStatus = orderStatus;
	}
}
