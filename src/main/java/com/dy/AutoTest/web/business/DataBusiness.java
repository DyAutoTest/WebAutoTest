package com.dy.AutoTest.web.business;

import static org.testng.Assert.assertTrue;

import java.util.List;
import java.util.Map;


import com.dy.AutoTest.OperationPlatform.POJO.UserIncomeExpenditureDetailBean;
import com.dy.AutoTest.OperationPlatform.POJO.UserInfoQueryBean;
import com.dy.AutoTest.OnlineCashier.POJO.OnlineCashierB2BBean;
import com.dy.AutoTest.OnlineCashier.POJO.OnlineCashierB2CBean;
import com.dy.AutoTest.AcquiringOperationPlatform.POJO.LoginBean;
import com.dy.AutoTest.MerchantPortal.POJO.PmOperBean;
import com.dy.AutoTest.OnlineCashier.POJO.AccountManageAccountOrgnizationManageBean;
import com.dy.AutoTest.OnlineCashier.POJO.AccountManageAccountingEntryCheckBean;
import com.dy.AutoTest.OnlineCashier.POJO.AccountManageAccountingEntryMaintainBean;
import com.dy.AutoTest.OnlineCashier.POJO.AccountManageBookingKeppFlowBean;
import com.dy.AutoTest.OnlineCashier.POJO.AccountManageExternalBalanceDetailQueryBean;
import com.dy.AutoTest.OnlineCashier.POJO.AccountManageFrozenDetailQueryBean;
import com.dy.AutoTest.OnlineCashier.POJO.AccountManageInformDetailQueryBean;
import com.dy.AutoTest.OnlineCashier.POJO.AccountManageInnerAccountBalanceQueryBean;
import com.dy.AutoTest.OnlineCashier.POJO.AccountManageInternalAccountHistoryBalanceBean;
import com.dy.AutoTest.OnlineCashier.POJO.AccountManageInternalAccountManageBean;
import com.dy.AutoTest.OnlineCashier.POJO.AccountManageItemManageBean;
import com.dy.AutoTest.OnlineCashier.POJO.AccountManageItemRelationBean;
import com.dy.AutoTest.OnlineCashier.POJO.AccountManageManualAccountCheckBean;
import com.dy.AutoTest.OnlineCashier.POJO.AccountManageManualSingleAccountBean;
import com.dy.AutoTest.OnlineCashier.POJO.AccountManageOfflineFreezeManageBean;
import com.dy.AutoTest.OnlineCashier.POJO.AccountManageOfflineInternalAccountPaymentQueryBean;
import com.dy.AutoTest.OnlineCashier.POJO.AccountManageOfflineReleaseManageBean;
import com.dy.AutoTest.OnlineCashier.POJO.AccountManageOnlineInternalAccountPaymentQueryBean;
import com.dy.AutoTest.OnlineCashier.POJO.AccountManageSceneComprehensiveBean;
import com.dy.AutoTest.OnlineCashier.POJO.AccountManageSummonsQueryBean;
import com.dy.AutoTest.OnlineCashier.POJO.AccountManageWholeHistoryQueryBean;
import com.dy.AutoTest.OnlineCashier.POJO.AccountManageYesterdayWholeQueryBean;
import com.dy.AutoTest.OnlineCashier.POJO.CooperatingAgentInfoBean;
import com.dy.AutoTest.OnlineCashier.POJO.CooperatingPaymentChannelBean;
import com.dy.AutoTest.OnlineCashier.POJO.CooperatingRouteInfoBean;
import com.dy.AutoTest.OnlineCashier.POJO.CooperatingServiceChannelBean;
import com.dy.AutoTest.OnlineCashier.POJO.FinanceChannelBalanceAccountBatchNumQueryBean;
import com.dy.AutoTest.OnlineCashier.POJO.FinanceChannelBalanceAccountErrorManageBean;
import com.dy.AutoTest.OnlineCashier.POJO.FinanceChannelBalanceAccountParameterBean;
import com.dy.AutoTest.OnlineCashier.POJO.FinanceChannelManageFlowQueryBean;
import com.dy.AutoTest.OnlineCashier.POJO.FinanceChannelManageInfoBean;
import com.dy.AutoTest.OnlineCashier.POJO.FinanceChannelManageRateCodeBean;
import com.dy.AutoTest.OnlineCashier.POJO.FinanceChannelManageRateMaintainBean;
import com.dy.AutoTest.OnlineCashier.POJO.FinanceChannelManageReturnCodeBean;
import com.dy.AutoTest.OnlineCashier.POJO.FinanceChannelManageSignManageBean;
import com.dy.AutoTest.OnlineCashier.POJO.IdCardPhotoVerificationBean;
import com.dy.AutoTest.OnlineCashier.POJO.IdCardValidDateVerificationBean;
import com.dy.AutoTest.OnlineCashier.POJO.IdentityAuthenticationChannelBean;
import com.dy.AutoTest.OnlineCashier.POJO.IdentityAuthenticationDetailsBean;
import com.dy.AutoTest.OnlineCashier.POJO.IdentityAuthenticationQueryBean;
import com.dy.AutoTest.OnlineCashier.POJO.IdentityAuthenticationRouteBean;
import com.dy.AutoTest.OperationPlatform.POJO.BlackWhiteListManagement_BlackListMaintainBean;
import com.dy.AutoTest.OperationPlatform.POJO.BlackWhiteListManagement_WhiteListMaintainBean;
import com.dy.AutoTest.OperationPlatform.POJO.ComplianceMaintain_ComplianceLimitMaintainBean;
import com.dy.AutoTest.OperationPlatform.POJO.ComplianceMaintain_ComplianceRiskControlQuantityBean;
import com.dy.AutoTest.OperationPlatform.POJO.ComplianceMaintain_CustomerPaymentLimitBean;
import com.dy.AutoTest.OperationPlatform.POJO.ComplianceMaintain_TradeVerificationWaySetBean;
import com.dy.AutoTest.OperationPlatform.POJO.ComplianceMaintain_WeightMaintainBean;
import com.dy.AutoTest.OperationPlatform.POJO.MainChildMerRelationshipBean;
import com.dy.AutoTest.OperationPlatform.POJO.MerchantAccountManagementBean;
import com.dy.AutoTest.OperationPlatform.POJO.MerchantAuditBean;
import com.dy.AutoTest.OperationPlatform.POJO.MerchantBalanceQueryBean;
import com.dy.AutoTest.OperationPlatform.POJO.MerchantFeeRateBean;
import com.dy.AutoTest.OperationPlatform.POJO.MerchantIncomeExpenditureDetailBean;
import com.dy.AutoTest.OperationPlatform.POJO.MerchantInfoBean;
import com.dy.AutoTest.OperationPlatform.POJO.MerchantInfoSearchBean;
import com.dy.AutoTest.OperationPlatform.POJO.MerchantSettlementAlterBean;
import com.dy.AutoTest.OperationPlatform.POJO.MerchantSettlementBean;
import com.dy.AutoTest.OperationPlatform.POJO.MonitorRulesManagement_MonitorOperationMaintainBean;
import com.dy.AutoTest.OperationPlatform.POJO.MonitorRulesManagement_MonitorParameterMaintainBean;
import com.dy.AutoTest.OperationPlatform.POJO.MonitorRulesManagement_MonitorRulesMaintainBean;
import com.dy.AutoTest.OperationPlatform.POJO.OnlineDepositOrderQueryBean;
import com.dy.AutoTest.OperationPlatform.POJO.OnlineDepositRefundQueryBean;
import com.dy.AutoTest.OperationPlatform.POJO.OnlinePurchaseOrderQueryBean;
import com.dy.AutoTest.OperationPlatform.POJO.OnlineRefundOrderQueryBean;
import com.dy.AutoTest.OperationPlatform.POJO.OnlineTransferInOrderQueryBean;
import com.dy.AutoTest.OperationPlatform.POJO.OnlineTransferOutOrderQueryBean;
import com.dy.AutoTest.OperationPlatform.POJO.OnlineWithdrawOrderQueryBean;
import com.dy.AutoTest.OperationPlatform.POJO.OperBean;
import com.dy.AutoTest.OperationPlatform.POJO.OverdueMerInfoQueryBean;
import com.dy.AutoTest.OperationPlatform.POJO.RefusedTradeQuery_BeforehandBlackListRefusedQueryBean;
import com.dy.AutoTest.OperationPlatform.POJO.RefusedTradeQuery_RefusedOrderQueryBean;
import com.dy.AutoTest.OperationPlatform.POJO.RefusedTradeQuery_WarningOrderQueryBean;
import com.dy.AutoTest.OperationPlatform.POJO.RiskControlLvMaintain_RiskCustomerMaintainBean;
import com.dy.AutoTest.OperationPlatform.POJO.RiskControlLvMaintain_RiskLvMaintainBean;
import com.dy.AutoTest.OperationPlatform.POJO.RiskControlLvMaintain_RiskMonitorRuleMaintainBean;
import com.dy.AutoTest.OperationPlatform.POJO.RiskControlLvMaintain_RiskOperationMaintainBean;
import com.dy.AutoTest.OperationPlatform.POJO.RiskControlParamManagement_AccountApproveParamMaintainBean;
import com.dy.AutoTest.OperationPlatform.POJO.RiskControlParamManagement_AccountBalanceParamMaintainBean;
import com.dy.AutoTest.OperationPlatform.POJO.RiskControlParamManagement_AccountTradeParamMaintainBean;
import com.dy.AutoTest.OperationPlatform.POJO.RiskControlRuleManagement_RiskControlRuleManagementBean;
import com.dy.AutoTest.OperationPlatform.POJO.RiskControlRuleManagement_RiskControlTypeCorrespondingRulesManagementBean;
import com.dy.AutoTest.OperationPlatform.POJO.RiskControlRuleManagement_RiskControlTypeManagementBean;
import com.dy.AutoTest.OperationPlatform.POJO.RiskControlRuleManagement_RiskTypeAndTradeCodeManagementBean;
import com.dy.AutoTest.OperationPlatform.POJO.RiskControlTotalQueryBean;
import com.dy.AutoTest.OperationPlatform.POJO.RiskControlWarning_EmailWarningBean;
import com.dy.AutoTest.OperationPlatform.POJO.RiskControlWarning_LimitWarningBean;
import com.dy.AutoTest.OperationPlatform.POJO.RiskControlWarning_TimesWarningBean;
import com.dy.AutoTest.OperationPlatform.POJO.RiskControlWarning_WarningRuleManagementBean;
import com.dy.AutoTest.OperationPlatform.POJO.SettlementManagement_PaymentApprovalBean;
import com.dy.AutoTest.OperationPlatform.POJO.SettlementManagement_PaymentApprovalStatusQueryBean;
import com.dy.AutoTest.OperationPlatform.POJO.SettlementManagement_PaymentOperationBean;
import com.dy.AutoTest.OperationPlatform.POJO.SettlementManagement_PaymentWorkFlowQueryBean;
import com.dy.AutoTest.OperationPlatform.POJO.SettlementManagement_RiskApprovalBean;
import com.dy.AutoTest.OperationPlatform.POJO.SettlementManagement_SettlementBillQueryBean;
import com.dy.AutoTest.OperationPlatform.POJO.SettlementManagement_TradeClearingManagementOrderQueryBean;
import com.dy.AutoTest.OperationPlatform.POJO.SettlementManagement_TradeClearingManagementQueryBean;
import com.dy.AutoTest.OperationPlatform.POJO.SuspiciousTradeManagement_BeingProcessedSuspiciousTradeMaintainBean;
import com.dy.AutoTest.OperationPlatform.POJO.SuspiciousTradeManagement_ProcessedSuspiciousTradeQueryBean;
import com.dy.AutoTest.OperationPlatform.POJO.SuspiciousTradeManagement_SuspiciousTradeAnalyzeBean;
import com.dy.AutoTest.OperationPlatform.POJO.UserAccountModifySearchBean;
import com.dy.AutoTest.OperationPlatform.POJO.UserActionBean;
import com.dy.AutoTest.web.beans.Data_URLBean;
import com.dy.AutoTest.web.dao.TestingDao;
import com.dy.AutoTest.web.dao.impl.TestingDaoImpl;
import com.dy.AutoTest.web.util.BaseUtil;

