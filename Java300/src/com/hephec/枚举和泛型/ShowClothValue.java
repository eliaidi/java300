package com.hephec.ö�ٺͷ���;

import java.util.Scanner;

public class ShowClothValue {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input=new Scanner(System.in);
		String type;
		Size size;
		boolean goon=true;
		System.out.println("�����·��ͺ�");
		while(goon){
			System.out.println("�����ͺ�");
			type=input.nextLine().toUpperCase();
			if(type.length()>0){
				size=Enum.valueOf(Size.class,type);
				System.out.println(size.getSize());
			}
		}
	}
}
