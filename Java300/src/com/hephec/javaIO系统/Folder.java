package com.hephec.javaIOϵͳ;

import java.io.File;

public class Folder {
	/**
	 * �ļ��еĴ�����ɾ������
	 * ��ҪӦ��java.io.File���mkdir()������
	 * delete()���������Ƕ��Ǿ�̬��������Ҫ����File����
	 * ���ܱ�����
	 * mkdir()����
	 * public boolean mkdir()
	 * delete()����
	 * public boolean delete()
	 * ���Ϊһ��Ŀ¼��Ϊ�ղ��ܱ�ɾ��
	 * 
	 * ע�⣺
	 * ��File�����ʾ��·����Ϊ�༶Ŀ¼�ǣ���ôʹ��File����
	 * ��mkdir()���ܴ�������༶Ŀ¼����ʹ��
	 * File�������һ������mkdirs()
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