/**
 * @author Jerry
 * dto组装与赋值
 */
public class DataBusiness {
	private static TestingDao  testingDao=new TestingDaoImpl();
//	private static TestingDao  testingDao=new TestingDao(true);
	private Map<String , Object> map=null;
	private static List<Map<String, Object>> Data_URL_list=testingDao.getLocator("Data_URL");
	private Data_URLBean data_URLBean;
	private OperBean operBean;
	private MerchantInfoBean MerchantInfoBean;
	private MerchantAuditBean MerchantAuditBean;
	private MerchantSettlementBean MerchantSettlementBean;
	private MerchantFeeRateBean MerchantFeeRateBean;
	private OnlineCashierB2CBean OnlineCashierB2CBean;
	private OnlineCashierB2BBean OnlineCashierB2BBean;
	private UserInfoQueryBean UserInfoQueryBean;
	private UserAccountModifySearchBean UserAccountModifySearchBean;
	private UserIncomeExpenditureDetailBean UserIncomeExpenditureDetailBean;
	private UserActionBean UserActionBean;
	private MerchantInfoSearchBean MerchantInfoSearchBean;
	private MerchantSettlementAlterBean MerchantSettlementAlterBean;
	private MerchantBalanceQueryBean MerchantBalanceQueryBean;
	private MerchantIncomeExpenditureDetailBean MerchantIncomeExpenditureDetailBean;
	private MerchantAccountManagementBean MerchantAccountManagementBean;
	private OverdueMerInfoQueryBean OverdueMerInfoQueryBean;
	private MainChildMerRelationshipBean MainChildMerRelationshipBean;
	private OnlinePurchaseOrderQueryBean OnlinePurchaseOrderQueryBean;
	private OnlineRefundOrderQueryBean OnlineRefundOrderQueryBean;
	private OnlineDepositOrderQueryBean OnlineDepositOrderQueryBean;
	private OnlineDepositRefundQueryBean OnlineDepositRefundQueryBean;
	private OnlineTransferInOrderQueryBean OnlineTransferInOrderQueryBean;
	private OnlineTransferOutOrderQueryBean OnlineTransferOutOrderQueryBean;
	private OnlineWithdrawOrderQueryBean OnlineWithdrawOrderQueryBean;
	private SettlementManagement_RiskApprovalBean SettlementManagement_RiskApprovalBean;
	private SettlementManagement_PaymentApprovalBean SettlementManagement_PaymentApprovalBean ;
	private SettlementManagement_PaymentApprovalStatusQueryBean SettlementManagement_PaymentApprovalStatusQueryBean;
	private SettlementManagement_PaymentOperationBean SettlementManagement_PaymentOperationBean;
	private SettlementManagement_PaymentWorkFlowQueryBean SettlementManagement_PaymentWorkFlowQueryBean;
	private SettlementManagement_SettlementBillQueryBean SettlementManagement_SettlementBillQueryBean;
	private SettlementManagement_TradeClearingManagementOrderQueryBean SettlementManagement_TradeClearingManagementOrderQueryBean ;
	private SettlementManagement_TradeClearingManagementQueryBean SettlementManagement_TradeClearingManagementQueryBean;
	private RiskControlRuleManagement_RiskControlRuleManagementBean RiskControlRuleManagement_RiskControlRuleManagementBean;
	private RiskControlRuleManagement_RiskControlTypeCorrespondingRulesManagementBean RiskControlRuleManagement_RiskControlTypeCorrespondingRulesManagementBean;
	private RiskControlRuleManagement_RiskControlTypeManagementBean RiskControlRuleManagement_RiskControlTypeManagementBean;
	private RiskControlRuleManagement_RiskTypeAndTradeCodeManagementBean RiskControlRuleManagement_RiskTypeAndTradeCodeManagementBean ;
	private RiskControlParamManagement_AccountTradeParamMaintainBean RiskControlParamManagement_AccountTradeParamMaintainBean;
	private RiskControlParamManagement_AccountBalanceParamMaintainBean RiskControlParamManagement_AccountBalanceParamMaintainBean;
	private RiskControlParamManagement_AccountApproveParamMaintainBean RiskControlParamManagement_AccountApproveParamMaintainBean;
	private BlackWhiteListManagement_BlackListMaintainBean BlackWhiteListManagement_BlackListMaintainBean;
	private BlackWhiteListManagement_WhiteListMaintainBean BlackWhiteListManagement_WhiteListMaintainBean;
	private RiskControlWarning_WarningRuleManagementBean RiskControlWarning_WarningRuleManagementBean;
	private RiskControlWarning_TimesWarningBean RiskControlWarning_TimesWarningBean;
	private RiskControlWarning_LimitWarningBean RiskControlWarning_LimitWarningBean;
	private RiskControlWarning_EmailWarningBean RiskControlWarning_EmailWarningBean;
	private RefusedTradeQuery_BeforehandBlackListRefusedQueryBean RefusedTradeQuery_BeforehandBlackListRefusedQueryBean;
	private RefusedTradeQuery_RefusedOrderQueryBean RefusedTradeQuery_RefusedOrderQueryBean;
	private RefusedTradeQuery_WarningOrderQueryBean RefusedTradeQuery_WarningOrderQueryBean;
	private RiskControlLvMaintain_RiskCustomerMaintainBean RiskControlLvMaintain_RiskCustomerMaintainBean;
	private RiskControlLvMaintain_RiskMonitorRuleMaintainBean RiskControlLvMaintain_RiskMonitorRuleMaintainBean;
	private RiskControlLvMaintain_RiskOperationMaintainBean RiskControlLvMaintain_RiskOperationMaintainBean;
	private RiskControlTotalQueryBean RiskControlTotalQueryBean;
	private ComplianceMaintain_ComplianceLimitMaintainBean ComplianceMaintain_ComplianceLimitMaintainBean;
	private ComplianceMaintain_ComplianceRiskControlQuantityBean ComplianceMaintain_ComplianceRiskControlQuantityBean ;
	private ComplianceMaintain_TradeVerificationWaySetBean ComplianceMaintain_TradeVerificationWaySetBean;
	private ComplianceMaintain_WeightMaintainBean ComplianceMaintain_WeightMaintainBean;
	private ComplianceMaintain_CustomerPaymentLimitBean ComplianceMaintain_CustomerPaymentLimitBean;
	private MonitorRulesManagement_MonitorParameterMaintainBean MonitorRulesManagement_MonitorParameterMaintainBean;
	private MonitorRulesManagement_MonitorRulesMaintainBean MonitorRulesManagement_MonitorRulesMaintainBean;
	private MonitorRulesManagement_MonitorOperationMaintainBean MonitorRulesManagement_MonitorOperationMaintainBean;
	private SuspiciousTradeManagement_SuspiciousTradeAnalyzeBean SuspiciousTradeManagement_SuspiciousTradeAnalyzeBean;
	private SuspiciousTradeManagement_BeingProcessedSuspiciousTradeMaintainBean SuspiciousTradeManagement_BeingProcessedSuspiciousTradeMaintainBean;
	private SuspiciousTradeManagement_ProcessedSuspiciousTradeQueryBean SuspiciousTradeManagement_ProcessedSuspiciousTradeQueryBean;
	private RiskControlLvMaintain_RiskLvMaintainBean RiskControlLvMaintain_RiskLvMaintainBean;
	private LoginBean LoginBean;


	
	private List<Object> list;
	
	
	
	
	/**
	 * 为了测试时候使用，放开该空构造器，使用是需要配合loadData方法一起用
	 */
	public DataBusiness() { 
	}
	
