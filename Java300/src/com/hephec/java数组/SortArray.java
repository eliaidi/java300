package com.hephec.java����;

import java.util.Arrays;

public class SortArray {
	/**
	 * һά���������(�ǵݼ�)
	 * 
	 * */
	static int[] a={39,645,43,21,75,46,87,6745,39,645,43,21,75,46,87,6745,39,645,43,21,75,46,87,6745,39,645,43,21,75,46,87,6745};
	
	static int i,j,k,x,temp;
	
	public static void main(String[] args) {
		
		for (int i = 0; i < a.length-1; i++) {
			//��ס�����Ԫ��
			x=a[i];
			//��ס������±�
			k=i;
			for (int j = i+1; j < a.length; j++) {
				if(a[j]<x){
					//��i�ĺ�һ��λ����ǰ��,С�� ��������
					//�����н�����ֻ�Ǳ�������ʱ����x�У���סÿһ��ɨ�����СԪ��
					x = a[j];
					//k��ס��С�����
					k=j;
				}
			}
			//��һ�˱Ƚ���ɣ����н���
			temp=a[i];
			a[i]=a[k];
			a[k]=temp;
		}
	System.out.println(Arrays.toString(a));
	}
}
