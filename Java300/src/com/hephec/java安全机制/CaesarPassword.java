package com.hephec.java安全机制;

import java.util.Scanner;

/**
 * 实例270-凯瑟密码
 * */
public class CaesarPassword {
	public static void main(String[] args) {
		System.out.println("加密(A),解密(J),请选择一个");
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		String s1=scan.nextLine();
		if(s1.equalsIgnoreCase("A")){
			System.out.println("请输入明文:");
			String mw=scan.nextLine();
			System.out.println("请输入密钥:");
			String key=scan.nextLine();
			Encryption(mw,key);
		}else if(s1.equalsIgnoreCase("J")){
			System.out.println("请输入密文:");
			String mw=scan.nextLine();
			System.out.println("请输入密钥:");
			String key=scan.nextLine();
			Decrypt(mw,key);
		}
	}

	private static void Decrypt(String mw, String key) {
		StringBuilder str=new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			char c=str.charAt(i);
			if(c>='a'&&c<='z'){
				c-=Integer.parseInt(key);
				if(c<'a'){
					c+=26;
				}
				if(c>'z'){
					c-=26;
				}
			}else if(c>='A'&&c<='Z'){
				c-=Integer.parseInt(key);
				if(c<'A'){
					c+=26;
				}
				if(c>'Z'){
					c-=26;
				}
			}
			str.append(c);
		}
		System.out.println(str);
	}

	private static void Encryption(String mw, String key) {
		StringBuilder str=new StringBuilder();
		for (int i = 0; i < mw.length(); i++) {
			char c=mw.charAt(i);
			if(c>='a'&&c<='z'){
				c+=Integer.parseInt(key)%26;
				if(c<'a'){
					c+=26;}
				if(c>'z'){
					c-=26;
				}
			}else if(c>='Z'&&c>='A'){
				c+=Integer.parseInt(key)%26;
				if(c>'Z'){
					c-=26;
				}
				if(c<'A'){
					c+=26;
				}
			}
			str.append(c);
		}
		System.out.println(str);
	}
}
