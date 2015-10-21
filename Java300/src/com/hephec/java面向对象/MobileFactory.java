package com.hephec.java面向对象;

public class MobileFactory {
	
	public static MobilePhone getPhone(String name){
		if(name.equals("Iphone6")){
			return new Iphone6();
		}
		if(name.equals("Samsung")){
			return new Samsung();
		}
		return null;
	}
}
