package com.hephec.java����;

import java.util.Arrays;

public class StatisticGrade {

	/**
	 * ��һ��ѧ���İٷ��Ƴɼ����ֱ�ͳ�Ƴ�100�֣�90-99�֣�80-89��...0-9�ֵ�����
	 * 
	 * */
	public static void main(String[] args) {
		int[] score={90,45,43,75,8,56,65,90,89,100,100};
		int[] counter=new int[11];
		
		for (int i = 0; i < counter.length; i++) {
			counter[i]=0;
		}
		//���������κ�������ŵ�ӳ���ϵ
		for (int i = 0; i < score.length; i++) {
			counter[score[i]/10]++;
		}
		System.out.println(Arrays.toString(counter));
	}
}
