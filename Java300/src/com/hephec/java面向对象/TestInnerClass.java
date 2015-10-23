package com.hephec.java面向对象;

public class TestInnerClass {

	public static void main(String[] args) {
		
		TestInnerClass.Cat cat=new TestInnerClass().getCat();
		//直接调用静态内部类的构造器通过外部类而不创建内部类实例
		TestInnerClass.Cat cc=new TestInnerClass.Cat("张三");
		System.out.println(cc);
		TestInnerClass.Dog dog=new TestInnerClass().getDog();
		System.out.println(cat.name);
		System.out.println(dog.name);
		
		new TestInnerClass.Cat("zz");
		new TestInnerClass();
		
	}
	//说明在外部类的方法中可以造成员内部类对象
	public Dog getDog(){
		
		return new Dog("pitter");
	}
	//说明在外部类的方法中可以造静态内部类对象
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
