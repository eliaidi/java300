package com.hephec.ö�ٺͷ���;

/**
 * ʹ�÷���ʵ��ջ�ṹ
 * */
public class StackTest {
	
	public static void main(String[] args) {
		//ָ����ջ��ֻ�ܱ����ַ���
		Stack<String> stack=new Stack<String>();
		System.out.println("��ջ�������ַ���:");
		stack.push("����");
		stack.push("��ɢ");
		stack.push("�γ�");
		//��ջ��ȡ���ַ���
		while(!stack.empty()){
			System.out.println(stack.pop());
		}
	}
}
