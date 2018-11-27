package com.dy.AutoTest.web.business;

import static org.testng.Assert.assertTrue;

import java.util.List;
import java.util.Map;


import com.dy.AutoTest.web.beans.LocatorBean;
import com.dy.AutoTest.web.dao.TestingDao;
import com.dy.AutoTest.web.dao.impl.TestingDaoImpl;
import com.dy.AutoTest.web.util.BaseUtil;

public class LocatorBusiness {
	private List<Map<String, Object>> list;
	private List<Object> list2;
	private Map<String, Object> map;
	private TestingDao testingDao=new TestingDaoImpl();;
	
	public LocatorBusiness(String tableName) {
		testingDao=new TestingDaoImpl();
		list=testingDao.getLocator(tableName);
	}
	
	public LocatorBusiness() {
		
	}
	
	public String getXPath(String elementName) {
		String xPath="";
		int i;
		for(i=0;i<list.size();i++) {
			map=list.get(i);
			if(map.get("ElementName").equals(elementName)){
				xPath= (String)map.get("XPath");
				break;
			}
		}
		if(i==list.size()) { 
//			System.out.println(Thread.currentThread() .getStackTrace()[1].getClassName()+
//					"."+Thread.currentThread().getStackTrace()[1].getMethodName()+": ElementName: "+elementName+" in table is not exist! Please check!");
			System.out.println("LocatorBusiness.getXPath: ElementName("+elementName+") in table is not exist! Please check!");
		}else if (xPath.equals("")) {
			System.out.println("Element XPath is null!");
		}
		return xPath;
	}
	public String getCSS(String elementName) {
		String CSS="";
		int i;
		for(i=0;i<list.size();i++) {
			map=list.get(i);
			if(map.get("ElementName").equals(elementName)
					&& !map.get("CSS").equals("")){
				CSS= (String)map.get("CSS");
				break;
			}
		}
		if(i==list.size()) {
//			System.out.println(Thread.currentThread() .getStackTrace()[1].getClassName()+
//					"."+Thread.currentThread().getStackTrace()[1].getMethodName()+"ElementName: "+elementName+" in table is not exist! Please check!");
			System.out.println("LocatorBusiness.getCSS: ElementName("+elementName+") in table is not exist! Please check!");
		}else if (CSS.equals("")) {
			System.out.println("Element CSS is null!");
		}
		return CSS;
	}
	
	public void loadLocatorBeanList(String tableName) {
			list2=BaseUtil.toObject(testingDao.getDataList(tableName,LocatorBean.class));
	}
	
	
	public Object[][] getLocatorBeanArray() {
		if(list2==null) {
			System.out.println("LocatorBeanList is null! Please check!");
			assertTrue(false);
		}
		Object[][] results=new Object[list2.size()][1];
		for (int i=0;i<list2.size();i++) {
			results[i][0]=list2.get(i);
		}
		return results;
	}
	
}
