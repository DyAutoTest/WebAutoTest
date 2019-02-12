package com.dy.AutoTest.web.api;

public interface ISearchMerchant {
	
	public void setMerchantNO(String value);
	public void clickSearchMer();
	public void setSearchMer_MerName(String value);
	public void clickSearchMer_Search();
	
	public boolean isSearchMer_RadioDisplayed(String index);
	public void clickSearchMer_Close();
	
	public void clickSearchMer_Radio(String index);
	public void clickSearchMer_Submit();
}
