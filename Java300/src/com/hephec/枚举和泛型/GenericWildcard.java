package com.hephec.ö�ٺͷ���;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * ʹ��ͨ�����ǿ����
 * */
public class GenericWildcard {
	
	public static Object getMiddle(List<? extends Number> list){
		return list.get(list.size()/2);
		//�����б��м�ֵ
	}
	public static void main(String[] args) {
		
		List<Integer> ints=new ArrayList<Integer>();//����һ�����β������б���в���
		ints.add(1);//���б�������Ԫ��
		ints.add(2);
		ints.add(3);
		System.out.println("�����б�:");
		System.out.println(Arrays.toString(ints.toArray()));//����б��е�ȫ��Ԫ��
		System.out.println("�����б���м�����"+getMiddle(ints));
		List<Double> doubles=new ArrayList<Double>();
		//����һ�������Ͳ������б���в���
		doubles.add(1.1);
		doubles.add(1.2);
		doubles.add(1.3);
		System.out.println("�����б��Ԫ�أ�");
		System.out.println(Arrays.toString(doubles.toArray()));
		System.out.println("�����б���м�����"+getMiddle(doubles));
		
		
		
	}
}
