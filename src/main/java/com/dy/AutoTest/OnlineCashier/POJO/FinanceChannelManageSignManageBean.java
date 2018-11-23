package com.dy.AutoTest.OnlineCashier.POJO;

import java.io.Serializable;

public class FinanceChannelManageSignManageBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2447667857413701305L;

	private int ID;
	private String CaseNo;
	private String Name;
	private String IDNum;
	private String BankCardID;
	private String SigningDateBegin;
	private String SigningDateEnd;
	private String Channel;
	private String SendingCardBank;
	private String SigningStatus;
	private String PhoneNum;
	private String PlatformExpressProtocol;
	private String ChannelReturnProtocolCode;

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

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getIDNum() {
		return IDNum;
	}

	public void setIDNum(String iDNum) {
		IDNum = iDNum;
	}

	public String getBankCardID() {
		return BankCardID;
	}

	public void setBankCardID(String bankCardID) {
		BankCardID = bankCardID;
	}

	public String getSigningDateBegin() {
		return SigningDateBegin;
	}

	public void setSigningDateBegin(String signingDateBegin) {
		SigningDateBegin = signingDateBegin;
	}

	public String getSigningDateEnd() {
		return SigningDateEnd;
	}

	public void setSigningDateEnd(String signingDateEnd) {
		SigningDateEnd = signingDateEnd;
	}

	public String getChannel() {
		return Channel;
	}

	public void setChannel(String channel) {
		Channel = channel;
	}

	public String getSendingCardBank() {
		return SendingCardBank;
	}

	public void setSendingCardBank(String sendingCardBank) {
		SendingCardBank = sendingCardBank;
	}

	public String getSigningStatus() {
		return SigningStatus;
	}

	public void setSigningStatus(String signingStatus) {
		SigningStatus = signingStatus;
	}

	public String getPhoneNum() {
		return PhoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		PhoneNum = phoneNum;
	}

	public String getPlatformExpressProtocol() {
		return PlatformExpressProtocol;
	}

	public void setPlatformExpressProtocol(String platformExpressProtocol) {
		PlatformExpressProtocol = platformExpressProtocol;
	}

	public String getChannelReturnProtocolCode() {
		return ChannelReturnProtocolCode;
	}

	public void setChannelReturnProtocolCode(String channelReturnProtocolCode) {
		ChannelReturnProtocolCode = channelReturnProtocolCode;
	}

}
