package com.hephec.javaIOϵͳ;

import java.io.File;

public class RenameFile {
	
	private String fileName="d.txt"; //Դ�ļ���
	private String newFileName;//���ļ���
	boolean fileInfo=false;
	
	/**
	 * Ӧ��File���renameTo()����ʵ���ļ������������﷨�ṹ��
	 * public boolean renameTo(File newFile)
	 * 
	 * */
	public static void main(String[] args) {
		new RenameFile().renameFile();
	}
	public boolean renameFile(){
		File file=new File(fileName);
		//����Դ�ļ��ĸ�Ŀ¼�����ļ���,��ϴ���һ���µ�File����
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
	 * ��index.jspҳ���У�ͨ��<jsp:useBean>��������RenameBean��
	 * ͨ��<jsp:setProperty>��������Դ�ļ������ļ�����ֵ��RenameBean�����������
	 * 
	 * 
	 * 1.��index.jsp��������������ṹ��Ϣ
	 * <%
	 * 	if(fileBean.reameFile()){
	 * 		out.println("�������ɹ���");
	 * }else{
	 * 		out.println("������ʧ��...");
	 * }
	 * %>
	 * 
	 * 
	 * */
}
