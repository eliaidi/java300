package com.hephec.javaIO系统;

import java.io.File;

public class Folder {
	/**
	 * 文件夹的创建和删除操作
	 * 主要应用java.io.File类的mkdir()方法和
	 * delete()方法，他们都是静态方法，需要创建File对象
	 * 才能被调用
	 * mkdir()方法
	 * public boolean mkdir()
	 * delete()方法
	 * public boolean delete()
	 * 如果为一个目录，为空才能被删除
	 * 
	 * 注意：
	 * 当File对象表示的路径名为多级目录是，那么使用File对象
	 * 的mkdir()不能创建这个多级目录可以使用
	 * File对象的另一个方法mkdirs()
	 * */
	public static boolean FolderUtil(String fileName){
		boolean res =false;
		File file=new File(fileName);
		res=file.mkdir();
		return res;
	}
	public static boolean deleteFolder(String filePath){
		boolean res=false;
		File file=new File(filePath);
		if(file.exists()&&file.isDirectory()){
			res=file.delete();
		}
		return res;
	}
}
