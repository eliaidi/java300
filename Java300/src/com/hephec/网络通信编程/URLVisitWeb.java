package com.hephec.����ͨ�ű��;

import java.io.IOException;
import java.net.URL;

/***
 * ʵ��258ʹ��URL������ҳ
 * @author Administrator
 *
 */
public class URLVisitWeb {
	public static void main(String[] args) throws IOException {
		URL url=new URL("http://www.baidu.com");
		System.out.println(url.getPort());
		System.out.println(url.getContent());
		System.out.println(url.getDefaultPort());
		System.out.println(url.getHost());
		System.out.println(url.getPath());
		System.out.println(url.getProtocol());
		System.out.println(url.getQuery());
		
		

	}
}
