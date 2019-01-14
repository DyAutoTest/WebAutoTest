package com.dy.AutoTest.OperationPlatform.POJO;

import java.io.Serializable;

public class AccountManageOfflineReleaseManageBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3429054782563834481L;

	private int ID;
	private String CaseNo;
	private String MerchantNO;
	private String UnfrozenType;
	private String Tips;
	private String UnfrozenMoney;
	private String SearchMer_MerchantNO;
	private String SearchMer_MerchantName;

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

	public String getMerchantNO() {
		return MerchantNO;
	}

	public void setMerchantNO(String merchantNO) {
		MerchantNO = merchantNO;
	}

	public String getTips() {
		return Tips;
	}

	public void setTips(String tips) {
		Tips = tips;
	}

	public String getUnfrozenType() {
		return UnfrozenType;
	}

	public void setUnfrozenType(String unfrozenType) {
		UnfrozenType = unfrozenType;
	}

	public String getUnfrozenMoney() {
		return UnfrozenMoney;
	}

	public void setUnfrozenMoney(String unfrozenMoney) {
		UnfrozenMoney = unfrozenMoney;
	}

	public String getSearchMer_MerchantNO() {
		return SearchMer_MerchantNO;
	}

	public void setSearchMer_MerchantNO(String searchMer_MerchantNO) {
		SearchMer_MerchantNO = searchMer_MerchantNO;
	}

	public String getSearchMer_MerchantName() {
		return SearchMer_MerchantName;
	}

	public void setSearchMer_MerchantName(String searchMer_MerchantName) {
		SearchMer_MerchantName = searchMer_MerchantName;
	}

}
