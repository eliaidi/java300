package com.hephec.java����;

import java.util.Arrays;

public class ArrayDeleteZero {

	/**
	 * ��������ɾ��0��Ѳ�Ϊ0����Ƶ�һ���µ�����
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
