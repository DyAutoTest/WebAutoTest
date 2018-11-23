package com.dy.AutoTest.OnlineCashier.POJO;

import java.io.Serializable;

public class IdentityAuthenticationRouteBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8362623926406474318L;

	private int ID;
	private String CertificateType;
	private String ServiceType;
	private String RouteChannelCode;
	
	public int getID() {
		return ID;
	}
	
	public void setID(int iD) {
		ID = iD;
	}
	
	public String getCertificateType() {
		return CertificateType;
	}
	
	public void setCertificateType(String certificateType) {
		CertificateType = certificateType;
	}
	
	public String getServiceType() {
		return ServiceType;
	}
	
	public void setServiceType(String serviceType) {
		ServiceType = serviceType;
	}
	
	public String getRouteChannelCode() {
		return RouteChannelCode;
	}
	
	public void setRouteChannelCode(String routeChannelCode) {
		RouteChannelCode = routeChannelCode;
	}
	
}
