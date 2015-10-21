package com.hephec.java面向对象;

import java.lang.reflect.Array;

/**
 * Java反射和数组的综合应用
 * 
 * Java反射API
 * 	
 * 1.boolean isArray() 
          Determines if this Class object represents an array class. 
    2.Class<?> getComponentType() 
          Returns the Class representing the component type of an array. 
   
   	反射Array类API
	   	Open Declaration java.lang.reflect.Array
		The Array class provides static methods to dynamically create and access Java arrays. 
		Array permits widening conversions to occur during a get or set operation, but throws an IllegalArgumentException if a narrowing conversion would occur.

    1.static Object newInstance(Class<?> componentType, int length) 
          Creates a new array with the specified component type and length. 
          
    2.static int getLength(Object array) 
          Returns the length of the specified array object, as an int. 
          
   System类API
   	1.static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length) 
          Copies an array from the specified source array, beginning at the specified position, to the specified position of the destination array. 
          
    2.      
 * */
public class DynamicArray {
	
	static Object new_array;
	public static Object increseArray(Object array){
		//获取数组的Class对象
		Class<?> clazz=array.getClass();
		//判断该clazz是否为Array类实例
		if(clazz.isArray()){
			//获取数组元素的类型
			Class<?> compoenent=clazz.getComponentType();
			//获取输入数组的长度
			int length=Array.getLength(array);
			//新建数组
			new_array=Array.newInstance(compoenent, length+5);
			//赋值原来数组中的所有数据
			System.arraycopy(array, 0, new_array, 0, length);
			
		}
		return new_array;
	}
	public static void main(String[] args) {
		//测试方法。。。
	}
}
