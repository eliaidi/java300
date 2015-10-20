package com.hephec.枚举和泛型;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Reflection {

	public static void main(String[] args) {
		//获得表示枚举类型的Class对象
		Class<Position> enumClass=Position.class;
		//获得枚举类型的修饰符
		System.out.println(Modifier.toString(enumClass.getModifiers()));
		
		//获得枚举类型的父类
		System.out.println(enumClass.getSuperclass());
		//获得枚举类型自定义方法
		Method[] methods=enumClass.getDeclaredMethods();
		for (Method method : methods) {
			System.out.println(method);
		}
		
		
		
	}
}
