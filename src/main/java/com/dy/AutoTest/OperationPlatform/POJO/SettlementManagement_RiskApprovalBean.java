package com.dy.AutoTest.OperationPlatform.POJO;

import java.io.Serializable;

public class SettlementManagement_RiskApprovalBean implements Serializable{
	private static final long serialVersionUID = 1L;

	private String CaseNO;
	private String PaymentBank;
	private String DateEnd;
	private String DateBegin;
	private String PaymentType;
	private String Check_Radio;
	private String Refuse_Text;
	private String Radio;
	private String Pass_Text;
	private int ID;
	private String CollectionBank;
	private String DateType;
	public String getCaseNO() {
		return CaseNO;
	}
	public void setCaseNO(String CaseNO) {
		this.CaseNO = CaseNO;
	}
	public String getPaymentBank() {
		return PaymentBank;
	}
	public void setPaymentBank(String PaymentBank) {
		this.PaymentBank = PaymentBank;
	}
	public String getDateEnd() {
		return DateEnd;
	}
	public void setDateEnd(String DateEnd) {
		this.DateEnd = DateEnd;
	}
	public String getDateBegin() {
		return DateBegin;
	}
	public void setDateBegin(String DateBegin) {
		this.DateBegin = DateBegin;
	}
	public String getPaymentType() {
		return PaymentType;
	}
	public void setPaymentType(String PaymentType) {
		this.PaymentType = PaymentType;
	}
	public String getCheck_Radio() {
		return Check_Radio;
	}
	public void setCheck_Radio(String Check_Radio) {
		this.Check_Radio = Check_Radio;
	}
	public String getRefuse_Text() {
		return Refuse_Text;
	}
	public void setRefuse_Text(String Refuse_Text) {
		this.Refuse_Text = Refuse_Text;
	}
	public String getRadio() {
		return Radio;
	}
	public void setRadio(String Radio) {
		this.Radio = Radio;
	}
	public String getPass_Text() {
		return Pass_Text;
	}
	public void setPass_Text(String Pass_Text) {
		this.Pass_Text = Pass_Text;
	}
	public int getID() {
		return ID;
	}
	public void setID(int ID) {
		this.ID = ID;
	}
	public String getCollectionBank() {
		return CollectionBank;
	}
	public void setCollectionBank(String CollectionBank) {
		this.CollectionBank = CollectionBank;
	}
	public String getDateType() {
		return DateType;
	}
	public void setDateType(String DateType) {
		this.DateType = DateType;
	}

}