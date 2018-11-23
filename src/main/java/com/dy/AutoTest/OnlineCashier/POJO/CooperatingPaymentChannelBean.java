package com.dy.AutoTest.OnlineCashier.POJO;

import java.io.Serializable;

public class CooperatingPaymentChannelBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4925311906480217537L;

	private int ID;
	private String CaseNo;
	private String Search;
	private String AgentCooperating;
	private String ChannelType;
	private String EnableFlag;
	private String ChannelName;
	private String DirectCooperatingFlag;
	private String UnionBankCode;
	private String CashAccount;
	private String SettleAccountDirect;
	private String SettleBankCode;
	private String SettleAccountBankName;
	private String SettleAccountName;
	private String SettleAccount;
	private String DisplayOrder;
	private String MerchantNumber;
	private String ContactName;
	private String ContactTelephone;
	private String CustomerManager;
	private String OneOrderLimit;
	private String OneDayLimit;

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}
	
	public String getSettleAccountBankName() {
		return SettleAccountBankName;
	}

	public void setSettleAccountBankName(String settleAccountBankName) {
		SettleAccountBankName = settleAccountBankName;
	}

	public String getChannelType() {
		return ChannelType;
	}

	public void setChannelType(String channelType) {
		ChannelType = channelType;
	}
	
	public String getEnableFlag() {
		return EnableFlag;
	}

	public void setEnableFlag(String enableFlag) {
		EnableFlag = enableFlag;
	}

	public String getSearch() {
		return Search;
	}

	public void setSearch(String search) {
		Search = search;
	}

	public String getCaseNo() {
		return CaseNo;
	}

	public void setCaseNo(String caseNo) {
		CaseNo = caseNo;
	}

	public String getAgentCooperating() {
		return AgentCooperating;
	}

	public void setAgentCooperating(String agentCooperating) {
		AgentCooperating = agentCooperating;
	}

	public String getChannelName() {
		return ChannelName;
	}

	public void setChannelName(String channelName) {
		ChannelName = channelName;
	}

	public String getDirectCooperatingFlag() {
		return DirectCooperatingFlag;
	}

	public void setDirectCooperatingFlag(String directCooperatingFlag) {
		DirectCooperatingFlag = directCooperatingFlag;
	}

	public String getUnionBankCode() {
		return UnionBankCode;
	}

	public void setUnionBankCode(String unionBankCode) {
		UnionBankCode = unionBankCode;
	}

	public String getCashAccount() {
		return CashAccount;
	}

	public void setCashAccount(String cashAccount) {
		CashAccount = cashAccount;
	}

	public String getSettleAccountDirect() {
		return SettleAccountDirect;
	}

	public void setSettleAccountDirect(String settleAccountDirect) {
		SettleAccountDirect = settleAccountDirect;
	}

	public String getSettleBankCode() {
		return SettleBankCode;
	}

	public void setSettleBankCode(String settleBankCode) {
		SettleBankCode = settleBankCode;
	}

	public String getSettleAccountName() {
		return SettleAccountName;
	}

	public void setSettleAccountName(String settleAccountName) {
		SettleAccountName = settleAccountName;
	}

	public String getSettleAccount() {
		return SettleAccount;
	}

	public void setSettleAccount(String settleAccount) {
		SettleAccount = settleAccount;
	}

	public String getDisplayOrder() {
		return DisplayOrder;
	}

	public void setDisplayOrder(String displayOrder) {
		DisplayOrder = displayOrder;
	}

	public String getMerchantNumber() {
		return MerchantNumber;
	}

	public void setMerchantNumber(String merchantNumber) {
		MerchantNumber = merchantNumber;
	}

	public String getContactName() {
		return ContactName;
	}

	public void setContactName(String contactName) {
		ContactName = contactName;
	}

	public String getContactTelephone() {
		return ContactTelephone;
	}

	public void setContactTelephone(String contactTelephone) {
		ContactTelephone = contactTelephone;
	}

	public String getCustomerManager() {
		return CustomerManager;
	}

	public void setCustomerManager(String customerManager) {
		CustomerManager = customerManager;
	}

	public String getOneOrderLimit() {
		return OneOrderLimit;
	}

	public void setOneOrderLimit(String oneOrderLimit) {
		OneOrderLimit = oneOrderLimit;
	}

	public String getOneDayLimit() {
		return OneDayLimit;
	}

	public void setOneDayLimit(String oneDayLimit) {
		OneDayLimit = oneDayLimit;
	}

}
