package com.hephec.java安全机制;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.security.Key;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;

import javax.crypto.KeyGenerator;

public class KeyGeneratorDemo {
	
	public static void main(String[] args) throws NoSuchAlgorithmException, IOException, InvalidKeySpecException {
		//产生单钥加密的密钥(myKey)
		KeyGenerator keyGenerator=KeyGenerator.getInstance("DESede");
		keyGenerator.init(168);
		Key mykey=keyGenerator.generateKey();
		System.out.println(mykey.getAlgorithm());
		System.out.println("得到单密钥加密密钥");
		
		//产生双钥的密钥对(keyPair)
		KeyPairGenerator keyPairGenerator=KeyPairGenerator.getInstance("RSA");
		keyPairGenerator.initialize(1024);
		KeyPair keyPair=keyPairGenerator.generateKeyPair();
		System.out.println("生成张三的公钥对");
		
		//保存公钥的字节数组
		File file=new File("publicKey.dat");//保存公钥到文件publicKey.dat
		FileOutputStream fos=new FileOutputStream(file);
		fos.write(keyPair.getPublic().getEncoded());
		fos.close();
		System.out.println("保存公钥到文件:"+file.getAbsolutePath());
		
		//使用Java对象序列化保存私钥,通常应对私钥加密后在保存
		ObjectOutputStream oout=new ObjectOutputStream(new FileOutputStream("privateKey.dat"));
		
		//保存私钥到文件private.dat
		oout.writeObject(keyPair.getPrivate());
		oout.close();
		System.out.println("保存私钥到:priavteKey.dat");
		
		//从文件中得到公钥编码的字节数组
		FileInputStream fis=new FileInputStream("publicKey.dat");
		
		//打开publicKey.dat
		ByteArrayOutputStream baos=new ByteArrayOutputStream();
		int bByte=0;
		while((bByte=fis.read())!=-1){
			baos.write(bByte);
		}
		fis.close();
		byte[] keyBytes=baos.toByteArray();
		baos.close();
		
		//从字节数组解码公钥
		X509EncodedKeySpec x509EncodedKeySpec=new X509EncodedKeySpec(keyBytes);
		KeyFactory keyFactory=KeyFactory.getInstance("RSA");
		PublicKey pulicKey=keyFactory.generatePublic(x509EncodedKeySpec);//解码公钥
		System.out.println("从文件中成功得到公钥");
		
		
	}
}
