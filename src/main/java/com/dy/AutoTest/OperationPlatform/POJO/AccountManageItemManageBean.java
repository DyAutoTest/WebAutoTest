package com.dy.AutoTest.OperationPlatform.POJO;

import java.io.Serializable;

public class AccountManageItemManageBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1816176255881701292L;

	private int ID;
	private String CaseNo;
	private String ItemNO;
	private String ItemLv;
	private String Status;
	private String ItemCnName;
	private String ItemEnName;
	private String HigherItemNum;
	private String LowestItemSign;
	private String ItemType;
	private String ItemClassify;
	private String LossGainBroughtForwardSign;
	private String BalanceDirection;
	private String BalanceOverdraftSign;
	private String ItemBalanceZeroSign;
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

	public String getItemLv() {
		return ItemLv;
	}

	public void setItemLv(String itemLv) {
		ItemLv = itemLv;
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}

	public String getItemCnName() {
		return ItemCnName;
	}

	public void setItemCnName(String itemCnName) {
		ItemCnName = itemCnName;
	}

	public String getItemEnName() {
		return ItemEnName;
	}

	public void setItemEnName(String itemEnName) {
		ItemEnName = itemEnName;
	}

	public String getHigherItemNum() {
		return HigherItemNum;
	}

	public void setHigherItemNum(String higherItemNum) {
		HigherItemNum = higherItemNum;
	}

	public String getLowestItemSign() {
		return LowestItemSign;
	}

	public void setLowestItemSign(String lowestItemSign) {
		LowestItemSign = lowestItemSign;
	}

	public String getItemType() {
		return ItemType;
	}

	public void setItemType(String itemType) {
		ItemType = itemType;
	}

	public String getItemClassify() {
		return ItemClassify;
	}

	public void setItemClassify(String itemClassify) {
		ItemClassify = itemClassify;
	}

	public String getLossGainBroughtForwardSign() {
		return LossGainBroughtForwardSign;
	}

	public void setLossGainBroughtForwardSign(String lossGainBroughtForwardSign) {
		LossGainBroughtForwardSign = lossGainBroughtForwardSign;
	}

	public String getBalanceDirection() {
		return BalanceDirection;
	}

	public void setBalanceDirection(String balanceDirection) {
		BalanceDirection = balanceDirection;
	}

	public String getBalanceOverdraftSign() {
		return BalanceOverdraftSign;
	}

	public void setBalanceOverdraftSign(String balanceOverdraftSign) {
		BalanceOverdraftSign = balanceOverdraftSign;
	}

	public String getItemBalanceZeroSign() {
		return ItemBalanceZeroSign;
	}

	public void setItemBalanceZeroSign(String itemBalanceZeroSign) {
		ItemBalanceZeroSign = itemBalanceZeroSign;
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
