package com.hephec.ö�ٺͷ���;

/**
 * 	���������Ͳ����ķ��͵�Ӧ��
 * */
public class Generic<T, V> {
	T t;
	V v;
	public Generic() {
		
	}
	//���췽��Ҳ����ʹ�����������Ͳ���
	Generic(T t,V v){
		this.t=t;
		this.v=v;
	}
	//��ʾT��V����
	void printTypes(){
		System.out.println("����T�Ķ�������Ϊ:"+t.getClass().getName());
		System.out.println("����V�Ķ�������Ϊ:"+v.getClass().getName());
	}
	V getV(){
		return v;
	}
	T getT(){
		return t;
	}
	public static void main(String[] args) {
		//ָ�����Ͳ�����ʵ������
		Generic<Integer, Double> tv;
		//���췽������Ҫ�ٴ�ָ�����Ͳ���,ͬʱ���д���ʵ�ʲ���
		tv=new Generic<Integer, Double>(100, 12.45);
		tv.printTypes();
		int num=tv.getT();
		System.out.println("num�б�����ֵ:"+num);
		double dou=tv.getV();
		System.out.println("dou�б����е�ֵ:"+dou);
	}
}	