	public DataBusiness(String tableName,String ID) {
		loadData(tableName, ID);
	}
	
	public static String getData_URL(String ID) {
//		loadData_URL();
		String url=BaseUtil.getMapTargetValue(Data_URL_list, "ID", ID, "URL");
		return url;
	}
	

	
	public void loadData(String tableName,String ID) {
		map=testingDao.getData(tableName,ID);
		switch (tableName) {
			case "POP_Data_MerchantAudit":
				MerchantAuditBean=new MerchantAuditBean();
				break;
			case "POP_Data_MerchantInfo":
				MerchantInfoBean=new MerchantInfoBean();
				break;
			case "POP_Data_MerchantSettlement":
				MerchantSettlementBean=new MerchantSettlementBean();
			case "POP_Data_MerchantFeeRate":
				MerchantFeeRateBean=new MerchantFeeRateBean();
				break;
			case "POP_Data_MerchantOper":
				
				break;
				
			case "POP_Data_UserInfoQuery":
				UserInfoQueryBean=new UserInfoQueryBean();
				break;
				
			case "POP_Data_Oper":
				operBean=new OperBean();
				break;
			case "Data_URL":
				data_URLBean=new Data_URLBean();
				break;
				
			default:
				System.out.println("table is not exist! Please check!");
				break;
		}
	}

