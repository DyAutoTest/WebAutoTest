package com.dy.AutoTest.OnlineCashier.TestCases.accountmanage;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.dy.AutoTest.OnlineCashier.POJO.AccountManageItemManageBean;
import com.dy.AutoTest.OnlineCashier.PageObject.accountmanage.AccountManageItemManagePage;
import com.dy.AutoTest.web.api.SuperTest;
import com.dy.AutoTest.web.business.DataBusiness;

public class AccountManageItemManagePageTest extends SuperTest {
	
	private AccountManageItemManagePage accountManageItemManagePage;

	private String URL = "";

	@BeforeClass
	public void init() {
		accountManageItemManagePage = new AccountManageItemManagePage(driver);
		URL = host.toString() + DataBusiness.getData_URL("pop_AccountManageItemManage");
	}

	@DataProvider(name = "accountManageItemManage")
	protected static Object[][] parametersPool() {
		data.loadDataBeanList("POP_Data_AccountManageItemManage");
		return data.getDataBeanArray();
	}

	@Test(dataProvider = "accountManageItemManage", description = "运营平台-科目属性管理")
	public void testAccountManageItemManagePage(AccountManageItemManageBean accountManageItemManageBean) {

		accountManageItemManagePage.navigateTo(URL);
		
		accountManageItemManagePage.inputOnItemNO(accountManageItemManageBean.getItemNO());
		accountManageItemManagePage.inputOnItemLv(accountManageItemManageBean.getItemLv());
		accountManageItemManagePage.inputOnStatus(accountManageItemManageBean.getStatus());
		
		accountManageItemManagePage.clickQuery();
		
		wait.waitFor(1000);
		
		accountManageItemManagePage.clickItemRadio(0);
		
		String caseNo = accountManageItemManageBean.getCaseNo();

		switch (caseNo) {
		case "1":
			addCase(accountManageItemManageBean);
			break;
		case "2":
			updateCase(accountManageItemManageBean);
			break;
		case "3":
			displayCase(accountManageItemManageBean);
			break;
		default:
			break;
		}
	}

	private void addCase(AccountManageItemManageBean accountManageItemManageBean) {
		accountManageItemManagePage.clickAdd();
		
		accountManageItemManagePage.setFocusOnAdd_ItemNum();
		accountManageItemManagePage.inputOnAdd_ItemNum(accountManageItemManageBean.getItemNO());
		
		accountManageItemManagePage.setFocusOnAdd_ItemCnName();
		accountManageItemManagePage.inputOnAdd_ItemCnName(accountManageItemManageBean.getItemCnName());
		
		accountManageItemManagePage.setFocusOnAdd_ItemEnName();
		accountManageItemManagePage.inputOnAdd_ItemEnName(accountManageItemManageBean.getItemEnName());
		
		accountManageItemManagePage.setFocusOnAdd_ItemLv();
		accountManageItemManagePage.inputOnAdd_ItemLv(accountManageItemManageBean.getItemLv());
		
		accountManageItemManagePage.setFocusOnAdd_HigherItemNum();
		accountManageItemManagePage.inputOnAdd_HigherItemNum(accountManageItemManageBean.getHigherItemNum());
		
		accountManageItemManagePage.setFocusOnAdd_LowestItemSign();
		accountManageItemManagePage.inputOnAdd_LowestItemSign(accountManageItemManageBean.getLowestItemSign());
		
		accountManageItemManagePage.setFocusOnAdd_ItemType();
		accountManageItemManagePage.inputOnAdd_ItemType(accountManageItemManageBean.getItemType());
		
		accountManageItemManagePage.setFocusOnAdd_ItemClassify();
		accountManageItemManagePage.inputOnAdd_ItemClassify(accountManageItemManageBean.getItemClassify());
		
		accountManageItemManagePage.setFocusOnAdd_LossGainBroughtForwardSign();
		accountManageItemManagePage.inputOnAdd_LossGainBroughtForwardSign(accountManageItemManageBean.getLossGainBroughtForwardSign());
		
		accountManageItemManagePage.setFocusOnAdd_BalanceDirection();
		accountManageItemManagePage.inputOnAdd_BalanceDirection(accountManageItemManageBean.getBalanceDirection());
		
		accountManageItemManagePage.setFocusOnAdd_BalanceOverdraftSign();
		accountManageItemManagePage.inputOnAdd_BalanceOverdraftSign(accountManageItemManageBean.getBalanceOverdraftSign());
		
		accountManageItemManagePage.setFocusOnAdd_Status();
		accountManageItemManagePage.inputOnAdd_Status(accountManageItemManageBean.getStatus());
		
		accountManageItemManagePage.setFocusOnAdd_ItemBalanceZeroSign();
		accountManageItemManagePage.inputOnAdd_ItemBalanceZeroSign(accountManageItemManageBean.getItemBalanceZeroSign());
		
		accountManageItemManagePage.setFocusOnAdd_DateBegin();
		accountManageItemManagePage.inputOnAdd_DateBegin(accountManageItemManageBean.getDateBegin());
		
		accountManageItemManagePage.setFocusOnAdd_DateEnd();
		accountManageItemManagePage.inputOnAdd_DateEnd(accountManageItemManageBean.getDateEnd());
		
		accountManageItemManagePage.setFocusOnAdd_HigherItemNum();
		wait.waitFor(1000);
		accountManageItemManagePage.clickAdd_Close();
	}

