package com.dy.AutoTest.OnlineCashier.POJO;

import java.io.Serializable;

public class CooperatingServiceChannelBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 9191576487775773045L;

	private int ID;
	private String CaseNo;
	private String Search;
	
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
	
}
