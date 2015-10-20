package com.hephec.枚举和泛型;

import java.util.Date;

/**
 * 使用泛型方法获得对象类型
 * 
 * */
public class GenericMethod {
	//定义泛型方法，有一个形式参数用类型参数T来定义
	public static <T> void genericMethods(T t,char n){
		T t1=t;
		System.out.println("t1的参数类型为:"+t1.getClass().getName());
	}
	public static <T> void getnericMethods(T t){
		System.out.println("t的参数类型为："+t.getClass().getName());
	}
	public static void main(String[] args) {
		Date date=new Date();
		Character ch=new Character('a');
		GenericMethod.genericMethods(ch, 'b');
		getnericMethods(date);
		
	}
}
