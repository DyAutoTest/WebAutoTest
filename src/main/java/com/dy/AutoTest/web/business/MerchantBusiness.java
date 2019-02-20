package com.dy.AutoTest.web.business;

import org.testng.annotations.Test;

import com.dy.AutoTest.web.dao.MerchantDao;
import com.dy.AutoTest.web.dao.impl.MerchantDaoImpl;

public class MerchantBusiness {
	
	static MerchantDao merchantDao=new MerchantDaoImpl();
	
	public MerchantBusiness(MerchantDao merchantDao1) {
		merchantDao=merchantDao1;
	}
	public MerchantBusiness() {
		
	}
	
	public String getMerchantNOByName(String merchantName) {
		String merchantNO=merchantDao.getMerchantNOByName(merchantName);
		if(merchantNO==null||merchantNO.equals("")) {
			System.out.println("select merchantNO is null! Please check!");
		}
		return merchantNO;
	}
	
	
	public static String getOfflineMerchantNOByName(String merchantName) {
		String merchantNO=merchantDao.getOfflineMerchantNOByName(merchantName);
		if(merchantNO==null||merchantNO.equals("")) {
			System.out.println("select merchantNO is null! Please check!");
			return "";
		}
		return merchantNO;
	}
	
	
	
	@Test
	public void testGetOfflineMerchantNOByName() {
		System.out.println(getOfflineMerchantNOByName("线下AutoTest01181713"));
	}
	
	
}
