package com.hephec.java�������;

public class TestInnerClass {

	public static void main(String[] args) {
		
		TestInnerClass.Cat cat=new TestInnerClass().getCat();
		//ֱ�ӵ��þ�̬�ڲ���Ĺ�����ͨ���ⲿ����������ڲ���ʵ��
		TestInnerClass.Cat cc=new TestInnerClass.Cat("����");
		System.out.println(cc);
		TestInnerClass.Dog dog=new TestInnerClass().getDog();
		System.out.println(cat.name);
		System.out.println(dog.name);
		
		new TestInnerClass.Cat("zz");
		new TestInnerClass();
		
	}
	//˵�����ⲿ��ķ����п������Ա�ڲ������
	public Dog getDog(){
		
		return new Dog("pitter");
	}
	//˵�����ⲿ��ķ����п����쾲̬�ڲ������
	public Cat getCat(){
		
		return new Cat("kitty");
	}
	public class Dog{
		String name;
		Dog(String name){
			this.name=name;
			System.out.println(name);
		}
	}
	static class Cat{
		private String name;
		Cat(String name){
			this.name=name;
			System.out.println(name);
		}
	}
}
