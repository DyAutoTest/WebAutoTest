package com.dy.AutoTest.OperationPlatform.POJO;

import java.io.Serializable;

public class AccountManageOfflineFreezeManageBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2378182298159834994L;

	private int ID;
	private String CaseNo;
	private String MerchantNO;
	private String FrozenType;
	private String Tips;
	private String FrozenMoney;
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

	public String getFrozenType() {
		return FrozenType;
	}

	public void setFrozenType(String frozenType) {
		FrozenType = frozenType;
	}

	public String getTips() {
		return Tips;
	}

	public void setTips(String tips) {
		Tips = tips;
	}

	public String getFrozenMoney() {
		return FrozenMoney;
	}

	public void setFrozenMoney(String frozenMoney) {
		FrozenMoney = frozenMoney;
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
