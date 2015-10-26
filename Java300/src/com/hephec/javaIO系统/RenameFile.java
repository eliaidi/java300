package com.hephec.javaIO系统;

import java.io.File;

public class RenameFile {
	
	private String fileName="d.txt"; //源文件名
	private String newFileName;//新文件名
	boolean fileInfo=false;
	
	/**
	 * 应用File类的renameTo()方法实现文件的重命名，语法结构：
	 * public boolean renameTo(File newFile)
	 * 
	 * */
	public static void main(String[] args) {
		new RenameFile().renameFile();
	}
	public boolean renameFile(){
		File file=new File(fileName);
		//根据源文件的父目录和新文件名,组合创建一个新的File对象
		if(file.exists()){
			File newFile=new File(file.getParent()+File.separator+newFileName);
			boolean res=file.renameTo(newFile);
			if(res){
				fileInfo=true;
			}
			
		}
		return false;	
	}
	/**
	 * 在index.jsp页面中，通过<jsp:useBean>动作导入RenameBean类
	 * 通过<jsp:setProperty>动作设置源文件和新文件名赋值给RenameBean对象的属性中
	 * 
	 * 
	 * 1.在index.jsp中输入出重命名结构信息
	 * <%
	 * 	if(fileBean.reameFile()){
	 * 		out.println("重命名成功！");
	 * }else{
	 * 		out.println("重命名失败...");
	 * }
	 * %>
	 * 
	 * 
	 * */
}
