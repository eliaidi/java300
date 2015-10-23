package com.hephec.java面向对象;

public class RedCowForm {

	//农场名
	String formName;
	//声明内部类为成员变量
	RedCow redCow;
	RedCowForm(String name){
		redCow=new RedCow(10, 10, 10);
		this.formName=name;
	}
	public void showCowMess(){
		redCow.speak();
	}
	class RedCow{
		
		String cowName="红牛";
		int height,weight,price;
		
		RedCow(int weight,int height,int price){
			this.height=height;
			this.price=price;
			this.weight=weight;
		}
		void speak(){
			System.out.println("我是红牛:"+cowName);
		}
	}
}
