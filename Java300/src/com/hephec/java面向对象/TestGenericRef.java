package com.hephec.java面向对象;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

public class TestGenericRef {
	/**
	 * Java通过指定类对应的Class对象，程序可以获得该类里包括的所有Field,不管该Field使用private修饰，还是public修饰
	 * 获得Filed对象后，就可以很容易的获得该Filed的数据类型，例如羡慕代码便是获得该Field对象field类型
	 * Class<?> type=filed.getType();
	 *	但是通过这只中方法只是对普通类型的Field有效，如果该Field的类型是由泛型限制的类型，如Map<String,Integer>类型，则不能准确
	 *	Filed的泛型参数
	 *	为了获得指定的Field的泛型类型，应该使用如下方法来获取指定Filed的泛型类型
	 *	Type type=field.getGenericType();
	 *	然后将Type对象强制类型转换成ParameterizedType对象，
	 *	ParameterizedType代表参数化的类型，也就是增加了泛型限制的类型
	 *	ParameterizedType类提供了两个方法：
	 *	1.getRawType():返回被泛型限制的类型
	 *	2.getActualTypeArguments():返回泛型参数类型
	 *	
	 * */
	
	//具体实例
	
	@SuppressWarnings("unused")
	private Map<String,Integer> map=new HashMap<String,Integer>();
	
	public static void main(String[] args) throws Exception, SecurityException {
		//获取Class实例
		Class<TestGenericRef> clazz=TestGenericRef.class;
		
		//根据属性名取得该属性对应Field对应的Filed对象
		Field mapFiled=clazz.getDeclaredField("map");
		
		//示例第一个方法，直接通过getType()取出Field的类型，只对普通类型的Field类型有效
		Class<?> mapClazz=mapFiled.getType();
		System.out.println("属性名为map的属性类型为："+mapClazz);
		
		//示例第二种方法
		Type mapMainType=mapFiled.getGenericType();
		
		//为了确保按安全转换，使用instanceof
		if(mapMainType instanceof ParameterizedType){
		
			//执行强制类型转换
			ParameterizedType parameterziedType=(ParameterizedType) mapMainType;
			
			//获取基本类型信息，即Map
			Type basicType=parameterziedType.getRawType();
			System.out.println("基本类型为："+basicType);
			
			//获取泛型类型的泛型参数
			Type[] types=parameterziedType.getActualTypeArguments();
			
			for (int i = 0; i < types.length; i++) {
				System.out.println("第"+i+"个泛型参数类型"+types[i]);
			}
		}
	}
}
