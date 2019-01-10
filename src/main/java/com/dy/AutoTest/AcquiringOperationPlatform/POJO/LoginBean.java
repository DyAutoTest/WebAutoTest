package com.dy.AutoTest.AcquiringOperationPlatform.POJO;

import java.io.Serializable;

public class LoginBean implements Serializable{
	private static final long serialVersionUID = 1L;

	private int ID;
	private String CaseNO;
	private String OperID;
	private String Password;
	private String Comment;
	private String MobileNO;
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
	public String getOperID() {
		return OperID;
	}
	public void setOperID(String OperID) {
		this.OperID = OperID;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String Password) {
		this.Password = Password;
	}
	public String getComment() {
		return Comment;
	}
	public void setComment(String Comment) {
		this.Comment = Comment;
	}
	public String getMobileNO() {
		return MobileNO;
	}
	public void setMobileNO(String MobileNO) {
		this.MobileNO = MobileNO;
	}

}