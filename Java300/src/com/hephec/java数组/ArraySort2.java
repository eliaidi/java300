package com.hephec.java����;

import java.util.Arrays;

/**
 * ������Ϊ����������ʾ��-��������
 * */
public class ArraySort2 {
	
	public static void main(String[] args) {
		int[] a={};
		sort(a);
		System.out.println(Arrays.toString(a));
	}
	
	//����ѡ�������������
	
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
			temp=a[i];//a[i]��a[k]����ֵ
			a[i]=a[k];
			a[k]=temp;
		}
		
	}
}
