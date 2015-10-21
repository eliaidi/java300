package com.hephec.java数组;

public class TwoDimArray {
	
	/**
	 * 二维数组的简单应用
	 * 
	 * */
	public static void main(String[] args) {
		//矩阵的简单处理
		int[][] a={{1,2,3},{4,5,6},{7,8,9}};
		int i,j,sum=0;
		//按矩阵形式输出
		for (i = 0; i < a.length; i++) {
			for (j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j]+"------");
			}
			System.out.println();
		}
		//计算正对角线的元素
		for (i = 0; i < a.length; i++) {
			for (j = 0; j < a[i].length; j++) {
				if(i==j){
					sum+=a[i][j];
				}
			}
		}
		System.out.println("正对角线元素之和:"+sum);
	}
}
