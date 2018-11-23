package com.dy.AutoTest.OnlineCashier.POJO;

import java.io.Serializable;

public class CooperatingRouteInfoBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3064433722098157140L;
	
	private int ID;
	private String CaseNo;
	private String Search;
	
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

	public String getCaseNo() {
		return CaseNo;
	}

	public void setCaseNo(String caseNo) {
		CaseNo = caseNo;
	}
	
}
