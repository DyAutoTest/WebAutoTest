package com.dy.AutoTest.web.api;

import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.dy.AutoTest.web.actions.DoPlus;
import com.dy.AutoTest.web.actions.SingletonSet;

public abstract class SuperPage{
	protected WebDriver driver=null;
	protected DoPlus du=null;
	
	public SuperPage(WebDriver driver) {
		this.driver=driver;
		du=SingletonSet.du;
	}
	public void navigateTo(String url) {
		driver.get(url);
	}

	public void selectAll(String locatorName) {
		du.what(locatorName).sendKeys(Keys.CONTROL + "a");
	}
	
	public void doLoseFocus(String locationName) {
		du.doLeftClickBy(locationName, 0, -20);
	}
	public void doLoseFocus(String locationName,int xOffset,int yOffset) {
		du.doLeftClickBy(locationName, xOffset, yOffset);
	}
	public void doLoseFocus(String locationName,String replaceString,int xOffset,int yOffset) {
		du.doLeftClickBy(locationName,replaceString, xOffset, yOffset);
	}
	
	public void doCancel() {
		du.doSendKeys(Keys.ESCAPE);
	}
	public void doDown() {
		du.doSendKeys(Keys.DOWN);
		du.doSendKeys(Keys.DOWN);
		du.doSendKeys(Keys.DOWN);
	}
	public void doUp() {
		du.doSendKeys(Keys.UP);
		du.doSendKeys(Keys.UP);
		du.doSendKeys(Keys.UP);
	}
	public void doPageDown() {
		du.doSendKeys(Keys.PAGE_DOWN);
	}
	public void doPageUp() {
		du.doSendKeys(Keys.PAGE_UP);
	}
	public void doBACK_SPACE() {
		du.doSendKeys(Keys.BACK_SPACE);
	}
	public void doEnter() {
		du.doSendKeysByRobot(KeyEvent.VK_ENTER);
	}
	public void doLeft() {
		du.doSendKeysByRobot(KeyEvent.VK_LEFT);
	}
	
	public boolean isElementDisplayed(String elementName) {
		return du.what(elementName).isDisplayed();
	}
	
	public boolean isElementDisplayed(String elementName,String replaceString) {
		return du.what(elementName,replaceString).isDisplayed();
	}
	
	public boolean isElementExist(String locationName) {
		try {
            du.what(locationName);
            return true;
        } catch (Exception e) {
            return false;
        }
	}
	
	
	public boolean isElementExist(String locationName,String replaceString) {
		try {
			du.what(locationName, replaceString);
            return true;
        } catch (Exception e) {
            return false;
        }
	}
	
	public void clickElement(String locationName) {
		du.what(locationName).click();
	}
	public void clickElement(String locationName,String replaceString) {
		du.what(locationName,replaceString).click();
	}
	
	public String getCurrentAccountantDate() {
		String CurrentAccountantDate=
				driver.findElement(By.xpath("//span[@class='badge acdt']")).getText();
		CurrentAccountantDate=CurrentAccountantDate.substring(6);
		CurrentAccountantDate=CurrentAccountantDate.substring(0, 4)+"-"+CurrentAccountantDate.substring(5,7)+"-"+CurrentAccountantDate.substring(8,10);
		return CurrentAccountantDate;
	}
	public boolean isPOPTopDisplayed() {
		return driver.findElement(By.xpath("//header")).isDisplayed();
	}
	
	public String getNotice() {
		//消息栏消失后捕获
//		String xpath="//li[@class='messenger-message-slot'][1]/div/div[1]";
		//消息栏未消失
		String xpath="//li[@class='messenger-message-slot messenger-shown messenger-first messenger-last'][1]/div/div[1]";
//		try {
//			(new WebDriverWait(driver, 10))
//				.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
//		}
		try {
			(new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
		}
		catch (Exception e) {
			e.printStackTrace();
			System.out.println("The element can not find!");
		}
//		return du.what("Notice").getAttribute("textContent");
		return driver.findElement(By.xpath(xpath)).getAttribute("textContent");
	}
	
	public void clickAdvance() {
		driver.findElement(By.xpath("//a[@onclick='advanced_query();']")).click();
	}
	
	public abstract void setWaitTime(long waitTime);
}
