package com.hephec.java�������;

public class Customer {
	//java���ó�����ʵ�ֶ�̬����
	public static void main(String[] args) {
		System.out.println("�˿�Ҫ����IPhone6");
		MobilePhone iphone=MobileFactory.getPhone("Iphone6");
		System.out.println(iphone);
		System.out.println("�˿�Ҫ����Samsung");
		MobilePhone samsung=MobileFactory.getPhone("Samsung");
		System.out.println(samsung);
		System.out.println("����Ҫ������...");
	}
}
