package com.hephec.java面向对象;

public class A {
	/**
	 * 实例内部类的实例自动持有外部类的实例的引用
	 * 在内部类中可以访问外部类的所有成员，包括成员变量和成员方法
	 * */
	private int a1;
	private int a2;
	private int a3;
	public A(int a1, int a2, int a3) {
		super();
		this.a1 = a1;
		this.a2 = a2;
		this.a3 = a3;
	}
	
	protected int methodA(){
		
		return a1*a2;
	}
	class B{
		int b1=a1;
		int b2=a2;
		int b3=a3;
		int b4=new A(3,4,5).methodA();
		int b5=methodA();
	}
	public static void main(String[] args) {
		A.B b=new A(1,23,3).new B();
		System.out.println(b.b1);
		System.out.println(b.b2);
	}
}
