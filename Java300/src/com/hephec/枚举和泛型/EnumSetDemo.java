package com.hephec.枚举和泛型;

import java.util.EnumSet;

public class EnumSetDemo {
	public static void main(String[] args) {
		/**
		 * 	EnumSet常用的方法：
		 * 	
		 * 
		 * */
		//创建一个Weeks类型的EnumSet
		EnumSet<Weeks> week=EnumSet.noneOf(Weeks.class);
		week.add(Weeks.MON);//向Week中添加元素MON
		System.out.println("EnumSet中的元素:"+week);
		//向Week中删除元素
		week.remove(Weeks.FRI);
		System.out.println("EnumSet中的元素:"+week);
		//向EnumSet中增加week中元素的补集
		week.addAll(EnumSet.complementOf(week));
		System.out.println("EnumSet中元素:"+week);
		//删除EnumSet中从MON到THU的元素
		week.removeAll(EnumSet.range(Weeks.FRI, Weeks.SUN));
		System.out.println("EnumSet中的元素:"+week);
		
	}
}
