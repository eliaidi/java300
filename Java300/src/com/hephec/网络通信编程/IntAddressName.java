package com.hephec.����ͨ�ű��;
/**
 * ʵ��256��ȡ�Լ��ļ��������IP��ַ
 * 
 * */
import java.net.InetAddress;
import java.net.UnknownHostException;

public class IntAddressName {
	
	public static void main(String[] args) throws UnknownHostException {
		//ͨ������������IP��ַ��������ת��Ϊ�ַ�������
		InetAddress ind=InetAddress.getLocalHost();
		
		System.out.println("��������IP��ַ��"+ind.toString());
		//ͨ��IP��ַ��ü��������
		System.out.println("�������ƣ�"+ind.getHostName());
		
	}
}
