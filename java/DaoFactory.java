
package com.hh.common;

import java.io.IOException;
import java.util.Properties;



/**
* @author yaoxiaoxv 
* @from bs_kaoyan_plattform
* @date 2018年1月11日 下午9:58:05  
* @since JDK 1.8 
* @desc 
*
*/
public class DaoFactory {
  private static Properties pro=new Properties();
  static {
	  try {
		pro.load(Thread.currentThread().getContextClassLoader().getResourceAsStream("dao.properties"));
	} catch (IOException e) {
		e.printStackTrace();
	}
  }
  public static Object getInstance(Class clazz) {
	  Object object=null;
	  try {
	object=Class.forName(pro.getProperty(clazz.getSimpleName())).newInstance(); //获取dao.properties中类的全限定名得到Class
	} catch (InstantiationException e) {
		e.printStackTrace();
	} catch (IllegalAccessException e) {
		e.printStackTrace();
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	}
	  return object;
  }
}
  




