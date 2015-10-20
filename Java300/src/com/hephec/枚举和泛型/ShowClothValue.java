package com.hephec.枚举和泛型;

import java.util.Scanner;

public class ShowClothValue {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input=new Scanner(System.in);
		String type;
		Size size;
		boolean goon=true;
		System.out.println("输入衣服型号");
		while(goon){
			System.out.println("输入型号");
			type=input.nextLine().toUpperCase();
			if(type.length()>0){
				size=Enum.valueOf(Size.class,type);
				System.out.println(size.getSize());
			}
		}
	}
}
