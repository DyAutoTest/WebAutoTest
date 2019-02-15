package com.dy.AutoTest.web.dao;

public interface TmsDao {
	
	String getTrmNo(String trmSn);
	Boolean hasRight(String trmNo);
	
}
