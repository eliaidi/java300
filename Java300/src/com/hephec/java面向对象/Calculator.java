package com.hephec.java�������;

/**
 * ��дjava����ģ��򵥵ļ�����
 * 
 * */

/**
 * 	������ΪNumber���࣬�����������������ݳ�Աn1��n2,Ӧ����Ϊ˽�У���д���췽��������n1��
 * 	n2��ʼֵ,��Ϊ���ඨ���(addition)��(subtration)
 * 	��(multiplication),��(division)�ȹ��г�Ա����
 * �ֱ�Գ�Ա����ִ�мӣ������ˣ�������
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
		//���Է���
	}
}
