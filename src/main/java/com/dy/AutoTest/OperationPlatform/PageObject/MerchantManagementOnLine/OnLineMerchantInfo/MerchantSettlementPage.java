package com.dy.AutoTest.OperationPlatform.PageObject.MerchantManagementOnLine.OnLineMerchantInfo;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

import com.dy.AutoTest.OperationPlatform.PageObject.SuperPage;
import com.dy.AutoTest.web.actions.DoPlus;


public class MerchantSettlementPage extends SuperPage{

	public MerchantSettlementPage(WebDriver driver) {
		super(driver);
		du.loadLocator("POP_Loc_MerchantSettlement");
	} 
	
	public void setWaitTime(long waitTime) {
		du=new DoPlus(driver);
		du.waitTime=waitTime;
		du.loadLocator("POP_Loc_MerchantSettlement");
	}
/*	
	public String getCurrentAccountantDate() {
		String CurrentAccountantDate=
				driver.findElement(By.xpath("//span[@class='badge acdt']")).getText();
		CurrentAccountantDate=CurrentAccountantDate.substring(6);
		CurrentAccountantDate=CurrentAccountantDate.substring(0, 4)+"-"+CurrentAccountantDate.substring(5,7)+"-"+CurrentAccountantDate.substring(8,10);
		return CurrentAccountantDate;
	}*/
	/*****************Public**********************/
	public String getSettlementStatus() {
		return du.what("Label_SettlementStatus").getText();
	}
	
	public void selectRadio() {
		du.what("Radio").click();
	}
	

	
	public void doButton_Cancel() {
		du.what("Button_Cancel").click();
	}
	
	public void setMerchantName(String MerchantName) {
		du.what("Button_SearchMerchant").click();
		du.waitFor(500);
		du.what("MerchantName").sendKeys(MerchantName);
		du.what("Button_Search").click();
	}
	
	public boolean isSearchMerchantIndexDisplayed(String SearchMerchant_Index) {
		du.waitFor(1000);
		return du.what("Radio_SearchMerchant_Index",SearchMerchant_Index).isDisplayed();
	}
	
	public void doSearchMerchantSubmit(String SearchMerchant_Index) {
		du.what("Radio_SearchMerchant_Index",SearchMerchant_Index).click();
		du.waitFor(500);
		du.what("Button_SearchSubmit").click();
		du.waitFor(500);
	}
	
	public void doSearchMerchantClose() {
		du.what("Button_SearchMerchant_Close").click();
	}
	
	/*****************************Detail**********************/
	public void doDetail() {
		du.what("Button_SettlementInfoDetail").click();
		du.waitFor(1500);
	}
	

	/********************Alter**************************/
	public void doAlter() {
		du.what("Button_SettlementAlter").click();
	}
	
	public String getAccountType() {
		return du.what("AccountType").getAttribute("value");
	}
	
	public String getSettlementType() {
		return du.what("SettlementType").getAttribute("value");
	}
	
	public String getBankName() {
		return du.what("BankName").getAttribute("value");
	}
	
	public String getSubBankBelongProvice() {
		return du.what("SubBankBelongProvice").getAttribute("value");
	}
	
	public String getSubBankBelongCity() {
		return du.what("SubBankBelongCity").getAttribute("value");
	}
	
	public String getSubBankInfo() {
		return du.what("SubBankInfo").getAttribute("value");
	}
	
	public String getAccount() {
		return du.what("Account").getAttribute("value");
	}
	
	public String getAccountName() {
		return du.what("AccountName").getAttribute("value");
	}
	
	public String getSettlementCycle() {
		return du.what("SettlementCycle").getAttribute("value");
	}
	
	public String getSettlementDays() {
		return du.what("SettlementDays").getAttribute("value");
	}
	
	public String getNextSettlementDate() {
		return du.what("NextSettlementDate").getAttribute("value");
	}
	
	public String getSuspendIdentify() {
		return du.what("SuspendIdentify").getAttribute("value");
	}

	public String getSettlement_StartDate() {
		return du.what("Settlement_StartDate").getAttribute("value");
	}
	
	public String getSettlement_ExpireDate() {
		return du.what("Settlement_ExpireDate").getAttribute("value");
	}
	
	public String getStart_Amount() {
		return du.what("Start_Amount").getAttribute("value");
	}
	
	public String getMinimum_Amount() {
		return du.what("Minimum_Amount").getAttribute("value");
	}
	
	public String getMerchantSettlementType() {
		return du.what("MerchantSettlementType").getAttribute("value");
	}
	
	public String getSelf_Settlement() {
		return du.what("Self_Settlement").getAttribute("value");
	}
	
	public void selectAll(String locatorName) {
		du.what(locatorName).sendKeys(Keys.CONTROL + "a");
	}

	
	/********************Insert**************************/
	public void setMerchantNO(String MerchantNO) {
		du.what("MerchantNO").sendKeys(MerchantNO);
	}
	
