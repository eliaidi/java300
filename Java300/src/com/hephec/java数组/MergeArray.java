package com.hephec.java����;

import java.util.Arrays;

/**
 * ��������Ͳ�������������
 * 
 * */
public class MergeArray {
	
	//��ʼ����������
	static int[] a1=new int[]{29,4,32,43,21,76,32,0,45};
	static int[] a2=new int[]{22,14,322,43,221,76,372,30,455};
	static int[] a3=new int[a1.length+a2.length];
	
	public static void main(String[] args) {
		
		//������a1��a2������������
		Arrays.sort(a1);
		Arrays.sort(a2);
		int max=Math.max(a1.length, a2.length);
		
		for (int i = 0,j=0,count=0; (i<a1.length&&j<a2.length)&&count<(a1.length+a2.length);) {
			if(a1[i]<a2[j]){
				a3[count++]=a1[i];
				i++;
			}else{
				a3[count++]=a2[j];
				j++;
			}	
			}
		System.out.println(Arrays.toString(a3));
	}
	
	}

