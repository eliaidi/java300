package com.hephec.javaIOϵͳ;

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
	 * ��ʾָ�����͵��ļ�
	 * ѡ��File���listFiles(FileFilter filter)����
	 * �÷������﷨�ṹ����
	 * public File[] listFiles(FilterFile filter)
	 * ���س���·��������
	 * ����˵��
	 * filter:ʵ��FileFilter�ӿڵ�ʵ������
	 * �ö����accept��������ʵ���ļ��Ĺ���
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

