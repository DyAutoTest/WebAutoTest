package com.dy.AutoTest.OnlineCashier.POJO;

import java.io.Serializable;

public class FinanceChannelManageReturnCodeBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5310375266929555336L;

	private int ID;
	private String CaseNo;
	private String ChannelCode;
	private String ChannelReturnCode;
	private String ChannelReturnCodeDescribe;
	private String PlateformInformCode;
	private String PlateformInformCodeDescribe;
	private String EnableSelect;
	private String ChannelType;
	
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
	public String getChannelCode() {
		return ChannelCode;
	}
	public void setChannelCode(String channelCode) {
		ChannelCode = channelCode;
	}
	public String getChannelReturnCode() {
		return ChannelReturnCode;
	}
	public void setChannelReturnCode(String channelReturnCode) {
		ChannelReturnCode = channelReturnCode;
	}
	public String getChannelReturnCodeDescribe() {
		return ChannelReturnCodeDescribe;
	}
	public void setChannelReturnCodeDescribe(String channelReturnCodeDescribe) {
		ChannelReturnCodeDescribe = channelReturnCodeDescribe;
	}
	public String getPlateformInformCode() {
		return PlateformInformCode;
	}
	public void setPlateformInformCode(String plateformInformCode) {
		PlateformInformCode = plateformInformCode;
	}
	public String getPlateformInformCodeDescribe() {
		return PlateformInformCodeDescribe;
	}
	public void setPlateformInformCodeDescribe(String plateformInformCodeDescribe) {
		PlateformInformCodeDescribe = plateformInformCodeDescribe;
	}
	public String getEnableSelect() {
		return EnableSelect;
	}
	public void setEnableSelect(String enableSelect) {
		EnableSelect = enableSelect;
	}
	public String getChannelType() {
		return ChannelType;
	}
	public void setChannelType(String channelType) {
		ChannelType = channelType;
	}
	
}
