package com.dy.AutoTest.web.api;

public interface IClickButton {
	
	public boolean isElementExist(String buttonName);
	public boolean isElementDisplayed(String buttonName);
	public void clickElement(String buttonName);
	public void doPageDown();
	public void doPageUp();
	
}
