package com.hephec.java�������;

public class TestPropInnerClass {

	public static void main(String[] args) {
		//���ʳ�Ա�ڲ���
		//�ȴ����ⲿ�����
		Outer o=new Outer();
		o.add(10, 10, 10);
		//��ʹ��new Outer().new InnerTool()�﷨����
		Outer.InnerTool tool=o.new InnerTool();
		System.out.println(tool);
	}
}
