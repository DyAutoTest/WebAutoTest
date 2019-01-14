package com.dy.AutoTest.OnlineCashier.POJO;

import java.io.Serializable;

public class AccountManageAccountingEntryCheckBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4242066348140447571L;

	private int ID;
	private String CaseNo;
	private String ProductsCode;
	private String TradeType;
	private String Status;
	private String BusinessSubtype;
	private String Audit_Advice;

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getCaseNo() {
		return CaseNo;
	}

	public void setCaseNo(String caseNo) {
		CaseNo = caseNo;
	}

	public String getProductsCode() {
		return ProductsCode;
	}

	public void setProductsCode(String productsCode) {
		ProductsCode = productsCode;
	}

	public String getTradeType() {
		return TradeType;
	}

	public void setTradeType(String tradeType) {
		TradeType = tradeType;
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}

	public String getBusinessSubtype() {
		return BusinessSubtype;
	}

	public void setBusinessSubtype(String businessSubtype) {
		BusinessSubtype = businessSubtype;
	}

	public String getAudit_Advice() {
		return Audit_Advice;
	}

	public void setAudit_Advice(String audit_Advice) {
		Audit_Advice = audit_Advice;
	}

}
