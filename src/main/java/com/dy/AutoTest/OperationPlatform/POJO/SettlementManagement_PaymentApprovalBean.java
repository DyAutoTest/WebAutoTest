package com.dy.AutoTest.OperationPlatform.POJO;

import java.io.Serializable;

public class SettlementManagement_PaymentApprovalBean implements Serializable{
	private static final long serialVersionUID = 1L;

	private String RecheckOperationStatus;
	private String DateBegin;
	private String BatchRecheckPass_Text;
	private String BatchRecheckRefuse_Text;
	private String CaseNO;
	private String DateEnd;
	private String PaymentBank;
	private String InnerUserNO;
	private String PaymentType;
	private int ID;
	private String CheckBoxSingle;
	private String DateType;
	private String CollectionBank;
	public String getRecheckOperationStatus() {
		return RecheckOperationStatus;
	}
	public void setRecheckOperationStatus(String RecheckOperationStatus) {
		this.RecheckOperationStatus = RecheckOperationStatus;
	}
	public String getDateBegin() {
		return DateBegin;
	}
	public void setDateBegin(String DateBegin) {
		this.DateBegin = DateBegin;
	}
	public String getBatchRecheckPass_Text() {
		return BatchRecheckPass_Text;
	}
	public void setBatchRecheckPass_Text(String BatchRecheckPass_Text) {
		this.BatchRecheckPass_Text = BatchRecheckPass_Text;
	}
	public String getBatchRecheckRefuse_Text() {
		return BatchRecheckRefuse_Text;
	}
	public void setBatchRecheckRefuse_Text(String BatchRecheckRefuse_Text) {
		this.BatchRecheckRefuse_Text = BatchRecheckRefuse_Text;
	}
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
	public int getID() {
		return ID;
	}
	public void setID(int ID) {
		this.ID = ID;
	}
	public String getCheckBoxSingle() {
		return CheckBoxSingle;
	}
	public void setCheckBoxSingle(String CheckBoxSingle) {
		this.CheckBoxSingle = CheckBoxSingle;
	}
	public String getDateType() {
		return DateType;
	}
	public void setDateType(String DateType) {
		this.DateType = DateType;
	}
	public String getCollectionBank() {
		return CollectionBank;
	}
	public void setCollectionBank(String CollectionBank) {
		this.CollectionBank = CollectionBank;
	}

}