package com.hephec.ö�ٺͷ���;

import java.util.Date;

/**
 * ʹ�÷��ͷ�����ö�������
 * 
 * */
public class GenericMethod {
	//���巺�ͷ�������һ����ʽ���������Ͳ���T������
	public static <T> void genericMethods(T t,char n){
		T t1=t;
		System.out.println("t1�Ĳ�������Ϊ:"+t1.getClass().getName());
	}
	public static <T> void getnericMethods(T t){
		System.out.println("t�Ĳ�������Ϊ��"+t.getClass().getName());
	}
	public static void main(String[] args) {
		Date date=new Date();
		Character ch=new Character('a');
		GenericMethod.genericMethods(ch, 'b');
		getnericMethods(date);
		
	}
}
