package com.hephec.java����;

/**
 * ��дһ���ݹ鷽��inverse(int a[])������a�е�Ԫ�صߵ����
 * 	ԭ��Ϊ:(a1,a2,a3,...an)
 * 	�����(an,...a1);
 * 
 * */
public class RecInverseArr {

	//���������õݹ����
	public static void inverse(int a[],int h,int r){
		int i=h;
		int j=r;
		int temp;
		if(i<=j){
			temp=a[i];//a[i]��a[j]����ֵ
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
