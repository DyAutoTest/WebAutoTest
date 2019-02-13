package com.dy.AutoTest.AcquiringOperationPlatform.POJO;

import java.io.Serializable;

public class MachineInfoManagement_ManufacturerInfoBrowseBean implements Serializable{
	private static final long serialVersionUID = 1L;

	private int ID;
	private String CaseNO;
	private String ManufacturerNO;
	private String ManufacturerName;
	private String ManufacturerAddress;
	private String PostalCode;
	private String ContactPerson;
	private String ContactNumber;
	private String SaleServiceHotline;
	private String CompanyNature;
	private String CompanyScale;
	private String CompanyURL;
	private String CompanyMail;
	private String TipsInfo;
	private String Radio;
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
	public String getManufacturerNO() {
		return ManufacturerNO;
	}
	public void setManufacturerNO(String ManufacturerNO) {
		this.ManufacturerNO = ManufacturerNO;
	}
	public String getManufacturerName() {
		return ManufacturerName;
	}
	public void setManufacturerName(String ManufacturerName) {
		this.ManufacturerName = ManufacturerName;
	}
	public String getManufacturerAddress() {
		return ManufacturerAddress;
	}
	public void setManufacturerAddress(String ManufacturerAddress) {
		this.ManufacturerAddress = ManufacturerAddress;
	}
	public String getPostalCode() {
		return PostalCode;
	}
	public void setPostalCode(String PostalCode) {
		this.PostalCode = PostalCode;
	}
	public String getContactPerson() {
		return ContactPerson;
	}
	public void setContactPerson(String ContactPerson) {
		this.ContactPerson = ContactPerson;
	}
	public String getContactNumber() {
		return ContactNumber;
	}
	public void setContactNumber(String ContactNumber) {
		this.ContactNumber = ContactNumber;
	}
	public String getSaleServiceHotline() {
		return SaleServiceHotline;
	}
	public void setSaleServiceHotline(String SaleServiceHotline) {
		this.SaleServiceHotline = SaleServiceHotline;
	}
	public String getCompanyNature() {
		return CompanyNature;
	}
	public void setCompanyNature(String CompanyNature) {
		this.CompanyNature = CompanyNature;
	}
	public String getCompanyScale() {
		return CompanyScale;
	}
	public void setCompanyScale(String CompanyScale) {
		this.CompanyScale = CompanyScale;
	}
	public String getCompanyURL() {
		return CompanyURL;
	}
	public void setCompanyURL(String CompanyURL) {
		this.CompanyURL = CompanyURL;
	}
	public String getCompanyMail() {
		return CompanyMail;
	}
	public void setCompanyMail(String CompanyMail) {
		this.CompanyMail = CompanyMail;
	}
	public String getTipsInfo() {
		return TipsInfo;
	}
	public void setTipsInfo(String TipsInfo) {
		this.TipsInfo = TipsInfo;
	}
	public String getRadio() {
		return Radio;
	}
	public void setRadio(String Radio) {
		this.Radio = Radio;
	}

}