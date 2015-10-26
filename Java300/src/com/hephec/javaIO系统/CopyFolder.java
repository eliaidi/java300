package com.hephec.javaIOϵͳ;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * �����ļ���
 * �����ļ����µ����ļ��к��ļ�
 * ����java.io.FileInputStream���java.io.FileOutputStream����
 * ʵ���ļ��еĸ��ƣ�����ͨ��File�����е�listFiles()������ȡ�ļ���·�������е��ļ���������
 * Ȼ��ѭ���ļ��������飬ͨ��FileInputStream���ȡ�ļ����ݣ����ͨ��
 * FileOutputStream�ཫ�������ļ�����д��Ŀ���ļ�����
 * 
 * */

/**
 * <%
 * 	File sourFolder=null,targetFolder=null;
 * String source=request.getParameter("sourceFolder");//��ȡ�û������Դ�ļ���ַ
 * String target=request.getParameter("targetFolder");//��ȡ�û������Ŀ���ļ��е�ַ
 * if(source!=null){
 * 		sourceFolder=new File(source);//����Դ�ļ��ж���
 * 		if(!sourceFolder.isDirectory||!sourceFolder.exists()){
 * 			out.println("<script type='text/javascript'>alert('Դ�ļ��в�����');</script>");
 * }
 * }
 * 	if(target!=null){
 * 		targetFolder=new File(target);
 * 		if(!targetFolder.exists()){
 * 			out.println("<script>alert('Ŀ���ļ��в�����');</script>");
 * }else{
 * 		//���ø����ļ��еķ���
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
		
		if(!d.exists()){//�����ļ��еķ���,���ָ����Ŀ��Ŀ¼������
			d.mkdir();//����Ŀ¼
			for(int i=0;i<s.length;i++)//ѭ�������ļ���
			{
				if(s[i].isFile()){//���Ϊ�ļ�
					try{
						//�����ļ�·���������ļ�
						FileInputStream fis=new FileInputStream(s[i]);
						File newfile=new File(d.getParent()+File.separator+s[i].getName());
						FileOutputStream out=new FileOutputStream(newfile);
						int count;
						if((count=fis.read())>0){
							out.write(count);
							//��Դ�ļ��ж�ȡ�����ֽ�����
							//���ֽ�����д�뵽Ŀ���ļ���
						}
						out.close();
						fis.close();
					}catch(IOException e){
						e.printStackTrace();
					}
				
				}
				if(s[i].isDirectory()){
					File des=new File(d.getPath()+File.separator+s[i].getName());
					des.mkdir();//����Ŀ���ļ���
					copy(s[i].listFiles(),des);//��������copy()����
					
				}
			}
		}
	}
}
