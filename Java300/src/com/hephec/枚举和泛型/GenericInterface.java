package com.hephec.ö�ٺͷ���;

public class GenericInterface {
	public static void main(String[] args) {
		//����һ��Double���͵����鲢��ʼ��
		Double[] doubleArrays={23.0,5.3,32.3,43.1,56.4,43.0};
		//����һ��Character���͵����鲢��ʼ��
		Character[] chArrays={'a','c','z','p','q'};
		//����Double���͵�����ת������
		ComparableElement<Double>  iob=new ComparableElement<Double>(doubleArrays);
		//����Character���͵�����ת������
		ComparableElement<Character>  cob=new ComparableElement<Character>(chArrays);
		//����MaxOrMin�ӿ��е�min()��max()
		System.out.println("��Double��������Ԫ�����ֵ:"+iob.max());
		System.out.println("��Double��������Ԫ����Сֵ��"+iob.min());
		System.out.println("��Character�����������ֵ:"+cob.max());
		System.out.println("��Character����������Сֵ:"+cob.min());
		
		
	}
}
