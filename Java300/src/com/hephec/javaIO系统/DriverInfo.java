package com.hephec.javaIOϵͳ;

import java.io.File;

public class DriverInfo {
/**
 * ��ȡ��������Ϣ
 * 
 * ����java.io.File���listRoots()������ȡ�����������ķ������
 * listRoots()��������һ��File��������飬�������а���������������
 * ӳ������������� �﷨�ṹ��
 * public static File[] listRoots();
 * 
 * 
 * */
	public static void main(String[] args) {
		File file[]=File.listRoots();
		for (int i = 0; i < file.length; i++) {
			System.out.println((file[i].getFreeSpace()/1024)/1024/1024);
		}
		
	}
}
