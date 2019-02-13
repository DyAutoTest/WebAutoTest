package com.dy.AutoTest.AcquiringOperationPlatform.PageObject.MachineInfoManagement;

import org.openqa.selenium.WebDriver;

import com.dy.AutoTest.web.api.IQuery;
import com.dy.AutoTest.web.api.SuperPage;
import com.dy.AutoTest.web.actions.DoPlus;

public class TypeBrowsePage extends SuperPage implements IQuery{
	public TypeBrowsePage(WebDriver driver) {
		super(driver);
		du.loadLocator("AOP_Loc_MachineInfoManagement_TypeBrowse");
	}
	public void setWaitTime(long waitTime) {
		du=new DoPlus(driver);
		du.waitTime=waitTime;
		du.loadLocator("AOP_Loc_MachineInfoManagement_TypeBrowse");
	}

/***************************Manual Coding**********************************/


/****************************Auto Generate******************************/

	//厂商编号
	public void setManufactureNO(String value) {
		du.what("ManufactureNO").clear();
		du.what("ManufactureNO").sendKeys(value);
	}
	public String getManufactureNO() {
		return du.what("ManufactureNO").getAttribute("value");
	}
	//型号编号
	public void setTypeNO(String value) {
		du.what("TypeNO").clear();
		du.what("TypeNO").sendKeys(value);
	}
	public String getTypeNO() {
		return du.what("TypeNO").getAttribute("value");
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
	//查看
	public void clickCheck() {
		du.what("Check").click();
	}
	//删除
	public void clickDelete() {
		du.what("Delete").click();
	}
	//型号列表单选按钮
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
	//添加_厂商名称
	public void selectAdd_ManufactureName(String value) {
		du.whatSelect("Add_ManufactureName").selectByValue(value);
	}
	//添加_型号编号
	public void setAdd_TypeNO(String value) {
		du.what("Add_TypeNO").clear();
		du.what("Add_TypeNO").sendKeys(value);
	}
	public String getAdd_TypeNO() {
		return du.what("Add_TypeNO").getAttribute("value");
	}
	//添加_型号名称
	public void setAdd_TypeName(String value) {
		du.what("Add_TypeName").clear();
		du.what("Add_TypeName").sendKeys(value);
	}
	public String getAdd_TypeName() {
		return du.what("Add_TypeName").getAttribute("value");
	}
	//添加_终端类型
	public void selectAdd_TerminalType(String value) {
		du.whatSelect("Add_TerminalType").selectByValue(value);
	}
	//添加_处理器及主频
	public void setAdd_CPUandFrequency(String value) {
		du.what("Add_CPUandFrequency").clear();
		du.what("Add_CPUandFrequency").sendKeys(value);
	}
	public String getAdd_CPUandFrequency() {
		return du.what("Add_CPUandFrequency").getAttribute("value");
	}
	//添加_内存容量
	public void setAdd_RAMCapacity(String value) {
		du.what("Add_RAMCapacity").clear();
		du.what("Add_RAMCapacity").sendKeys(value);
	}
	public String getAdd_RAMCapacity() {
		return du.what("Add_RAMCapacity").getAttribute("value");
	}
	//添加_磁道加密标志
	public void selectAdd_MagneticTrackEncryptionSign(String value) {
		du.whatSelect("Add_MagneticTrackEncryptionSign").selectByValue(value);
	}
	//添加_分辨率
	public void setAdd_Resolution(String value) {
		du.what("Add_Resolution").clear();
		du.what("Add_Resolution").sendKeys(value);
	}
	public String getAdd_Resolution() {
		return du.what("Add_Resolution").getAttribute("value");
	}
	//添加_打印方式
	public void selectAdd_PrintWay(String value) {
		du.whatSelect("Add_PrintWay").selectByValue(value);
	}
	//添加_打印速度
	public void setAdd_PrintSpeed(String value) {
		du.what("Add_PrintSpeed").clear();
		du.what("Add_PrintSpeed").sendKeys(value);
	}
	public String getAdd_PrintSpeed() {
		return du.what("Add_PrintSpeed").getAttribute("value");
	}
	//添加_通信方式
	public void selectAdd_CommunicationWay(String value) {
		du.whatSelect("Add_CommunicationWay").selectByValue(value);
	}
	//添加_读卡器
	public void selectAdd_CardRead(String value) {
		du.whatSelect("Add_CardRead").selectByValue(value);
	}
	//添加_PSAM读卡器
	public void setAdd_PSAMCardRead(String value) {
		du.what("Add_PSAMCardRead").clear();
		du.what("Add_PSAMCardRead").sendKeys(value);
	}
	public String getAdd_PSAMCardRead() {
		return du.what("Add_PSAMCardRead").getAttribute("value");
	}
	//添加_通过认证
	public void setAdd_AuthenticationPass(String value) {
		du.what("Add_AuthenticationPass").clear();
		du.what("Add_AuthenticationPass").sendKeys(value);
	}
	public String getAdd_AuthenticationPass() {
		return du.what("Add_AuthenticationPass").getAttribute("value");
	}
	//添加_保修期
	public void setAdd_WarrantyPeriod(String value) {
		du.what("Add_WarrantyPeriod").clear();
		du.what("Add_WarrantyPeriod").sendKeys(value);
	}
	public String getAdd_WarrantyPeriod() {
		return du.what("Add_WarrantyPeriod").getAttribute("value");
	}
	//添加_开发平台
	public void selectAdd_DevelopmentPlateform(String value) {
		du.whatSelect("Add_DevelopmentPlateform").selectByValue(value);
	}
	//添加_电压类型
	public void selectAdd_VoltageType(String value) {
		du.whatSelect("Add_VoltageType").selectByValue(value);
	}
	//添加_设备体积
	public void setAdd_EquipmentVolume(String value) {
		du.what("Add_EquipmentVolume").clear();
		du.what("Add_EquipmentVolume").sendKeys(value);
	}
	public String getAdd_EquipmentVolume() {
		return du.what("Add_EquipmentVolume").getAttribute("value");
	}
	//添加_设备重量
	public void setAdd_EquipmentWeight(String value) {
		du.what("Add_EquipmentWeight").clear();
		du.what("Add_EquipmentWeight").sendKeys(value);
	}
	public String getAdd_EquipmentWeight() {
		return du.what("Add_EquipmentWeight").getAttribute("value");
	}
	//添加_工作温度
	public void setAdd_WorkingTemp(String value) {
		du.what("Add_WorkingTemp").clear();
		du.what("Add_WorkingTemp").sendKeys(value);
	}
	public String getAdd_WorkingTemp() {
		return du.what("Add_WorkingTemp").getAttribute("value");
	}
	//添加_工作湿度
	public void setAdd_WorkingHumidity(String value) {
		du.what("Add_WorkingHumidity").clear();
		du.what("Add_WorkingHumidity").sendKeys(value);
	}
	public String getAdd_WorkingHumidity() {
		return du.what("Add_WorkingHumidity").getAttribute("value");
	}
	//添加_指导价格
	public void setAdd_GuidingPrice(String value) {
		du.what("Add_GuidingPrice").clear();
		du.what("Add_GuidingPrice").sendKeys(value);
	}
	public String getAdd_GuidingPrice() {
		return du.what("Add_GuidingPrice").getAttribute("value");
	}
	//添加_密码键盘
	public void selectAdd_PasswordKeybroad(String value) {
		du.whatSelect("Add_PasswordKeybroad").selectByValue(value);
	}
	//添加_注释
	public void setAdd_Tips(String value) {
		du.what("Add_Tips").clear();
		du.what("Add_Tips").sendKeys(value);
	}
	public String getAdd_Tips() {
		return du.what("Add_Tips").getAttribute("value");
	}
	//添加_程序更新方式
	public void selectAdd_ProgramUpdateWay(String value) {
		du.whatSelect("Add_ProgramUpdateWay").selectByValue(value);
	}
	//添加_提交
	public void clickAdd_Submit() {
		du.what("Add_Submit").click();
	}
	//添加_关闭
	public void clickAdd_Close() {
		du.what("Add_Close").click();
	}
	//修改_型号名称
	public void setUpdate_TypeName(String value) {
		du.what("Update_TypeName").clear();
		du.what("Update_TypeName").sendKeys(value);
	}
	public String getUpdate_TypeName() {
		return du.what("Update_TypeName").getAttribute("value");
	}
	//修改_终端类型
	public void selectUpdate_TerminalType(String value) {
		du.whatSelect("Update_TerminalType").selectByValue(value);
	}
	//修改_处理器及主频
	public void setUpdate_CPUandFrequency(String value) {
		du.what("Update_CPUandFrequency").clear();
		du.what("Update_CPUandFrequency").sendKeys(value);
	}
	public String getUpdate_CPUandFrequency() {
		return du.what("Update_CPUandFrequency").getAttribute("value");
	}
	//修改_内存容量
	public void setUpdate_RAMCapacity(String value) {
		du.what("Update_RAMCapacity").clear();
		du.what("Update_RAMCapacity").sendKeys(value);
	}
	public String getUpdate_RAMCapacity() {
		return du.what("Update_RAMCapacity").getAttribute("value");
	}
	//修改_磁道加密
	public void selectUpdate_MagneticTrackEncryptionSign(String value) {
		du.whatSelect("Update_MagneticTrackEncryptionSign").selectByValue(value);
	}
	//修改_分辨率
	public void setUpdate_Resolution(String value) {
		du.what("Update_Resolution").clear();
		du.what("Update_Resolution").sendKeys(value);
	}
	public String getUpdate_Resolution() {
		return du.what("Update_Resolution").getAttribute("value");
	}
	//修改_打印方式
	public void selectUpdate_PrintWay(String value) {
		du.whatSelect("Update_PrintWay").selectByValue(value);
	}
	//修改_打印速度
	public void setUpdate_PrintSpeed(String value) {
		du.what("Update_PrintSpeed").clear();
		du.what("Update_PrintSpeed").sendKeys(value);
	}
	public String getUpdate_PrintSpeed() {
		return du.what("Update_PrintSpeed").getAttribute("value");
	}
	//修改_通信方式
	public void selectUpdate_CommunicationWay(String value) {
		du.whatSelect("Update_CommunicationWay").selectByValue(value);
	}
	//修改_读卡器
	public void selectUpdate_CardRead(String value) {
		du.whatSelect("Update_CardRead").selectByValue(value);
	}
	//修改_PSAM读卡器
	public void setUpdate_PSAMCardRead(String value) {
		du.what("Update_PSAMCardRead").clear();
		du.what("Update_PSAMCardRead").sendKeys(value);
	}
	public String getUpdate_PSAMCardRead() {
		return du.what("Update_PSAMCardRead").getAttribute("value");
	}
	//修改_通过认证
	public void setUpdate_AuthenticationPass(String value) {
		du.what("Update_AuthenticationPass").clear();
		du.what("Update_AuthenticationPass").sendKeys(value);
	}
	public String getUpdate_AuthenticationPass() {
		return du.what("Update_AuthenticationPass").getAttribute("value");
	}
	//修改_保修期
	public void setUpdate_WarrantyPeriod(String value) {
		du.what("Update_WarrantyPeriod").clear();
		du.what("Update_WarrantyPeriod").sendKeys(value);
	}
	public String getUpdate_WarrantyPeriod() {
		return du.what("Update_WarrantyPeriod").getAttribute("value");
	}
	//修改_开发平台
	public void selectUpdate_DevelopmentPlateform(String value) {
		du.whatSelect("Update_DevelopmentPlateform").selectByValue(value);
	}
	//修改_电压类型
	public void selectUpdate_VoltageType(String value) {
		du.whatSelect("Update_VoltageType").selectByValue(value);
	}
	//修改_设备体积
	public void setUpdate_EquipmentVolume(String value) {
		du.what("Update_EquipmentVolume").clear();
		du.what("Update_EquipmentVolume").sendKeys(value);
	}
	public String getUpdate_EquipmentVolume() {
		return du.what("Update_EquipmentVolume").getAttribute("value");
	}
	//修改_设备重量
	public void setUpdate_EquipmentWeight(String value) {
		du.what("Update_EquipmentWeight").clear();
		du.what("Update_EquipmentWeight").sendKeys(value);
	}
	public String getUpdate_EquipmentWeight() {
		return du.what("Update_EquipmentWeight").getAttribute("value");
	}
	//修改_工作温度
	public void setUpdate_WorkingTemp(String value) {
		du.what("Update_WorkingTemp").clear();
		du.what("Update_WorkingTemp").sendKeys(value);
	}
	public String getUpdate_WorkingTemp() {
		return du.what("Update_WorkingTemp").getAttribute("value");
	}
	//修改_工作湿度
	public void setUpdate_WorkingHumidity(String value) {
		du.what("Update_WorkingHumidity").clear();
		du.what("Update_WorkingHumidity").sendKeys(value);
	}
	public String getUpdate_WorkingHumidity() {
		return du.what("Update_WorkingHumidity").getAttribute("value");
	}
	//修改_指导价格
	public void setUpdate_GuidingPrice(String value) {
		du.what("Update_GuidingPrice").clear();
		du.what("Update_GuidingPrice").sendKeys(value);
	}
	public String getUpdate_GuidingPrice() {
		return du.what("Update_GuidingPrice").getAttribute("value");
	}
	//修改_密码键盘
	public void selectUpdate_PasswordKeybroad(String value) {
		du.whatSelect("Update_PasswordKeybroad").selectByValue(value);
	}
	//修改_注释
	public void setUpdate_Tips(String value) {
		du.what("Update_Tips").clear();
		du.what("Update_Tips").sendKeys(value);
	}
	public String getUpdate_Tips() {
		return du.what("Update_Tips").getAttribute("value");
	}
	//修改_程序更新方式
	public void selectUpdate_ProgramUpdateWay(String value) {
		du.whatSelect("Update_ProgramUpdateWay").selectByValue(value);
	}
	//修改_提交
	public void clickUpdate_Submit() {
		du.what("Update_Submit").click();
	}
	//修改_关闭
	public void clickUpdate_Close() {
		du.what("Update_Close").click();
	}
	//查看_关闭
	public void clickCheck_Close() {
		du.what("Check_Close").click();
	}
	//删除_确认
	public void clickDelete_Confirm() {
		du.what("Delete_Confirm").click();
	}
	//删除_关闭
	public void clickDelete_Close() {
		du.what("Delete_Close").click();
	}

}