package com.dy.AutoTest.OperationPlatform.POJO;

import java.io.Serializable;

public class RefusedTradeQuery_BeforehandBlackListRefusedQueryBean implements Serializable{
	private static final long serialVersionUID = 1L;

	private int ID;
	private String CaseNO;
	private String QueryDateBegin;
	private String QueryDateEnd;
	public int getID() {
		return ID;
	}
	public void setID(int ID) {
		this.ID = ID;
	}
	public String getCaseNO() {
		return CaseNO;
	}
	public void setCaseNO(String CaseNO) {
		this.CaseNO = CaseNO;
	}
	public String getQueryDateBegin() {
		return QueryDateBegin;
	}
	public void setQueryDateBegin(String QueryDateBegin) {
		this.QueryDateBegin = QueryDateBegin;
	}
	public String getQueryDateEnd() {
		return QueryDateEnd;
	}
	public void setQueryDateEnd(String QueryDateEnd) {
		this.QueryDateEnd = QueryDateEnd;
	}

}