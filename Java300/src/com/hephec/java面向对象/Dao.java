package com.hephec.java�������;

public class Dao<T> {
	
	private Class<T> clazz;
	
	//�����ݿ���ȡ������
	T get(Integer id){
		System.out.println(clazz);
		return null;
	}
	//��ȡʱ��Ҫʹ��T��������ȥ������Ӧ�Ķ���
	
	
	
	void save(T t){
		//���浽���ݿ���
	}
}
