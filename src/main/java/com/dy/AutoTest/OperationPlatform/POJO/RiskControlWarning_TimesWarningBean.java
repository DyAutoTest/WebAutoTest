package com.dy.AutoTest.OperationPlatform.POJO;

import java.io.Serializable;

public class RiskControlWarning_TimesWarningBean implements Serializable{
	private static final long serialVersionUID = 1L;

	private int ID;
	private String CaseNO;
	private String QueryDate;
	private String Module;
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
	public String getQueryDate() {
		return QueryDate;
	}
	public void setQueryDate(String QueryDate) {
		this.QueryDate = QueryDate;
	}
	public String getModule() {
		return Module;
	}
	public void setModule(String Module) {
		this.Module = Module;
	}

}