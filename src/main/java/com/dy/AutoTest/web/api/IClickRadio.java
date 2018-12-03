package com.dy.AutoTest.web.api;

public interface IClickRadio {
	
	public void clickQuery();
	public boolean isElementExist(String locatorName,String radio);
	public void clickRadio(String radio);
	public void doPageDown();
	public void doPageUp();
	public boolean isElementDisplayed(String locatorName,String radio);
	public void doLoseFocus(String locationName,String replaceString,int xOffset,int yOffset);
	
}
