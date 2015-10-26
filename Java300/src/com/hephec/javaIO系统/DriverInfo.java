package com.hephec.javaIO系统;

import java.io.File;

public class DriverInfo {
/**
 * 获取驱动器信息
 * 
 * 利用java.io.File类的listRoots()方法获取磁盘驱动器的分配情况
 * listRoots()方法返回一个File对象的数组，该数组中包含所有驱动器和
 * 映射的网络驱动器 语法结构：
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
