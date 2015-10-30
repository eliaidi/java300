package com.hephec.javaIO系统;

import java.io.File;
import java.io.FileFilter;

import org.junit.Test;

public class DirInfo {
	
	@Test
	public void test(){
		
	}

	//可以使用File类的方法创建一个目录,如果该目录有子目录和文件，可以列出该目录下的子目录和文件，还可以列出指定类型的文件
	
	static class MyFilenameFilter implements FileFilter{
		private String sf="";//定义文件的后缀名
		public MyFilenameFilter(String surfix){
			//以构造方法为sf赋值
			this.sf=surfix;
		}
		//判断指定的文件是否在指定的目录中
		@Override
		public boolean accept(File pathname) {
			if(pathname.isFile()){
				return pathname.getName().endsWith(sf);
			}
			return true;
		}
		
	}
	public static void getAllFiles(String dirName){
		//列出指定目录下所有文件和子目录的路径
		
	}
	
}

