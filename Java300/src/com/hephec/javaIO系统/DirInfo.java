package com.hephec.javaIOϵͳ;

import java.io.File;
import java.io.FileFilter;

import org.junit.Test;

public class DirInfo {
	
	@Test
	public void test(){
		
	}

	//����ʹ��File��ķ�������һ��Ŀ¼,�����Ŀ¼����Ŀ¼���ļ��������г���Ŀ¼�µ���Ŀ¼���ļ����������г�ָ�����͵��ļ�
	
	static class MyFilenameFilter implements FileFilter{
		private String sf="";//�����ļ��ĺ�׺��
		public MyFilenameFilter(String surfix){
			//�Թ��췽��Ϊsf��ֵ
			this.sf=surfix;
		}
		//�ж�ָ�����ļ��Ƿ���ָ����Ŀ¼��
		@Override
		public boolean accept(File pathname) {
			if(pathname.isFile()){
				return pathname.getName().endsWith(sf);
			}
			return true;
		}
		
	}
	public static void getAllFiles(String dirName){
		//�г�ָ��Ŀ¼�������ļ�����Ŀ¼��·��
		
	}
	
}