	@SuppressWarnings("unchecked")
	public <T> T getDataBean(String tableName,String ID) {
		
		T pojo=null;
		switch (tableName) {
			case "POP_Data_MerchantAudit":
				pojo=(T)testingDao.getData(tableName,ID,MerchantAuditBean.class);
				return pojo;
			case "POP_Data_MerchantInfo":
				pojo=(T)testingDao.getData(tableName,ID,MerchantInfoBean.class);
				return pojo;
			case "POP_Data_MerchantSettlement":
				pojo=(T)testingDao.getData(tableName,ID,MerchantSettlementBean.class);
				return pojo;
			case "POP_Data_MerchantSettlementAlter":
				pojo=(T)testingDao.getData(tableName,ID,MerchantSettlementAlterBean.class);
				return pojo;
			case "POP_Data_MerchantFeeRate":
				pojo=(T)testingDao.getData(tableName,ID,MerchantFeeRateBean.class);
				return pojo;
			case "POP_Data_MerchantInfoSearch":
				pojo=(T)testingDao.getData(tableName,ID,MerchantInfoSearchBean.class);
				return pojo;
			case "POP_Data_MerchantBalanceQuery":
				pojo=(T)testingDao.getData(tableName,ID,MerchantBalanceQueryBean.class);
				return pojo;
			case "POP_Data_MerchantIncomeExpenditureDetail":
				pojo=(T)testingDao.getData(tableName,ID,MerchantIncomeExpenditureDetailBean.class);
				return pojo;
			case "POP_Data_MerchantAccountManagement":
				pojo=(T)testingDao.getData(tableName,ID,MerchantAccountManagementBean.class);
				return pojo;
			case "POP_Data_OverdueMerInfoQuery":
				pojo=(T)testingDao.getData(tableName,ID,OverdueMerInfoQueryBean.class);
				return pojo;
			case "POP_Data_MainChildMerRelationship":
				pojo=(T)testingDao.getData(tableName,ID,MainChildMerRelationshipBean.class);
				return pojo;
			case "POP_Data_OnlinePurchaseOrderQuery":
				pojo=(T)testingDao.getData(tableName,ID,OnlinePurchaseOrderQueryBean.class);
				return pojo;
			case "POP_Data_OnlineRefundOrderQuery":
				pojo=(T)testingDao.getData(tableName,ID,OnlineRefundOrderQueryBean.class);
				return pojo;
			case "POP_Data_OnlineDepositOrderQuery":
				pojo=(T)testingDao.getData(tableName,ID,OnlineDepositOrderQueryBean.class);
				return pojo;
			case "POP_Data_OnlineDepositRefundQuery":
				pojo=(T)testingDao.getData(tableName,ID,OnlineDepositRefundQueryBean.class);
				return pojo;
			case "POP_Data_OnlineTransferInOrderQuery":
				pojo=(T)testingDao.getData(tableName,ID,OnlineTransferInOrderQueryBean.class);
				return pojo;
			case "POP_Data_OnlineTransferOutOrderQuery":
				pojo=(T)testingDao.getData(tableName,ID,OnlineTransferOutOrderQueryBean.class);
				return pojo;
			case "POP_Data_OnlineWithdrawOrderQuery":
				pojo=(T)testingDao.getData(tableName,ID,OnlineWithdrawOrderQueryBean.class);
				return pojo;
			case "POP_Data_SettlementManagement_RiskApproval":
				pojo=(T)testingDao.getData(tableName,ID,SettlementManagement_RiskApprovalBean.class);
				return pojo;
			case "POP_Data_SettlementManagement_PaymentApproval":
				pojo=(T)testingDao.getData(tableName,ID,SettlementManagement_PaymentApprovalBean.class);
				return pojo;
			case "POP_Data_SettlementManagement_PaymentApprovalStatusQuery":
				pojo=(T)testingDao.getData(tableName,ID,SettlementManagement_PaymentApprovalStatusQueryBean.class);
				return pojo;
			case "POP_Data_SettlementManagement_PaymentOperation":
				pojo=(T)testingDao.getData(tableName,ID,SettlementManagement_PaymentOperationBean.class);
				return pojo;
			case "POP_Data_SettlementManagement_PaymentWorkFlowQuery":
				pojo=(T)testingDao.getData(tableName,ID,SettlementManagement_PaymentWorkFlowQueryBean.class);
				return pojo;
			case "POP_Data_SettlementManagement_SettlementBillQuery":
				pojo=(T)testingDao.getData(tableName,ID,SettlementManagement_SettlementBillQueryBean.class);
				return pojo;
			case "POP_Data_SettlementManagement_TradeClearingManagementOrderQuery":
				pojo=(T)testingDao.getData(tableName,ID,SettlementManagement_TradeClearingManagementOrderQueryBean.class);
				return pojo;
			case "POP_Data_SettlementManagement_TradeClearingManagementQuery":
				pojo=(T)testingDao.getData(tableName,ID,SettlementManagement_TradeClearingManagementQueryBean.class);
				return pojo;
			case "POP_Data_RiskControlRuleManagement_RiskControlRuleManagement":
				pojo=(T)testingDao.getData(tableName,ID,RiskControlRuleManagement_RiskControlRuleManagementBean.class);
				return pojo;
			case "POP_Data_RiskControlRuleManagement_RiskControlTypeCorrespondingRulesManagement":
				pojo=(T)testingDao.getData(tableName,ID,RiskControlRuleManagement_RiskControlTypeCorrespondingRulesManagementBean.class);
				return pojo;
			case "POP_Data_RiskControlRuleManagement_RiskControlTypeManagement":
				pojo=(T)testingDao.getData(tableName,ID,RiskControlRuleManagement_RiskControlTypeManagementBean.class);
				return pojo;
			case "POP_Data_RiskControlRuleManagement_RiskTypeAndTradeCodeManagement":
				pojo=(T)testingDao.getData(tableName,ID,RiskControlRuleManagement_RiskTypeAndTradeCodeManagementBean.class);
				return pojo;
			case "POP_Data_RiskControlParamManagement_AccountTradeParamMaintain":
				pojo=(T)testingDao.getData(tableName,ID,RiskControlParamManagement_AccountTradeParamMaintainBean.class);
				return pojo;
			case "POP_Data_RiskControlParamManagement_AccountBalanceParamMaintain":
				pojo=(T)testingDao.getData(tableName,ID,RiskControlParamManagement_AccountBalanceParamMaintainBean.class);
				return pojo;
			case "POP_Data_RiskControlParamManagement_AccountApproveParamMaintain":
				pojo=(T)testingDao.getData(tableName,ID,RiskControlParamManagement_AccountApproveParamMaintainBean.class);
				return pojo;
			case "POP_Data_BlackWhiteListManagement_BlackListMaintain":
				pojo=(T)testingDao.getData(tableName,ID,BlackWhiteListManagement_BlackListMaintainBean.class);
				return pojo;
			case "POP_Data_BlackWhiteListManagement_WhiteListMaintain":
				pojo=(T)testingDao.getData(tableName,ID,BlackWhiteListManagement_WhiteListMaintainBean.class);
				return pojo;
			case "POP_Data_RiskControlWarning_WarningRuleManagement":
				pojo=(T)testingDao.getData(tableName,ID,RiskControlWarning_WarningRuleManagementBean.class);
				return pojo;
			case "POP_Data_RiskControlWarning_TimesWarning":
				pojo=(T)testingDao.getData(tableName,ID,RiskControlWarning_TimesWarningBean.class);
				return pojo;
			case "POP_Data_RiskControlWarning_LimitWarning":
				pojo=(T)testingDao.getData(tableName,ID,RiskControlWarning_LimitWarningBean.class);
				return pojo;
			case "POP_Data_RiskControlWarning_EmailWarning":
				pojo=(T)testingDao.getData(tableName,ID,RiskControlWarning_EmailWarningBean.class);
				return pojo;
			case "POP_Data_RefusedTradeQuery_BeforehandBlackListRefusedQuery":
				pojo=(T)testingDao.getData(tableName,ID,RefusedTradeQuery_BeforehandBlackListRefusedQueryBean.class);
				return pojo;
			case "POP_Data_RefusedTradeQuery_RefusedOrderQuery":
				pojo=(T)testingDao.getData(tableName,ID,RefusedTradeQuery_RefusedOrderQueryBean.class);
				return pojo;
			case "POP_Data_RefusedTradeQuery_WarningOrderQuery":
				pojo=(T)testingDao.getData(tableName,ID,RefusedTradeQuery_WarningOrderQueryBean.class);
				return pojo;
			case "POP_Data_RiskControlLvMaintain_RiskCustomerMaintain":
				pojo=(T)testingDao.getData(tableName,ID,RiskControlLvMaintain_RiskCustomerMaintainBean.class);
				return pojo;
			case "POP_Data_RiskControlLvMaintain_RiskLvMaintain":
				pojo=(T)testingDao.getData(tableName,ID,RiskControlLvMaintain_RiskLvMaintainBean.class);
				return pojo;
			case "POP_Data_RiskControlLvMaintain_RiskMonitorRuleMaintain":
				pojo=(T)testingDao.getData(tableName,ID,RiskControlLvMaintain_RiskMonitorRuleMaintainBean.class);
				return pojo;
			case "POP_Data_RiskControlLvMaintain_RiskOperationMaintain":
				pojo=(T)testingDao.getData(tableName,ID,RiskControlLvMaintain_RiskOperationMaintainBean.class);
				return pojo;
			case "POP_Data_RiskControlTotalQuery":
				pojo=(T)testingDao.getData(tableName,ID,RiskControlTotalQueryBean.class);
				return pojo;
			case "POP_Data_ComplianceMaintain_ComplianceLimitMaintain":
				pojo=(T)testingDao.getData(tableName,ID,ComplianceMaintain_ComplianceLimitMaintainBean.class);
				return pojo;
			case "POP_Data_ComplianceMaintain_ComplianceRiskControlQuantity":
				pojo=(T)testingDao.getData(tableName,ID,ComplianceMaintain_ComplianceRiskControlQuantityBean.class);
				return pojo;
			case "POP_Data_ComplianceMaintain_TradeVerificationWaySet":
				pojo=(T)testingDao.getData(tableName,ID,ComplianceMaintain_TradeVerificationWaySetBean.class);
				return pojo;
			case "POP_Data_ComplianceMaintain_WeightMaintain":
				pojo=(T)testingDao.getData(tableName,ID,ComplianceMaintain_WeightMaintainBean.class);
				return pojo;
			case "POP_Data_ComplianceMaintain_CustomerPaymentLimit":
				pojo=(T)testingDao.getData(tableName,ID,ComplianceMaintain_CustomerPaymentLimitBean.class);
				return pojo;
			case "POP_Data_MonitorRulesManagement_MonitorParameterMaintain":
				pojo=(T)testingDao.getData(tableName,ID,MonitorRulesManagement_MonitorParameterMaintainBean.class);
				return pojo;
			case "POP_Data_MonitorRulesManagement_MonitorRulesMaintain":
				pojo=(T)testingDao.getData(tableName,ID,MonitorRulesManagement_MonitorRulesMaintainBean.class);
				return pojo;
			case "POP_Data_MonitorRulesManagement_MonitorOperationMaintain":
				pojo=(T)testingDao.getData(tableName,ID,MonitorRulesManagement_MonitorOperationMaintainBean.class);
				return pojo;
			case "POP_Data_SuspiciousTradeManagement_SuspiciousTradeAnalyze":
				pojo=(T)testingDao.getData(tableName,ID,SuspiciousTradeManagement_SuspiciousTradeAnalyzeBean.class);
				return pojo;
			case "POP_Data_SuspiciousTradeManagement_BeingProcessedSuspiciousTradeMaintain":
				pojo=(T)testingDao.getData(tableName,ID,SuspiciousTradeManagement_BeingProcessedSuspiciousTradeMaintainBean.class);
				return pojo;
			case "POP_Data_SuspiciousTradeManagement_ProcessedSuspiciousTradeQuery":
				pojo=(T)testingDao.getData(tableName,ID,SuspiciousTradeManagement_ProcessedSuspiciousTradeQueryBean.class);
				return pojo;
				
			case "POP_Data_MerchantOper":
				
				break;
			case "POP_Data_UserInfoQuery":
				pojo=(T)testingDao.getData(tableName,ID,UserInfoQueryBean.class);
				return pojo;
			case "POP_Data_UserAccountModifySearch":
				pojo=(T)testingDao.getData(tableName,ID,UserAccountModifySearchBean.class);
				return pojo;
			case "POP_Data_UserIncomeExpenditureDetail":
				pojo=(T)testingDao.getData(tableName,ID,UserIncomeExpenditureDetailBean.class);
				return pojo;
			case "POP_Data_UserAction":
				pojo=(T)testingDao.getData(tableName,ID,UserActionBean.class);
				return pojo;
			case "POP_Data_Oper":
				pojo=(T)testingDao.getData(tableName,ID,OperBean.class);
				return pojo;
			case "Online_Data_Cashier_B2C":
				pojo=(T)testingDao.getData(tableName,ID,OnlineCashierB2CBean.class);
				return pojo;
			case "Online_Data_Cashier_B2B":
				pojo=(T)testingDao.getData(tableName,ID,OnlineCashierB2BBean.class);
				return pojo;				
			case "Data_URL":
				data_URLBean=new Data_URLBean();
				break;
			case "AOP_Data_Login":
				pojo=(T)testingDao.getData(tableName,ID,LoginBean.class);
				return pojo;
			case "MP_Data_Oper":
				pojo=(T)testingDao.getData(tableName,ID,PmOperBean.class);
				return pojo;
			default:
				System.out.println("DataBusiness.getDataBean: "+tableName+" is not exist! Please check!");
				assertTrue(false);
		}
		return null;
	}
	
	/*
	public void loadDataRef(String tableName,String ID) { 
		switch (tableName) { 
			case "POP_Data_MerchantAudit":
				MerchantAuditBean=testingDao.getData(tableName,ID,MerchantAuditBean.class);
				break;
			case "POP_Data_MerchantInfo":
				MerchantInfoBean=testingDao.getData(tableName,ID,MerchantInfoBean.class);
				break;
			case "POP_Data_MerchantSettlement":
				MerchantSettlementBean=testingDao.getData(tableName,ID,MerchantSettlementBean.class);
				
				break;
			case "POP_Data_MerchantOper":
				
				break;
			case "POP_Data_Oper":
				operBean=testingDao.getData(tableName,ID,OperBean.class);
				break;
			case "Data_URL":
				data_URLBean=new Data_URLBean();
				break;

			default:
				System.out.println("table is not exist! Please check!");
				break;
		}
	}
	*/
	public <T> T getDataBean(String tableName,String ID,Class<T> cls){
		return (T)testingDao.getData(tableName,ID,cls);
	}
	public <T> void loadDataBeanList(String tableName,Class<T> cls) {
		loadDataBeanList(tableName,"",cls);
	}
	public <T> void loadDataBeanList(String tableName,String caseNO,Class<T> cls){
		list=BaseUtil.toObject(testingDao.getDataListByCase(tableName,caseNO,cls));
	}
	
	public void loadDataBeanList(String tableName) {
		loadDataBeanList(tableName,"");
	}
	
