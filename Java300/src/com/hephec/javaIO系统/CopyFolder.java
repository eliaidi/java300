package com.hephec.javaIO系统;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 复制文件夹
 * 包括文件夹下的子文件夹和文件
 * 利用java.io.FileInputStream类和java.io.FileOutputStream类来
 * 实现文件夹的复制，首先通过File对象中的listFiles()方法获取文件夹路径下所有的文件对象数组
 * 然后循环文件对象数组，通过FileInputStream类读取文件内容，最后通过
 * FileOutputStream类将读出的文件内容写到目标文件夹中
 * 
 * */

/**
 * <%
 * 	File sourFolder=null,targetFolder=null;
 * String source=request.getParameter("sourceFolder");//获取用户输入的源文件地址
 * String target=request.getParameter("targetFolder");//获取用户输入的目标文件夹地址
 * if(source!=null){
 * 		sourceFolder=new File(source);//创建源文件夹对象
 * 		if(!sourceFolder.isDirectory||!sourceFolder.exists()){
 * 			out.println("<script type='text/javascript'>alert('源文件夹不存在');</script>");
 * }
 * }
 * 	if(target!=null){
 * 		targetFolder=new File(target);
 * 		if(!targetFolder.exists()){
 * 			out.println("<script>alert('目标文件夹不存在');</script>");
 * }else{
 * 		//调用复制文件夹的方法
 * 		copy(sourceFolder.listFiles(),targetFolder);
 * }
 * }
 * %>
 * */
public class CopyFolder {
	public static void printFiles(File dir){
		
		int count=0;
		if(dir.isFile()){
			System.out.println(dir.getName());
			System.out.println(count++);
			
		}
		if(dir.isDirectory()){
			File[] files=dir.listFiles();
			for (int i = 0; i < files.length; i++) {
				if(files[i].isFile()){
					System.out.println(files[i].getName());
					System.out.println(count++);
				}
				else{
					System.out.println(files[i].getName());
					System.out.println(count++);
					printFiles(files[i]);
				}
			}
		}
	}
	public static void main(String[] args) {
		File file=new File("D:\\Program Files (x86)");
		copy(file.listFiles(),new File("d:\\test"));
		printFiles(new File("."));
		
	}
	public static void copy(File[] s,File d){
		
		if(!d.exists()){//定义文件夹的方法,如果指定的目标目录不存在
			d.mkdir();//创建目录
			for(int i=0;i<s.length;i++)//循环变量文件夹
			{
				if(s[i].isFile()){//如果为文件
					try{
						//根据文件路径名创建文件
						FileInputStream fis=new FileInputStream(s[i]);
						File newfile=new File(d.getParent()+File.separator+s[i].getName());
						FileOutputStream out=new FileOutputStream(newfile);
						int count;
						if((count=fis.read())>0){
							out.write(count);
							//从源文件中读取单个字节数据
							//将字节数据写入到目标文件中
						}
						out.close();
						fis.close();
					}catch(IOException e){
						e.printStackTrace();
					}
				
				}
				if(s[i].isDirectory()){
					File des=new File(d.getPath()+File.separator+s[i].getName());
					des.mkdir();//创建目标文件夹
					copy(s[i].listFiles(),des);//继续调用copy()方法
					
				}
			}
		}
	}
}
