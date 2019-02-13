package com.dy.AutoTest.MerchantPortal.POJO;

import java.io.Serializable;

public class TMRechargeQueryBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3103135381731906173L;

	private int ID;
	private String CaseNo;
	private String DateBegin;
	private String DateEnd;
	private String RechargeOrderNO;
	private String RechargeWay;
	private String RechargeMoney;
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

	public String getRechargeOrderNO() {
		return RechargeOrderNO;
	}

	public void setRechargeOrderNO(String rechargeOrderNO) {
		RechargeOrderNO = rechargeOrderNO;
	}

	public String getRechargeWay() {
		return RechargeWay;
	}

	public void setRechargeWay(String rechargeWay) {
		RechargeWay = rechargeWay;
	}

	public String getRechargeMoney() {
		return RechargeMoney;
	}

	public void setRechargeMoney(String rechargeMoney) {
		RechargeMoney = rechargeMoney;
	}

	public String getOrderStatus() {
		return OrderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		OrderStatus = orderStatus;
	}

}
