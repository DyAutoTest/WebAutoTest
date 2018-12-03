package com.dy.AutoTest.OperationPlatform.POJO;

import java.io.Serializable;

public class OnlineTransferOutOrderQueryBean implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int ID;
	private String CaseNO;
	private String PayerPhoneNO;
	private String OrderStatus;
	private String AccountDateBegin;
	private String AccountDateEnd;
	private String OrderDateBegin;
	private String OrderDateEnd;
	private String OrderNO;
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
	public String getPayerPhoneNO() {
		return PayerPhoneNO;
	}
	public void setPayerPhoneNO(String payerPhoneNO) {
		PayerPhoneNO = payerPhoneNO;
	}
	public String getOrderStatus() {
		return OrderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		OrderStatus = orderStatus;
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
	public String getOrderNO() {
		return OrderNO;
	}
	public void setOrderNO(String orderNO) {
		OrderNO = orderNO;
	}
	public String getRadio() {
		return Radio;
	}
	public void setRadio(String radio) {
		Radio = radio;
	}
}
