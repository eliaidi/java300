package com.hephec.java�������;

import java.lang.reflect.Array;

/**
 * Java�����������ۺ�Ӧ��
 * 
 * Java����API
 * 	
 * 1.boolean isArray() 
          Determines if this Class object represents an array class. 
    2.Class<?> getComponentType() 
          Returns the Class representing the component type of an array. 
   
   	����Array��API
	   	Open Declaration java.lang.reflect.Array
		The Array class provides static methods to dynamically create and access Java arrays. 
		Array permits widening conversions to occur during a get or set operation, but throws an IllegalArgumentException if a narrowing conversion would occur.

    1.static Object newInstance(Class<?> componentType, int length) 
          Creates a new array with the specified component type and length. 
          
    2.static int getLength(Object array) 
          Returns the length of the specified array object, as an int. 
          
   System��API
   	1.static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length) 
          Copies an array from the specified source array, beginning at the specified position, to the specified position of the destination array. 
          
    2.      
 * */
public class DynamicArray {
	
	static Object new_array;
	public static Object increseArray(Object array){
		//��ȡ�����Class����
		Class<?> clazz=array.getClass();
		//�жϸ�clazz�Ƿ�ΪArray��ʵ��
		if(clazz.isArray()){
			//��ȡ����Ԫ�ص�����
			Class<?> compoenent=clazz.getComponentType();
			//��ȡ��������ĳ���
			int length=Array.getLength(array);
			//�½�����
			new_array=Array.newInstance(compoenent, length+5);
			//��ֵԭ�������е���������
			System.arraycopy(array, 0, new_array, 0, length);
			
		}
		return new_array;
	}
	public static void main(String[] args) {
		//���Է���������
	}
}
