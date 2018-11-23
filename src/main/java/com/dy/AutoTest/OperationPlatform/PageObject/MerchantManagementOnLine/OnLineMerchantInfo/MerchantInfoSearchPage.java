package com.dy.AutoTest.OperationPlatform.PageObject.MerchantManagementOnLine.OnLineMerchantInfo;

import org.openqa.selenium.WebDriver;

import com.dy.AutoTest.web.actions.DoPlus;
import com.dy.AutoTest.web.api.SuperPage;


public class MerchantInfoSearchPage extends SuperPage{
	

	public MerchantInfoSearchPage(WebDriver driver) {
		super(driver);
		du.loadLocator("POP_Loc_MerchanInfoSearch");
	}
	public void setWaitTime(long waitTime) {
		du=new DoPlus(driver);
		du.waitTime=waitTime;
		du.loadLocator("POP_Loc_MerchanInfoSearch");
	}
	
	
	public void doAdvance() {
		du.what("Advance").click();
		du.waitFor(500);
	}
	
	
	public void setMerchantNO(String MerchantNO) {
		du.what("MerchantNO").sendKeys(MerchantNO);
	}
	
	public void setMerchantName(String MerchantName) {
		du.what("Button_SearchMerchant").click();
		du.waitFor(500);
		du.what("MerchantName").sendKeys(MerchantName);
		du.what("Button_MerchantSearch").click();
	}
	
	public boolean isSearchMerchantIndexDisplayed(String SearchMerchant_Index) {
		du.waitFor(1000);
		return du.what("Radio_SearchMerchant_Index",SearchMerchant_Index).isDisplayed();
	}
	
	public void doSearchMerchantSubmit(String SearchMerchant_Index) {
		du.what("Radio_SearchMerchant_Index",SearchMerchant_Index).click();
		du.waitFor(500);
		du.what("Button_SearchMerchant_Submit").click();
		du.waitFor(500);
	}
	
	public void doSearchMerchantClose() {
		du.what("Button_SearchMerchant_Close").click();
	}
	
	/**
	 * @param MerchantType
	 * 
	 * 1 : 互联网商户
	 * 2 : 线下收单商户
	 * 3 : O2O商户
	 * 
	 */
	public void setMerchantType(String MerchantType) {
		du.whatSelect("MerchantType").selectByValue(MerchantType);
	}
	
	public void setStartDate(String StartDate) {
		du.what("StartDate").sendKeys(StartDate);
	}
	
	public void setEndDate(String EndDate) {
		du.what("EndDate").sendKeys(EndDate);
	}
	
	/**
	 * @param MerchantStatus
	 * 
	 * 0 : 正常
	 * 1 : 销户
	 * 4 : 黑名单
	 * 5 : 冻结
	 * 
	 */
	public void setMerchantStatus(String MerchantStatus) {
		du.whatSelect("MerchantStatus").selectByValue(MerchantStatus);
	}
	
	/**
	 * @param Province
	 * 
	 * 09 : Shanghai
	 * 01 : Beijing
	 */
	public void setProvince(String Province) {
		du.whatSelect("Province").selectByValue(Province);
	}
	
	/**
	 * @param City
	 * 
	 * 2900 : 上海市
	 */
	public void setCity(String City) {
		du.whatSelect("City").selectByValue(City);
	}
	
	public void doQuery() {
		du.waitForElementPresent("Button_Query");
		du.what("Button_Query").click();
	}
	
	public void doReset() {
		du.what("Button_Reset").click();
	}
	
	public void selectMerchant(String Merchant_Index) {
		du.what("Radio_Merchant_Index",Merchant_Index).click();
		du.waitFor(500);
	}
	
	public String getMerchantStatus(String Merchant_Index) {
		return du.what("Div_MerchantStatus",Merchant_Index).getText();
	}
	
	public String getMerchantNO() {
		return du.what("Div_MerchantNO").getText();
	}
	
	public void doDetail() {
		du.what("Button_Detail").click();
	}
	
			public void doConfirm() {
				du.waitFor(2000);
				du.what("Button_Confirm").click();
			}
	
	public void doAlter() {
		du.what("Button_Alter").click();
		du.waitFor(1000);
	}
	
			public void setAlterField(String AlterField) {
				du.waitForElementPresent("AlterField");
				du.waitFor(500);
				du.what("AlterField").clear();
				du.waitFor(500);
				du.what("AlterField").sendKeys(AlterField);
				du.waitFor(1000);
			}
	
			public void doAlterSubmit() {
				du.what("Button_AlterSubmit").click();
			}
			
			public void doAlterClose() {
				du.what("Button_AlterClose").click();
			}
			
			public String getAlterField() {
				du.waitFor(500);
				du.waitForElementPresent("AlterField");
				du.waitFor(500);
				return du.what("AlterField").getAttribute("value");
			}
			
	public void doAccountClose() {
		du.what("Button_CloseAccout").click();
	}
	
			public void doCloseAccoutAfirm() {
				du.waitFor(500);
				du.what("Button_CloseAccoutAfirm").click();
			}
	
			public void doCloseAccountClose() {
				du.waitFor(500);
				du.what("Button_CloseAccoutClose").click();
			}
			
			public void doOpenAccountAfirm() {
				du.waitFor(500);
				du.what("Button_OpenAccountAfirm").click();
			}
	
			public void doOpenAccountClose() {
				du.waitFor(500);
				du.what("Button_OpenAccountClose").click();
			}
			
	public void doFrozen() {
		du.what("Button_Frozen").click();
	}
	
			public void doFrozenAfirm() {
				du.waitFor(500);
				du.what("Button_FrozenAfirm").click();
			}
			
			public void doFrozenClose() {
				du.waitFor(500);
				du.what("Button_FrozenClose").click();
			}
			
	public void doUnfrozen() {
		du.what("Button_Unfrozen").click();
	}
	
			public void doUnfrozenAfirm() {
				du.what("Button_UnfrozenAfirm").click();
			}
			
			public void doUnfrozenClose() {
				du.what("Button_UnfrozenClose").click();
			}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
