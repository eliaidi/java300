package com.hephec.ö�ٺͷ���;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Reflection {

	public static void main(String[] args) {
		//��ñ�ʾö�����͵�Class����
		Class<Position> enumClass=Position.class;
		//���ö�����͵����η�
		System.out.println(Modifier.toString(enumClass.getModifiers()));
		
		//���ö�����͵ĸ���
		System.out.println(enumClass.getSuperclass());
		//���ö�������Զ��巽��
		Method[] methods=enumClass.getDeclaredMethods();
		for (Method method : methods) {
			System.out.println(method);
		}
		
		
		
	}
}
