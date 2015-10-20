package com.hephec.枚举和泛型;

/**
 * 使用泛型实现栈结构
 * */
public class StackTest {
	
	public static void main(String[] args) {
		//指明该栈中只能保存字符串
		Stack<String> stack=new Stack<String>();
		System.out.println("向栈中增加字符串:");
		stack.push("何鹏");
		stack.push("离散");
		stack.push("何成");
		//从栈中取出字符串
		while(!stack.empty()){
			System.out.println(stack.pop());
		}
	}
}
