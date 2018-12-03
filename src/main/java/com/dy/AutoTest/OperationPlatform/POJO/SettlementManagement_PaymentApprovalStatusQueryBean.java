package com.dy.AutoTest.OperationPlatform.POJO;

import java.io.Serializable;

public class SettlementManagement_PaymentApprovalStatusQueryBean implements Serializable{
	private static final long serialVersionUID = 1L;

	private String CaseNO;
	private String DateEnd;
	private String PaymentBank;
	private String RecheckApprovalStatus;
	private String PaymentApprovalStatus;
	private String DateBegin;
	private String InnerUserNO;
	private String PaymentType;
	private String RiskApprovalStatus;
	private String Radio;
	private int ID;
	private String DateType;
	public String getCaseNO() {
		return CaseNO;
	}
	public void setCaseNO(String CaseNO) {
		this.CaseNO = CaseNO;
	}
	public String getDateEnd() {
		return DateEnd;
	}
	public void setDateEnd(String DateEnd) {
		this.DateEnd = DateEnd;
	}
	public String getPaymentBank() {
		return PaymentBank;
	}
	public void setPaymentBank(String PaymentBank) {
		this.PaymentBank = PaymentBank;
	}
	public String getRecheckApprovalStatus() {
		return RecheckApprovalStatus;
	}
	public void setRecheckApprovalStatus(String RecheckApprovalStatus) {
		this.RecheckApprovalStatus = RecheckApprovalStatus;
	}
	public String getPaymentApprovalStatus() {
		return PaymentApprovalStatus;
	}
	public void setPaymentApprovalStatus(String PaymentApprovalStatus) {
		this.PaymentApprovalStatus = PaymentApprovalStatus;
	}
	public String getDateBegin() {
		return DateBegin;
	}
	public void setDateBegin(String DateBegin) {
		this.DateBegin = DateBegin;
	}
	public String getInnerUserNO() {
		return InnerUserNO;
	}
	public void setInnerUserNO(String InnerUserNO) {
		this.InnerUserNO = InnerUserNO;
	}
	public String getPaymentType() {
		return PaymentType;
	}
	public void setPaymentType(String PaymentType) {
		this.PaymentType = PaymentType;
	}
	public String getRiskApprovalStatus() {
		return RiskApprovalStatus;
	}
	public void setRiskApprovalStatus(String RiskApprovalStatus) {
		this.RiskApprovalStatus = RiskApprovalStatus;
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
	public String getDateType() {
		return DateType;
	}
	public void setDateType(String DateType) {
		this.DateType = DateType;
	}

}