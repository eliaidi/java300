package com.hephec.java面向对象;

/**
 * 编写java程序，模拟简单的计算器
 * 
 * */

/**
 * 	定义名为Number的类，其中有两个整形数据成员n1和n2,应声明为私有，编写构造方法，赋予n1和
 * 	n2初始值,再为该类定义加(addition)减(subtration)
 * 	乘(multiplication),除(division)等公有成员方法
 * 分别对成员变量执行加，减，乘，除运算
 * 
 * */

public class Calculator {

	private double n1;
	private double n2;
	
	public double getN1() {
		return n1;
	}

	public void setN1(double n1) {
		this.n1 = n1;
	}

	public double getN2() {
		return n2;
	}

	public void setN2(double n2) {
		this.n2 = n2;
	}

	public double addition(double n1,double n2){
		return n1+n2;
	}
	public double subtraction(double n1,double n2){
		return n1-n2;
	}
	
	public double multiplication(double n1,double n2){
		return n1*n2;
	}
	public double division(double n1,double n2){
		return n1/n2;
	}
	
	public static void main(String[] args) {
		//测试方法
	}
}
