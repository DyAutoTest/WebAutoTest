package com.dy.AutoTest.MerchantPortal.POJO;

import java.io.Serializable;

public class TMB2BTradeSummaryQueryBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4493873465546402364L;

	private int ID;
	private String CaseNo;
	private String DateBegin;
	private String DateEnd;
	private String MerchantOrderNO;
	private String PaymentWay;
	private String PaymentChannel;
	private String OrderStatus;
	
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

	public String getPaymentWay() {
		return PaymentWay;
	}

	public void setPaymentWay(String paymentWay) {
		PaymentWay = paymentWay;
	}

	public String getPaymentChannel() {
		return PaymentChannel;
	}

	public void setPaymentChannel(String paymentChannel) {
		PaymentChannel = paymentChannel;
	}

	public String getOrderStatus() {
		return OrderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		OrderStatus = orderStatus;
	}

}
