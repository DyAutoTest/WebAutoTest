package com.dy.AutoTest.MerchantPortal.POJO;

import java.io.Serializable;

public class TMB2BTradeDetailQueryBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3276983853001052286L;

	private int ID;
	private String CaseNo;
	private String DateBegin;
	private String DateEnd;
	private String MerchantOrderNO;
	private String PaymentWay;
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

	public String getOrderStatus() {
		return OrderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		OrderStatus = orderStatus;
	}

}
