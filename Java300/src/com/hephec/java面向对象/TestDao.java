package com.hephec.java面向对象;

public class TestDao {
	
	/***
	 * 通过反射，获得定义Class时声明的父类的泛型参数的类型
	 * 	如public EmployeeDap extends BaseDao<Employee,String>
	 * 
	 * @param clazz:子类对应的Class对象
	 * @param index：子类继承父类时传入的泛型的索引，从0开始
	 * @return
	 */
	
	public static Class getSuperClassGenericType(Class clazz,int index){
		
		return null;
		
	}
	public static void main(String[] args) {
		Dao person=new PersonDao();
		person.save("");
	}
}
