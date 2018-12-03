package com.dy.AutoTest.wagaga.impl;


import com.dy.AutoTest.wagaga.FileUtil;
import com.dy.AutoTest.wagaga.IGenerate;
import com.dy.AutoTest.web.actions.SingletonSet;

public abstract class Generator implements IGenerate{
	protected StringBuffer poContent=new StringBuffer();
	

	@Override
	public void writeFile() {
		System.out.println(poContent.toString());
		FileUtil.writeFileByByte(poContent.toString());
	}

	@Override
	public void release() {
		SingletonSet.jdbcUtil_sqlite.releaseConn();
		SingletonSet.jdbcUtil_oracle.releaseConn();
	}

}
