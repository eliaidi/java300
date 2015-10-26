package com.hephec.javaIOϵͳ;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * �����ļ���Ŀ¼������
 * public String getName()
 * �����ļ���ȫ·��
 * public File getCanonicalFile()
 * ���ظ�Ŀ¼
 * public File getParentFile()
 * �Ƿ�Ϊ�����ļ�
 * public boolean isHidden()
 * �ж��ļ��Ƿ��д
 * public boolean canWrite()
 * �����ļ�������޸�ʱ��
 * public long lastModified()
 * ���ֽ�Ϊ��λ�����ļ��Ĵ�С
 * public long length()
 * 
 * */
public class FileInfoBean {
	
	public static void main(String[] args) {
		
	}
	//�ļ�·���ַ���
	private String filePath;
	//����洢�ļ������Map����
	Map<String,String> fileInfo=new HashMap<String,String>();
	@SuppressWarnings("deprecation")
	public Map<String, String> getFileInfo(){
		File file=new File(filePath);//�����ļ�����
		if(!file.isFile()){
			return null;
		}
		//���ļ���Ϣ��ӵ�Map������
		fileInfo.put("name", file.getName());
		try {
			fileInfo.put("absPath", file.getCanonicalPath());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		fileInfo.put("parentDir", file.getParent());
		fileInfo.put("hidden", file.isHidden()?"����":"δ����");
		fileInfo.put("readOnly",file.canRead()?"��д":"ֻ��");
		fileInfo.put("lastModified", new Date(file.lastModified()).toLocaleString());
		fileInfo.put("length", file.length()+"");
		return fileInfo;
		
	}
	
}
