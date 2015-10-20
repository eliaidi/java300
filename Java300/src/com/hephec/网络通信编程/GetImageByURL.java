package com.hephec.����ͨ�ű��;

import java.awt.image.BufferedImage;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import javax.imageio.ImageIO;

/***
 * ʵ��259����URL��ȡ�������ϵ�ͼ��
 * @author Administrator
 *
 */
public class GetImageByURL{
	
	public static void main(String[] args) throws IOException {
		String image="http://static.youku.com/index/img/header/yklogo.png";
		
		try {
			URL url=new URL(image);
			URLConnection urlC=url.openConnection();
			InputStream fis=urlC.getInputStream();
			FileOutputStream fos=new FileOutputStream("yklogo.png");
			
			byte[] buffer=new byte[1024];
			while(fis.read(buffer)>0){
				fos.write(buffer);
			}
//			
//			int pos;
//			while(fis.read(buffer)!=-1){
//				System.out.println(buffer);
//			}
			BufferedImage imageIO=ImageIO.read(url);
			System.out.println("ͼ��ĸ߶�:"+imageIO.getHeight());
			
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		
	}
}
