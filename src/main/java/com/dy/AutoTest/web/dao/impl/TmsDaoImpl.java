package com.dy.AutoTest.web.dao.impl;

import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.dy.AutoTest.web.actions.SingletonSet;
import com.dy.AutoTest.web.dao.TmsDao;
import com.dy.AutoTest.web.util.JdbcUtil;

public class TmsDaoImpl implements TmsDao {

	private String sql = "";
	private List<Object> params;
	private JdbcUtil jdbcUtil = SingletonSet.jdbcUtil_oracle;

	@Override
	public String getTrmNo(String trmSn) {
		String TRM_NO = "";
		try {
			sql = "select * from PAYADM.T_TMS_STKIF where TRM_SN = ?";
			params = new ArrayList<Object>();
			params.add(trmSn);
			Map<String, Object> map = jdbcUtil.findSimpleResult(sql, params);
			TRM_NO = (String) map.get("TRM_NO");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return TRM_NO;
	}

	@Override
	public Boolean hasRight(String trmNo) {
		Boolean hasExist = false;

		try {
			sql = "select count(*) as COUNTNUM from PAYADM.T_TMS_PPRV where TRM_NO = ?";
			params = new ArrayList<Object>();
			params.add(trmNo);
			Map<String, Object> map = jdbcUtil.findSimpleResult(sql, params);
			
			BigDecimal count = (BigDecimal) map.get("COUNTNUM");

			if (count.compareTo(new BigDecimal(0)) > 0) {
				hasExist = true;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return hasExist;
	}

	// TEST
	public static void main(String[] args) {
		
		TmsDao dao = new TmsDaoImpl();
		String trmNo = dao.getTrmNo("77777123");
		System.out.println(trmNo);
		
		Boolean hasExist = dao.hasRight("08000214");
		System.out.println(hasExist);
	}
	
}
