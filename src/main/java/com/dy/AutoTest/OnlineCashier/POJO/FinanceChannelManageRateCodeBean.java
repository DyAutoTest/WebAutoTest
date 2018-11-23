package com.dy.AutoTest.OnlineCashier.POJO;

import java.io.Serializable;

public class FinanceChannelManageRateCodeBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8289862387743302930L;

	private int ID;
	private String CaseNo;
	private String Search;
	private String CodeNum;
	private String CodeName;
	private String ChargeType;
	private String FeeCalculatoin;
	private String SettledMoney;
	private String BeginAmount;
	private String MinFeeAmount;
	private String FlatRate;
	private String MaxFeeAmount;

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

	public String getSearch() {
		return Search;
	}

	public void setSearch(String search) {
		Search = search;
	}

	public String getCodeNum() {
		return CodeNum;
	}

	public void setCodeNum(String codeNum) {
		CodeNum = codeNum;
	}

	public String getCodeName() {
		return CodeName;
	}

	public void setCodeName(String codeName) {
		CodeName = codeName;
	}

	public String getChargeType() {
		return ChargeType;
	}

	public void setChargeType(String chargeType) {
		ChargeType = chargeType;
	}

	public String getFeeCalculatoin() {
		return FeeCalculatoin;
	}

	public void setFeeCalculatoin(String feeCalculatoin) {
		FeeCalculatoin = feeCalculatoin;
	}

	public String getSettledMoney() {
		return SettledMoney;
	}

	public void setSettledMoney(String settledMoney) {
		SettledMoney = settledMoney;
	}

	public String getBeginAmount() {
		return BeginAmount;
	}

	public void setBeginAmount(String beginAmount) {
		BeginAmount = beginAmount;
	}

	public String getMinFeeAmount() {
		return MinFeeAmount;
	}

	public void setMinFeeAmount(String minFeeAmount) {
		MinFeeAmount = minFeeAmount;
	}

	public String getFlatRate() {
		return FlatRate;
	}

	public void setFlatRate(String flatRate) {
		FlatRate = flatRate;
	}

	public String getMaxFeeAmount() {
		return MaxFeeAmount;
	}

	public void setMaxFeeAmount(String maxFeeAmount) {
		MaxFeeAmount = maxFeeAmount;
	}
	
}
