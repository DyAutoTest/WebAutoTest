package com.dy.AutoTest.OperationPlatform.POJO;

import java.io.Serializable;

public class AccountManageItemRelationBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5058838382232150829L;

	private int ID;
	private String CaseNo;
	private String ItemNO;
	private String AccountType;
	private String AccountAffiliationOrgnization;
	private String MoneyType;
	private String InternalAccountSign;
	private String InternalAccountBalanceDirect;
	private String BalanceUpdateWay;
	private String ManualAccountingSign;
	private String CancelAccountType;
	private String CancelAccountCategory;

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

	public String getItemNO() {
		return ItemNO;
	}

	public void setItemNO(String itemNO) {
		ItemNO = itemNO;
	}

	public String getAccountType() {
		return AccountType;
	}

	public void setAccountType(String accountType) {
		AccountType = accountType;
	}

	public String getAccountAffiliationOrgnization() {
		return AccountAffiliationOrgnization;
	}

	public void setAccountAffiliationOrgnization(String accountAffiliationOrgnization) {
		AccountAffiliationOrgnization = accountAffiliationOrgnization;
	}

	public String getMoneyType() {
		return MoneyType;
	}

	public void setMoneyType(String moneyType) {
		MoneyType = moneyType;
	}

	public String getInternalAccountSign() {
		return InternalAccountSign;
	}

	public void setInternalAccountSign(String internalAccountSign) {
		InternalAccountSign = internalAccountSign;
	}

	public String getInternalAccountBalanceDirect() {
		return InternalAccountBalanceDirect;
	}

	public void setInternalAccountBalanceDirect(String internalAccountBalanceDirect) {
		InternalAccountBalanceDirect = internalAccountBalanceDirect;
	}

	public String getBalanceUpdateWay() {
		return BalanceUpdateWay;
	}

	public void setBalanceUpdateWay(String balanceUpdateWay) {
		BalanceUpdateWay = balanceUpdateWay;
	}

	public String getManualAccountingSign() {
		return ManualAccountingSign;
	}

	public void setManualAccountingSign(String manualAccountingSign) {
		ManualAccountingSign = manualAccountingSign;
	}

	public String getCancelAccountType() {
		return CancelAccountType;
	}

	public void setCancelAccountType(String cancelAccountType) {
		CancelAccountType = cancelAccountType;
	}

	public String getCancelAccountCategory() {
		return CancelAccountCategory;
	}

	public void setCancelAccountCategory(String cancelAccountCategory) {
		CancelAccountCategory = cancelAccountCategory;
	}

}
