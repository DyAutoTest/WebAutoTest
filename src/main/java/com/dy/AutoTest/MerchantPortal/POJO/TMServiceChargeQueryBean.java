package com.dy.AutoTest.MerchantPortal.POJO;

import java.io.Serializable;

public class TMServiceChargeQueryBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5665507423460043203L;

	private int ID;
	private String CaseNo;
	private String DateBegin;
	private String DateEnd;
	private String MerchantOrderNO;
	private String TradeMoney;
	private String PaymentChannel;

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

	public String getDateBegin() {
		return DateBegin;
	}

	public void setDateBegin(String dateBegin) {
		DateBegin = dateBegin;
	}

	public String getDateEnd() {
		return DateEnd;
	}

	public void setDateEnd(String dateEnd) {
		DateEnd = dateEnd;
	}

	public String getMerchantOrderNO() {
		return MerchantOrderNO;
	}

	public void setMerchantOrderNO(String merchantOrderNO) {
		MerchantOrderNO = merchantOrderNO;
	}

	public String getTradeMoney() {
		return TradeMoney;
	}

	public void setTradeMoney(String tradeMoney) {
		TradeMoney = tradeMoney;
	}

	public String getPaymentChannel() {
		return PaymentChannel;
	}

	public void setPaymentChannel(String paymentChannel) {
		PaymentChannel = paymentChannel;
	}

}
