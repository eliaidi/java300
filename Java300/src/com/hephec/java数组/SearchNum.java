package com.hephec.java����;

import java.io.Serializable;

/**
 * 	��дһ������search(int a[],int x):
 *	 ������a�д���ֵΪx��Ԫ�أ��򷵻ظ�Ԫ�ص��±�ֵ�����򷵻�-1
 * 
 * */
public class SearchNum {

	public static int search(int[] a,int x){
		int counter=-1;
		for (int i : a) {
			counter++;
			if(i==x){
				return counter;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		//���ø÷���
}
}