	public void loadDataBeanList(String tableName,String caseNO) {
		switch (tableName) {
		case "POP_Data_MerchantAudit":
			list=BaseUtil.toObject(testingDao.getDataListByCase(tableName,caseNO,MerchantAuditBean.class));
			break;
		case "POP_Data_MerchantInfo":
			list=BaseUtil.toObject(testingDao.getDataListByCase(tableName,caseNO,MerchantInfoBean.class));
			break;
		case "POP_Data_MerchantSettlement":
			list=BaseUtil.toObject(testingDao.getDataListByCase(tableName,caseNO,MerchantSettlementBean.class));
			break;
		case "POP_Data_MerchantSettlementAlter":
			list=BaseUtil.toObject(testingDao.getDataListByCase(tableName,caseNO,MerchantSettlementAlterBean.class));
			break;
		case "POP_Data_MerchantFeeRate":
			list=BaseUtil.toObject(testingDao.getDataListByCase(tableName,caseNO,MerchantFeeRateBean.class));
			break;
		case "POP_Data_MerchantInfoSearch":
			list=BaseUtil.toObject(testingDao.getDataListByCase(tableName,caseNO,MerchantInfoSearchBean.class));
			break;
		case "POP_Data_MerchantBalanceQuery":
			list=BaseUtil.toObject(testingDao.getDataListByCase(tableName,caseNO,MerchantBalanceQueryBean.class));
			break;
		case "POP_Data_MerchantIncomeExpenditureDetail":
			list=BaseUtil.toObject(testingDao.getDataListByCase(tableName,caseNO,MerchantIncomeExpenditureDetailBean.class));
			break;
		case "POP_Data_MerchantAccountManagement":
			list=BaseUtil.toObject(testingDao.getDataListByCase(tableName,caseNO,MerchantAccountManagementBean.class));
			break;
		case "POP_Data_OverdueMerInfoQuery":
			list=BaseUtil.toObject(testingDao.getDataListByCase(tableName,caseNO,OverdueMerInfoQueryBean.class));
			break;
		case "POP_Data_MainChildMerRelationship":
			list=BaseUtil.toObject(testingDao.getDataListByCase(tableName,caseNO,MainChildMerRelationshipBean.class));
			break;
		case "POP_Data_OnlinePurchaseOrderQuery":
			list=BaseUtil.toObject(testingDao.getDataListByCase(tableName,caseNO,OnlinePurchaseOrderQueryBean.class));
			break;
		case "POP_Data_OnlineRefundOrderQuery":
			list=BaseUtil.toObject(testingDao.getDataListByCase(tableName,caseNO,OnlineRefundOrderQueryBean.class));
			break;
		case "POP_Data_OnlineDepositOrderQuery":
			list=BaseUtil.toObject(testingDao.getDataListByCase(tableName,caseNO,OnlineDepositOrderQueryBean.class));
			break;
		case "POP_Data_OnlineDepositRefundQuery":
			list=BaseUtil.toObject(testingDao.getDataListByCase(tableName,caseNO,OnlineDepositRefundQueryBean.class));
			break;
		case "POP_Data_OnlineTransferInOrderQuery":
			list=BaseUtil.toObject(testingDao.getDataListByCase(tableName,caseNO,OnlineTransferInOrderQueryBean.class));
			break;
		case "POP_Data_OnlineTransferOutOrderQuery":
			list=BaseUtil.toObject(testingDao.getDataListByCase(tableName,caseNO,OnlineTransferOutOrderQueryBean.class));
			break;
		case "POP_Data_OnlineWithdrawOrderQuery":
			list=BaseUtil.toObject(testingDao.getDataListByCase(tableName,caseNO,OnlineWithdrawOrderQueryBean.class));
			break;
		case "POP_Data_SettlementManagement_RiskApproval":
			list=BaseUtil.toObject(testingDao.getDataListByCase(tableName,caseNO,SettlementManagement_RiskApprovalBean.class));
			break;
		case "POP_Data_SettlementManagement_PaymentApproval":
			list=BaseUtil.toObject(testingDao.getDataListByCase(tableName,caseNO,SettlementManagement_PaymentApprovalBean.class));
			break;
		case "POP_Data_SettlementManagement_PaymentApprovalStatusQuery":
			list=BaseUtil.toObject(testingDao.getDataListByCase(tableName,caseNO,SettlementManagement_PaymentApprovalStatusQueryBean.class));
			break;
		case "POP_Data_SettlementManagement_PaymentOperation":
			list=BaseUtil.toObject(testingDao.getDataListByCase(tableName,caseNO,SettlementManagement_PaymentOperationBean.class));
			break;
		case "POP_Data_SettlementManagement_PaymentWorkFlowQuery":
			list=BaseUtil.toObject(testingDao.getDataListByCase(tableName,caseNO,SettlementManagement_PaymentWorkFlowQueryBean.class));
			break;
		case "POP_Data_SettlementManagement_SettlementBillQuery":
			list=BaseUtil.toObject(testingDao.getDataListByCase(tableName,caseNO,SettlementManagement_SettlementBillQueryBean.class));
			break;
		case "POP_Data_SettlementManagement_TradeClearingManagementOrderQuery":
			list=BaseUtil.toObject(testingDao.getDataListByCase(tableName,caseNO,SettlementManagement_TradeClearingManagementOrderQueryBean.class));
			break;
		case "POP_Data_RiskControlRuleManagement_RiskControlRuleManagement":
			list=BaseUtil.toObject(testingDao.getDataListByCase(tableName,caseNO,RiskControlRuleManagement_RiskControlRuleManagementBean.class));
			break;
		case "POP_Data_RiskControlRuleManagement_RiskControlTypeCorrespondingRulesManagement":
			list=BaseUtil.toObject(testingDao.getDataListByCase(tableName,caseNO,RiskControlRuleManagement_RiskControlTypeCorrespondingRulesManagementBean.class));
			break;
		case "POP_Data_RiskControlRuleManagement_RiskControlTypeManagement":
			list=BaseUtil.toObject(testingDao.getDataListByCase(tableName,caseNO,RiskControlRuleManagement_RiskControlTypeManagementBean.class));
			break;
		case "POP_Data_RiskControlRuleManagement_RiskTypeAndTradeCodeManagement":
			list=BaseUtil.toObject(testingDao.getDataListByCase(tableName,caseNO,RiskControlRuleManagement_RiskTypeAndTradeCodeManagementBean.class));
			break;
		case "POP_Data_RiskControlParamManagement_AccountTradeParamMaintain":
			list=BaseUtil.toObject(testingDao.getDataListByCase(tableName,caseNO,RiskControlParamManagement_AccountTradeParamMaintainBean.class));
			break;
		case "POP_Data_RiskControlParamManagement_AccountBalanceParamMaintain":
			list=BaseUtil.toObject(testingDao.getDataListByCase(tableName,caseNO,RiskControlParamManagement_AccountBalanceParamMaintainBean.class));
			break;
		case "POP_Data_RiskControlParamManagement_AccountApproveParamMaintain":
			list=BaseUtil.toObject(testingDao.getDataListByCase(tableName,caseNO,RiskControlParamManagement_AccountApproveParamMaintainBean.class));
			break;
		case "POP_Data_BlackWhiteListManagement_BlackListMaintain":
			list=BaseUtil.toObject(testingDao.getDataListByCase(tableName,caseNO,BlackWhiteListManagement_BlackListMaintainBean.class));
			break;
		case "POP_Data_BlackWhiteListManagement_WhiteListMaintain":
			list=BaseUtil.toObject(testingDao.getDataListByCase(tableName,caseNO,BlackWhiteListManagement_WhiteListMaintainBean.class));
			break;
		case "POP_Data_RiskControlWarning_WarningRuleManagement":
			list=BaseUtil.toObject(testingDao.getDataListByCase(tableName,caseNO,RiskControlWarning_WarningRuleManagementBean.class));
			break;
		case "POP_Data_RiskControlWarning_TimesWarning":
			list=BaseUtil.toObject(testingDao.getDataListByCase(tableName,caseNO,RiskControlWarning_TimesWarningBean.class));
			break;
		case "POP_Data_RiskControlWarning_LimitWarning":
			list=BaseUtil.toObject(testingDao.getDataListByCase(tableName,caseNO,RiskControlWarning_LimitWarningBean.class));
			break;
		case "POP_Data_RiskControlWarning_EmailWarning":
			list=BaseUtil.toObject(testingDao.getDataListByCase(tableName,caseNO,RiskControlWarning_EmailWarningBean.class));
			break;
		case "POP_Data_RefusedTradeQuery_BeforehandBlackListRefusedQuery":
			list=BaseUtil.toObject(testingDao.getDataListByCase(tableName,caseNO,RefusedTradeQuery_BeforehandBlackListRefusedQueryBean.class));
			break;
		case "POP_Data_RefusedTradeQuery_RefusedOrderQuery":
			list=BaseUtil.toObject(testingDao.getDataListByCase(tableName,caseNO,RefusedTradeQuery_RefusedOrderQueryBean.class));
			break;
		case "POP_Data_RefusedTradeQuery_WarningOrderQuery":
			list=BaseUtil.toObject(testingDao.getDataListByCase(tableName,caseNO,RefusedTradeQuery_WarningOrderQueryBean.class));
			break;
		case "POP_Data_RiskControlLvMaintain_RiskCustomerMaintain":
			list=BaseUtil.toObject(testingDao.getDataListByCase(tableName,caseNO,RiskControlLvMaintain_RiskCustomerMaintainBean.class));
			break;
		case "POP_Data_RiskControlLvMaintain_RiskLvMaintain":
			list=BaseUtil.toObject(testingDao.getDataListByCase(tableName,caseNO,RiskControlLvMaintain_RiskLvMaintainBean.class));
			break;
		case "POP_Data_RiskControlLvMaintain_RiskMonitorRuleMaintain":
			list=BaseUtil.toObject(testingDao.getDataListByCase(tableName,caseNO,RiskControlLvMaintain_RiskMonitorRuleMaintainBean.class));
			break;
		case "POP_Data_RiskControlLvMaintain_RiskOperationMaintain":
			list=BaseUtil.toObject(testingDao.getDataListByCase(tableName,caseNO,RiskControlLvMaintain_RiskOperationMaintainBean.class));
			break;
		case "POP_Data_RiskControlTotalQuery":
			list=BaseUtil.toObject(testingDao.getDataListByCase(tableName,caseNO,RiskControlTotalQueryBean.class));
			break;
		case "POP_Data_ComplianceMaintain_ComplianceLimitMaintain":
			list=BaseUtil.toObject(testingDao.getDataListByCase(tableName,caseNO,ComplianceMaintain_ComplianceLimitMaintainBean.class));
			break;
		case "POP_Data_ComplianceMaintain_ComplianceRiskControlQuantity":
			list=BaseUtil.toObject(testingDao.getDataListByCase(tableName,caseNO,ComplianceMaintain_ComplianceRiskControlQuantityBean.class));
			break;
		case "POP_Data_ComplianceMaintain_TradeVerificationWaySet":
			list=BaseUtil.toObject(testingDao.getDataListByCase(tableName,caseNO,ComplianceMaintain_TradeVerificationWaySetBean.class));
			break;
		case "POP_Data_ComplianceMaintain_WeightMaintain":
			list=BaseUtil.toObject(testingDao.getDataListByCase(tableName,caseNO,ComplianceMaintain_WeightMaintainBean.class));
			break;
		case "POP_Data_ComplianceMaintain_CustomerPaymentLimit":
			list=BaseUtil.toObject(testingDao.getDataListByCase(tableName,caseNO,ComplianceMaintain_CustomerPaymentLimitBean.class));
			break;
		case "POP_Data_MonitorRulesManagement_MonitorOperationMaintain":
			list=BaseUtil.toObject(testingDao.getDataListByCase(tableName,caseNO,MonitorRulesManagement_MonitorOperationMaintainBean.class));
			break;
		case "POP_Data_SuspiciousTradeManagement_SuspiciousTradeAnalyze":
			list=BaseUtil.toObject(testingDao.getDataListByCase(tableName,caseNO,SuspiciousTradeManagement_SuspiciousTradeAnalyzeBean.class));
			break;
		case "POP_Data_SuspiciousTradeManagement_BeingProcessedSuspiciousTradeMaintain":
			list=BaseUtil.toObject(testingDao.getDataListByCase(tableName,caseNO,SuspiciousTradeManagement_BeingProcessedSuspiciousTradeMaintainBean.class));
			break;
		case "POP_Data_SuspiciousTradeManagement_ProcessedSuspiciousTradeQuery":
			list=BaseUtil.toObject(testingDao.getDataListByCase(tableName,caseNO,SuspiciousTradeManagement_ProcessedSuspiciousTradeQueryBean.class));
			break;
			
		case "POP_Data_MerchantOper":
			
			break;
			
		case "POP_Data_UserInfoQuery":
			list=BaseUtil.toObject(testingDao.getDataListByCase(tableName,caseNO,UserInfoQueryBean.class));
			break;
		case "POP_Data_UserAccountModifySearch":
			list=BaseUtil.toObject(testingDao.getDataListByCase(tableName,caseNO,UserAccountModifySearchBean.class));
			break;
		case "POP_Data_UserIncomeExpenditureDetail":
			list=BaseUtil.toObject(testingDao.getDataListByCase(tableName,caseNO,UserIncomeExpenditureDetailBean.class));
			break;
		case "POP_Data_UserAction":
			list=BaseUtil.toObject(testingDao.getDataListByCase(tableName,caseNO,UserActionBean.class));
			break;
		case "POP_Data_Oper":
			list=BaseUtil.toObject(testingDao.getDataListByCase(tableName,caseNO,OperBean.class));
			break;
		case "Online_Data_Cashier_B2C":
			list=BaseUtil.toObject(testingDao.getDataListByCase(tableName,caseNO,OnlineCashierB2CBean.class));
			break;
		case "Online_Data_Cashier_B2B":
			list=BaseUtil.toObject(testingDao.getDataListByCase(tableName,caseNO,OnlineCashierB2BBean.class));
			break;
		case "POP_Data_SettlementManagement_TradeClearingManagementQuery":
			list=BaseUtil.toObject(testingDao.getDataListByCase(tableName,caseNO,SettlementManagement_TradeClearingManagementQueryBean.class));
			break;
		case "POP_Data_MonitorRulesManagement_MonitorParameterMaintain":
			list=BaseUtil.toObject(testingDao.getDataListByCase(tableName,caseNO,MonitorRulesManagement_MonitorParameterMaintainBean.class));
			break;
		case "POP_Data_MonitorRulesManagement_MonitorRulesMaintain":
			list=BaseUtil.toObject(testingDao.getDataListByCase(tableName,caseNO,MonitorRulesManagement_MonitorRulesMaintainBean.class));
			break;
		case "Data_URL":
			data_URLBean=new Data_URLBean();
			break;
		
		
		case "POP_Data_CooperatingAgencyInfo":
			list=BaseUtil.toObject(testingDao.getDataListByCase(tableName,caseNO,CooperatingAgentInfoBean.class));
			break;
			
		case "POP_Data_CooperatingPaymentChannel":
			list=BaseUtil.toObject(testingDao.getDataListByCase(tableName,caseNO,CooperatingPaymentChannelBean.class));
			break;
			
		case "POP_Data_CooperatingServiceChannel":
			list=BaseUtil.toObject(testingDao.getDataListByCase(tableName,caseNO,CooperatingServiceChannelBean.class));
			break;
		
		case "POP_Data_CooperatingRouteInfo":
			list=BaseUtil.toObject(testingDao.getDataListByCase(tableName,caseNO,CooperatingRouteInfoBean.class));
			break;
			
		case "POP_Data_IdentityAuthenticationChannel":
			list=BaseUtil.toObject(testingDao.getDataListByCase(tableName,caseNO,IdentityAuthenticationChannelBean.class));
			break;
		
		case "POP_Data_IdentityAuthenticationRoute":
			list=BaseUtil.toObject(testingDao.getDataListByCase(tableName,caseNO,IdentityAuthenticationRouteBean.class));
			break;
		
		case "POP_Data_IdentityAuthenticationDetails":
			list=BaseUtil.toObject(testingDao.getDataListByCase(tableName,caseNO,IdentityAuthenticationDetailsBean.class));
			break;
			
		case "POP_Data_IdentityAuthenticationQuery":
			list=BaseUtil.toObject(testingDao.getDataListByCase(tableName,caseNO,IdentityAuthenticationQueryBean.class));
			break;
		
		case "POP_Data_IdCardPhotoVerification":
			list=BaseUtil.toObject(testingDao.getDataListByCase(tableName,caseNO,IdCardPhotoVerificationBean.class));
			break;
		
		case "POP_Data_IdCardValidDateVerification":
			list=BaseUtil.toObject(testingDao.getDataListByCase(tableName,caseNO,IdCardValidDateVerificationBean.class));
			break;
		
		case "POP_Data_FinanceChannelManageInfo":
			list=BaseUtil.toObject(testingDao.getDataListByCase(tableName,caseNO,FinanceChannelManageInfoBean.class));
			break;
		
		case "POP_Data_FinanceChannelManageFlowQuery":
			list=BaseUtil.toObject(testingDao.getDataListByCase(tableName,caseNO,FinanceChannelManageFlowQueryBean.class));
			break;
			
		case "POP_Data_FinanceChannelManageReturnCode":
			list=BaseUtil.toObject(testingDao.getDataListByCase(tableName,caseNO,FinanceChannelManageReturnCodeBean.class));
			break;
			
		case "POP_Data_FinanceChannelManageSignManage":
			list=BaseUtil.toObject(testingDao.getDataListByCase(tableName,caseNO,FinanceChannelManageSignManageBean.class));
			break;
			
		case "POP_Data_FinanceChannelManageRateMaintain":
			list=BaseUtil.toObject(testingDao.getDataListByCase(tableName,caseNO,FinanceChannelManageRateMaintainBean.class));
			break;
			
		case "POP_Data_FinanceChannelManageRateCode":
			list=BaseUtil.toObject(testingDao.getDataListByCase(tableName,caseNO,FinanceChannelManageRateCodeBean.class));
			break;
			
			
		case "POP_Data_FinanceChannelBalanceAccountParameter":
			list=BaseUtil.toObject(testingDao.getDataList(tableName,FinanceChannelBalanceAccountParameterBean.class));
			break;
		
		case "POP_Data_FinanceChannelBalanceAccountBatchNumQuery":
			list=BaseUtil.toObject(testingDao.getDataList(tableName,FinanceChannelBalanceAccountBatchNumQueryBean.class));
			break;
		
		case "POP_Data_FinanceChannelBalanceAccountErrorManage":
			list=BaseUtil.toObject(testingDao.getDataList(tableName,FinanceChannelBalanceAccountErrorManageBean.class));
			break;	
		
		case "POP_Data_AccountManageItemManage":
			list=BaseUtil.toObject(testingDao.getDataList(tableName,AccountManageItemManageBean.class));
			break;	
			
		case "POP_Data_AccountManageItemRelation":
			list=BaseUtil.toObject(testingDao.getDataList(tableName,AccountManageItemRelationBean.class));
			break;	
			
		case "POP_Data_AccountManageInternalAccountManage":
			list=BaseUtil.toObject(testingDao.getDataList(tableName,AccountManageInternalAccountManageBean.class));
			break;	
			
		case "POP_Data_AccountManageInternalAccountHistoryBalance":
			list=BaseUtil.toObject(testingDao.getDataList(tableName,AccountManageInternalAccountHistoryBalanceBean.class));
			break;	
		
		case "POP_Data_AccountManageManualSingleAccount":
			list=BaseUtil.toObject(testingDao.getDataList(tableName,AccountManageManualSingleAccountBean.class));
			break;	
			
		case "POP_Data_AccountManageSceneComprehensive":
			list=BaseUtil.toObject(testingDao.getDataList(tableName,AccountManageSceneComprehensiveBean.class));
			break;	
			
		case "POP_Data_AccountManageManualAccountCheck":
			list=BaseUtil.toObject(testingDao.getDataList(tableName,AccountManageManualAccountCheckBean.class));
			break;	
			
		case "POP_Data_AccountManageYesterdayWholeQuery":
			list=BaseUtil.toObject(testingDao.getDataList(tableName,AccountManageYesterdayWholeQueryBean.class));
			break;	
			
		case "POP_Data_AccountManageWholeHistoryQuery":
			list=BaseUtil.toObject(testingDao.getDataList(tableName,AccountManageWholeHistoryQueryBean.class));
			break;	
			
		case "POP_Data_AccountManageInnerAccountBalanceQuery":
			list=BaseUtil.toObject(testingDao.getDataList(tableName,AccountManageInnerAccountBalanceQueryBean.class));
			break;	
			
		case "POP_Data_AccountManageOnlineInternalAccountPaymentQuery":
			list=BaseUtil.toObject(testingDao.getDataList(tableName,AccountManageOnlineInternalAccountPaymentQueryBean.class));
			break;	
			
		case "POP_Data_AccountManageOfflineInternalAccountPaymentQuery":
			list=BaseUtil.toObject(testingDao.getDataList(tableName,AccountManageOfflineInternalAccountPaymentQueryBean.class));
			break;	
			
		case "POP_Data_AccountManageSummonsQuery":
			list=BaseUtil.toObject(testingDao.getDataList(tableName,AccountManageSummonsQueryBean.class));
			break;	
			
		case "POP_Data_AccountManageInformDetailQuery":
			list=BaseUtil.toObject(testingDao.getDataList(tableName,AccountManageInformDetailQueryBean.class));
			break;	
			
		case "POP_Data_AccountManageFrozenDetailQuery":
			list=BaseUtil.toObject(testingDao.getDataList(tableName,AccountManageFrozenDetailQueryBean.class));
			break;	
			
		case "POP_Data_AccountManageExternalBalanceDetailQuery":
			list=BaseUtil.toObject(testingDao.getDataList(tableName,AccountManageExternalBalanceDetailQueryBean.class));
			break;	
			
		case "POP_Data_AccountManageAccountingEntryMaintain":
			list=BaseUtil.toObject(testingDao.getDataList(tableName,AccountManageAccountingEntryMaintainBean.class));
			break;	
			
		case "POP_Data_AccountManageAccountingEntryCheck":
			list=BaseUtil.toObject(testingDao.getDataList(tableName,AccountManageAccountingEntryCheckBean.class));
			break;	
		
		case "POP_Data_AccountManageAccountOrgnizationManage":
			list=BaseUtil.toObject(testingDao.getDataList(tableName,AccountManageAccountOrgnizationManageBean.class));
			break;	
		
		case "POP_Data_AccountManageBookingKeppFlow":
			list=BaseUtil.toObject(testingDao.getDataList(tableName,AccountManageBookingKeppFlowBean.class));
			break;	
			
		case "POP_Data_AccountManageOfflineFreezeManage":
			list=BaseUtil.toObject(testingDao.getDataList(tableName,AccountManageOfflineFreezeManageBean.class));
			break;	
			
		case "POP_Data_AccountManageOfflineReleaseManage":
			list=BaseUtil.toObject(testingDao.getDataList(tableName,AccountManageOfflineReleaseManageBean.class));
			break;	
			
			
			
		case "AOP_Data_Login":
			list=BaseUtil.toObject(testingDao.getDataListByCase(tableName,caseNO,LoginBean.class));
			break;
			
		default:
			System.out.println("table "+tableName+" is not exist! Please check!");
			break;
		}
	}
	
	
	/**
	 * using loadDataBeanList(String tableName) method before this method 
	 * @return
	 */
	public Object[][] getDataBeanArray() {
		if(list==null) {
			System.out.println("DataBeanList is null! Please check!");
			assertTrue(false);
		}
		Object[][] results=new Object[list.size()][1];
		for (int i=0;i<list.size();i++) {
			results[i][0]=list.get(i);
		}
		return results;
	}
	
