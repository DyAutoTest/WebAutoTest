package com.dy.AutoTest.web.api;

public interface SearchMerchantByNOorName {
	
	public void setMerchantNO(String value);
	public void clickSearchMer();
	public void setSearchMer_MerName(String value);
	public void clickSearchMer_Search();
	
	public boolean isSearchMerchantIndexDisplayed(String index);
	public void clickSearchMer_Close();
	
	public void clickSearchMer_Index(String index);
	public void clickSearchMer_Submit();
}
