package com.dy.AutoTest.OperationPlatform.POJO;

import java.io.Serializable;

public class FinanceChannelManageRateMaintainBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4951626919339983244L;

	private int ID;
	private String CaseNo;
	private String ChannelCode;
	private String ProductType;
	private String RateType;
	private String EffectiveSign;
	private String RateCodeSearch;

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

	public String getChannelCode() {
		return ChannelCode;
	}

	public void setChannelCode(String channelCode) {
		ChannelCode = channelCode;
	}

	public String getProductType() {
		return ProductType;
	}

	public void setProductType(String productType) {
		ProductType = productType;
	}
	
	public String getRateType() {
		return RateType;
	}

	public void setRateType(String rateType) {
		RateType = rateType;
	}

	public String getEffectiveSign() {
		return EffectiveSign;
	}

	public void setEffectiveSign(String effectiveSign) {
		EffectiveSign = effectiveSign;
	}

	public String getRateCodeSearch() {
		return RateCodeSearch;
	}

	public void setRateCodeSearch(String rateCodeSearch) {
		RateCodeSearch = rateCodeSearch;
	}

}