	public Data_URLBean getData_URLBean(){
		
		data_URLBean.setID((String)map.get("ID"));
		data_URLBean.setURL((String)map.get("URL"));
		data_URLBean.setComment((String)map.get("Comment"));
		
		return data_URLBean;
	}
	
	
/*	public boolean updateMerchantInfoStatusToPass(String merchantNO,String merchantName) {
		boolean flag=testingDao.updateMerchantInfoStatusToPass(merchantNO, merchantName);
		if(!flag) {
			System.out.println("没有找到商户："+merchantName+"的记录，更新数据库失败");
			assertTrue(false);
		}
		return flag;
	}*/
/*	
	public boolean updateMerchantInfoStatusToRefuse(String merchantName) {
		boolean flag=testingDao.updateMerchantInfoStatusToRefuse(merchantName);
		if(!flag) {
			System.out.println("没有找到商户："+merchantName+"的记录，更新数据库失败");
			assertTrue(false);
		}
		return flag;
	}
*/	
/*	public boolean insertMerchantSettlementInfo(String merchantNO,String merchantName) {
		boolean flag=testingDao.insertMerchantSettlementInfo(merchantNO, merchantName);
		if(!flag) {
			System.out.println("插入新数据失败");
			assertTrue(false);
		}
		return flag;
	}*/
	
/*	public boolean updateMerchantNextSettlementDate(int ID,String NextSettlementDate) {
		boolean flag=testingDao.updateMerchantNextSettlementDate(ID,NextSettlementDate);
		if(!flag) {
			System.out.println("update返回false，ID值不存在，导致更新“下一个结算日”失败");
			assertTrue(false);
		}
		return flag;
	}*/
	/*
	public boolean updateMerchantSettlementStatus(int ID,String Status) {
		boolean flag=testingDao.updateMerchantSettlementStatus(ID,Status);
		if(!flag) {
			System.out.println("update返回false，ID值不存在，导致更新“结算状态”失败");
			assertTrue(false);
		}
		return flag;
	}
	*/
/*	public boolean updateMerchantNOByID(int ID,String merchantNO) {
		boolean flag=testingDao.updateMerchantNOByID(ID,merchantNO);
		if(!flag) {
			System.out.println("update返回false，ID值不存在，导致更新“商户号”失败");
			assertTrue(false);
		}
		return flag;
	}*/
	
/*	public boolean updateSettlementByID(int ID,Map<String , String > map) {
		if(map==null) {
			System.out.println("In DataBusiness.updateSettlementByID(), map can not be null!");
			assertTrue(false);
		}
		boolean flag=testingDao.updateSettlementByID(ID,map);
		if(!flag) {
			System.out.println("update返回false，ID值或字段不存在，更新表失败");
			assertTrue(false);
		}
		return flag;
	}*/
/*	
	public boolean updateMerchantInfoByID(int ID,Map<String , String > map) {
		if(map==null || map.isEmpty()) {
			System.out.println("In DataBusiness.updateMerchantInfoByID(), map can not be null!");
			assertTrue(false);
		}
		boolean flag=testingDao.updateMerchantInfoByID(ID,map);
		if(!flag) {
			System.out.println("update返回false，ID值或字段不存在，更新表失败");
			assertTrue(false);
		}
		return flag;
	}
*/	
/*	
	public boolean insertMerchantFeeRate(String merchantNO,String merchantName) {
		boolean flag=testingDao.insertMerchantFeeRate(merchantNO, merchantName);
		if(!flag) {
			System.out.println("POP_Data_MerchantFeeRate表插入新数据失败");
//			Reporter.log("Reporter:POP_Data_MerchantFeeRate表插入新数据失败");
			assertTrue(false);
		}
		return flag;
	}
	*/
/*	public boolean insertMerchantProduct(String merchantNO,String merchantName) {
		boolean flag=testingDao.insertMerchantProduct(merchantNO, merchantName);
		if(!flag) {
			System.out.println("POP_Data_MerchantFeeRate表插入新数据失败");
//			Reporter.log("Reporter:POP_Data_MerchantFeeRate表插入新数据失败");
			assertTrue(false);
		}
		return flag;
	}
	*/
/*	public boolean insertMerchantProduct(Map<String , Object> map) {
		if(map==null || map.isEmpty()) {
			System.out.println("DataBusiness.insertMerchantProduct(): list mustn't be null or empty");
			assertTrue(false);
		}
		boolean flag=testingDao.insertMerchantProduct(map);
		if(!flag) {
			System.out.println("POP_Data_MerchantFeeRate表插入新数据失败");
//			Reporter.log("Reporter:POP_Data_MerchantFeeRate表插入新数据失败");
			assertTrue(false);
		}
		return flag;
	}*/
	
/*	
	public Map<String,Object> querySingleMerchantProduct(List<String> list,Map<String , String>map) {
		if(list.isEmpty()||list==null) {
			System.out.println("DataBusiness.queryMerchantProductByNO(): list mustn't be null or empty");
			assertTrue(false);
		}
		
		return testingDao.querySingleMerchantProduct(list,map);
	}
	*/
	public static Map<String, Object> querySingle(String tableName, List<String> selectList, Map<String, Object> whereMap) {
		if(selectList.isEmpty()||selectList==null) {
			System.out.println("DataBusiness.querySingle(): selectList mustn't be null or empty");
			assertTrue(false);
		}
		return testingDao.querySingle(tableName,selectList,whereMap);
	}
	
