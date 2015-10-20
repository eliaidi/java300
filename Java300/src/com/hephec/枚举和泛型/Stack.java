package com.hephec.枚举和泛型;

import java.util.LinkedList;

/**
 * 	使用泛型实现栈的结构
 * */
//定义参数类型为T的类
public class Stack<T> {
	//使用T类型的链表保存存入栈的数据
	private LinkedList<T> list=new LinkedList<T>();
	//实现向栈中添加数据元素的方法
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
