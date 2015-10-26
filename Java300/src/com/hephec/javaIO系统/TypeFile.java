package com.hephec.javaIO系统;

import java.io.File;
import java.io.FileFilter;

public class TypeFile {
	
	public static void main(String[] args) {
		//String filepath=request.getParameter("fileStr");
//		String extentStr=request.getParameter("extentStr");
//		File file[]=null;
//		if(filepath!=null&&extendStr!=null){
//			CustomerFilter filter=new CustomerFilter();
//			filter.setExtentName(filepath);
//			File dir=new File(filepath);
//			if(dir.isDirectory()){
//				files=dir.listFiles(filter);
//			}
//		}
	}
	/**
	 * 显示指定类型的文件
	 * 选用File类的listFiles(FileFilter filter)方法
	 * 该方法的语法结构如下
	 * public File[] listFiles(FilterFile filter)
	 * 返回抽象路径名数组
	 * 参数说明
	 * filter:实现FileFilter接口的实例对象
	 * 该对象的accept方法用于实现文件的过滤
	 * 
	 * */
	
	
}
class CustomerFilter implements FileFilter{
	private String extentName;
	public String getExtentName() {
		return extentName;
	}
	public void setExtentName(String extentName) {
		this.extentName = extentName;
	}
	@Override
	public boolean accept(File pathname) {
		if(extentName==null||extentName.isEmpty()){
			return false;
		}
		if(!extentName.startsWith(".")){
			
			extentName="."+extentName;
		}
		if(pathname.getName().toLowerCase().endsWith(extentName)){
			return true;
		}
		return false;
	}
	
}

