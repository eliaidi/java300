package com.hephec.javaIO系统;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * 返回文件或目录的名称
 * public String getName()
 * 返回文件的全路径
 * public File getCanonicalFile()
 * 返回父目录
 * public File getParentFile()
 * 是否为隐藏文件
 * public boolean isHidden()
 * 判断文件是否可写
 * public boolean canWrite()
 * 返回文件的最后修改时间
 * public long lastModified()
 * 以字节为单位返回文件的大小
 * public long length()
 * 
 * */
public class FileInfoBean {
	
	public static void main(String[] args) {
		
	}
	//文件路径字符串
	private String filePath;
	//定义存储文件对象的Map集合
	Map<String,String> fileInfo=new HashMap<String,String>();
	@SuppressWarnings("deprecation")
	public Map<String, String> getFileInfo(){
		File file=new File(filePath);//创建文件对象
		if(!file.isFile()){
			return null;
		}
		//将文件信息添加到Map集合中
		fileInfo.put("name", file.getName());
		try {
			fileInfo.put("absPath", file.getCanonicalPath());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		fileInfo.put("parentDir", file.getParent());
		fileInfo.put("hidden", file.isHidden()?"隐藏":"未隐藏");
		fileInfo.put("readOnly",file.canRead()?"可写":"只读");
		fileInfo.put("lastModified", new Date(file.lastModified()).toLocaleString());
		fileInfo.put("length", file.length()+"");
		return fileInfo;
		
	}
	
}
