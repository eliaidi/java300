package com.hephec.java����;

import java.util.Arrays;

import org.junit.Test;

/**
 * ��������Ͳ�������������
 * 
 * */
public class MergeArray {
	
	//��ʼ����������
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
		
		//������a1��a2������������
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
//				//��s����Ժ�����鵥Ԫ��ֵ��������
//			}
			if(a1[i]<a2[j]){
				a3[count++]=a1[i++];
				//˵��i�ִ�������ĩβ
				if(i==a1.length-1){
					//��i==j�Ժ�����鵥Ԫ��ֵ��������
				}
			}else{
				a3[count++]=a2[j++];
				//˵��j�ִ�������ĩβ
				if(j==a2.length){
					//��j==i�Ժ�����鵥Ԫ��ֵ��������
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

