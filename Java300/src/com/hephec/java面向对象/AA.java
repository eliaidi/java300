package com.hephec.java面向对象;

/**
 * 静态内部类的实例不会自动自动持有外部类的特定实例的引用
 * 在创建内部类的实例时，不必创建外部类的实例
 * 
 * */
public class AA {
	
	private int a1;	//实例变量
	private static int a2;//静态变量
	
	public static class BB{
		int v=a2;//合法，可以直接访问外部类的A的静态变量a2
		//可以通过类AA的实例去访问变量a1
		int b3=new AA().a1;
	}
	
}