	public void setMerchantNOByName(String MerchantName) {
		du.what("Button_SearchMerchant").click();
		du.what("MerchantName").sendKeys(MerchantName);
		du.what("Button_Search").click();
		if(!du.what("Merchant_Radio").isDisplayed()) {
			System.out.println("MerchantName is not Exist in POP database(GSDPAY.T_URM_MINF) !");
			Reporter.log("MerchantName is not Exist in POP database(GSDPAY.T_URM_MINF) !");
			assertTrue(false);
		}
		
		du.what("Merchant_Radio").click();
		du.what("Button_SearchSubmit").click();
	}
	
	public void doQuery() {
		du.what("Button_Query").click();
	}
	
	public void doReset() {
		du.what("Button_Reset").click();
	}
	
	public String getMerchantNO() {
		String merchantNO=du.what("Label_MerchantNO").getText();
		return merchantNO;
	}
	
	public boolean isSettlementInfoAddEnable() {
		if(du.what("Label_SettlementStatus").getText().equals("未配置")) {
			
			du.what("Radio").click();
			du.what("Button_SettlementInfoAdd").click();
			return true;
		}else {
			System.out.println("This Merchant needn't set SettlementInfo");
			Reporter.log("This Merchant needn't set SettlementInfo");
			return false;
		}
	}
	
/*	public boolean isSettlementInfoUpdate() {
		if(du.what("Label_SettlementStatus").getText().equals("已配置")) {
			du.what("Radio").click();
			du.what("Button_SettlementAlter").click();
			return true;
		}else {
			System.out.println("The SettlementStatus do not allow to Update");
			Reporter.log("The SettlementStatus do not allow to Update");
			return false;
		}
	}*/
/*	
	public boolean isSettlementInfoQuery() {
		if(du.what("Label_SettlementStatus").getText().equals("已配置")) {
			du.what("Radio").click();
			du.what("Button_SettlementInfoDetail").click();
			return true;
		}else {
			System.out.println("The SettlementStatus do not allow to Query");
			Reporter.log("The SettlementStatus do not allow to Query");
			return false;
		}
	}
	*/
	
	
	public void setAccountType(String AccountType) {
		du.whatSelect("AccountType").selectByValue(AccountType);
	}
	public void setSettlementType(String SettlementType) {
		du.whatSelect("SettlementType").selectByValue(SettlementType);
	}
	public void setSettlementOptions(String SettlementOptions) {
		du.whatSelect("SettlementOptions").selectByValue(SettlementOptions);
	}
	
	
	public void setBankName(String BankName) {
		du.whatSelect("BankName").selectByValue(BankName);
	}
	public void setSubBankBelongProvice(String SubBankBelongProvice) {
		du.whatSelect("SubBankBelongProvice").selectByValue(SubBankBelongProvice);
	}
	public void setSubBankBelongCity(String SubBankBelongCity) {
		du.whatSelect("SubBankBelongCity").selectByValue(SubBankBelongCity);
	}
	public void setSubBankInfo(String SubBankInfo) {
		du.whatSelect("SubBankInfo").selectByValue(SubBankInfo);
	}
	public void setAccount(String Account) {
		du.what("Account").clear();
		du.what("Account").sendKeys(Account);
	}
	public void setAccountName(String AccountName) {
		du.what("AccountName").clear();
		du.what("AccountName").sendKeys(AccountName);
	}
	
	
	public void setSettlementCycle(String SettlementCycle) {
		du.whatSelect("SettlementCycle").selectByValue(SettlementCycle);
	}
	public void setSettlementDays(String SettlementDays) {
		du.what("SettlementDays").clear();
		du.what("SettlementDays").sendKeys(SettlementDays);
	}
	public void setNextSettlementDate(String NextSettlementDate) {
		du.what("NextSettlementDate").clear();
		du.what("NextSettlementDate").sendKeys(NextSettlementDate);
	}
	public void setSuspendIdentify(String SuspendIdentify) {
		du.whatSelect("SuspendIdentify").selectByValue(SuspendIdentify);
	}
	
	
	public void setSettlement_StartDate(String Settlement_StartDate) {
		du.what("Settlement_StartDate").clear();
		du.what("Settlement_StartDate").sendKeys(Settlement_StartDate);
	}
	public void setSettlement_ExpireDate(String Settlement_ExpireDate) {
		du.what("Settlement_ExpireDate").clear();
		du.what("Settlement_ExpireDate").sendKeys(Settlement_ExpireDate);
	}
	public void doLoseFocus() {
		du.doLeftClickBy("Settlement_ExpireDate", 50, 0);
	}
	
	public void setStart_Amount(String Start_Amount) {
		du.what("Start_Amount").clear();
		du.what("Start_Amount").sendKeys(Start_Amount);
	}
	public void setMinimum_Amount(String Minimum_Amount) {
		du.what("Minimum_Amount").clear();
		du.what("Minimum_Amount").sendKeys(Minimum_Amount);
	}
	public void setMerchantSettlementType(String MerchantSettlementType) {
		du.whatSelect("MerchantSettlementType").selectByValue(MerchantSettlementType);
	}
	public void setSelf_Settlement(String Self_Settlement) {
		du.whatSelect("Self_Settlement").selectByValue(Self_Settlement);
	}
	
	
	public void doButton_Submit() {
		du.what("Button_Submit").click();
	}

	public String getNotice() {
		du.waitForElementPresent("Notice");
		return du.what("Notice").getAttribute("textContent");

	}

}
