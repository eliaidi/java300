package com.hephec.网络通信编程;

import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.Button;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

public class URLGetAudio extends Applet implements ActionListener{
	
	AudioClip ac;
	Button btn_play,btn_loop,btn_stop;
	@Override
	public void init() {
		this.setSize(300,300);
		URL url;
		try {
			url = new URL("http://play.baidu.com/?__m=mboxCtrl.playAlbum&__a=255846718&__o=/album/255846718||playAlbum&fr=-1||www.baidu.com#");
			ac=getAudioClip(url);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Label label=new Label("载入音乐");
		add(label);
		btn_play=new Button("开始播放");
		btn_loop=new Button("循环播放");
		btn_stop=new Button("停止播放");
		btn_loop.addActionListener(this);
		btn_stop.addActionListener(this);
		btn_play.addActionListener(this);
		add(btn_play);
		add(btn_loop);
		add(btn_stop);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btn_play){
			ac.play();
		}else if(e.getSource()==btn_stop){
			ac.stop();
		}
		else{
			ac.loop();
		}
	}
}
