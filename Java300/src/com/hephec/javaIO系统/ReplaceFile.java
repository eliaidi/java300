package com.hephec.javaIO系统;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReplaceFile {
/**
 * 利用StringBuilder类追加字符串的方法和String类替换字符串的方法
 * append()
 * public StringBuilder append(String str);
 * 利用replace()方法
 * 替换字符串
 * public String replace(CharSequence target,CharSequence replacement)
 * target:要被替换的char值序列，字符串
 * replacement：替换的新字符串
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
		//从构造器中生成字符串，并替换搜索文本
		String str=sb.toString().replace(src, tar);
		@SuppressWarnings("resource")
		FileWriter fw=new FileWriter(filePath);
		fw.write(str.toCharArray());
		return true;
		
		
	}
}
