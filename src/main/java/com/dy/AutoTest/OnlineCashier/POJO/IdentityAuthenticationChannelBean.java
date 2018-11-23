package com.dy.AutoTest.OnlineCashier.POJO;

import java.io.Serializable;

public class IdentityAuthenticationChannelBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6875316999637686120L;
	
	private int ID;
	private String CaseNo;
	private String ChannelCode;
	private String ChannelName;
	private String ChannelCategory;
	private String ChannelLevel;
	
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

	public String getChannelCode() {
		return ChannelCode;
	}
	
	public void setChannelCode(String channelCode) {
		ChannelCode = channelCode;
	}
	
	public String getChannelName() {
		return ChannelName;
	}
	
	public void setChannelName(String channelName) {
		ChannelName = channelName;
	}
	
	public String getChannelCategory() {
		return ChannelCategory;
	}
	
	public void setChannelCategory(String channelCategory) {
		ChannelCategory = channelCategory;
	}
	
	public String getChannelLevel() {
		return ChannelLevel;
	}
	
	public void setChannelLevel(String channelLevel) {
		ChannelLevel = channelLevel;
	}
	
}
