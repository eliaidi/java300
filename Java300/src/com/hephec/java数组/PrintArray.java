package com.hephec.java����;

/**
 * �����ά�����е�Ԫ�أ�����������߰������
 * 
 * */
public class PrintArray {

	static int[][] a={};//��������
	static int i,j;
	public static void main(String[] args) {
		System.out.println("���������");
		for (i = 0; i < a.length; i++) {
			for (j  = 0; j < a[i].length; j++) {
				System.out.println(a[i][j]);
			}
			System.out.println();
		}
		System.out.println("�������:");
		for (j = 0;  j< a[0].length; j++) {
			for (i = 0;  i< a.length; i++) {
				System.out.println(a[i][j]);
			}
		}
	}
	
}
