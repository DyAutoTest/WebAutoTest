package com.dy.AutoTest.OperationPlatform.POJO;

import java.io.Serializable;

public class MainChildMerRelationshipBean implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int ID;
	private String CaseNO;
	private String MainMerNum;
	private String MainMerName;
	private String ChildMerNum;
	private String ChildMerName;
	private String Radio;
	private String SearchMainMer_Radio;
	private String SearchChildMer_Radio;
	private String MainChildMerAdd_Status;
	private String Update_Status;
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getCaseNO() {
		return CaseNO;
	}
	public void setCaseNO(String caseNO) {
		CaseNO = caseNO;
	}
	public String getMainMerNum() {
		return MainMerNum;
	}
	public void setMainMerNum(String mainMerNum) {
		MainMerNum = mainMerNum;
	}
	public String getMainMerName() {
		return MainMerName;
	}
	public void setMainMer_MerName(String mainMerName) {
		MainMerName = mainMerName;
	}
	public String getChildMerNum() {
		return ChildMerNum;
	}
	public void setChildMerNum(String childMerNum) {
		ChildMerNum = childMerNum;
	}
	public String getChildMerName() {
		return ChildMerName;
	}
	public void setChildMer_MerName(String childMerName) {
		ChildMerName = childMerName;
	}
	public String getRadio() {
		return Radio;
	}
	public void setRadio(String radio) {
		Radio = radio;
	}
	public String getSearchMainMer_Radio() {
		return SearchMainMer_Radio;
	}
	public void setSearchMainMer_Radio(String searchMainMer_Radio) {
		SearchMainMer_Radio = searchMainMer_Radio;
	}
	public String getSearchChildMer_Radio() {
		return SearchChildMer_Radio;
	}
	public void setSearchChildMer_Radio(String searchChildMer_Radio) {
		SearchChildMer_Radio = searchChildMer_Radio;
	}
	public String getMainChildMerAdd_Status() {
		return MainChildMerAdd_Status;
	}
	public void setMainChildMerAdd_Status(String mainChildMerAdd_Status) {
		MainChildMerAdd_Status = mainChildMerAdd_Status;
	}
	public String getUpdate_Status() {
		return Update_Status;
	}
	public void setUpdate_Status(String update_Status) {
		Update_Status = update_Status;
	}
}
