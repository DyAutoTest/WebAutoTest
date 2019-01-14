package com.dy.AutoTest.OnlineCashier.POJO;

import java.io.Serializable;

public class AccountManageInformDetailQueryBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5719742605010207608L;

	private int ID;
	private String CaseNo;
	private String InnerUserNO;
	private String AccountType;
	private String AccountNO;
	private String AccountFrozen_FrozenType;
	private String AccountFrozen_FrozenMoney;
	private String AccountFrozen_Tips;

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

	public String getAccountType() {
		return AccountType;
	}

	public void setAccountType(String accountType) {
		AccountType = accountType;
	}

	public String getAccountNO() {
		return AccountNO;
	}

	public void setAccountNO(String accountNO) {
		AccountNO = accountNO;
	}

	public String getAccountFrozen_FrozenType() {
		return AccountFrozen_FrozenType;
	}

	public void setAccountFrozen_FrozenType(String accountFrozen_FrozenType) {
		AccountFrozen_FrozenType = accountFrozen_FrozenType;
	}

	public String getAccountFrozen_FrozenMoney() {
		return AccountFrozen_FrozenMoney;
	}

	public void setAccountFrozen_FrozenMoney(String accountFrozen_FrozenMoney) {
		AccountFrozen_FrozenMoney = accountFrozen_FrozenMoney;
	}

	public String getAccountFrozen_Tips() {
		return AccountFrozen_Tips;
	}

	public void setAccountFrozen_Tips(String accountFrozen_Tips) {
		AccountFrozen_Tips = accountFrozen_Tips;
	}

}
