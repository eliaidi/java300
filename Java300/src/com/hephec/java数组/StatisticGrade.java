package com.hephec.java数组;

import java.util.Arrays;

public class StatisticGrade {

	/**
	 * 对一组学生的百分制成绩，分别统计出100分，90-99分，80-89分...0-9分的人数
	 * 
	 * */
	public static void main(String[] args) {
		int[] score={90,45,43,75,8,56,65,90,89,100,100};
		int[] counter=new int[11];
		
		for (int i = 0; i < counter.length; i++) {
			counter[i]=0;
		}
		//建立分数段和数组序号的映射关系
		for (int i = 0; i < score.length; i++) {
			counter[score[i]/10]++;
		}
		System.out.println(Arrays.toString(counter));
	}
}
