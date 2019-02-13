package com.dy.AutoTest.MerchantPortal.POJO;

import java.io.Serializable;

public class TMSettleAccountsQueryBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5741012508780285357L;

	private int ID;
	private String CaseNo;
	private String DateBegin;
	private String DateEnd;
	private String SettleAccountType;
	private String SettleAccountStatus;
	private String WithdrawDepositMoney;

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

	public String getDateBegin() {
		return DateBegin;
	}

	public void setDateBegin(String dateBegin) {
		DateBegin = dateBegin;
	}

	public String getDateEnd() {
		return DateEnd;
	}

	public void setDateEnd(String dateEnd) {
		DateEnd = dateEnd;
	}

	public String getSettleAccountType() {
		return SettleAccountType;
	}

	public void setSettleAccountType(String settleAccountType) {
		SettleAccountType = settleAccountType;
	}

	public String getSettleAccountStatus() {
		return SettleAccountStatus;
	}

	public void setSettleAccountStatus(String settleAccountStatus) {
		SettleAccountStatus = settleAccountStatus;
	}

	public String getWithdrawDepositMoney() {
		return WithdrawDepositMoney;
	}

	public void setWithdrawDepositMoney(String withdrawDepositMoney) {
		WithdrawDepositMoney = withdrawDepositMoney;
	}

}
