package com.hephec.枚举和泛型;
/**
 * 实例152使用枚举进行数据库连接
 * 
 * */
public class TestJDBC {
	
	public static void main(String[] args) {
		//变量输出枚举元素的名称和对应的字符串
		for (JDBC jdbc : JDBC.values()) {
			System.out.println(jdbc.getJDBCEnum(jdbc));
		}
	}
}
