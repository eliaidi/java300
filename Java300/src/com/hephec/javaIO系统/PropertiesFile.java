package com.hephec.javaIO系统;

public class PropertiesFile {
/**
 * java提供了Properties类来操作存储信息的属性文件，属性
 * 文件以键值对的方式存储
 * 同时应用java.io.FileInputStream类和
 * java.util.Properties类
 * FileInputStream对象表示文件输入流对象，它将文件内容以流的形式读取到内存中，
 * Properties类表示一个持久的属性集，它可保存在流中红获取从流中加载
 * Properties类的常用方法及说明
 * public String getProperty(String key)
 * public void load(InputStream inStream)
 * public void load(Reader reader)
 * public Object setProperty(String key,String value)
 * public Enumeration<?> propertyNames()
 * public void loadFromXML(InputStream in)
 * public long length()
 * */
	public static void main(String[] args) {
		/**
		 * 
		 * FileInputStream fis=new FileInputStream(application.getRealPath(conDB.properties));
		 * Properties prop=new Properties();
		 * properties.load(fis);
		 * 
		 * */
		//读取文件信息时，除了应用取得字节流的java.io.FileInputStream类以外还可以使用
		//java.io.BufferedReader类和java.io.FileReader类都是Reader抽象类的子类
	}
}
