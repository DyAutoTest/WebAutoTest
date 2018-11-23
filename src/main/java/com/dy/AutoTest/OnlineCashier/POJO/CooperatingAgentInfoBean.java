package com.dy.AutoTest.OnlineCashier.POJO;

import java.io.Serializable;

public class CooperatingAgentInfoBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1862458995135514766L;

	private int ID;
	private String Search;
	private String CaseNo;
	private String AgentCode;
	private String AgentName;
	private String EnableFlag;
	private String AgentCategory;
	private String ContactName;
	private String ContactTelephone;
	private String CustomerManager;

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getSearch() {
		return Search;
	}

	public void setSearch(String search) {
		Search = search;
	}

	public String getAgentCode() {
		return AgentCode;
	}

	public void setAgentCode(String agentCode) {
		AgentCode = agentCode;
	}

	public String getAgentName() {
		return AgentName;
	}

	public void setAgentName(String agentName) {
		AgentName = agentName;
	}

	public String getCaseNo() {
		return CaseNo;
	}

	public void setCaseNo(String caseNo) {
		CaseNo = caseNo;
	}

	public String getEnableFlag() {
		return EnableFlag;
	}

	public void setEnableFlag(String enableFlag) {
		EnableFlag = enableFlag;
	}

	public String getAgentCategory() {
		return AgentCategory;
	}

	public void setAgentCategory(String agentCategory) {
		AgentCategory = agentCategory;
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

}
