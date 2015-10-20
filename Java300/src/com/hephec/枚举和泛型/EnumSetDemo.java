package com.hephec.ö�ٺͷ���;

import java.util.EnumSet;

public class EnumSetDemo {
	public static void main(String[] args) {
		/**
		 * 	EnumSet���õķ�����
		 * 	
		 * 
		 * */
		//����һ��Weeks���͵�EnumSet
		EnumSet<Weeks> week=EnumSet.noneOf(Weeks.class);
		week.add(Weeks.MON);//��Week�����Ԫ��MON
		System.out.println("EnumSet�е�Ԫ��:"+week);
		//��Week��ɾ��Ԫ��
		week.remove(Weeks.FRI);
		System.out.println("EnumSet�е�Ԫ��:"+week);
		//��EnumSet������week��Ԫ�صĲ���
		week.addAll(EnumSet.complementOf(week));
		System.out.println("EnumSet��Ԫ��:"+week);
		//ɾ��EnumSet�д�MON��THU��Ԫ��
		week.removeAll(EnumSet.range(Weeks.FRI, Weeks.SUN));
		System.out.println("EnumSet�е�Ԫ��:"+week);
		
	}
}
