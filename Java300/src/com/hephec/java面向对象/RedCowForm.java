package com.hephec.java�������;

public class RedCowForm {

	//ũ����
	String formName;
	//�����ڲ���Ϊ��Ա����
	RedCow redCow;
	RedCowForm(String name){
		redCow=new RedCow(10, 10, 10);
		this.formName=name;
	}
	public void showCowMess(){
		redCow.speak();
	}
	class RedCow{
		
		String cowName="��ţ";
		int height,weight,price;
		
		RedCow(int weight,int height,int price){
			this.height=height;
			this.price=price;
			this.weight=weight;
		}
		void speak(){
			System.out.println("���Ǻ�ţ:"+cowName);
		}
	}
}
