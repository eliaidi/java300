package com.hephec.网络通信编程;

import java.awt.image.BufferedImage;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import javax.imageio.ImageIO;

/***
 * 实例259根据URL获取因特网上的图像
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
			System.out.println("图像的高度:"+imageIO.getHeight());
			
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		
	}
}
