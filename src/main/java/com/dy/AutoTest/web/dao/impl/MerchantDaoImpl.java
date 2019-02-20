package com.dy.AutoTest.web.dao.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.dy.AutoTest.web.actions.SingletonSet;
import com.dy.AutoTest.web.dao.MerchantDao;
import com.dy.AutoTest.web.util.JdbcUtil;

public class MerchantDaoImpl implements MerchantDao {
	private String sql="";
	private List<Object> params;
	private JdbcUtil jdbcUtil=SingletonSet.jdbcUtil_oracle;
	
	
	public String getMerchantNOByName(String merchantName) {
		String merchantNO="";
		
		sql="select a.MERC_ID from GSDPAY.T_URM_MINF a "
				+ "where a.MERC_CNM=?";
		params=new ArrayList<Object>();
		params.add(merchantName);
		try {
			Map<String, Object> map=jdbcUtil.findSimpleResult(sql, params);
			merchantNO=(String)map.get("MERC_ID");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return merchantNO;
	}


	public Map<String, Object> querySingle(String tableName, List<String> selectList, Map<String, Object> whereMap) {
		String fields="";
		for(int i=0;i<selectList.size();i++) {
			fields+=selectList.get(i);
			if(i<selectList.size()-1) fields+=",";
		}
		sql="select "+fields+" from "+tableName;
		params=new ArrayList<Object>();
		if(whereMap!=null && !whereMap.isEmpty()) {
			sql+=" where ";
			int i=0;
			for (Map.Entry<String, Object> entry : whereMap.entrySet()) { 
				sql+=entry.getKey()+"=?";
				if(i<whereMap.size()-1) 
					sql+=" and ";
				params.add(entry.getValue());
				i++;
			}
		}
		Map<String, Object> result=null;
		try {
			result=jdbcUtil.findSimpleResult(sql, params);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}

	public List<Map<String, Object>> queryMore(String tableName, List<String> selectList,
			Map<String, Object> whereMap) {
		String fields="";
		for(int i=0;i<selectList.size();i++) {
			fields+=selectList.get(i);
			if(i<selectList.size()-1) fields+=",";
		}
		sql="select "+fields+" from "+tableName;
		params=new ArrayList<Object>();
		if(whereMap!=null && !whereMap.isEmpty()) {
			sql+=" where ";
			int i=0;
			for (Map.Entry<String, Object> entry : whereMap.entrySet()) { 
				sql+=entry.getKey()+"=?";
				if(i<whereMap.size()-1) 
					sql+=" and ";
				params.add(entry.getValue());
				i++;
			}
		}
		List<Map<String, Object>> result=null;
		try {
			result=jdbcUtil.findMoreResult(sql, params);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}


	@Override
	public String getOfflineMerchantNOByName(String merchantName) {
		String merchantNO="";
		sql="select a.MERC_ID from PAYADM.T_URM_MINF a "
				+ "where a.MERC_CNM=? order by a.TM_SMP DESC";
		params=new ArrayList<Object>();
		params.add(merchantName);
		try {
			Map<String, Object> map=jdbcUtil.findSimpleResult(sql, params);
			merchantNO=(String)map.get("MERC_ID");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return merchantNO;
	}


}
