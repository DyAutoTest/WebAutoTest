package com.dy.AutoTest.web.dao;

import java.util.List;
import java.util.Map;

public interface TestingDao {
	
	/**
	 * 获取表的条数（待完成）
	 * @return
	 */
	int getCount();
	/**
	 * 获取表的ID（待完成）
	 * @return
	 */
	List<String> getDataIDs();
	
	Map<String,Object> getData(String tableName,String ID);
	
	List<Map<String, Object>> getLocator(String tableName);
	
	
	<T> T getData(String tableName,String ID,Class<T> cls);
	<T> List<T> getDataList(String tableName,Class<T> cls);
	<T> List<T> getDataListByCase(String tableName,String caseNO,Class<T> cls);
	Map<String,Object> querySingle(String tableName,List<String> selectList,Map<String , Object> whereMap);
	List<Map<String,Object>> queryMore(String tableName,List<String> selectList,Map<String , Object> whereMap);
	<T> List<T> queryMoreBeans(String tableName,List<String> selectList,Map<String , Object> whereMap,Class<T> cls);
	boolean updateTestData(String tableName,Map<String, Object> updateMap, Map<String, Object> whereMap);
	boolean updateTestData(String tableName,Map<String, Object> updateMap, Map<String, Object> whereMap,boolean existExpression);
	boolean insertTestData(String tableName,Map<String , Object> insertMap);
	String [][] getTableStruct(String tableName);
	
	boolean updateMerchantProductType(String productType, Map<String, Object> whereMap);
	
}
