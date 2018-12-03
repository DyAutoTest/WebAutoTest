package com.dy.AutoTest.OperationPlatform.POJO;

import java.io.Serializable;

public class SettlementManagement_PaymentWorkFlowQueryBean implements Serializable{
	private static final long serialVersionUID = 1L;

	private String CaseNO;
	private String OrderStatus;
	private String ApprovalWorkFlow;
	private String PaymentApplicationDateEnd;
	private String InnerUserNO;
	private int ID;
	private String PayType;
	private String PaymentApplicationDateBegin;
	private String CheckBoxSingle;
	public String getCaseNO() {
		return CaseNO;
	}
	public void setCaseNO(String CaseNO) {
		this.CaseNO = CaseNO;
	}
	public String getOrderStatus() {
		return OrderStatus;
	}
	public void setOrderStatus(String OrderStatus) {
		this.OrderStatus = OrderStatus;
	}
	public String getApprovalWorkFlow() {
		return ApprovalWorkFlow;
	}
	public void setApprovalWorkFlow(String ApprovalWorkFlow) {
		this.ApprovalWorkFlow = ApprovalWorkFlow;
	}
	public String getPaymentApplicationDateEnd() {
		return PaymentApplicationDateEnd;
	}
	public void setPaymentApplicationDateEnd(String PaymentApplicationDateEnd) {
		this.PaymentApplicationDateEnd = PaymentApplicationDateEnd;
	}
	public String getInnerUserNO() {
		return InnerUserNO;
	}
	public void setInnerUserNO(String InnerUserNO) {
		this.InnerUserNO = InnerUserNO;
	}
	public int getID() {
		return ID;
	}
	public void setID(int ID) {
		this.ID = ID;
	}
	public String getPayType() {
		return PayType;
	}
	public void setPayType(String PayType) {
		this.PayType = PayType;
	}
	public String getPaymentApplicationDateBegin() {
		return PaymentApplicationDateBegin;
	}
	public void setPaymentApplicationDateBegin(String PaymentApplicationDateBegin) {
		this.PaymentApplicationDateBegin = PaymentApplicationDateBegin;
	}
	public String getCheckBoxSingle() {
		return CheckBoxSingle;
	}
	public void setCheckBoxSingle(String CheckBoxSingle) {
		this.CheckBoxSingle = CheckBoxSingle;
	}

}