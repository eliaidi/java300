package com.hephec.java��ȫ����;

import java.util.Scanner;

/**
 * ʵ��270-��ɪ����
 * */
public class CaesarPassword {
	public static void main(String[] args) {
		System.out.println("����(A),����(J),��ѡ��һ��");
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		String s1=scan.nextLine();
		if(s1.equalsIgnoreCase("A")){
			System.out.println("����������:");
			String mw=scan.nextLine();
			System.out.println("��������Կ:");
			String key=scan.nextLine();
			Encryption(mw,key);
		}else if(s1.equalsIgnoreCase("J")){
			System.out.println("����������:");
			String mw=scan.nextLine();
			System.out.println("��������Կ:");
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
