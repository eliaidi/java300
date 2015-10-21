package com.hephec.java数组;

import java.util.Arrays;

/**
 * 数组作为方法参数的示例-数组排序
 * */
public class ArraySort2 {
	
	public static void main(String[] args) {
		int[] a={};
		sort(a);
		System.out.println(Arrays.toString(a));
	}
	
	//采用选择排序进行排序
	
	public static void sort(int[] a){
		int j,i,k,x,temp;
		for (i = 0;  i< a.length; i++) {
			x=a[i];
			k=i;
			for (j = i+1; j< a.length; j++) {
				if(a[j]<x)
				{
					x=a[j];
					k=j;
				}
			}
			temp=a[i];//a[i]与a[k]交互值
			a[i]=a[k];
			a[k]=temp;
		}
		
	}
}
