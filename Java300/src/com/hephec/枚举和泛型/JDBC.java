package com.hephec.ö�ٺͷ���;

public enum JDBC {
	
	DRIVER,URL,USERNAME,PASSWORD;//�����ĸ�ö��Ԫ��
	
	public String getJDBCEnum(JDBC jdbc){
		
		//���巽�����ݲ�ͬ��ö��Ԫ�ط��ز�ͬ���ַ���
		switch(jdbc){
			case DRIVER:return "driver";//���ö��ΪDRIVER,�򷵻�"driver"
			case URL:return "url";//���ö��ΪURL,�򷵻�"url"
			case USERNAME:return "username";//���ö��ΪUSERNAME,�򷵻�"username"
			case PASSWORD:return "password";//���ö��ΪPASSWORD,�򷵻�"password"
			default:return null;
		}
	}
}
