package com.hephec.网络通信编程;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

/***
 * 实例260根据URL获取因特网网页源文件
 * @author Administrator
 *
 */
public class URLGetHTML {
	public static void main(String[] args) throws IOException {
		URL url=new URL("http://www.baidu.com");
		URLConnection conn=url.openConnection();
		InputStream is=conn.getInputStream();
		BufferedReader reader=new BufferedReader(new InputStreamReader(is));
		char buffer[]=new char[1024];
		String line=reader.readLine();
		//System.out.println(line);
		while(reader.readLine()!=null){
			System.out.println(new String(line.getBytes(),"utf-8"));
			line=reader.readLine();
		}
	}
}
