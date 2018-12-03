package com.dy.AutoTest.OperationPlatform.POJO;

import java.io.Serializable;

public class OnlineDepositRefundQueryBean implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int ID;
	private String CaseNO;
	private String InnerOrderNO;
	private String SerialNO;
	private String AccountDateBegin;
	private String AccountDateEnd;
	private String RefundApplicationDateBegin;
	private String RefundApplicationDateEnd;
	private String RefundStatus;
	private String PhoneNO;
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
	public String getInnerOrderNO() {
		return InnerOrderNO;
	}
	public void setInnerOrderNO(String innerOrderNO) {
		InnerOrderNO = innerOrderNO;
	}
	public String getSerialNO() {
		return SerialNO;
	}
	public void setSerialNO(String serialNO) {
		SerialNO = serialNO;
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
	public String getRefundApplicationDateBegin() {
		return RefundApplicationDateBegin;
	}
	public void setRefundApplicationDateBegin(String refundApplicationDateBegin) {
		RefundApplicationDateBegin = refundApplicationDateBegin;
	}
	public String getRefundApplicationDateEnd() {
		return RefundApplicationDateEnd;
	}
	public void setRefundApplicationDateEnd(String refundApplicationDateEnd) {
		RefundApplicationDateEnd = refundApplicationDateEnd;
	}
	public String getRefundStatus() {
		return RefundStatus;
	}
	public void setRefundStatus(String refundStatus) {
		RefundStatus = refundStatus;
	}
	public String getPhoneNO() {
		return PhoneNO;
	}
	public void setPhoneNO(String phoneNO) {
		PhoneNO = phoneNO;
	}
	public String getRadio() {
		return Radio;
	}
	public void setRadio(String radio) {
		Radio = radio;
	}
}
