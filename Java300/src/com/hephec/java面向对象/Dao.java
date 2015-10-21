package com.hephec.java面向对象;

public class Dao<T> {
	
	private Class<T> clazz;
	
	//从数据库中取出对象
	T get(Integer id){
		System.out.println(clazz);
		return null;
	}
	//获取时需要使用T泛型类型去创建相应的对象
	
	
	
	void save(T t){
		//保存到数据库中
	}
}
