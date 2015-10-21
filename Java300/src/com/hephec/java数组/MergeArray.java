package com.hephec.java数组;

import java.util.Arrays;

import org.junit.Test;

/**
 * 两个数组和并，并升序排列
 * 
 * */
public class MergeArray {
	
	//初始化两个数组
	static int[] a1=new int[]{29,4,32,43,21,76,32,0,45};
	static int[] a2=new int[]{22,14,322,43,221,76,372,30,455};
	static int[] a3=new int[a1.length+a2.length];
	
	static public int max(int i,int j){
		return ((i>=j)?i:j);
	} 
	
	@Test
	public void testMerge(){
		
	}
	public static void main(String[] args) {
		
		//对数组a1和a2进行升序排列
		Arrays.sort(a1);
		Arrays.sort(a2);
		@SuppressWarnings("unused")
		int max=Math.max(a1.length, a2.length);
		
		//boolean[] flag={false,false};
		for (int i = 0,j=0,count=0; (i<(a1.length)&&j<a2.length)&&count<(a1.length+a2.length);) {
//			int ii=0,jj=0;
//			if(ii!=0||jj!=0){
//				int mx=Math.max(ii, jj);
//				int mn=Math.min(ii, jj);
//				int s=mx-mn;
//				//将s序号以后的数组单元赋值给新数组
//			}
			if(a1[i]<a2[j]){
				a3[count++]=a1[i++];
				//说明i抵达了数组末尾
				if(i==a1.length-1){
					//将i==j以后的数组单元赋值到新数组
				}
			}else{
				a3[count++]=a2[j++];
				//说明j抵达了数组末尾
				if(j==a2.length){
					//将j==i以后的数组单元赋值到新数组
				}
			}	
//			if(i==a1.length-1||j==a2.length-1){
//				if(i>j){
//					ii=i;
//				}
//				jj=j;
//			}
		}
		System.out.println(Arrays.toString(a3));
	}
	
	}

