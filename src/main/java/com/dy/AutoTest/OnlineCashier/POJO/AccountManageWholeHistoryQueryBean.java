package com.dy.AutoTest.OnlineCashier.POJO;

import java.io.Serializable;

public class AccountManageWholeHistoryQueryBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7486741387193622045L;

	private int ID;
	private String CaseNo;
	private String ItemNO;
	private String ItemName;
	private String ItemLv;
	private String DateBegin;
	private String DateEnd;

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

	public String getItemNO() {
		return ItemNO;
	}

	public void setItemNO(String itemNO) {
		ItemNO = itemNO;
	}

	public String getItemName() {
		return ItemName;
	}

	public void setItemName(String itemName) {
		ItemName = itemName;
	}

	public String getItemLv() {
		return ItemLv;
	}

	public void setItemLv(String itemLv) {
		ItemLv = itemLv;
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

}
