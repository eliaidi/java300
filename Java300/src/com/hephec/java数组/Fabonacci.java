package com.hephec.java数组;

import java.util.Arrays;

public class Fabonacci {
	/**
	 * 使用数组实现斐波那契数列
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
