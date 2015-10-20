package com.hephec.枚举和泛型;

import java.util.EnumMap;
/**
 * 枚举元素映射的应用EnumMap
 * */
public class EnumMapDemo {
	
	public static void main(String[] args) {
		//创建EnumMap元素
		EnumMap<Weeks,String> weeks=new EnumMap<Weeks,String>(Weeks.class);
		//增加键MONDAY,值为“星期一”
		weeks.put(Weeks.MON, "星期一");
		//增加键FRIDAY,值为"星期五"
		weeks.put(Weeks.FRI, "星期五");
		//查看键值对个数
		System.out.println("EnumMap中键值对个数："+weeks.size());
		//查看键值对内容
		System.out.println("EnumMap中的键值对"+weeks);
		//EnumMap中是否包含键SAT
		System.out.println("EnumMap中是否包含键SAT:"+weeks.containsKey(Weeks.SAT));
		//EnumMap中是否包含值星期二
		System.out.println("EnumMap中是否包含值星期二:"+weeks.containsValue("星期二"));
		//删除键为MON的键值对
		weeks.remove(Weeks.MON);
		System.out.println(weeks);
		//EnumMap值FRI对应的值
		System.out.println(weeks.get(Weeks.FRI));
	}
}
