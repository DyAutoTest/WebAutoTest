package com.dy.AutoTest.OperationPlatform.PageObject.OnlineRiskControl.RiskControlRuleManagement;

import org.openqa.selenium.WebDriver;

import com.dy.AutoTest.web.api.IQuery;
import com.dy.AutoTest.web.api.SuperPage;
import com.dy.AutoTest.web.actions.DoPlus;

public class RiskControlTypeManagementPage extends SuperPage implements IQuery{
	public RiskControlTypeManagementPage(WebDriver driver) {
		super(driver);
		du.loadLocator("POP_Loc_RiskControlRuleManagement_RiskControlTypeManagement");
	}
	public void setWaitTime(long waitTime) {
		du=new DoPlus(driver);
		du.waitTime=waitTime;
		du.loadLocator("POP_Loc_RiskControlRuleManagement_RiskControlTypeManagement");
	}

/***************************Manual Coding**********************************/


/****************************Auto Generate******************************/

	//风控类型
	/**
	 * @param value
	 * 
		value="CAP01" : CAP01-代收自银行卡
		value="PWM01" : PWM01-标准主账户充值限额检查
		value="PWM50" : PWM50-提现限额检查（通过身份证控制）
		value="RPM01" : RPM01-限额检查
		value="RPM02" : RPM02-收款方单笔限额控制
		value="RPM03" : RPM03-远程消费支付检查
		value="RPM04" : RPM04-商户退款日累计限额风险控制
		value="RPM10" : RPM10-限额检查
		value="RPM16" : RPM16-批量付款限额
		value="RPM98" : RPM98-UATTEST98
		value="RRC01" : RRC01-合规客户付款限额
		value="TAM01" : TAM01-付款方限额检查
		value="TAM02" : TAM02-收款方限额频次检查
		value="TAM03" : TAM03-收款方限额频次检查
		value="TAM10" : TAM10-商户代收限额检查
		value="TAM11" : TAM11-商户代付限额检查
	 * 
	 */
	public void selectRiskType(String value) {
		du.whatSelect("RiskType").selectByValue(value);
	}
	//模块名
	/**
	 * @param value
	 * 
	 * 	value='CGW' : CGW-网关模块
		value='PWM' : PWM-充提模块
		value='RPM' : RPM-远程
		value='CAP' : CAP-代收付
		value='TAM' : TAM-收付款
	 * 
	 * 
	 */
	public void selectModuleName(String value) {
		du.whatSelect("ModuleName").selectByValue(value);
	}
	//查询
	public void clickQuery() {
		du.what("Query").click();
	}
	//重置
	public void clickReset() {
		du.what("Reset").click();
	}
	//添加
	public void clickAdd() {
		du.what("Add").click();
	}
	//修改
	public void clickUpdate() {
		du.what("Update").click();
	}
	//删除
	public void clickDelete() {
		du.what("Delete").click();
	}
	//类型列表单选按钮
	public void clickRadio(String radio) {
		du.what("Radio",radio).click();
	}
	public boolean isRadioExist(String radio) {
		du.waitFor(500);
		return du.isElementExist("Radio",radio);
	}
	public boolean isRadioDisplayed(String radio) {
		du.waitFor(500);
		return du.what("Radio",radio).isDisplayed();
	}
	//添加_风险类型
	public void setAdd_RiskType(String value) {
		du.what("Add_RiskType").clear();
		du.what("Add_RiskType").sendKeys(value);
	}
	public String getAdd_RiskType() {
		return du.what("Add_RiskType").getAttribute("value");
	}
	//添加_所属模块
	public void selectAdd_Module(String value) {
		du.whatSelect("Add_Module").selectByValue(value);
	}
	//添加_风控类型描述
	public void setAdd_RiskControlTypeDescribe(String value) {
		du.what("Add_RiskControlTypeDescribe").clear();
		du.what("Add_RiskControlTypeDescribe").sendKeys(value);
	}
	public String getAdd_RiskControlTypeDescribe() {
		return du.what("Add_RiskControlTypeDescribe").getAttribute("value");
	}
	//添加_提交
	public void clickAdd_Submit() {
		du.what("Add_Submit").click();
	}
	//添加_关闭
	public void clickAdd_Close() {
		du.what("Add_Close").click();
	}
	//修改_所属模块
	public void selectUpdate_Module(String value) {
		du.whatSelect("Update_Module").selectByValue(value);
	}
	//修改_风控类型描述
	public void setUpdate_RiskControlTypeDescribe(String value) {
		du.what("Update_RiskControlTypeDescribe").clear();
		du.what("Update_RiskControlTypeDescribe").sendKeys(value);
	}
	public String getUpdate_RiskControlTypeDescribe() {
		return du.what("Update_RiskControlTypeDescribe").getAttribute("value");
	}
	//修改_提交
	public void clickUpdate_Submit() {
		du.what("Update_Submit").click();
	}
	//修改_关闭
	public void clickUpdate_Close() {
		du.what("Update_Close").click();
	}
	//删除_提交
	public void clickDelete_Submit() {
		du.what("Delete_Submit").click();
	}
	//删除_关闭
	public void clickDelete_Close() {
		du.what("Delete_Close").click();
	}

}