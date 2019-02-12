package com.dy.AutoTest.web.api;

public interface ISearchMerchant_Add {
	
	public void setAdd_SearchMer_MerNO(String value);
	public void clickAdd_SearchMer();
	public void setAdd_SearchMer_MerName(String value);
	public void clickAdd_SearchMer_Search();
	
	public boolean isAdd_SearchMer_RadioDisplayed(String index);
	public void clickAdd_SearchMer_Close();
	
	public void clickAdd_SearchMer_Radio(String index);
	public void clickAdd_SearchMer_Submit();
}
