package com.hephec.java数组;

import java.io.Serializable;

/**
 * 	编写一个方法search(int a[],int x):
 *	 若数组a中存在值为x的元素，则返回该元素的下标值，否则返回-1
 * 
 * */
public class SearchNum {

	public static int search(int[] a,int x){
		int counter=-1;
		for (int i : a) {
			counter++;
			if(i==x){
				return counter;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		//调用该方法
}
}
