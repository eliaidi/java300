package com.hephec.ö�ٺͷ���;

import java.util.EnumMap;
/**
 * ö��Ԫ��ӳ���Ӧ��EnumMap
 * */
public class EnumMapDemo {
	
	public static void main(String[] args) {
		//����EnumMapԪ��
		EnumMap<Weeks,String> weeks=new EnumMap<Weeks,String>(Weeks.class);
		//���Ӽ�MONDAY,ֵΪ������һ��
		weeks.put(Weeks.MON, "����һ");
		//���Ӽ�FRIDAY,ֵΪ"������"
		weeks.put(Weeks.FRI, "������");
		//�鿴��ֵ�Ը���
		System.out.println("EnumMap�м�ֵ�Ը�����"+weeks.size());
		//�鿴��ֵ������
		System.out.println("EnumMap�еļ�ֵ��"+weeks);
		//EnumMap���Ƿ������SAT
		System.out.println("EnumMap���Ƿ������SAT:"+weeks.containsKey(Weeks.SAT));
		//EnumMap���Ƿ����ֵ���ڶ�
		System.out.println("EnumMap���Ƿ����ֵ���ڶ�:"+weeks.containsValue("���ڶ�"));
		//ɾ����ΪMON�ļ�ֵ��
		weeks.remove(Weeks.MON);
		System.out.println(weeks);
		//EnumMapֵFRI��Ӧ��ֵ
		System.out.println(weeks.get(Weeks.FRI));
	}
}
