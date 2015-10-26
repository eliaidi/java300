package com.hephec.javaIO系统;

import java.io.File;
import java.io.IOException;

/**
 * 查看文件是否存在
 * */
public class FileDemo {
	public static void main(String[] args) {
		/**
		 * 利用Java.io.File了的exists()方法，该方法用于测试
		 * File对象表示的抽象路径名表示的文件或目录是否存在
		 * */
		String str="";
		String filePath="test.txt";
		File file=new File(filePath);
		boolean isExist=file.exists();
		if(isExist){
			str="该文件存在";
			System.out.println(str);
			file.delete();
		}else{
			str="该文件不存在";
			try {
				System.out.println(str);
				file.createNewFile();
				System.out.println("创建成功");
				file.delete();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
}
