package com.dy.AutoTest.OnlineCashier.POJO;

import java.io.Serializable;

public class AccountManageFrozenDetailQueryBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7066069001672456311L;

	private int ID;
	private String CaseNo;
	private String InnerUserNO;
	private String FrozenStatus;
	private String AccountNO;
	private String Currency;
	private String OwnershipOfAccounts;
	private String MoneyType;

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

	public String getInnerUserNO() {
		return InnerUserNO;
	}

	public void setInnerUserNO(String innerUserNO) {
		InnerUserNO = innerUserNO;
	}

	public String getFrozenStatus() {
		return FrozenStatus;
	}

	public void setFrozenStatus(String frozenStatus) {
		FrozenStatus = frozenStatus;
	}

	public String getAccountNO() {
		return AccountNO;
	}

	public void setAccountNO(String accountNO) {
		AccountNO = accountNO;
	}

	public String getCurrency() {
		return Currency;
	}

	public void setCurrency(String currency) {
		Currency = currency;
	}

	public String getOwnershipOfAccounts() {
		return OwnershipOfAccounts;
	}

	public void setOwnershipOfAccounts(String ownershipOfAccounts) {
		OwnershipOfAccounts = ownershipOfAccounts;
	}

	public String getMoneyType() {
		return MoneyType;
	}

	public void setMoneyType(String moneyType) {
		MoneyType = moneyType;
	}

}
