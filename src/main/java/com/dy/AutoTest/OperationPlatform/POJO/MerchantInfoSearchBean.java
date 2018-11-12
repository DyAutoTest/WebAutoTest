package com.dy.AutoTest.OperationPlatform.POJO;

import java.io.Serializable;

public class MerchantInfoSearchBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int ID;
	private String CaseNO;
	private String MerchantNO;
	private String MerchantName;
	private String SearchMerchant_Index;
	private String MerchantType;
	private String StartDate;
	private String EndDate;
	private String MerchantStatus;
	private String Province;
	private String City;
	private String Merchant_Index;
	private String AlterField;
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
	public String getSearchMerchant_Index() {
		return SearchMerchant_Index;
	}
	public void setSearchMerchant_Index(String searchMerchant_Index) {
		SearchMerchant_Index = searchMerchant_Index;
	}
	public String getMerchantType() {
		return MerchantType;
	}
	public void setMerchantType(String merchantType) {
		MerchantType = merchantType;
	}
	public String getStartDate() {
		return StartDate;
	}
	public void setStartDate(String startDate) {
		StartDate = startDate;
	}
	public String getEndDate() {
		return EndDate;
	}
	public void setEndDate(String endDate) {
		EndDate = endDate;
	}
	public String getMerchantStatus() {
		return MerchantStatus;
	}
	public void setMerchantStatus(String merchantStatus) {
		MerchantStatus = merchantStatus;
	}
	public String getProvince() {
		return Province;
	}
	public void setProvince(String province) {
		Province = province;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getMerchant_Index() {
		return Merchant_Index;
	}
	public void setMerchant_Index(String merchant_Index) {
		Merchant_Index = merchant_Index;
	}
	public String getAlterField() {
		return AlterField;
	}
	public void setAlterField(String alterField) {
		AlterField = alterField;
	}
	
	
}
