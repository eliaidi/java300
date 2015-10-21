package com.hephec.java数组;

import java.util.Arrays;

public class ArrayDeleteZero {

	/**
	 * 从数组中删除0项，把不为0的项复制到一个新的数组
	 * 
	 * */
	
	static int[] array=new int[]{1,2,0,4,0,5,3,0,0,0,3,0};
	static int[] new_array=new int[array.length];
	
	public static void main(String[] args) {
		for (int i = 0,j=0; i < array.length; i++) {
			if(array[i]==0){
				continue;
			}else{
				new_array[j++]=array[i];
			}
		}
		System.out.println(Arrays.toString(new_array));
	}
}
