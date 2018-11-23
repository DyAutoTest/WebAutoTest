package com.dy.AutoTest.OperationPlatform.POJO;

import java.io.Serializable;

public class MerchantBalanceQueryBean implements Serializable{

	
	private static final long serialVersionUID = 1L;
	
	private int ID;
	private String CaseNO;
	private String MerchantNO;
	private String MerchantName;
	private String SearchMer_Index;
	
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
	public String getSearchMer_Index() {
		return SearchMer_Index;
	}
	public void setSearchMer_Index(String searchMer_Index) {
		SearchMer_Index = searchMer_Index;
	}
	
	
	
	
}
