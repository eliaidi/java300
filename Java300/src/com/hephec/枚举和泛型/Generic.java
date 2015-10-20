package com.hephec.枚举和泛型;

/**
 * 	带两个类型参数的泛型的应用
 * */
public class Generic<T, V> {
	T t;
	V v;
	public Generic() {
		
	}
	//构造方法也可以使用这两个类型参数
	Generic(T t,V v){
		this.t=t;
		this.v=v;
	}
	//显示T和V类型
	void printTypes(){
		System.out.println("参数T的对象类型为:"+t.getClass().getName());
		System.out.println("参数V的对象类型为:"+v.getClass().getName());
	}
	V getV(){
		return v;
	}
	T getT(){
		return t;
	}
	public static void main(String[] args) {
		//指定类型参数的实际类型
		Generic<Integer, Double> tv;
		//构造方法中需要再次指定类型参数,同时还有传递实际参数
		tv=new Generic<Integer, Double>(100, 12.45);
		tv.printTypes();
		int num=tv.getT();
		System.out.println("num中变量的值:"+num);
		double dou=tv.getV();
		System.out.println("dou中变量中的值:"+dou);
	}
}	
