package com.hephec.java����;

import java.util.Arrays;

public class Fabonacci {
	/**
	 * ʹ������ʵ��쳲���������
	 * 
	 * */
	public static void main(String[] args) {
		int[] array=new int[41];
		array[0]=array[1]=1;
		for (int i = 2; i < array.length; i++) {
			array[i]=array[i-1]+array[i-2];
		}
		System.out.println(Arrays.toString(array));
	}
}
