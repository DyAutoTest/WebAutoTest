package com.dy.AutoTest.OperationPlatform.POJO;

import java.io.Serializable;

public class AccountManageInternalAccountHistoryBalanceBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1840311772375486700L;

	private int ID;
	private String CaseNo;
	private String InnerlAccountNO;
	private String AccountAffiliationOrgnization;
	private String AccountType;
	private String AccountDateBegin;
	private String AccountDateEnd;
	private String ItemName;
	private String FeatureCode;
	private String Currency;

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

	public String getInnerlAccountNO() {
		return InnerlAccountNO;
	}

	public void setInnerlAccountNO(String innerlAccountNO) {
		InnerlAccountNO = innerlAccountNO;
	}

	public String getAccountAffiliationOrgnization() {
		return AccountAffiliationOrgnization;
	}

	public void setAccountAffiliationOrgnization(String accountAffiliationOrgnization) {
		AccountAffiliationOrgnization = accountAffiliationOrgnization;
	}

	public String getAccountType() {
		return AccountType;
	}

	public void setAccountType(String accountType) {
		AccountType = accountType;
	}

	public String getAccountDateBegin() {
		return AccountDateBegin;
	}

	public void setAccountDateBegin(String accountDateBegin) {
		AccountDateBegin = accountDateBegin;
	}

	public String getAccountDateEnd() {
		return AccountDateEnd;
	}

	public void setAccountDateEnd(String accountDateEnd) {
		AccountDateEnd = accountDateEnd;
	}

	public String getItemName() {
		return ItemName;
	}

	public void setItemName(String itemName) {
		ItemName = itemName;
	}

	public String getFeatureCode() {
		return FeatureCode;
	}

	public void setFeatureCode(String featureCode) {
		FeatureCode = featureCode;
	}

	public String getCurrency() {
		return Currency;
	}

	public void setCurrency(String currency) {
		Currency = currency;
	}
}
