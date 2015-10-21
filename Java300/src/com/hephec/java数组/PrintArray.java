package com.hephec.java数组;

/**
 * 输出二维数组中的元素，按列输出或者按行输出
 * 
 * */
public class PrintArray {

	static int[][] a={};//测试数据
	static int i,j;
	public static void main(String[] args) {
		System.out.println("按行输出：");
		for (i = 0; i < a.length; i++) {
			for (j  = 0; j < a[i].length; j++) {
				System.out.println(a[i][j]);
			}
			System.out.println();
		}
		System.out.println("按列输出:");
		for (j = 0;  j< a[0].length; j++) {
			for (i = 0;  i< a.length; i++) {
				System.out.println(a[i][j]);
			}
		}
	}
	
}
