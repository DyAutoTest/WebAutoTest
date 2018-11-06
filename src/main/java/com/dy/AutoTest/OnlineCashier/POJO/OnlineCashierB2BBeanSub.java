package com.dy.AutoTest.OnlineCashier.POJO;

import java.io.Serializable;

public class OnlineCashierB2BBeanSub implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private int ID;
	private String CaseNO;
	private String PresentID;
	private String SubOrderAmount;
	private String SubPaymentAmount;
	private String SubReceiptMerchantNO;
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
	public String getPresentID() {
		return PresentID;
	}
	public void setPresentID(String presentID) {
		PresentID = presentID;
	}
	public String getSubOrderAmount() {
		return SubOrderAmount;
	}
	public void setSubOrderAmount(String subOrderAmount) {
		SubOrderAmount = subOrderAmount;
	}
	public String getSubPaymentAmount() {
		return SubPaymentAmount;
	}
	public void setSubPaymentAmount(String subPaymentAmount) {
		SubPaymentAmount = subPaymentAmount;
	}
	public String getSubReceiptMerchantNO() {
		return SubReceiptMerchantNO;
	}
	public void setSubReceiptMerchantNO(String subReceiptMerchantNO) {
		SubReceiptMerchantNO = subReceiptMerchantNO;
	}

	
	
	
	
}
