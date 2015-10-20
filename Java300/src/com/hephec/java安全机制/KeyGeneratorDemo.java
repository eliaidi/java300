package com.hephec.java��ȫ����;

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
		//������Կ���ܵ���Կ(myKey)
		KeyGenerator keyGenerator=KeyGenerator.getInstance("DESede");
		keyGenerator.init(168);
		Key mykey=keyGenerator.generateKey();
		System.out.println(mykey.getAlgorithm());
		System.out.println("�õ�����Կ������Կ");
		
		//����˫Կ����Կ��(keyPair)
		KeyPairGenerator keyPairGenerator=KeyPairGenerator.getInstance("RSA");
		keyPairGenerator.initialize(1024);
		KeyPair keyPair=keyPairGenerator.generateKeyPair();
		System.out.println("���������Ĺ�Կ��");
		
		//���湫Կ���ֽ�����
		File file=new File("publicKey.dat");//���湫Կ���ļ�publicKey.dat
		FileOutputStream fos=new FileOutputStream(file);
		fos.write(keyPair.getPublic().getEncoded());
		fos.close();
		System.out.println("���湫Կ���ļ�:"+file.getAbsolutePath());
		
		//ʹ��Java�������л�����˽Կ,ͨ��Ӧ��˽Կ���ܺ��ڱ���
		ObjectOutputStream oout=new ObjectOutputStream(new FileOutputStream("privateKey.dat"));
		
		//����˽Կ���ļ�private.dat
		oout.writeObject(keyPair.getPrivate());
		oout.close();
		System.out.println("����˽Կ��:priavteKey.dat");
		
		//���ļ��еõ���Կ������ֽ�����
		FileInputStream fis=new FileInputStream("publicKey.dat");
		
		//��publicKey.dat
		ByteArrayOutputStream baos=new ByteArrayOutputStream();
		int bByte=0;
		while((bByte=fis.read())!=-1){
			baos.write(bByte);
		}
		fis.close();
		byte[] keyBytes=baos.toByteArray();
		baos.close();
		
		//���ֽ�������빫Կ
		X509EncodedKeySpec x509EncodedKeySpec=new X509EncodedKeySpec(keyBytes);
		KeyFactory keyFactory=KeyFactory.getInstance("RSA");
		PublicKey pulicKey=keyFactory.generatePublic(x509EncodedKeySpec);//���빫Կ
		System.out.println("���ļ��гɹ��õ���Կ");
		
		
	}
}
