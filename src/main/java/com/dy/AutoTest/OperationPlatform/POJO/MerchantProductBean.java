package com.dy.AutoTest.OperationPlatform.POJO;

import java.io.Serializable;

public class MerchantProductBean implements Serializable{
	private static final long serialVersionUID = 1L;

	private int ID;
	private String CaseNO;
	private String MerchantNO;
	private String MerchantName;
	private String ProductType;
	public int getID() {
		return ID;
	}
	public void setID(int ID) {
		this.ID = ID;
	}
	public String getCaseNO() {
		return CaseNO;
	}
	public void setCaseNO(String CaseNO) {
		this.CaseNO = CaseNO;
	}
	public String getMerchantNO() {
		return MerchantNO;
	}
	public void setMerchantNO(String MerchantNO) {
		this.MerchantNO = MerchantNO;
	}
	public String getMerchantName() {
		return MerchantName;
	}
	public void setMerchantName(String MerchantName) {
		this.MerchantName = MerchantName;
	}
	public String getProductType() {
		return ProductType;
	}
	public void setProductType(String ProductType) {
		this.ProductType = ProductType;
	}

}