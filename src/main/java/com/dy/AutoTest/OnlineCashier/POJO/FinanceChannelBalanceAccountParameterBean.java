package com.dy.AutoTest.OnlineCashier.POJO;

import java.io.Serializable;

public class FinanceChannelBalanceAccountParameterBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2108600011343665886L;

	private int ID;
	private String CaseNo;
	private String ChannelName;
	private String AccountCheckType;
	private String EnableFlag;
	private String AccoutCheckFlag;
	private String BatchAccountCheckSign;
	private String ChannelPlateformNum;
	private String StorageEnteringService;
	private String StorageEnteringTrade;
	private String AccountCheckService;
	private String AccountCheckTrade;
	private String TurnErrorDays;
	private String AccountCheckBeginTime;
	private String AccountCheckEndTime;

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

	public String getChannelName() {
		return ChannelName;
	}

	public void setChannelName(String channelName) {
		ChannelName = channelName;
	}

	public String getAccountCheckType() {
		return AccountCheckType;
	}

	public void setAccountCheckType(String accountCheckType) {
		AccountCheckType = accountCheckType;
	}

	public String getEnableFlag() {
		return EnableFlag;
	}

	public void setEnableFlag(String enableFlag) {
		EnableFlag = enableFlag;
	}

	public String getAccoutCheckFlag() {
		return AccoutCheckFlag;
	}

	public void setAccoutCheckFlag(String accoutCheckFlag) {
		AccoutCheckFlag = accoutCheckFlag;
	}

	public String getBatchAccountCheckSign() {
		return BatchAccountCheckSign;
	}

	public void setBatchAccountCheckSign(String batchAccountCheckSign) {
		BatchAccountCheckSign = batchAccountCheckSign;
	}

	public String getChannelPlateformNum() {
		return ChannelPlateformNum;
	}

	public void setChannelPlateformNum(String channelPlateformNum) {
		ChannelPlateformNum = channelPlateformNum;
	}

	public String getStorageEnteringService() {
		return StorageEnteringService;
	}

	public void setStorageEnteringService(String storageEnteringService) {
		StorageEnteringService = storageEnteringService;
	}

	public String getStorageEnteringTrade() {
		return StorageEnteringTrade;
	}

	public void setStorageEnteringTrade(String storageEnteringTrade) {
		StorageEnteringTrade = storageEnteringTrade;
	}

	public String getAccountCheckService() {
		return AccountCheckService;
	}

	public void setAccountCheckService(String accountCheckService) {
		AccountCheckService = accountCheckService;
	}

	public String getAccountCheckTrade() {
		return AccountCheckTrade;
	}

	public void setAccountCheckTrade(String accountCheckTrade) {
		AccountCheckTrade = accountCheckTrade;
	}

	public String getTurnErrorDays() {
		return TurnErrorDays;
	}

	public void setTurnErrorDays(String turnErrorDays) {
		TurnErrorDays = turnErrorDays;
	}

	public String getAccountCheckBeginTime() {
		return AccountCheckBeginTime;
	}

	public void setAccountCheckBeginTime(String accountCheckBeginTime) {
		AccountCheckBeginTime = accountCheckBeginTime;
	}

	public String getAccountCheckEndTime() {
		return AccountCheckEndTime;
	}

	public void setAccountCheckEndTime(String accountCheckEndTime) {
		AccountCheckEndTime = accountCheckEndTime;
	}

}
