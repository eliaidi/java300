package com.hephec.ö�ٺͷ���;

import java.util.LinkedList;

/**
 * 	ʹ�÷���ʵ��ջ�Ľṹ
 * */
//�����������ΪT����
public class Stack<T> {
	//ʹ��T���͵����������ջ������
	private LinkedList<T> list=new LinkedList<T>();
	//ʵ����ջ���������Ԫ�صķ���
	public void push(T t){
		list.addFirst(t);
	}
	public T pop(){
		return list.removeFirst();
	}
	public boolean empty(){
		return list.isEmpty();
	}
}
