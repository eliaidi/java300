package com.hephec.java����;

/**
 * ��дһ������print_MaxMin(int a[]):
 * 	��ӡ������a�е����ֵ����Сֵ
 * 
 * */
public class MaxOrMin {
	
	public static int[] MaxOrMinC(int[] a){
		
		//���ص�ֵ�ֱ�洢������array��0�ŵ�Ԫ��1�ŵ�Ԫ
		
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
		//����MaxOrMinC��������
	}
}
