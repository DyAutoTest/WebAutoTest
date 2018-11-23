package com.dy.AutoTest.OnlineCashier.POJO;

import java.io.Serializable;

public class FinanceChannelBalanceAccountErrorManageBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 309206531422696974L;

	private int ID;
	private String CaseNo;
	private String ErrorKeys;
	private String ErrorBatchNum;
	private String Channel;
	private String AccountCheckType;
	private String ErrorStatus;
	private String ErrorBuildDateBegin;
	private String ErrorBuildDateEnd;

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

	public String getErrorKeys() {
		return ErrorKeys;
	}

	public void setErrorKeys(String errorKeys) {
		ErrorKeys = errorKeys;
	}

	public String getErrorBatchNum() {
		return ErrorBatchNum;
	}

	public void setErrorBatchNum(String errorBatchNum) {
		ErrorBatchNum = errorBatchNum;
	}

	public String getChannel() {
		return Channel;
	}

	public void setChannel(String channel) {
		Channel = channel;
	}

	public String getAccountCheckType() {
		return AccountCheckType;
	}

	public void setAccountCheckType(String accountCheckType) {
		AccountCheckType = accountCheckType;
	}

	public String getErrorStatus() {
		return ErrorStatus;
	}

	public void setErrorStatus(String errorStatus) {
		ErrorStatus = errorStatus;
	}

	public String getErrorBuildDateBegin() {
		return ErrorBuildDateBegin;
	}

	public void setErrorBuildDateBegin(String errorBuildDateBegin) {
		ErrorBuildDateBegin = errorBuildDateBegin;
	}

	public String getErrorBuildDateEnd() {
		return ErrorBuildDateEnd;
	}

	public void setErrorBuildDateEnd(String errorBuildDateEnd) {
		ErrorBuildDateEnd = errorBuildDateEnd;
	}

}
