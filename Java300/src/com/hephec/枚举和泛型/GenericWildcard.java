package com.hephec.枚举和泛型;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 使用通配符增强泛型
 * */
public class GenericWildcard {
	
	public static Object getMiddle(List<? extends Number> list){
		return list.get(list.size()/2);
		//返回列表中间值
	}
	public static void main(String[] args) {
		
		List<Integer> ints=new ArrayList<Integer>();//创建一个整形参数的列表进行测试
		ints.add(1);//在列表中增加元素
		ints.add(2);
		ints.add(3);
		System.out.println("整形列表:");
		System.out.println(Arrays.toString(ints.toArray()));//输出列表中的全部元素
		System.out.println("整形列表的中间数："+getMiddle(ints));
		List<Double> doubles=new ArrayList<Double>();
		//创建一个浮点型参数的列表进行测试
		doubles.add(1.1);
		doubles.add(1.2);
		doubles.add(1.3);
		System.out.println("浮点列表的元素：");
		System.out.println(Arrays.toString(doubles.toArray()));
		System.out.println("浮点列表的中间数："+getMiddle(doubles));
		
		
		
	}
}
