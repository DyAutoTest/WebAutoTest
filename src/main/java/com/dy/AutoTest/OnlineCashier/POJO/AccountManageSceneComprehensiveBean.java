package com.dy.AutoTest.OnlineCashier.POJO;

import java.io.Serializable;

public class AccountManageSceneComprehensiveBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5206926818175245315L;

	private int ID;
	private String CaseNo;
	private String AffiliationOrgnization;
	private String ExcessReserveBank;
	private String SceneType;
	private String TradeDate;
	private String IN_BorrowingDirection;
	private String IN_Money;
	private String IN_Tips;
	private String IN_InquireAccountNum;
	private String EX_BorrowingDirection;
	private String EX_Money;
	private String EX_Tips;
	private String EX_InquireAccountNum;

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

	public String getAffiliationOrgnization() {
		return AffiliationOrgnization;
	}

	public void setAffiliationOrgnization(String affiliationOrgnization) {
		AffiliationOrgnization = affiliationOrgnization;
	}

	public String getExcessReserveBank() {
		return ExcessReserveBank;
	}

	public void setExcessReserveBank(String excessReserveBank) {
		ExcessReserveBank = excessReserveBank;
	}

	public String getSceneType() {
		return SceneType;
	}

	public void setSceneType(String sceneType) {
		SceneType = sceneType;
	}

	public String getTradeDate() {
		return TradeDate;
	}

	public void setTradeDate(String tradeDate) {
		TradeDate = tradeDate;
	}

	public String getIN_BorrowingDirection() {
		return IN_BorrowingDirection;
	}

	public void setIN_BorrowingDirection(String iN_BorrowingDirection) {
		IN_BorrowingDirection = iN_BorrowingDirection;
	}

	public String getIN_Money() {
		return IN_Money;
	}

	public void setIN_Money(String iN_Money) {
		IN_Money = iN_Money;
	}

	public String getIN_Tips() {
		return IN_Tips;
	}

	public void setIN_Tips(String iN_Tips) {
		IN_Tips = iN_Tips;
	}

	public String getIN_InquireAccountNum() {
		return IN_InquireAccountNum;
	}

	public void setIN_InquireAccountNum(String iN_InquireAccountNum) {
		IN_InquireAccountNum = iN_InquireAccountNum;
	}

	public String getEX_BorrowingDirection() {
		return EX_BorrowingDirection;
	}

	public void setEX_BorrowingDirection(String eX_BorrowingDirection) {
		EX_BorrowingDirection = eX_BorrowingDirection;
	}

	public String getEX_Money() {
		return EX_Money;
	}

	public void setEX_Money(String eX_Money) {
		EX_Money = eX_Money;
	}

	public String getEX_Tips() {
		return EX_Tips;
	}

	public void setEX_Tips(String eX_Tips) {
		EX_Tips = eX_Tips;
	}

	public String getEX_InquireAccountNum() {
		return EX_InquireAccountNum;
	}

	public void setEX_InquireAccountNum(String eX_InquireAccountNum) {
		EX_InquireAccountNum = eX_InquireAccountNum;
	}

}
