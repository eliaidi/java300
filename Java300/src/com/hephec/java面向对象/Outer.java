package com.hephec.java�������;

public class Outer {

	//��Ա�ڲ���
	public class InnerTool{
		public int add(int a,int b){
			return a+b;
		}
		
	}
	//�ڲ������ڲ������
	private InnerTool tool=new InnerTool();
	
	public int add(int a,int b,int c){
		//�����ڲ����add����
		return tool.add(tool.add(a, b), c);
	}
	
}
