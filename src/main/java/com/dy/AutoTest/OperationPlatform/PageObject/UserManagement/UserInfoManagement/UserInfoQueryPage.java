package com.dy.AutoTest.OperationPlatform.PageObject.UserManagement.UserInfoManagement;

import org.openqa.selenium.WebDriver;

import com.dy.AutoTest.OperationPlatform.PageObject.SuperPage;
import com.dy.AutoTest.web.actions.DoPlus;

/**
 * @author Jerry
 * 
 * 先做主流程
 * 再校验相关字段：手机号搜索结果校验、冻结、解冻的按钮切换可用
 * 
 *
 */
public class UserInfoQueryPage extends SuperPage{
	
	public UserInfoQueryPage(WebDriver driver) {
		super(driver);
		du.loadLocator("POP_Loc_UserInfoQuery");
	}
	public void setWaitTime(long waitTime) {
		du=new DoPlus(driver);
		du.waitTime=waitTime;
		du.loadLocator("POP_Loc_UserInfoQuery");
	}
	
	public void setMobileNO(String MobileNO) {
		du.what("MobileNO").sendKeys(MobileNO);
	}
	
	public void setInnerUserNO(String InnerUserNO) {
		du.what("InnerUserNO").sendKeys(InnerUserNO);
	}
	
	/**
	 * @param CredentialType
	 * 
	 * 00 : 身份证
	 * 
	 * 
	 */
	public void setCredentialType(String CredentialType) {
		du.whatSelect("CredentialType").selectByValue(CredentialType);
	}
	
	public void setCredentialNO(String CredentialNO) {
		du.what("CredentialNO").sendKeys(CredentialNO);
	}
	
	/**
	 * @param AccountGrade
	 * 
	 * 1
	 * 2
	 * 3
	 * 
	 */
	public void setAccountGrade(String AccountGrade) {
		du.whatSelect("AccountGrade").selectByValue(AccountGrade);
	}
	

	/**
	 * @param ResetPasswordFlag
	 * 
	 * 1 : 登录密码
	 * 2 : 支付密码
	 */
	public void setResetPasswordType(String ResetPasswordFlag) {
		if(ResetPasswordFlag.equals("1")) {
			du.waitFor(1000);
			du.what("Checkbox_ResetLoginPwd").click();
		}
		if(ResetPasswordFlag.equals("2")) {
			du.waitFor(1000);
			du.what("Checkbox_ResetPaymentPwd").click();
		}
	}
	
	public void doQuery() {
		du.what("Button_Query").click();
	}
	
	public void doReset() {
		du.what("Button_Reset").click();
	}
	
	public void doSelect() {
		du.what("Radio_Index").click();
	}
	
	public void doDetail() {
		du.what("Button_Detail").click();
	}
	
	public void doFrozen() {
		du.waitForElementPresent("Button_Frozen");
		du.what("Button_Frozen").click();
	}
	
	public void doUnfrozen() {
		du.waitForElementPresent("Button_Unfrozen");
		du.what("Button_Unfrozen").click();
	}
	
	public void doLoss() {
		du.waitForElementPresent("Button_Loss");
		du.what("Button_Loss").click();
	}
	
	public void doUnloss() {
		du.waitForElementPresent("Button_Unloss");
		du.what("Button_Unloss").click();
	}
	
	public void doResetPassword() {
		du.waitForElementPresent("Button_ResetPassword");
		du.what("Button_ResetPassword").click();
	}
	
	public void setFrozenReason(String FrozenReason) {
		du.what("FrozenReason").sendKeys(FrozenReason);
	}
	
	public void setUnFrozenReason(String UnFrozenReason) {
		du.what("UnFrozenReason").sendKeys(UnFrozenReason);
	}
	
	public void doFrozenAfirm() {
		du.what("Button_FrozenAfirm").click();
	}
	
	public void doUnFrozenReasonAfirm() {
		du.what("Button_UnFrozenReasonAfirm").click();
	}
	
	public void doLossAfirm() {
		du.what("Button_LossAfirm").click();
	}
	
	public void doUnlossAfirm() {
		du.what("Button_UnlossAfirm").click();
	}
	
	public void doResetPasswordAfirm() {
		du.what("Button_ResetPasswordAfirm").click();
	}
	
	
	
	
	
}
