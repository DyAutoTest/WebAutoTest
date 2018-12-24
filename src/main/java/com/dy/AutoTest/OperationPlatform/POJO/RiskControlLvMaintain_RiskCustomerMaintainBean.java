package com.dy.AutoTest.OperationPlatform.POJO;

import java.io.Serializable;

public class RiskControlLvMaintain_RiskCustomerMaintainBean implements Serializable{
	private static final long serialVersionUID = 1L;

	private int ID;
	private String CaseNO;
	private String CustomerNO;
	private String UserNO;
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
	public String getCustomerNO() {
		return CustomerNO;
	}
	public void setCustomerNO(String CustomerNO) {
		this.CustomerNO = CustomerNO;
	}
	public String getUserNO() {
		return UserNO;
	}
	public void setUserNO(String UserNO) {
		this.UserNO = UserNO;
	}

}