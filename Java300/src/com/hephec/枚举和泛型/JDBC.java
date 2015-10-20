package com.hephec.枚举和泛型;

public enum JDBC {
	
	DRIVER,URL,USERNAME,PASSWORD;//定义四个枚举元素
	
	public String getJDBCEnum(JDBC jdbc){
		
		//定义方法根据不同的枚举元素返回不同的字符串
		switch(jdbc){
			case DRIVER:return "driver";//如果枚举为DRIVER,则返回"driver"
			case URL:return "url";//如果枚举为URL,则返回"url"
			case USERNAME:return "username";//如果枚举为USERNAME,则返回"username"
			case PASSWORD:return "password";//如果枚举为PASSWORD,则返回"password"
			default:return null;
		}
	}
}
