package com.hephec.java�������;

/**
 * ����һ����ͨ����(Vehicle)���࣬�����У�
 * 	���ԣ��ٶ�(speed),�����size����
 * 	����:�ƶ���move()��,�����ٶ�(setSpedd(int speed)),����speedUp(),����speedDown()�ȷ���
 * 
 * 
 * */

public class Vehiche {
	
	//���췽��
	public Vehiche() {
		// TODO Auto-generated constructor stub
	}
	Vehiche(double speed,double size){
		this.speed=speed;
		this.size=size;
	}
	public double getSpeed() {
		return speed;
	}
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	public double getSize() {
		return size;
	}
	public void setSize(double size) {
		this.size = size;
	}
	private double speed;
	private double size;
	
	public void move(int x,int y){
		
	}
	//���ٵķ���
	public double speedUp(){
		setSpeed(speed+10);
		return getSpeed();
	}
	//���ٵķ���
	public double speedDown(){
		setSpeed(speed-10);
		return getSpeed();
	}
	
	public static void main(String[] args) {
		//���Է���...ʡ��
	}
	
}
