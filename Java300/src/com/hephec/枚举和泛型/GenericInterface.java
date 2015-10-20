package com.hephec.枚举和泛型;

public class GenericInterface {
	public static void main(String[] args) {
		//创建一个Double类型的数组并初始化
		Double[] doubleArrays={23.0,5.3,32.3,43.1,56.4,43.0};
		//创建一个Character类型的数组并初始化
		Character[] chArrays={'a','c','z','p','q'};
		//创建Double类型的类型转换对象
		ComparableElement<Double>  iob=new ComparableElement<Double>(doubleArrays);
		//创建Character类型的类型转换对象
		ComparableElement<Character>  cob=new ComparableElement<Character>(chArrays);
		//调用MaxOrMin接口中的min()和max()
		System.out.println("在Double数组中求元素最大值:"+iob.max());
		System.out.println("在Double数组中秋元素最小值："+iob.min());
		System.out.println("在Character数组中求最大值:"+cob.max());
		System.out.println("在Character数组中求最小值:"+cob.min());
		
		
	}
}
