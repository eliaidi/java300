package com.hephec.java�������;

/**
 * ��̬�ڲ����ʵ�������Զ��Զ������ⲿ����ض�ʵ��������
 * �ڴ����ڲ����ʵ��ʱ�����ش����ⲿ���ʵ��
 * 
 * */
public class AA {
	
	private int a1;	//ʵ������
	private static int a2;//��̬����
	
	public static class BB{
		int v=a2;//�Ϸ�������ֱ�ӷ����ⲿ���A�ľ�̬����a2
		//����ͨ����AA��ʵ��ȥ���ʱ���a1
		int b3=new AA().a1;
	}
	
}
