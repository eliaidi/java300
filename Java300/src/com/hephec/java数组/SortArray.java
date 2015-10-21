package com.hephec.java数组;

import java.util.Arrays;

public class SortArray {
	/**
	 * 一维数组的排序(非递减)
	 * 
	 * */
	static int[] a={39,645,43,21,75,46,87,6745,39,645,43,21,75,46,87,6745,39,645,43,21,75,46,87,6745,39,645,43,21,75,46,87,6745};
	
	static int i,j,k,x,temp;
	
	public static void main(String[] args) {
		
		for (int i = 0; i < a.length-1; i++) {
			//记住数组的元素
			x=a[i];
			//记住数组的下标
			k=i;
			for (int j = i+1; j < a.length; j++) {
				if(a[j]<x){
					//从i的后一个位置向前比,小的 话，交换
					//不进行交换，只是保存在临时变量x中，记住每一遍扫描的最小元素
					x = a[j];
					//k记住最小的序号
					k=j;
				}
			}
			//第一趟比较完成，进行交换
			temp=a[i];
			a[i]=a[k];
			a[k]=temp;
		}
	System.out.println(Arrays.toString(a));
	}
}
