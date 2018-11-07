package com.dy.AutoTest.OnlineCashier.POJO;

import java.io.Serializable;

public class OnlineCashierB2BBean implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private int ID;
	private String CaseNO;
	private String MerchantNO;
	private String CertificatePassword;
	private String ReceiptMerchantNO;
	private String OrderAmount;
	private String PaymentAmout;
	private String ReceiptMerchantType;
	private String InterfaceType;
	private String RequestType;
	private String PaymentType;
	private String EBank_SMS;
	private String EBank_CardNO;
	private String Preparation;
	
	
	public String getPreparation() {
		return Preparation;
	}
	public void setPreparation(String preparation) {
		Preparation = preparation;
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
	public String getCertificatePassword() {
		return CertificatePassword;
	}
	public void setCertificatePassword(String certificatePassword) {
		CertificatePassword = certificatePassword;
	}
	public String getReceiptMerchantNO() {
		return ReceiptMerchantNO;
	}
	public void setReceiptMerchantNO(String receiptMerchantNO) {
		ReceiptMerchantNO = receiptMerchantNO;
	}
	public String getOrderAmount() {
		return OrderAmount;
	}
	public void setOrderAmount(String orderAmount) {
		OrderAmount = orderAmount;
	}
	public String getPaymentAmout() {
		return PaymentAmout;
	}
	public void setPaymentAmout(String paymentAmout) {
		PaymentAmout = paymentAmout;
	}
	public String getReceiptMerchantType() {
		return ReceiptMerchantType;
	}
	public void setReceiptMerchantType(String receiptMerchantType) {
		ReceiptMerchantType = receiptMerchantType;
	}
	public String getInterfaceType() {
		return InterfaceType;
	}
	public void setInterfaceType(String interfaceType) {
		InterfaceType = interfaceType;
	}
	public String getRequestType() {
		return RequestType;
	}
	public void setRequestType(String requestType) {
		RequestType = requestType;
	}
	public String getPaymentType() {
		return PaymentType;
	}
	public void setPaymentType(String paymentType) {
		PaymentType = paymentType;
	}
	public String getEBank_SMS() {
		return EBank_SMS;
	}
	public void setEBank_SMS(String eBank_SMS) {
		EBank_SMS = eBank_SMS;
	}
	public String getEBank_CardNO() {
		return EBank_CardNO;
	}
	public void setEBank_CardNO(String eBank_CardNO) {
		EBank_CardNO = eBank_CardNO;
	}
	
	
	
	
	
}
