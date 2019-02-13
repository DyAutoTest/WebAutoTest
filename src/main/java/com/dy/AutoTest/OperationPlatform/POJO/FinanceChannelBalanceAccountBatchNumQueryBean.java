package com.dy.AutoTest.OperationPlatform.POJO;

import java.io.Serializable;

public class FinanceChannelBalanceAccountBatchNumQueryBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6314289221100708024L;

	private int ID;
	private String CaseNo;
	private String Channel;
	private String AccountCheckBatchNum;
	private String AccountCheckType;
	private String AccountCheckFileDate;
	private String ChannelPlateform;
	private String BatchAccountSign;

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

	public String getChannel() {
		return Channel;
	}

	public void setChannel(String channel) {
		Channel = channel;
	}

	public String getAccountCheckBatchNum() {
		return AccountCheckBatchNum;
	}

	public void setAccountCheckBatchNum(String accountCheckBatchNum) {
		AccountCheckBatchNum = accountCheckBatchNum;
	}

	public String getAccountCheckType() {
		return AccountCheckType;
	}

	public void setAccountCheckType(String accountCheckType) {
		AccountCheckType = accountCheckType;
	}

	public String getAccountCheckFileDate() {
		return AccountCheckFileDate;
	}

	public void setAccountCheckFileDate(String accountCheckFileDate) {
		AccountCheckFileDate = accountCheckFileDate;
	}

	public String getChannelPlateform() {
		return ChannelPlateform;
	}

	public void setChannelPlateform(String channelPlateform) {
		ChannelPlateform = channelPlateform;
	}

	public String getBatchAccountSign() {
		return BatchAccountSign;
	}

	public void setBatchAccountSign(String batchAccountSign) {
		BatchAccountSign = batchAccountSign;
	}

}