	public static List<Map<String, Object>> queryMore(String tableName, List<String> selectList,
			Map<String, Object> whereMap) {
		if(selectList.isEmpty()||selectList==null) {
			System.out.println("DataBusiness.queryMore(): selectList mustn't be null or empty");
			assertTrue(false);
		}
		return testingDao.queryMore(tableName,selectList,whereMap);
	}
	
	public static boolean updateTestData(String tableName, Map<String, Object> updateMap, Map<String, Object> whereMap) {
		if(updateMap==null || updateMap.isEmpty()) {
			System.out.println("In DataBusiness.updateTestData(), updateMap can not be null!");
			assertTrue(false);
		}
		boolean flag=testingDao.updateTestData(tableName,updateMap,whereMap);
		
		if(!flag) {
			System.out.println("DataBusiness.updateTestData(): update返回false，更新表失败");
			assertTrue(false);
		}
		return flag;
	}
	
	public static boolean updateTestData(String tableName, Map<String, Object> updateMap, Map<String, Object> whereMap,boolean existExpression) {
		if(updateMap==null || updateMap.isEmpty()) {
			System.out.println("In DataBusiness.updateTestData(), updateMap can not be null!");
			assertTrue(false);
		}
		boolean flag=testingDao.updateTestData(tableName,updateMap,whereMap,existExpression);
		
		if(!flag) {
			System.out.println("DataBusiness.updateTestData(): update返回false，更新表失败");
			assertTrue(false);
		}
		return flag;
	}
	
