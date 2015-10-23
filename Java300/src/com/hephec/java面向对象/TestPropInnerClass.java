package com.hephec.java面向对象;

public class TestPropInnerClass {

	public static void main(String[] args) {
		//访问成员内部类
		//先创建外部类对象
		Outer o=new Outer();
		o.add(10, 10, 10);
		//在使用new Outer().new InnerTool()语法创建
		Outer.InnerTool tool=o.new InnerTool();
		System.out.println(tool);
	}
}
