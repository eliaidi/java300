package com.hephec.javaIOϵͳ;

import java.io.File;
import java.io.IOException;

/**
 * �鿴�ļ��Ƿ����
 * */
public class FileDemo {
	public static void main(String[] args) {
		/**
		 * ����Java.io.File�˵�exists()�������÷������ڲ���
		 * File�����ʾ�ĳ���·������ʾ���ļ���Ŀ¼�Ƿ����
		 * */
		String str="";
		String filePath="test.txt";
		File file=new File(filePath);
		boolean isExist=file.exists();
		if(isExist){
			str="���ļ�����";
			System.out.println(str);
			file.delete();
		}else{
			str="���ļ�������";
			try {
				System.out.println(str);
				file.createNewFile();
				System.out.println("�����ɹ�");
				file.delete();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
}