	public static boolean insertTestData(String tableName, Map<String, Object> insertMap) {
		if(insertMap==null || insertMap.isEmpty()) {
			System.out.println("DataBusiness.insertTestData(): map mustn't be null or empty");
			assertTrue(false);
		}
		boolean flag=testingDao.insertTestData(tableName,insertMap);
		if(!flag) {
			System.out.println(tableName+"表插入新数据失败");
			assertTrue(false);
		}
		return flag;
	}
	/****************Bean **********************/
/*	
	public OperBean getOperBean(){
		operBean.setOperID((String)map.get("OperID"));
		operBean.setPassword((String)map.get("password"));
		operBean.setMobileNO((String)map.get("mobileNO"));
		operBean.setComment((String)map.get("comment"));
		return operBean;
	}*/
	/*
	public MerchantInfoBean getMerchantInfoBean(){
		MerchantInfoBean.setID((Integer)map.get("ID"));
		MerchantInfoBean.setA_MerchantType((String)map.get("A_MerchantType"));
		MerchantInfoBean.setA_MerchantName((String)map.get("A_MerchantName"));
		MerchantInfoBean.setA_shortName((String)map.get("A_shortName"));
		MerchantInfoBean.setA_mcc_super((String)map.get("A_mcc_super"));
		MerchantInfoBean.setA_mcc((String)map.get("A_mcc"));
		MerchantInfoBean.setA_Province((String)map.get("A_Province"));
		MerchantInfoBean.setA_City((String)map.get("A_City"));
		MerchantInfoBean.setA_Business_Address((String)map.get("A_Business_Address"));
		MerchantInfoBean.setA_Account_Permits((String)map.get("A_Account_Permits"));
		MerchantInfoBean.setA_Merchant_Property((String)map.get("A_Merchant_Property"));
		MerchantInfoBean.setA_Business_License((String)map.get("A_Business_License"));
		MerchantInfoBean.setA_Business_License_StartDate((String)map.get("A_Business_License_StartDate"));
		MerchantInfoBean.setA_Business_License_ExpiredDate((String)map.get("A_Business_License_ExpiredDate"));
		MerchantInfoBean.setA_Business_Scope((String)map.get("A_Business_Scope"));
		MerchantInfoBean.setA_Registered_Capital((String)map.get("A_Registered_Capital"));
		MerchantInfoBean.setA_Registered_Address((String)map.get("A_Registered_Address"));
		MerchantInfoBean.setA_Organization_Code((String)map.get("A_Organization_Code"));
		MerchantInfoBean.setA_Tax_Registration_Certificate((String)map.get("A_Tax_Registration_Certificate"));
		MerchantInfoBean.setA_CorpName((String)map.get("A_CorpName"));
		MerchantInfoBean.setA_CorpID_Type((String)map.get("A_CorpID_Type"));
		MerchantInfoBean.setA_CorpID((String)map.get("A_CorpID"));
		MerchantInfoBean.setA_CopID_StartDate((String)map.get("A_CopID_StartDate"));
		MerchantInfoBean.setA_CopID_ExpiredDate((String)map.get("A_CopID_ExpiredDate"));
		MerchantInfoBean.setB_StoreName((String)map.get("B_StoreName"));
		MerchantInfoBean.setB_StoreShortName((String)map.get("B_StoreShortName"));
		MerchantInfoBean.setB_Store_Address((String)map.get("B_Store_Address"));
		MerchantInfoBean.setB_Store_PhoneNO((String)map.get("B_Store_PhoneNO"));
		MerchantInfoBean.setB_Business_Hours((String)map.get("B_Business_Hours"));
		MerchantInfoBean.setC_Controller_Type((String)map.get("C_Controller_Type"));
		MerchantInfoBean.setC_ControllerName((String)map.get("C_ControllerName"));
		MerchantInfoBean.setC_ControllerID_Type((String)map.get("C_ControllerID_Type"));
		MerchantInfoBean.setC_ControllerID((String)map.get("C_ControllerID"));
		MerchantInfoBean.setC_ControlleID_StartDate((String)map.get("C_ControlleID_StartDate"));
		MerchantInfoBean.setC_ControlleID_ExpiredDate((String)map.get("C_ControlleID_ExpiredDate"));
		MerchantInfoBean.setC_Stakeholder_Type((String)map.get("C_Stakeholder_Type"));
		MerchantInfoBean.setC_StakeholderName((String)map.get("C_StakeholderName"));
		MerchantInfoBean.setC_StakeholderID_Type((String)map.get("C_StakeholderID_Type"));
		MerchantInfoBean.setC_StakeholderID((String)map.get("C_StakeholderID"));
		MerchantInfoBean.setC_Stakeholder_StartDate((String)map.get("C_Stakeholder_StartDate"));
		MerchantInfoBean.setC_Stakeholder_ExpiredDate((String)map.get("C_Stakeholder_ExpiredDate"));
		MerchantInfoBean.setD_Introduce_Channel((String)map.get("D_Introduce_Channel"));
		MerchantInfoBean.setD_AgreementNO((String)map.get("D_AgreementNO"));
		MerchantInfoBean.setD_AgreementExpiredDate((String)map.get("D_AgreementExpiredDate"));
		MerchantInfoBean.setD_HandlerName((String)map.get("D_HandlerName"));
		MerchantInfoBean.setD_HandlerID_Type((String)map.get("D_HandlerID_Type"));
		MerchantInfoBean.setD_HandlerID((String)map.get("D_HandlerID"));
		MerchantInfoBean.setD_Handler_StartDate((String)map.get("D_Handler_StartDate"));
		MerchantInfoBean.setD_Handler_ExpiredDate((String)map.get("D_Handler_ExpiredDate"));
		MerchantInfoBean.setH_MerchantAdminName((String)map.get("H_MerchantAdminName"));
		MerchantInfoBean.setH_MerchantAdmin_MobileNO((String)map.get("H_MerchantAdmin_MobileNO"));
		MerchantInfoBean.setH_MerchantAdmin_Email((String)map.get("H_MerchantAdmin_Email"));
		MerchantInfoBean.setH_MerchantInterfaceType((String)map.get("H_MerchantInterfaceType"));

		return MerchantInfoBean;
	}
		*/
	/*public MerchantAuditBean getMerchantAuditBean() {
		MerchantAuditBean.setID(String.valueOf(map.get("ID")));
		MerchantAuditBean.setOperID((String)map.get("OperID"));
		MerchantAuditBean.setTransactionName((String)map.get("TransactionName"));
		MerchantAuditBean.setKeyInfo((String)map.get("KeyInfo"));
		MerchantAuditBean.setComment((String)map.get("Comment"));
		
		return MerchantAuditBean;
	}*/

	public MerchantSettlementBean getMerchantSettlementBean(){

	    return MerchantSettlementBean;
	}
	
	public MerchantFeeRateBean getMerchantFeeRateBean(){

	    return MerchantFeeRateBean;
	}



}
