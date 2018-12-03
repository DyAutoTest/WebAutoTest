package com.dy.AutoTest.OperationPlatform.POJO;

import java.io.Serializable;

public class SettlementManagement_PaymentOperationBean implements Serializable{
	private static final long serialVersionUID = 1L;

	private String OrderDateEnd;
	private String MerchantNO;
	private String CaseNO;
	private String PaymentBank;
	private String MerchantName;
	private String CheckBox;
	private String OrderDateBegin;
	private String InnerUserNO;
	private String PaymentType;
	private String BatchCancel_Text;
	private int ID;
	private String CollectionBank;
	private String DateType;
	private String PaymentStatus;
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
	public String getMerchantName() {
		return MerchantName;
	}
	public void setMerchantName(String MerchantName) {
		this.MerchantName = MerchantName;
	}
	public String getCheckBox() {
		return CheckBox;
	}
	public void setCheckBox(String CheckBox) {
		this.CheckBox = CheckBox;
	}
	public String getOrderDateBegin() {
		return OrderDateBegin;
	}
	public void setOrderDateBegin(String OrderDateBegin) {
		this.OrderDateBegin = OrderDateBegin;
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
	public String getBatchCancel_Text() {
		return BatchCancel_Text;
	}
	public void setBatchCancel_Text(String BatchCancel_Text) {
		this.BatchCancel_Text = BatchCancel_Text;
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
	public String getPaymentStatus() {
		return PaymentStatus;
	}
	public void setPaymentStatus(String PaymentStatus) {
		this.PaymentStatus = PaymentStatus;
	}

}