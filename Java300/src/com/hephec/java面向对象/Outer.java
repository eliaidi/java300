package com.hephec.java面向对象;

public class Outer {

	//成员内部类
	public class InnerTool{
		public int add(int a,int b){
			return a+b;
		}
		
	}
	//内部创建内部类对象
	private InnerTool tool=new InnerTool();
	
	public int add(int a,int b,int c){
		//调用内部类的add方法
		return tool.add(tool.add(a, b), c);
	}
	
}
