package com.hephec.javaIOϵͳ;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReplaceFile {
/**
 * ����StringBuilder��׷���ַ����ķ�����String���滻�ַ����ķ���
 * append()
 * public StringBuilder append(String str);
 * ����replace()����
 * �滻�ַ���
 * public String replace(CharSequence target,CharSequence replacement)
 * target:Ҫ���滻��charֵ���У��ַ���
 * replacement���滻�����ַ���
 * @throws IOException 
 * 
 * */

	public static boolean repalceFileStr(String filePath,String src,String tar) throws IOException{
		
		FileReader fr=new FileReader(filePath);
		BufferedReader br=new BufferedReader(fr);
		char[] data=new char[1024];
		int m=0;
		StringBuilder sb=new StringBuilder();
		while((m=br.read(data))>0){
			String str=String.valueOf(data,0,m);
			sb.append(str);
		}
		fr.close();
		//�ӹ������������ַ��������滻�����ı�
		String str=sb.toString().replace(src, tar);
		@SuppressWarnings("resource")
		FileWriter fw=new FileWriter(filePath);
		fw.write(str.toCharArray());
		return true;
		
		
	}
}
