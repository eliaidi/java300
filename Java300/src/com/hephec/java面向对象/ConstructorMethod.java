package com.hephec.java�������;

/**
 * ��дjava����,������ʾ�˵�����������
 * ����һ��Person�࣬������Ӧ��������˽�����ԣ�����name,������age
 * ���幹�췽����������ʼ�����ݳ�Ա���ڶ�����ʾ(display)�����������������ӡ����
 * 
 * */
public class ConstructorMethod {
	
	public static void main(String[] args) {
		//���Է���
	}
	
}
class Person{
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String display(){
		
		return new StringBuilder().append("[").append("name:"+name).append("age:"+age).append("]").toString();
	}
}