	private void updateCase(AccountManageItemManageBean accountManageItemManageBean) {
		accountManageItemManagePage.clickUpdate();
		
		accountManageItemManagePage.setFocusOnUpdate_ItemCnName();
		accountManageItemManagePage.inputOnUpdate_ItemCnName(accountManageItemManageBean.getItemCnName());
		
		accountManageItemManagePage.setFocusOnUpdate_ItemEnName();
		accountManageItemManagePage.inputOnUpdate_ItemEnName(accountManageItemManageBean.getItemEnName());
		
		accountManageItemManagePage.setFocusOnUpdate_ItemLv();
		accountManageItemManagePage.inputOnUpdate_ItemLv(accountManageItemManageBean.getItemLv());
		
		accountManageItemManagePage.setFocusOnUpdate_HigherItemNum();
		accountManageItemManagePage.inputOnUpdate_HigherItemNum(accountManageItemManageBean.getHigherItemNum());
		
		accountManageItemManagePage.setFocusOnUpdate_LowestItemSign();
		accountManageItemManagePage.inputOnUpdate_LowestItemSign(accountManageItemManageBean.getLowestItemSign());
		
		accountManageItemManagePage.setFocusOnUpdate_ItemType();
		accountManageItemManagePage.inputOnUpdate_ItemType(accountManageItemManageBean.getItemType());
		
		accountManageItemManagePage.setFocusOnUpdate_ItemClassify();
		accountManageItemManagePage.inputOnUpdate_ItemClassify(accountManageItemManageBean.getItemClassify());
		
		accountManageItemManagePage.setFocusOnUpdate_LossGainBroughtForwardSign();
		accountManageItemManagePage.inputOnUpdate_LossGainBroughtForwardSign(accountManageItemManageBean.getLossGainBroughtForwardSign());
		
		accountManageItemManagePage.setFocusOnUpdate_BalanceDirection();
		accountManageItemManagePage.inputOnUpdate_BalanceDirection(accountManageItemManageBean.getBalanceDirection());
		
		accountManageItemManagePage.setFocusOnUpdate_BalanceOverdraftSign();
		accountManageItemManagePage.inputOnUpdate_BalanceOverdraftSign(accountManageItemManageBean.getBalanceOverdraftSign());
		
		accountManageItemManagePage.setFocusOnUpdate_Status();
		accountManageItemManagePage.inputOnUpdate_Status(accountManageItemManageBean.getStatus());
		
		accountManageItemManagePage.setFocusOnUpdate_ItemBalanceZeroSign();
		accountManageItemManagePage.inputOnUpdate_ItemBalanceZeroSign(accountManageItemManageBean.getItemBalanceZeroSign());
		
		accountManageItemManagePage.setFocusOnUpdate_DateBegin();
		accountManageItemManagePage.inputOnUpdate_DateBegin(accountManageItemManageBean.getDateBegin());
		
		accountManageItemManagePage.setFocusOnUpdate_DateEnd();
		accountManageItemManagePage.inputOnUpdate_DateEnd(accountManageItemManageBean.getDateEnd());
		
		accountManageItemManagePage.setFocusOnUpdate_HigherItemNum();
		wait.waitFor(1000);
		accountManageItemManagePage.clickUpdate_Close();
	}

	private void displayCase(AccountManageItemManageBean accountManageItemManageBean) {
		accountManageItemManagePage.clickCheck();
		wait.waitFor(1000);
		accountManageItemManagePage.clickCheck_Close();
	}
	
}
