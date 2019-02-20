package com.dy.AutoTest.web.dao;

import java.util.List;
import java.util.Map;


public interface MerchantDao {
	
	String getMerchantNOByName(String merchantName);
	
	Map<String,Object> querySingle(String tableName,List<String> selectList,Map<String , Object> whereMap);
	List<Map<String,Object>> queryMore(String tableName,List<String> selectList,Map<String , Object> whereMap);

	String getOfflineMerchantNOByName(String merchantName);
}
