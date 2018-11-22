package com.dy.AutoTest.OperationPlatform.POJO;

import java.io.Serializable;

public class MerchantIncomeExpenditureDetailBean implements Serializable{

	private static final long serialVersionUID = 1L;
	
	
	private int ID;
	private String CaseNO;
	private String MerchantNO;
	private String MerchantName;
	private String SearchMer_Radio;
	private String InnerOrderNO;
	private String AccountingDateBegin;
	private String AccountingDateEnd;
	private String BusinessChannel;
	private String MerchantRadio;
	
	
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
	public String getMerchantName() {
		return MerchantName;
	}
	public void setMerchantName(String merchantName) {
		MerchantName = merchantName;
	}

	public String getSearchMer_Radio() {
		return SearchMer_Radio;
	}
	public void setSearchMer_Radio(String searchMer_Radio) {
		SearchMer_Radio = searchMer_Radio;
	}
	public String getMerchantRadio() {
		return MerchantRadio;
	}
	public void setMerchantRadio(String merchantRadio) {
		MerchantRadio = merchantRadio;
	}
	public String getInnerOrderNO() {
		return InnerOrderNO;
	}
	public void setInnerOrderNO(String innerOrderNO) {
		InnerOrderNO = innerOrderNO;
	}
	public String getAccountingDateBegin() {
		return AccountingDateBegin;
	}
	public void setAccountingDateBegin(String accountingDateBegin) {
		AccountingDateBegin = accountingDateBegin;
	}
	public String getAccountingDateEnd() {
		return AccountingDateEnd;
	}
	public void setAccountingDateEnd(String accountingDateEnd) {
		AccountingDateEnd = accountingDateEnd;
	}
	public String getBusinessChannel() {
		return BusinessChannel;
	}
	public void setBusinessChannel(String businessChannel) {
		BusinessChannel = businessChannel;
	}
	
	
	
}
