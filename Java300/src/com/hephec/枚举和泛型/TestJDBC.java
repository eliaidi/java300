package com.hephec.ö�ٺͷ���;
/**
 * ʵ��152ʹ��ö�ٽ������ݿ�����
 * 
 * */
public class TestJDBC {
	
	public static void main(String[] args) {
		//�������ö��Ԫ�ص����ƺͶ�Ӧ���ַ���
		for (JDBC jdbc : JDBC.values()) {
			System.out.println(jdbc.getJDBCEnum(jdbc));
		}
	}
}
