package com.hephec.java����;

public class TwoDimArray {
	
	/**
	 * ��ά����ļ�Ӧ��
	 * 
	 * */
	public static void main(String[] args) {
		//����ļ򵥴���
		int[][] a={{1,2,3},{4,5,6},{7,8,9}};
		int i,j,sum=0;
		//��������ʽ���
		for (i = 0; i < a.length; i++) {
			for (j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j]+"------");
			}
			System.out.println();
		}
		//�������Խ��ߵ�Ԫ��
		for (i = 0; i < a.length; i++) {
			for (j = 0; j < a[i].length; j++) {
				if(i==j){
					sum+=a[i][j];
				}
			}
		}
		System.out.println("���Խ���Ԫ��֮��:"+sum);
	}
}
