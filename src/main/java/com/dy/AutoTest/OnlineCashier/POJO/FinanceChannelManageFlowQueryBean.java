package com.dy.AutoTest.OnlineCashier.POJO;

import java.io.Serializable;

public class FinanceChannelManageFlowQueryBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6057404721937745220L;

	private int ID;
	private String CaseNo;
	private String RequestSerialNumber;
	private String TradeStatus;
	private String AccountDateBegin;
	private String AccountDateEnd;
	private String RequestDateBegin;
	private String RequestDateEnd;
	private String InterfaceType;
	private String AccountCheckBatchNum;
	private String InternalOrderNum;
	private String MerchantNum;
	private String Channel;
	private String AccountCheckStatus;
	private String ChannelOrderNum;

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

	public String getRequestSerialNumber() {
		return RequestSerialNumber;
	}

	public void setRequestSerialNumber(String requestSerialNumber) {
		RequestSerialNumber = requestSerialNumber;
	}

	public String getTradeStatus() {
		return TradeStatus;
	}

	public void setTradeStatus(String tradeStatus) {
		TradeStatus = tradeStatus;
	}

	public String getAccountDateBegin() {
		return AccountDateBegin;
	}

	public void setAccountDateBegin(String accountDateBegin) {
		AccountDateBegin = accountDateBegin;
	}

	public String getAccountDateEnd() {
		return AccountDateEnd;
	}

	public void setAccountDateEnd(String accountDateEnd) {
		AccountDateEnd = accountDateEnd;
	}

	public String getRequestDateBegin() {
		return RequestDateBegin;
	}

	public void setRequestDateBegin(String requestDateBegin) {
		RequestDateBegin = requestDateBegin;
	}

	public String getRequestDateEnd() {
		return RequestDateEnd;
	}

	public void setRequestDateEnd(String requestDateEnd) {
		RequestDateEnd = requestDateEnd;
	}

	public String getInterfaceType() {
		return InterfaceType;
	}

	public void setInterfaceType(String interfaceType) {
		InterfaceType = interfaceType;
	}

	public String getAccountCheckBatchNum() {
		return AccountCheckBatchNum;
	}

	public void setAccountCheckBatchNum(String accountCheckBatchNum) {
		AccountCheckBatchNum = accountCheckBatchNum;
	}

	public String getInternalOrderNum() {
		return InternalOrderNum;
	}

	public void setInternalOrderNum(String internalOrderNum) {
		InternalOrderNum = internalOrderNum;
	}

	public String getMerchantNum() {
		return MerchantNum;
	}

	public void setMerchantNum(String merchantNum) {
		MerchantNum = merchantNum;
	}

	public String getChannel() {
		return Channel;
	}

	public void setChannel(String channel) {
		Channel = channel;
	}

	public String getAccountCheckStatus() {
		return AccountCheckStatus;
	}

	public void setAccountCheckStatus(String accountCheckStatus) {
		AccountCheckStatus = accountCheckStatus;
	}

	public String getChannelOrderNum() {
		return ChannelOrderNum;
	}

	public void setChannelOrderNum(String channelOrderNum) {
		ChannelOrderNum = channelOrderNum;
	}

}
