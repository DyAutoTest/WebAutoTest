package com.dy.AutoTest.OperationPlatform.PageObject.MerchantManagementOnLine.OnLineMerchantInfo;

import org.openqa.selenium.WebDriver;

import com.dy.AutoTest.OperationPlatform.PageObject.SuperPage;
import com.dy.AutoTest.web.actions.DoPlus;

public class MerchantBalanceQuery extends SuperPage{
	public MerchantBalanceQuery(WebDriver driver) {
		super(driver);
		du.loadLocator("POP_Loc_MerchantBalanceQuery");
	}
	public void setWaitTime(long waitTime) {
		du=new DoPlus(driver);
		du.waitTime=waitTime;
		du.loadLocator("POP_Loc_MerchantBalanceQuery");
	}

	//商户号
	public void setMerchantNO(String value) {
		du.what("MerchantNO").clear();
		du.what("MerchantNO").sendKeys(value);
	}
	public String getMerchantNO() {
		return du.what("MerchantNO").getAttribute("value");
	}
	//按钮_搜商户
	public void clickSearchMerchant() {
		du.what("SearchMerchant").click();
	}
	//按钮_查询
	public void clickQuery() {
		du.what("Query").click();
	}
	//搜商户_商户号
	public void setSearchMer_MerNum(String value) {
		du.what("SearchMer_MerNum").clear();
		du.what("SearchMer_MerNum").sendKeys(value);
	}
	public String getSearchMer_MerNum() {
		return du.what("SearchMer_MerNum").getAttribute("value");
	}
	//搜商户_商户名
	public void setSearchMer_MerName(String value) {
		du.what("SearchMer_MerName").clear();
		du.what("SearchMer_MerName").sendKeys(value);
	}
	public String getSearchMer_MerName() {
		return du.what("SearchMer_MerName").getAttribute("value");
	}
	//搜商户_搜索
	public void clickSearchMer_Search() {
		du.what("SearchMer_Search").click();
	}
	//搜商户_商户索引
	public void clickSearchMer_Index(String index) {
		du.what("SearchMer_Index",index).click();
	}
	//搜商户_提交
	public void clickSearchMer_Submit() {
		du.what("SearchMer_Submit").click();
	}
	//搜商户_关闭
	public void clickSearchMer_Close() {
		du.what("SearchMer_Close").click();
	}

}