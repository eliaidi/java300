package com.hephec.java面向对象;

public class Customer {
	//java利用抽象类实现多态特性
	public static void main(String[] args) {
		System.out.println("顾客要购买IPhone6");
		MobilePhone iphone=MobileFactory.getPhone("Iphone6");
		System.out.println(iphone);
		System.out.println("顾客要购买Samsung");
		MobilePhone samsung=MobileFactory.getPhone("Samsung");
		System.out.println(samsung);
		System.out.println("不需要购买了...");
	}
}
