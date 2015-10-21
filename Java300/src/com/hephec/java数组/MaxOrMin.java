package com.hephec.java数组;

/**
 * 编写一个方法print_MaxMin(int a[]):
 * 	打印出数组a中的最大值和最小值
 * 
 * */
public class MaxOrMin {
	
	public static int[] MaxOrMinC(int[] a){
		
		//返回的值分别存储于数组array的0号单元和1号单元
		
		int[] array=new int[2];
		int max=a[0];
		int min=a[0];
		for (int i : a) {
			if(max<i){
				max=i;
			}
			if(min>i){
				min=i;
			}
		}
		array[0]=min;
		array[1]=max;
		return array;
				
	}
	public static void main(String[] args) {
		//调用MaxOrMinC函数测试
	}
}
