package com.hephec.java数组;

/**
 * 编写一个递归方法inverse(int a[])将数组a中的元素颠倒存放
 * 	原来为:(a1,a2,a3,...an)
 * 	处理后：(an,...a1);
 * 
 * */
public class RecInverseArr {

	//本方法采用递归调用
	public static void inverse(int a[],int h,int r){
		int i=h;
		int j=r;
		int temp;
		if(i<=j){
			temp=a[i];//a[i]与a[j]交换值
			a[i]=a[j];
			a[j]=temp;
			i++;
			j--;
			inverse(a, i, j);
		}
	}
	public static void main(String[] args) {
		
	}
}
