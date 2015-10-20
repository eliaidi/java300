package com.hephec.网络通信编程;
/**
 * 实例256获取自己的计算机名与IP地址
 * 
 * */
import java.net.InetAddress;
import java.net.UnknownHostException;

public class IntAddressName {
	
	public static void main(String[] args) throws UnknownHostException {
		//通过计算机名获得IP地址，并将其转换为字符串处理
		InetAddress ind=InetAddress.getLocalHost();
		
		System.out.println("主机名和IP地址："+ind.toString());
		//通过IP地址获得计算机名称
		System.out.println("主机名称："+ind.getHostName());
		
	}
}
