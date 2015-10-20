package com.hephec.ÍøÂçÍ¨ÐÅ±à³Ì;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class GetIPAddr {
	
	public static void main(String[] args) throws UnknownHostException {
		InetAddress inet=InetAddress.getByName("192.108.33.32");
		System.out.println(inet.getHostName().toString());
		InetAddress baidu=inet.getByName("www.baidu.com");
		System.out.println(baidu);
	}
}
